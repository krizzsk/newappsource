package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class LookupDeveloperIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    private String developerUserIdentifier;
    private String identityId;
    private String identityPoolId;
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LookupDeveloperIdentityRequest)) {
            return false;
        }
        LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest = (LookupDeveloperIdentityRequest) obj;
        if (lookupDeveloperIdentityRequest.getIdentityPoolId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityPoolId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getIdentityPoolId() != null && !lookupDeveloperIdentityRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getIdentityId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getIdentityId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getIdentityId() != null && !lookupDeveloperIdentityRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getDeveloperUserIdentifier() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getDeveloperUserIdentifier() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getDeveloperUserIdentifier() != null && !lookupDeveloperIdentityRequest.getDeveloperUserIdentifier().equals(getDeveloperUserIdentifier())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getMaxResults() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getMaxResults() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getMaxResults() != null && !lookupDeveloperIdentityRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getNextToken() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getNextToken() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.getNextToken() == null || lookupDeveloperIdentityRequest.getNextToken().equals(getNextToken())) {
            return true;
        }
        return false;
    }

    public String getDeveloperUserIdentifier() {
        return this.developerUserIdentifier;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (getIdentityPoolId() == null) {
            i = 0;
        } else {
            i = getIdentityPoolId().hashCode();
        }
        int i6 = (i + 31) * 31;
        if (getIdentityId() == null) {
            i2 = 0;
        } else {
            i2 = getIdentityId().hashCode();
        }
        int i7 = (i6 + i2) * 31;
        if (getDeveloperUserIdentifier() == null) {
            i3 = 0;
        } else {
            i3 = getDeveloperUserIdentifier().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getMaxResults() == null) {
            i4 = 0;
        } else {
            i4 = getMaxResults().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getNextToken() != null) {
            i5 = getNextToken().hashCode();
        }
        return i9 + i5;
    }

    public void setDeveloperUserIdentifier(String str) {
        this.developerUserIdentifier = str;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityPoolId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityPoolId: ");
            k2.append(getIdentityPoolId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getIdentityId() != null) {
            StringBuilder k3 = C13555b.m33972k("IdentityId: ");
            k3.append(getIdentityId());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getDeveloperUserIdentifier() != null) {
            StringBuilder k4 = C13555b.m33972k("DeveloperUserIdentifier: ");
            k4.append(getDeveloperUserIdentifier());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getMaxResults() != null) {
            StringBuilder k5 = C13555b.m33972k("MaxResults: ");
            k5.append(getMaxResults());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getNextToken() != null) {
            StringBuilder k6 = C13555b.m33972k("NextToken: ");
            k6.append(getNextToken());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public LookupDeveloperIdentityRequest withDeveloperUserIdentifier(String str) {
        this.developerUserIdentifier = str;
        return this;
    }

    public LookupDeveloperIdentityRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public LookupDeveloperIdentityRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public LookupDeveloperIdentityRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public LookupDeveloperIdentityRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
