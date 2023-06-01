import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Object> test=new ArrayList<>();
		System.out.println("Nhap vao mot so nguyen: ");
		int a=sc.nextInt();
		test.add(a);
		System.out.println("Nhap vao mot so thuc: ");
		double b=sc.nextDouble();
		test.add(b);
		System.out.println("Nhap vao mot gia tri boolean: ");
		boolean c=sc.nextBoolean();
		test.add(c);
		sc.nextLine();
		System.out.println("Nhap vao mot chuoi: ");
		String d=sc.nextLine();
		test.add(d);
		System.out.println("in ra man hinh:");
		for(Object temp: test) {
			System.out.println(temp);
		}
		
	}
}
