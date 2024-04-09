import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue pg = new PriorityQueue();
        //Default size 11
        //Priority according to default natural sorting order

        PriorityQueue pg1 = new PriorityQueue(20);

//        PriorityQueue pg2 = new PriorityQueue(20,Comparator c);

        SortedSet s = new TreeSet();
        PriorityQueue pg3 = new PriorityQueue(s);

        List l = new ArrayList();
        PriorityQueue pg4 = new PriorityQueue(l);

        //Methods

    }
}
