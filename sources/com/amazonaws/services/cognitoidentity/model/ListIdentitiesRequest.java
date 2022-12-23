package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class ListIdentitiesRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean hideDisabled;
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentitiesRequest)) {
            return false;
        }
        ListIdentitiesRequest listIdentitiesRequest = (ListIdentitiesRequest) obj;
        if (listIdentitiesRequest.getIdentityPoolId() == null) {
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
        if (listIdentitiesRequest.getIdentityPoolId() != null && !listIdentitiesRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (listIdentitiesRequest.getMaxResults() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getMaxResults() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listIdentitiesRequest.getMaxResults() != null && !listIdentitiesRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if (listIdentitiesRequest.getNextToken() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getNextToken() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (listIdentitiesRequest.getNextToken() != null && !listIdentitiesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if (listIdentitiesRequest.getHideDisabled() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getHideDisabled() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (listIdentitiesRequest.getHideDisabled() == null || listIdentitiesRequest.getHideDisabled().equals(getHideDisabled())) {
            return true;
        }
        return false;
    }

    public Boolean getHideDisabled() {
        return this.hideDisabled;
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
        int i4 = 0;
        if (getIdentityPoolId() == null) {
            i = 0;
        } else {
            i = getIdentityPoolId().hashCode();
        }
        int i5 = (i + 31) * 31;
        if (getMaxResults() == null) {
            i2 = 0;
        } else {
            i2 = getMaxResults().hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (getNextToken() == null) {
            i3 = 0;
        } else {
            i3 = getNextToken().hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (getHideDisabled() != null) {
            i4 = getHideDisabled().hashCode();
        }
        return i7 + i4;
    }

    public Boolean isHideDisabled() {
        return this.hideDisabled;
    }

    public void setHideDisabled(Boolean bool) {
        this.hideDisabled = bool;
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
        if (getMaxResults() != null) {
            StringBuilder k3 = C13555b.m33972k("MaxResults: ");
            k3.append(getMaxResults());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getNextToken() != null) {
            StringBuilder k4 = C13555b.m33972k("NextToken: ");
            k4.append(getNextToken());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getHideDisabled() != null) {
            StringBuilder k5 = C13555b.m33972k("HideDisabled: ");
            k5.append(getHideDisabled());
            k.append(k5.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListIdentitiesRequest withHideDisabled(Boolean bool) {
        this.hideDisabled = bool;
        return this;
    }

    public ListIdentitiesRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public ListIdentitiesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListIdentitiesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
