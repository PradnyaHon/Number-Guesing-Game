import java.util.*;

public class Task_2
{
	public static void Guessgame()
    {
		try (Scanner sc = new Scanner(System.in))
        {
			int R =1+(int)(100*Math.random());

			int iTry=7;
			
			int iCnt, iNo, iRead;

			System.out.println("Welcome to Guess the Number game.....");
			System.out.println("System generates a number betweeen 1 to 100."+"Guess the number within 7 trails");

			for(iCnt=0; iCnt<7; iCnt++)
            {
				System.out.println("Guess the number:");
				iNo=sc.nextInt();
				if(iNo>100 || iNo <0)
                {
					System.out.println("Guess the number between 1 to 100");
				}
				else if( R == iNo)
                {
					System.out.println("Congrtulations!! You have guessed the number correctly");
					break;
				}
				else if( R < iNo && iCnt != iTry-1)
                {
					System.out.println("The number is less than the" + iNo);
				}
 				else if(R >iNo && iCnt != iTry-1)
                {
					System.out.println("The number is greater than the" + iNo);
				}
			}
			if(iCnt == iTry)
            {
				System.out.println("Trails are finished to guess the number");

				System.out.println("The number is " + R);

				System.out.println("Do you want to play again ??");

				System.out.println("If YES enter 1"+" "+"else enter 0");
				iRead= sc.nextInt();
				
				if(iRead==1)
                {
					Guessgame();
				}
				else
                {
					System.out.println("Thank you..");
				}
			}
		}
				
	}
	public static void main(String[] args)
    {
    		
    	Guessgame();
    }
   
}
