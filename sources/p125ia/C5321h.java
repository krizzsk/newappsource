package p125ia;

import com.google.android.exoplayer2.audio.C3876a;
import p277ub.C6774a0;

/* renamed from: ia.h */
public final /* synthetic */ class C5321h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C3876a.C3877a f17524b;

    /* renamed from: c */
    public final /* synthetic */ String f17525c;

    /* renamed from: d */
    public final /* synthetic */ long f17526d;

    /* renamed from: e */
    public final /* synthetic */ long f17527e;

    public /* synthetic */ C5321h(C3876a.C3877a aVar, String str, long j, long j2) {
        this.f17524b = aVar;
        this.f17525c = str;
        this.f17526d = j;
        this.f17527e = j2;
    }

    public final void run() {
        C3876a.C3877a aVar = this.f17524b;
        String str = this.f17525c;
        long j = this.f17526d;
        long j2 = this.f17527e;
        C3876a aVar2 = aVar.f13480b;
        int i = C6774a0.f20959a;
        aVar2.onAudioDecoderInitialized(str, j, j2);
    }
}
