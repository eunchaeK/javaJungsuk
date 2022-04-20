package ch08.exercise;

import java.io.File;

public class ExceptionEx16 {
	public static void main(String[] args) {
		File f;
		
		try 
		{
			f = createFile(args[0]);
			System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	}// end main()
	
	static File createFile(String fileName) throws Exception{
		
		if(fileName==null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");
	
		File f = new File(fileName);
		f.createNewFile();
		return f;		
		
	}// end createFile()

	
}// end class
