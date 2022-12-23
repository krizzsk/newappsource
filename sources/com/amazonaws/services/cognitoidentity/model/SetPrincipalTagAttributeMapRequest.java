package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SetPrincipalTagAttributeMapRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityPoolId;
    private String identityProviderName;
    private Map<String, String> principalTags;
    private Boolean useDefaults;

    public SetPrincipalTagAttributeMapRequest addPrincipalTagsEntry(String str, String str2) {
        if (this.principalTags == null) {
            this.principalTags = new HashMap();
        }
        if (!this.principalTags.containsKey(str)) {
            this.principalTags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public SetPrincipalTagAttributeMapRequest clearPrincipalTagsEntries() {
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SetPrincipalTagAttributeMapRequest)) {
            return false;
        }
        SetPrincipalTagAttributeMapRequest setPrincipalTagAttributeMapRequest = (SetPrincipalTagAttributeMapRequest) obj;
        if (setPrincipalTagAttributeMapRequest.getIdentityPoolId() == null) {
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
        if (setPrincipalTagAttributeMapRequest.getIdentityPoolId() != null && !setPrincipalTagAttributeMapRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (setPrincipalTagAttributeMapRequest.getIdentityProviderName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getIdentityProviderName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (setPrincipalTagAttributeMapRequest.getIdentityProviderName() != null && !setPrincipalTagAttributeMapRequest.getIdentityProviderName().equals(getIdentityProviderName())) {
            return false;
        }
        if (setPrincipalTagAttributeMapRequest.getUseDefaults() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getUseDefaults() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (setPrincipalTagAttributeMapRequest.getUseDefaults() != null && !setPrincipalTagAttributeMapRequest.getUseDefaults().equals(getUseDefaults())) {
            return false;
        }
        if (setPrincipalTagAttributeMapRequest.getPrincipalTags() == null) {
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
        if (setPrincipalTagAttributeMapRequest.getPrincipalTags() == null || setPrincipalTagAttributeMapRequest.getPrincipalTags().equals(getPrincipalTags())) {
            return true;
        }
        return false;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public Map<String, String> getPrincipalTags() {
        return this.principalTags;
    }

    public Boolean getUseDefaults() {
        return this.useDefaults;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getIdentityPoolId() == null) {
            i = 0;
        } else {
            i = getIdentityPoolId().hashCode();
        }
        int i5 = (i + 31) * 31;
        if (getIdentityProviderName() == null) {
            i2 = 0;
        } else {
            i2 = getIdentityProviderName().hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (getUseDefaults() == null) {
            i3 = 0;
        } else {
            i3 = getUseDefaults().hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (getPrincipalTags() != null) {
            i4 = getPrincipalTags().hashCode();
        }
        return i7 + i4;
    }

    public Boolean isUseDefaults() {
        return this.useDefaults;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setIdentityProviderName(String str) {
        this.identityProviderName = str;
    }

    public void setPrincipalTags(Map<String, String> map) {
        this.principalTags = map;
    }

    public void setUseDefaults(Boolean bool) {
        this.useDefaults = bool;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityPoolId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityPoolId: ");
            k2.append(getIdentityPoolId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getIdentityProviderName() != null) {
            StringBuilder k3 = C13555b.m33972k("IdentityProviderName: ");
            k3.append(getIdentityProviderName());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getUseDefaults() != null) {
            StringBuilder k4 = C13555b.m33972k("UseDefaults: ");
            k4.append(getUseDefaults());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getPrincipalTags() != null) {
            StringBuilder k5 = C13555b.m33972k("PrincipalTags: ");
            k5.append(getPrincipalTags());
            k.append(k5.toString());
        }
        k.append("}");
        return k.toString();
    }

    public SetPrincipalTagAttributeMapRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public SetPrincipalTagAttributeMapRequest withIdentityProviderName(String str) {
        this.identityProviderName = str;
        return this;
    }

    public SetPrincipalTagAttributeMapRequest withPrincipalTags(Map<String, String> map) {
        this.principalTags = map;
        return this;
    }

    public SetPrincipalTagAttributeMapRequest withUseDefaults(Boolean bool) {
        this.useDefaults = bool;
        return this;
    }
}
