package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GetOpenIdTokenForDeveloperIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityId;
    private String identityPoolId;
    private Map<String, String> logins;
    private Map<String, String> principalTags;
    private Long tokenDuration;

    public GetOpenIdTokenForDeveloperIdentityRequest addLoginsEntry(String str, String str2) {
        if (this.logins == null) {
            this.logins = new HashMap();
        }
        if (!this.logins.containsKey(str)) {
            this.logins.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public GetOpenIdTokenForDeveloperIdentityRequest addPrincipalTagsEntry(String str, String str2) {
        if (this.principalTags == null) {
            this.principalTags = new HashMap();
        }
        if (!this.principalTags.containsKey(str)) {
            this.principalTags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public GetOpenIdTokenForDeveloperIdentityRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest clearPrincipalTagsEntries() {
        this.principalTags = null;
        return this;
    }

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
        if (obj == null || !(obj instanceof GetOpenIdTokenForDeveloperIdentityRequest)) {
            return false;
        }
        GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest = (GetOpenIdTokenForDeveloperIdentityRequest) obj;
        if (getOpenIdTokenForDeveloperIdentityRequest.getIdentityPoolId() == null) {
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
        if (getOpenIdTokenForDeveloperIdentityRequest.getIdentityPoolId() != null && !getOpenIdTokenForDeveloperIdentityRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.getIdentityId() == null) {
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
        if (getOpenIdTokenForDeveloperIdentityRequest.getIdentityId() != null && !getOpenIdTokenForDeveloperIdentityRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.getLogins() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getLogins() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.getLogins() != null && !getOpenIdTokenForDeveloperIdentityRequest.getLogins().equals(getLogins())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.getPrincipalTags() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getPrincipalTags() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.getPrincipalTags() != null && !getOpenIdTokenForDeveloperIdentityRequest.getPrincipalTags().equals(getPrincipalTags())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.getTokenDuration() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getTokenDuration() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.getTokenDuration() == null || getOpenIdTokenForDeveloperIdentityRequest.getTokenDuration().equals(getTokenDuration())) {
            return true;
        }
        return false;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public Map<String, String> getLogins() {
        return this.logins;
    }

    public Map<String, String> getPrincipalTags() {
        return this.principalTags;
    }

    public Long getTokenDuration() {
        return this.tokenDuration;
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
        if (getLogins() == null) {
            i3 = 0;
        } else {
            i3 = getLogins().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getPrincipalTags() == null) {
            i4 = 0;
        } else {
            i4 = getPrincipalTags().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getTokenDuration() != null) {
            i5 = getTokenDuration().hashCode();
        }
        return i9 + i5;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setLogins(Map<String, String> map) {
        this.logins = map;
    }

    public void setPrincipalTags(Map<String, String> map) {
        this.principalTags = map;
    }

    public void setTokenDuration(Long l) {
        this.tokenDuration = l;
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
        if (getLogins() != null) {
            StringBuilder k4 = C13555b.m33972k("Logins: ");
            k4.append(getLogins());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getPrincipalTags() != null) {
            StringBuilder k5 = C13555b.m33972k("PrincipalTags: ");
            k5.append(getPrincipalTags());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getTokenDuration() != null) {
            StringBuilder k6 = C13555b.m33972k("TokenDuration: ");
            k6.append(getTokenDuration());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest withLogins(Map<String, String> map) {
        this.logins = map;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest withPrincipalTags(Map<String, String> map) {
        this.principalTags = map;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest withTokenDuration(Long l) {
        this.tokenDuration = l;
        return this;
    }
}
