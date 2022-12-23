package p316y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import com.appboy.p044ui.AppboyContentCardsFragment;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.playback.p046ui.views.AKImageView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C3876a;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import com.veriff.sdk.camera.core.impl.CameraInternal;
import com.veriff.sdk.camera.core.impl.CameraRepository;
import java.util.IdentityHashMap;
import java.util.List;
import mf0.C24362h;
import p009a8.C0121t;
import p009a8.C0130y;
import p116i1.C5247f;
import p137ja.C5413d;
import p277ub.C6774a0;
import p290vb.C6953n;
import p316y.C7208f;
import wb0.C13233c;
import x20.C20449c;

/* renamed from: y.m */
public final /* synthetic */ class C7218m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22364b;

    /* renamed from: c */
    public final /* synthetic */ Object f22365c;

    /* renamed from: d */
    public final /* synthetic */ Object f22366d;

    public /* synthetic */ C7218m(int i, Object obj, Object obj2) {
        this.f22364b = i;
        this.f22365c = obj;
        this.f22366d = obj2;
    }

    public final void run() {
        switch (this.f22364b) {
            case 0:
                ((C7208f.C7211c) this.f22365c).f22336a.onActive((CameraCaptureSession) this.f22366d);
                return;
            case 1:
                PreviewView.this.f2245l.mo2576a((SurfaceRequest) this.f22366d);
                return;
            case 2:
                ((AppboyContentCardsFragment) this.f22365c).lambda$onViewStateRestored$2((Bundle) this.f22366d);
                return;
            case 3:
                UMOAdKitBannerView uMOAdKitBannerView = (UMOAdKitBannerView) this.f22365c;
                String str = (String) this.f22366d;
                UMOAdKitBannerView.Companion companion = UMOAdKitBannerView.f7241i;
                C24362h.m61211f(uMOAdKitBannerView, "this$0");
                C24362h.m61211f(str, "$phDrawableName");
                AKImageView aKImageView = uMOAdKitBannerView.f7246f;
                if (aKImageView != null) {
                    aKImageView.setImageDrawable((Drawable) null);
                    AKImageView aKImageView2 = uMOAdKitBannerView.f7246f;
                    if (aKImageView2 != null) {
                        Context b = C13233c.m33333b();
                        int identifier = b.getResources().getIdentifier(str, "drawable", b.getPackageName());
                        Resources resources = b.getResources();
                        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
                        aKImageView2.setImageDrawable(C5247f.C5248a.m13264a(resources, identifier, (Resources.Theme) null));
                    }
                }
                UMOAdKitBannerView.m5802h(uMOAdKitBannerView, true);
                return;
            case 4:
                C0121t.C0122a aVar = (C0121t.C0122a) this.f22365c;
                int i = C0130y.f379i;
                C24362h.m61211f(aVar, "$callback");
                C24362h.m61211f((C0130y) this.f22366d, "this$0");
                ((C0121t.C0123b) aVar).mo279b();
                return;
            case 5:
                C3876a aVar2 = ((C3876a.C3877a) this.f22365c).f13480b;
                int i2 = C6774a0.f20959a;
                aVar2.mo15869A((Exception) this.f22366d);
                return;
            case 6:
                DefaultDrmSessionManager.C3906c cVar = (DefaultDrmSessionManager.C3906c) this.f22365c;
                Format format = (Format) this.f22366d;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f13697p != 0 && !cVar.f13710d) {
                    Looper looper = defaultDrmSessionManager.f13701t;
                    looper.getClass();
                    cVar.f13709c = defaultDrmSessionManager.mo15967a(looper, cVar.f13708b, format, false);
                    DefaultDrmSessionManager.this.f13695n.add(cVar);
                    return;
                }
                return;
            case 7:
                C6953n.C6954a aVar3 = (C6953n.C6954a) this.f22365c;
                C5413d dVar = (C5413d) this.f22366d;
                aVar3.getClass();
                synchronized (dVar) {
                }
                C6953n nVar = aVar3.f21703b;
                int i3 = C6774a0.f20959a;
                nVar.mo20416m(dVar);
                return;
            case 8:
                MarketingEventImpressionBinder marketingEventImpressionBinder = (MarketingEventImpressionBinder) this.f22365c;
                IdentityHashMap identityHashMap = MarketingEventImpressionBinder.f42582c;
                marketingEventImpressionBinder.getClass();
                if (((C1033p) this.f22366d).getLifecycle().mo4225b().isAtLeast(Lifecycle.State.STARTED)) {
                    C20449c cVar2 = C20449c.f51792c;
                    if (cVar2 != null) {
                        cVar2.mo52639b(marketingEventImpressionBinder.f42583b);
                        return;
                    }
                    throw new IllegalStateException("you must call initialize first");
                }
                return;
            case 9:
                ((Camera2CameraControlImpl) this.f22365c).lambda$submitCaptureRequests$8((List) this.f22366d);
                return;
            default:
                ((CameraRepository) this.f22365c).lambda$deinit$1((CameraInternal) this.f22366d);
                return;
        }
    }
}
