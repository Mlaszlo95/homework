package exceptions;

@SuppressWarnings("serial")
public class WMinPaymException extends Exception{
	@Override
	public String getMessage() {
		System.out.println(" FizetÚsmel 138000 felett kell lennie!");
		return super.getMessage();
	}
	@Override
	public void printStackTrace() {
		System.out.println(" FizetÚsmel 138000 felett kell lennie!");
		super.printStackTrace();
	}
}
