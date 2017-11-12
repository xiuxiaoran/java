public class Prefer{
    public static void main(String args[]){
    int a,a1,a2,a3,a4;
    a=4860;
    a1=a/1000;
    a2=(a-1000*a1)/100;
    a3=(a-1000*a1-100*a2)/10;
    a4=a-1000*a1-100*a2-a3*10;
    System.out.println("a1="+a1);
    System.out.println("a2="+a2);
    System.out.println("a3="+a3);
    System.out.println("a4="+a4);
}
}
    