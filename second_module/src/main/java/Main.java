public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }

        System.out.println(SearchEngine.searchBinary(arr, 401, 300, 500));
    }
}
