package jana.javaguides.SpringBootEmail.services;  // Correct package name

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {

    @Autowired  // Ensure JavaMailSender is injected
    private JavaMailSender mailSender;

    public void sendMail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);  // Fix: Set the subject correctly
        message.setText(body);
        mailSender.send(message);
    }
    public void sendwithattachment(String to, String subject, String body, String attachment)throws MessagingException 
    {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        
        helper.setTo(to);
        helper.setSubject(subject);  // Fix: Set the subject correctly
        helper.setText(body);
        helper.setTo(to);
        FileSystemResource resource = new FileSystemResource(attachment);
        helper.addAttachment(resource.getFilename(), resource);
        mailSender.send(message);
        System.out.println("mail sent with attachment....");
    }
    
}
