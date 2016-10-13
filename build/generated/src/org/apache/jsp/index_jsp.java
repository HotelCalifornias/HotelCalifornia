package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HomePage</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            #login-dp{\n");
      out.write("                min-width: 44vh;\n");
      out.write("                padding: 15px 15px 0;              \n");
      out.write("            }\n");
      out.write("            #login-dp .form-group{\n");
      out.write("                margin-bottom: 20px;      \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                font-size: 1.6em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid  text-center\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a href=\"#\" class=\"navbar-brand\">Brand</a>\n");
      out.write("                </div>\n");
      out.write("                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("    \n");
              out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
              out.write("                    <li>\n");
              out.write("                        <a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
              out.write("                            <span class=\"glyphicon glyphicon-user\"></span>  Sign Up\n");
              out.write("                        </a>\n");
              out.write("                    </li>\n");
              out.write("                    <li class=\"dropdown\">\n");
              out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
              out.write("                            <span class=\"glyphicon glyphicon-log-in\"></span>  Login\n");
              out.write("                        </a>\n");
              out.write("                        <ul class=\"dropdown-menu\" id=\"login-dp\">\n");
              out.write("                            <li class=\"dropdown-header text-center\" style=\"font-size:2em;\">Login</li>\n");
              out.write("                            <li>                               \n");
              out.write("                                <div class=\"row\">\n");
              out.write("                                    <div class=\"col-xs-12\">\n");
              out.write("                                        <form class=\"form\" role=\"form\" action=\"LoginServlet\" method=\"post\">\n");
              out.write("                                            <div class=\"form-group\" id=\"group\">\n");
              out.write("                                                <label for=\"usr\">Username : </label>\n");
              out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"username\"/>                                       \n");
              out.write("                                            </div>\n");
              out.write("                                            <div class=\"form-group\" id=\"group\">\n");
              out.write("                                                <label for=\"pwd\">Password : </label>\n");
              out.write("                                                <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\"/>\n");
              out.write("                                            </div>\n");
              out.write("                                            <div class=\"form-group\" id=\"group\">\n");
              out.write("                                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button>\n");
              out.write("                                            </div>\n");
              out.write("                                        </form>\n");
              out.write("                                        <h3>");
              out.print(request.getAttribute("message"));
              out.write("</h3>\n");
              out.write("                                        <h3>");
              out.print(request.getAttribute("Success"));
              out.write("</h3>\n");
              out.write("                                    </div>\n");
              out.write("                                </div>\n");
              out.write("                            </li>\n");
              out.write("                        </ul>\n");
              out.write("                    </li>                  \n");
              out.write("                </ul>\n");
              out.write("                ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("         <h3>HELLO</h3>\n");
      out.write("        <!-- Modal Profile -->\n");
      out.write("        <div class=\"modal fade\" id=\"ProfileModal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <!-- content -->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h3 class=\"modal-title text-center\">Profile</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Modal SignUp -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <!-- Content -->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"/RegisterServlet\" method=\"post\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h3 class=\"modal-title text-center\">Sign Up</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">        \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"fname\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Surname :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"lname\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Username :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Password :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>E-mail :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Tel :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"tel\">\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"Submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                    <h3>");
      out.print(request.getAttribute("message"));
      out.write("</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>      \n");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("               \n");
        out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"#\" data-toggle=\"modal\" data-target=\"#ProfileModal\">\n");
        out.write("                                <span class=\"glyphicon glyphicon-user\"></span>  Profile\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"LogoutServlet\">  \n");
        out.write("                            <form action='LogoutServlet' method=\"post\">                       \n");
        out.write("                               <span class=\"glyphicon glyphicon-log-out\"></span>  Logout                          \n");
        out.write("                            </form>\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                    </ul>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
