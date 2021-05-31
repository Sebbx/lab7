package pl.lublin.wsei.java.cwiczenia;

public class MyDB {

    String lh, dbn;
    int p;

    private String user, password;

    public MyDB (String localhost, int port, String dbName)
    {
        lh = localhost;
        p = port;
        dbn = dbName;
    }

    public void setUser(String newUser)
    {
        this.user = newUser;
    }

    public void setPassword(String newPassword)
    {
        this.password = newPassword;
    }
}
