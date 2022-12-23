package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateIdentityPoolRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean allowClassicFlow;
    private Boolean allowUnauthenticatedIdentities;
    private List<CognitoIdentityProvider> cognitoIdentityProviders;
    private String developerProviderName;
    private String identityPoolId;
    private String identityPoolName;
    private Map<String, String> identityPoolTags;
    private List<String> openIdConnectProviderARNs;
    private List<String> samlProviderARNs;
    private Map<String, String> supportedLoginProviders;

    public UpdateIdentityPoolRequest addIdentityPoolTagsEntry(String str, String str2) {
        if (this.identityPoolTags == null) {
            this.identityPoolTags = new HashMap();
        }
        if (!this.identityPoolTags.containsKey(str)) {
            this.identityPoolTags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public UpdateIdentityPoolRequest addSupportedLoginProvidersEntry(String str, String str2) {
        if (this.supportedLoginProviders == null) {
            this.supportedLoginProviders = new HashMap();
        }
        if (!this.supportedLoginProviders.containsKey(str)) {
            this.supportedLoginProviders.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public UpdateIdentityPoolRequest clearIdentityPoolTagsEntries() {
        this.identityPoolTags = null;
        return this;
    }

    public UpdateIdentityPoolRequest clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
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
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateIdentityPoolRequest)) {
            return false;
        }
        UpdateIdentityPoolRequest updateIdentityPoolRequest = (UpdateIdentityPoolRequest) obj;
        if (updateIdentityPoolRequest.getIdentityPoolId() == null) {
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
        if (updateIdentityPoolRequest.getIdentityPoolId() != null && !updateIdentityPoolRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (updateIdentityPoolRequest.getIdentityPoolName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getIdentityPoolName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (updateIdentityPoolRequest.getIdentityPoolName() != null && !updateIdentityPoolRequest.getIdentityPoolName().equals(getIdentityPoolName())) {
            return false;
        }
        if (updateIdentityPoolRequest.getAllowUnauthenticatedIdentities() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getAllowUnauthenticatedIdentities() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (updateIdentityPoolRequest.getAllowUnauthenticatedIdentities() != null && !updateIdentityPoolRequest.getAllowUnauthenticatedIdentities().equals(getAllowUnauthenticatedIdentities())) {
            return false;
        }
        if (updateIdentityPoolRequest.getAllowClassicFlow() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getAllowClassicFlow() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (updateIdentityPoolRequest.getAllowClassicFlow() != null && !updateIdentityPoolRequest.getAllowClassicFlow().equals(getAllowClassicFlow())) {
            return false;
        }
        if (updateIdentityPoolRequest.getSupportedLoginProviders() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getSupportedLoginProviders() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (updateIdentityPoolRequest.getSupportedLoginProviders() != null && !updateIdentityPoolRequest.getSupportedLoginProviders().equals(getSupportedLoginProviders())) {
            return false;
        }
        if (updateIdentityPoolRequest.getDeveloperProviderName() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getDeveloperProviderName() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (updateIdentityPoolRequest.getDeveloperProviderName() != null && !updateIdentityPoolRequest.getDeveloperProviderName().equals(getDeveloperProviderName())) {
            return false;
        }
        if (updateIdentityPoolRequest.getOpenIdConnectProviderARNs() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getOpenIdConnectProviderARNs() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (updateIdentityPoolRequest.getOpenIdConnectProviderARNs() != null && !updateIdentityPoolRequest.getOpenIdConnectProviderARNs().equals(getOpenIdConnectProviderARNs())) {
            return false;
        }
        if (updateIdentityPoolRequest.getCognitoIdentityProviders() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (getCognitoIdentityProviders() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 ^ z17) {
            return false;
        }
        if (updateIdentityPoolRequest.getCognitoIdentityProviders() != null && !updateIdentityPoolRequest.getCognitoIdentityProviders().equals(getCognitoIdentityProviders())) {
            return false;
        }
        if (updateIdentityPoolRequest.getSamlProviderARNs() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (getSamlProviderARNs() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 ^ z19) {
            return false;
        }
        if (updateIdentityPoolRequest.getSamlProviderARNs() != null && !updateIdentityPoolRequest.getSamlProviderARNs().equals(getSamlProviderARNs())) {
            return false;
        }
        if (updateIdentityPoolRequest.getIdentityPoolTags() == null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (getIdentityPoolTags() == null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z21 ^ z22) {
            return false;
        }
        if (updateIdentityPoolRequest.getIdentityPoolTags() == null || updateIdentityPoolRequest.getIdentityPoolTags().equals(getIdentityPoolTags())) {
            return true;
        }
        return false;
    }

    public Boolean getAllowClassicFlow() {
        return this.allowClassicFlow;
    }

    public Boolean getAllowUnauthenticatedIdentities() {
        return this.allowUnauthenticatedIdentities;
    }

    public List<CognitoIdentityProvider> getCognitoIdentityProviders() {
        return this.cognitoIdentityProviders;
    }

    public String getDeveloperProviderName() {
        return this.developerProviderName;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getIdentityPoolName() {
        return this.identityPoolName;
    }

    public Map<String, String> getIdentityPoolTags() {
        return this.identityPoolTags;
    }

    public List<String> getOpenIdConnectProviderARNs() {
        return this.openIdConnectProviderARNs;
    }

    public List<String> getSamlProviderARNs() {
        return this.samlProviderARNs;
    }

    public Map<String, String> getSupportedLoginProviders() {
        return this.supportedLoginProviders;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11 = 0;
        if (getIdentityPoolId() == null) {
            i = 0;
        } else {
            i = getIdentityPoolId().hashCode();
        }
        int i12 = (i + 31) * 31;
        if (getIdentityPoolName() == null) {
            i2 = 0;
        } else {
            i2 = getIdentityPoolName().hashCode();
        }
        int i13 = (i12 + i2) * 31;
        if (getAllowUnauthenticatedIdentities() == null) {
            i3 = 0;
        } else {
            i3 = getAllowUnauthenticatedIdentities().hashCode();
        }
        int i14 = (i13 + i3) * 31;
        if (getAllowClassicFlow() == null) {
            i4 = 0;
        } else {
            i4 = getAllowClassicFlow().hashCode();
        }
        int i15 = (i14 + i4) * 31;
        if (getSupportedLoginProviders() == null) {
            i5 = 0;
        } else {
            i5 = getSupportedLoginProviders().hashCode();
        }
        int i16 = (i15 + i5) * 31;
        if (getDeveloperProviderName() == null) {
            i6 = 0;
        } else {
            i6 = getDeveloperProviderName().hashCode();
        }
        int i17 = (i16 + i6) * 31;
        if (getOpenIdConnectProviderARNs() == null) {
            i7 = 0;
        } else {
            i7 = getOpenIdConnectProviderARNs().hashCode();
        }
        int i18 = (i17 + i7) * 31;
        if (getCognitoIdentityProviders() == null) {
            i8 = 0;
        } else {
            i8 = getCognitoIdentityProviders().hashCode();
        }
        int i19 = (i18 + i8) * 31;
        if (getSamlProviderARNs() == null) {
            i9 = 0;
        } else {
            i9 = getSamlProviderARNs().hashCode();
        }
        int i21 = (i19 + i9) * 31;
        if (getIdentityPoolTags() != null) {
            i11 = getIdentityPoolTags().hashCode();
        }
        return i21 + i11;
    }

    public Boolean isAllowClassicFlow() {
        return this.allowClassicFlow;
    }

    public Boolean isAllowUnauthenticatedIdentities() {
        return this.allowUnauthenticatedIdentities;
    }

    public void setAllowClassicFlow(Boolean bool) {
        this.allowClassicFlow = bool;
    }

    public void setAllowUnauthenticatedIdentities(Boolean bool) {
        this.allowUnauthenticatedIdentities = bool;
    }

    public void setCognitoIdentityProviders(Collection<CognitoIdentityProvider> collection) {
        if (collection == null) {
            this.cognitoIdentityProviders = null;
        } else {
            this.cognitoIdentityProviders = new ArrayList(collection);
        }
    }

    public void setDeveloperProviderName(String str) {
        this.developerProviderName = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setIdentityPoolName(String str) {
        this.identityPoolName = str;
    }

    public void setIdentityPoolTags(Map<String, String> map) {
        this.identityPoolTags = map;
    }

    public void setOpenIdConnectProviderARNs(Collection<String> collection) {
        if (collection == null) {
            this.openIdConnectProviderARNs = null;
        } else {
            this.openIdConnectProviderARNs = new ArrayList(collection);
        }
    }

    public void setSamlProviderARNs(Collection<String> collection) {
        if (collection == null) {
            this.samlProviderARNs = null;
        } else {
            this.samlProviderARNs = new ArrayList(collection);
        }
    }

    public void setSupportedLoginProviders(Map<String, String> map) {
        this.supportedLoginProviders = map;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityPoolId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityPoolId: ");
            k2.append(getIdentityPoolId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getIdentityPoolName() != null) {
            StringBuilder k3 = C13555b.m33972k("IdentityPoolName: ");
            k3.append(getIdentityPoolName());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getAllowUnauthenticatedIdentities() != null) {
            StringBuilder k4 = C13555b.m33972k("AllowUnauthenticatedIdentities: ");
            k4.append(getAllowUnauthenticatedIdentities());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getAllowClassicFlow() != null) {
            StringBuilder k5 = C13555b.m33972k("AllowClassicFlow: ");
            k5.append(getAllowClassicFlow());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getSupportedLoginProviders() != null) {
            StringBuilder k6 = C13555b.m33972k("SupportedLoginProviders: ");
            k6.append(getSupportedLoginProviders());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getDeveloperProviderName() != null) {
            StringBuilder k7 = C13555b.m33972k("DeveloperProviderName: ");
            k7.append(getDeveloperProviderName());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getOpenIdConnectProviderARNs() != null) {
            StringBuilder k8 = C13555b.m33972k("OpenIdConnectProviderARNs: ");
            k8.append(getOpenIdConnectProviderARNs());
            k8.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k8.toString());
        }
        if (getCognitoIdentityProviders() != null) {
            StringBuilder k9 = C13555b.m33972k("CognitoIdentityProviders: ");
            k9.append(getCognitoIdentityProviders());
            k9.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k9.toString());
        }
        if (getSamlProviderARNs() != null) {
            StringBuilder k11 = C13555b.m33972k("SamlProviderARNs: ");
            k11.append(getSamlProviderARNs());
            k11.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k11.toString());
        }
        if (getIdentityPoolTags() != null) {
            StringBuilder k12 = C13555b.m33972k("IdentityPoolTags: ");
            k12.append(getIdentityPoolTags());
            k.append(k12.toString());
        }
        k.append("}");
        return k.toString();
    }

    public UpdateIdentityPoolRequest withAllowClassicFlow(Boolean bool) {
        this.allowClassicFlow = bool;
        return this;
    }

    public UpdateIdentityPoolRequest withAllowUnauthenticatedIdentities(Boolean bool) {
        this.allowUnauthenticatedIdentities = bool;
        return this;
    }

    public UpdateIdentityPoolRequest withCognitoIdentityProviders(CognitoIdentityProvider... cognitoIdentityProviderArr) {
        if (getCognitoIdentityProviders() == null) {
            this.cognitoIdentityProviders = new ArrayList(cognitoIdentityProviderArr.length);
        }
        for (CognitoIdentityProvider add : cognitoIdentityProviderArr) {
            this.cognitoIdentityProviders.add(add);
        }
        return this;
    }

    public UpdateIdentityPoolRequest withDeveloperProviderName(String str) {
        this.developerProviderName = str;
        return this;
    }

    public UpdateIdentityPoolRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public UpdateIdentityPoolRequest withIdentityPoolName(String str) {
        this.identityPoolName = str;
        return this;
    }

    public UpdateIdentityPoolRequest withIdentityPoolTags(Map<String, String> map) {
        this.identityPoolTags = map;
        return this;
    }

    public UpdateIdentityPoolRequest withOpenIdConnectProviderARNs(String... strArr) {
        if (getOpenIdConnectProviderARNs() == null) {
            this.openIdConnectProviderARNs = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.openIdConnectProviderARNs.add(add);
        }
        return this;
    }

    public UpdateIdentityPoolRequest withSamlProviderARNs(String... strArr) {
        if (getSamlProviderARNs() == null) {
            this.samlProviderARNs = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.samlProviderARNs.add(add);
        }
        return this;
    }

    public UpdateIdentityPoolRequest withSupportedLoginProviders(Map<String, String> map) {
        this.supportedLoginProviders = map;
        return this;
    }

    public UpdateIdentityPoolRequest withCognitoIdentityProviders(Collection<CognitoIdentityProvider> collection) {
        setCognitoIdentityProviders(collection);
        return this;
    }

    public UpdateIdentityPoolRequest withOpenIdConnectProviderARNs(Collection<String> collection) {
        setOpenIdConnectProviderARNs(collection);
        return this;
    }

    public UpdateIdentityPoolRequest withSamlProviderARNs(Collection<String> collection) {
        setSamlProviderARNs(collection);
        return this;
    }
}
