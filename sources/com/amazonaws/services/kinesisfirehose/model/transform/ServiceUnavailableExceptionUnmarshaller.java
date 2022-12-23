package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesisfirehose.model.ServiceUnavailableException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class ServiceUnavailableExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ServiceUnavailableExceptionUnmarshaller() {
        super(ServiceUnavailableException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("ServiceUnavailableException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ServiceUnavailableException serviceUnavailableException = (ServiceUnavailableException) super.unmarshall(jsonErrorResponse);
        serviceUnavailableException.setErrorCode("ServiceUnavailableException");
        return serviceUnavailableException;
    }
}
