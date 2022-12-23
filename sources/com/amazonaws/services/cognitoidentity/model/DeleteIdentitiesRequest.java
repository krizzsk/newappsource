package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DeleteIdentitiesRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> identityIdsToDelete;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteIdentitiesRequest)) {
            return false;
        }
        DeleteIdentitiesRequest deleteIdentitiesRequest = (DeleteIdentitiesRequest) obj;
        if (deleteIdentitiesRequest.getIdentityIdsToDelete() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityIdsToDelete() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (deleteIdentitiesRequest.getIdentityIdsToDelete() == null || deleteIdentitiesRequest.getIdentityIdsToDelete().equals(getIdentityIdsToDelete())) {
            return true;
        }
        return false;
    }

    public List<String> getIdentityIdsToDelete() {
        return this.identityIdsToDelete;
    }

    public int hashCode() {
        return 31 + (getIdentityIdsToDelete() == null ? 0 : getIdentityIdsToDelete().hashCode());
    }

    public void setIdentityIdsToDelete(Collection<String> collection) {
        if (collection == null) {
            this.identityIdsToDelete = null;
        } else {
            this.identityIdsToDelete = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityIdsToDelete() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityIdsToDelete: ");
            k2.append(getIdentityIdsToDelete());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DeleteIdentitiesRequest withIdentityIdsToDelete(String... strArr) {
        if (getIdentityIdsToDelete() == null) {
            this.identityIdsToDelete = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.identityIdsToDelete.add(add);
        }
        return this;
    }

    public DeleteIdentitiesRequest withIdentityIdsToDelete(Collection<String> collection) {
        setIdentityIdsToDelete(collection);
        return this;
    }
}
