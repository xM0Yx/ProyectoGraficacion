/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package org.yourorghere;
package Personaje3D;

/**
 *
 * @author Elizabeth
 */

import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class DrawPacoeltaco {
    
 
    
    //precision and global variables
    private static final int SLICES=40;
    private static final int STACKS=40;
    private GLUquadric q=null;
    private static int mvt=0;
    
    //heigth and widht of each components

    private static final float HEIGHT_LEGS=0.2f;
    private static final float WIDTH_LEGS=0.105f;
    private static final float HEIGHT_ARMS=0.5f;
    private static final float WIDTH_ARMS=0.05f;
    private static final float WIDTH_HEAD=0.5f;
    private static final float WIDTH_EYES=0.7f;
    private static final float WIDTH_HANDS=0.1f;
    private static final float WIDTH_FINGERS=0.0525f;
    private static final float WIDTH_SHOES=0.28f;
    private static final float HEIGHT_SHOES=0.0f;
    private static final float WIDTH_OPEN_MOUTH=0.1f;
    private static final float WIDTH_BUTTONS=0.0525f;
    private static final float SPACE_BETWEEN_BUTTONS=0.12f;
    private static final float WIDTH_BOTTOM_BONNET=0.525f;
    private static final float HEIGHT_BOTTOM_BONNET=0.12f;
    private static final float WIDTH_BONNET=0.52f;
    private static final float WIDTH_PUPILS=0.05f;
    private static final float WIDTH_POMPON=0.12f;
    
    //position of each component int the window
    public DrawPacoeltaco(){}
    
           public void draw_pelota(GL gl, GLU glu)
    {
        set_blue_material(gl);
        gl.glPushMatrix();
        glu.gluSphere(q, 0.2, SLICES, STACKS);
        gl.glPopMatrix();
    }
    
    public void draw_pacoeltaco (GL gl, boolean walk, 
            boolean jump,
            boolean angry, 
            boolean worried, 
            boolean serious, 
            boolean Silly,
            boolean onehandup){
        
        GLU glu = new GLU();
        q=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(q, GLU.GLU_FILL);
        glu.gluQuadricOrientation(q, GLU.GLU_OUTSIDE);
        glu.gluQuadricNormals(q, GLU.GLU_SMOOTH);
        
        //Stan is walking
        if(walk && mvt%20+10>20){
            draw_legs(gl, glu, 'W', false);
            draw_legs(gl, glu, ' ', true);
            draw_arm_left(gl, glu, ' ');
            draw_arm_right(gl, glu, 'W');
            draw_head (gl, glu, false,false, false, false, false, false);
        }
        else if(walk && mvt%20+10<=20){
            draw_legs(gl, glu, ' ', false);
            draw_legs(gl, glu, 'W', true);
            draw_arm_left(gl, glu, 'W');
            draw_arm_right(gl, glu, ' ');
            draw_head (gl, glu, false,false, false, false, false, false);
        }
           
       //stan is jumping
        else if(jump && mvt%20+10>20){
            gl.glTranslatef(0f, 0.35f, 0f);
            draw_legs(gl, glu, 'J', false);
            draw_legs(gl, glu, 'J', true);
            draw_arm_left(gl, glu, 'J');
            draw_arm_right(gl, glu, 'J');
            draw_head (gl, glu, true,false, false, false, false, false);
        }

        
        
        else if(angry)
        {
         //////   
            draw_legs(gl, glu, ' ', false);
            draw_legs(gl, glu, 'W', true);
            draw_arm_left(gl, glu, 'J');
            draw_arm_right(gl, glu, 'J');
            draw_head (gl, glu, false,true, false, false, false,false);   
        }else if(worried)
        {
            
            draw_legs(gl, glu, ' ', false);
            draw_legs(gl, glu, ' ', true);
            draw_arm_left(gl, glu, ' ');
            draw_arm_right(gl, glu, ' ');
            draw_head (gl, glu, false,false, true, false, false, false);
            
        } else if (serious) {
            draw_legs(gl, glu, ' ', false);
            draw_legs(gl, glu, ' ', true);
            draw_arm_left(gl, glu, ' ');
            draw_arm_right(gl, glu, ' ');
            draw_head (gl, glu, false,false,false, true, false, false);
        } else if (Silly) {
            draw_legs(gl, glu, ' ', false);
            draw_legs(gl, glu, ' ', true);
            draw_arm_left(gl, glu, ' ');
            draw_arm_right(gl, glu, ' ');
            draw_head (gl, glu, false,false,false,false, true, false);
        } else if (onehandup) 
        {
            draw_legs(gl, glu, ' ', false);
            draw_legs(gl, glu, ' ', true);
            draw_arm_left(gl, glu, ' ');
            draw_arm_right(gl, glu, ' ');
            draw_head (gl, glu, false,false,false,false, false, true);
            
        }
        
        //stan is normal
        else{
            draw_legs(gl, glu, ' ', false);
            draw_legs(gl, glu, ' ', true);
            draw_arm_left(gl, glu, ' ');
            draw_arm_right(gl, glu, ' ');
            draw_head (gl, glu, false,false, false, false, false, false);
        }   

        
        mvt++;



        
    }
    

    public void draw_head (GL gl, GLU glu, boolean jump, boolean angry, boolean worried, boolean serious, boolean Silly, boolean onehandup){
     
 
        set_skin_material(gl);        
        gl.glPushMatrix();
    
        gl.glPopMatrix();
                gl.glTranslatef (-0.50f,-0.35f, -0.5f);
          box(gl);

        

        
        //Boca
        gl.glPushMatrix();
        gl.glTranslatef (0.50f,0.10f, 0.7f);
        set_black_material(gl);
        //mouth is different when stan is jumping
        if (jump==true){
            set_grey_material(gl);
            gl.glTranslatef(0.0f, 0.19f, 0.275f);        
            glu.gluSphere(q, WIDTH_OPEN_MOUTH, SLICES, STACKS);
        }
        else{
            gl.glTranslatef(0.1f, 0.19f, 0.257f);   
            gl.glRotatef(45f, 1f, 0f, 0f);
            gl.glScalef(-0.2f, 0.03f, 0.1f);
            box(gl);
        }
        gl.glPopMatrix();
        
        //we create eyes (black)
        set_grey_material(gl);
        gl.glPushMatrix();
        gl.glTranslatef(0.70f, 0.60f, 1.0f);        
        glu.gluSphere(q, WIDTH_PUPILS, SLICES, STACKS);
        gl.glTranslatef(-0.4f, 0.0f, 0.0f);        
        glu.gluSphere(q, WIDTH_PUPILS, SLICES, STACKS);
        gl.glPopMatrix();
        
        //Create SLASHES eyes angry
        if (angry==true) 
        {
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.650f, 0.700f, 1.0f);   
            gl.glRotatef(45f, 0f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
            
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.350f, 0.700f, 1.0f);   
            gl.glRotatef(135f, 0f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
            
            
        } 
        if(worried==true)
        {
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.650f, 0.750f, 1.0f);   
            gl.glRotatef(-45f, 0.5f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
            
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.100f, 0.700f, 1.0f);   
            gl.glRotatef(45f, 0.5f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
        }
        if (serious==true) 
        {
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.650f, 0.750f, 1.0f);   
            gl.glRotatef(0f, 0.5f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
            
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.100f, 0.700f, 1.0f);   
            gl.glRotatef(0f, 0.5f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
        }
        if (Silly==true) {
            gl.glPushMatrix();
             set_grey_material(gl);             
            gl.glTranslatef(0.500f, 0.19f, 1.0f);        
            glu.gluSphere(q, WIDTH_OPEN_MOUTH, SLICES, STACKS);
            gl.glPopMatrix();
            
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.650f, 0.750f, 1.0f);   
            gl.glRotatef(-45f, 0.5f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
            
            set_black_material(gl);
            gl.glPushMatrix();
            gl.glTranslatef(0.100f, 0.700f, 1.0f);   
            gl.glRotatef(45f, 0.5f, 0f, 1f);
            gl.glScalef(0.2f, 0.03f, 0.1f);
            box(gl);
            gl.glPopMatrix();
            
         if (onehandup==true){
            gl.glTranslatef(0.1f, 0.19f, 0.257f);   
            gl.glRotatef(45f, 1f, 0f, 0f);
            gl.glScalef(-0.2f, 0.03f, 0.1f);
            box(gl);
        }
       

        
        }
        
    }
    
    

     
      
     public void draw_legs(GL gl, GLU glu, char c, boolean left){
        gl.glPushMatrix();
        
        //we orientate axes if stan is jumping or is walking
        if (c=='W'){
            gl.glTranslatef(0f, -0.1f, -0.2f);
            gl.glRotatef(30, -100f, 0f, 0f);            
        }
        
        if (c=='J'){
            gl.glTranslatef(0f, -0.05f, -0.1f);
            if (left)
                gl.glRotatef(30, -100f, -100f, 0f); 
            else
                gl.glRotatef(30, -100f, 100f, 0f); 
            
        }
                     
        //we create legs
        set_blue_material(gl);
        gl.glPushMatrix();
        if (left)
            gl.glTranslatef(-0.19f, -0.45f, 0f);        
        else
            gl.glTranslatef(0.19f, -0.45f, 0f);     
        gl.glRotatef(90f, 1f, 0f, 0f);
        glu.gluCylinder(q, WIDTH_LEGS, WIDTH_LEGS, HEIGHT_LEGS, SLICES, STACKS);
        glu.gluSphere(q, WIDTH_LEGS, SLICES, STACKS);
        gl.glRotatef(90f, -1f, 0f, 0f);
        gl.glTranslatef(0f, -HEIGHT_LEGS, 0f);        
        gl.glRotatef(90f, 1f, 0f, 0f);
        glu.gluDisk(q, 0f, WIDTH_LEGS, SLICES, STACKS);
        gl.glPopMatrix();
        
        //we create shoes
        set_black_material(gl);
        gl.glPushMatrix();
        if (left){
            gl.glTranslatef(-0.34f, -0.7f, -0.15f);
            gl.glScalef(WIDTH_SHOES, HEIGHT_SHOES, 0.25f);
        }
        else{
            gl.glTranslatef(0.34f, -0.7f, -0.15f);
            gl.glScalef(-WIDTH_SHOES, HEIGHT_SHOES, 0.25f);
        }
        box(gl);
        gl.glPopMatrix();             
        gl.glPushMatrix();
        if (left)   
            gl.glTranslatef(-0.2f, -0.65f, 0.12f);  
        else
            gl.glTranslatef(0.2f, -0.65f, 0.12f); 
        gl.glRotatef(90f, 1f, 0f, 0f);
        glu.gluDisk(q, 0f, 0.14, SLICES, STACKS);
        glu.gluCylinder(q, WIDTH_SHOES/2, WIDTH_SHOES/2, HEIGHT_SHOES, SLICES, STACKS);
        gl.glRotatef(90f, -1f, 0f, 0f);
        gl.glTranslatef(0f, -HEIGHT_SHOES, 0f);        
        gl.glRotatef(90f, 1f, 0f, 0f);
        glu.gluDisk(q, 0f, WIDTH_SHOES/2, SLICES, STACKS);
        gl.glPopMatrix();
        
        gl.glPopMatrix();
     }
     
     
     public void draw_arm_left (GL gl, GLU glu, char c){
        set_red_material(gl); 
        gl.glPushMatrix();
        //we orientate axes if stan is walking or is jumping
        if (c=='J'){
            gl.glTranslatef(0.60f, 0.15f, -0.01f);  
            glu.gluSphere(q, WIDTH_HANDS, SLICES, STACKS);
            gl.glTranslatef(0.05f, 0.015f, 0.05f);   
            glu.gluSphere(q, WIDTH_FINGERS, SLICES, STACKS);
        }
        if (c=='W'){  
            gl.glTranslatef(-0.0f, -0.38f, 0.1f);  
            glu.gluSphere(q, WIDTH_HANDS, SLICES, STACKS);
            gl.glTranslatef(0.05f, 0.015f, 0.05f);   
            glu.gluSphere(q, WIDTH_FINGERS, SLICES, STACKS);
        }
        if (c==' '){
            gl.glTranslatef(-0.70f, -0.35f, 0.16f);  
            glu.gluSphere(q, WIDTH_HANDS, SLICES, STACKS);
            gl.glTranslatef(0.055f, 0.015f, 0.05f);   
            glu.gluSphere(q, WIDTH_FINGERS, SLICES, STACKS);
        }    
         if (c== 'A') 
         {
            gl.glTranslatef(0.60f, 0.15f, -0.1f);  
            glu.gluSphere(q, WIDTH_HANDS, SLICES, STACKS);
            gl.glTranslatef(0.05f, 0.015f, 0.05f);   
            glu.gluSphere(q, WIDTH_FINGERS, SLICES, STACKS);
         }
  
        
        
        gl.glPopMatrix();
        
        
        //we create left arm
        set_shirt_material(gl);
        gl.glPushMatrix();
        gl.glTranslatef(-0.550f, 0.200f, 0f);        
        gl.glRotatef(90f, 1f, -0.20f, 0f);
        if (c=='J')
            gl.glRotatef(150, 0f, -100f, 0f);
        if (c=='W')
        {
            gl.glRotatef(20, -1f, 0f, 0f);
        }
             if (c=='A') 
             {
            gl.glRotatef(150, 0f, -100f, 0f);
             }
            gl.glRotatef(20, -1f, 0f, 0f);
        glu.gluCylinder(q, WIDTH_ARMS, WIDTH_ARMS, HEIGHT_ARMS, SLICES, STACKS);
        glu.gluSphere(q, WIDTH_ARMS, SLICES, STACKS); 
        gl.glRotatef(90f, -1f, 0.20f, 0f);    
        gl.glTranslatef(0f, -HEIGHT_ARMS, 0f);     
        gl.glRotatef(90f, 1f, -0.20f, 0f);
        if (c!='J')
            glu.gluDisk(q, 0f, WIDTH_ARMS, SLICES, STACKS);
        gl.glPopMatrix();
             if (c==' ')
            glu.gluDisk(q, 0f, WIDTH_ARMS, SLICES, STACKS);
        gl.glPopMatrix();
     }
     
     
     public void draw_arm_right (GL gl, GLU glu, char c){
         
        set_red_material(gl); 
        gl.glPushMatrix();
        
        //we orientate axes if stan is walking or is jumping
        if (c=='J'){
            gl.glTranslatef(-0.14f, 0.15f, -0.01f);  
            glu.gluSphere(q, WIDTH_HANDS, SLICES, STACKS);
            gl.glTranslatef(-0.05f, 0.015f, 0.05f);   
            glu.gluSphere(q, WIDTH_FINGERS, SLICES, STACKS);
        }
        if (c=='W'){  
            gl.glTranslatef(0.45f, -0.38f, 0.1f);  
            glu.gluSphere(q, WIDTH_HANDS, SLICES, STACKS);
            gl.glTranslatef(-0.05f, 0.015f, 0.05f);   
            glu.gluSphere(q, WIDTH_FINGERS, SLICES, STACKS);
        }
        if (c==' '){
            gl.glTranslatef(0.70f, -0.35f, 0f);  
            glu.gluSphere(q, WIDTH_HANDS, SLICES, STACKS);
            gl.glTranslatef(-0.055f, 0.015f, 0.05f);   
            glu.gluSphere(q, WIDTH_FINGERS, SLICES, STACKS);
        }       
     
        gl.glPopMatrix();
        //we create right arm
        set_shirt_material(gl);
        gl.glPushMatrix();
        gl.glTranslatef(0.550f, 0.200f, 0f);        
        gl.glRotatef(90f, 1f, 0.20f, 0f);
        if (c=='J')
            gl.glRotatef(150, 0f, 100f, 0f);
        if (c=='W')
            gl.glRotatef(20, -1f, 0f, 0f);
        glu.gluCylinder(q, WIDTH_ARMS, WIDTH_ARMS, HEIGHT_ARMS, SLICES, STACKS);
        glu.gluSphere(q, WIDTH_ARMS, SLICES, STACKS); 
        gl.glRotatef(90f, -1f, -0.20f, 0f);    
        gl.glTranslatef(0f, -HEIGHT_ARMS, 0f);     
        gl.glRotatef(90f, 1f, 0.20f, 0f);
        if (c==' ')
            glu.gluDisk(q, 0f, WIDTH_ARMS, SLICES, STACKS);
        gl.glPopMatrix();
     }
     

    
     

     
     
    public void set_skin_material (GL gl){    
        float[] mat_ambient ={0.0f,0.0f, 1.0f, 1.0f};
        float[] mat_diffuse ={0.59f,0.44f,0.41f,0.0f};
        float shine = 128f;
        
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,mat_diffuse,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
        
    }
    
    
    public void set_shirt_material (GL gl){    
   
        float mat_ambient[]={ 0.120f, 0.120f, 0.120f, 0.0f };
        float[] mat_diffuse ={ 0.8f,0.8f,0.8f,1.0f};
        float mat_specular[]={ 0.4f, 0.3f, 0.2f, 1.0f };
        float shine=128f;
        
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,mat_diffuse,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,mat_specular,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
        
    }
    
    
    public void set_red_material (GL gl){
        
        float[] mat_ambient ={ 0.0f,0.0f,0.0f,0.0f };
        float[] mat_diffuse ={ 0.4f,0.4f,0.4f,1.0f};
        float[] mat_specular ={0.7f,0.6f,0.6f,1.0f };
        float shine =15.0f ;
        
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,mat_diffuse,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,mat_specular,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
        
    }
    
    
    public void set_eyes_material (GL gl){
        
        float mat_ambient[]={1.0f,1.0f,1.0f,1.0f};
        float mat_diffuse[]={1.0f,1.0f,1.0f,1.0f};
        float mat_specular[]={1.0f,1.0f,1.0f,1.0f};
        float shine=51.2f;    
                
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,mat_diffuse,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,mat_specular,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
        
    }
    
    
    public void set_blue_material (GL gl){
        
        float mat_ambient[]={0.120f,0.120f,0.12f,0.0f};
        float mat_diffuse[]={1.0f,1.0f,1.0f,1.0f};
        float mat_specular[]={0.8f,0.8f,0.8f,1.0f};
        float shine=125.2f;    
                
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,mat_diffuse,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,mat_specular,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
        
    }
    
    
    public void set_grey_material (GL gl){
        
        float mat_ambient[]={0.07f,0.07f,0.07f,0.07f};
        float mat_diffuse[]={1.0f,1.0f,1.0f,1.0f};
        float mat_specular[]={0.8f,0.8f,0.8f,1.0f};
        float shine=125.2f;    
                
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,mat_diffuse,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,mat_specular,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
        
    }
        
    
    public void set_black_material (GL gl){
        
        float mat_ambient[]={0.0f,0.0f,0.0f,0.0f};
        float mat_diffuse[]={0.0f,0.0f,0.0f,1.0f};
        float mat_specular[]={0.0f,0.0f,0.0f,1.0f};
        float shine=125.2f;    
                
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_AMBIENT,mat_ambient, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_DIFFUSE,mat_diffuse,0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,GL.GL_SPECULAR,mat_specular,0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,GL.GL_SHININESS,shine);
        
    }
        
    public void box (GL gl){
        gl.glBegin(GL.GL_POLYGON);/* f1: front */
            gl.glNormal3f(0.0f,0.0f,0.0f);
            gl.glVertex3f(0.0f,0.0f,0.0f);
            gl.glVertex3f(0.0f,0.0f,1.0f);
            gl.glVertex3f(1.0f,0.0f,1.0f);
            gl.glVertex3f(1.0f,0.0f,0.0f);
          gl.glEnd();
          gl.glBegin(GL.GL_POLYGON);/* f2: bottom */
            gl.glNormal3f(0.0f,0.0f,-1.0f);
            gl.glVertex3f(0.0f,0.0f,0.0f);
            gl.glVertex3f(1.0f,0.0f,0.0f);
            gl.glVertex3f(1.0f,1.0f,0.0f);
            gl.glVertex3f(0.0f,1.0f,0.0f);
          gl.glEnd();
          gl.glBegin(GL.GL_POLYGON);/* f3:back */
            gl.glNormal3f(1.0f,0.0f,0.0f);
            gl.glVertex3f(1.0f,1.0f,0.0f);
            gl.glVertex3f(1.0f,1.0f,1.0f);
            gl.glVertex3f(0.0f,1.0f,1.0f);
            gl.glVertex3f(0.0f,1.0f,0.0f);
          gl.glEnd();
          gl.glBegin(GL.GL_POLYGON);/* f4: top */
            gl.glNormal3f(0.0f,0.0f,1.0f);
            gl.glVertex3f(1.0f,1.0f,1.0f);
            gl.glVertex3f(1.0f,0.0f,1.0f);
            gl.glVertex3f(0.0f,0.0f,1.0f);
            gl.glVertex3f(0.0f,1.0f,1.0f);
          gl.glEnd();
          gl.glBegin(GL.GL_POLYGON);/* f5: left */
            gl.glNormal3f(0.0f,1.0f,0.0f);
            gl.glVertex3f(0.0f,0.0f,0.0f);
            gl.glVertex3f(0.0f,1.0f,0.0f);
            gl.glVertex3f(0.0f,1.0f,1.0f);
            gl.glVertex3f(0.0f,0.0f,1.0f);
          gl.glEnd();
          gl.glBegin(GL.GL_POLYGON);/* f6: right */
            gl.glNormal3f(0.0f,-1.0f,0.0f);
            gl.glVertex3f(1.0f,0.0f,0.0f);
            gl.glVertex3f(1.0f,0.0f,1.0f);
            gl.glVertex3f(1.0f,1.0f,1.0f);
            gl.glVertex3f(1.0f,1.0f,0.0f);
          gl.glEnd(); 
          
    }
    
    public void set_upLigh(GL gl)
    {
        float ligth_ambient[]={1.0f,1.0f,1.0f,1.0f};
        float ligth_diffuse[]={0.0f,0.0f,0.0f,0.0f};
        float ligth_spectacular[]={1.0f,1.0f,1.0f,0.0f};
        float ligth_position[]={1.0f,1.0f,1.0f,1.0f};
        
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ligth_ambient,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, ligth_diffuse,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_SPECULAR, ligth_spectacular,0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, ligth_position,0);
        
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_DEPTH_TEST);
    }
    
    public void fondo(GL gl, GLU glu,Texture t)
    {
        set_upLigh(gl);
        int m= t.getTextureObject();
        gl.glEnable(GL.GL_TEXTURE_2D);
        gl.glBindTexture(GL.GL_TEXTURE_2D, m);
        
        gl.glBegin(GL.GL_QUADS);
        
        gl.glTexCoord2d(1.0f,1.0f);
        gl.glVertex3f(-6.0f, -6.0f, -6.0f);
        
        gl.glTexCoord2d(1.0f,1.0f);
        gl.glVertex3f(6.0f, -6.0f, -6.0f);
        
        gl.glTexCoord2d(1.0f,0.0f);
        gl.glVertex3f(6.0f, 6.0f, -6.0f);
        
        gl.glTexCoord2d(0.0f,0.0f);
        gl.glVertex3f(-6.0f, 6.0f, -6.0f);
        
        gl.glEnd();
        gl.glFlush();
        
        gl.glDisable(GL.GL_TEXTURE_2D);
        
    }
}