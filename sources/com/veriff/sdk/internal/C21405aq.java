package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21420av;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.aq */
final class C21405aq extends C21420av<Object> {

    /* renamed from: a */
    public static final C21420av.C21424a f53858a = new C21420av.C21424a() {
        /* renamed from: a */
        public C21420av<?> mo54207a(Type type, Set<? extends Annotation> set, C21450bi biVar) {
            Type f = C21468bk.m51270f(type);
            if (f != null && set.isEmpty()) {
                return new C21405aq(C21468bk.m51268d(f), biVar.mo54335a(f)).mo54227d();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final Class<?> f53859b;

    /* renamed from: c */
    private final C21420av<Object> f53860c;

    public C21405aq(Class<?> cls, C21420av<Object> avVar) {
        this.f53859b = cls;
        this.f53860c = avVar;
    }

    /* renamed from: a */
    public Object mo54204a(C21430ba baVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        baVar.mo54244c();
        while (baVar.mo54248g()) {
            arrayList.add(this.f53860c.mo54204a(baVar));
        }
        baVar.mo54245d();
        Object newInstance = Array.newInstance(this.f53859b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public String toString() {
        return this.f53860c + ".array()";
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, Object obj) throws IOException {
        bfVar.mo54264a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f53860c.mo54205a(bfVar, Array.get(obj, i));
        }
        bfVar.mo54271b();
    }
}
