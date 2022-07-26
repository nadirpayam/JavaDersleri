package Polymorphism;

public class ConsolLogger extends BaseLogger{
    public void Log(String message) {
    	System.out.println("logged to console: " + message);
    }
}
