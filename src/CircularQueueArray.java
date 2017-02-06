//4737
//Lab 1
//2-6-17
//COP 3530

public class CircularQueueArray {

    private final int MAXQUEUE = 5; //size of queue
    private Object items[]; //array to act as queue
    private int front;//front of queue
    private int rear;//rear of queue

    public CircularQueueArray() {
        items = new Object[MAXQUEUE];
        rear = 0;
        front = 0;
    }//end constructor

    //insert element into queue
    public void enqueue(Object x) {

        //if queue is full throw runtime exception
        if (full()) {
            throw new RuntimeException();
        }

        /*
        If rear isn't at last index, insert element
        and move to next index

        else
            if rear is at last index, insert element
            and move rear to beginnning (index 0)
            of queue
         */
        if (rear != items.length - 1) {
            items[rear] = x;
            rear++;
        } else {
            items[rear] = x;
            rear = 0;
        }

        print();//Print information on queue
    }

    //If queue is full, return true
    //If queue is not full, return false
    public boolean full() {

        //Loop through queue
        //If an element is null
        //It can't be full
        //Else return true;
        for (Object x : items) {
            if (x == null) {
                return false;
            }
        }
        return true;
    }

    //remove element from queue
    public Object dequeue() {

        //if removing from empty queue throw runtime exception
        if (empty()) {
            throw new RuntimeException();
        }

        Object pop;
        pop = items[front];
        items[front] = null;

        //If front not at last index, move to next index
        //If front at last index, move to index 0
        if (front != items.length - 1) {
            front++;
        } else {
            front = 0;
        }
        print();//Print information on queue

        //Return object at front of queue
        return pop;
    }

    //If queue is empty, return true
    //If queue isn't empty, return false
    public boolean empty() {

        //Loop through array
        //If an element isn't null
        //It can't be empty
        //Retun false
        //else return true
        for (Object x : items) {
            if (x != null) {
                return false;
            }
        }
        return true;
    }


    //Returns number of elements
    //in the queue
    public int size() {
        int size = MAXQUEUE; //max size

        //for every null element, subtract 1
        //from size
        //return size
        for(Object obj : items){
            if(obj == null){
                size--;
            }
        }
        return size;
    }

    //Prints
    public void print() {

        //Prints each index
        for (int i = 0; i < items.length; i++) {
            System.out.print(i);
        }
        System.out.println();

        //Prints the element at every index
        for (Object object : items) {
            if (object == null) {
                System.out.print(" ");
            } else {
                System.out.print(object);
            }
        }
        System.out.println();
        //Print index of front and rear
        System.out.println("Front: " + front);
        System.out.println("Rear: " + rear);

        //Print size of the queue
        System.out.println("Size: " + size());

        //Print if empty (true or false)
        System.out.println("Empty: " + empty());

        //Print if full (true or false)
        System.out.println("Full: " + full());

        System.out.println();
    }


}
