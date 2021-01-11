public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int index1 = 0;
        int index2 = arr.length/2;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i ++){
            if (i % 2 == 0){
                arr2[i] = arr[index1];
                index1 ++;
            }
            else {
                arr2[i] = arr[index2];
                index2 ++;
            }
        }
        return arr2;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for (int i = 0; i < arr.length; i ++){
            int x = arr[i];
            int newIndex = (int)(Math.random() * arr.length);
            arr[i] = arr[newIndex];
            arr[newIndex] = x;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] arr2 = perfectShuffle(arr);
        for (int i : arr2){
            System.out.print(i + " ");
        }

        System.out.println();
        
        int[] arr3 = selectionShuffle(arr);
        for (int i : arr3){
            System.out.print(i + " ");
        }
    }
}
