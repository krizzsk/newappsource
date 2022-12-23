package com.amazonaws.regions;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.HashMap;
import java.util.Map;

public final class Region {
    private static final String DEFAULT_DOMAIN = "amazonaws.com";
    private final String domain;
    private final Map<String, Boolean> httpSupport = new HashMap();
    private final Map<String, Boolean> httpsSupport = new HashMap();
    private final String name;
    private final Map<String, String> serviceEndpoints = new HashMap();

    public Region(String str, String str2) {
        this.name = str;
        if (str2 == null || str2.isEmpty()) {
            this.domain = DEFAULT_DOMAIN;
        } else {
            this.domain = str2;
        }
    }

    public static Region getRegion(Regions regions) {
        return RegionUtils.getRegion(regions.getName());
    }

    public <T extends AmazonWebServiceClient> T createClient(Class<T> cls, AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        T t;
        Class<AWSCredentialsProvider> cls2 = AWSCredentialsProvider.class;
        Class<ClientConfiguration> cls3 = ClientConfiguration.class;
        if (aWSCredentialsProvider == null && clientConfiguration == null) {
            try {
                t = (AmazonWebServiceClient) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(C25541a.m63880j("Couldn't instantiate instance of ", cls), e);
            }
        } else if (aWSCredentialsProvider == null) {
            t = (AmazonWebServiceClient) cls.getConstructor(new Class[]{cls3}).newInstance(new Object[]{clientConfiguration});
        } else if (clientConfiguration == null) {
            t = (AmazonWebServiceClient) cls.getConstructor(new Class[]{cls2}).newInstance(new Object[]{aWSCredentialsProvider});
        } else {
            t = (AmazonWebServiceClient) cls.getConstructor(new Class[]{cls2, cls3}).newInstance(new Object[]{aWSCredentialsProvider, clientConfiguration});
        }
        t.setRegion(this);
        return t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Region)) {
            return false;
        }
        return getName().equals(((Region) obj).getName());
    }

    public String getDomain() {
        return this.domain;
    }

    public Map<String, Boolean> getHttpSupport() {
        return this.httpSupport;
    }

    public Map<String, Boolean> getHttpsSupport() {
        return this.httpsSupport;
    }

    public String getName() {
        return this.name;
    }

    public String getServiceEndpoint(String str) {
        return this.serviceEndpoints.get(str);
    }

    public Map<String, String> getServiceEndpoints() {
        return this.serviceEndpoints;
    }

    public boolean hasHttpEndpoint(String str) {
        return this.httpSupport.containsKey(str) && this.httpSupport.get(str).booleanValue();
    }

    public boolean hasHttpsEndpoint(String str) {
        return this.httpsSupport.containsKey(str) && this.httpsSupport.get(str).booleanValue();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isServiceSupported(String str) {
        return this.serviceEndpoints.containsKey(str);
    }

    public String toString() {
        return getName();
    }

    public static Region getRegion(String str) {
        return RegionUtils.getRegion(str);
    }
}
