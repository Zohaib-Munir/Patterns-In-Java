public class QuestionNo8C{
	public static void main(String[] args) {
		displayPattern();
		
	}
	public static void displayPattern(){
		int rows = 7;
		for(int i =0 ; i<=rows ;i++){
			for(int j=rows ; j>=i ; j--){
				System.out.print(" ");
			}
			for(int k=i ; k>=0; k--){
				System.out.print("/");
			}
			for(int z=0 ;z<=1; z++){
				System.out.print("*");
			}
			for(int z=0; z<=i; z++){
				System.out.print("\\");
			}
			System.out.println();
		}
		System.out.println("+-*-*-*-*-*-*-*-*-*-+");
		for(int i=0; i<rows; i++){
			for(int j=rows ; j>i ; j--){
				System.out.print("-");
			}
			for(int k=0 ; k<=i ; k++){
				System.out.print("/");
			}
			for(int h=rows; h>i; h--){
				System.out.print("-");
			}
			for(int g=0 ; g<=i;g++){
				System.out.print("\\");
			}
			for(int p=0;p<=3;p++){
				System.out.print("-");
			}
			System.out.println();
			System.out.println("+-*-*-*-*-*-*-*-*-*-+");
		}
		for(int i =0 ; i<=rows ;i++){
			for(int j=rows ; j>i ; j--){
				System.out.print(" ");
			}
			for(int k=i ; k>=0; k--){
				System.out.print("/");
			}
			for(int z=0 ;z<=1; z++){
				System.out.print("*");
			}
			for(int z=0; z<=i; z++){
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}