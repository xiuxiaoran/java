import java.util.Scanner;
public class Student {
	public static void main(String[] args)
	{   
		char []sname= {'A','B','C'};
		int [][]score=new int[3][4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("输入第"+(i+1)+"个学生成绩");
		  for(int j=0;j<4;j++)
		  {
			  if(j==0)
			  {
				  System.out.print("输入语文成绩:");
				  score[i][j]=sc.nextInt();
			  }
			  if(j==1)
			  {
				  System.out.print("输入数学成绩:");
				  score[i][j]=sc.nextInt();
			  }
			  if(j==2)
			  {
				  System.out.print("输入英语成绩:");
				  score[i][j]=sc.nextInt();
			  }
			  if(j==3)
			  {
				  System.out.print("输入政治成绩:");
				  score[i][j]=sc.nextInt();
			  }
		  }
		}
		System.out.println("输入要查询学生的姓名");
	    char name=sc.next().charAt(0);
	    switch(name)
	    {
	    case 'A':
	    	for(int j=0;j<4;j++)
	    	{
	    		if(j==0)
	    			System.out.println("语文成绩是"+score[0][j]+"");
	    		if(j==1)
	    			System.out.println("数学成绩是"+score[0][j]+"");
	    		if(j==2)
	    			System.out.println("英语成绩是"+score[0][j]+"");
	    		if(j==3)
	    			System.out.println("政治成绩是"+score[0][j]+"");
	    		
	    	}
	    	break;
	    	
	    case 'B':
	    	for(int j=0;j<4;j++)
	    	{
	    		if(j==0)
	    			System.out.println("语文成绩是"+score[0][j]+"");
	    		if(j==1)
	    			System.out.println("数学成绩是"+score[0][j]+"");
	    		if(j==2)
	    			System.out.println("英语成绩是"+score[0][j]+"");
	    		if(j==3)
	    			System.out.println("政治成绩是"+score[0][j]+"");
	    	}
	    	break;
	    case 'C':
	    	for(int j=0;j<4;j++)
	    	{
	    		if(j==0)
	    			System.out.println("语文成绩是"+score[0][j]+"");
	    		if(j==1)
	    			System.out.println("数学成绩是"+score[0][j]+"");
	    		if(j==2)
	    			System.out.println("英语成绩是"+score[0][j]+"");
	    		if(j==3)
	    			System.out.println("政治成绩是"+score[0][j]+"");
	    	}
	    	break;
	    		
	    }
	    System.out.println("成绩统计");
	    for(int j=0,count=0;j<4;j++)
	   {
	    if(j==0)
	    {  
	        System.out.print("语文不及格名单为:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	System.out.println();
	    	 System.out.println("语文不及格人数共有"+count+"人");
	    	 count=0;
	    }
	    if(j==1)
	    {  
	        System.out.print("数学不及格名单为:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	 System.out.println();
	    	 System.out.println("数学不及格人数共有"+count+"人");
	    	 count=0;
	    }
	    if(j==2)
	    {  
	        System.out.print("英语不及格名单为:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	 System.out.println();
	    	 System.out.println("英语不及格人数共有"+count+"人");
	    	 count=0;
	    }
	    if(j==3)
	    {  
	        System.out.print("政治不及格名单为:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	 System.out.println();
	    	 System.out.println("政治不及格人数共有"+count+"人");
	    	 count=0;
	    }
	  }
	    	    
		sc.close();
	}

}
