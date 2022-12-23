package hf0;

import java.lang.reflect.Method;
import kotlin.random.Random;
import mf0.C24362h;
import pf0.C24691b;

/* renamed from: hf0.a */
public class C23456a {

    /* renamed from: hf0.a$a */
    public static final class C23457a {

        /* renamed from: a */
        public static final Method f59231a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
            if (mf0.C24362h.m61206a(r5, r0) != false) goto L_0x0036;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                mf0.C24362h.m61210e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x003d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = mf0.C24362h.m61206a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x0035
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                mf0.C24362h.m61210e(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x002e
                r5 = r7[r3]
            L_0x002e:
                boolean r5 = mf0.C24362h.m61206a(r5, r0)
                if (r5 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r8 = 0
            L_0x0036:
                if (r8 == 0) goto L_0x003a
                r5 = r6
                goto L_0x003d
            L_0x003a:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x003d:
                f59231a = r5
                int r0 = r1.length
            L_0x0040:
                if (r3 >= r0) goto L_0x0054
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = mf0.C24362h.m61206a(r2, r4)
                if (r2 == 0) goto L_0x0051
                goto L_0x0054
            L_0x0051:
                int r3 = r3 + 1
                goto L_0x0040
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hf0.C23456a.C23457a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo58574a(Throwable th, Throwable th2) {
        C24362h.m61211f(th, "cause");
        C24362h.m61211f(th2, "exception");
        Method method = C23457a.f59231a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public Random mo58575b() {
        return new C24691b();
    }
}
