package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;
import java.util.List;

public class AWSCredentialsProviderChain implements AWSCredentialsProvider {
    private static final Log log = LogFactory.getLog((Class<?>) AWSCredentialsProviderChain.class);
    private List<AWSCredentialsProvider> credentialsProviders = new LinkedList();
    private AWSCredentialsProvider lastUsedProvider;
    private boolean reuseLastProvider = true;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr == null || aWSCredentialsProviderArr.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        for (AWSCredentialsProvider add : aWSCredentialsProviderArr) {
            this.credentialsProviders.add(add);
        }
    }

    public AWSCredentials getCredentials() {
        AWSCredentialsProvider aWSCredentialsProvider;
        if (this.reuseLastProvider && (aWSCredentialsProvider = this.lastUsedProvider) != null) {
            return aWSCredentialsProvider.getCredentials();
        }
        for (AWSCredentialsProvider next : this.credentialsProviders) {
            try {
                AWSCredentials credentials = next.getCredentials();
                if (!(credentials.getAWSAccessKeyId() == null || credentials.getAWSSecretKey() == null)) {
                    Log log2 = log;
                    log2.debug("Loading credentials from " + next.toString());
                    this.lastUsedProvider = next;
                    return credentials;
                }
            } catch (Exception e) {
                Log log3 = log;
                StringBuilder k = C13555b.m33972k("Unable to load credentials from ");
                k.append(next.toString());
                k.append(": ");
                k.append(e.getMessage());
                log3.debug(k.toString());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }

    public boolean getReuseLastProvider() {
        return this.reuseLastProvider;
    }

    public void refresh() {
        for (AWSCredentialsProvider refresh : this.credentialsProviders) {
            refresh.refresh();
        }
    }

    public void setReuseLastProvider(boolean z) {
        this.reuseLastProvider = z;
    }
}
