public class Helpdesk {

    private String deskName;
    private QueuingSystem queue;

    public Helpdesk(String deskName) {
        this.deskName = deskName;
        this.queue = QueuingSystem.getInstance();
    } 

    public void serveNextClient() {
        int nextNumber = queue.getNextNumber();
        System.out.println(deskName + " is now serving queue number: " + nextNumber);
    }

    

    
}
