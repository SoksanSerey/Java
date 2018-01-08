import java.util.Objects;


public class Student extends Object{
		Integer id;
		String name;
		
		public int hashcode(){
			int hash=5;
			hash=7*hash+Objects.hashCode(this.id);
			hash=7*hash+Objects.hashCode(this.name);
			return hash;
		}
		@Override
		public boolean equals(Object obj){
			if(this==obj){
				return true;
			}
			if(obj==null){
				return false;
			}
			if(getClass()!=obj.getClass()){
				return false;
			}
			final Student other=(Student) obj;
			if (this.id!=other.id){
				return false;
			}
			if(!Objects.equals(this.name, other.name)){
				return false;
			}
			return true;
		}
		public Student(int id, String name){
			this.id=id;
			this.name=name;
		}
}
