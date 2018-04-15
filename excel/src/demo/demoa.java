package demo;

import java.util.Scanner;

public class demoa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean matches2 = false;
		while (!matches2) {
			Scanner input = new Scanner(System.in);
			System.out.print("输入密码(以字母开头8~16位)");
			String passWord = input.next();
			String str = "^([A-Za-z]{4,10}|[\u4E00-\u9FA5]{2,5})$";
			
			if( matches2 = passWord.matches(str)){
				System.out.println("成功");
				matches2 = true;
			}
		}
		
		
	}

}
