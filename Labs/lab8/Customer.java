import java.util.Random;

public class Customer {

    private int arrivalTime;
    private int inicialNumberOfItems;
    private int numberOfItems;
    private final int MAX_NUM_ITEMS = 50;

    Customer (int arrivalTime) {
        this.arrivalTime = arrivalTime;

        Random generator;
        generator = new Random();  
 
        this.numberOfItems = generator.nextInt(MAX_NUM_ITEMS-1)+1;
        this.inicialNumberOfItems = this.numberOfItems;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
    
    public int getInicialNumberOfItems() {
        return inicialNumberOfItems;
    }

    public void serve () {
        if (numberOfItems > 0) {
            this.numberOfItems--;
        }
    }

    public int getNumberOfServedItems() {
        return inicialNumberOfItems - numberOfItems;
    }
    
}
