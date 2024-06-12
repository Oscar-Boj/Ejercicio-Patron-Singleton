public class AppConfig {
    private static AppConfig instance;
    private String serverUrl;
    private int port;
    private String password;

    private AppConfig() {
        serverUrl = "https://www.google.com/?hl=es-es";
        port = 3306;
        password = "123456789";
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
