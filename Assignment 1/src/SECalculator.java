import java.util.Scanner;

public class SECalculator extends Calculation{
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 double a1, a2, a3, u1, u2, u3, tf1, tf2, tf3, tf4, tf5, tf6, tf7, 
         tf8,tf9, tf10, tf11, tf12, tf13, ef1, ef2, ef3, ef4, ef5, ef6,
         ef7, ef8, totalActor = 0, totalTechnical = 0, totalUseCase = 0, totalExperience = 0;
		 
		 System.out.println("Please input the necessary data needed for Software Effort Estimation calculation");
		 System.out.println("<<Actors Complexity>>\n");
		 System.out.print("Simple  : ");
		 a1 = scan.nextDouble() *1;
		 System.out.print("Average : ");
		 a2 = scan.nextDouble()*2;
		 System.out.print("Complex : ");
		 a3 = scan.nextDouble()*3;
		 
		 totalActor += a1 + a2 + a3;
		 
		 System.out.println("\n<<Use Cases Complexity>>\n");
		 System.out.print("Simple  : ");
		 u1 = scan.nextDouble() *5;
		 System.out.print("Average : ");
		 u2 = scan.nextDouble() *10;
		 System.out.print("Complex : ");
		 u3 = scan.nextDouble()* 15;
		 
		 totalUseCase += u1 + u2 + u3;
		 
		 System.out.println("\n<<Technical Factors>>\n");
		 System.out.print("Distributed System : ");
		 tf1 = scan.nextDouble()*2;
		 System.out.print("Response time or throughput performance objectives : ");
		 tf2 = scan.nextDouble()*1;
		 System.out.print("End user efficiency : ");
		 tf3 = scan.nextDouble()*1;
		 System.out.print("Complex internal processing : ");
		 tf4 = scan.nextDouble()*1;
		 System.out.print("Code must be reusable : ");
		 tf5 = scan.nextDouble()*1;
		 System.out.print("Easy to install : ");
		 tf6 = scan.nextDouble()*0.5;
		 System.out.print("Easy to use : ");
		 tf7 = scan.nextDouble()*0.5;
		 System.out.print("Portable : ");
		 tf8 = scan.nextDouble()*2;
		 System.out.print("Easy to change : ");
		 tf9 = scan.nextDouble()*1;
		 System.out.print("Concurrent : ");
		 tf10 = scan.nextDouble()*1;
		 System.out.print("Includes special security objectives : ");
		 tf11 = scan.nextDouble()*1;
		 System.out.print("Provides direct access for third parties : ");
		 tf12 = scan.nextDouble()*1;
		 System.out.print("Special user training facilities are required : ");
		 tf13 = scan.nextDouble()*1;
		 
		 totalTechnical += tf1 + tf2 + tf3 + tf4 + tf5 + tf6 + tf7 + tf8 +
	                tf9 + tf10 + tf11 + tf12 + tf13;
		 
		 System.out.println("\n<<Experience Factors>>\n");
		 System.out.print("Familiar with the project model that is used : ");
		 ef1 = scan.nextDouble()*1;
		 System.out.print("Application experience : ");
		 ef2 = scan.nextDouble()*0.5;
		 System.out.print("Object-oriented experience : ");
		 ef3 = scan.nextDouble()*1;
		 System.out.print("Lead analyst capability : ");
		 ef4 = scan.nextDouble()*0.5;
		 System.out.print("Motivation : ");
		 ef5 = scan.nextDouble()*0;
		 System.out.print("Stable requirements : ");
		 ef6 = scan.nextDouble()*2;
		 System.out.print("Part-time staff : ");
		 ef7 = scan.nextDouble()* (-1);
		 System.out.print("Difficult programming language : ");
		 ef8 = scan.nextDouble() * (-1);
		 
		 double count = 0;
	        if(ef1 < 3){
	            count++;
	        }if(ef2 < 3){
	            count++;
	        }if(ef3 < 3){
	            count++;
	        }if(ef4 < 3){
	            count++;
	        }if(ef5 < 3){
	            count++;
	        }if(ef6 < 3){
	            count++;
	        }if(ef7 > 3){
	            count++;
	        }if(ef8 > 3){
	            count++;
	        }
	        
	        totalExperience += ef1 + ef2 + ef3 + ef4 + ef5 + ef6 +
	                ef7 + ef8;
	        double eFactor = 1.4 + (-0.03 * totalExperience);
	        
	        double uucp = UUCP(totalActor,totalUseCase);
	        double softwareSize = SoftwareSize(totalTechnical, uucp);
	        double useCasePoints = UseCasePoints(totalExperience, softwareSize);
	        double manHours = ManHours(useCasePoints, count);
	        
	        
	        System.out.println("\nResult");
	        System.out.println("\nUnadjusted Use Case Points :" + uucp);
	        System.out.println("Software Size :" + softwareSize);
	        System.out.println("Use Case Points :" + useCasePoints);
	        System.out.println("Man Hours :" + manHours);
	        
		
		 
		 
		 
		 
	 }
}
