package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.av */
public abstract class C21420av<T> {

    /* renamed from: com.veriff.sdk.internal.av$a */
    public interface C21424a {
        /* renamed from: a */
        C21420av<?> mo54207a(Type type, Set<? extends Annotation> set, C21450bi biVar);
    }

    /* renamed from: a */
    public final T mo54222a(abk abk) throws IOException {
        return mo54204a(C21430ba.m51054a(abk));
    }

    /* renamed from: a */
    public abstract T mo54204a(C21430ba baVar) throws IOException;

    /* renamed from: a */
    public abstract void mo54205a(C21437bf bfVar, T t) throws IOException;

    /* renamed from: c */
    public final C21420av<T> mo54226c() {
        return new C21420av<T>(this) {
            /* renamed from: a */
            public T mo54204a(C21430ba baVar) throws IOException {
                return this.mo54204a(baVar);
            }

            /* renamed from: g */
            public boolean mo54230g() {
                return this.mo54230g();
            }

            public String toString() {
                return this + ".serializeNulls()";
            }

            /* renamed from: a */
            public void mo54205a(C21437bf bfVar, T t) throws IOException {
                boolean i = bfVar.mo54287i();
                bfVar.mo54283c(true);
                try {
                    this.mo54205a(bfVar, t);
                } finally {
                    bfVar.mo54283c(i);
                }
            }
        };
    }

    /* renamed from: d */
    public final C21420av<T> mo54227d() {
        if (this instanceof C21471bn) {
            return this;
        }
        return new C21471bn(this);
    }

    /* renamed from: e */
    public final C21420av<T> mo54228e() {
        return new C21420av<T>(this) {
            /* renamed from: a */
            public T mo54204a(C21430ba baVar) throws IOException {
                boolean a = baVar.mo54240a();
                baVar.mo54239a(true);
                try {
                    return this.mo54204a(baVar);
                } finally {
                    baVar.mo54239a(a);
                }
            }

            /* renamed from: g */
            public boolean mo54230g() {
                return true;
            }

            public String toString() {
                return this + ".lenient()";
            }

            /* renamed from: a */
            public void mo54205a(C21437bf bfVar, T t) throws IOException {
                boolean h = bfVar.mo54286h();
                bfVar.mo54282b(true);
                try {
                    this.mo54205a(bfVar, t);
                } finally {
                    bfVar.mo54282b(h);
                }
            }
        };
    }

    /* renamed from: f */
    public final C21420av<T> mo54229f() {
        return new C21420av<T>(this) {
            /* renamed from: a */
            public T mo54204a(C21430ba baVar) throws IOException {
                boolean b = baVar.mo54243b();
                baVar.mo54242b(true);
                try {
                    return this.mo54204a(baVar);
                } finally {
                    baVar.mo54242b(b);
                }
            }

            /* renamed from: g */
            public boolean mo54230g() {
                return this.mo54230g();
            }

            public String toString() {
                return this + ".failOnUnknown()";
            }

            /* renamed from: a */
            public void mo54205a(C21437bf bfVar, T t) throws IOException {
                this.mo54205a(bfVar, t);
            }
        };
    }

    /* renamed from: g */
    public boolean mo54230g() {
        return false;
    }

    /* renamed from: a */
    public final T mo54223a(String str) throws IOException {
        C21430ba a = C21430ba.m51054a((abk) new abi().mo53870b(str));
        T a2 = mo54204a(a);
        if (mo54230g() || a.mo54249h() == C21430ba.C21432b.END_DOCUMENT) {
            return a2;
        }
        throw new C21426ax("JSON document was not fully consumed.");
    }

    /* renamed from: a */
    public final void mo54225a(abj abj, T t) throws IOException {
        mo54205a(C21437bf.m51148a(abj), t);
    }

    /* renamed from: a */
    public final String mo54224a(T t) {
        abi abi = new abi();
        try {
            mo54225a((abj) abi, t);
            return abi.mo53914r();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
