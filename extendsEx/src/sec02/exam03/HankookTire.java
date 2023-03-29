package sec02.exam03;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	public boolean roll() {
		System.out.println("누적 회전수 : " + rotation);
		System.out.println("최대 회전수 : " + maxRotation);
		System.out.println();
		
		if(rotation >= maxRotation) {
			return false;
		}
		return true;
		
	}

}
