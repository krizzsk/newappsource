package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesis.model.KMSNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class KMSNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public KMSNotFoundExceptionUnmarshaller() {
        super(KMSNotFoundException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("KMSNotFoundException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        KMSNotFoundException kMSNotFoundException = (KMSNotFoundException) super.unmarshall(jsonErrorResponse);
        kMSNotFoundException.setErrorCode("KMSNotFoundException");
        return kMSNotFoundException;
    }
}
