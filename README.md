📧 Spring Boot – Email Sending Service with Attachments
A robust and modular email notification system built using Spring Boot. This backend utility supports sending:

✅ Plain text messages

📄 Text file (.txt) attachments

📑 PDF file attachments

The system is designed to be flexible and easily integrated with various application modules such as user onboarding, reporting, alerting, or ticketing. It can serve both internal operations and customer communication workflows.

🔧 Key Technical Highlights
Utilized JavaMailSender and MimeMessageHelper to create multipart email content with attachments.

Centralized SMTP configuration in application.properties for flexible deployments (Dev, UAT, Prod).

Developed utility methods to convert dynamic content into PDF/text files before sending.

Added optional support for HTML email bodies for better formatting.

Implemented robust exception handling to handle failures like SMTP issues or invalid recipients.

Logged all transactions using SLF4J to support monitoring and debugging.

💡 Outcome & Impact

https://github.com/user-attachments/assets/69325080-35a9-4b9b-9c86-7bdc90867f1b


⏱️ Automated email workflows, reducing manual intervention.

📬 Enabled delivery of formatted, file-based communications.

🔁 Improved reusability and maintainability through clean design.

🔗 Seamlessly integrated with other REST APIs and microservices.

🛠️ Tech Stack
Java 8+

Spring Boot

Spring Boot Starter Mail

SLF4J Logging

SMTP (Gmail, Outlook, etc.)

