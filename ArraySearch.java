import java.util.Scanner;

public class ArraySearch {
    static void sortArray(int[] arr) {
        System.out.print("Sorted Array are: \t");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }

    static boolean searchArray(int arr[],int number){
        for(int z=0;z<arr.length;z++){
            if(arr[z] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String a[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the array size: ");
            int arraySize = sc.nextInt();
            int arr[] = new int[arraySize];
            for(int i=0;i<arraySize;i++) {
                System.out.print(String.format("Enter the %d element:", i+1));
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the number to search: ");
            int num = sc.nextInt();
            boolean isFound = searchArray(arr,num);
            if(isFound){
                System.out.println("Number Found");
            }
            else {
                System.out.println("Number not Found");
            }
            sortArray(arr);
        }catch (Exception e) {
            System.out.println("Exception Found!!!");
        }
    }
}