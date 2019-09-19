import java.util.*;
public class Dome4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer course=new StringBuffer();
		System.out.println("请输入课程信息");
		Scanner input=new Scanner(System.in);
		String s;
		while(!(s=input.next()).equals("#")) {
			course.append(s);
			course.append("\n");
		}
		System.out.println("你输入的课程是:\n"+course);
	}

}
