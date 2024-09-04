package com.capstone.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class NotifyController {

    @Autowired
    private NotifyService emailService;

    @GetMapping("/greet")
    public String greetFunction(){
        return "greet message";
    }

    @PostMapping("/send")
    public void sendNotification(@RequestBody NotifyModel notification) {
        emailService.sendEmail(notification);
//        return "Email sent to " + notification.getEmail();
    }

}
