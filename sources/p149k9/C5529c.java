package p149k9;

import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* renamed from: k9.c */
public final class C5529c implements MediaViewListener {

    /* renamed from: a */
    public final /* synthetic */ C5530d f18115a;

    public C5529c(C5530d dVar) {
        this.f18115a = dVar;
    }

    public final void onComplete(MediaView mediaView) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f18115a.f18119d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    public final void onEnterFullscreen(MediaView mediaView) {
    }

    public final void onExitFullscreen(MediaView mediaView) {
    }

    public final void onFullscreenBackground(MediaView mediaView) {
    }

    public final void onFullscreenForeground(MediaView mediaView) {
    }

    public final void onPause(MediaView mediaView) {
    }

    public final void onPlay(MediaView mediaView) {
    }

    public final void onVolumeChange(MediaView mediaView, float f) {
    }
}
