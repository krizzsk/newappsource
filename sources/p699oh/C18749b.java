package p699oh;

import android.view.View;
import ce0.C21100e;
import com.google.android.play.core.appupdate.C14226d;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;

/* renamed from: oh.b */
public abstract class C18749b {
    /* renamed from: b */
    public static C18754g m45759b(C18750c cVar, C18751d dVar) {
        if (C21100e.f52944e.f46839a) {
            C14226d.m35346l0(cVar, "AdSessionConfiguration is null");
            C14226d.m35346l0(dVar, "AdSessionContext is null");
            return new C18754g(cVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: a */
    public abstract void mo51249a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    /* renamed from: c */
    public abstract void mo51250c();

    /* renamed from: d */
    public abstract void mo51251d(View view);

    /* renamed from: e */
    public abstract void mo51252e();
}
