package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesis.model.ExpiredNextTokenException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class ExpiredNextTokenExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ExpiredNextTokenExceptionUnmarshaller() {
        super(ExpiredNextTokenException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("ExpiredNextTokenException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ExpiredNextTokenException expiredNextTokenException = (ExpiredNextTokenException) super.unmarshall(jsonErrorResponse);
        expiredNextTokenException.setErrorCode("ExpiredNextTokenException");
        return expiredNextTokenException;
    }
}
