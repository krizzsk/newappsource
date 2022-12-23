package mh0;

import com.appboy.Constants;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import lh0.C24259d;
import lh0.C24306u0;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;

/* renamed from: mh0.h */
public final class C24384h implements C24382g {

    /* renamed from: c */
    public final C24378d f61726c;

    /* renamed from: d */
    public final KotlinTypePreparator f61727d;

    /* renamed from: e */
    public final OverridingUtil f61728e;

    public C24384h(C24378d dVar, KotlinTypePreparator kotlinTypePreparator) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        C24362h.m61211f(kotlinTypePreparator, "kotlinTypePreparator");
        this.f61726c = dVar;
        this.f61727d = kotlinTypePreparator;
        this.f61728e = new OverridingUtil(OverridingUtil.f61190e, dVar);
    }

    /* renamed from: c */
    public static boolean m61351c(TypeCheckerState typeCheckerState, C24306u0 u0Var, C24306u0 u0Var2) {
        C24362h.m61211f(typeCheckerState, "<this>");
        C24362h.m61211f(u0Var, Constants.APPBOY_PUSH_CONTENT_KEY);
        C24362h.m61211f(u0Var2, "b");
        return C24259d.m60803d(typeCheckerState, u0Var, u0Var2);
    }

    /* renamed from: e */
    public static boolean m61352e(TypeCheckerState typeCheckerState, C24306u0 u0Var, C24306u0 u0Var2) {
        C24362h.m61211f(typeCheckerState, "<this>");
        C24362h.m61211f(u0Var, "subType");
        C24362h.m61211f(u0Var2, "superType");
        return C24259d.m60807h(typeCheckerState, u0Var, u0Var2);
    }

    /* renamed from: a */
    public final OverridingUtil mo60528a() {
        return this.f61728e;
    }

    /* renamed from: b */
    public final C24378d mo60529b() {
        return this.f61726c;
    }

    /* renamed from: d */
    public final boolean mo60530d(C24307v vVar, C24307v vVar2) {
        C24362h.m61211f(vVar, Constants.APPBOY_PUSH_CONTENT_KEY);
        C24362h.m61211f(vVar2, "b");
        return m61351c(C17875h.m44309t(false, false, (C24373a) null, this.f61727d, this.f61726c, 6), vVar.mo60450R0(), vVar2.mo60450R0());
    }

    /* renamed from: f */
    public final boolean mo60531f(C24307v vVar, C24307v vVar2) {
        C24362h.m61211f(vVar, "subtype");
        C24362h.m61211f(vVar2, "supertype");
        return m61352e(C17875h.m44309t(true, false, (C24373a) null, this.f61727d, this.f61726c, 6), vVar.mo60450R0(), vVar2.mo60450R0());
    }
}
