package p168m4;

import java.lang.reflect.Method;
import java.util.Stack;
import org.xml.sax.helpers.AttributesImpl;
import p001a0.C0017h;
import p043ch.qos.logback.core.util.AggregationType;
import p193o4.C5978d;
import p193o4.C5982h;
import p193o4.C5984j;
import p206p4.C6064c;
import p271u4.C6692c;
import p271u4.C6695f;
import p296w4.C6990g;
import p296w4.C6992h;

/* renamed from: m4.l */
public final class C5695l extends C5690h {

    /* renamed from: e */
    public Stack<C5689g> f18485e = new Stack<>();

    /* renamed from: m4.l$a */
    public static /* synthetic */ class C5696a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18486a;

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
                f18486a = r0
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18486a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_BASIC_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18486a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_BASIC_PROPERTY_COLLECTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18486a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_COMPLEX_PROPERTY_COLLECTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18486a     // Catch:{ NoSuchFieldError -> 0x003e }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_COMPLEX_PROPERTY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p168m4.C5695l.C5696a.<clinit>():void");
        }
    }

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) {
        Class<?> cls;
        C5689g peek = this.f18485e.peek();
        String q = hVar.mo21977q(attributesImpl.getValue("class"));
        try {
            if (!C6992h.m16474c(q)) {
                cls = C6990g.m16471a(this.f20771c).loadClass(q);
            } else {
                cls = peek.f18477a.mo22048q(peek.f18479c, peek.f18478b, hVar.f19135j);
            }
            if (cls == null) {
                peek.f18481e = true;
                mo21722a("Could not find an appropriate class for property [" + str + "]");
                return;
            }
            if (C6992h.m16474c(q)) {
                mo22865i("Assuming default type [" + cls.getName() + "] for [" + str + "] property");
            }
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            peek.f18480d = newInstance;
            if (newInstance instanceof C6692c) {
                ((C6692c) newInstance).mo20064b(this.f20771c);
            }
            hVar.mo21976p(peek.f18480d);
        } catch (Exception e) {
            peek.f18481e = true;
            mo21727f(C0017h.m56M("Could not create component [", str, "] of type [", q, "]"), e);
        }
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) {
        String str2;
        C5689g pop = this.f18485e.pop();
        if (!pop.f18481e) {
            C6064c cVar = new C6064c(pop.f18480d);
            cVar.mo20064b(this.f20771c);
            if (cVar.mo22046n("parent") == AggregationType.AS_COMPLEX_PROPERTY) {
                cVar.mo22053v(pop.f18477a.f19319e, "parent");
            }
            Object obj = pop.f18480d;
            if (obj instanceof C6695f) {
                boolean z = false;
                if (obj != null && ((C5984j) obj.getClass().getAnnotation(C5984j.class)) == null) {
                    z = true;
                }
                if (z) {
                    ((C6695f) obj).start();
                }
            }
            if (hVar.mo21974n() != pop.f18480d) {
                str2 = "The object on the top the of the stack is not the component pushed earlier.";
            } else {
                hVar.mo21975o();
                int i = C5696a.f18486a[pop.f18478b.ordinal()];
                if (i == 4) {
                    C6064c cVar2 = pop.f18477a;
                    Object obj2 = pop.f18480d;
                    Method p = cVar2.mo22047p(str);
                    if (p == null) {
                        StringBuilder l = C13555b.m33973l("Could not find method [add", str, "] in class [");
                        l.append(cVar2.f19320f.getName());
                        l.append("].");
                        cVar2.mo21722a(l.toString());
                        return;
                    } else if (cVar2.mo22052u(str, p.getParameterTypes(), obj2)) {
                        cVar2.mo22051t(obj2, p);
                        return;
                    } else {
                        return;
                    }
                } else if (i != 5) {
                    StringBuilder k = C13555b.m33972k("Unexpected aggregationType ");
                    k.append(pop.f18478b);
                    str2 = k.toString();
                } else {
                    pop.f18477a.mo22053v(pop.f18480d, str);
                    return;
                }
            }
            mo21722a(str2);
        }
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
        int i = C5696a.f18486a[n.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            this.f18485e.push(new C5689g(cVar, n, b));
            return true;
        }
        mo21722a("PropertySetter.computeAggregationType returned " + n);
        return false;
    }
}
