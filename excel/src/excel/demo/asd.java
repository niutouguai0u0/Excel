package excel.demo;

import java.util.Scanner;

public class asd {
	public static void main(String[] args) {
		//开始时间
		long start = System.currentTimeMillis();
		System.out.println("输入一个数字");
		Scanner input = new Scanner(System.in);
		String next = input.next();
		//结束时间
		long finish = System.currentTimeMillis();
		long sum=finish-start;
		
		if(sum<180000){
			System.out.println("在三分钟内"+sum);
		}else{
			System.out.println("没在三分钟内"+sum);
		}
		
	}
}	
