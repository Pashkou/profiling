package siarhei.pashkou.exception;

public class BasicException extends Exception {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public BasicException(String message){
		super(message);
		msg = message;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
