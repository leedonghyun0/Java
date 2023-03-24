package getter.setter;

import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("123456-1234567", "홍삼원");
		// person.nation = "한국"; // 오류 : 상수 필드의 값을 변경 할 수 없다.
		
		System.out.println(person.nation);
		System.out.println(person.name);
		System.out.println(person.ssn);
		
		System.out.println("파이 값 : " + Person.PI);
		System.out.println("지구의 반지름 : " + Person.EARTH_RADIUS + "km");
		
		// 싱글톤 방식으로 구현
		Calendar cal = Calendar.getInstance();
		
		// 현재 일을 출력
		int day = cal.get(Calendar.DATE);
		int day1 = cal.get(5);
		
		cal.get(Calendar.YEAR);
		
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		// 실행 전
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();

	}

}
