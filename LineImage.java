/*
An image is generated in form of graph accourding to the data entered by th user.
 */
package Images;

import java.awt.BasicStroke;/*this class states color in the default sRGB color space or colors in arbitary color spaces identified by a colorSpace.*/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Random;

public class LineImage {
    public static  void Generate(BufferedImage bi,String heads[],String values[],int vals,boolean dch)
    {
       
       
          int heady=200;   
        Graphics g=bi.getGraphics();
      Random rm=new Random();
      int re,gr,bl;
          g.setColor(Color.WHITE);
          Font f=new Font("Arial",Font.BOLD,30);
       
          
   g.drawString("Generated LineImage Generation",250,30);/*an sting generated LineImage Generation is plced at top right side in the form.*/
    g.drawLine(50,50,50,400);
    g.drawLine(50,400,350,400);
   
    for(int i=1;i<=10;i++)
               {
    g.drawLine(45,400-(i*30),50,400-(i*30));
    if(i<=9)
           g.drawString(String.valueOf(i*10),30,375-((i-1)*30));
    else       
    g.drawString(String.valueOf(i*10),23,375-((i-1)*30));
               
       }
   int st,en;
   st=0;
   en=vals-1;
   int dx,dy;
            dy=440;
            int vs=(heads.length)-2;
            g.drawRect(50, 420, 300, 60 + (vs*30) );
             
        for (String head : heads) {
            dx=60;
   
            re=rm.nextInt(255);
            gr=rm.nextInt(255);
            bl=rm.nextInt(255);
            Color c=Color.getHSBColor(re, gr, bl);/*mix your own colors using the RGB color model when creating a new color object*/
            g.setColor(c);
           g.fillRect(380, heady, 10, 10);
            g.setColor(Color.white);
           
           g.drawString(head, 400, heady+10);
           heady=heady+ 15;
            int ptx1,ptx2,pty1,pty2;
            ptx1=50;
            pty1=400;
            ptx2=100;
            if(dch==true)
            {
           
            g.drawLine(50, dy+10, 350, dy+10);
            
           g.drawString(head, dx,dy);
           
           
          
            }
            dx=dx+60;
            for(int i=st;i<=en;i++)
            {
                Color ctemp=c;
           g.setColor(ctemp);
                
                pty2=400-(Integer.valueOf(values[i])*3);
                
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(3));
                g2d.draw(new Line2D.Float(ptx1,pty1,ptx2,pty2));
                
                g.drawOval(ptx2-3, pty2-3, 6, 6);
                
               g.setColor(Color.white);
             
                g.drawString(String.valueOf(values[i]),ptx2+4,pty2+9);
                g.drawString(String.valueOf(values[i]),dx,dy);
         dx=dx+60;
                ptx1=ptx1+50;
                ptx2=ptx2+50;
                pty1=pty2;
                
                
            }
            dy=dy+30;
            st=en+1;
            en=en+vals;
        }
               
    }
}
   
    

