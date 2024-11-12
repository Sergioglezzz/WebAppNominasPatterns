package com.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpleadoDAO;
import com.exceptions.DatosNoCorrectosException;
import com.model.Empleado;

@WebServlet("/empresa")
public class EmpleadoController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public EmpleadoController() {
    super();
  }

  // obtene la petición y la respuesta
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String opcion = request.getParameter("opcion");

    if (opcion.equals("mostrarEmpleados")) {
      mostrarEmpleados(request, response);
    } else if (opcion.equals("consultarSalario")) {
      consultarSalario(request, response);
    } else if (opcion.equals("buscarEmpleados")) {
      buscarEmpleados(request, response);
    } else if (opcion.equals("inicio")) {
      inicio(response);
    }
  }

  // manda la petición y la respuesta
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String opcion = request.getParameter("opcion");

    if (opcion.equals("mostrarSalario")) {
      mostrarSalario(request, response);
    } else if (opcion.equals("mostrarEmpleadosFiltrados")) {
      mostrarEmpleadosFiltrados(request, response);
    } else if (opcion.equals("modificarEmpleado")) {
      modificarEmpleado(request, response);
    } else if (opcion.equals("enviarCambios")) {
      enviarCambios(request, response);
    }
  }

  private void mostrarEmpleados(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    List<Empleado> empleados = null;
    try {
      empleados = empleadoDAO.obtenerEmpleados();
    } catch (DatosNoCorrectosException e) {
      e.printStackTrace();
    }
    request.setAttribute("empleados", empleados);
    request.getRequestDispatcher("/views/MostrarEmpleados.jsp").forward(request, response);
  }

  private void buscarEmpleados(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.getRequestDispatcher("/views/BuscarEmpleado.jsp").forward(request, response);
  }

  private void mostrarEmpleadosFiltrados(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String dni = request.getParameter("dni");
    String nombre = request.getParameter("nombre");
    String sexo = request.getParameter("sexo");
    String categoriaStr = request.getParameter("categoria");
    String antiguedadStr = request.getParameter("anyos");

    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    List<Empleado> empleados = null;

    try {
      Integer categoria = null;
      Integer antiguedad = null;

      if (categoriaStr != null && !categoriaStr.isEmpty()) {
        categoria = Integer.parseInt(categoriaStr);
      }

      if (antiguedadStr != null && !antiguedadStr.isEmpty()) {
        antiguedad = Integer.parseInt(antiguedadStr);
      }

      empleados = empleadoDAO.obtenerEmpleadosFiltrados(nombre, dni, sexo, categoria, antiguedad);
    } catch (DatosNoCorrectosException | NumberFormatException e) {
      e.printStackTrace();
    }

    request.setAttribute("empleados", empleados);
    request.getRequestDispatcher("/views/MostrarEmpleados.jsp").forward(request, response);
  }

  private void consultarSalario(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.getRequestDispatcher("/views/ConsultarSalario.jsp").forward(request, response);
  }

  private void mostrarSalario(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String dni = request.getParameter("dni");
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();

    double salario = empleadoDAO.obtenerSalario(dni);
    request.setAttribute("salario", salario);

    request.setAttribute("dni", dni);
    request.getRequestDispatcher("/views/MostrarSalario.jsp").forward(request, response);
  }

  private void modificarEmpleado(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String dni = request.getParameter("dni");
    Empleado empleado = null;
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();

    try {
      empleado = empleadoDAO.obtenerEmpleado(dni);
    } catch (DatosNoCorrectosException e) {
      e.printStackTrace();
    }
    request.setAttribute("empleado", empleado);
    request.getRequestDispatcher("/views/ModificarEmpleado.jsp").forward(request, response);
  }

  private void enviarCambios(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String dni = request.getParameter("dni");
    String nombre = request.getParameter("nombre");
    String sexo = request.getParameter("sexo");
    Integer categoria = Integer.parseInt(request.getParameter("categoria"));
    Integer antiguedad = Integer.parseInt(request.getParameter("anyos"));

    EmpleadoDAO empleadoDAO = new EmpleadoDAO();

    try {
      if (empleadoDAO.actualizarEmpleado(dni, nombre, sexo, categoria, antiguedad)) {
        response.sendRedirect("empresa?opcion=mostrarEmpleados");
      } else {
        request.setAttribute("mensaje", "Datos no soportados");
        request.getRequestDispatcher("/views/error.jsp").forward(request, response);
      }
    } catch (DatosNoCorrectosException e) {
      e.printStackTrace();
    }
  }

  private void inicio(HttpServletResponse response) throws IOException {
    response.sendRedirect("index.jsp");
  }

}
