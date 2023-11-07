public class Connection {
    private static final int MAX_CONNECTION_COUNT = 10;
    private static int connectionCount = 0;

    private String databaseUrl;
    private String userName;
    private String password;

    private Connection(String databaseUrl, String userName, String password)
 
{
        this.databaseUrl = databaseUrl;
        this.userName = userName;
        this.password = password;

        connectionCount++;
    }

    public static Connection createConnection(String databaseUrl, String userName, String password) {
        if (connectionCount >= MAX_CONNECTION_COUNT) {
            throw new RuntimeException("Max connection count reached");
        }

        return new Connection(databaseUrl, userName, password);
    }

    public void close() {
        connectionCount--;

        System.gc(); // Explicitly garbage collect the connection object
    }

    // Getters and setters for the databaseUrl, userName, and password attributes
}public class Connection {
    
}
