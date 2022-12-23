package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class DescribeLimitsRequest extends AmazonWebServiceRequest implements Serializable {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLimitsRequest)) {
            return false;
        }
        DescribeLimitsRequest describeLimitsRequest = (DescribeLimitsRequest) obj;
        return true;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "{}";
    }
}
