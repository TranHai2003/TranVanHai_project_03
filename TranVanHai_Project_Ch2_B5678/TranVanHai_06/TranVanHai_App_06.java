package TranVanHai_06;

import java.util.Scanner;

public class TranVanHai_App_06 {
    public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen duong : ");
		int a = d.nextInt();
		int b = 1;
		int i = 1;
		do {
			b = b*i;
			i++;
		}while(i<=a);
		
		System.out.println("Giai thua cua "+a +" la : "+b);
	}
}