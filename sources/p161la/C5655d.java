package p161la;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.C3920f;
import com.google.android.exoplayer2.drm.C3925g;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;

/* renamed from: la.d */
public final /* synthetic */ class C5655d implements MediaDrm.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ C3925g f18415a;

    /* renamed from: b */
    public final /* synthetic */ C3920f.C3922b f18416b;

    public /* synthetic */ C5655d(C3925g gVar, DefaultDrmSessionManager.C3904a aVar) {
        this.f18415a = gVar;
        this.f18416b = aVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        C3925g gVar = this.f18415a;
        C3920f.C3922b bVar = this.f18416b;
        gVar.getClass();
        DefaultDrmSessionManager.C3905b bVar2 = DefaultDrmSessionManager.this.f13705x;
        bVar2.getClass();
        bVar2.obtainMessage(i, bArr).sendToTarget();
    }
}
