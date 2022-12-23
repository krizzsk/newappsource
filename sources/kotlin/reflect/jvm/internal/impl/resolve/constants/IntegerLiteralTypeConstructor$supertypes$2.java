package kotlin.reflect.jvm.internal.impl.resolve.constants;

import ag0.C20989e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24225a;
import lh0.C24285n0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17875h;
import zf0.C25485t;

public final class IntegerLiteralTypeConstructor$supertypes$2 extends Lambda implements C24225a<List<C24312z>> {
    public final /* synthetic */ IntegerLiteralTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegerLiteralTypeConstructor$supertypes$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        super(0);
        this.this$0 = integerLiteralTypeConstructor;
    }

    public final Object invoke() {
        boolean z = true;
        C24312z q = this.this$0.mo53458m().mo59388k("Comparable").mo53412q();
        C24362h.m61210e(q, "builtIns.comparable.defaultType");
        ArrayList H = C17875h.m44284H(C24361g.m61171k0(q, C17875h.m44280D(new C24285n0(this.this$0.f61202d, Variance.IN_VARIANCE)), (C20989e) null, 2));
        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = this.this$0;
        C25485t tVar = integerLiteralTypeConstructor.f61200b;
        C24362h.m61211f(tVar, "<this>");
        C24312z[] zVarArr = new C24312z[4];
        C23867c m = tVar.mo59460m();
        m.getClass();
        C24312z t = m.mo59396t(PrimitiveType.INT);
        if (t != null) {
            zVarArr[0] = t;
            C23867c m2 = tVar.mo59460m();
            m2.getClass();
            C24312z t2 = m2.mo59396t(PrimitiveType.LONG);
            if (t2 != null) {
                zVarArr[1] = t2;
                C23867c m3 = tVar.mo59460m();
                m3.getClass();
                C24312z t3 = m3.mo59396t(PrimitiveType.BYTE);
                if (t3 != null) {
                    zVarArr[2] = t3;
                    C23867c m4 = tVar.mo59460m();
                    m4.getClass();
                    C24312z t4 = m4.mo59396t(PrimitiveType.SHORT);
                    if (t4 != null) {
                        zVarArr[3] = t4;
                        List E = C17875h.m44281E(zVarArr);
                        if (!(E instanceof Collection) || !E.isEmpty()) {
                            Iterator it = E.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (!(!integerLiteralTypeConstructor.f61201c.contains((C24307v) it.next()))) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            C24312z q2 = this.this$0.mo53458m().mo59388k("Number").mo53412q();
                            if (q2 != null) {
                                H.add(q2);
                            } else {
                                C23867c.m58681a(55);
                                throw null;
                            }
                        }
                        return H;
                    }
                    C23867c.m58681a(57);
                    throw null;
                }
                C23867c.m58681a(56);
                throw null;
            }
            C23867c.m58681a(59);
            throw null;
        }
        C23867c.m58681a(58);
        throw null;
    }
}
