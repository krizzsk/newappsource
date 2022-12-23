package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
public final class C24079d {

    /* renamed from: b */
    public static final /* synthetic */ int f61077b = 0;

    /* renamed from: a */
    public final Map<C24080a, GeneratedMessageLite.C24069e<?, ?>> f61078a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    public static final class C24080a {

        /* renamed from: a */
        public final Object f61079a;

        /* renamed from: b */
        public final int f61080b;

        public C24080a(C24090h hVar, int i) {
            this.f61079a = hVar;
            this.f61080b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C24080a)) {
                return false;
            }
            C24080a aVar = (C24080a) obj;
            if (this.f61079a == aVar.f61079a && this.f61080b == aVar.f61080b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f61079a) * 65535) + this.f61080b;
        }
    }

    static {
        new C24079d(0);
    }

    public C24079d() {
        this.f61078a = new HashMap();
    }

    /* renamed from: a */
    public final void mo60038a(GeneratedMessageLite.C24069e<?, ?> eVar) {
        this.f61078a.put(new C24080a(eVar.f61062a, eVar.f61065d.f61058c), eVar);
    }

    public C24079d(int i) {
        this.f61078a = Collections.emptyMap();
    }
}
