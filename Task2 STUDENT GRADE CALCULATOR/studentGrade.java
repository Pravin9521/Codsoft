import java.util.*;
public class studentGrade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject : ");
        int num = sc.nextInt();
        float marks=0;
        float Tmarks=num*100;

        for (int i=0;i<num;i++){
            System.out.println("Enter the "+(i+1)+" subject marks(out of 100) : ");
            marks+=sc.nextFloat();
        }
        float percentage=(marks/Tmarks)*100;
        System.out.println("Marks obtained are "+marks+" Out of "+Tmarks);
        System.out.println("Corresponding percentage : "+percentage);

        if(percentage<0 || percentage>100 ){
            System.out.print("Something went Wrong");
        }
        else if(percentage<33){
            System.out.print("F grade");
        }
        else if(percentage<55){
            System.out.print("E grade");
        }
        else if(percentage<65){
            System.out.print("D grade");
        }
        else if(percentage<75){
            System.out.print("C grade");
        }
        else if(percentage<85){
            System.out.print("B grade");
        }
        else if(percentage<95){
            System.out.print("A grade");
        }else if(percentage<=100){
            System.out.print("A+ grade");
        }
        }
    }

