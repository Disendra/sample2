import java.util.Scanner;
class CheckBranch //SubClass
{
boolean k=false;
boolean verify(String br)
{
switch(br)
{
case "CSE":k=true;
break;
case "ECE":k=true;
break;
case "EEE":k=true;
break;
}//end of switch
return k;
}
}
class StudentResult //SubClass
{
String result;
float per;
void calculate(int totMarks,boolean p)
{
per = (float)totMarks/6;
if(p)
{
result="Fail";
}
else if(per>=70 && per<=100)
{
result="destinction";
}
else if(per>=60 && per<70)
{
result="firstClass";
}
else if(per>=50 && per<60)
{
result="secondClass";
}
else if(per>=35 && per<50)
{
result="ThirdClass";
}
else{
result="Fail";
}
}
void getStudentResult()
{
System.out.println("Per:"+per);
System.out.println("Result:"+result);
}
}
class DemoMethods2 //MainClass 
{
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the Student Name:");
String name = s.nextLine();
System.out.println("Enter the Student Branch:");
String branch = s.nextLine().toUpperCase();
CheckBranch cb = new CheckBranch();
 boolean z=cb.verify(branch);
if(z)
{
System.out.println("Enter the Student rollNo..");
String rollNo = s.nextLine();
if(rollNo.length()==10)//Nested if or Inner if
{
System.out.println("====Enter 6 Sub marks===");
int i=1,totMarks=0;
boolean p=false;
while(i<=6)
{
System.out.println("Enter the marks of sub"+i);
int sub = s.nextInt();
i++;
if(sub<0 || sub>100)
{
System.out.println("Invalid marks...");
i--;
continue;//skip the below lines within the loop
}
if(sub>=0 && sub<=34)
{
p=true;
}
totMarks = totMarks+sub;
}//end of loop
System.out.println("stu Name:"+name);
 System.out.println("Stu Branch:"+branch);
 System.out.println("Stu RollNo:"+rollNo);
 System.out.println("TotMarks:"+totMarks);
StudentResult sr = new StudentResult();
sr.calculate(totMarks,p);
sr.getStudentResult();
}//end of if
else
{
System.out.println("Invalid rollNo...");
}
}//end of if
else
{
System.out.println("Invalid branch...");
}
}
}
