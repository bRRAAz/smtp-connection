package com.smtp.smtp.service;

import com.smtp.smtp.entity.SmtpProvider;
import com.smtp.smtp.repository.SmtpProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class SmtpService {
    @Autowired
    SmtpProviderRepository smtpProviderRepository;

    @Autowired
    JavaMailSenderImpl javaMailSenderImpl;

    public void setSmtpConfig(Long id){
        SmtpProvider smtpProvider = smtpProviderRepository.findById(id).orElseThrow();
        javaMailSenderImpl.setHost(smtpProvider.getHost());
        javaMailSenderImpl.setPort(smtpProvider.getPort());
        javaMailSenderImpl.setUsername(smtpProvider.getUsername());
        javaMailSenderImpl.setPassword(smtpProvider.getPassword());
    }
}
