package com.google.android.play.core.assetpacks;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kj0.C23811f;
import p364al.C13487h;
import p465ek.C16835c;
import p725pj.C18926a;
import p891wk.C20362q;
import p916xl.C20536b;

/* renamed from: com.google.android.play.core.assetpacks.b1 */
public final /* synthetic */ class C14248b1 implements C14272h1, C23811f {

    /* renamed from: b */
    public final Object f35803b;

    /* renamed from: c */
    public final Object f35804c;

    public /* synthetic */ C14248b1(Object obj, Object obj2) {
        this.f35803b = obj;
        this.f35804c = obj2;
    }

    /* renamed from: a */
    public final boolean mo5645a() {
        return ((C23811f) this.f35803b).mo5645a();
    }

    /* renamed from: b */
    public final C13487h mo42802b(List list, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13487h<C20362q> a = ((GetTicketJob) this.f35803b).mo44363a((String) it.next());
            if (a.mo40399a()) {
                C18926a aVar = a.f33366b;
                if (z) {
                    if (!aVar.f48169a.equals("ticket.access") || (!aVar.f48170b.equals(C16835c.f43812e) && !aVar.f48170b.equals(C16835c.f43815h))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        ((C20536b) this.f35804c).mo52737a(aVar);
                    }
                }
                return new C13487h(null, new C16835c(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
            }
            arrayList.add(a.f33365a);
        }
        return new C13487h(arrayList, (C18926a) null);
    }

    public final int getLength() {
        return ((C23811f) this.f35803b).getLength();
    }

    public final Class getType() {
        return (Class) this.f35804c;
    }

    public final Object getValue() {
        return ((C23811f) this.f35803b).getValue();
    }

    public final void setValue(Object obj) {
        ((C23811f) this.f35803b).setValue(obj);
    }

    public final Object zza() {
        int i;
        C14276i1 i1Var = (C14276i1) this.f35803b;
        List list = (List) this.f35804c;
        i1Var.getClass();
        HashMap hashMap = new HashMap();
        for (C14264f1 f1Var : i1Var.f35909e.values()) {
            String str = f1Var.f35864c.f35834a;
            if (list.contains(str)) {
                C14264f1 f1Var2 = (C14264f1) hashMap.get(str);
                if (f1Var2 == null) {
                    i = -1;
                } else {
                    i = f1Var2.f35862a;
                }
                if (i < f1Var.f35862a) {
                    hashMap.put(str, f1Var);
                }
            }
        }
        return hashMap;
    }
}
