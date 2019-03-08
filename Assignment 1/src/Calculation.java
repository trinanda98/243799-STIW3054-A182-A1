
public class Calculation {
	protected static double UUCP(double tActorPoint, double tUseCasePoint){
		double actor = tActorPoint;
		double useCase = tUseCasePoint;
		double uucp = actor + useCase;
		return uucp;
		
	}
	
	protected static double SoftwareSize(double totalTFactor, double uucp) {
		double tFactor = totalTFactor;
		double useCase = uucp;
		double tcf = (0.01 * tFactor) + 0.6;
		double softwareSize = useCase * tcf;
		return softwareSize;
		
	}
	
	protected static double UseCasePoints(double totalEFactor, double softwareSize) {
		double tEFactor = totalEFactor;
		double szuc = softwareSize;
		double eFactor = (-0.03 * tEFactor) + 1.4;
		double useCasePoints = eFactor * szuc;
		return useCasePoints;
		
	}
	
	protected static double ManHours(double useCasePoints, double count) {
		double ucp = useCasePoints;
		double er;
                if(count <= 2){
                    er = 20;
                }else{
                    er = 28;
                }
		double manHours = ucp * er;
		return manHours;
		
	}

}
