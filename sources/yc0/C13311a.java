package yc0;

import android.content.Context;
import androidx.appcompat.app.C0262r;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import oc0.C12981a;
import oc0.C12982b;
import pc0.C13006a;
import pc0.C13007b;
import pc0.C13008c;
import zc0.C13379b;

/* renamed from: yc0.a */
public abstract class C13311a<T> implements C13006a {

    /* renamed from: a */
    public T f33049a;

    /* renamed from: b */
    public Context f33050b;

    /* renamed from: c */
    public C13008c f33051c;

    /* renamed from: d */
    public C13379b f33052d;

    /* renamed from: e */
    public C0262r f33053e;

    /* renamed from: f */
    public C12982b f33054f;

    public C13311a(Context context, C13008c cVar, C13379b bVar, C12982b bVar2) {
        this.f33050b = context;
        this.f33051c = cVar;
        this.f33052d = bVar;
        this.f33054f = bVar2;
    }

    /* renamed from: b */
    public final void mo40218b(C13007b bVar) {
        C13379b bVar2 = this.f33052d;
        if (bVar2 != null) {
            AdRequest build = new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.f33214b, this.f33051c.f32196d)).build();
            this.f33053e.f761c = bVar;
            mo40219c(build);
            return;
        }
        this.f33054f.handleError(C12981a.m32862b(this.f33051c));
    }

    /* renamed from: c */
    public abstract void mo40219c(AdRequest adRequest);
}
