package getter.setter;

public class SingletonEx {
	
	private static SingletonEx singleton = new SingletonEx();
	
	// 1. 생성자를 private 접근제한자를 사용해서 외부에서 생성자를 이용하지 못하도록 막는다.
	private SingletonEx() {
		
	}
	
	// 2. 외부에서 접근 할 수 있는 메서드를 만들고 생성된 객체를 반환한다.
	//	   - 생성을 할 수 없으므로 정적 메서드(static)로 만들어야 한다.
	//     - 정적 필드에 자신을 생성하여 리턴 해준다.
	public static SingletonEx getInstance() {
		// 정적 메서드에서는 정적필드, 정적 메서드만 사용이 가능하다.
		return singleton;
	}
}
