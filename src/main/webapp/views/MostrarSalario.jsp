<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>

<head>
    <title>Salario del Empleado</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gray-100">
    <div class="container mx-auto p-6">
        <h1 class="text-3xl font-bold text-center text-blue-600 mb-8">Salario del Empleado</h1>

        <div class="bg-white shadow-md rounded p-6">
            <p class="text-lg">
                <span class="font-semibold">DNI:</span> <strong class="text-gray-800">${dni}</strong>
            </p>
            <p class="text-lg mt-4">
                <span class="font-semibold">Salario:</span>
                <strong class="text-gray-800">
                    ${salario != null || salario != 0 ? salario : "No Encontrado"}
                    ${salario != null || salario != 0 ? " u.m." : ""}
                </strong>
            </p>
        </div>

        <div class="mt-6 text-center">
            <button onclick="location.href='empresa?opcion=consultarSalario'" 
                class="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded">
                Buscar otro DNI
            </button>
        </div>

        <div class="mt-6 text-center">
            <a href="empresa?opcion=inicio" class="text-blue-500 hover:text-blue-700 font-semibold">Volver al Inicio</a>
        </div>
    </div>
</body>

</html>
