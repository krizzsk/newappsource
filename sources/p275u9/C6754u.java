package p275u9;

import com.google.android.datatransport.Priority;
import java.util.HashMap;
import p011aa.C0140d;
import p115i0.C5227c;
import p237r9.C6269b;
import p237r9.C6270c;
import p237r9.C6271d;
import p237r9.C6272e;
import p237r9.C6274g;
import p275u9.C6735h;
import p275u9.C6738j;

/* renamed from: u9.u */
public final class C6754u<T> implements C6272e<T> {

    /* renamed from: a */
    public final C6751s f20883a;

    /* renamed from: b */
    public final String f20884b;

    /* renamed from: c */
    public final C6269b f20885c;

    /* renamed from: d */
    public final C6271d<T, byte[]> f20886d;

    /* renamed from: e */
    public final C6755v f20887e;

    public C6754u(C6751s sVar, String str, C6269b bVar, C6271d<T, byte[]> dVar, C6755v vVar) {
        this.f20883a = sVar;
        this.f20884b = str;
        this.f20885c = bVar;
        this.f20886d = dVar;
        this.f20887e = vVar;
    }

    /* renamed from: a */
    public final void mo22259a(C6270c<T> cVar) {
        mo22260b(cVar, new C5227c(4));
    }

    /* renamed from: b */
    public final void mo22260b(C6270c<T> cVar, C6274g gVar) {
        C6755v vVar = this.f20887e;
        C6751s sVar = this.f20883a;
        if (sVar == null) {
            throw new NullPointerException("Null transportContext");
        } else if (cVar != null) {
            String str = this.f20884b;
            if (str != null) {
                C6271d<T, byte[]> dVar = this.f20886d;
                if (dVar != null) {
                    C6269b bVar = this.f20885c;
                    if (bVar != null) {
                        C6737i iVar = new C6737i(sVar, str, cVar, dVar, bVar);
                        C6756w wVar = (C6756w) vVar;
                        C0140d dVar2 = wVar.f20891c;
                        C6751s sVar2 = iVar.f20858a;
                        Priority c = iVar.f20860c.mo22252c();
                        sVar2.getClass();
                        C6738j.C6739a a = C6751s.m15889a();
                        a.mo22916b(sVar2.mo22910b());
                        a.mo22917c(c);
                        a.f20867b = sVar2.mo22911c();
                        C6738j a2 = a.mo22915a();
                        C6735h.C6736a aVar = new C6735h.C6736a();
                        aVar.f20857f = new HashMap();
                        aVar.f20855d = Long.valueOf(wVar.f20889a.mo20139V());
                        aVar.f20856e = Long.valueOf(wVar.f20890b.mo20139V());
                        aVar.mo22901d(iVar.f20859b);
                        aVar.mo22900c(new C6742m(iVar.f20862e, iVar.f20861d.apply(iVar.f20860c.mo22251b())));
                        aVar.f20853b = iVar.f20860c.mo22250a();
                        dVar2.mo311a(gVar, aVar.mo22899b(), a2);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        } else {
            throw new NullPointerException("Null event");
        }
    }
}
