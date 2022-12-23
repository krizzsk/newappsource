package com.masabi.justride.sdk.jobs.barcode;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import mf0.C24361g;
import p364al.C13487h;
import p434dd.C16545c;
import p465ek.C16836d;
import p583jk.C17867b;
import p583jk.C17873f;
import p707op.C18813a;
import p752qn.C19144b;
import p891wk.C20362q;
import p891wk.C20370y;

/* renamed from: com.masabi.justride.sdk.jobs.barcode.a */
public final class C14654a {

    /* renamed from: a */
    public final C14655b f37117a;

    /* renamed from: b */
    public final C20362q f37118b;

    public C14654a(C14655b bVar, C20362q qVar) {
        this.f37117a = bVar;
        this.f37118b = qVar;
    }

    /* renamed from: a */
    public static C19144b m36784a(C20370y yVar, String str) {
        String str2 = yVar.f51648b;
        String str3 = yVar.f51649c;
        String str4 = yVar.f51650d;
        String str5 = yVar.f51653g;
        Boolean bool = Boolean.TRUE;
        return new C19144b(str, str2, str3, str4, str5, bool.equals(yVar.f51651e), bool.equals(yVar.f51652f));
    }

    /* renamed from: b */
    public final C16545c mo44344b(C20370y yVar, boolean z) {
        C13487h hVar;
        if (!Boolean.TRUE.equals(yVar.f51652f)) {
            return new C16545c((Object) m36784a(yVar, yVar.f51647a), (Object) null);
        }
        C14655b bVar = this.f37117a;
        C20362q qVar = this.f37118b;
        long a = bVar.f37119a.mo49402a();
        if (!bVar.f37123e.mo52603a(qVar).isActive()) {
            hVar = new C13487h(null, new C16836d((Integer) 101, "Ticket is not in an active state"));
        } else if (!yVar.f51648b.startsWith("FT")) {
            hVar = new C13487h(null, new C16836d((Integer) 106, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        } else {
            try {
                ArrayList c = bVar.mo44347c(qVar, z, a);
                String str = yVar.f51647a;
                bVar.f37120b.getClass();
                byte[] a2 = C17867b.C17868a.m44272a(str);
                C18813a.C18814a aVar = bVar.f37121c;
                aVar.getClass();
                hVar = bVar.mo44346b(c, new C18813a(C24361g.m61143M(false), aVar.f47927a, new ByteArrayOutputStream()), a2);
            } catch (BarcodeException e) {
                bVar.f37124f.getClass();
                hVar = new C13487h(null, new C16836d((Integer) 107, C17873f.m44275b(e)));
            }
        }
        if (hVar.mo40399a()) {
            return new C16545c((Object) null, (Object) new C16836d(hVar.f33366b, 104, "Failed to generate barcode"));
        }
        return new C16545c((Object) m36784a(yVar, (String) hVar.f33365a), (Object) null);
    }

    /* renamed from: c */
    public final C16545c mo44345c(boolean z) {
        List<C20370y> list = this.f37118b.f51615u;
        for (C20370y next : list) {
            if (next.f51651e.booleanValue()) {
                return mo44344b(next, z);
            }
        }
        return mo44344b(list.get(0), z);
    }
}
