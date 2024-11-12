package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.conexion.Conexion;
import com.exceptions.DatosNoCorrectosException;
import com.model.Empleado;

public class EmpleadoDAO {
    // private Connection connection;
    // private PreparedStatement statement;

    // Método para obtener lista de empleados
    public List<Empleado> obtenerEmpleados() throws DatosNoCorrectosException {

        List<Empleado> listaEmpleados = new ArrayList<>();
        String sql = "SELECT * FROM empleados";

        try (Connection con = Conexion.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            System.out.println("Conexión establecida para obtener empleados.");
            System.out.println("consulta: " + sql);

            while (rs.next()) {

                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                Character sexo = rs.getString("sexo").charAt(0);
                int categoria = rs.getInt("categoria");
                int anyos = rs.getInt("anyos");

                Empleado emp = new Empleado(dni, nombre, sexo, categoria, anyos);
                listaEmpleados.add(emp);
                System.out.println("Empleado añadido a la lista: " + emp);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener empleados.");
            System.out.println(e);
        }

        return listaEmpleados;
    }

    // Método para obtener empleados filtrados
    public List<Empleado> obtenerEmpleadosFiltrados(String dni, String nombre, String sexo, int categoria,
            int anyos) throws DatosNoCorrectosException {
        List<Empleado> listaEmpleados = new ArrayList<>();

        String sql = "SELECT dni, nombre, sexo, categoria, anyos FROM EMPLEADOS WHERE 1=1"
                + (dni != null && !dni.isEmpty() ? " AND dni LIKE '%" + dni + "%'" : "")
                + (nombre != null && !nombre.isEmpty() ? " AND nombre LIKE '%" + nombre + "%'" : "")
                + (sexo != null && !sexo.isEmpty() ? " AND sexo = '" + sexo.charAt(0) + "'" : "")
                + (categoria != -1 ? " AND categoria = " + categoria : "")
                + (anyos != -1 ? " AND anyos = " + anyos : "");

        try (Connection con = Conexion.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                String dniEmp = rs.getString("dni");
                String nombreEmp = rs.getString("nombre");
                Character sexoEmp = rs.getString("sexo").charAt(0);
                int categoriaEmp = rs.getInt("categoria");
                int anyosEmp = rs.getInt("anyos");

                Empleado emp = new Empleado(nombreEmp, dniEmp, sexoEmp, categoriaEmp, anyosEmp);
                listaEmpleados.add(emp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return listaEmpleados;
    }

    // Método para obtener un empleado por DNI
    public Empleado obtenerEmpleado(String dni) throws DatosNoCorrectosException {

        Empleado listaEmpleados = null;
        String sql = "SELECT * FROM empleados WHERE dni = '" + dni + "'";

        try (Connection con = Conexion.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                String dniEmp = rs.getString("dni");
                String nombreEmp = rs.getString("nombre");
                Character sexoEmp = rs.getString("sexo").charAt(0);
                int categoriaEmp = rs.getInt("categoria");
                int anyosEmp = rs.getInt("anyos");

                listaEmpleados = new Empleado(nombreEmp, dniEmp, sexoEmp, categoriaEmp, anyosEmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return listaEmpleados;

    }

    // Método para obtener el salario de un empleado por DNI
    public double obtenerSalario(String dni) {

        // posiblemente haya que cambiar el tipo de dato de salario a Integer
        double salario = 0.0;
        String sql = "SELECT sueldofinal FROM nominas WHERE dni = '" + dni + "'";

        try (Connection con = Conexion.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                salario = rs.getDouble("sueldofinal");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return salario;

    }

    // Método para modificar un empleado
    public int modificarEmpleado(String dni, String campo, String valor) {

        if (campo.equalsIgnoreCase("nombre") || campo.equalsIgnoreCase("sexo")) {
            valor = "'" + valor + "'";
        }

        String sql = "UPDATE EMPLEADOS SET " + campo + " = " + valor + " WHERE DNI = '" + dni + "'";

        try (Connection con = Conexion.getConnection(); Statement st = con.createStatement()) {

            return st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }

    }

    // Método para actualizar a un empleado
    public boolean actualizarEmpleado(String dni, String nombre, String sexo, Integer categoria, int anyos)
            throws DatosNoCorrectosException {
        String sql = "UPDATE EMPLEADOS SET nombre = '" + nombre + "', sexo = '" + sexo + "', categoria = " + categoria
                + ", anyos = " + anyos + " WHERE dni = '" + dni + "'";

        try (Connection con = Conexion.getConnection(); Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            return false;
        }

        return true;
    }
}
