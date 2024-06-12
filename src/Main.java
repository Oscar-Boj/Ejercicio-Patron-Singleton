public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        System.out.println("--PRIMERA INSTANCIA--");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto del Servidor: " + config.getPort());
        System.out.println("La contraseña es: " + config.getPassword());

        System.out.println();

        AppConfig config2 = AppConfig.getInstance();

        config2.setServerUrl("http://miapi.com");
        config2.setPort(8080);
        config2.setPassword("contraseña");

        System.out.println("--SEGUNDA INSTANCIA--");
        System.out.println("URL del Servidor: " + config2.getServerUrl());
        System.out.println("Puerto del Servidor: " + config2.getPort());
        System.out.println("La contraseña es: " + config2.getPassword());

        System.out.println();

        System.out.println("--PRIMERA INSTANCIA--");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto del Servidor: " + config.getPort());
        System.out.println("La contraseña es: " + config.getPassword());
    }
}