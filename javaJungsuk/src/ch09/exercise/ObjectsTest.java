package ch09.exercise;

import static java.util.Objects.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ObjectsTest {
	public static void main(String[] args) {
		String[][] str2D = new String[][] {{"aaa,bbb"},{"AAA", "BBB"}};
		String[][] str2D_2 = new String[][] {{"aaa,bbb"},{"AAA", "BBB"}};
		
		System.out.print("str2D = {");
		
		for(String[] tmp : str2D)
			System.out.print(Arrays.toString(tmp));
		System.out.println("}");	// str2D = {[aaa,bbb][AAA, BBB]}
		
		System.out.print("str2D_2={");
		for(String[] tmp : str2D_2)
			System.out.print(Arrays.toString(tmp));
		System.out.println("}");	// str2D_2={[aaa,bbb][AAA, BBB]}

		System.out.println("equals(str2D, str2D_2)="
						+ Objects.equals(str2D, str2D_2));	// equals(str2D, str2D_2)=false
		
		System.out.println("deepEquals(str2D, str2D_2)="
				   + Objects.deepEquals(str2D, str2D_2));	// deepEquals(str2D, str2D_2)=true
		
		System.out.println("isNull(null)=" + isNull(null));		// isNull(null)=true
		System.out.println("nonNull(null)=" + nonNull(null));	// nonNull(null)=false
		System.out.println("hashCode(null)=" + Objects.hashCode(null));	// hashCode(null)=0
		System.out.println("toString(null)=" + Objects.toString(null)); // toString(null)=null
		System.out.println("toString(null, \"\")="
							+ Objects.toString(null, ""));	// toString(null, "")=
		
		Comparator c = String.CASE_INSENSITIVE_ORDER; 	// 대소문자 구분 안 하는 비교 
		
		// compare("aa","bb")=-1
		System.out.println("compare(\"aa\",\"bb\")=" + compare("aa", "bb", c));	
		// compare("bb","aa")=1
		System.out.println("compare(\"bb\",\"aa\")=" + compare("bb", "aa", c));
		// compare("ab","AB")=0
		System.out.println("compare(\"ab\",\"AB\")=" + compare("ab", "AB", c));
		
		
	}// end main()
}
