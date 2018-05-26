
public class Main {


    public static void main(String[] args) {

        int arr[] = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};

        Integer index = new Interpolation().search(arr,0,arr.length-1,1);
        System.out.println(index != null ? "Element found at index " + index : "Element not found.");
    }
}