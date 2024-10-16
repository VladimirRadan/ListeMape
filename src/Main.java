import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(50);

        Collections.sort(list);

        //list.remove(4);

//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (int a : list){
            System.out.println(a);
        }

        List list1 = new ArrayList(Arrays.asList(1,1,32));
        list1.add("Pera");
        list1.add(1221);
        list1.add(3443.454);
        list1.add(true);

//        for (Object o: list1){
//            System.out.println(o);
//        }

        LinkedList linkedList = new LinkedList(list1); // 1 > <2 > <3>


        SortedSet<Integer> set = new TreeSet<>(list);

        System.out.println(set);

        list.clear();
        if (list.isEmpty()){
            System.out.println("Prazan");
        }else {
            System.out.println("Lista nije prazna");
        }



    }
}