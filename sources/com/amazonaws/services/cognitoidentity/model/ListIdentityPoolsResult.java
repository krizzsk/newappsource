package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListIdentityPoolsResult implements Serializable {
    private List<IdentityPoolShortDescription> identityPools;
    private String nextToken;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentityPoolsResult)) {
            return false;
        }
        ListIdentityPoolsResult listIdentityPoolsResult = (ListIdentityPoolsResult) obj;
        if (listIdentityPoolsResult.getIdentityPools() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityPools() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listIdentityPoolsResult.getIdentityPools() != null && !listIdentityPoolsResult.getIdentityPools().equals(getIdentityPools())) {
            return false;
        }
        if (listIdentityPoolsResult.getNextToken() == null) {
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
        if (listIdentityPoolsResult.getNextToken() == null || listIdentityPoolsResult.getNextToken().equals(getNextToken())) {
            return true;
        }
        return false;
    }

    public List<IdentityPoolShortDescription> getIdentityPools() {
        return this.identityPools;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getIdentityPools() == null) {
            i = 0;
        } else {
            i = getIdentityPools().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getNextToken() != null) {
            i2 = getNextToken().hashCode();
        }
        return i3 + i2;
    }

    public void setIdentityPools(Collection<IdentityPoolShortDescription> collection) {
        if (collection == null) {
            this.identityPools = null;
        } else {
            this.identityPools = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityPools() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityPools: ");
            k2.append(getIdentityPools());
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

    public ListIdentityPoolsResult withIdentityPools(IdentityPoolShortDescription... identityPoolShortDescriptionArr) {
        if (getIdentityPools() == null) {
            this.identityPools = new ArrayList(identityPoolShortDescriptionArr.length);
        }
        for (IdentityPoolShortDescription add : identityPoolShortDescriptionArr) {
            this.identityPools.add(add);
        }
        return this;
    }

    public ListIdentityPoolsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListIdentityPoolsResult withIdentityPools(Collection<IdentityPoolShortDescription> collection) {
        setIdentityPools(collection);
        return this;
    }
}
