import java.util.*;
public class Dome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串str1:");
		String str1=input.next();
		System.out.print("请输入字符串str2:");
		String str2=input.next();
		String a=str1.substring(0,3);
		String b=str2.substring(0,3);
		if(a.equals(b)) {
			System.out.print("两个子串相同");
		}
		else {
			System.out.print("两个子串并不相同");
		}
	}

}
