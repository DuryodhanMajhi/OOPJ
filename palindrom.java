import java.util.Scanner;
public class palindrom{
public static void main(String duryo[]){
  Scanner d=new Scanner(System.in);
  System.out.println("Enter a any number ! ");
  int no=d.nextInt();
int temp=no; 
int rev=0,rem;
while(temp!=0){
  rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(no==rev){
System.out.println(no+" Is a palindrome number");
}
else{
System.out.println(no+" Is not palindrome number");
}
}
}

