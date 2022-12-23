package p815tg;

import com.google.android.gms.internal.mlkit_vision_common.zzji;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Callable;
import p791sg.C19459a;

/* renamed from: tg.f */
public final /* synthetic */ class C19676f implements Callable {

    /* renamed from: b */
    public final /* synthetic */ MobileVisionBase f49955b;

    /* renamed from: c */
    public final /* synthetic */ C19459a f49956c;

    public /* synthetic */ C19676f(MobileVisionBase mobileVisionBase, C19459a aVar) {
        this.f49955b = mobileVisionBase;
        this.f49956c = aVar;
    }

    public final Object call() {
        MobileVisionBase mobileVisionBase = this.f49955b;
        C19459a aVar = this.f49956c;
        mobileVisionBase.getClass();
        zzji zze = zzji.zze("detectorTaskWithResource#run");
        zze.zzb();
        try {
            List d = mobileVisionBase.f36789c.mo50621d(aVar);
            zze.close();
            return d;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
