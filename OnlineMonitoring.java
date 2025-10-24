public class OnlineMonitoring {

    private QueuingSystem queue;

    public OnlineMonitoring(QueuingSystem queue) {
        this.queue = queue ;
    }

    public void displayCurrentQueueStatus() {
        System.out.println("Current queue number being served: " + queue.getCurrentNumber());
    }

    public void displayNextQueueNumber() {
        System.out.println("Next queue number to be served: " + (queue.getCurrentNumber() + 1));
    }
    
}
