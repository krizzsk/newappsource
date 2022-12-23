package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class SequenceNumberRange implements Serializable {
    private String endingSequenceNumber;
    private String startingSequenceNumber;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SequenceNumberRange)) {
            return false;
        }
        SequenceNumberRange sequenceNumberRange = (SequenceNumberRange) obj;
        if (sequenceNumberRange.getStartingSequenceNumber() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStartingSequenceNumber() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (sequenceNumberRange.getStartingSequenceNumber() != null && !sequenceNumberRange.getStartingSequenceNumber().equals(getStartingSequenceNumber())) {
            return false;
        }
        if (sequenceNumberRange.getEndingSequenceNumber() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getEndingSequenceNumber() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (sequenceNumberRange.getEndingSequenceNumber() == null || sequenceNumberRange.getEndingSequenceNumber().equals(getEndingSequenceNumber())) {
            return true;
        }
        return false;
    }

    public String getEndingSequenceNumber() {
        return this.endingSequenceNumber;
    }

    public String getStartingSequenceNumber() {
        return this.startingSequenceNumber;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getStartingSequenceNumber() == null) {
            i = 0;
        } else {
            i = getStartingSequenceNumber().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getEndingSequenceNumber() != null) {
            i2 = getEndingSequenceNumber().hashCode();
        }
        return i3 + i2;
    }

    public void setEndingSequenceNumber(String str) {
        this.endingSequenceNumber = str;
    }

    public void setStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStartingSequenceNumber() != null) {
            StringBuilder k2 = C13555b.m33972k("StartingSequenceNumber: ");
            k2.append(getStartingSequenceNumber());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getEndingSequenceNumber() != null) {
            StringBuilder k3 = C13555b.m33972k("EndingSequenceNumber: ");
            k3.append(getEndingSequenceNumber());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public SequenceNumberRange withEndingSequenceNumber(String str) {
        this.endingSequenceNumber = str;
        return this;
    }

    public SequenceNumberRange withStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
        return this;
    }
}
