package com.smtp.smtp.config;

import io.github.cdimascio.dotenv.Dotenv;

public class EnviromentManager {
    private static EnviromentManager instance;
    private Dotenv dotenv;

    private EnviromentManager(){
        dotenv = Dotenv.load();
    }

    public static EnviromentManager getInstance(){
        if (instance == null){
            instance = new EnviromentManager();
        }
        return instance;
    }
    public String getEnv(String key){
        return dotenv.get(key);
    }
}
