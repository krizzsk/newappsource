package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListIdentitiesResult implements Serializable {
    private List<IdentityDescription> identities;
    private String identityPoolId;
    private String nextToken;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentitiesResult)) {
            return false;
        }
        ListIdentitiesResult listIdentitiesResult = (ListIdentitiesResult) obj;
        if (listIdentitiesResult.getIdentityPoolId() == null) {
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
        if (listIdentitiesResult.getIdentityPoolId() != null && !listIdentitiesResult.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (listIdentitiesResult.getIdentities() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getIdentities() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listIdentitiesResult.getIdentities() != null && !listIdentitiesResult.getIdentities().equals(getIdentities())) {
            return false;
        }
        if (listIdentitiesResult.getNextToken() == null) {
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
        if (listIdentitiesResult.getNextToken() == null || listIdentitiesResult.getNextToken().equals(getNextToken())) {
            return true;
        }
        return false;
    }

    public List<IdentityDescription> getIdentities() {
        return this.identities;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getIdentityPoolId() == null) {
            i = 0;
        } else {
            i = getIdentityPoolId().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getIdentities() == null) {
            i2 = 0;
        } else {
            i2 = getIdentities().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getNextToken() != null) {
            i3 = getNextToken().hashCode();
        }
        return i5 + i3;
    }

    public void setIdentities(Collection<IdentityDescription> collection) {
        if (collection == null) {
            this.identities = null;
        } else {
            this.identities = new ArrayList(collection);
        }
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
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
        if (getIdentities() != null) {
            StringBuilder k3 = C13555b.m33972k("Identities: ");
            k3.append(getIdentities());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getNextToken() != null) {
            StringBuilder k4 = C13555b.m33972k("NextToken: ");
            k4.append(getNextToken());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListIdentitiesResult withIdentities(IdentityDescription... identityDescriptionArr) {
        if (getIdentities() == null) {
            this.identities = new ArrayList(identityDescriptionArr.length);
        }
        for (IdentityDescription add : identityDescriptionArr) {
            this.identities.add(add);
        }
        return this;
    }

    public ListIdentitiesResult withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public ListIdentitiesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListIdentitiesResult withIdentities(Collection<IdentityDescription> collection) {
        setIdentities(collection);
        return this;
    }
}
