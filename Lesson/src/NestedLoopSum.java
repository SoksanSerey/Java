
public class NestedLoopSum {
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=0;j<5;j++){
				System.out.print(i+" ");
			}
			System.out.print(i*5);
			System.out.println();
		}
	}
}
