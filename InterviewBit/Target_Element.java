import java.util.Scanner;

public class Target_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("found = "+ i);
                
            }
        }
        System.out.println(-1);
    }
}
