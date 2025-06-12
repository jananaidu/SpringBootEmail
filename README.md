📧 Spring Boot – Email Sending Service with Attachments
A robust and modular email notification system built using Spring Boot. This backend utility supports sending:

✅ Plain text messages

📄 Text file (.txt) attachments

📑 PDF file attachments

The system is designed to be flexible and easily integrated with various application modules such as user onboarding, reporting, alerting, or ticketing. It can serve both internal operations and customer communication workflows.

🔧 Key Technical Highlights:
1.Utilized JavaMailSender and MimeMessageHelper to create multipart email content with attachments.

2.Centralized SMTP configuration in application.properties for flexible deployments (Dev, UAT, Prod).

3.Developed utility methods to convert dynamic content into PDF/text files before sending.

4.Added optional support for HTML email bodies for better formatting.

5.Implemented robust exception handling to handle failures like SMTP issues or invalid recipients.

6.Logged all transactions using SLF4J to support monitoring and debugging.

🛠️ Tech Stack:
1.Java 8+

2.Spring Boot

3.Spring Boot Starter MailSLF4J Logging

4.SMTP (Gmail, Outlook, etc.)

💡 Outcome & Impact

https://github.com/user-attachments/assets/69325080-35a9-4b9b-9c86-7bdc90867f1b

![Screenshot 2025-06-10 130449](https://github.com/user-attachments/assets/d13fff40-17e7-41d8-b434-5fa8b530ac22)
![Screenshot 2025-06-10 130403](https://github.com/user-attachments/assets/5b7c8761-24bc-4550-88ef-31a190535c90)
