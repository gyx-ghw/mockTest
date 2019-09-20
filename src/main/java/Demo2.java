package main.java;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//n个办公室
		//m个搬运工
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int m=sc.nextInt();
		int[] w=new int[n];
		for (int i = 0; i < w.length; i++) {
			w[i]=sc.nextInt();
		}
		for (int i = 0; i < w.length; i++) {
			System.out.print(w[i]+" ");
		}
		
		
	}
}
