package com.google.android.material.internal;

import android.content.Context;
import android.view.ViewGroup;
import ce0.C21100e;
import com.cubic.umo.auth.model.Token;
import com.cubic.umo.auth.provider.TokenProvider;
import com.moovit.umo.ads.C7874c;
import com.moovit.umo.ads.C7875d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Date;
import java.util.HashMap;
import p583jk.C17883o;
import p752qn.C19143a;
import p891wk.C20344a;
import w40.C25761d;

/* renamed from: com.google.android.material.internal.o */
public final class C14080o implements TokenProvider {

    /* renamed from: a */
    public Object f35108a;

    public /* synthetic */ C14080o(Object obj) {
        this.f35108a = obj;
    }

    /* renamed from: a */
    public final C19143a mo41889a(C20344a aVar) {
        Integer num = aVar.f51507b;
        Integer num2 = aVar.f51510e;
        Long l = aVar.f51509d;
        ((C17883o) this.f35108a).getClass();
        Date a = C17883o.m44329a(l);
        Long l2 = aVar.f51513h;
        ((C17883o) this.f35108a).getClass();
        Date a2 = C17883o.m44329a(l2);
        Long l3 = aVar.f51511f;
        ((C17883o) this.f35108a).getClass();
        Date a3 = C17883o.m44329a(l3);
        return new C19143a(num2, aVar.f51512g, num, a3, a, a2, aVar.f51506a, Boolean.TRUE.equals(Boolean.valueOf(aVar.f51508c)));
    }

    public final Token getToken() {
        if (!C25761d.m64299a().mo83590e()) {
            return null;
        }
        try {
            C7875d dVar = (C7875d) new C7874c((Context) this.f35108a).mo52626J();
            String str = dVar.f23832g;
            long j = dVar.f23833h;
            if (str != null) {
                return new Token(str, j);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public C14080o(int i) {
        if (i == 7) {
            this.f35108a = new HashMap();
        }
    }

    public /* synthetic */ C14080o(ViewGroup viewGroup) {
        this.f35108a = viewGroup.getOverlay();
    }

    public /* synthetic */ C14080o(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f35108a = context.getApplicationContext();
    }
}
