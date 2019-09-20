package main.java;
import java.util.Scanner;

public class Demo1 {
	//n个宝箱  m个钥匙
	//
	public static void main(String[] args) {
		int n=0;  //宝箱个数
		int m=0;  //钥匙个数
		int y=0;  //循环
		int sum=0;  //计数
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[] ns=new int[n];
		int[] ms=new int[m];
		for (int i = 0; i < ns.length; i++) {
			ns[i]=sc.nextInt();
		}
		for (int i = 0; i < ms.length; i++) {
			ms[i]=sc.nextInt();
		}
		for (int i = 0; i < ns.length; i++) {
			if((ns[i]+ms[y])/2==1) {
				sum++;
			}
			y++;
		}
		System.out.println(sum);
	}
}
