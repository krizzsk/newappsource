package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesis.model.ResourceNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class ResourceNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ResourceNotFoundExceptionUnmarshaller() {
        super(ResourceNotFoundException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("ResourceNotFoundException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) super.unmarshall(jsonErrorResponse);
        resourceNotFoundException.setErrorCode("ResourceNotFoundException");
        return resourceNotFoundException;
    }
}
