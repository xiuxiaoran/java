import java.util.Scanner;
public class Student {
	public static void main(String[] args)
	{   
		char []sname= {'A','B','C'};
		int [][]score=new int[3][4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("�����"+(i+1)+"��ѧ���ɼ�");
		  for(int j=0;j<4;j++)
		  {
			  if(j==0)
			  {
				  System.out.print("�������ĳɼ�:");
				  score[i][j]=sc.nextInt();
			  }
			  if(j==1)
			  {
				  System.out.print("������ѧ�ɼ�:");
				  score[i][j]=sc.nextInt();
			  }
			  if(j==2)
			  {
				  System.out.print("����Ӣ��ɼ�:");
				  score[i][j]=sc.nextInt();
			  }
			  if(j==3)
			  {
				  System.out.print("�������γɼ�:");
				  score[i][j]=sc.nextInt();
			  }
		  }
		}
		System.out.println("����Ҫ��ѯѧ��������");
	    char name=sc.next().charAt(0);
	    switch(name)
	    {
	    case 'A':
	    	for(int j=0;j<4;j++)
	    	{
	    		if(j==0)
	    			System.out.println("���ĳɼ���"+score[0][j]+"");
	    		if(j==1)
	    			System.out.println("��ѧ�ɼ���"+score[0][j]+"");
	    		if(j==2)
	    			System.out.println("Ӣ��ɼ���"+score[0][j]+"");
	    		if(j==3)
	    			System.out.println("���γɼ���"+score[0][j]+"");
	    		
	    	}
	    	break;
	    	
	    case 'B':
	    	for(int j=0;j<4;j++)
	    	{
	    		if(j==0)
	    			System.out.println("���ĳɼ���"+score[0][j]+"");
	    		if(j==1)
	    			System.out.println("��ѧ�ɼ���"+score[0][j]+"");
	    		if(j==2)
	    			System.out.println("Ӣ��ɼ���"+score[0][j]+"");
	    		if(j==3)
	    			System.out.println("���γɼ���"+score[0][j]+"");
	    	}
	    	break;
	    case 'C':
	    	for(int j=0;j<4;j++)
	    	{
	    		if(j==0)
	    			System.out.println("���ĳɼ���"+score[0][j]+"");
	    		if(j==1)
	    			System.out.println("��ѧ�ɼ���"+score[0][j]+"");
	    		if(j==2)
	    			System.out.println("Ӣ��ɼ���"+score[0][j]+"");
	    		if(j==3)
	    			System.out.println("���γɼ���"+score[0][j]+"");
	    	}
	    	break;
	    		
	    }
	    System.out.println("�ɼ�ͳ��");
	    for(int j=0,count=0;j<4;j++)
	   {
	    if(j==0)
	    {  
	        System.out.print("���Ĳ���������Ϊ:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	System.out.println();
	    	 System.out.println("���Ĳ�������������"+count+"��");
	    	 count=0;
	    }
	    if(j==1)
	    {  
	        System.out.print("��ѧ����������Ϊ:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	 System.out.println();
	    	 System.out.println("��ѧ��������������"+count+"��");
	    	 count=0;
	    }
	    if(j==2)
	    {  
	        System.out.print("Ӣ�ﲻ��������Ϊ:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	 System.out.println();
	    	 System.out.println("Ӣ�ﲻ������������"+count+"��");
	    	 count=0;
	    }
	    if(j==3)
	    {  
	        System.out.print("���β���������Ϊ:");
	    	for(int i=0;i<3;i++)
	    		if(score[i][j]<60)
	    		{
	    			count++;
	    			System.out.print(sname[i]+"\t");
	    		}
	    	 System.out.println();
	    	 System.out.println("���β�������������"+count+"��");
	    	 count=0;
	    }
	  }
	    	    
		sc.close();
	}

}
