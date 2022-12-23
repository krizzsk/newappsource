package p314xa;

import android.os.HandlerThread;
import com.google.android.exoplayer2.mediacodec.C3935a;
import p624ld.C18198i;

/* renamed from: xa.b */
public final /* synthetic */ class C7183b implements C18198i {

    /* renamed from: b */
    public final /* synthetic */ int f22281b;

    public /* synthetic */ C7183b(int i) {
        this.f22281b = i;
    }

    public final Object get() {
        return new HandlerThread(C3935a.m10556o(this.f22281b, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}
