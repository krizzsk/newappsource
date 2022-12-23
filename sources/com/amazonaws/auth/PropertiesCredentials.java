package com.amazonaws.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesCredentials implements AWSCredentials {
    private final String accessKey;
    private final String secretAccessKey;

    public PropertiesCredentials(File file) throws IOException {
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                    throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") doesn't contain the expected properties 'accessKey' and 'secretKey'.");
                }
                this.accessKey = properties.getProperty("accessKey");
                this.secretAccessKey = properties.getProperty("secretKey");
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            StringBuilder k = C13555b.m33972k("File doesn't exist:  ");
            k.append(file.getAbsolutePath());
            throw new FileNotFoundException(k.toString());
        }
    }

    public String getAWSAccessKeyId() {
        return this.accessKey;
    }

    public String getAWSSecretKey() {
        return this.secretAccessKey;
    }

    public PropertiesCredentials(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                throw new IllegalArgumentException("The specified properties data doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            }
            this.accessKey = properties.getProperty("accessKey");
            this.secretAccessKey = properties.getProperty("secretKey");
        } finally {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
