package jana.javaguides.SpringBootEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.MailException;

import jakarta.mail.MessagingException;
import jana.javaguides.SpringBootEmail.services.MailService;  // Correct package name

@SpringBootApplication
public class SpringBootEmailApplication {
	
	@Autowired
	private MailService mailService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailApplication.class, args);
		System.out.println("Successfully executed....");
	}

	@EventListener(ApplicationReadyEvent.class) 
	public void triggerMail() throws MessagingException 
	{
		mailService.sendMail("jana123janardhan@gmail.com", "janardhan naidu", "hi msg sending using spring boot application");
		mailService.sendwithattachment("jana123janardhan@gmail.com", "pdf", "email sending with attachment using spring boot application", "C:\\gajendra_cv.pdf");
		mailService.sendwithattachment("jana123janardhan@gmail.com", "txt file", "email sending with attachment using spring boot application", "C:\\jana.txt");
	}
}
