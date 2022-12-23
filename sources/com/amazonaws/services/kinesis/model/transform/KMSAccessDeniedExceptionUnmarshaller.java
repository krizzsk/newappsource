package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesis.model.KMSAccessDeniedException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class KMSAccessDeniedExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public KMSAccessDeniedExceptionUnmarshaller() {
        super(KMSAccessDeniedException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("KMSAccessDeniedException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        KMSAccessDeniedException kMSAccessDeniedException = (KMSAccessDeniedException) super.unmarshall(jsonErrorResponse);
        kMSAccessDeniedException.setErrorCode("KMSAccessDeniedException");
        return kMSAccessDeniedException;
    }
}
