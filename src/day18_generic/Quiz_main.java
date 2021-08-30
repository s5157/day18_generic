package day18_generic;

import java.util.Scanner;

public class Quiz_main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		Quiz_Student st = new Quiz_Student();
		while(true) {
			System.out.println("1.김(학생관리) 2.홍(학생관리)...");
			num = input.nextInt();
			switch(num) {
			case 1 :
				st.display();
				break;
			case 2 :break;
			case 3 :System.out.println("프로그램 종료"); return;
			}
		}
	}

}
