package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class GetSessionTokenRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String serialNumber;
    private String tokenCode;

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
        if (obj == null || !(obj instanceof GetSessionTokenRequest)) {
            return false;
        }
        GetSessionTokenRequest getSessionTokenRequest = (GetSessionTokenRequest) obj;
        if (getSessionTokenRequest.getDurationSeconds() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getDurationSeconds() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (getSessionTokenRequest.getDurationSeconds() != null && !getSessionTokenRequest.getDurationSeconds().equals(getDurationSeconds())) {
            return false;
        }
        if (getSessionTokenRequest.getSerialNumber() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getSerialNumber() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getSessionTokenRequest.getSerialNumber() != null && !getSessionTokenRequest.getSerialNumber().equals(getSerialNumber())) {
            return false;
        }
        if (getSessionTokenRequest.getTokenCode() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getTokenCode() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getSessionTokenRequest.getTokenCode() == null || getSessionTokenRequest.getTokenCode().equals(getTokenCode())) {
            return true;
        }
        return false;
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getTokenCode() {
        return this.tokenCode;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getDurationSeconds() == null) {
            i = 0;
        } else {
            i = getDurationSeconds().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getSerialNumber() == null) {
            i2 = 0;
        } else {
            i2 = getSerialNumber().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getTokenCode() != null) {
            i3 = getTokenCode().hashCode();
        }
        return i5 + i3;
    }

    public void setDurationSeconds(Integer num) {
        this.durationSeconds = num;
    }

    public void setSerialNumber(String str) {
        this.serialNumber = str;
    }

    public void setTokenCode(String str) {
        this.tokenCode = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getDurationSeconds() != null) {
            StringBuilder k2 = C13555b.m33972k("DurationSeconds: ");
            k2.append(getDurationSeconds());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getSerialNumber() != null) {
            StringBuilder k3 = C13555b.m33972k("SerialNumber: ");
            k3.append(getSerialNumber());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getTokenCode() != null) {
            StringBuilder k4 = C13555b.m33972k("TokenCode: ");
            k4.append(getTokenCode());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetSessionTokenRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public GetSessionTokenRequest withSerialNumber(String str) {
        this.serialNumber = str;
        return this;
    }

    public GetSessionTokenRequest withTokenCode(String str) {
        this.tokenCode = str;
        return this;
    }
}
