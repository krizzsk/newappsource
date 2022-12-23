package p314xa;

import android.os.HandlerThread;
import com.google.android.exoplayer2.mediacodec.C3935a;
import p624ld.C18198i;

/* renamed from: xa.c */
public final /* synthetic */ class C7184c implements C18198i {

    /* renamed from: b */
    public final /* synthetic */ int f22282b;

    public /* synthetic */ C7184c(int i) {
        this.f22282b = i;
    }

    public final Object get() {
        return new HandlerThread(C3935a.m10556o(this.f22282b, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
