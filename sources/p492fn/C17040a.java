package p492fn;

import java.util.List;
import mf0.C24361g;
import p364al.C13483d;
import p364al.C13487h;
import p492fn.C17044d;
import p581ji.C17854a;
import p725pj.C18926a;
import p891wk.C20347b0;
import p891wk.C20362q;

/* renamed from: fn.a */
public final class C17040a implements C13483d<C17043c> {

    /* renamed from: a */
    public final boolean f44178a = false;

    /* renamed from: b */
    public final C20362q f44179b;

    /* renamed from: c */
    public final C17044d.C17045a f44180c;

    /* renamed from: fn.a$a */
    public static class C17041a {

        /* renamed from: a */
        public final C17044d.C17045a f44181a;

        public C17041a(C17044d.C17045a aVar) {
            this.f44181a = aVar;
        }
    }

    public C17040a(C20362q qVar, C17044d.C17045a aVar) {
        this.f44179b = qVar;
        this.f44180c = aVar;
    }

    /* renamed from: C */
    public final C13487h<C17043c> mo40394C() {
        C17046e[] eVarArr;
        List<C20347b0> list;
        C17044d.C17045a aVar = this.f44180c;
        C20362q qVar = this.f44179b;
        boolean z = this.f44178a;
        aVar.getClass();
        C17854a M = C24361g.m61143M(true);
        aVar.f44195b.getClass();
        if (qVar == null || (list = qVar.f51616v) == null) {
            eVarArr = new C17046e[0];
        } else {
            int size = list.size();
            eVarArr = new C17046e[size];
            for (int i = 0; i < size; i++) {
                C20347b0 b0Var = qVar.f51616v.get(i);
                List<Integer> list2 = b0Var.f51521b;
                int size2 = list2.size();
                byte[] bArr = new byte[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    bArr[i2] = list2.get(i2).byteValue();
                }
                eVarArr[i] = new C17046e(bArr, b0Var.f51520a.shortValue(), qVar.f51581C);
            }
        }
        return new C13487h<>(new C17043c(new C17044d(aVar.f44194a, M, eVarArr, z)), (C18926a) null);
    }
}
