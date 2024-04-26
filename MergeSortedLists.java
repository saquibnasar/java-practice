import java.util.ArrayList;

public class MergeSortedLists {
    public static void main(String[] args) {
        int[] list1 = { 1, 2, 4 };
        int[] list2 = { 1, 3, 4 };

        marge(list1, list2, 0);
        System.out.println(list);

    }

    static ArrayList<Integer> list = new ArrayList<>(6);

    static void marge(int[] list1, int[] list2, int count) {

        if (list1.length == count && list2.length == count) {
            return;
        }
        if (list1[count] <= list2[count]) {
            list.add(list1[count]);
            list.add(list2[count]);
        } else {
            list.add(list2[count]);
            list.add(list1[count]);

        }

        marge(list1, list2, count + 1);
    }

}
