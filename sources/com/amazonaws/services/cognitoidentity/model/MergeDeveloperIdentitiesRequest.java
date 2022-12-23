package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class MergeDeveloperIdentitiesRequest extends AmazonWebServiceRequest implements Serializable {
    private String destinationUserIdentifier;
    private String developerProviderName;
    private String identityPoolId;
    private String sourceUserIdentifier;

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
        if (obj == null || !(obj instanceof MergeDeveloperIdentitiesRequest)) {
            return false;
        }
        MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest = (MergeDeveloperIdentitiesRequest) obj;
        if (mergeDeveloperIdentitiesRequest.getSourceUserIdentifier() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getSourceUserIdentifier() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.getSourceUserIdentifier() != null && !mergeDeveloperIdentitiesRequest.getSourceUserIdentifier().equals(getSourceUserIdentifier())) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getDestinationUserIdentifier() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier() != null && !mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier().equals(getDestinationUserIdentifier())) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.getDeveloperProviderName() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getDeveloperProviderName() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.getDeveloperProviderName() != null && !mergeDeveloperIdentitiesRequest.getDeveloperProviderName().equals(getDeveloperProviderName())) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.getIdentityPoolId() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getIdentityPoolId() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.getIdentityPoolId() == null || mergeDeveloperIdentitiesRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return true;
        }
        return false;
    }

    public String getDestinationUserIdentifier() {
        return this.destinationUserIdentifier;
    }

    public String getDeveloperProviderName() {
        return this.developerProviderName;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getSourceUserIdentifier() {
        return this.sourceUserIdentifier;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getSourceUserIdentifier() == null) {
            i = 0;
        } else {
            i = getSourceUserIdentifier().hashCode();
        }
        int i5 = (i + 31) * 31;
        if (getDestinationUserIdentifier() == null) {
            i2 = 0;
        } else {
            i2 = getDestinationUserIdentifier().hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (getDeveloperProviderName() == null) {
            i3 = 0;
        } else {
            i3 = getDeveloperProviderName().hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (getIdentityPoolId() != null) {
            i4 = getIdentityPoolId().hashCode();
        }
        return i7 + i4;
    }

    public void setDestinationUserIdentifier(String str) {
        this.destinationUserIdentifier = str;
    }

    public void setDeveloperProviderName(String str) {
        this.developerProviderName = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setSourceUserIdentifier(String str) {
        this.sourceUserIdentifier = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getSourceUserIdentifier() != null) {
            StringBuilder k2 = C13555b.m33972k("SourceUserIdentifier: ");
            k2.append(getSourceUserIdentifier());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getDestinationUserIdentifier() != null) {
            StringBuilder k3 = C13555b.m33972k("DestinationUserIdentifier: ");
            k3.append(getDestinationUserIdentifier());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getDeveloperProviderName() != null) {
            StringBuilder k4 = C13555b.m33972k("DeveloperProviderName: ");
            k4.append(getDeveloperProviderName());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getIdentityPoolId() != null) {
            StringBuilder k5 = C13555b.m33972k("IdentityPoolId: ");
            k5.append(getIdentityPoolId());
            k.append(k5.toString());
        }
        k.append("}");
        return k.toString();
    }

    public MergeDeveloperIdentitiesRequest withDestinationUserIdentifier(String str) {
        this.destinationUserIdentifier = str;
        return this;
    }

    public MergeDeveloperIdentitiesRequest withDeveloperProviderName(String str) {
        this.developerProviderName = str;
        return this;
    }

    public MergeDeveloperIdentitiesRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public MergeDeveloperIdentitiesRequest withSourceUserIdentifier(String str) {
        this.sourceUserIdentifier = str;
        return this;
    }
}
