package com.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static BasicDataSource dataSource = null;

    private static void initializeDataSource() {
        System.out.println("Inicializando el DataSource...");
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setUrl("jdbc:mysql://localhost:3306/empresa");
        dataSource.setInitialSize(20);
        dataSource.setMaxIdle(15);
        dataSource.setMaxTotal(20);
        dataSource.setMaxWaitMillis(5000);
        System.out.println("DataSource inicializado exitosamente.");

    }

    private static DataSource getDataSource() {
        if (dataSource == null) {
            initializeDataSource();
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        System.out.println("Obteniendo una conexión de la base de datos...");
        Connection connection = getDataSource().getConnection();
        System.out.println("Conexión obtenida exitosamente.");
        return connection;
    }
}
