import java.util.Scanner;
public class Bai1 {
public static void main(String[] args) {
	float a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap vao 2 so bat ki: ");
	a=sc.nextFloat();
	b=sc.nextFloat();
	System.out.println("Tong cua hai so la: "+(a+b));
	System.out.println("Hieu cua hai so la: "+(a-b));
	System.out.println("Tich cua hai so la: "+(a*b));
	System.out.println("Thuong cua hai so la: "+(a/b));
	System.out.println("Chia lay du cua hai so la: "+(a%b));
	if(a>b)System.out.println(+a +">"+b);
	else System.out.println(+a +"<"+b);
	
	

}
}