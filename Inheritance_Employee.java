import java.util.Scanner;


class Employee
{
String name,age,phnum,add,salary;

void printsalary()
{

System.out.println(" Salary is= "+salary);
}
void display()
{
System.out.println(" Name = "+name);
System.out.println(" age = "+age);
System.out.println("  number = "+phnum);
System.out.println(" Address = "+add);
}
}
class officer extends Employee
{
String specialization;

}
class manager extends Employee
{
String department;

}
public class Inheritance_Employee {

	public static void main(String[] args) {
		{
			Scanner in=new Scanner(System.in);
			officer of=new officer();
			manager m=new manager();
			System.out.println("Name of officer");
			of.name=in.nextLine();
			System.out.println(" age of officer");
			of.age=in.nextLine();
			System.out.println(" phone number of officer");
			of.phnum=in.nextLine();
			System.out.println(" address of officer");
			of.add=in.nextLine();
			System.out.println(" salary of officer");
			of.salary=in.nextLine();
			
			
			System.out.println("Name of Manager");
			m.name=in.nextLine();
			System.out.println(" age of Manager");
			m.age=in.nextLine();
			System.out.println(" phone number of Manager");
			m.phnum=in.nextLine();
			System.out.println(" address of Manager");
			m.add=in.nextLine();
			System.out.println(" salary of Manager");
			m.salary=in.nextLine();
			System.out.println("Enter the specialization of officer");
			of.specialization=in.nextLine();
			System.out.println("Enter the department of manager");
			m.department=in.nextLine();


			System.out.println("DETAILS OF OFFICER");
			of.display();
			of.printsalary();
			System.out.println("specialization of officer is="+of.specialization);
			System.out.println("DETAILS OF MANAGER");
			m.display();
			m.printsalary();
			System.out.println("department  of manager is="+m.department);

			in.close();
			}
       
	}
}