import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your String :");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       String newStr="";
        for(int i=str.length()-1; i>=0; i--){
            char ch=str.charAt(i);
            newStr=newStr+ch;
        }
        if(newStr.equals(str)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
