import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size & then the elements:");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter B:");
        int b = sc.nextInt();
        int answer=0;
        double multiple = Math.pow(10, array.length-1);
        for(int i=0;i<size;i++){
            answer+=(array[i]*multiple);
            multiple/=10;
        }
        System.out.println(answer%b);
    }
}