/*
 this class is used to make a line chart in jpeg format 
 */
package ChartServlets;

import Images.ColumnImage;
import Images.LineImage;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lineChart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("image/jpeg");
OutputStream os=response.getOutputStream();
       int iy;
       iy=0;
       String values[]=request.getParameterValues("secvalue");
       iy=(values.length - 2)*25;
       BufferedImage bi=new BufferedImage(500, 500+iy,BufferedImage.TYPE_INT_RGB);
      
       String heads[]=request.getParameterValues("headtitle");
       int comp=Integer.valueOf(request.getParameter("vals"));
       String dch=request.getParameter("ch");
       boolean dchb;
       if(dch!=null)
           dchb=true;
       else
           dchb=false;
       
       LineImage.Generate(bi, heads, values,comp,dchb);
         boolean write = ImageIO.write(bi, "jpg", os);
        }
    }

