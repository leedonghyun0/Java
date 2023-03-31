package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Bmi bmi = new Bmi();
		bmi.method1();
	}

	public void method1() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {

				System.out.println("키를 입력해주세요(m) : ");
				double height = scan.nextDouble();
				if(height > 3) {
					System.err.println("키는 3m를 넘을 수 없습니다!!");
					continue;
				}
				
				System.out.println("몸무게를 입력해주세요(kg) : ");
				double weight = scan.nextDouble();
				if(weight > 200 || weight < 20) {
					System.out.println("몸무게는 20보다 작고 200보다 클 수 없습니다.");
					continue;
				}
				double bmi = weight / (height * height);
				System.out.println("키 :" + height + " 몸무게 : " + weight);
				System.out.printf("bmi : %.2f", bmi);
				break;

			} catch (InputMismatchException e) {
				String str = scan.next();
				System.err.println(str + "는 입력 불가능, 숫자를 입력해주세요");
			}
		}
	}

}
