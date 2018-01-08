
public class ChildClass {//it is parent class
	int rno;
	String name;
	ChildClass(int rno,String name){
		this.rno=rno;
		this.name=name;
		System.out.println("Hello from parent");
	}
	public void print(){
		System.out.println(rno);
		System.out.println(name);
	}
	public static void main(String[] args){
		ChildClass san=new ChildClass(1000, "Scan");
		san.print();
	}
}
