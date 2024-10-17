package com.smtp.smtp.entity;

import jakarta.persistence.*;

@Entity
public class SmtpProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "provider_name")
    private String providerName;
    private String host;
    private String username;
    private String password;
    private Integer port;

    public SmtpProvider(long id, String providerName, String host, String username, String password, Integer port) {
        this.id = id;
        this.providerName = providerName;
        this.host = host;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public SmtpProvider() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
