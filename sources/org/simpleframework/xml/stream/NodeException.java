package org.simpleframework.xml.stream;

public class NodeException extends Exception {
    public NodeException() {
        super("Document has no root element");
    }
}
