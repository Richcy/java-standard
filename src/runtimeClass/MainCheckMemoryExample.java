package runtimeClass;

public class MainCheckMemoryExample {
    public static void main(String[] args) {
        // print when the program starts
        System.out.println("Program starting...");

        // print the number of free bytes
        System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory());

        System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory());

        System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory());
    }
}
