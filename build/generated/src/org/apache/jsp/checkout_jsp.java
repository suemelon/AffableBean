package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/affablebean.css\">\n");
      out.write("        <title>The Affable Bean</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"widgetBar\">\n");
      out.write("\n");
      out.write("                    <div class=\"headerWidget\">\n");
      out.write("                        [ language toggle ]\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"headerWidget\"></div>\n");
      out.write("\n");
      out.write("                    <div class=\"headerWidget\">\n");
      out.write("                        [ shopping cart widget ]\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"#\" id=\"logo\" alt=\"Affable Bean logo\">\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <img src=\"#\" id=\"logoText\" alt=\"the affable bean\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"centerColumn\">\n");
      out.write("\n");
      out.write("                <h2>checkout</h2>\n");
      out.write("\n");
      out.write("                <p>[ text ]</p>\n");
      out.write("\n");
      out.write("                <form action=\"purchase\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <table id=\"checkoutTable\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>[ form containing fields to\n");
      out.write("                                <br>capture customer details ]</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"submit button\"></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <div id=\"infoBox\">\n");
      out.write("\n");
      out.write("                    <div style=\"border: black solid 1px; height:100px; padding: 10px\">\n");
      out.write("                        [ purchase conditions ]\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"priceBox\">\n");
      out.write("                        [ purchase calculations:<br>subtotal + delivery charge ]\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <hr>\n");
      out.write("                <p id=\"footerText\">[ footer text ]</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
