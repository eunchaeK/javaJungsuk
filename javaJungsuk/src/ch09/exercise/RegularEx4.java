package ch09.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {
	public static void main(String[] args) {
		String source = "A broken hand works, but not a broken heart.";
		String pattern = "broken";
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println("source:" + source);
		
		int i = 0;
		
		while(m.find()) {
			System.out.println(++i + "번째 매칭:" + m.start() + "~" + m.end());	// start<= <end
			//broken을 drunken으로 치환하여 sb에 저장.
			m.appendReplacement(sb, "drunken");
			System.out.println(sb.toString());
		}
		
		System.out.println("=== 치환 후 ===");
		m.appendTail(sb);
		System.out.println("Replacement count : " + i);
		System.out.println("result: "+ sb.toString());
		
	}// end main()
}
