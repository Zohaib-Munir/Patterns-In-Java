import java.util.*;
public class QuestionNo8{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		displayPattern();
	}
	public static void displayPattern(){
		System.out.print("Enter No Of Rows : ");
		int rows = input.nextInt();
		for(int i =0 ; i<=rows ;i++){
			for(int j=rows ; j>=i ; j--){
				System.out.print(" ");
			}
			for(int k=i; k>=0; k--){
				System.out.print(i+1);
			}
			for(int z=0; z<=i; z++){
				System.out.print(i+1);
			}
			System.out.println();
		}
		for(int s=0; s<=rows ; s++){
			for(int a=0 ; a<=s ; a++){
				System.out.print(" ");
			}
			for(int f=rows; f>=s ; f--){
				System.out.print(rows-s);
			}
			System.out.println();
		}
	}
}