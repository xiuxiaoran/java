public class Area{
     public static void area(int a,int b)
      {  int s1=a*b;
         System.out.println("�������Ϊ"+s1);
      }
     public static int area(int a)
      {
        return a*a;
      }
     public static double area(double a)
      {
        return 3.14*a*a;
      }
     public static void main(String[] args)
{    
area(3,4);
 
   int s2=area(3);
System.out.println("���������"+s2);
       double s3=area(3.0);
System.out.println("Բ�����"+s3);
      
}
}