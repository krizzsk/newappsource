package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C2808z;
import com.fyber.inneractive.sdk.util.C3727s;
import java.lang.ref.WeakReference;

public class InneractiveNativeVideoContentController extends C2808z {

    /* renamed from: a */
    public WeakReference<Renderer> f9518a;

    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) C3727s.m9987a(this.f9518a)) != null) {
            this.f9518a.get().pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) C3727s.m9987a(this.f9518a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f9518a = new WeakReference<>(renderer);
    }
}
