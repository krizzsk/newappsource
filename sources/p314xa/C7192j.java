package p314xa;

import android.media.MediaCodec;
import android.media.MediaCodec$OnFrameRenderedListener;
import com.google.android.exoplayer2.mediacodec.C3937b;
import com.google.android.exoplayer2.mediacodec.C3943e;
import p290vb.C6936d;

/* renamed from: xa.j */
public final /* synthetic */ class C7192j implements MediaCodec$OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C3943e f22320a;

    /* renamed from: b */
    public final /* synthetic */ C3937b.C3940c f22321b;

    public /* synthetic */ C7192j(C3943e eVar, C3937b.C3940c cVar) {
        this.f22320a = eVar;
        this.f22321b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        C3943e eVar = this.f22320a;
        C3937b.C3940c cVar = this.f22321b;
        eVar.getClass();
        ((C6936d.C6938b) cVar).mo23185b(j);
    }
}
