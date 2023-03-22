package car.object;

public class Person {

	public static void main(String[] args) {
/*
		Car car = new Car();
		Car carGia = new Car("기아자동차");
		
		// 필드에 접근하기 위해서는 객체가 생성되어 있어야 한다
		System.out.println("car.company : " + car.company);
		
		car.speedUp();
		System.out.println("car.speed : " + car.speed);
		car.speedUp();
		System.out.println("car.speed : " + car.speed);

		System.out.println("carGia.company : " + carGia.company);
*/
		Car car = new Car();
		car.company = "르노삼성";
		System.out.println("company : " + car.company);
		System.out.println("speed : " + car.speed);
		car.speedUp();
		System.out.println("speed : " + car.speed);
		car.speed = 100;
		System.out.println("car.speed = 100 ");
		System.out.println("speed : " + car.speed);
	}

}
