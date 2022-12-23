package xf0;

import java.util.List;
import kh0.C23792h;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import mf0.C24362h;
import p583jk.C17875h;
import xf0.C25255d;

/* renamed from: xf0.c */
public final class C25253c extends GivenFunctionsMemberScope {

    /* renamed from: xf0.c$a */
    public /* synthetic */ class C25254a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63535a;

        static {
            int[] iArr = new int[FunctionClassKind.values().length];
            iArr[FunctionClassKind.Function.ordinal()] = 1;
            iArr[FunctionClassKind.SuspendFunction.ordinal()] = 2;
            f63535a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25253c(C23792h hVar, C25250b bVar) {
        super(hVar, bVar);
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(bVar, "containingClass");
    }

    /* renamed from: h */
    public final List<C23900c> mo60183h() {
        int i = C25254a.f63535a[((C25250b) this.f61211b).f63528h.ordinal()];
        if (i == 1) {
            return C17875h.m44280D(C25255d.C25256a.m63373a((C25250b) this.f61211b, false));
        }
        if (i != 2) {
            return EmptyList.f60173b;
        }
        return C17875h.m44280D(C25255d.C25256a.m63373a((C25250b) this.f61211b, true));
    }
}
