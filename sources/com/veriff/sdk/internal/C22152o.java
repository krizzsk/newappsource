package com.veriff.sdk.internal;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.veriff.sdk.internal.o */
public final class C22152o {

    /* renamed from: a */
    private final String f55852a;

    /* renamed from: f */
    private Map<C22242p, Object> f55853f;

    public C22152o(String str, byte[] bArr, C22292q[] qVarArr, C21619f fVar) {
        this(str, bArr, qVarArr, fVar, System.currentTimeMillis());
    }

    /* renamed from: a */
    public String mo56074a() {
        return this.f55852a;
    }

    public String toString() {
        return this.f55852a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22152o(String str, byte[] bArr, C22292q[] qVarArr, C21619f fVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, qVarArr, fVar, j);
    }

    /* renamed from: a */
    public void mo56075a(C22242p pVar, Object obj) {
        if (this.f55853f == null) {
            this.f55853f = new EnumMap(C22242p.class);
        }
        this.f55853f.put(pVar, obj);
    }

    public C22152o(String str, byte[] bArr, int i, C22292q[] qVarArr, C21619f fVar, long j) {
        this.f55852a = str;
        this.f55853f = null;
    }
}
