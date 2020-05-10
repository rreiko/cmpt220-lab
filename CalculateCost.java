import java.util.Scanner;
public class CalculateCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter weight if package:");
			double weight = input.nextDouble();
			
			if (weight >= 20)
				System.out.print("Package cannot be shipped");
			else
			{
				double costPerPound;
			
			if (weight > 0 && weight<=2) 
				costPerPound = 3.5;
			
			else if (weight > 0 && weight<=4) 
				costPerPound = 4.5;
			
			else if (weight > 0 && weight<=10) 
				costPerPound = 7.5;
			
			else if (weight > 0 && weight<=20) 
				costPerPound = 10.5;
			}
			System.out.print(" Shipping price per package is " + weight );
		}
	
	} 
}