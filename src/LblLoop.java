
public class LblLoop {

	public static void main(String[] args) {
		int a[] = {11,22,33,44,55};
		
		//forEach
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println("-----------------");
	
		x:
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j)
					break x;
				System.out.print(i);
			
			}
			System.out.println("");
		}
		//1
		//22
		//333
				
	}
}
