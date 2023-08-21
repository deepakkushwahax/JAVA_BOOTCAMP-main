package LinearSearch;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 25};
        int target = 18;
        System.out.println(linearSearching(arr, target,1,4));

    }
    static int linearSearching(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
