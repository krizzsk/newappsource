package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.InputStream;
import p001a0.C0016g;

@Deprecated
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {
    private static String defaultPropertiesFile = "AwsCredentials.properties";
    private final String credentialsFilePath;

    public ClasspathPropertiesFileCredentialsProvider() {
        this(defaultPropertiesFile);
    }

    public AWSCredentials getCredentials() {
        InputStream resourceAsStream = getClass().getResourceAsStream(this.credentialsFilePath);
        if (resourceAsStream != null) {
            try {
                return new PropertiesCredentials(resourceAsStream);
            } catch (IOException e) {
                throw new AmazonClientException(C0016g.m31o(C13555b.m33972k("Unable to load AWS credentials from the "), this.credentialsFilePath, " file on the classpath"), e);
            }
        } else {
            throw new AmazonClientException(C0016g.m31o(C13555b.m33972k("Unable to load AWS credentials from the "), this.credentialsFilePath, " file on the classpath"));
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

    public ClasspathPropertiesFileCredentialsProvider(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Credentials file path cannot be null");
        } else if (!str.startsWith("/")) {
            this.credentialsFilePath = C25541a.m63881k("/", str);
        } else {
            this.credentialsFilePath = str;
        }
    }
}
