import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, }, { 4, 5, 6, }, { 7, 8, 9, },
        };
        int target = 1;
        System.out.println(Arrays.toString(sortedMatrix(matrix, target)));

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cEnd + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;

            } else {
                cEnd = mid - 1;

            }

        }

        return new int[] { -1, -1 };

    }

    static int[] sortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rstart = 0;
        int rEnd = rows - 1;
        int cmid = cols / 2;

        // run the loop till 2 rows are remaining

        while (rstart < (rEnd - 1)) { // while this is true it will have more then 2 rows
            int mid = rstart + (rEnd - rstart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[] { mid, cmid };
            } else if (matrix[mid][cmid] < target) {
                rstart = mid;

            } else {
                rEnd = mid;
            }

        }
        // now we have two rows

        // check weather the target is in the col of 2 rows

        if (matrix[rstart][cmid] == target) {
            return new int[] { rstart, cmid };

        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[] { rstart + 1, cmid };

        }

        // search in 1st half
        if (target <= matrix[rstart][cmid - 1]) {
            return binarySearch(matrix, rstart, 0, cmid - 1, target);
        }
        // search in 2nd half
        if (target <= matrix[rstart][cmid + 1]) {
            return binarySearch(matrix, rstart, cmid + 1, cols - 1, target);
        }

        // search in 3rd half

        if (target <= matrix[rstart + 1][cmid - 1]) {
            return binarySearch(matrix, rstart + 1, 0, cmid - 1, target);

        } else { // serach in 4th half
            return binarySearch(matrix, rstart, cmid + 1, cols - 1, target);
        }
    }

}
