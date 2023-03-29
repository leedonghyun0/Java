package http.servlet;

public abstract class HttpServlet{
	public abstract void service();

	public void FileDownloadServlet() {
		System.out.println("파일 다운로드합니다.");
		
	}

	public void LoginServlet() {
		System.out.println("로그인 합니다.");
		
	}

	
}
