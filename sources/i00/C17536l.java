package i00;

import android.media.MediaPlayer;
import com.moovit.commons.view.TextureVideoHelper;

/* renamed from: i00.l */
public final /* synthetic */ class C17536l implements MediaPlayer.OnPreparedListener {

    /* renamed from: b */
    public final /* synthetic */ TextureVideoHelper f45126b;

    public /* synthetic */ C17536l(TextureVideoHelper textureVideoHelper) {
        this.f45126b = textureVideoHelper;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        TextureVideoHelper textureVideoHelper = this.f45126b;
        textureVideoHelper.f41162f = true;
        mediaPlayer.seekTo(1);
        textureVideoHelper.mo47173c();
    }
}
