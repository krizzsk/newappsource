package p699oh;

import ce0.C21100e;
import com.google.android.play.core.appupdate.C14226d;
import org.json.JSONException;
import org.json.JSONObject;
import p389bl.C13637c;
import p723ph.C18924b;

/* renamed from: oh.a */
public final class C18748a {

    /* renamed from: a */
    public final C18754g f47691a;

    public C18748a(C18754g gVar) {
        this.f47691a = gVar;
    }

    /* renamed from: a */
    public static C18748a m45756a(C18749b bVar) {
        C18754g gVar = (C18754g) bVar;
        C14226d.m35346l0(bVar, "AdSession is null");
        if (gVar.f47714e.f36929b == null) {
            C14226d.m35350q0(gVar);
            C18748a aVar = new C18748a(gVar);
            gVar.f47714e.f36929b = aVar;
            return aVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: b */
    public final void mo51247b() {
        boolean z;
        boolean z2;
        C14226d.m35350q0(this.f47691a);
        C14226d.m35354u0(this.f47691a);
        C18754g gVar = this.f47691a;
        if (!gVar.f47715f || gVar.f47716g) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                gVar.mo51252e();
            } catch (Exception unused) {
            }
        }
        C18754g gVar2 = this.f47691a;
        if (!gVar2.f47715f || gVar2.f47716g) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        if (!gVar2.f47718i) {
            C13637c.m34066c(gVar2.f47714e.mo44193h(), "publishImpressionEvent", new Object[0]);
            gVar2.f47718i = true;
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    /* renamed from: c */
    public final void mo51248c(C18924b bVar) {
        C14226d.m35351r0(this.f47691a);
        C14226d.m35354u0(this.f47691a);
        C18754g gVar = this.f47691a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", bVar.f48165a);
            if (bVar.f48165a) {
                jSONObject.put("skipOffset", bVar.f48166b);
            }
            jSONObject.put("autoPlay", bVar.f48167c);
            jSONObject.put("position", bVar.f48168d);
        } catch (JSONException unused) {
            C21100e.m49340g("VastProperties: JSON error");
        }
        if (!gVar.f47719j) {
            C13637c.m34066c(gVar.f47714e.mo44193h(), "publishLoadedEvent", jSONObject);
            gVar.f47719j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }
}
