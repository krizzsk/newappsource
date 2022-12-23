package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import ag0.C20989e;
import cf0.C21136j;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.C24162a;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24281l0;
import lh0.C24285n0;
import lh0.C24287o0;
import lh0.C24305u;
import mf0.C24362h;
import yg0.C25301a;
import yg0.C25303c;
import yg0.C25304d;
import zf0.C25448i0;

public final class CapturedTypeConstructorKt {
    /* renamed from: a */
    public static final C24281l0 m60270a(C24281l0 l0Var, C25448i0 i0Var) {
        if (i0Var == null || l0Var.mo60241b() == Variance.INVARIANT) {
            return l0Var;
        }
        if (i0Var.mo53482l() != l0Var.mo60241b()) {
            return new C24285n0(new C25301a(l0Var, new C25303c(l0Var), false, C20989e.C20990a.f52739a));
        }
        if (!l0Var.mo60240a()) {
            return new C24285n0(l0Var.getType());
        }
        LockBasedStorageManager.C24137a aVar = LockBasedStorageManager.f61310e;
        C24362h.m61210e(aVar, "NO_LOCKS");
        return new C24285n0(new C24162a(aVar, new CapturedTypeConstructorKt$createCapturedIfNeeded$1(l0Var)));
    }

    /* renamed from: b */
    public static C24287o0 m60271b(C24287o0 o0Var) {
        if (!(o0Var instanceof C24305u)) {
            return new C25304d(o0Var, true);
        }
        C24305u uVar = (C24305u) o0Var;
        C25448i0[] i0VarArr = uVar.f61604b;
        C24281l0[] l0VarArr = uVar.f61605c;
        C24362h.m61211f(l0VarArr, "<this>");
        C24362h.m61211f(i0VarArr, InneractiveMediationNameConsts.OTHER);
        int min = Math.min(l0VarArr.length, i0VarArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(l0VarArr[i], i0VarArr[i]));
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(m60270a((C24281l0) pair.mo59068c(), (C25448i0) pair.mo59069d()));
        }
        Object[] array = arrayList2.toArray(new C24281l0[0]);
        if (array != null) {
            return new C24305u(i0VarArr, (C24281l0[]) array, true);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
