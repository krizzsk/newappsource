package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesis.model.KMSDisabledException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class KMSDisabledExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public KMSDisabledExceptionUnmarshaller() {
        super(KMSDisabledException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("KMSDisabledException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        KMSDisabledException kMSDisabledException = (KMSDisabledException) super.unmarshall(jsonErrorResponse);
        kMSDisabledException.setErrorCode("KMSDisabledException");
        return kMSDisabledException;
    }
}
