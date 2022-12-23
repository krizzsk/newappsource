package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class IdentityDescription implements Serializable {
    private Date creationDate;
    private String identityId;
    private Date lastModifiedDate;
    private List<String> logins;

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
        if (obj == null || !(obj instanceof IdentityDescription)) {
            return false;
        }
        IdentityDescription identityDescription = (IdentityDescription) obj;
        if (identityDescription.getIdentityId() == null) {
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
        if (identityDescription.getIdentityId() != null && !identityDescription.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (identityDescription.getLogins() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getLogins() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (identityDescription.getLogins() != null && !identityDescription.getLogins().equals(getLogins())) {
            return false;
        }
        if (identityDescription.getCreationDate() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getCreationDate() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (identityDescription.getCreationDate() != null && !identityDescription.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if (identityDescription.getLastModifiedDate() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getLastModifiedDate() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (identityDescription.getLastModifiedDate() == null || identityDescription.getLastModifiedDate().equals(getLastModifiedDate())) {
            return true;
        }
        return false;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public List<String> getLogins() {
        return this.logins;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getIdentityId() == null) {
            i = 0;
        } else {
            i = getIdentityId().hashCode();
        }
        int i5 = (i + 31) * 31;
        if (getLogins() == null) {
            i2 = 0;
        } else {
            i2 = getLogins().hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (getCreationDate() == null) {
            i3 = 0;
        } else {
            i3 = getCreationDate().hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (getLastModifiedDate() != null) {
            i4 = getLastModifiedDate().hashCode();
        }
        return i7 + i4;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setLogins(Collection<String> collection) {
        if (collection == null) {
            this.logins = null;
        } else {
            this.logins = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityId: ");
            k2.append(getIdentityId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getLogins() != null) {
            StringBuilder k3 = C13555b.m33972k("Logins: ");
            k3.append(getLogins());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getCreationDate() != null) {
            StringBuilder k4 = C13555b.m33972k("CreationDate: ");
            k4.append(getCreationDate());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getLastModifiedDate() != null) {
            StringBuilder k5 = C13555b.m33972k("LastModifiedDate: ");
            k5.append(getLastModifiedDate());
            k.append(k5.toString());
        }
        k.append("}");
        return k.toString();
    }

    public IdentityDescription withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public IdentityDescription withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public IdentityDescription withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public IdentityDescription withLogins(String... strArr) {
        if (getLogins() == null) {
            this.logins = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.logins.add(add);
        }
        return this;
    }

    public IdentityDescription withLogins(Collection<String> collection) {
        setLogins(collection);
        return this;
    }
}
