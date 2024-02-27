import java.util.Scanner;

class tech assgn3{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter two numbers: ");

int n1=sc.nextInt();

int n2=sc.nextInt();

boolean res1=lastDigit(n1,n2);

System.out.println(res1);

System.out.println("Enter a number: ");

int n3=sc.nextInt();

boolean res2-Even(n3); System.out.println(res2);

System.out.println("Enter two numbers: ");

int n4=sc.nextInt();

int n5=sc.nextInt();

int res3=sumDouble(n4,n5);

System.out.println(res3);

System.out.println("Enter two numbers: ");

int n6=sc.nextInt(); int n7=sc.nextInt();

boolean res4=makes10(n6,n7); System.out.println(res4);

System.out.println("Enter two numbers: ");

int n8=sc.nextInt();

int n9=sc.nextInt();

boolean res5=in1020(n8,n9), System.out.println(res5);

static boolean lastDigit(int a, int b){

boolean flag=(a%10==b%10)?true:false,

return flag,

)

static boolean Even(int a)(

boolean flag=(a%2==0)?true false;

return flag;

static int sumDouble(int a, int b){ int res=(a==b)?(2*(a+b)):(a+b);

return res;

}

static boolean makes 10(int a, int b){

boolean flag=((a==10)||(b==10)||((a+b)==10))?true false;

return flag,

static boolean in 1020 (int a, int b){

boolean flag=((a>=10&&a<=20)||((b>=10)&&(b<=20)))?true false;

return flag: