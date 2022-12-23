package p288v9;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v9.i */
public final class C6882i implements C6877d {

    /* renamed from: a */
    public final C6883a f21241a;

    /* renamed from: b */
    public final C6880g f21242b;

    /* renamed from: c */
    public final HashMap f21243c = new HashMap();

    /* renamed from: v9.i$a */
    public static class C6883a {

        /* renamed from: a */
        public final Context f21244a;

        /* renamed from: b */
        public Map<String, String> f21245b = null;

        public C6883a(Context context) {
            this.f21244a = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p288v9.C6876c mo23138a(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.f21245b
                r3 = 0
                r4 = 0
                if (r2 != 0) goto L_0x0081
                android.content.Context r2 = r13.f21244a
                android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0026 }
                if (r5 != 0) goto L_0x0013
                goto L_0x0027
            L_0x0013:
                android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0026 }
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r7 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r6.<init>(r2, r7)     // Catch:{ NameNotFoundException -> 0x0026 }
                r2 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r2 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0026 }
                if (r2 != 0) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0026 }
                goto L_0x0028
            L_0x0026:
            L_0x0027:
                r2 = r3
            L_0x0028:
                if (r2 != 0) goto L_0x002f
                java.util.Map r2 = java.util.Collections.emptyMap()
                goto L_0x007f
            L_0x002f:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Set r6 = r2.keySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x003c:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x007e
                java.lang.Object r7 = r6.next()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r2.get(r7)
                boolean r9 = r8 instanceof java.lang.String
                if (r9 == 0) goto L_0x003c
                java.lang.String r9 = "backend:"
                boolean r9 = r7.startsWith(r9)
                if (r9 == 0) goto L_0x003c
                java.lang.String r8 = (java.lang.String) r8
                r9 = -1
                java.lang.String r10 = ","
                java.lang.String[] r8 = r8.split(r10, r9)
                int r9 = r8.length
                r10 = 0
            L_0x0063:
                if (r10 >= r9) goto L_0x003c
                r11 = r8[r10]
                java.lang.String r11 = r11.trim()
                boolean r12 = r11.isEmpty()
                if (r12 == 0) goto L_0x0072
                goto L_0x007b
            L_0x0072:
                r12 = 8
                java.lang.String r12 = r7.substring(r12)
                r5.put(r11, r12)
            L_0x007b:
                int r10 = r10 + 1
                goto L_0x0063
            L_0x007e:
                r2 = r5
            L_0x007f:
                r13.f21245b = r2
            L_0x0081:
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.f21245b
                java.lang.Object r14 = r2.get(r14)
                java.lang.String r14 = (java.lang.String) r14
                if (r14 != 0) goto L_0x008c
                return r3
            L_0x008c:
                r2 = 1
                java.lang.Class r5 = java.lang.Class.forName(r14)     // Catch:{ ClassNotFoundException -> 0x00c6, IllegalAccessException -> 0x00be, InstantiationException -> 0x00b6, NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00a6 }
                java.lang.Class<v9.c> r6 = p288v9.C6876c.class
                java.lang.Class r5 = r5.asSubclass(r6)     // Catch:{ ClassNotFoundException -> 0x00c6, IllegalAccessException -> 0x00be, InstantiationException -> 0x00b6, NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00a6 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00c6, IllegalAccessException -> 0x00be, InstantiationException -> 0x00b6, NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00a6 }
                java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00c6, IllegalAccessException -> 0x00be, InstantiationException -> 0x00b6, NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00a6 }
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00c6, IllegalAccessException -> 0x00be, InstantiationException -> 0x00b6, NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00a6 }
                java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00c6, IllegalAccessException -> 0x00be, InstantiationException -> 0x00b6, NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00a6 }
                v9.c r5 = (p288v9.C6876c) r5     // Catch:{ ClassNotFoundException -> 0x00c6, IllegalAccessException -> 0x00be, InstantiationException -> 0x00b6, NoSuchMethodException -> 0x00ae, InvocationTargetException -> 0x00a6 }
                return r5
            L_0x00a6:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto L_0x00cf
            L_0x00ae:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto L_0x00cf
            L_0x00b6:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto L_0x00cf
            L_0x00be:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto L_0x00cf
            L_0x00c6:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String r14 = "Class %s is not found."
                java.lang.String.format(r14, r0)
            L_0x00cf:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p288v9.C6882i.C6883a.mo23138a(java.lang.String):v9.c");
        }
    }

    public C6882i(Context context, C6880g gVar) {
        C6883a aVar = new C6883a(context);
        this.f21241a = aVar;
        this.f21242b = gVar;
    }

    public final synchronized C6885k get(String str) {
        if (this.f21243c.containsKey(str)) {
            return (C6885k) this.f21243c.get(str);
        }
        C6876c a = this.f21241a.mo23138a(str);
        if (a == null) {
            return null;
        }
        C6880g gVar = this.f21242b;
        C6885k create = a.create(new C6875b(gVar.f21235a, gVar.f21236b, gVar.f21237c, str));
        this.f21243c.put(str, create);
        return create;
    }
}
