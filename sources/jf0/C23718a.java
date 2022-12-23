package jf0;

import if0.C23591a;
import kotlin.random.Random;
import pf0.C24691b;
import qf0.C24735a;

/* renamed from: jf0.a */
public class C23718a extends C23591a {

    /* renamed from: jf0.a$a */
    public static final class C23719a {

        /* renamed from: a */
        public static final Integer f59924a;

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
                f59924a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jf0.C23718a.C23719a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final Random mo58575b() {
        boolean z;
        Integer num = C23719a.f59924a;
        if (num == null || num.intValue() >= 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C24735a();
        }
        return new C24691b();
    }
}
