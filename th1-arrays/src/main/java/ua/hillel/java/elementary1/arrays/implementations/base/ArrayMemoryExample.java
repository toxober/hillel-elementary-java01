package ua.hillel.java.elementary1.arrays.implementations.base;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

public class ArrayMemoryExample {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        //
        System.out.println(VM.current().details());
        System.out.println("======================\n");
        System.out.println(ClassLayout.parseInstance(array).toPrintable());
        System.out.println(GraphLayout.parseInstance((Object) array).toFootprint());
//        System.out.println("======================");
//        LinkedList<Integer> ll = new LinkedList<>();
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            ll.add(i);
//            al.add(i);
//        }
//        PrintWriter pw = new PrintWriter(System.out);
//        pw.println(GraphLayout.parseInstance(al).toFootprint());
//        pw.println(GraphLayout.parseInstance(ll).toFootprint());
//        pw.close();
    }
}
