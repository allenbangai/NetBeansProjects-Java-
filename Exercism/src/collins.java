/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * package exercism;
 */

/**
 *
 * @author DELL
 */
import java.lang.Math;
import java.util.Scanner;


public class collins{

	//begin method Call
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
                Scanner collins = new Scanner(System.in);

		int resistance;
		double capacitance;
		float inductance;
		double omega;
		float inverseResistance;
		double thirdSectiion, firstSection, subSection, imperdance;

		System.out.println("Enter the resistance");
                resistance = input.nextInt();

		System.out.println("Enter the capacitance");
		capacitance = collins.nextDouble();

		System.out.println("Enter the inductance");
		inductance = collins.nextFloat();

		System.out.println("Enter the omega");
		omega = collins.nextDouble();

		inverseResistance = 1 / (resistance * resistance);
		System.out.printf("Inverse resistance is %.2d%n", inverseResistance);

		subSection = 1 / (omega * inductance);
		System.out.printf(" Inverse Product of omega and inductance is %.5f%n", subSection);

		firstSection = omega * capacitance;
		System.out.printf("Product of omega and capacitance is %.5f%n", firstSection);

		thirdSectiion = Math.pow((firstSection - subSection), 2.0);
		System.out.printf("Square of fisrt and sub section is %.5f%n", thirdSectiion);


		imperdance = Math.sqrt(inverseResistance + thirdSectiion);
		System.out.printf("The imperdance is %.2f%n: ", +imperdance);



	}
}


