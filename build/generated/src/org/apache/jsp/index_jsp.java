package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>HomePage</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"slick-1.6.0/slick/slick.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"slick-1.6.0/slick/slick-theme.css\"/>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            #login-dp{\r\n");
      out.write("                min-width: 44vh;\r\n");
      out.write("                padding: 15px 15px 0;              \r\n");
      out.write("            }\r\n");
      out.write("            #login-dp .form-group{\r\n");
      out.write("                margin-bottom: 20px;      \r\n");
      out.write("            }\r\n");
      out.write("            body{\r\n");
      out.write("                margin: 0px;\r\n");
      out.write("                padding: 0px;\r\n");
      out.write("                font-size: 1.6em;\r\n");
      out.write("            }\r\n");
      out.write("            .fullwidth {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                margin-left: auto;\r\n");
      out.write("                margin-right: auto;\r\n");
      out.write("                max-width: initial;\r\n");
      out.write("            }\r\n");
      out.write("            .slider {margin: 0;}\r\n");
      out.write("            .slider .slide {width: 100%; height: 100%;}\r\n");
      out.write("\r\n");
      out.write("            .slick-prev {\r\n");
      out.write("                left: 0;\r\n");
      out.write("                background: red;\r\n");
      out.write("            }\r\n");
      out.write("            .slick-next {\r\n");
      out.write("                right: 0;\r\n");
      out.write("                background: red;\r\n");
      out.write("            }\r\n");
      out.write("            .slick-dots {\r\n");
      out.write("                bottom: 0px;\r\n");
      out.write("                margin-left: 0; /* Fixes the visible horizontal scroll bar */\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"slider\">\r\n");
      out.write("            <div class=\"image\"><img src=\"http://cdn.wallpapersafari.com/47/90/jB4KV1.jpg\"/></div>\r\n");
      out.write("            <div class=\"image\"><img src=\"http://cdn.wallpapersafari.com/54/26/Z6ioh9.jpg\"/></div>\r\n");
      out.write("            <div class=\"image\"><img src=\"http://cdn.wallpapersafari.com/55/67/puqkWI.jpg\"/></div>       \r\n");
      out.write("        </div>\r\n");
      out.write("    </center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"slick-1.6.0/slick/slick.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('.slider').slick({\r\n");
      out.write("                dots: true,\r\n");
      out.write("                arrows: true,\r\n");
      out.write("                slidesToShow: 1,\r\n");
      out.write("                slidesToScroll: 1,\r\n");
      out.write("                autoplay: true,\r\n");
      out.write("                autoplaySpeed: 2000\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
