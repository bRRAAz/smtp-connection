package com.smtp.smtp.controller;

import com.smtp.smtp.dto.EmailDTO;
import com.smtp.smtp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "smtp")
public class SmtpController {

    @Autowired
    EmailService emailService;

    @PostMapping("/send")
    public void sendEmail(@RequestBody EmailDTO data){
        emailService.sendSimpleEmail(data.getTo(), data.getSubject(), data.getText(), data.getIdConfig());
    }
}
