import java.util.Scanner;
class StudentResult//SubClass
{
     int s1,s2,s3,s4,s5,s6,totMarks;
     float per;
     String result;
     void calculate()
     {
     totMarks = s1+s2+s3+s4+s5+s6;
     per=(float)totMarks/6;//TypeCasting
     if(per>=70&&per<=100)
     {
           result="Destinction";
     
     }
     else if(per>=60&&per<70)
     {
           result="FirstClass";
     }
     else if(per>=50&&per<60)
     {
          result="SecondClass";
     }
     else if(per>=35&&per<50)
     {
           result="ThirdClass";
     }
     else{
           result="Fail";
     }
 }
void getStudentResult()
{
    System.out.println("====StudentResult====");
    System.out.println("Total Marks:"+totMarks);
  System.out.println("percentage:"+per);
  System.out.println("Result:"+result);
 }
}
class SMainClass//MainClass
{
   public static void main(String[]args)
   {
       Scanner s = new Scanner(System.in);
       StudentResult sr = new StudentResult();
       System.out.println("Enter the marks of Sub1:");
    sr.s1=s.nextInt();
       System.out.println("Enter the marks of Sub2:");
    sr.s2=s.nextInt();
       System.out.println("Enter the marks of Sub3:");
    sr.s3=s.nextInt();
       System.out.println("Enter the marks of Sub4:");
    sr.s4=s.nextInt();
       System.out.println("Enter the marks of Sub5:");
    sr.s5=s.nextInt();
       System.out.println("Enter the marks of Sub6:");
    sr.s6=s.nextInt();
         sr.calculate();
         sr.getStudentResult();
     }
}     