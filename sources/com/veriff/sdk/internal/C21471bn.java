package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.bn */
public final class C21471bn<T> extends C21420av<T> {

    /* renamed from: a */
    private final C21420av<T> f53998a;

    public C21471bn(C21420av<T> avVar) {
        this.f53998a = avVar;
    }

    /* renamed from: a */
    public T mo54204a(C21430ba baVar) throws IOException {
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return baVar.mo54253l();
        }
        return this.f53998a.mo54204a(baVar);
    }

    public String toString() {
        return this.f53998a + ".nullSafe()";
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, T t) throws IOException {
        if (t == null) {
            bfVar.mo54276e();
        } else {
            this.f53998a.mo54205a(bfVar, t);
        }
    }
}
