package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AlertFile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"sweetalert-master/dist/sweetalert.min.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sweetalert-master/dist/sweetalert.css\">\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                swal({\n");
      out.write("                    title: \"Ajax request example\",\n");
      out.write("                    text: \"Submit to run ajax request\",\n");
      out.write("                    type: \"info\",\n");
      out.write("                    showCancelButton: true,\n");
      out.write("                    closeOnConfirm: false,\n");
      out.write("                    showLoaderOnConfirm: true,\n");
      out.write("                },\n");
      out.write("                        function () {\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                swal(\"Ajax request finished!\");\n");
      out.write("                            }, 2000);\n");
      out.write("                        });\n");
      out.write("            }\n");
      out.write("\t\tfunction fncShow()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdocument.getElementById('myTable').style.display = '';\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction fncHide()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tdocument.getElementById('myTable').style.display = 'none';\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <button onclick=\"myFunction()\">Try it</button>\n");
      out.write("        <table id=\"myTable\" width=\"190\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>ThaiCreate.Com</td>\n");
      out.write("\t\t\t<td>ThaiCreate.Com</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>ThaiCreate.Com</td>\n");
      out.write("\t\t\t<td>ThaiCreate.Com</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t<input name=\"btnShow\" id=\"btnShow\" type=\"button\" value=\"Show\" onClick=\"JavaScript:fncShow();\">\n");
      out.write("\t<input name=\"btnHide\" id=\"btnHide\" type=\"button\" value=\"Hide\" onClick=\"JavaScript:fncHide();\">\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
