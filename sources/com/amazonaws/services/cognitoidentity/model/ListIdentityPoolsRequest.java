package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class ListIdentityPoolsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxResults;
    private String nextToken;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentityPoolsRequest)) {
            return false;
        }
        ListIdentityPoolsRequest listIdentityPoolsRequest = (ListIdentityPoolsRequest) obj;
        if (listIdentityPoolsRequest.getMaxResults() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getMaxResults() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listIdentityPoolsRequest.getMaxResults() != null && !listIdentityPoolsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if (listIdentityPoolsRequest.getNextToken() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getNextToken() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listIdentityPoolsRequest.getNextToken() == null || listIdentityPoolsRequest.getNextToken().equals(getNextToken())) {
            return true;
        }
        return false;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getMaxResults() == null) {
            i = 0;
        } else {
            i = getMaxResults().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getNextToken() != null) {
            i2 = getNextToken().hashCode();
        }
        return i3 + i2;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getMaxResults() != null) {
            StringBuilder k2 = C13555b.m33972k("MaxResults: ");
            k2.append(getMaxResults());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getNextToken() != null) {
            StringBuilder k3 = C13555b.m33972k("NextToken: ");
            k3.append(getNextToken());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListIdentityPoolsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListIdentityPoolsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }
}
