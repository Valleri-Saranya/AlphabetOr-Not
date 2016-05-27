		
import java.util.Scanner;

public class AlphabetOrNot
{
public static void main(String args[])
{
char ch;
Scanner scan = new Scanner(System.in);
System.out.print("Enter a Character : ");
ch = scan.next().charAt(0);
 if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
 {
 System.out.println("Its an alphabet");
 }
 else
 {
 System.out.println(" Its not an alphabet");
 } 
}
}