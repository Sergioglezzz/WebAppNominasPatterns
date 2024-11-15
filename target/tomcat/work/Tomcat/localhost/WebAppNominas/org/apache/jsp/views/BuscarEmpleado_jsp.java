/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-10-30 12:26:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BuscarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Buscar Empleado</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-gray-100\">\n");
      out.write("    <div class=\"container mx-auto p-6\">\n");
      out.write("        <h1 class=\"text-3xl font-bold text-center text-blue-600 mb-8\">Buscar Empleado</h1>\n");
      out.write("\n");
      out.write("        <div class=\"bg-white shadow-md rounded p-6\">\n");
      out.write("            <form action=\"empresa\" method=\"post\" class=\"space-y-4\">\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"dni\" class=\"block text-sm font-medium text-gray-700\">DNI (contiene):</label>\n");
      out.write("                    <input type=\"text\" name=\"dni\" id=\"dni\" placeholder=\"Cualquiera\" \n");
      out.write("                        class=\"mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"nombre\" class=\"block text-sm font-medium text-gray-700\">Nombre (contiene):</label>\n");
      out.write("                    <input type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Cualquiera\" \n");
      out.write("                        class=\"mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"sexo\" class=\"block text-sm font-medium text-gray-700\">Sexo:</label>\n");
      out.write("                    <select name=\"sexo\" id=\"sexo\" \n");
      out.write("                        class=\"mt-1 block w-full px-3 py-2 border border-gray-300 bg-white rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm\">\n");
      out.write("                        <option value=\"\">Cualquiera</option>\n");
      out.write("                        <option value=\"M\">Masculino</option>\n");
      out.write("                        <option value=\"F\">Femenino</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"categoria\" class=\"block text-sm font-medium text-gray-700\">Categoría:</label>\n");
      out.write("                    <input type=\"number\" name=\"categoria\" id=\"categoria\" placeholder=\"Cualquiera\" \n");
      out.write("                        class=\"mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"anyos\" class=\"block text-sm font-medium text-gray-700\">Años Trabajados:</label>\n");
      out.write("                    <input type=\"number\" name=\"anyos\" id=\"anyos\" placeholder=\"Cualquiera\" \n");
      out.write("                        class=\"mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"hidden\" name=\"opcion\" value=\"mostrarEmpleadosFiltrados\">\n");
      out.write("                    <input type=\"submit\" value=\"Buscar\" \n");
      out.write("                        class=\"w-full bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mt-6 text-center\">\n");
      out.write("            <a href=\"empresa?opcion=inicio\" class=\"text-blue-500 hover:text-blue-700 font-semibold\">Volver al Inicio</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
