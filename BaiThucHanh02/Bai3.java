import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String hovaten;
		double namsinh;
		System.out.println("Nhap vao ho va ten: ");
		hovaten=sc.nextLine();
		System.out.println("Nhap vao nam sinh: ");
		namsinh=sc.nextDouble();
		double tuoi=2023-namsinh;
		if(tuoi<16)System.out.println("Ban "+hovaten +" "+ "o do tuoi vi thanh nien");
		if(tuoi>16 && tuoi<=18) System.out.println("Ban "+hovaten +" "+ "o do tuoi truong thanh");
		if(tuoi>18) System.out.println("Ban "+hovaten +" "+ "da gia!");
	}
}