
import java.util.Scanner;
public class Guess3 {
	public static void main() {
		int i;
		int number=6;
		System.out.println("输入数字");
	   Scanner reader=new Scanner(System.in);
	   i=reader.nextInt();
	   while(i!=number) {
		   System.out.println("错误，请重新输入");
		   i=reader.nextInt();
	   }
	   System.out.println("正确");
	   reader.close();
	}

}
