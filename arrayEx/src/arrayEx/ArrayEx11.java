package arrayEx;

public class ArrayEx11 {

	public static void main(String[] args) {
		String[] oldStrArr = {"java", "array", "copy"};
		String[] newStrArr = new String[5];
		
		// (원본 배열, 복사를 시작하려는 index, 새로운 배열(복사하고자 하는), 새 배열에 복사를 시작할 index, 복사할 갯수)
		
		// java 기본 API에서 제공해주는 메서드를 활용해서 배열을 복사
		System.arraycopy(oldStrArr, 0, newStrArr, 0, 0);
		
		for(int i=0; i<newStrArr.length; i++) {
			// 배열의 값에 접근할때는 배열이름[인덱스]
			System.out.println(newStrArr[i]);
		}
		
		// 향상된 for문을 이용하는 방법
		// (타입 변수명 : 배열의 이름)
		// 배열의 요소를 모두 순회 합니다. 0 < 배열명.length;
		// 배열이름[인덱스]
		for(String data : newStrArr) {
			System.out.println(data);
			
		}

	}

}
