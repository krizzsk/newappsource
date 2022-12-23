package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q */
public class C3562q {

    /* renamed from: b */
    public static volatile C3562q f12534b;

    /* renamed from: c */
    public static final C3562q f12535c = new C3562q(true);

    /* renamed from: a */
    public final Map<C3563a, GeneratedMessageLite.C3468d<?, ?>> f12536a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.q$a */
    public static final class C3563a {

        /* renamed from: a */
        public final Object f12537a;

        /* renamed from: b */
        public final int f12538b;

        public C3563a(Object obj, int i) {
            this.f12537a = obj;
            this.f12538b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3563a)) {
                return false;
            }
            C3563a aVar = (C3563a) obj;
            if (this.f12537a == aVar.f12537a && this.f12538b == aVar.f12538b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12537a) * 65535) + this.f12538b;
        }
    }

    public C3562q() {
        this.f12536a = new HashMap();
    }

    /* renamed from: a */
    public static C3562q m9406a() {
        C3562q qVar = f12534b;
        if (qVar == null) {
            synchronized (C3562q.class) {
                qVar = f12534b;
                if (qVar == null) {
                    Class<?> cls = C3557p.f12530a;
                    C3562q qVar2 = null;
                    if (cls != null) {
                        try {
                            qVar2 = (C3562q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (qVar2 == null) {
                        qVar2 = f12535c;
                    }
                    f12534b = qVar2;
                    qVar = qVar2;
                }
            }
        }
        return qVar;
    }

    public C3562q(boolean z) {
        this.f12536a = Collections.emptyMap();
    }
}
