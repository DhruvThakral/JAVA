import java.util.*;
class LPU{
    public static void main(String args[]){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l1.addFirst(234);
        l1.addLast(654);

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
    }
}