package p609km;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.jobs.network.forc.FOrcEndpoint;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import p364al.C13483d;
import p364al.C13487h;
import p388bk.C13634a;
import p515gm.C17205a;
import p561ik.C17618a;
import p586jn.C17898d;
import p705on.C18793a;
import p725pj.C18926a;
import p795sk.C19468a;
import p843uk.C19948r;
import p843uk.C19950t;
import p868vl.C20158e;
import p913xi.C20531d;

/* renamed from: km.h */
public final class C18104h implements C13483d {

    /* renamed from: a */
    public final C20158e f46293a;

    /* renamed from: b */
    public final C18095a f46294b;

    /* renamed from: c */
    public final C20531d f46295c;

    /* renamed from: d */
    public final C17205a f46296d;

    /* renamed from: e */
    public final String f46297e;

    public C18104h(C20158e eVar, C18095a aVar, C20531d dVar, C17205a aVar2, String str) {
        this.f46293a = eVar;
        this.f46294b = aVar;
        this.f46295c = dVar;
        this.f46296d = aVar2;
        this.f46297e = str;
    }

    /* renamed from: C */
    public final C13487h<List<C18793a>> mo40394C() {
        C13487h<String> hVar;
        List<C18793a> list;
        if (!this.f46293a.f51166a.contains("SDK")) {
            return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33605I, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        }
        C18095a aVar = this.f46294b;
        C13487h<C17898d> a = aVar.f46259a.mo49645a();
        if (a.mo40399a()) {
            hVar = new C13487h<>(null, a.f33366b);
        } else {
            hVar = aVar.mo50542a((C17898d) a.f33365a);
        }
        if (hVar.mo40399a()) {
            return new C13487h<>(null, new C13634a(hVar.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        FOrcEndpoint fOrcEndpoint = FOrcEndpoint.TOKENIZED_CARDS;
        C17205a aVar2 = this.f46296d;
        aVar2.getClass();
        C13487h a2 = aVar2.mo49783a(fOrcEndpoint.getHttpMethod(), fOrcEndpoint.getPath() + "/" + this.f46297e + "/" + ((String) hVar.f33365a), Collections.emptyMap(), (String) null, (C19468a) null);
        if (a2.mo40399a()) {
            return new C13487h<>(null, new C13634a(a2.f33366b, 200, "Underlying network error."));
        }
        try {
            List<C19950t> list2 = ((C19948r) this.f46295c.mo52732a(C19948r.class, (String) a2.f33365a)).f50681a;
            if (list2.isEmpty() || list2.get(0).f50684c == null) {
                list = Collections.emptyList();
            } else {
                list = list2.get(0).f50684c;
            }
            return new C13487h<>(list, (C18926a) null);
        } catch (JSONException e) {
            return new C13487h<>(null, new C13634a(new C17618a(e.getMessage()), Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
    }
}
