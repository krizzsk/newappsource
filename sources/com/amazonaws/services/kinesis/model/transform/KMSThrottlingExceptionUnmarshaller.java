package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesis.model.KMSThrottlingException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class KMSThrottlingExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public KMSThrottlingExceptionUnmarshaller() {
        super(KMSThrottlingException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("KMSThrottlingException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        KMSThrottlingException kMSThrottlingException = (KMSThrottlingException) super.unmarshall(jsonErrorResponse);
        kMSThrottlingException.setErrorCode("KMSThrottlingException");
        return kMSThrottlingException;
    }
}
