public class Main {
    public static void main(String[] args) {
        int[] array = {14, 19, 8, 7, 48, 16, 63, 27};
        int n = array.length;
        for (int j = 0; j < n; j++) {
           int  i=j;
            while ((i<n ) && (array[i+1] >array[i])) {
                int tmp = array[i+1];
                array[i+1] = array[i];
                array[i] = tmp;
                i++;
            }

        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}