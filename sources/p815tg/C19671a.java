package p815tg;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p791sg.C19459a;

@KeepForSdk
/* renamed from: tg.a */
public final class C19671a {

    /* renamed from: c */
    public static final GmsLogger f49950c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList f49951a = new LinkedList();

    /* renamed from: b */
    public long f49952b = -1;

    @KeepForSdk
    /* renamed from: a */
    public final void mo52039a(C19459a aVar) {
        if (aVar.f49484f == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f49951a.add(Long.valueOf(elapsedRealtime));
            if (this.f49951a.size() > 5) {
                this.f49951a.removeFirst();
            }
            if (this.f49951a.size() == 5 && elapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.f49951a.peekFirst())).longValue() < InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS) {
                long j = this.f49952b;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5)) {
                    this.f49952b = elapsedRealtime;
                    f49950c.mo65697w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
