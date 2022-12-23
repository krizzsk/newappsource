package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitoidentity.model.NotAuthorizedException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

public class NotAuthorizedExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public NotAuthorizedExceptionUnmarshaller() {
        super(NotAuthorizedException.class);
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("NotAuthorizedException");
    }

    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        NotAuthorizedException notAuthorizedException = (NotAuthorizedException) super.unmarshall(jsonErrorResponse);
        notAuthorizedException.setErrorCode("NotAuthorizedException");
        return notAuthorizedException;
    }
}
