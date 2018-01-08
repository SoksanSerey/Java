
public class ParentClass extends ChildClass {//It is child class not parent class
	int rno;
	String name;
	public ParentClass(){
		super(1000, "XYZ");
		this.rno=super.rno;
		this.name=super.name;
		System.out.println("Hello From child");
	}
	public void print(){
		System.out.println("Child Class");
		super.print();
	}
	public static void main(String[] args) {
		ParentClass ch=new ParentClass();
		ch.print();
	}
}