package p314xa;

import android.media.MediaCodec;
import android.media.MediaCodec$OnFrameRenderedListener;
import com.google.android.exoplayer2.mediacodec.C3935a;
import com.google.android.exoplayer2.mediacodec.C3937b;
import p290vb.C6936d;

/* renamed from: xa.a */
public final /* synthetic */ class C7182a implements MediaCodec$OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C3935a f22279a;

    /* renamed from: b */
    public final /* synthetic */ C3937b.C3940c f22280b;

    public /* synthetic */ C7182a(C3935a aVar, C3937b.C3940c cVar) {
        this.f22279a = aVar;
        this.f22280b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        C3935a aVar = this.f22279a;
        C3937b.C3940c cVar = this.f22280b;
        aVar.getClass();
        ((C6936d.C6938b) cVar).mo23185b(j);
    }
}
