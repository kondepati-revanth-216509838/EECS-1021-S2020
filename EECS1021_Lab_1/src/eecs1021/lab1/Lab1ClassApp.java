package eecs1021.lab1;
/**
 * Use this Class to test the method that you 
 * implemented 
 * 
 *
 */
public class Lab1ClassApp {

	public static void main(String[] args) {
		
		System.out.println("Test mulDiff(1, 2) = "+ Lab1Class.mulDiff(1, 2));
		System.out.println("Test sumSquares(1, 2) = "+Lab1Class.sumSquares(1, 2));
		System.out.println("Test compute(4) = "+Lab1Class.compute(4));
		System.out.println("Test getBMI(75,15,45) = "+Lab1Class.getBMI(75,15,45));
		System.out.println("Test numRevolutions(720) = "+Lab1Class.numRevolutions(720));
		System.out.println("Test fixAngle(720) = "+Lab1Class.fixAngle(720));
		System.out.println("Test avg(1,2,4) = "+Lab1Class.avg(1,2,4));
		System.out.println("Test isEven(7)= "+Lab1Class.isEven(7));
		
		/* you can all more test */
		System.out.println("\nMy test \n");
		
		System.out.println("Test mulDiff(10, 5) = "+ Lab1Class.mulDiff(10, 5)); //Expect 35
		
		System.out.println("\n");
		
		System.out.println("Test sumSquares(3, 3) = "+Lab1Class.sumSquares(3, 3)); //Expect 18
		
		System.out.println("\n");
		
		System.out.println("Test compute(2) = "+Lab1Class.compute(2)); //Expect 1.41
		System.out.println("Test compute(3) = "+Lab1Class.compute(3)); //Expect 1.73
		
		System.out.println("\n");
		
		System.out.println("Test getBMI(80,13,45) = "+Lab1Class.getBMI(80,13,45)); //Expect 1.39
		
		System.out.println("\n");
		
		System.out.println("Test numRevolutions(1080) = "+Lab1Class.numRevolutions(1080));//Expect 3
		System.out.println("Test numRevolutions(1440) = "+Lab1Class.numRevolutions(1440));//Expect 4
		System.out.println("Test numRevolutions(1800) = "+Lab1Class.numRevolutions(1800)); // Expect 5
		
		System.out.println("\n");
		
		System.out.println("Test fixAngle(50) = "+Lab1Class.fixAngle(50));//Expect 50
		System.out.println("Test fixAngle(700) = "+Lab1Class.fixAngle(700));//Expect 340
		
		System.out.println("\n");
		
		System.out.println("Test avg(5,7,3) = "+Lab1Class.avg(5,7,3));//Expect 5
		System.out.println("Test avg(5,7,1) = "+Lab1Class.avg(5,7,1));//Expect 4
		System.out.println("Test avg(5,7,3) = "+Lab1Class.avg(5,7,3));//Expect 5
		System.out.println("Test avg(1,2,5) = "+Lab1Class.avg(1,2,5));//Expect 5
		/* mulDiff Passed
		 * sumSqaured Passed
		 * compute Passed
		 * getBMI Passed
		 * numRevolutions Passed
		 * fixAngle Passed
		 * avg Passed
		 * isEven Passed
		 * */
		
		System.out.println("Test fixAngle(7000) = "+Lab1Class.fixAngle(7000));
		System.out.println("Test numRevolutions(7080) = "+Lab1Class.numRevolutions(7080));
	}
	
}
