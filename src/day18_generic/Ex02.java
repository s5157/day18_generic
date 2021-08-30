package day18_generic;


class Print02<T>{
	public void print(T a, T b) {
		System.out.println(a+","+b);
	}
}
public class Ex02 {

	public static void main(String[] args) {
		
		Print02<String> p = new Print02<>();
		p.print("안녕","반가워");
		Print02<Integer> pp = new Print02<>();
		pp.print(100, 200);
	}
}
