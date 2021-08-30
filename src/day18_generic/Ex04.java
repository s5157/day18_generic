package day18_generic;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<StDTO> arr = new ArrayList<StDTO>();
		StDTO s = new StDTO();
		s.setName("홍길동");
		s.setStNum("학번123");
		
		arr.add(s);
		
		StDTO s1 = new StDTO();
		s1.setName("김개똥"); 
		s1.setStNum("학번222");
		
		arr.add(s1);
		
		System.out.println("arr.0 : " + arr.get(0).getName());
		System.out.println("s : " + s.getName());
		System.out.println("arr.0 : " + arr.get(0).getStNum());
		System.out.println("s1 : " + s1.getStNum());
		
		HashMap<String, StDTO> map = new HashMap<String, StDTO>();
		
		StDTO s01 = new StDTO();
		s01.setName("홍길순"); s01.setStNum("111"); 
		StDTO s02= new StDTO();
		s02.setName("홍길남"); s02.setStNum("222");
		
		map.put(s01.getStNum(), s01);
		map.put(s02.getStNum(), s02);
		
		System.out.println("s01객체 : "+ map.get("111"));
		//StDto dto = map.get("111");
		//System.out.println(dto.getName());
		System.out.println("s01학번 : "+ map.get("111").getStNum());
		System.out.println("s01이름 : "+ map.get("111").getName());
	}

}
