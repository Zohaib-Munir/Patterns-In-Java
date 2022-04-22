import java.util.*;
public class QuestionNo1{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int method1Value = amountOfUser();
		int method2Value = currencyNoteSelection();
		int method3Value = amountOfNote(method1Value,method2Value);
		displayCurrencyNotes(method1Value,method3Value,method2Value);
	}
	public static int amountOfUser(){
		System.out.print("Enter Amount : ");
		int amountInput = input.nextInt();
		while(amountInput < 100 || amountInput > 100000){
			System.out.print("Amount Is Not In Range Enter Again :");
			amountInput = input.nextInt();
		}
	return amountInput;
	}
	public static int currencyNoteSelection(){
		System.out.print("Curency Notes : \n"+
						 "500\n"+
						 "100\n"+
						 "50\n"+
						 "20\n"+
						 "10\n"+
						 "5\n"+
						 "1\n");
		System.out.print("Enter Choice Of Currecy Note You Want :");
		int note = input.nextInt();
		return note;
	}
	public static int amountOfNote(int userAmount, int notes){
		System.out.print("Enter Amount Of Currency Note You Want : ");
		int currencyNoteamount = input.nextInt();
		int caluclation = currencyNoteamount * notes;
		while(currencyNoteamount > 200 || caluclation > userAmount){
			System.out.println("Sorry You Can Only Take 200 Notes OF Your Choice or"+
								" Your Amount Is less Than Your Note Selection : ");
			System.out.print("Enter Again : ");
			currencyNoteamount = input.nextInt();
			caluclation = currencyNoteamount * notes;
		}
	return currencyNoteamount;
	}
	public static void displayCurrencyNotes(int userAmount, int currencyNoteamount2,int notes2){
		System.out.println("*******************No Of Notes Including Your Choice Are********************");
		int newAmount = notes2 * currencyNoteamount2;
		int remainingAmount = userAmount - newAmount;
		int note100 =100,note50= 50,note20=20,note10=10, note5=5,noteOne=1;
		int count100=0,count50=0,count20=0,count10=0,count5=0,count1=0;
		while( remainingAmount>0){
			if(remainingAmount >=100){
				remainingAmount = remainingAmount - note100;
				count100++;
			}
			else if (remainingAmount < 100 && remainingAmount >= 50) {
				remainingAmount = remainingAmount - note50;
				count50++;
			}
			else if (remainingAmount < 50 && remainingAmount >=20) {
				remainingAmount = remainingAmount - note20;
				count20++;
			}
			else if (remainingAmount < 20 && remainingAmount >=10) {
				remainingAmount = remainingAmount - note10;
				count10++;
			}
			else if (remainingAmount < 10 && remainingAmount >= 5) {
				remainingAmount = remainingAmount - note5;
				count5++;
			}
			else if (remainingAmount < 5 && remainingAmount>=1) {
				remainingAmount = remainingAmount - noteOne;
				count1++;
			}
		}
		System.out.print("Currency Notes : Number\n"+
						 "500: "+currencyNoteamount2+"\n"+
						 "100: "+count100+"\n"+
						 "50 : "+count50+"\n"+
						 "20 : "+count20+"\n"+
						 "10 : "+count10+"\n"+
						 "5  : "+count5+"\n"+
						 "1  : "+count1+"\n");		
	}
}