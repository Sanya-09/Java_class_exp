// Interface definition
interface EventHandler {
    void handleEvent();
    }
    public class EventDemo {
    // Method demonstrating local inner class
    public void registerEvent() {
    // Local inner class implementing EventHandler
    class LocalEventHandler implements EventHandler {
    public void handleEvent() {
    System.out.println("Event handled by local inner class");
    }
    }
    // Create and use local inner class
    EventHandler handler = new LocalEventHandler();
    handler.handleEvent();
    }
    public static void main(String[] args) {
    EventDemo demo = new EventDemo();
    // a. Using local inner class
    demo.registerEvent();
    // b. Using anonymous inner class
    EventHandler anonymousHandler = new EventHandler() {
    public void handleEvent() {
    System.out.println("Event handled by anonymous inner class");
    }
};
anonymousHandler.handleEvent();
}
}
