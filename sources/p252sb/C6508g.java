package p252sb;

import com.google.android.exoplayer2.trackselection.C3997b;
import com.google.android.exoplayer2.trackselection.C4000c;
import p099ga.C4954z0;
import p277ub.C6774a0;

/* renamed from: sb.g */
public final class C6508g {

    /* renamed from: a */
    public final int f20299a;

    /* renamed from: b */
    public final C4954z0[] f20300b;

    /* renamed from: c */
    public final C3997b[] f20301c;

    /* renamed from: d */
    public final Object f20302d;

    public C6508g(C4954z0[] z0VarArr, C3997b[] bVarArr, C4000c.C4001a aVar) {
        this.f20300b = z0VarArr;
        this.f20301c = (C3997b[]) bVarArr.clone();
        this.f20302d = aVar;
        this.f20299a = z0VarArr.length;
    }

    /* renamed from: a */
    public final boolean mo22612a(C6508g gVar, int i) {
        if (gVar != null && C6774a0.m15941a(this.f20300b[i], gVar.f20300b[i]) && C6774a0.m15941a(this.f20301c[i], gVar.f20301c[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo22613b(int i) {
        return this.f20300b[i] != null;
    }
}
