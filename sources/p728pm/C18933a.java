package p728pm;

import ce0.C21100e;
import com.masabi.justride.sdk.error.ConvertedErrorException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13872r;
import p445do.C16690b;
import p465ek.C16835c;
import p561ik.C17618a;
import p583jk.C17873f;
import p725pj.C18926a;
import p727pl.C18932b;
import p821tm.C19709m;
import p891wk.C20351f;

/* renamed from: pm.a */
public final class C18933a {

    /* renamed from: a */
    public final C18932b f48216a;

    /* renamed from: b */
    public final C19709m f48217b;

    /* renamed from: c */
    public final C16690b f48218c;

    /* renamed from: d */
    public final C17873f f48219d;

    public C18933a(C18932b bVar, C19709m mVar, C16690b bVar2, C17873f fVar) {
        this.f48216a = bVar;
        this.f48217b = mVar;
        this.f48218c = bVar2;
        this.f48219d = fVar;
    }

    /* renamed from: a */
    public final C20351f mo51447a() throws ConvertedErrorException {
        C13487h hVar;
        C13487h hVar2;
        C18932b bVar = this.f48216a;
        C13872r<byte[]> d = bVar.f48214a.mo40787d(C21100e.m49347j0(), "LocalTicketsMetadata.json");
        if (d.mo40817a()) {
            hVar = new C13487h(null, new C16835c(d.f34120b, C16835c.f43820m, "Failed reading metadata"));
        } else {
            S s = d.f34119a;
            if (s == null) {
                hVar = new C13487h(new C20351f(0, 0, Collections.emptyList(), (String) null), (C18926a) null);
            } else {
                try {
                    hVar2 = new C13487h((C20351f) bVar.f48215b.mo52732a(C20351f.class, new String((byte[]) s, StandardCharsets.UTF_8)), (C18926a) null);
                } catch (JSONException e) {
                    hVar2 = new C13487h(null, new C16835c(new C17618a(e.getMessage()), C16835c.f43820m, "Failed reading metadata"));
                }
                hVar = hVar2;
            }
        }
        if (!hVar.mo40399a()) {
            return (C20351f) hVar.f33365a;
        }
        C17873f fVar = this.f48219d;
        C18926a aVar = hVar.f33366b;
        fVar.getClass();
        throw C17873f.m44274a(aVar);
    }

    /* renamed from: b */
    public final void mo51448b(ArrayList arrayList) throws ConvertedErrorException {
        C20351f a = mo51447a();
        C13487h a2 = this.f48217b.mo52058a(new C20351f(a.f51529b, a.f51531d, arrayList, a.f51530c));
        if (a2.mo40399a()) {
            C17873f fVar = this.f48219d;
            C18926a aVar = a2.f33366b;
            fVar.getClass();
            throw C17873f.m44274a(aVar);
        }
    }
}
