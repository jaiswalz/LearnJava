package JavaLearning.com.java.learn;


public class BinarySearch {
    /**
     * this method is used for binary search
     * @param array
     * @param element
     * @return
     */
    public int binarySearch(int array[], int element) {
        int mid = 0;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (array[mid] == element)
                return mid;
            if (array[mid] < element)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = {3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int element = 5;
        BinarySearch binarySearch = new BinarySearch();

        int result = binarySearch.binarySearch(array, element);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index" + element);
    }
}
