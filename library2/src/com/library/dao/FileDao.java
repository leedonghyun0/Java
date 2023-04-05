package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {

	public List<Book> getList() {
		// 파일로부터 데이터를 읽어서 리스트로 반환
		System.out.println("FileDao.getList() 시작");
		// 리스트 선언
		List<Book> list = new ArrayList<>();
		// 리소스를 자동을 ㅗ닫아줍니다. ex) fr.close();
		try (FileReader fr = new FileReader("bookList.txt");

				// 단독으로 사용 불가 - 기본 스트림을 파라메터로 넣어줍니다.
				BufferedReader br = new BufferedReader(fr);) {

			// 한줄씩 읽어옵니다
			// 파일의 끝(EOF) = null
			String readLine = "";
			// null이면 반복문 탈출
			while ((readLine = br.readLine()) != null) {
				Book book = makeBook(readLine);
				//0 책1 저자1 false
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("FileDao.getList() 종료");
		return list;
	}
	/**
	 * 문자열을 파싱하여 Book 객체를 생성한다
	 * @param readLine
	 * @return
	 */
	private Book makeBook(String readLine) {
		// 책을 반환
		Book book = null;
		// 공백을 기준으로 배열로 저장
		String[] strArry = readLine.split(" ");
		
		// 강제 형 변환 시 오류가 발생할 수 있으므로
		// 파일이 올바르지 않은형태로 저장 되어있을 경우 오류가 발생
		// 프로그램에서 오류가 발생 했을때,
		// 프로그램이 비정상적으로 종료되는것을 막기위해서 예외처리
		
		// Book을 생성하기 위해 알맞은 타입으로 저장
		try{
		int no = Integer.parseInt(strArry[0]);
		String title = strArry[1];
		String author = strArry[2];
		boolean isRent = Boolean.parseBoolean(strArry[3]);
		// 책을 생성
		book = new Book(no,title,author,isRent);
		// 오류가 발생할 경우 null을 반환		
		return book;
		} catch (Exception e) {
			// 데이터 파싱 중 오류가 발생 하더라도 프로그램이 종료되지 않도록 
			// try 구문을 활용하여 오류를 처리
			System.out.println(readLine + " : 파싱중 오류가 발생 하였습니다.");
		}
		// 책이 정상적으로 생성된
		// 생성중 오류가
		return book;
	}
	
	@Override
	/**
	 * 리스트를 매개변수로 받아 파일로 출력합니다.
	 */
	public boolean listToFile(List<Book> list) {
		// 리스트를 파일로 저장
		try (FileWriter fw = new FileWriter("bookList.txt");){
			for(Book book : list) {
				fw.write(book.toString()+ "\n");
			}
			fw.flush();
			return true;
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		// 파일 출력 실패
		return false;
	}
	@Override
	public void deleteBook(List<Book> list) {
		// TODO Auto-generated method stub
		
	}
}
