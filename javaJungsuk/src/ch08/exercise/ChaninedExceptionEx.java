package ch08.exercise;

public class ChaninedExceptionEx {
	public static void main(String[] args) {
		try 
		{
			install();
		} 
		catch (InstallException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
	}// end main()
	
	static void install() throws InstallException{
		try {
			startInstall();
		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		}finally {
			deleteTempFiles();
		}
		copyFiles();
	}// end install()
	
	static void startInstall() throws SpaceException, MemoryException{
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	}// end startInstall()
	
	static void copyFiles() { /* 파일들을 복사하는 코드 */}
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드 */ }
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드 (생략)
		return true;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드 (생략)
		return false;
	}
	
}// end class ChaninedExceptionEx


class InstallException extends Exception{
	InstallException(String msg){ super(msg); }
}

class SpaceException extends Exception{
	SpaceException(String msg){ super(msg); }
}

class MemoryException extends Exception{
	MemoryException(String msg){ super(msg); }
}