package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LookupDeveloperIdentityResult implements Serializable {
    private List<String> developerUserIdentifierList;
    private String identityId;
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
        if (obj == null || !(obj instanceof LookupDeveloperIdentityResult)) {
            return false;
        }
        LookupDeveloperIdentityResult lookupDeveloperIdentityResult = (LookupDeveloperIdentityResult) obj;
        if (lookupDeveloperIdentityResult.getIdentityId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (lookupDeveloperIdentityResult.getIdentityId() != null && !lookupDeveloperIdentityResult.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (lookupDeveloperIdentityResult.getDeveloperUserIdentifierList() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getDeveloperUserIdentifierList() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (lookupDeveloperIdentityResult.getDeveloperUserIdentifierList() != null && !lookupDeveloperIdentityResult.getDeveloperUserIdentifierList().equals(getDeveloperUserIdentifierList())) {
            return false;
        }
        if (lookupDeveloperIdentityResult.getNextToken() == null) {
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
        if (lookupDeveloperIdentityResult.getNextToken() == null || lookupDeveloperIdentityResult.getNextToken().equals(getNextToken())) {
            return true;
        }
        return false;
    }

    public List<String> getDeveloperUserIdentifierList() {
        return this.developerUserIdentifierList;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getIdentityId() == null) {
            i = 0;
        } else {
            i = getIdentityId().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getDeveloperUserIdentifierList() == null) {
            i2 = 0;
        } else {
            i2 = getDeveloperUserIdentifierList().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getNextToken() != null) {
            i3 = getNextToken().hashCode();
        }
        return i5 + i3;
    }

    public void setDeveloperUserIdentifierList(Collection<String> collection) {
        if (collection == null) {
            this.developerUserIdentifierList = null;
        } else {
            this.developerUserIdentifierList = new ArrayList(collection);
        }
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityId: ");
            k2.append(getIdentityId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getDeveloperUserIdentifierList() != null) {
            StringBuilder k3 = C13555b.m33972k("DeveloperUserIdentifierList: ");
            k3.append(getDeveloperUserIdentifierList());
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

    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(String... strArr) {
        if (getDeveloperUserIdentifierList() == null) {
            this.developerUserIdentifierList = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.developerUserIdentifierList.add(add);
        }
        return this;
    }

    public LookupDeveloperIdentityResult withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public LookupDeveloperIdentityResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(Collection<String> collection) {
        setDeveloperUserIdentifierList(collection);
        return this;
    }
}
