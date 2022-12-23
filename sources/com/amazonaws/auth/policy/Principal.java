package com.amazonaws.auth.policy;

public class Principal {
    public static final Principal All = new Principal("*", "*");
    public static final Principal AllServices = new Principal("Service", "*");
    public static final Principal AllUsers = new Principal("AWS", "*");
    public static final Principal AllWebProviders = new Principal("Federated", "*");

    /* renamed from: id */
    private final String f6718id;
    private final String provider;

    public enum Services {
        AWSDataPipeline("datapipeline.amazonaws.com"),
        AmazonElasticTranscoder("elastictranscoder.amazonaws.com"),
        AmazonEC2("ec2.amazonaws.com"),
        AWSOpsWorks("opsworks.amazonaws.com"),
        AWSCloudHSM("cloudhsm.amazonaws.com"),
        AllServices("*");
        
        private String serviceId;

        private Services(String str) {
            this.serviceId = str;
        }

        public static Services fromString(String str) {
            if (str == null) {
                return null;
            }
            for (Services services : values()) {
                if (services.getServiceId().equalsIgnoreCase(str)) {
                    return services;
                }
            }
            return null;
        }

        public String getServiceId() {
            return this.serviceId;
        }
    }

    public enum WebIdentityProviders {
        Facebook("graph.facebook.com"),
        Google("accounts.google.com"),
        Amazon("www.amazon.com"),
        AllProviders("*");
        
        private String webIdentityProvider;

        private WebIdentityProviders(String str) {
            this.webIdentityProvider = str;
        }

        public static WebIdentityProviders fromString(String str) {
            if (str == null) {
                return null;
            }
            for (WebIdentityProviders webIdentityProviders : values()) {
                if (webIdentityProviders.getWebIdentityProvider().equalsIgnoreCase(str)) {
                    return webIdentityProviders;
                }
            }
            return null;
        }

        public String getWebIdentityProvider() {
            return this.webIdentityProvider;
        }
    }

    public Principal(Services services) {
        if (services != null) {
            this.f6718id = services.getServiceId();
            this.provider = "Service";
            return;
        }
        throw new IllegalArgumentException("Null AWS service name specified");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Principal)) {
            return false;
        }
        Principal principal = (Principal) obj;
        if (!getProvider().equals(principal.getProvider()) || !getId().equals(principal.getId())) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f6718id;
    }

    public String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return this.f6718id.hashCode() + C13715c.m34238d(this.provider, 31, 31);
    }

    public Principal(String str, String str2) {
        this.provider = str;
        this.f6718id = "AWS".equals(str) ? str2.replaceAll("-", "") : str2;
    }

    public Principal(String str) {
        if (str != null) {
            this.f6718id = str.replaceAll("-", "");
            this.provider = "AWS";
            return;
        }
        throw new IllegalArgumentException("Null AWS account ID specified");
    }

    public Principal(WebIdentityProviders webIdentityProviders) {
        if (webIdentityProviders != null) {
            this.f6718id = webIdentityProviders.getWebIdentityProvider();
            this.provider = "Federated";
            return;
        }
        throw new IllegalArgumentException("Null web identity provider specified");
    }
}
