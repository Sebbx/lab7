package pl.lublin.wsei.java.cwiczenia;

public class MyDB {

    String lh, dbn;
    int p;

    public MyDB (String localhost, int port, String dbName)
    {
        lh = localhost;
        p = port;
        dbn = dbName;
    }
}
