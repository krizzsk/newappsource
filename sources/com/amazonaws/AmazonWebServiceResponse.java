package com.amazonaws;

public class AmazonWebServiceResponse<T> {
    private ResponseMetadata responseMetadata;
    private T result;

    public String getRequestId() {
        ResponseMetadata responseMetadata2 = this.responseMetadata;
        if (responseMetadata2 == null) {
            return null;
        }
        return responseMetadata2.getRequestId();
    }

    public ResponseMetadata getResponseMetadata() {
        return this.responseMetadata;
    }

    public T getResult() {
        return this.result;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata2) {
        this.responseMetadata = responseMetadata2;
    }

    public void setResult(T t) {
        this.result = t;
    }
}
