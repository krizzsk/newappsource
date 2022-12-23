package be0;

import android.media.MediaPlayer;

/* renamed from: be0.g */
public final class C21023g implements MediaPlayer.OnCompletionListener {

    /* renamed from: b */
    public final /* synthetic */ C21012c f52801b;

    public C21023g(C21012c cVar) {
        this.f52801b = cVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer.OnCompletionListener onCompletionListener = this.f52801b.f52786p;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
        this.f52801b.f52778h.setEnabled(false);
    }
}
