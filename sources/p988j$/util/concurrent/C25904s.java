package p988j$.util.concurrent;

/* renamed from: j$.util.concurrent.s */
final class C25904s extends C25898m {

    /* renamed from: e */
    C25904s f64578e;

    /* renamed from: f */
    C25904s f64579f;

    /* renamed from: g */
    C25904s f64580g;

    /* renamed from: h */
    C25904s f64581h;

    /* renamed from: i */
    boolean f64582i;

    C25904s(int i, Object obj, Object obj2, C25904s sVar, C25904s sVar2) {
        super(i, obj, obj2, sVar);
        this.f64578e = sVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C25898m mo83961a(int i, Object obj) {
        return mo83982b(i, obj, (Class) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C25904s mo83982b(int i, Object obj, Class<?> cls) {
        int compareComparables;
        if (obj == null) {
            return null;
        }
        C25904s sVar = this;
        do {
            C25904s sVar2 = sVar.f64579f;
            C25904s sVar3 = sVar.f64580g;
            int i2 = sVar.f64557a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = sVar.f64558b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return sVar;
                    }
                    if (sVar2 != null) {
                        if (sVar3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) {
                                C25904s b = sVar3.mo83982b(i, obj, cls);
                                if (b != null) {
                                    return b;
                                }
                            } else if (compareComparables >= 0) {
                                sVar2 = sVar3;
                            }
                        }
                    }
                }
                sVar = sVar3;
                continue;
            }
            sVar = sVar2;
            continue;
        } while (sVar != null);
        return null;
    }
}
