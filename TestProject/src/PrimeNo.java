
public class PrimeNo {

	public boolean validate(Integer primeNum) {
		
		for(int i=2;i<primeNum/2;i++) {
			if(primeNum%i==0) {
				return false;
			}
		}
		return true;
	}
}
