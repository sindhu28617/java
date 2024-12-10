package AllProgram;
// constructor is a special method that is used to initialize the objects . The constructor is called when a object of class is created .
//Rule 1; Same name as class name
//Rule 2; No Return Type, Not even void 
//Rule 3; Automatic invocation -- Constructor is automatically invoked when object is created .
//Rule 4; Initialization of object -- Newly created object (obj)new
//Rule 5; Default Constructor -- JAVA provides default constructor / when the obj is created or initialized

public class ConstructorClassEx {
int id;
String name;
ConstructorClassEx() // default constructor
{
	this.id=id;
	this.name=name; 
}
void display( int id ,String name)
{
	System.out.println(id+ ""+name);
}
    public static void main(String args[])
    {
    	ConstructorClassEx c1=new ConstructorClassEx();
    	ConstructorClassEx c2=new ConstructorClassEx();
    	ConstructorClassEx c3=new ConstructorClassEx();
 
c1.display(1, "Bhuvi");
c2.display(2, "Karishma");
c3.display(3, "Sindhu");
	
}
}