public class QueuingSystem {
    
    private static QueuingSystem instance;
    private int currentNumber;

    private QueuingSystem(){
        currentNumber = 0;
    }

    //
    public static synchronized QueuingSystem getInstance(){
        if (instance == null){
            instance = new QueuingSystem();
        }
        return instance;
    }


    // Method to get the next number in the queue
    public synchronized int getNextNumber(){
        currentNumber++;
        return currentNumber;
    }

    public synchronized int getCurrentNumber(){
        return currentNumber;
    }


    public synchronized void resetQueue(int newNumber){
        currentNumber = newNumber;
        System.out.println("Queue has been reset to: " + currentNumber);
    }

    public synchronized void onlineMonitoring(){
        System.out.println("Current Numbers in Queue: " + currentNumber);
    }

    // Display current number in queue
    public synchronized void displayCurrentNumber(){
        System.out.print(currentNumber + " ");
    }






}
