import java.util.Scanner;

public class SmallestValue{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int smallest=input.nextInt();
for(int i=2;i<=n;i++){
int num=input.nextInt();
if(num<smallest)
smallest=num;
}
System.out.println("Smallest="+smallest);
}
}
