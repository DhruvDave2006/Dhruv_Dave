import java.util.Scanner;
public class SearchLinear{
    public static void main(String args[]){

        int []data = new int[10];
        data[0] = 2;
        data[1] = 5;
        data[2] = 6;
        data[3] = 9;
        data[4] = 8;
        data[5] = 4;
        data[6] = 3;
        data[7] = 7;
        data[8] = 1;
        data[9] = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        boolean found = false;
        for(int i =0; i<data.length; i++){

            if(data[i]==n){
                System.out.print("Found at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }


    }
}