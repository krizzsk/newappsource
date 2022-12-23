package p911xg;

import com.google.protobuf.C14597c0;
import com.google.protobuf.C14603g;
import com.google.protobuf.C14610k;
import com.google.protobuf.C14621o;
import com.google.protobuf.C14632v;
import com.google.protobuf.C14633w;
import com.google.protobuf.C14636z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ProtoSyntax;
import java.nio.charset.Charset;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: xg.r */
public final class C20510r {

    /* renamed from: c */
    public static final C20510r f51897c = new C20510r();

    /* renamed from: a */
    public final C20499i f51898a = new C20499i();

    /* renamed from: b */
    public final ConcurrentHashMap f51899b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C20512t<T> mo52690a(Class<T> cls) {
        C20512t<T> tVar;
        C14633w wVar;
        Class<?> cls2;
        Charset charset = C14610k.f36861a;
        if (cls != null) {
            C20512t<T> tVar2 = (C20512t) this.f51899b.get(cls);
            if (tVar2 != null) {
                return tVar2;
            }
            C20499i iVar = this.f51898a;
            iVar.getClass();
            Class<GeneratedMessageLite> cls3 = GeneratedMessageLite.class;
            Class<?> cls4 = C14636z.f36903a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C14636z.f36903a) == null || cls2.isAssignableFrom(cls)) {
                C20503k a = iVar.f51891a.mo52685a(cls);
                if (a.mo52687a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        wVar = new C14633w(C14636z.f36906d, C20495e.f51887a, a.mo52688b());
                    } else {
                        C14597c0<?, ?> c0Var = C14636z.f36904b;
                        C14603g<?> gVar = C20495e.f51888b;
                        if (gVar != null) {
                            wVar = new C14633w(c0Var, gVar, a.mo52688b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    tVar = wVar;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z = true;
                    if (isAssignableFrom) {
                        if (a.mo52689c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            tVar = C14632v.m36660p(a, C20507o.f51896b, C14621o.f36869b, C14636z.f36906d, C20495e.f51887a, C20502j.f51894b);
                        } else {
                            tVar = C14632v.m36660p(a, C20507o.f51896b, C14621o.f36869b, C14636z.f36906d, (C14603g) null, C20502j.f51894b);
                        }
                    } else {
                        if (a.mo52689c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C20506n nVar = C20507o.f51895a;
                            C14621o.C14622a aVar = C14621o.f36868a;
                            C14597c0<?, ?> c0Var2 = C14636z.f36904b;
                            C14603g<?> gVar2 = C20495e.f51888b;
                            if (gVar2 != null) {
                                tVar = C14632v.m36660p(a, nVar, aVar, c0Var2, gVar2, C20502j.f51893a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            tVar = C14632v.m36660p(a, C20507o.f51895a, C14621o.f36868a, C14636z.f36905c, (C14603g) null, C20502j.f51893a);
                        }
                    }
                }
                C20512t<T> tVar3 = (C20512t) this.f51899b.putIfAbsent(cls, tVar);
                if (tVar3 != null) {
                    return tVar3;
                }
                return tVar;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
