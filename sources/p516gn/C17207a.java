package p516gn;

import com.masabi.justride.sdk.error.ConvertedErrorException;
import java.util.Iterator;
import java.util.List;
import p364al.C13487h;
import p412cn.C13851a;
import p445do.C16690b;
import p583jk.C17873f;
import p608kl.C18092b;
import p610kn.C18107a;
import p725pj.C18926a;
import p728pm.C18933a;
import p774rn.C19292b;
import p891wk.C20351f;

/* renamed from: gn.a */
public final class C17207a {

    /* renamed from: f */
    public static final Long f44491f = 7200000L;

    /* renamed from: a */
    public final C18092b f44492a;

    /* renamed from: b */
    public final C16690b f44493b;

    /* renamed from: c */
    public final C17873f f44494c;

    /* renamed from: d */
    public final C13851a f44495d;

    /* renamed from: e */
    public final C18933a f44496e;

    public C17207a(C18092b bVar, C16690b bVar2, C17873f fVar, C13851a aVar, C18933a aVar2) {
        this.f44492a = bVar;
        this.f44493b = bVar2;
        this.f44494c = fVar;
        this.f44495d = aVar;
        this.f44496e = aVar2;
    }

    /* renamed from: a */
    public final boolean mo49784a() throws ConvertedErrorException {
        boolean z;
        boolean z2;
        boolean z3;
        C20351f a = this.f44496e.mo51447a();
        Long valueOf = Long.valueOf(a.f51531d);
        if (this.f44493b.mo49402a() > f44491f.longValue() + valueOf.longValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        String str = a.f51530c;
        C13487h<C18107a> a2 = this.f44492a.mo50540a();
        if (!a2.mo40399a()) {
            C18107a aVar = (C18107a) a2.f33365a;
            if (aVar == null || !aVar.f46300a.equals(str)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            Iterator<String> it = a.f51528a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                C13487h<List<C19292b>> a3 = this.f44495d.mo40780a(it.next());
                if (!a3.mo40399a()) {
                    if (((List) a3.f33365a).size() > 0) {
                        z3 = true;
                        break;
                    }
                } else {
                    C17873f fVar = this.f44494c;
                    C18926a aVar2 = a3.f33366b;
                    fVar.getClass();
                    throw C17873f.m44274a(aVar2);
                }
            }
            if (z3) {
                return true;
            }
            return false;
        }
        C17873f fVar2 = this.f44494c;
        C18926a aVar3 = a2.f33366b;
        fVar2.getClass();
        throw C17873f.m44274a(aVar3);
    }
}
