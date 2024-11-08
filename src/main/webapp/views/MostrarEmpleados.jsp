<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Lista Empleados</title>
  <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gray-100">
  <div class="container mx-auto p-6">
    <h1 class="text-3xl font-bold text-center text-blue-600 mb-8">Lista de Empleados</h1>
    
    <div class="bg-white shadow-md rounded p-4">
      <table class="table-auto w-full rounded-lg shadow-md">
        <thead>
          <tr>
            <th class="border px-4 py-2 ">DNI</th>
            <th class="border px-4 py-2">Nombre</th>
            <th class="border px-4 py-2">Sexo</th>
            <th class="border px-4 py-2">Categoría</th>
            <th class="border px-4 py-2">Años Trabajados</th>
            <th class="border px-4 py-2">Acción</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="empleado" items="${empleados}">
            <tr class="text-center">
              <td class="border px-4 py-2">${empleado.dni}</td>
              <td class="border px-4 py-2">${empleado.nombre}</td>
              <td class="border px-4 py-2">${empleado.sexo}</td>
              <td class="border px-4 py-2">${empleado.categoria}</td>
              <td class="border px-4 py-2">${empleado.anyos}</td>
              <td class="border px-4 py-2">
                <form action="empresa" method="post" class="inline-block">
                  <input type="hidden" name="dni" value="${empleado.dni}">
                  <input type="hidden" name="opcion" value="modificarEmpleado">
                  <input type="submit" value="Modificar" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
                </form>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>

    <div class="mt-6 text-center">
      <button class="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded" onclick="location.href='empresa?opcion=buscarEmpleados'">Buscar</button>
      <a href="empresa?opcion=inicio" class="ml-4 text-blue-500 hover:text-blue-700 font-semibold">Volver al Inicio</a>
    </div>
  </div>
</body>

</html>
