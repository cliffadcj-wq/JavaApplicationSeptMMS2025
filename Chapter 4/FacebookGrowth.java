public class FacebookGrowth{
public static void main(String[] args){
double users=1_000_000_000;
int months=0;
while(users<1_500_000_000){
users*=1.04;
months++;
}
System.out.println(months);
}
}
