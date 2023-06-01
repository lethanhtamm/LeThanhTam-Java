import java.util.Scanner;
import java.util.Stack;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so luong so nguyen: ");
		int n=sc.nextInt();
		Stack<Integer> stack=new Stack<>();
		System.out.println("Nhap cac so tu nhien vao Stack: ");
		for(int i=0;i<n;i++) {
			int number=sc.nextInt();
			stack.push(number);
		}
		System.out.println("nhap so luong phan tu can lay ra khoi Stack: ");
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			if(!stack.isEmpty()) {
				int temp=stack.pop();
				System.out.println(temp);
			}else {
				System.out.println("stack da rong!");
				break;
			}
		}
	}
}
