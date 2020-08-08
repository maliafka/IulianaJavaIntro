package j4;

public class Main {

    public static void main(String[] args) {
        int i,sum=0,temp;
        int n=1221;

        temp=n;
        while(n>0){
            i=n%10;
            sum=(sum*10)+i;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

