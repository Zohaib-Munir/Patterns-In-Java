import java.util.*;
public class LAB{
	public static void main(String[] args) {
		int subjectTotalMarks= 100;
		int totalMarks = 600;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter Roll Number Of Student : ");
		String rollNum = input.nextLine();
		System.out.print("Enter Group Of Student : ");
		String group = input.nextLine();
		System.out.print("Enter Name Of Student: ");
		String name = input.nextLine();
		System.out.print("Enter Father Name : ");
		String fName= input.nextLine();
		System.out.print("Enter School/College Name : ");
		String collegeName = input.nextLine();
		System.out.print("\t\t\tEnter Marks Of Subjects\n");
		System.out.print("Maths : ");
		int marksMath = input.nextInt();
		String mathStatus = statusChecker(marksMath);
		System.out.print("English : ");
		int marksEng = input.nextInt();
		String engStatus = statusChecker(marksEng);
		System.out.print("Physics : ");
		int marksPhy = input.nextInt();
		String phyStatus = statusChecker(marksPhy);
		System.out.print("Chemistry : ");
		int marksChem = input.nextInt();
		String chemStatus = statusChecker(marksChem);
		System.out.print("Urdu : ");
		int marksUrdu = input.nextInt();
		String urduStatus = statusChecker(marksUrdu);
		System.out.print("PakStudies : ");
		int marksPakStd = input.nextInt();
		String pakStudiesStatus = statusChecker(marksPakStd);
		int totalMarksStudent = marksMath+marksEng+marksPhy+marksChem+marksUrdu+marksPakStd;
		System.out.println();
		System.out.println("*******************************************************************************************************");
		System.out.print("\t\tFEDERAL BOARD OF INTERMEDIATE AND SECONDARY EDUCATION, ISLAMABAD\n");
		System.out.println("\t\t    HIGHER SECONDARY SCHOOL CERTIFICATE (HSSC) EXAMINATION");
		System.out.println();
		System.out.println("Roll No : "+rollNum+"\t\tName            : "+name);
		System.out.println("\t---------\t\t\t-----------------");
		System.out.println("Group   : "+group+"\t\tFather Name     : "+fName);
		System.out.println("\t---------\t\t\t-----------------");
		System.out.println("\t\t\t\t\t\t\t\t_________");
		System.out.println("\t\t\t\t\t\t\t\t*\t*");
		System.out.println("\t\t\t\t\t\t\t\t*\t*");
		System.out.println("\t\t\t\t\t\t\t\t*\t*");
		System.out.println("\t\t\t\t\t\t\t\t_________");
		System.out.println();
		System.out.print(name+"\tS/D of\t "+fName+"\n");
		System.out.println("--------------\t\t----------------");
		System.out.print("of Institution\t"+collegeName+ "\thas Secured the Marks Shown Against Each Subject\n");
		System.out.println("\t\t---------------");
		System.out.println("in the HIGHER SECONDARY SCHOOL CERTIFICATE (HSSC) EXAMINATION");
		System.out.println();
		System.out.println("\t\t__________________________________________________________________");
		System.out.print("\t\t*SUBJECTS\tMARKS OBTAINED\tTOTAL MARKS\tSTATUS\n");
		System.out.println("\t\t__________________________________________________________________");
		System.out.print("\t\t*Maths\t\t"+marksMath+"\t\t"+subjectTotalMarks+"\t\t"+mathStatus+"\n");
		System.out.print("\t\t*English\t"+marksEng+"\t\t"+subjectTotalMarks+"\t\t"+engStatus+"\n");
		System.out.print("\t\t*Physics\t"+marksPhy+"\t\t"+subjectTotalMarks+"\t\t"+phyStatus+"\n");
		System.out.print("\t\t*Chemistry\t"+marksChem+"\t\t"+subjectTotalMarks+"\t\t"+chemStatus+"\n");
		System.out.print("\t\t*Urdu\t\t"+marksUrdu+"\t\t"+subjectTotalMarks+"\t\t"+urduStatus+"\n");
		System.out.print("\t\t*PakStudies\t"+marksPakStd+"\t\t"+subjectTotalMarks+"\t\t"+pakStudiesStatus+"\n");
		System.out.print("\t\t____________________________________________________________________\n");
		System.out.print("\t\tOBTAINED MARKS\t"+totalMarksStudent+"\t\tTOTAL MARKS\t600\n");
		System.out.print("\t\t____________________________________________________________________\n");
		System.out.println();
		System.out.println();
		if(totalMarksStudent>550){
			System.out.print("CANDIDATE "+name+" has Passed And Awarded Grade A1");
			}
		if(totalMarksStudent>=500 && totalMarksStudent <= 550){
			System.out.print("CANDIDATE "+name+" has Passed And Awarded Grade A2");
			}
		if(totalMarksStudent>=400&& totalMarksStudent<500){
			System.out.print("CANDIDATE "+name+" has Passed And Awarded Grade A3");
			}
		if(totalMarksStudent>=300&&totalMarksStudent<400){
			System.out.print("CANDIDATE "+name+" has Passed And Awarded Grade A4");
			}
		if(totalMarksStudent<300){
			System.out.print("CANDIDATE "+name+" has Passed And Awarded Grade A5/FAIL");
		 }
	}
	public static String statusChecker(int numbers){
		String status= null;
		if(numbers>=90){
			status= "Excellent";
		}
		if(numbers>=80&&numbers<90){
			status = "Good";
		}
		if(numbers>=70&&numbers<80){
			status= "Average";
		}
		if(numbers>=60&&numbers<70){
			status="Below Average";
		}
		if(numbers>=50 && numbers<60){
			status="Not Satifactory";
		}
		if(numbers<50){
			status = "fail";
		}
		return status;
	}
}