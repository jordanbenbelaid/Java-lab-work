package exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "A duck was not found!")  	//makrs a method of a class with a message/status code
public class DemoNotFoundException extends EntityNotFoundException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 5328690832935399935L;

	public DemoNotFoundException() {
		super();		//calls entitynotfoundexception
		// TODO Auto-generated constructor stub
	}

	public DemoNotFoundException(String message) {
		super(message); 			//calls entitynotfoundexception(String message)
		// TODO Auto-generated constructor stub
	}

}
