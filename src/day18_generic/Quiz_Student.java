package day18_generic;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_Student {
	private ArrayList<Quiz_StudentDTO> list;
	private Scanner input;
	private String stNum;
	private String name;
	private String addr;
	private int age;
	public Quiz_Student() {
		list = new ArrayList<Quiz_StudentDTO>();
		input = new Scanner(System.in);
	}
	public void display() {
		int num;
		while(true) {
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5.전체보기 6.나가기");
			num = input.nextInt();
			switch(num) {
			
			case 1:
				Quiz_StudentDTO dto = new Quiz_StudentDTO();
				boolean flag = true;
				if(list.size() !=0) {
				while(flag) {
				System.out.println("학번");
				dto.setStNum(input.next());
				
				for(int i=0; i<list.size(); i++) {
					Quiz_StudentDTO d = list.get(i);
					if(d.getStNum().equals(dto.getStNum())) {
						System.out.println("동일한 학번이 존재합니다.");
						System.out.println("다시 학번을 입력하세요");
						break;
					}
					if(i == list.size()-1) {
						flag = false;
					}
				}
				}
				}
				
				System.out.println("이름");
				name = input.next();
				dto.setName(name);
				
				System.out.println("주소");
				dto.setAddr(input.next());
				
				System.out.println("나이");
				dto.setAge(input.nextInt());
				
				System.out.println("저장 되었습니다");
				
				list.add(dto);
				
				break;
			case 2:
				System.out.println("검색 학번 입력");
				stNum = input.next();
				
				
				break;
			case 3:break;
			case 4:break;
			case 5:
				System.out.println("--- 모든 정보 보기 ---");
				for(int i = 0; i<list.size();i++) {
					
					System.out.println("학번 : "+list.get(i).getStNum());
					System.out.println("이름 : "+list.get(i).getName());
					System.out.println("주소 : "+list.get(i).getAddr());
					System.out.println("나이 : "+list.get(i).getAge());
					System.out.println("------------------");
				}
				
				break;
			case 6:return;
			
			}
		}
	}

}
