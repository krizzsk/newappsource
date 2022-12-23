package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ReflectiveInstantiator;", "Lcom/veriff/sdk/internal/Instantiator;", "()V", "createInstance", "T", "className", "", "expectedType", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.fk */
public final class C21633fk implements C21629fg {
    /* renamed from: a */
    public <T> T mo54905a(String str, Class<T> cls) {
        C24362h.m61211f(str, "className");
        C24362h.m61211f(cls, "expectedType");
        try {
            T newInstance = Class.forName(str).newInstance();
            if (cls.isInstance(newInstance)) {
                return newInstance;
            }
            C24465j a = C21630fh.f54634a;
            a.mo60711w(str + " does not derive from " + cls);
            return null;
        } catch (Throwable th) {
            C24465j a2 = C21630fh.f54634a;
            a2.mo60706d("Failed to instantiate " + str, th);
            return null;
        }
    }
}
