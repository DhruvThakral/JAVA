import java.util.*;
class LPU{
    public static void main(String args[]){
        ArrayDeque<Integer> l1 = new ArrayDeque<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l1.addFirst(975);
        l1.addLast(3442);

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
    }
}