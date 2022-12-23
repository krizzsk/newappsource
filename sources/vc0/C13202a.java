package vc0;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13006a;
import pc0.C13007b;
import pc0.C13008c;
import wc0.C13235b;

/* renamed from: vc0.a */
public abstract class C13202a implements C13006a {

    /* renamed from: a */
    public Context f32768a;

    /* renamed from: b */
    public C13008c f32769b;

    /* renamed from: c */
    public C13235b f32770c;

    /* renamed from: d */
    public C12982b f32771d;

    public C13202a(Context context, C13008c cVar, C13235b bVar, C12982b bVar2) {
        this.f32768a = context;
        this.f32769b = cVar;
        this.f32770c = bVar;
        this.f32771d = bVar2;
    }

    /* renamed from: b */
    public final void mo40082b(C13007b bVar) {
        C13235b bVar2 = this.f32770c;
        if (bVar2 != null) {
            mo40083c(new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.f32854b, this.f32769b.f32196d)).build(), bVar);
            return;
        }
        this.f32771d.handleError(C12981a.m32862b(this.f32769b));
    }

    /* renamed from: c */
    public abstract void mo40083c(AdRequest adRequest, C13007b bVar);
}
