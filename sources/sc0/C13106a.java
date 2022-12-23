package sc0;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13006a;
import pc0.C13007b;
import pc0.C13008c;
import tc0.C13133b;

/* renamed from: sc0.a */
public abstract class C13106a implements C13006a {

    /* renamed from: a */
    public Context f32556a;

    /* renamed from: b */
    public C13008c f32557b;

    /* renamed from: c */
    public C13133b f32558c;

    /* renamed from: d */
    public C12982b f32559d;

    public C13106a(Context context, C13008c cVar, C13133b bVar, C12982b bVar2) {
        this.f32556a = context;
        this.f32557b = cVar;
        this.f32558c = bVar;
        this.f32559d = bVar2;
    }

    /* renamed from: b */
    public final void mo40009b(C13007b bVar) {
        C13133b bVar2 = this.f32558c;
        if (bVar2 != null) {
            mo40010c(new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.f32628b, this.f32557b.f32196d)).build(), bVar);
            return;
        }
        this.f32559d.handleError(C12981a.m32862b(this.f32557b));
    }

    /* renamed from: c */
    public abstract void mo40010c(AdRequest adRequest, C13007b bVar);
}
