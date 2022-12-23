package p468en;

import p364al.C13487h;
import p537hk.C17456a;
import p725pj.C18926a;
import p889wi.C20342a;
import p938yk.C20735a;
import p938yk.C20737b;
import p938yk.C20738c;
import p938yk.C20739d;

/* renamed from: en.b */
public final class C16842b {

    /* renamed from: a */
    public final C20735a.C20736a f43834a;

    /* renamed from: b */
    public final C20342a f43835b;

    public C16842b(C20735a.C20736a aVar, C20342a aVar2) {
        this.f43834a = aVar;
        this.f43835b = aVar2;
    }

    /* renamed from: a */
    public final C13487h<String> mo49503a(String str) {
        this.f43834a.getClass();
        C13487h C = this.f43835b.mo50642a(new C20735a(new C20737b(str))).mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, new C17456a(C.f33366b, 200, "Underlying network error."));
        }
        C20739d dVar = ((C20738c) C.f33365a).f52337d;
        if (dVar == null) {
            return new C13487h<>(null, new C17456a((C18926a) null, C17456a.f44948e, "Token response json has missing body field"));
        }
        return new C13487h<>(dVar.f52338a, (C18926a) null);
    }
}
