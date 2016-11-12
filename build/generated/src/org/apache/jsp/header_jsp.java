package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<nav id=\"custom-nav\" class=\"navbar navbar-fixed-top text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a id=\"hovernav\" href=\"/Hotel\" class=\"navbar-brand page-scroll hvr-underline-from-left\">Brand</a>\n");
      out.write("        </div>\n");
      out.write("        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal Profile -->\n");
      out.write("<div class=\"modal fade\" id=\"ProfileModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <!-- content -->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\" style=\"background-color: #179b77\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h3 class=\"modal-title text-center\" style=\"color: #fff\">Profile</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Modal SignUp -->\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <!-- Content -->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <form action=\"RegisterServlet\" method=\"get\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    <h3 class=\"modal-title text-center\">Sign Up</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group field\">\n");
      out.write("                                <label>Username :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control inputbox\" name=\"username\" id=\"username\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group field\">\n");
      out.write("                                <label>Password :</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control inputbox\" name=\"password\" id=\"password\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group field\">\n");
      out.write("                                <label>First Name :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control inputbox\" name=\"fname\" id=\"fname\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-group field\">\n");
      out.write("                                <label>Last Name :</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control inputbox\" name=\"lname\" id=\"lname\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group field\">\n");
      out.write("                        <label>E-mail :</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control inputbox\" name=\"email\" id=\"email\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group field\">\n");
      out.write("                        <label>Address :</label>\n");
      out.write("                        <textarea class=\"form-control inputbox\" rows=\"5\" name=\"address\" id=\"address\" required></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <!--                    <div class=\"form-group\">\n");
      out.write("                                            <label>City :</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"city\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Country :</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"country\">\n");
      out.write("                                        </div>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <div class=\"form-group actions\">\n");
      out.write("                        <button type=\"Submit\" class=\"btn btn-default\" id=\"valid\" disabled=\"disabled\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<br>");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.login == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
        out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("                        <li>\n");
        out.write("                            <a class=\"hvr-underline-from-left\" id=\"hovernav\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
        out.write("                                <span class=\"glyphicon glyphicon-user\"></span>  Sign Up\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                        <li class=\"dropdown\">\n");
        out.write("                            <a class=\"hvr-underline-from-left\" id=\"hovernav\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
        out.write("                                <span class=\"glyphicon glyphicon-log-in\"></span>  Login\n");
        out.write("                            </a>\n");
        out.write("                            <ul class=\"dropdown-menu animated zoomIn\" id=\"login-dp\">\n");
        out.write("                                <li class=\"dropdown-header text-center\" style=\"font-size: 1.8em\">Login</li>\n");
        out.write("                                <li>                               \n");
        out.write("                                    <div class=\"row\">\n");
        out.write("                                        <div class=\"col-xs-12\">\n");
        out.write("                                            <form class=\"form\" role=\"form\" action=\"LoginServlet\" method=\"post\">\n");
        out.write("                                                <div class=\"form-group\" id=\"group\">\n");
        out.write("                                                    <label for=\"usr\">Username : </label>\n");
        out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"username\" required/>                                       \n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"form-group\" id=\"group\">\n");
        out.write("                                                    <label for=\"pwd\">Password : </label>\n");
        out.write("                                                    <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\" required/>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"form-group\" id=\"group\">\n");
        out.write("                                                    <button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button>\n");
        out.write("                                                </div>\n");
        out.write("                                            </form>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </li>\n");
        out.write("                            </ul>\n");
        out.write("                        </li>                  \n");
        out.write("                    </ul>\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
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
        out.write("\n");
        out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
        out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("                        <li>\n");
        out.write("                            <a class=\"hvr-underline-from-left\" id=\"hovernav\" href=\"#\" data-toggle=\"modal\" data-target=\"#ProfileModal\">\n");
        out.write("                                <span class=\"glyphicon glyphicon-user\"></span>  Profile\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                        <li>\n");
        out.write("                            <a class=\"hvr-underline-from-left\" id=\"hovernav\" href=\"LogoutServlet\">  \n");
        out.write("                                <form action='LogoutServlet' method=\"post\">                       \n");
        out.write("                                    <span class=\"glyphicon glyphicon-log-out\"></span>  Logout                          \n");
        out.write("                                </form>\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                    </ul>\n");
        out.write("                </div>\n");
        out.write("            ");
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
