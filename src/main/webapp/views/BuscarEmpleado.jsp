<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Buscar Empleado</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gray-100">
    <div class="container mx-auto p-6">
        <h1 class="text-3xl font-bold text-center text-blue-600 mb-8">Buscar Empleado</h1>

        <div class="bg-white shadow-md rounded p-6">
            <form action="empresa" method="post" class="space-y-4">
                <div>
                    <label for="dni" class="block text-sm font-medium text-gray-700">DNI (contiene):</label>
                    <input type="text" name="dni" id="dni" placeholder="Cualquiera" 
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                </div>

                <div>
                    <label for="nombre" class="block text-sm font-medium text-gray-700">Nombre (contiene):</label>
                    <input type="text" name="nombre" id="nombre" placeholder="Cualquiera" 
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                </div>

                <div>
                    <label for="sexo" class="block text-sm font-medium text-gray-700">Sexo:</label>
                    <select name="sexo" id="sexo" 
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 bg-white rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                        <option value="">Cualquiera</option>
                        <option value="M">Masculino</option>
                        <option value="F">Femenino</option>
                    </select>
                </div>

                <div>
                    <label for="categoria" class="block text-sm font-medium text-gray-700">Categoría:</label>
                    <input type="number" name="categoria" id="categoria" placeholder="Cualquiera" 
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                </div>

                <div>
                    <label for="anyos" class="block text-sm font-medium text-gray-700">Años Trabajados:</label>
                    <input type="number" name="anyos" id="anyos" placeholder="Cualquiera" 
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                </div>

                <div>
                    <input type="hidden" name="opcion" value="mostrarEmpleadosFiltrados">
                    <input type="submit" value="Buscar" 
                        class="w-full bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded">
                </div>
            </form>
        </div>

        <div class="mt-6 text-center">
            <a href="empresa?opcion=inicio" class="text-blue-500 hover:text-blue-700 font-semibold">Volver al Inicio</a>
        </div>
    </div>
</body>

</html>
