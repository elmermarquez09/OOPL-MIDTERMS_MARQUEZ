package MIDTERMS;
import java.util.Scanner;
import ConvertionProcess.Converter;
import ConvertionFormula.Formula;

public class Menu {


	int sw;
	String again;
	Scanner sc= new Scanner(System.in);

	public void displayMenu(){

		System.out.println("*********Welcome to Maple's Bank***********");
		System.out.println("==========================================");
		System.out.println("	1. Instruction					 ");
		System.out.println("	2. Converter	 				 ");
		System.out.println("	3. About Maples Bank	 		 ");
		System.out.println("	4. Exit	 				 		 ");
		System.out.println("==========================================");
		System.out.println("What do you want to do?");
	}


	public void order()
	{
		while(true){
			System.out.print("Enter your action: ");
			sw = sc.nextInt();
			switch (sw){
				case 1://Instruction
				System.out.println("\nYou have selected instructions! \n");
				System.out.println("Here's the instructions: ");
				System.out.println("Main menu instruction: In main menu, just enter the number 1-4 on what section that you want to go");
				System.out.println("Converter instruction: Just type the keyword of the Currency to convert. Like P-D for Peso to Dollar conversion");
				System.out.println("Exit instruction: To exit the program just enter type number 4. ");

				break;

				case 2://Converter
				System.out.println("\n*********Welcome to Maple's Currency Converter***********");
				System.out.println("Here are the current list of supported currency for conversion:\n \n(P-D) Peso to Dollar\n(D-P) Dollar to Peso\n(P-E) Peso to Euro\n(E-P) Euro to Peso");
				System.out.print("\nPlease type the currency code: ");
				String currency = sc.next();
				

				System.out.print("Enter Amount:");
				Double amount = sc.nextDouble();
				
				Converter converter = new Converter(currency,amount);
				Formula converterService = new Formula();
				
				Boolean sign= converterService.currencyConverter(converter);
				
				if(sign)
				System.out.println("\nConverted Amount : "+converterService.getTotalConvertedAmount()+" "+currency);
				break;

				case 3://About Maples Bank
				System.out.println("\nYou have selected About Maples Bank");
				System.out.println("This program is for Midterm Exam of Elmer C. Marquez Jr in Object Oriented Programming.");
				System.out.println("This program allows the user to convert money to supported currency.");
				System.out.println("The current currency that we current have are Peso to Dollar, Dollar to Peso, Peso to Euro, and Euro to Peso.");
				break;

				case 4://Exit
				System.exit(1);
				break;

				default:
					break;
			}
			System.out.println();
			System.out.print("Do you wish to select again? (Y/N) : ");
			again = sc.next();
			if(again.equalsIgnoreCase("Y"))
			{order();}
			else if (again.equalsIgnoreCase("N"))
			{
			System.exit(1);}
			else{System.out.println("Invalid Choice");}
		}
	}
}




