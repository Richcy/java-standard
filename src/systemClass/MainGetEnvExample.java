package systemClass;

public class MainGetEnvExample {
    public static void main(String[] args) {
        System.out.println("environment variable PATH: ");
        System.out.println(System.getenv("PATH"));

        System.out.println("environment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));

        System.out.println("environment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));

    }
}
