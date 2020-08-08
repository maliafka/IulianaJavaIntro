package j3;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=s.nextInt();
        int m=n, max =0, r;
        while(m!=0){
            r=m%10;
            if(r>max)
                max=r;
            m=m/10;
        }
        System.out.println( "Max ="+ max + " in Number: "+ n);
        }
        }

