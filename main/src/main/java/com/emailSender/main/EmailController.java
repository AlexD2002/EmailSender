package com.emailSender.main;

import com.emailSender.main.EmailService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")

public class EmailController {
    private final EmailService emailService;
public EmailController(EmailService emailService){
    this.emailService = emailService;
}
    @PostMapping
    public void sendEmail(@RequestBody Email email){
       emailService.sendEmail(email);
    }
}
