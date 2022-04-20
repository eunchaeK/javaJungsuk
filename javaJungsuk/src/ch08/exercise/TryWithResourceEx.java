package ch08.exercise;

public class TryWithResourceEx {
	public static void main(String[] args) {
		try(CloseableResource cr = new CloseableResource()) 
		{
			cr.exceptionWork(false);	// 예외가 발생하지 않는다.
		} 
		catch (WorkException e) {e.printStackTrace();}
		catch (CloseException e) {e.printStackTrace();}
		
		System.out.println();
		
		try(CloseableResource cr = new CloseableResource()) 
		{
			cr.exceptionWork(true);	// 예외가 발생.
		} 
		catch (WorkException e) {e.printStackTrace();}
		catch (CloseException e) {e.printStackTrace();}
	}// end main()
	
	
}// end TryWithResourceEx

class CloseableResource implements AutoCloseable{
	public void exceptionWork(boolean exception) throws WorkException
	{
		System.out.println("exceptionWork("+exception+")가 호출됨.");
		
		if(exception)
			throw new WorkException("WorkException 발생!!");
	}

	@Override
	public void close() throws CloseException 
	{
		System.out.println("close()가 호출됨.");
		throw new CloseException("CloseException 발생!!");
	}
}// end CloseableResource


class WorkException extends Exception{
	WorkException(String msg){ super(msg); }
}


class CloseException extends Exception{
	CloseException(String msg){ super(msg); }
}
