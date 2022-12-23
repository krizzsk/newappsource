package org.simpleframework.xml.core;

public class ConstructorException extends PersistenceException {
    public ConstructorException(String str, Object... objArr) {
        super(str, objArr);
    }
}
