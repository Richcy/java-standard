package runtimeClass;

public class MainAvailableProcessorExample {
    public static void main(String[] args) {
        // print a normal message
        System.out.println("Available Processors: ");

        // check the number of processors available
        System.out.println(""+Runtime.getRuntime().availableProcessors());
    }

}
