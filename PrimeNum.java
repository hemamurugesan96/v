import java.io.*;
import java.util.Scanner;
class PrimeNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=0,count=0;
for(i=0;i<num;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==0)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not a Prime Number");
}
}
}
