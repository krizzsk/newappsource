package p434dd;

/* renamed from: dd.e0 */
public final class C16550e0 implements C16552f0, C16546c0 {

    /* renamed from: d */
    public static final Object f43186d = new Object();

    /* renamed from: b */
    public volatile C16552f0 f43187b;

    /* renamed from: c */
    public volatile Object f43188c = f43186d;

    public C16550e0(C16552f0 f0Var) {
        this.f43187b = f0Var;
    }

    /* renamed from: a */
    public static C16546c0 m42052a(C16552f0 f0Var) {
        if (f0Var instanceof C16546c0) {
            return (C16546c0) f0Var;
        }
        f0Var.getClass();
        return new C16550e0(f0Var);
    }

    /* renamed from: b */
    public static C16552f0 m42053b(C16552f0 f0Var) {
        if (f0Var instanceof C16550e0) {
            return f0Var;
        }
        return new C16550e0(f0Var);
    }

    public final Object zza() {
        Object obj = this.f43188c;
        Object obj2 = f43186d;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f43188c;
                if (obj == obj2) {
                    obj = this.f43187b.zza();
                    Object obj3 = this.f43188c;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            String valueOf = String.valueOf(obj3);
                            String valueOf2 = String.valueOf(obj);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f43188c = obj;
                    this.f43187b = null;
                }
            }
        }
        return obj;
    }
}
