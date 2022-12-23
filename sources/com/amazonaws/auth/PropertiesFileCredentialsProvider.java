package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.File;
import java.io.IOException;
import p001a0.C0016g;

public class PropertiesFileCredentialsProvider implements AWSCredentialsProvider {
    private final String credentialsFilePath;

    public PropertiesFileCredentialsProvider(String str) {
        if (str != null) {
            this.credentialsFilePath = str;
            return;
        }
        throw new IllegalArgumentException("Credentials file path cannot be null");
    }

    public AWSCredentials getCredentials() {
        try {
            return new PropertiesCredentials(new File(this.credentialsFilePath));
        } catch (IOException e) {
            throw new AmazonClientException(C0016g.m31o(C13555b.m33972k("Unable to load AWS credentials from the "), this.credentialsFilePath, " file"), e);
        }
    }

    public void refresh() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        return C0016g.m31o(sb, this.credentialsFilePath, ")");
    }
}
