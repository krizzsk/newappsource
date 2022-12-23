package zg0;

import kotlin.Pair;
import ug0.C25065b;
import ug0.C25069e;

/* renamed from: zg0.i */
public final class C25500i extends C25498g<Pair<? extends C25065b, ? extends C25069e>> {

    /* renamed from: b */
    public final C25065b f63775b;

    /* renamed from: c */
    public final C25069e f63776c;

    public C25500i(C25065b bVar, C25069e eVar) {
        super(new Pair(bVar, eVar));
        this.f63775b = bVar;
        this.f63776c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (xg0.C25260c.m63397n(r2, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS) != false) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final lh0.C24307v mo62745a(zf0.C25485t r2) {
        /*
            r1 = this;
            java.lang.String r0 = "module"
            mf0.C24362h.m61211f(r2, r0)
            ug0.b r0 = r1.f63775b
            zf0.c r2 = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.m58735a(r2, r0)
            if (r2 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            int r0 = xg0.C25260c.f63536a
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            boolean r0 = xg0.C25260c.m63397n(r2, r0)
            if (r0 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 != 0) goto L_0x003a
            java.lang.String r2 = "Containing class for error-class based enum entry "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            ug0.b r0 = r1.f63775b
            r2.append(r0)
            r0 = 46
            r2.append(r0)
            ug0.e r0 = r1.f63776c
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            lh0.o r2 = lh0.C24289p.m60914d(r2)
            goto L_0x0043
        L_0x003a:
            lh0.z r2 = r2.mo53412q()
            java.lang.String r0 = "module.findClassAcrossMo…mClassId.$enumEntryName\")"
            mf0.C24362h.m61210e(r2, r0)
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zg0.C25500i.mo62745a(zf0.t):lh0.v");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63775b.mo61577j());
        sb.append('.');
        sb.append(this.f63776c);
        return sb.toString();
    }
}
