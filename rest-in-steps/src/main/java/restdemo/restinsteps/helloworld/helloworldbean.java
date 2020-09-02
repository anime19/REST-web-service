package restdemo.restinsteps.helloworld;

public class helloworldbean {
	private String message;

	public helloworldbean(String message) {
		//super();
		this.message = message;
	}

//	public void setMessage(String message) {
//		this.message = message;
//	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "helloworldbean [message=" + message + "]";
	}
	
	 

}
