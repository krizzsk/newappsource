package be0;

import android.media.MediaPlayer;
import android.os.Build;

/* renamed from: be0.e */
public final class C21021e implements MediaPlayer.OnPreparedListener {

    /* renamed from: b */
    public final /* synthetic */ C21012c f52799b;

    public C21021e(C21012c cVar) {
        this.f52799b = cVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.seekTo((long) this.f52799b.f52787q, 3);
        }
        MediaPlayer.OnPreparedListener onPreparedListener = this.f52799b.f52784n;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mediaPlayer);
        }
        this.f52799b.f52778h.setVisibility(0);
    }
}
