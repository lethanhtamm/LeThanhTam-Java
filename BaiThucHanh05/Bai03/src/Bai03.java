import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Bai03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so luong so nguyen: ");
		int n=sc.nextInt();
		Queue<Integer> queue=new LinkedList();
		System.out.println("Nhap cac so nguyen vao Queue: ");
		for(int i=0;i<n;i++) {
			int number=sc.nextInt();
			queue.add(number);
		}
		System.out.println("nhap so luong phan tu can lay ra khoi Queue: ");
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			if(!queue.isEmpty()) {
				int temp=queue.poll();
				System.out.println(temp);
			}else {
				System.out.println("Queue da rong!");
				break;
			}
		}
		
	}
}
