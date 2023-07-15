package HomeWork.HW_9_4;

import HomeWork.HW_9_4.LinkedArrays.GBLinkedList;

public class Main {
    public static void main(String[] args) {
//        GBlist<Number> gBlist = new GBArrayList<>();
//        gBlist.add(1);
//        gBlist.add(2);
//
//        gBlist.join(3).join(4).join(5);
//
//        System.out.println(gBlist);
//        System.out.println(gBlist.size());
//        gBlist.remove(2);
//        System.out.println(gBlist);
//        System.out.println(gBlist.size());
//        gBlist.update(1, 2.3223);
//        System.out.println(gBlist);
//        System.out.println(gBlist.size());
//        gBlist.get(12);

         GBLinkedList<String> gbLinkedList = new GBLinkedList<>();
         gbLinkedList.addFirst("abc");
         gbLinkedList.addFirst("cba");
        System.out.println("Size of gbLinkedList = " + gbLinkedList.size());
         gbLinkedList.addLast("xyz");
         gbLinkedList.addLast("zyx");
        System.out.println("------------------");
        System.out.println("Size of gbLinkedList = " + gbLinkedList.size());
        System.out.println();
        System.out.println("Element by index 2 = " + gbLinkedList.getElementByIndex(2));

//        for (String s : gbLinkedList) {
//            System.out.println(s);
//        }

//        Iterator <LinkedArrayIterator> iterator = gbLinkedList.reverseIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
