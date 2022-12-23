package com.veriff.sdk.internal;

import java.io.IOException;

public abstract class abm implements abz {

    /* renamed from: a */
    private final abz f53563a;

    public abm(abz abz) {
        if (abz != null) {
            this.f53563a = abz;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public acb mo53674a() {
        return this.f53563a.mo53674a();
    }

    /* renamed from: a_ */
    public void mo53675a_(abi abi, long j) throws IOException {
        this.f53563a.mo53675a_(abi, j);
    }

    public void close() throws IOException {
        this.f53563a.close();
    }

    public void flush() throws IOException {
        this.f53563a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f53563a.toString() + ")";
    }
}
