import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Truong truong1=new Truong("HUMG","Co Nhue","B");
		SinhVien sv1=new SinhVien("A",14,"Nam","M1","IT",truong1);
		System.out.println(sv1);
		
	}
}
