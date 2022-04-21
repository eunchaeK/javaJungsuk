package ch08.practice;

public class Exercise8_9 {
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100); 
	}
}// end class

class  UnsupportedFuctionException extends RuntimeException{
	
	private final int ERR_CODE;
	
	UnsupportedFuctionException(String msg) {
		this(msg,100);
	}
	
	UnsupportedFuctionException(String msg, int code){ 
		super(msg); 
		ERR_CODE = code;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + getErrorCode() +"]" + super.getMessage();
	}
}
