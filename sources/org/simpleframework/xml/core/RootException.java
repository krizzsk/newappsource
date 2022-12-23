package org.simpleframework.xml.core;

public class RootException extends PersistenceException {
    public RootException(Object... objArr) {
        super("Can not instantiate null class", objArr);
    }
}
