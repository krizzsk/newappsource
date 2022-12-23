package if0;

import hf0.C23456a;
import mf0.C24362h;

/* renamed from: if0.a */
public class C23591a extends C23456a {

    /* renamed from: if0.a$a */
    public static final class C23592a {

        /* renamed from: a */
        public static final Integer f59666a;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0018 }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x0018 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0018 }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x0018 }
                if (r2 == 0) goto L_0x0019
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0018 }
                goto L_0x001a
            L_0x0018:
            L_0x0019:
                r1 = r0
            L_0x001a:
                if (r1 == 0) goto L_0x0028
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x0024
                r2 = 1
                goto L_0x0025
            L_0x0024:
                r2 = 0
            L_0x0025:
                if (r2 == 0) goto L_0x0028
                r0 = r1
            L_0x0028:
                f59666a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: if0.C23591a.C23592a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo58574a(Throwable th, Throwable th2) {
        boolean z;
        C24362h.m61211f(th, "cause");
        C24362h.m61211f(th2, "exception");
        Integer num = C23592a.f59666a;
        if (num == null || num.intValue() >= 19) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            th.addSuppressed(th2);
        } else {
            super.mo58574a(th, th2);
        }
    }
}
