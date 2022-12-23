package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesisfirehose.model.InvalidKMSResourceException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class InvalidKMSResourceExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidKMSResourceExceptionUnmarshaller() {
        super(InvalidKMSResourceException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("InvalidKMSResourceException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        InvalidKMSResourceException invalidKMSResourceException = (InvalidKMSResourceException) super.unmarshall(jsonErrorResponse);
        invalidKMSResourceException.setErrorCode("InvalidKMSResourceException");
        invalidKMSResourceException.setCode(String.valueOf(jsonErrorResponse.get("code")));
        return invalidKMSResourceException;
    }
}
