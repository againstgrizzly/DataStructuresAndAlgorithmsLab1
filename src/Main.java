//4737
//Lab 1
//2-6-17
//COP 3530

public class Main {

    public static void main(String[] args) {
        //Create CircularQueueArray object
        CircularQueueArray myQueue = new CircularQueueArray();

        //insert elements
        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");
        myQueue.enqueue("D");
        myQueue.enqueue("E");

        //remove elements
        myQueue.dequeue();
        myQueue.dequeue();

        //insert elements
        myQueue.enqueue("F");
        myQueue.enqueue("G");

        //remove elements
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
    }
}
