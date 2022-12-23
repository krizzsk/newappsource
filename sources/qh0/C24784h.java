package qh0;

import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import mf0.C24362h;
import qh0.C24770a;

/* renamed from: qh0.h */
public abstract class C24784h implements C24770a {

    /* renamed from: a */
    public final String f62705a;

    /* renamed from: qh0.h$a */
    public static final class C24785a extends C24784h {

        /* renamed from: b */
        public final int f62706b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C24785a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "must have at least "
                java.lang.String r1 = " value parameter"
                java.lang.StringBuilder r0 = p379.C25541a.m63887r(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto L_0x000e
                java.lang.String r1 = "s"
                goto L_0x0010
            L_0x000e:
                java.lang.String r1 = ""
            L_0x0010:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.f62706b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qh0.C24784h.C24785a.<init>(int):void");
        }

        /* renamed from: b */
        public final boolean mo60275b(C23900c cVar) {
            C24362h.m61211f(cVar, "functionDescriptor");
            return cVar.mo53442h().size() >= this.f62706b;
        }
    }

    /* renamed from: qh0.h$b */
    public static final class C24786b extends C24784h {

        /* renamed from: b */
        public final int f62707b = 2;

        public C24786b() {
            super("must have exactly 2 value parameters");
        }

        /* renamed from: b */
        public final boolean mo60275b(C23900c cVar) {
            C24362h.m61211f(cVar, "functionDescriptor");
            return cVar.mo53442h().size() == this.f62707b;
        }
    }

    /* renamed from: qh0.h$c */
    public static final class C24787c extends C24784h {

        /* renamed from: b */
        public static final C24787c f62708b = new C24787c();

        public C24787c() {
            super("must have no value parameters");
        }

        /* renamed from: b */
        public final boolean mo60275b(C23900c cVar) {
            C24362h.m61211f(cVar, "functionDescriptor");
            return cVar.mo53442h().isEmpty();
        }
    }

    /* renamed from: qh0.h$d */
    public static final class C24788d extends C24784h {

        /* renamed from: b */
        public static final C24788d f62709b = new C24788d();

        public C24788d() {
            super("must have a single value parameter");
        }

        /* renamed from: b */
        public final boolean mo60275b(C23900c cVar) {
            C24362h.m61211f(cVar, "functionDescriptor");
            return cVar.mo53442h().size() == 1;
        }
    }

    public C24784h(String str) {
        this.f62705a = str;
    }

    /* renamed from: a */
    public final String mo60274a(C23900c cVar) {
        return C24770a.C24771a.m62306a(this, cVar);
    }

    public final String getDescription() {
        return this.f62705a;
    }
}
