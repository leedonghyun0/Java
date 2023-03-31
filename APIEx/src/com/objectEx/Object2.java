package com.objectEx;

import java.util.HashMap;

public class Object2 {

	public static void main(String[] args) {
		/**
		 * 			타입, 타입
		 * HashMap<String, String> hashMap = new HashMap;
		 * 
		 */
		
		HashMap<String, String> hashMap = new HashMap<>();
		// 데이터를 담는 방법
		hashMap.put("key", "value");
		hashMap.put("key1", "value1");
		hashMap.put(new String("key"), "newValue");
		
		// 데이터를 꺼내는 방법
		String str = hashMap.get("key");
		System.out.println("key : " + str);
		System.out.println("key1 : " + hashMap.get("key1"));
		
		HashMap<Integer, String> hashMap2 = new HashMap<>();
		hashMap2.put(1, "홍길동");
		hashMap2.put(2, "너잘난");
		hashMap2.put(3, "나잘난");
		System.out.println(hashMap2.get(1));
		System.out.println(hashMap2.get(2));
		System.out.println(hashMap2.get(3));
	}

}
