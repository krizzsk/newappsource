package sc0;

import com.google.android.gms.ads.AdListener;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import pc0.C13007b;

/* renamed from: sc0.c */
public final class C13108c {

    /* renamed from: a */
    public ScarInterstitialAdHandler f32562a;

    /* renamed from: b */
    public C13007b f32563b;

    /* renamed from: c */
    public C13109a f32564c = new C13109a();

    /* renamed from: sc0.c$a */
    public class C13109a extends AdListener {
        public C13109a() {
        }

        public final void onAdClicked() {
            C13108c.this.f32562a.onAdClicked();
        }

        public final void onAdClosed() {
            C13108c.this.f32562a.onAdClosed();
        }

        public final void onAdLoaded() {
            C13108c.this.f32562a.onAdLoaded();
            C13007b bVar = C13108c.this.f32563b;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public final void onAdOpened() {
            C13108c.this.f32562a.onAdOpened();
        }
    }

    public C13108c(ScarInterstitialAdHandler scarInterstitialAdHandler) {
        this.f32562a = scarInterstitialAdHandler;
    }

    /* renamed from: a */
    public final C13109a mo40011a() {
        return this.f32564c;
    }

    /* renamed from: b */
    public final void mo40012b(C13007b bVar) {
        this.f32563b = bVar;
    }
}
