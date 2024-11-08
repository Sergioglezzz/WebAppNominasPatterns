<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>

<head>
    <title>Obtener Salario</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gray-100">
    <div class="container mx-auto p-6">
        <h1 class="text-3xl font-bold text-center text-blue-600 mb-8">Buscar Salario de Empleado</h1>

        <div class="bg-white shadow-md rounded p-6">
            <form action="empresa" method="post" class="space-y-4">
                <div>
                    <label for="dni" class="block text-sm font-medium text-gray-700">DNI del Empleado:</label>
                    <input type="text" name="dni" id="dni" required 
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                </div>

                <div>
                    <input type="hidden" name="opcion" value="mostrarSalario">
                    <input type="submit" value="Buscar" 
                        class="w-full bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded">
                </div>
            </form>
        </div>

        <div class="mt-6 text-center">
            <button onclick="location.href='empresa?opcion=consultarSalario'" 
                class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
                Intentar de nuevo
            </button>
        </div>

        <div class="mt-6 text-center">
            <a href="empresa?opcion=inicio" class="text-blue-500 hover:text-blue-700 font-semibold">Volver al Inicio</a>
        </div>
    </div>
</body>

</html>
