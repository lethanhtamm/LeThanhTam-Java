import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UseMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("Nhap vao so luong phan tu: ");
		int n=sc.nextInt();
		double []a=new double [n];
		System.out.println("Nhap cac phan tu: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
		}
		Map<Double, Integer> data =new HashMap<>();
		for(double num: a) {
			if(data.containsKey(num)) {
				data.put(num, data.get(num)+1);
			}else {
				data.put(num, 1);
			}
		}
		System.out.println("Phan tu xuat hien dung mot lan trong mang la: ");
		for(Map.Entry<Double, Integer> number : data.entrySet()){
			if(number.getValue()==1) {
				System.out.print(number.getKey()+" ");
			}
		}
	}
}
