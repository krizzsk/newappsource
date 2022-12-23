package com.moovit.offline;

public class GraphBuildException extends RuntimeException {
    private final int errorCode;

    public GraphBuildException() {
        throw null;
    }

    /* renamed from: a */
    public final int mo19761a() {
        return this.errorCode;
    }
}
