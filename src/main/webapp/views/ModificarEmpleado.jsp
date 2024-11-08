<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.model.Empleado"%>
<%
Empleado empleado = (Empleado) request.getAttribute("listaEmpleados");
%>
<!DOCTYPE html>
<html>

<head>
    <title>Modificar Empleado</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gray-100">
    <div class="container mx-auto p-6">
        <h1 class="text-3xl font-bold text-center text-blue-600 mb-8">Modificar Empleado</h1>

        <div class="bg-white shadow-md rounded p-6">
            <form action="empresa" method="post">
                <input type="hidden" name="dni" value="<%=empleado.getDni()%>">

                <div class="mb-4">
                    <label for="nombre" class="block text-gray-700 font-bold mb-2">Nombre:</label>
                    <input type="text" name="nombre" id="nombre" value="<%=empleado.getNombre()%>" required 
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <div class="mb-4">
                    <label for="sexo" class="block text-gray-700 font-bold mb-2">Sexo:</label>
                    <select name="sexo" id="sexo" 
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                        <option value="" <%=empleado.getSexo() == ' ' ? "selected" : ""%>>Cualquiera</option>
                        <option value="M" <%=empleado.getSexo() == 'M' ? "selected" : ""%>>Masculino</option>
                        <option value="F" <%=empleado.getSexo() == 'F' ? "selected" : ""%>>Femenino</option>
                    </select>
                </div>

                <div class="mb-4">
                    <label for="categoria" class="block text-gray-700 font-bold mb-2">Categoría:</label>
                    <input type="number" name="categoria" id="categoria" value="<%=empleado.getCategoria()%>" required
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <div class="mb-4">
                    <label for="anyos" class="block text-gray-700 font-bold mb-2">Años Trabajados:</label>
                    <input type="number" name="anyos" id="anyos" value="<%=empleado.getAnyos()%>" required
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <input type="hidden" name="opcion" value="enviarCambios">
                <div class="flex items-center justify-between">
                    <input type="submit" value="Enviar Cambios" 
                        class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline">
                    <a href="empresa?opcion=inicio" 
                        class="inline-block align-baseline font-bold text-sm text-blue-500 hover:text-blue-800">Volver al Inicio</a>
                </div>
            </form>
        </div>
    </div>
</body>

</html>
