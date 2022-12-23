package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;

public abstract class AbstractErrorUnmarshaller<T> implements Unmarshaller<AmazonServiceException, T> {
    public final Class<? extends AmazonServiceException> exceptionClass;

    public AbstractErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    public AmazonServiceException newException(String str) throws Exception {
        return (AmazonServiceException) this.exceptionClass.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
    }

    public AbstractErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        this.exceptionClass = cls;
    }
}
