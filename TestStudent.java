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
		 System.out.println("学号为"+sno);
		 System.out.println("姓名为"+sname);
		 System.out.println("性别为"+ssex);
		 System.out.println("年纪为"+sage);
		 System.out.println("专业为"+sdept); 
	 }
	 
	 
	
}
public class TestStudent {
	public static void main(String[] args)
	{
		Student stu1=new Student();
		stu1.setinfor(1, "xiu", '男', 18, "软件工程");
		stu1.getinfor();
	}
}
