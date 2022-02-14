package Kakao2019;

import java.util.*;

public class OpenChatExam {
	public static void main(String[] args) {
		HashMap<String, String> codeMap = new HashMap<String, String>();  
        codeMap.put("Enter","들어왔습니다.");								 
        codeMap.put("Leave","나갔습니다.");	
//      System.out.println(codeMap);
		
		HashMap<String, String> uidMap = new HashMap<String, String>();
		List<String> list = new ArrayList<String>();
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		for(String str: record) {
		    String[] split = str.split("\\s+");
//		    System.out.println(Arrays.toString(split));
		    String code = split[0];
//		    System.out.println(code);
		    String uid = split[1];
//		    System.out.println(uid);
		    if(split.length > 2) {
		    	String name = split[2];
//		    	System.out.println(name);
		    	uidMap.put(uid, name);
//		    	System.out.println(uidMap);
		    }
		    if(!"Change".equalsIgnoreCase(code)) {
		    	list.add(code + " " + uid);
//		    	System.out.println(list);
		    }
		}
		String[] answer = new String[list.size()]; //.length: 배열의 전체 크기, .size(): 리스트에 들어있는 원소 수
//		System.out.println(Arrays.toString(answer));
		for(int i = 0; i < answer.length; i++) {
			String[] split = list.get(i).split("\\s+");
//			System.out.println(Arrays.toString(split));
			String name = uidMap.get(split[1]);
			System.out.println(name);	
			answer[i] = name + "님이 " + codeMap.get(split[0].toLowerCase()); //toLowerCase():문자열을 소문자로 변환해서 반환 
//			System.out.println(answer[3]);
		}
		System.out.println(Arrays.toString(answer));
	}
	
}
