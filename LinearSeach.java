public class LinearSeach {
    public static void main(String[] args) {
        int[] array = { 34, 234, 432, 42, };
        int target = 234;
        int value = searchNum(array, target);
        System.out.println(value);

    }

    static int searchNum(int[] array, int target) {

        if (array.length == 0) {
            return -1;
        }
        for (int element : array) {
            int num = element;

            if (num == target) {
                return element;
            }

        }
        return -1;
    }
}
