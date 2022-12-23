package lh0;

import ag0.C20989e;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mf0.C24362h;

/* renamed from: lh0.o0 */
public abstract class C24287o0 {

    /* renamed from: a */
    public static final C24288a f61584a = new C24288a();

    /* renamed from: lh0.o0$a */
    public static final class C24288a extends C24287o0 {
        /* renamed from: d */
        public final C24281l0 mo59555d(C24307v vVar) {
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* renamed from: a */
    public boolean mo60433a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo60439b() {
        return false;
    }

    /* renamed from: c */
    public C20989e mo60434c(C20989e eVar) {
        C24362h.m61211f(eVar, "annotations");
        return eVar;
    }

    /* renamed from: d */
    public abstract C24281l0 mo59555d(C24307v vVar);

    /* renamed from: e */
    public boolean mo60435e() {
        return this instanceof C24288a;
    }

    /* renamed from: f */
    public C24307v mo60436f(C24307v vVar, Variance variance) {
        C24362h.m61211f(vVar, "topLevelType");
        C24362h.m61211f(variance, "position");
        return vVar;
    }
}
