public class Cashier {

    private Queue<Customer> queue;
    private Customer currentCustumer;
    private int totalCustumerWaitTime, customersServed, totalItemsServed;

    Cashier () {
        queue = new ArrayQueue<Customer>();
        currentCustumer = null;
        totalCustumerWaitTime = 0;
        customersServed = 0;
        totalItemsServed = 0;
    }

    public void addCustomer(Customer c) {
        if (c == null) {
            throw new NullPointerException();
        }
        queue.enqueue(c);
    }

    public int getQueueSize() {
        return queue.size();
    }

    public void serveCustomers(int currentTime) {
        if (currentCustumer == null && getQueueSize() == 0) {
            return;
        }
        if (currentCustumer == null) {
            currentCustumer = queue.dequeue();
            totalCustumerWaitTime += currentTime - currentCustumer.getArrivalTime();
            customersServed++;
        }
        
        if (currentCustumer.getNumberOfItems() > 0) {
            currentCustumer.serve();
            totalItemsServed++;
        } else {
            totalItemsServed++;
            currentCustumer = null;
        }

    }

    public int getTotalCustomersServed() {
        return customersServed;
    }

    public int getTotalCustomerWaitTime() {
        return totalCustumerWaitTime;
    }

    public int getTotalItemsServed() {
        return totalItemsServed;
    }

    @Override
    public String toString() {
        return "The total number of customers served is " + customersServed + "\nThe average number of items per customer was " + totalItemsServed / customersServed + "\nThe average waiting time (in seconds) was " + totalCustumerWaitTime / customersServed;
    }
}
