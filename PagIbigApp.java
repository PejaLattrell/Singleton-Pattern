import java.util.Scanner;

public class PagIbigApp {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        QueuingSystem queue = QueuingSystem.getInstance();
        

        Helpdesk desk1 = new Helpdesk("Helpdesk 1");
        Helpdesk desk2 = new Helpdesk("Helpdesk 2");
        Helpdesk desk3 = new Helpdesk("Helpdesk 3"); 
        OnlineMonitoring monitor = new OnlineMonitoring(queue); 
        
        System.out.println("Welcome to Pag-Ibig Office!");

        System.out.println("\nOptions:");
        System.out.println("1. Serve next at Desk 1");
        System.out.println("2. Serve next at Desk 2");
        System.out.println("3. Serve next at Desk 3");
        System.out.println("4. Reset Queue");
        System.out.println("5. Show Current Queuing Status");
        System.out.println("6. Exit");



        while (true) {
            
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    desk1.serveNextClient();
                    break;
                case 2:
                    desk2.serveNextClient();
                    break;
                case 3:
                    desk3.serveNextClient();
                    break;
                case 4:
                    System.out.print("Enter new starting number: ");
                    int newNumber = scan.nextInt();
                    queue.resetQueue(newNumber);
                    break;
                case 5:
                    monitor.displayCurrentQueueStatus();
                    monitor.displayNextQueueNumber();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }  
    }

}

    
