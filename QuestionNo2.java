import java.util.*;
public class QuestionNo2{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		displayMenuItems();
	}
	public static void displayMenuItems(){
		System.out.println("******************** Welcome To Food Store ********************");
		System.out.print("1 : Burger\n"+
						 "2 : Pizzas\n"+
						 "3 : SandWiches\n");
		int option =0;
		boolean count = true;
		boolean flag = true;
		while (count) {
			try{
				System.out.print("Select Option : ");
				option = input.nextInt();
				while(option == 0 || option >3){
					System.out.print("Select While Agian : ");
					option = input.nextInt();
				}
				count = false;
			} 
			catch(Exception e){
				System.out.print("Worng Input!!\n");
				count = true;
				input.nextLine();
			}
		}
		int itemOption;
		while (flag) {
			switch(option){
			case 1: System.out.print("1: Crispy Burger Rs 600\n"+
									 "2: Beef Burger Rs 650\n"+
									 "3: Fish Burger Rs 700\n");
			System.out.print("Select item : ");
			itemOption = input.nextInt();
			switch(itemOption){
			case 1: int pricecase1 = 600;
				break;
			case 2:  pricecase1 = 650;
				break;
			case 3:  pricecase1= 700;
				break;
				}
			break;
		case 2: {System.out.print("1: Chikken Tikka Rs 600\n"+
								 "2: Chikken Fajita Rs 650\n"+
								 "3: Four Seasons Rs 700\n");
			System.out.print("Select Item : ");
			itemOption = input.nextInt();
			switch(itemOption){
			case 1: int pricecase2 = 600;
				break;
			case 2:  pricecase2 = 650;
				break;
			case 3:  pricecase2= 700;
				break;
				}
				flag = false;
			break;}
			case 3:	System.out.print("1: Club Rs 300\n"+
								 "2: Chikken Rs 350\n"+
								 "3: Vegitables Rs 370\n");
			System.out.print("Select item : ");
			itemOption = input.nextInt();
			switch(itemOption){
			case 1: int pricecase3 = 300;
				break;
			case 2:  pricecase3 = 350;
				break;
			case 3:  pricecase3 = 370;
				break;
				}
			break;
			}
		}
	}
}