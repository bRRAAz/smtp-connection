package com.smtp.smtp.repository;

import com.smtp.smtp.entity.SmtpProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmtpProviderRepository extends JpaRepository<SmtpProvider, Long>{
}
