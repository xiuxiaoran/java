 class Student
{ 
	 int sno;
	 String sname;
	 char ssex;
	 int sage;
	 String sdept;
	 void setinfor(int num,String name,char sex,int age,String s)
	 {
		 sno=num;
		 sname=name;
		 ssex=sex;
		 sage=age;
		 sdept=s; 
	 }
	 void getinfor()
	 {
		 System.out.println("ѧ��Ϊ"+sno);
		 System.out.println("����Ϊ"+sname);
		 System.out.println("�Ա�Ϊ"+ssex);
		 System.out.println("���Ϊ"+sage);
		 System.out.println("רҵΪ"+sdept); 
	 }
	 
	 
	
}
public class TestStudent {
	public static void main(String[] args)
	{
		Student stu1=new Student();
		stu1.setinfor(1, "xiu", '��', 18, "�������");
		stu1.getinfor();
	}
}
