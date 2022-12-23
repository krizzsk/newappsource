package com.veriff.sdk.internal;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.veriff.sdk.internal.z */
public final class C22765z {

    /* renamed from: a */
    private static final C22152o[] f57693a = new C22152o[0];

    /* renamed from: b */
    private static int m55811b(C22292q qVar, C22292q qVar2) {
        if (qVar == null || qVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(qVar.mo56294a() - qVar2.mo56294a());
    }

    /* renamed from: a */
    public C22152o mo57458a(C21737h hVar) throws C21946l, C21842j, C21764i {
        return mo57459a(hVar, (Map<Object, ?>) null);
    }

    /* renamed from: b */
    private static int m55812b(C22292q[] qVarArr) {
        return Math.min(Math.min(m55811b(qVarArr[0], qVarArr[4]), (m55811b(qVarArr[6], qVarArr[2]) * 17) / 18), Math.min(m55811b(qVarArr[1], qVarArr[5]), (m55811b(qVarArr[7], qVarArr[3]) * 17) / 18));
    }

    /* renamed from: a */
    public C22152o mo57459a(C21737h hVar, Map<Object, ?> map) throws C21946l, C21842j, C21764i {
        C22152o oVar;
        C22152o[] a = m55810a(hVar, map, false);
        if (a.length != 0 && (oVar = a[0]) != null) {
            return oVar;
        }
        throw C21946l.m53563a();
    }

    /* renamed from: a */
    private static C22152o[] m55810a(C21737h hVar, Map<Object, ?> map, boolean z) throws C21946l, C21842j, C21764i {
        ArrayList arrayList = new ArrayList();
        C21404ap a = C21403ao.m50994a(hVar, map, z);
        for (C22292q[] next : a.mo54203b()) {
            C22582u a2 = C21399ak.m50956a(a.mo54202a(), next[4], next[5], next[6], next[7], m55812b(next), m55809a(next));
            C22152o oVar = new C22152o(a2.mo56841b(), a2.mo56840a(), next, C21619f.PDF_417);
            oVar.mo56075a(C22242p.ERROR_CORRECTION_LEVEL, a2.mo56843c());
            C21278aa aaVar = (C21278aa) a2.mo56844d();
            if (aaVar != null) {
                oVar.mo56075a(C22242p.PDF417_EXTRA_METADATA, aaVar);
            }
            arrayList.add(oVar);
        }
        return (C22152o[]) arrayList.toArray(f57693a);
    }

    /* renamed from: a */
    private static int m55808a(C22292q qVar, C22292q qVar2) {
        if (qVar == null || qVar2 == null) {
            return 0;
        }
        return (int) Math.abs(qVar.mo56294a() - qVar2.mo56294a());
    }

    /* renamed from: a */
    private static int m55809a(C22292q[] qVarArr) {
        return Math.max(Math.max(m55808a(qVarArr[0], qVarArr[4]), (m55808a(qVarArr[6], qVarArr[2]) * 17) / 18), Math.max(m55808a(qVarArr[1], qVarArr[5]), (m55808a(qVarArr[7], qVarArr[3]) * 17) / 18));
    }
}
