package exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Are you stupid? This duck clearly does not exist")
public class RudeDemoNotFoundException extends EntityNotFoundException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3449369987711791187L;

	public RudeDemoNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RudeDemoNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
