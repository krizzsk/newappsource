package xf0;

import bg0.C21053b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh0.C23792h;
import kotlin.collections.C23825c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.text.C24179b;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25081h;
import wf0.C25137a;
import wf0.C25139c;
import zf0.C25432c;
import zf0.C25485t;
import zf0.C25486u;

/* renamed from: xf0.a */
public final class C25249a implements C21053b {

    /* renamed from: a */
    public final C23792h f63522a;

    /* renamed from: b */
    public final C25485t f63523b;

    public C25249a(C23792h hVar, C23909c cVar) {
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(cVar, "module");
        this.f63522a = hVar;
        this.f63523b = cVar;
    }

    /* renamed from: a */
    public final boolean mo53180a(C25066c cVar, C25069e eVar) {
        C24362h.m61211f(cVar, "packageFqName");
        C24362h.m61211f(eVar, "name");
        String f = eVar.mo61604f();
        C24362h.m61210e(f, "name.asString()");
        if (C25081h.m62835F(f, "Function") || C25081h.m62835F(f, "KFunction") || C25081h.m62835F(f, "SuspendFunction") || C25081h.m62835F(f, "KSuspendFunction")) {
            FunctionClassKind.Companion.getClass();
            if (FunctionClassKind.C23874a.m58712a(f, cVar) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final Collection<C25432c> mo53181b(C25066c cVar) {
        C24362h.m61211f(cVar, "packageFqName");
        return EmptySet.f60175b;
    }

    /* renamed from: c */
    public final C25432c mo53182c(C25065b bVar) {
        C24362h.m61211f(bVar, "classId");
        if (bVar.f63252c || bVar.mo61578k()) {
            return null;
        }
        String b = bVar.mo61576i().mo61580b();
        C24362h.m61210e(b, "classId.relativeClassName.asString()");
        if (!C24179b.m60559G(b, "Function", false)) {
            return null;
        }
        C25066c h = bVar.mo61574h();
        C24362h.m61210e(h, "classId.packageFqName");
        FunctionClassKind.Companion.getClass();
        FunctionClassKind.C23874a.C23875a a = FunctionClassKind.C23874a.m58712a(b, h);
        if (a == null) {
            return null;
        }
        FunctionClassKind functionClassKind = a.f60389a;
        int i = a.f60390b;
        List<C25486u> m0 = this.f63523b.mo59458k0(h).mo59446m0();
        ArrayList arrayList = new ArrayList();
        for (T next : m0) {
            if (next instanceof C25137a) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 instanceof C25139c) {
                arrayList2.add(next2);
            }
        }
        C25137a aVar = (C25139c) C23825c.m58515l0(arrayList2);
        if (aVar == null) {
            aVar = (C25137a) C23825c.m58513j0(arrayList);
        }
        return new C25250b(this.f63522a, aVar, functionClassKind, i);
    }
}
