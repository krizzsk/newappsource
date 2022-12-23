package p632ll;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import p364al.C13487h;
import p443dm.C16683h;
import p608kl.C18092b;
import p703ol.C18784d;
import p725pj.C18926a;
import p727pl.C18930a;
import p769ri.C19277a;
import p769ri.C19278b;
import p794sj.C19467d;
import p870vn.C20169i;

/* renamed from: ll.c */
public final class C18239c {

    /* renamed from: a */
    public final C19277a f46526a;

    /* renamed from: b */
    public final C19278b f46527b;

    /* renamed from: c */
    public final C18784d f46528c;

    /* renamed from: d */
    public final C18930a.C18931a f46529d;

    /* renamed from: e */
    public final C18092b f46530e;

    /* renamed from: f */
    public final C16683h f46531f;

    /* renamed from: g */
    public final C20169i f46532g;

    public C18239c(C19277a aVar, C19278b bVar, C18784d dVar, C18930a.C18931a aVar2, C18092b bVar2, C16683h hVar, C20169i iVar) {
        this.f46526a = aVar;
        this.f46527b = bVar;
        this.f46528c = dVar;
        this.f46529d = aVar2;
        this.f46530e = bVar2;
        this.f46531f = hVar;
        this.f46532g = iVar;
    }

    /* renamed from: a */
    public static C13487h m44971a(C18926a aVar) {
        return new C13487h(null, new C19467d(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }
}
