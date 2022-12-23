package p750ql;

import com.masabi.justride.sdk.jobs.barcode.C14654a;
import com.masabi.justride.sdk.jobs.barcode.C14655b;
import p364al.C13487h;
import p465ek.C16836d;
import p583jk.C17875h;
import p725pj.C18926a;
import p891wk.C20362q;

/* renamed from: ql.c */
public final class C19137c {

    /* renamed from: a */
    public final C14655b f48655a;

    public C19137c(C14655b bVar) {
        this.f48655a = bVar;
    }

    /* renamed from: a */
    public final C13487h<C14654a> mo51575a(C20362q qVar) {
        if (C17875h.m44278B(qVar.f51615u)) {
            return new C13487h<>(null, new C16836d((C18926a) null, 103, "There is no barcode in the ticket"));
        }
        return new C13487h<>(new C14654a(this.f48655a, qVar), (C18926a) null);
    }
}
