package p168m4;

import java.lang.reflect.Method;
import java.util.Stack;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.util.AggregationType;
import p172m9.C5720b;
import p193o4.C5978d;
import p193o4.C5982h;
import p206p4.C6064c;

/* renamed from: m4.k */
public final class C5693k extends C5690h {

    /* renamed from: e */
    public Stack<C5688f> f18483e = new Stack<>();

    /* renamed from: m4.k$a */
    public static /* synthetic */ class C5694a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18484a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ch.qos.logback.core.util.AggregationType[] r0 = p043ch.qos.logback.core.util.AggregationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18484a = r0
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18484a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_COMPLEX_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18484a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_COMPLEX_PROPERTY_COLLECTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18484a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_BASIC_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18484a     // Catch:{ NoSuchFieldError -> 0x003e }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_BASIC_PROPERTY_COLLECTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p168m4.C5693k.C5694a.<clinit>():void");
        }
    }

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
    }

    /* renamed from: n */
    public final void mo21538n(C5982h hVar, String str) {
        String q = hVar.mo21977q(str);
        C5688f peek = this.f18483e.peek();
        int i = C5694a.f18484a[peek.f18475b.ordinal()];
        if (i == 4) {
            peek.f18474a.mo22054w(peek.f18476c, q);
        } else if (i != 5) {
            StringBuilder k = C13555b.m33972k("Unexpected aggregationType ");
            k.append(peek.f18475b);
            mo21722a(k.toString());
        } else {
            C6064c cVar = peek.f18474a;
            String str2 = peek.f18476c;
            cVar.getClass();
            if (q != null) {
                String m = C6064c.m14536m(str2);
                Method p = cVar.mo22047p(m);
                if (p == null) {
                    cVar.mo21722a("No adder for property [" + m + "].");
                    return;
                }
                Class[] parameterTypes = p.getParameterTypes();
                cVar.mo22052u(m, parameterTypes, q);
                try {
                    if (C5720b.m14052c(cVar, parameterTypes[0], q) != null) {
                        cVar.mo22051t(q, p);
                    }
                } catch (Throwable th) {
                    StringBuilder k2 = C13555b.m33972k("Conversion to type [");
                    k2.append(parameterTypes[0]);
                    k2.append("] failed. ");
                    cVar.mo21727f(k2.toString(), th);
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        this.f18483e.pop();
    }

    /* renamed from: q */
    public final boolean mo21540q(C5978d dVar, C5982h hVar) {
        String b = dVar.mo21964b();
        if (hVar.f19130e.isEmpty()) {
            return false;
        }
        C6064c cVar = new C6064c(hVar.mo21974n());
        cVar.mo20064b(this.f20771c);
        AggregationType n = cVar.mo22046n(b);
        int i = C5694a.f18484a[n.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            this.f18483e.push(new C5688f(cVar, n, b));
            return true;
        }
        mo21722a("PropertySetter.canContainComponent returned " + n);
        return false;
    }
}
