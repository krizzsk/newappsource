package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateIdentityPoolRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean allowClassicFlow;
    private Boolean allowUnauthenticatedIdentities;
    private List<CognitoIdentityProvider> cognitoIdentityProviders;
    private String developerProviderName;
    private String identityPoolName;
    private Map<String, String> identityPoolTags;
    private List<String> openIdConnectProviderARNs;
    private List<String> samlProviderARNs;
    private Map<String, String> supportedLoginProviders;

    public CreateIdentityPoolRequest addIdentityPoolTagsEntry(String str, String str2) {
        if (this.identityPoolTags == null) {
            this.identityPoolTags = new HashMap();
        }
        if (!this.identityPoolTags.containsKey(str)) {
            this.identityPoolTags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public CreateIdentityPoolRequest addSupportedLoginProvidersEntry(String str, String str2) {
        if (this.supportedLoginProviders == null) {
            this.supportedLoginProviders = new HashMap();
        }
        if (!this.supportedLoginProviders.containsKey(str)) {
            this.supportedLoginProviders.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public CreateIdentityPoolRequest clearIdentityPoolTagsEntries() {
        this.identityPoolTags = null;
        return this;
    }

    public CreateIdentityPoolRequest clearSupportedLoginProvidersEntries() {
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateIdentityPoolRequest)) {
            return false;
        }
        CreateIdentityPoolRequest createIdentityPoolRequest = (CreateIdentityPoolRequest) obj;
        if (createIdentityPoolRequest.getIdentityPoolName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityPoolName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (createIdentityPoolRequest.getIdentityPoolName() != null && !createIdentityPoolRequest.getIdentityPoolName().equals(getIdentityPoolName())) {
            return false;
        }
        if (createIdentityPoolRequest.getAllowUnauthenticatedIdentities() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getAllowUnauthenticatedIdentities() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (createIdentityPoolRequest.getAllowUnauthenticatedIdentities() != null && !createIdentityPoolRequest.getAllowUnauthenticatedIdentities().equals(getAllowUnauthenticatedIdentities())) {
            return false;
        }
        if (createIdentityPoolRequest.getAllowClassicFlow() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getAllowClassicFlow() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (createIdentityPoolRequest.getAllowClassicFlow() != null && !createIdentityPoolRequest.getAllowClassicFlow().equals(getAllowClassicFlow())) {
            return false;
        }
        if (createIdentityPoolRequest.getSupportedLoginProviders() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getSupportedLoginProviders() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (createIdentityPoolRequest.getSupportedLoginProviders() != null && !createIdentityPoolRequest.getSupportedLoginProviders().equals(getSupportedLoginProviders())) {
            return false;
        }
        if (createIdentityPoolRequest.getDeveloperProviderName() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getDeveloperProviderName() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (createIdentityPoolRequest.getDeveloperProviderName() != null && !createIdentityPoolRequest.getDeveloperProviderName().equals(getDeveloperProviderName())) {
            return false;
        }
        if (createIdentityPoolRequest.getOpenIdConnectProviderARNs() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getOpenIdConnectProviderARNs() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (createIdentityPoolRequest.getOpenIdConnectProviderARNs() != null && !createIdentityPoolRequest.getOpenIdConnectProviderARNs().equals(getOpenIdConnectProviderARNs())) {
            return false;
        }
        if (createIdentityPoolRequest.getCognitoIdentityProviders() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getCognitoIdentityProviders() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (createIdentityPoolRequest.getCognitoIdentityProviders() != null && !createIdentityPoolRequest.getCognitoIdentityProviders().equals(getCognitoIdentityProviders())) {
            return false;
        }
        if (createIdentityPoolRequest.getSamlProviderARNs() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (getSamlProviderARNs() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 ^ z17) {
            return false;
        }
        if (createIdentityPoolRequest.getSamlProviderARNs() != null && !createIdentityPoolRequest.getSamlProviderARNs().equals(getSamlProviderARNs())) {
            return false;
        }
        if (createIdentityPoolRequest.getIdentityPoolTags() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (getIdentityPoolTags() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 ^ z19) {
            return false;
        }
        if (createIdentityPoolRequest.getIdentityPoolTags() == null || createIdentityPoolRequest.getIdentityPoolTags().equals(getIdentityPoolTags())) {
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
        int i9 = 0;
        if (getIdentityPoolName() == null) {
            i = 0;
        } else {
            i = getIdentityPoolName().hashCode();
        }
        int i11 = (i + 31) * 31;
        if (getAllowUnauthenticatedIdentities() == null) {
            i2 = 0;
        } else {
            i2 = getAllowUnauthenticatedIdentities().hashCode();
        }
        int i12 = (i11 + i2) * 31;
        if (getAllowClassicFlow() == null) {
            i3 = 0;
        } else {
            i3 = getAllowClassicFlow().hashCode();
        }
        int i13 = (i12 + i3) * 31;
        if (getSupportedLoginProviders() == null) {
            i4 = 0;
        } else {
            i4 = getSupportedLoginProviders().hashCode();
        }
        int i14 = (i13 + i4) * 31;
        if (getDeveloperProviderName() == null) {
            i5 = 0;
        } else {
            i5 = getDeveloperProviderName().hashCode();
        }
        int i15 = (i14 + i5) * 31;
        if (getOpenIdConnectProviderARNs() == null) {
            i6 = 0;
        } else {
            i6 = getOpenIdConnectProviderARNs().hashCode();
        }
        int i16 = (i15 + i6) * 31;
        if (getCognitoIdentityProviders() == null) {
            i7 = 0;
        } else {
            i7 = getCognitoIdentityProviders().hashCode();
        }
        int i17 = (i16 + i7) * 31;
        if (getSamlProviderARNs() == null) {
            i8 = 0;
        } else {
            i8 = getSamlProviderARNs().hashCode();
        }
        int i18 = (i17 + i8) * 31;
        if (getIdentityPoolTags() != null) {
            i9 = getIdentityPoolTags().hashCode();
        }
        return i18 + i9;
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
        if (getIdentityPoolName() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityPoolName: ");
            k2.append(getIdentityPoolName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getAllowUnauthenticatedIdentities() != null) {
            StringBuilder k3 = C13555b.m33972k("AllowUnauthenticatedIdentities: ");
            k3.append(getAllowUnauthenticatedIdentities());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getAllowClassicFlow() != null) {
            StringBuilder k4 = C13555b.m33972k("AllowClassicFlow: ");
            k4.append(getAllowClassicFlow());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getSupportedLoginProviders() != null) {
            StringBuilder k5 = C13555b.m33972k("SupportedLoginProviders: ");
            k5.append(getSupportedLoginProviders());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getDeveloperProviderName() != null) {
            StringBuilder k6 = C13555b.m33972k("DeveloperProviderName: ");
            k6.append(getDeveloperProviderName());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getOpenIdConnectProviderARNs() != null) {
            StringBuilder k7 = C13555b.m33972k("OpenIdConnectProviderARNs: ");
            k7.append(getOpenIdConnectProviderARNs());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getCognitoIdentityProviders() != null) {
            StringBuilder k8 = C13555b.m33972k("CognitoIdentityProviders: ");
            k8.append(getCognitoIdentityProviders());
            k8.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k8.toString());
        }
        if (getSamlProviderARNs() != null) {
            StringBuilder k9 = C13555b.m33972k("SamlProviderARNs: ");
            k9.append(getSamlProviderARNs());
            k9.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k9.toString());
        }
        if (getIdentityPoolTags() != null) {
            StringBuilder k11 = C13555b.m33972k("IdentityPoolTags: ");
            k11.append(getIdentityPoolTags());
            k.append(k11.toString());
        }
        k.append("}");
        return k.toString();
    }

    public CreateIdentityPoolRequest withAllowClassicFlow(Boolean bool) {
        this.allowClassicFlow = bool;
        return this;
    }

    public CreateIdentityPoolRequest withAllowUnauthenticatedIdentities(Boolean bool) {
        this.allowUnauthenticatedIdentities = bool;
        return this;
    }

    public CreateIdentityPoolRequest withCognitoIdentityProviders(CognitoIdentityProvider... cognitoIdentityProviderArr) {
        if (getCognitoIdentityProviders() == null) {
            this.cognitoIdentityProviders = new ArrayList(cognitoIdentityProviderArr.length);
        }
        for (CognitoIdentityProvider add : cognitoIdentityProviderArr) {
            this.cognitoIdentityProviders.add(add);
        }
        return this;
    }

    public CreateIdentityPoolRequest withDeveloperProviderName(String str) {
        this.developerProviderName = str;
        return this;
    }

    public CreateIdentityPoolRequest withIdentityPoolName(String str) {
        this.identityPoolName = str;
        return this;
    }

    public CreateIdentityPoolRequest withIdentityPoolTags(Map<String, String> map) {
        this.identityPoolTags = map;
        return this;
    }

    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(String... strArr) {
        if (getOpenIdConnectProviderARNs() == null) {
            this.openIdConnectProviderARNs = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.openIdConnectProviderARNs.add(add);
        }
        return this;
    }

    public CreateIdentityPoolRequest withSamlProviderARNs(String... strArr) {
        if (getSamlProviderARNs() == null) {
            this.samlProviderARNs = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.samlProviderARNs.add(add);
        }
        return this;
    }

    public CreateIdentityPoolRequest withSupportedLoginProviders(Map<String, String> map) {
        this.supportedLoginProviders = map;
        return this;
    }

    public CreateIdentityPoolRequest withCognitoIdentityProviders(Collection<CognitoIdentityProvider> collection) {
        setCognitoIdentityProviders(collection);
        return this;
    }

    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(Collection<String> collection) {
        setOpenIdConnectProviderARNs(collection);
        return this;
    }

    public CreateIdentityPoolRequest withSamlProviderARNs(Collection<String> collection) {
        setSamlProviderARNs(collection);
        return this;
    }
}
