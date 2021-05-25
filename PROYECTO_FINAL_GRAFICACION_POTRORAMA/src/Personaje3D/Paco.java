package Personaje3D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Elizabeth
 */

import Personaje3D.*;
import Personaje3D.DrawPacoeltaco;
import Personaje3D.DrawPacoeltaco;
import Personaje3D.mBall;
import Personaje3D.mBall;
import com.sun.opengl.util.Animator;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Paco implements GLEventListener, MouseListener, MouseMotionListener, KeyListener{
    
    Texture tFondo1,tFondo2, tFondo3, tFondo4, tFondo5;
    Texture tFondo6, tFondo7, tFondo8, tInfo;
    
    int mfondo;
    boolean bndInfo = false;
    
    public Clip clip;
    //public String ruta = "src/Sound/";
    public String ruta = "/Sound/";
    
        //colision
    private static final float posX=0f;
     private static final float posY=0f;
      private static final float posZ=0f;
      
      //mBallcentro 
      
      float[] centroMCabeza={0.0f, 0.5f, 0.0f};
      float posPX= 1.5f;
      float posPY= 0.9f;
      float posPZ= 0.0f;
      
      mBall cajaCabeza;
      mBall cajaPelota;
      
      
    
    
    private float view_rotx = 0.01f;
    private float view_roty = 0.01f;
    private int oldMouseX;
    private int oldMouseY;
    boolean[] keys=new boolean[256]; //to know which key is pressed
    
    //position of stan in the window
    private static final float X_POSITION=0f;
    private static final float Y_POSITION=-0.08f;
    private static final float Z_POSITION=0f;
    
    
    public static void main(String[] args){
        
        Frame frame = new Frame("Paco el taco :(Press J to jump and press W to walk, press Q, T, P, O, A for actions, press w to stop sound)");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new Paco());
        frame.add(canvas);
        frame.setSize(1000, 800);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
          
    }

    public void init(GLAutoDrawable drawable){
        
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());
        gl.setSwapInterval(1);
        
        // set up lighting
        float light_ambient[]={0.9f, 0.9f, 0.9f, 1.0f};
        float light_diffuse[]={0.3f, 0.3f, 0.3f, 1.0f};
        float light_specular[]={1.0f, 1.0f, 1.0f, 1.0f};
        float light_position[] = {1.0f,1.5f,1.0f,0.0f };
        
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, light_ambient, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, light_diffuse, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, light_specular, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, light_position, 0);
        
        gl. glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_DEPTH_TEST);
            
        // Setup the drawing area and shading mode
        gl.glClearColor(0.9f, 0.9f, 0.9f, 0.9f); 
        gl.glShadeModel(GL.GL_SMOOTH);
        
       try 
        {
            File iFondo1 = new File("src/fondo/Fondo1.jpg");
            tFondo1 = TextureIO.newTexture(iFondo1,true);
            
            File iFondo2 = new File("src/fondo/Fondo2.jpg");
            tFondo2 = TextureIO.newTexture(iFondo2,true);
            
            File iFondo3 = new File("src/fondo/Fondo3.jpg");
            tFondo3 = TextureIO.newTexture(iFondo3,true);
            
            File iFondo4 = new File("src/fondo/Fondo4.jpg");
            tFondo4 = TextureIO.newTexture(iFondo4,true);
            
            File iFondo5 = new File("src/fondo/Fondo5.jpg");
            tFondo5 = TextureIO.newTexture(iFondo5,true);
            
            File iFondo6 = new File("src/fondo/Fondo6.jpg");
            tFondo6 = TextureIO.newTexture(iFondo6,true);
            
            File iFondo7 = new File("src/fondo/Fondo7.jpg");
            tFondo7 = TextureIO.newTexture(iFondo7,true);
            
            File iFondo8 = new File("src/fondo/Fondo8.jpg");
            tFondo8 = TextureIO.newTexture(iFondo8,true);
            
        } catch (Exception e) 
        {
        }
        
        drawable.addMouseListener(this);
        drawable.addMouseMotionListener(this);
        drawable.addKeyListener(this);
        
    }
    
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height){
        
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) { // avoid a divide by zero error!
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
        
    }
    
    public void display(GLAutoDrawable drawable){
        
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        glu.gluLookAt(0.1f,0.0f,4.0f,// eye
                      0.0f,0.0f,0.0f,  // looking at
                      0.0f,0.0f,1.0f   // is up
                    );
        
        // Move the whole scene
        gl.glTranslatef(X_POSITION, Y_POSITION, Z_POSITION);
        gl.glRotatef(view_rotx,1.0f,0.0f,0.0f);
        gl.glRotatef(view_roty,0.0f,1.0f,0.0f);
        gl.glRotatef(90,0.0f,0.0f,1.0f);
        
        //we draw Stan in the window
        DrawPacoeltaco stan = new DrawPacoeltaco(); 
        
        gl.glPushMatrix();
        gl.glScaled(1.0f,0.9f,0.5f);
        gl.glTranslated(0.0f, 0.0f, 0.0f);
        
        
       switch (mfondo) {
        
            case 2:
                stan.fondo(gl, glu, tFondo1);
                break;
            case 3:
                stan.fondo(gl, glu, tFondo2);
           break;
                  
            case 4:
                stan.fondo(gl, glu, tFondo3);
                break;
                
            case 5:
                stan.fondo(gl, glu, tFondo4);
                break; 
                
                  case 6:
                stan.fondo(gl, glu, tFondo5);
                break;
                
                  default:
                      stan.fondo(gl, glu, tFondo6);
                      break;
                
                      
        }
        
        gl.glPopMatrix();
        gl.glFlush();
        
        gl.glPushMatrix();
        gl.glScaled(1.0f, 0.9f, 1.0f);
        gl.glTranslated(0.0f, 0.0f, 1.0f);
        gl.glRotatef(-90, 1.0f, 0.0f, 0.0f);
        stan.fondo(gl, glu, tFondo1);        
        gl.glPopMatrix();
        gl.glFlush();
        
        gl.glPushMatrix();
        gl.glScaled(1.0f, 0.9f, 1.0f);
        gl.glTranslated(0.0f, 0.0f, 1.0f);
        gl.glRotatef(90, 1.0f, 0.0f, 0.0f);
        stan.fondo(gl, glu, tFondo2);        
        gl.glPopMatrix();
        gl.glFlush();
        
        gl.glPushMatrix();
        gl.glScaled(1.0f, 0.9f, 1.0f);
        //gl.glTranslated(0.0f, 0.0f, 1.0f);
        gl.glRotatef(90, 0.0f, 1.0f, 0.0f);
        stan.fondo(gl, glu, tFondo3);        
        gl.glPopMatrix();
        gl.glFlush();
        
        gl.glPushMatrix();
        gl.glScaled(1.0f, 0.9f, 1.0f);
       // gl.glTranslated(0.0f, 0.0f, 1.0f);
        gl.glRotatef(-90, 0.0f, 1.0f, 0.0f);
        stan.fondo(gl, glu, tFondo4);        
        gl.glPopMatrix();
        gl.glFlush();
        
        gl.glPushMatrix();
        gl.glScaled(1.0f, 0.9f, 1.0f);
        gl.glTranslated(-1.0f, -1.0f, 10.0f);
        gl.glRotatef(0, 0.0f, 0.0f, 1.0f);
        stan.fondo(gl, glu, tFondo5);        
        gl.glPopMatrix();
        gl.glFlush();
        
                //cartel
        if (bndInfo == true) {
            gl.glPushMatrix();
            gl.glScalef(0.1f, 0.1f, -0.1f);
            gl.glTranslatef(-0.5f, 2.0f, 1.0f);
            gl.glRotatef(0, 0.0f, 0.0f, 1.0f);
            stan.fondo(gl, glu, tInfo);
            gl.glPopMatrix();
            gl.glFlush();
        }
        
        gl.glPushMatrix();
        gl.glScaled(1.0f, 0.9f, 1.0f);
        gl.glTranslated(1.0f, 1.0f, -10.0f);
        gl.glRotatef(0, 0.0f, 0.0f, 1.0f); 
        stan.fondo(gl, glu, tFondo6);
        //stan.fondo(gl, glu, tAtras);        
        stan.fondo(gl, glu, tFondo7);        
        gl.glPopMatrix();
        gl.glFlush();
        
        
        
        stan.draw_pacoeltaco(gl, keys['W'], keys['J'], keys ['Q'], keys ['T'], keys['P'], keys['O'], keys['A']); 
             //efectos de colision
        float []centroP={posPX, posPY, posPZ};
        cajaCabeza = new mBall(0.1f, 0.1f, 0.1f, centroMCabeza);
        cajaPelota = new mBall(0.1f, 0.1f, 0.1f, centroP);
        gl.glFlush();
        
        gl.glPushMatrix();
        gl.glTranslated(posPX, posPY, posPZ);
        stan.draw_pelota(gl, glu);
        gl.glPopMatrix();
        
       /* if (Interseccion(cajaCabeza, cajaPelota)) 
        {
            System.out.println("Colision con la cabeza");
        }*/
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }
        
 /* public boolean Interseccion(mBall caja1, mBall caja2)
    {
        if (Math.abs(caja1.centro[0]-caja2.centro[0]) > caja1.extend[0] + caja2.extend[0] ) 
        {
            return false;
        }
        
                if (Math.abs(caja1.centro[1]-caja2.centro[1]) > caja1.extend[1] + caja2.extend[1] ) 
        {
            return false;
        }
                
                        if (Math.abs(caja1.centro[2]-caja2.centro[2]) > caja1.extend[2] + caja2.extend[2] ) 
        {
            return false;
        }
        return true;
        
    }*/
    
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void keyTyped(KeyEvent e){}   
    public void keyReleased(KeyEvent e){}
    
    
    public void mousePressed(MouseEvent e){
        oldMouseX = e.getX();
        oldMouseY = e.getY();     
    }
    
    public void mouseDragged(MouseEvent e){
        
        int x = e.getX();
        int y = e.getY();
        Dimension size = e.getComponent().getSize();
        float thetaX = 360.0f * ( (float)(x-oldMouseX)/(float)size.width);
        float thetaY = 360.0f * ( (float)(oldMouseY-y)/(float)size.height);
        oldMouseX = x;
        oldMouseY = y;
        view_rotx += thetaX;
        view_roty += thetaY;
   
    }
    
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode()<250 && keys[e.getKeyCode()]==false){
            keys['W']=false;
            keys['J']=false;
            keys['Q']=false;
            keys['T']=false;
            keys['P']=false;
            keys['O']=false;
            keys['A']=false;
            keys[e.getKeyCode()]=true;    
            
            switch(e.getKeyCode() )
            {
                case 'W':
                    
                    sonidoof();
                    break;
                case 'T':
                    
                    reproducir("madeon-be-fine-official-audio.wav");

                
                    break;
                    
                    
                case 'J':

                   reproducir("madeon-mania-official-audio.wav");


                    break;
                case 'O':
//                    sonidoof();
                   reproducir("madeon-miracle-official-audio-_1_.wav");
                    break;
                 case 'Q':
                     reproducir("madeon-dream-dream-dream-official-audio (1).wav");
                    break;
                    
                 case 'P':
                     reproducir("madeon-heavy-with-hoping-official-audio.wav");
                     break;
                     
                                     case 'C':
                   /* if (!Interseccion(cajaCabeza, cajaPelota)) 
                    {
                        posPX-=0.1f;
  
                    }else
                    {
                        posPY-=0.1f;
                    }*/
                    break;
                    
                    case'D':
                        if (posPX< 1.5f) {
                            posPX+= 0.1f;
                        }
                    break;
                                
                case '1':
                    mfondo=2;
                    break;
                case'2':
                    mfondo=3;
                    break;
                    
                case '3':
                    mfondo=4;
                break;
                
                case '4':
                    mfondo=5;
                break;  
                
                case '5':
                    mfondo=6;
                    break;
            }
        }
        else
            keys[e.getKeyCode()]=false;    
    }
    
    public void reproducir(String archivo)
    {
        try 
        {
            clip=AudioSystem.getClip();
            clip.open( AudioSystem.getAudioInputStream( new File("src/Sound/"+archivo) ) );  
            clip.start();
        } catch (Exception e) 
        {
            System.out.println("Error al reproducir: " + e);
        }
    }
    
    public void sonidoof()
    {
        clip.stop();
    }
    

    
    
}