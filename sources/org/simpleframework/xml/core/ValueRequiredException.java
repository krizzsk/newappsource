package org.simpleframework.xml.core;

public class ValueRequiredException extends PersistenceException {
    public ValueRequiredException(String str, Object... objArr) {
        super(str, objArr);
    }
}
