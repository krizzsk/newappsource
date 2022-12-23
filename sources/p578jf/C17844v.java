package p578jf;

import android.widget.TextView;
import c10.C13740a;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.dynamiclink.DynamicLinkActivity;
import com.moovit.image.ImageProviderFragment;
import com.moovit.micromobility.MicroMobilityRideDetailsActivity;
import m60.C18346e;
import p977zz.C20961r;

/* renamed from: jf.v */
public final /* synthetic */ class C17844v implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f45817b;

    /* renamed from: c */
    public final /* synthetic */ Object f45818c;

    public /* synthetic */ C17844v(Object obj, int i) {
        this.f45817b = i;
        this.f45818c = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.f45817b) {
            case 0:
                ((RemoteConfigManager) this.f45818c).m36074xc904e814(exc);
                return;
            case 1:
                ((TaskCompletionSource) this.f45818c).setException(exc);
                return;
            case 2:
                ((MoovitSubscriptionsManager) this.f45818c).f39764f.postValue(new C20961r(exc));
                return;
            case 3:
                int i = DynamicLinkActivity.f41472y;
                ((DynamicLinkActivity) this.f45818c).mo47920d1((C13740a) null);
                return;
            case 4:
                ((ImageProviderFragment) this.f45818c).mo48176j0(((ImageProviderFragment) this.f45818c).f41702n.f41707e, exc);
                return;
            case 5:
                int i2 = MicroMobilityRideDetailsActivity.f14839Y;
                ((TextView) this.f45818c).setText((CharSequence) null);
                return;
            default:
                C18346e eVar = (C18346e) this.f45818c;
                int i3 = C18346e.f46776t;
                eVar.mo46795h2(C13751d.m34341b(eVar.requireContext(), "receive_url_error", exc));
                return;
        }
    }
}
