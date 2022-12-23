package com.veriff.sdk.internal;

import java.io.IOException;

final class adb<T> implements aci<T, C22754yt> {

    /* renamed from: a */
    private static final C22742yn f53813a = C22742yn.m55639a("application/json; charset=UTF-8");

    /* renamed from: b */
    private final C21420av<T> f53814b;

    public adb(C21420av<T> avVar) {
        this.f53814b = avVar;
    }

    /* renamed from: b */
    public C22754yt mo53996a(T t) throws IOException {
        abi abi = new abi();
        this.f53814b.mo54205a(C21437bf.m51148a((abj) abi), t);
        return C22754yt.m55734a(f53813a, abi.mo53913q());
    }
}
