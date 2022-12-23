package p054d0;

import androidx.camera.core.C0627p;
import java.util.concurrent.RejectedExecutionException;
import p066e0.C4462z;

/* renamed from: d0.p */
public final /* synthetic */ class C4301p implements C4462z.C4463a {

    /* renamed from: b */
    public final /* synthetic */ C4305r f15229b;

    public /* synthetic */ C4301p(C4305r rVar) {
        this.f15229b = rVar;
    }

    /* renamed from: c */
    public final void mo2538c(C4462z zVar) {
        C4305r rVar = this.f15229b;
        rVar.getClass();
        C0627p acquireNextImage = zVar.acquireNextImage();
        try {
            rVar.f15244d.execute(new C4269b(1, rVar, acquireNextImage));
        } catch (RejectedExecutionException unused) {
            C4289j0.m11435b("CaptureProcessorPipeline");
            acquireNextImage.close();
        }
    }
}
