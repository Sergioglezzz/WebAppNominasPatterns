<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Error</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gray-100">
    <div class="container mx-auto p-6">
        <h1 class="text-3xl font-bold text-center text-red-600 mb-8">Ocurrió un Error</h1>

        <div class="bg-white shadow-md rounded p-6 text-center">
            <p class="text-lg text-gray-800">${errorMessage}</p>
        </div>

        <div class="mt-6 text-center">
            <a href="empresa?opcion=inicio" class="text-blue-500 hover:text-blue-700 font-semibold">Volver al Inicio</a>
        </div>
    </div>
</body>

</html>
