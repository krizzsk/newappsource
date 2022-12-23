package p404ce;

import android.app.Service;
import android.content.Context;

/* renamed from: ce.e */
public final class C13788e<T> {

    /* renamed from: a */
    public final T f33947a;

    /* renamed from: b */
    public final C13790b<T> f33948b;

    /* renamed from: ce.e$a */
    public static class C13789a implements C13790b<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f33949a;

        public C13789a(Class cls) {
            this.f33949a = cls;
        }
    }

    /* renamed from: ce.e$b */
    public interface C13790b<T> {
    }

    public C13788e(Object obj, C13789a aVar) {
        this.f33947a = obj;
        this.f33948b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A[LOOP:1: B:23:0x0073->B:25:0x0079, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo40721a() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ce.e$b<T> r1 = r7.f33948b
            T r2 = r7.f33947a
            ce.e$a r1 = (p404ce.C13788e.C13789a) r1
            r1.getClass()
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002f }
            if (r3 != 0) goto L_0x0017
            goto L_0x002f
        L_0x0017:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x002f }
            java.lang.Class<? extends android.app.Service> r5 = r1.f33949a     // Catch:{ NameNotFoundException -> 0x002f }
            r4.<init>(r2, r5)     // Catch:{ NameNotFoundException -> 0x002f }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r2 = r3.getServiceInfo(r4, r2)     // Catch:{ NameNotFoundException -> 0x002f }
            if (r2 != 0) goto L_0x002c
            java.lang.Class<? extends android.app.Service> r1 = r1.f33949a     // Catch:{ NameNotFoundException -> 0x002f }
            java.util.Objects.toString(r1)     // Catch:{ NameNotFoundException -> 0x002f }
            goto L_0x002f
        L_0x002c:
            android.os.Bundle r1 = r2.metaData     // Catch:{ NameNotFoundException -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x0037
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x006f
        L_0x0037:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0044:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r6 = "com.google.firebase.components.ComponentRegistrar"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0044
            java.lang.String r5 = "com.google.firebase.components:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0044
            r5 = 31
            java.lang.String r4 = r4.substring(r5)
            r2.add(r4)
            goto L_0x0044
        L_0x006e:
            r1 = r2
        L_0x006f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0073:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0088
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            ce.d r3 = new ce.d
            r3.<init>(r2)
            r0.add(r3)
            goto L_0x0073
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p404ce.C13788e.mo40721a():java.util.ArrayList");
    }
}
