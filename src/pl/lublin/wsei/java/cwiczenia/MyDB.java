package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {

    String host, dbName;
    int port;

    private String user, password;

    public MyDB (String host, int port, String dbName)
    {
        this.host = host;
        this.port = port;
        this.dbName = dbName;
    }

    public void setUser(String newUser)
    {
        this.user = newUser;
    }

    public void setPassword(String newPassword)
    {
        this.password = newPassword;
    }

    private Connection conn = null;

    private void connect() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        String jdbcString = "jdbc:mysql://" + host + ":" + port + "/" + dbName;

        try {
            conn = DriverManager.getConnection(
                    jdbcString, connectionProps);
        }
        catch (SQLException e) {
            System.out.println("Błąd podłączenia do bazy: "+jdbcString);
            System.out.println("Komunikat błędu: "+e.getMessage());
            conn = null;
        }
        System.out.println("Connected to database "+dbName);
    }

    public Connection getConnection() {
        if (conn == null)
            connect();
        return  conn;
    }
}
