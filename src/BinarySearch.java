public class BinarySearch {
    public static int binrarySearch(int[] array, int low, int high, int data){
        int mid;
        if (high >= low){
            mid = (high + low) / 2;
            if (data == array[mid]){
                return mid;
            }else if (data > array[mid]){
                return binrarySearch(array, mid + 1, high, data);
            } else {
                return binrarySearch(array, low,high -1, data);
            }
        }
        return -1;
    }
}
