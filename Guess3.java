
import java.util.Scanner;
public class Guess3 {
	public static void main() {
		int i;
		int number=6;
		System.out.println("��������");
	   Scanner reader=new Scanner(System.in);
	   i=reader.nextInt();
	   while(i!=number) {
		   System.out.println("��������������");
		   i=reader.nextInt();
	   }
	   System.out.println("��ȷ");
	   reader.close();
	}

}
