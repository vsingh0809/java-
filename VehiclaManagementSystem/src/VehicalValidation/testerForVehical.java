package VehicalValidation;

import java.time.LocalDate;
import java.util.Scanner;


public class testerForVehical {


	public static void main (String [] args) {
		try(Scanner sc= new Scanner(System.in) ) {
			boolean exit=false;
			System.out.println("enter the vehical");
			Vehivcal[] vehicle=new Vehivcal[sc.nextInt()];
		
			int counter =0;
			while(!exit) {
				System.out.println(".....options........ ");
				System.out.println("..add a vehical..");
				System.out.println("...drive vehical..");
				switch(sc.nextInt()) {
				case 1:
					if(counter < vehicle.length) {
//						Vehivcal(String chasisNo, colourType color, double price, LocalDate manufactureDate,
//								LocalDate insuranceExpDate, double pollutionLevel) {
//						colourType c = colourType.valueOf(sc.next());
//						LocalDate d1,d2;
						System.out.println(".....Enter vehical details........ ");
						vehicle[counter++]= new Vehivcal(sc.next(),colourType.valueOf(sc.next().toUpperCase()), sc.nextDouble(), LocalDate.parse(sc.next()), LocalDate.parse(sc.next()), sc.nextDouble());
						System.out.println("....vehical added....");
						for (Vehivcal v:vehicle) {
							if(v!=null) {System.out.println(v);
						}
						}
					}
 				      break ;
				      
				case 2:
					if(counter < vehicle.length) {
						
						/*
						 * 2. Drive a vehicle i/p -- Kilemeters You can decide based upon Kms --the
						 * pollution level If pollution level exceed , throw custom exception n display
						 * error message via catch block.
						 */
					//	Vehivcal km= new Vehivcal()

					}
					
				       break;  
				
				
				case 0:
					exit=true;
					break;
				
				
				
				}
				
				
				
				
			}
			
			
			
			
		} catch (Exception e) {
		System.out.println("mmmmmmmmm.");	
		}
		
			
			 		
	
	}
}
