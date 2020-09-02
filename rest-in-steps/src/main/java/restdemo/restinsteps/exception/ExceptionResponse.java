package restdemo.restinsteps.exception;
import java.util.Date;
public class ExceptionResponse {
 //timestamp
	//messgae
	//details
	
	private Date timestamp;
	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	private String message;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
	super();
	this.timestamp = timestamp;
	this.message = message;
	this.details = details;
}

}
