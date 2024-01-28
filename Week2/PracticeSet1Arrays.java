package Week2;

public class PracticeSet1Arrays {

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void q1(float[] arr){
        float sum = 0;
        for(float n : arr) {
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }

    public static void q2(float[] arr, float n){
        boolean isTrue = false;
        for(float x : arr){
            if(x == n) {
                isTrue = true;
                break;
            }
        }
        System.out.println("Contains " + n + ": " + isTrue);
    }

    public static void q3(float[] arr){
        float sum = 0;
        for(float x : arr) {
            sum += x;
        }
        System.out.println("Average: " + (sum / arr.length));
    }

    public static void q4(float[][] m1, float[][] m2){
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Matrix addition not possible");
            return;
        }
        
        float[][] result = new float[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q5(int[] myArray){
        System.out.println("Original Array:");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        reverse(myArray);

        System.out.println("Reversed Array:");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void q6(float[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        float max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }

    public static void q7(float[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        float min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
    }

    public static void q8(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }

    public static void main(String[] args) {
        float[] arr = {4.0f, 4.5f, 6.7f, 5.5f};
        int[] intArray = {1, 2, 3, 4, 5};
        float[][] m1 = {{1, 2, 3}, {2, 3, 4}, {4, 5, 6}};
        float[][] m2 = {{1, 2, 6}, {2, 3, 7}, {4, 5, 8}};

        q1(arr);
        q2(arr, 4.5f);
        q3(arr);
        q4(m1, m2);
        q5(intArray);
        q6(arr);
    }
}