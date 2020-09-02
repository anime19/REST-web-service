package restdemo.restinsteps.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
	
	@Autowired
	private MessageSource messageSource;
	
     @GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hell";
	}
     
     @GetMapping(path="/hello-world-bean")
 	public helloworldbean helloWorldBean() {
 		return new helloworldbean("Hello");
 	}
      
     @GetMapping(path="/hello-world/path-variable/{name}")
  	public helloworldbean helloWorldBean(@PathVariable  String name) {
  		return new helloworldbean(String.format("Hello, %s",name));
  	}
     @GetMapping(path = "/hello-world-internationalized")
 	public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
    	 return messageSource.getMessage("good.morning.message", null, locale);  

 	}  
}
