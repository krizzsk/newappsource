package be0;

import android.media.MediaPlayer;

/* renamed from: be0.f */
public final class C21022f implements MediaPlayer.OnErrorListener {

    /* renamed from: b */
    public final /* synthetic */ C21012c f52800b;

    public C21022f(C21012c cVar) {
        this.f52800b = cVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        MediaPlayer.OnErrorListener onErrorListener = this.f52800b.f52785o;
        if (onErrorListener != null) {
            return onErrorListener.onError(mediaPlayer, i, i2);
        }
        return false;
    }
}
