import java.util.Scanner;
class Ransome
{
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 System.out.print("RansomeNOte: ");
 String ransomenote=input.next();
 System.out.print("Magzine: ");
 String magazine=input.next();
 int t1[]=new int[ransomenote.length()];
 int t2[]=new int[magazine.length()];
 for(int i=0;i<ransomenote.length();i++)
 {
 t1[i]=ransomenote.charAt(i);
 }
 for(int i=0;i<magazine.length();i++)
 {
 t2[i]=magazine.charAt(i);
 }
 int len=ransomenote.length();
 int c=0;
 for(int i=0;i<ransomenote.length();i++)
 {
 for(int j=0;j<magazine.length();j++)
 {
 if(t1[i]==t2[j]) {
 c++;
break;
 }
 }
 }
 if(len==c)
 System.out.println("true");
 else
 System.out.println("false");
 }
}
