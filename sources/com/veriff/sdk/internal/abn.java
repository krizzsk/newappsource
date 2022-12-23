package com.veriff.sdk.internal;

import java.io.IOException;

public abstract class abn implements aca {

    /* renamed from: a */
    private final aca f53564a;

    public abn(aca aca) {
        if (aca != null) {
            this.f53564a = aca;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public long mo53671a(abi abi, long j) throws IOException {
        return this.f53564a.mo53671a(abi, j);
    }

    /* renamed from: b */
    public final aca mo53952b() {
        return this.f53564a;
    }

    public void close() throws IOException {
        this.f53564a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f53564a.toString() + ")";
    }

    /* renamed from: a */
    public acb mo53672a() {
        return this.f53564a.mo53672a();
    }
}
