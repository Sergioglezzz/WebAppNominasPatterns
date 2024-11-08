<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
<title>Pagina Principal - Gestion de Empleados</title>
</head>
<body class="bg-gray-100">
  <div class="container mx-auto p-6">
    <h1 class="text-3xl font-bold text-center text-blue-600 mb-8">Gestión de Empleados</h1>
    
    <div class="bg-white shadow-md rounded p-4">
      <table class="table-auto w-full border-collapse">
        <tr>
          <td class="border px-4 py-2 text-center">
            <a href="empresa?opcion=mostrarEmpleados" class="text-blue-500 hover:text-blue-700 font-semibold">Mostrar empleados</a>
          </td>
        </tr>
        <tr>
          <td class="border px-4 py-2 text-center">
            <a href="empresa?opcion=consultarSalario" class="text-blue-500 hover:text-blue-700 font-semibold">Consultar salario de un empleado</a>
          </td>
        </tr>
        <tr>
          <td class="border px-4 py-2 text-center">
            <a href="empresa?opcion=modificarEmpleado" class="text-blue-500 hover:text-blue-700 font-semibold">Modificar datos de un empleado</a>
          </td>
        </tr>
      </table>
    </div>
  </div>
</body>
</html>