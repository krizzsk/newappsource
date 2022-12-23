package p153l0;

import android.media.MediaCodec;
import androidx.camera.core.C0631r;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.impl.DeferrableSurface;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.util.time.Time;
import j80.C12772a;
import java.util.Comparator;
import java.util.Map;
import n10.C18509f;
import p427cu.C16497a;
import p977zz.C20975x0;

/* renamed from: l0.b */
public final /* synthetic */ class C5551b implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f18181b;

    /* renamed from: c */
    public final /* synthetic */ Object f18182c;

    public /* synthetic */ C5551b(Object obj, int i) {
        this.f18181b = i;
        this.f18182c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        Time time;
        Class<C0631r> cls = C0631r.class;
        Class<VideoCapture> cls2 = VideoCapture.class;
        switch (this.f18181b) {
            case 0:
                DeferrableSurface deferrableSurface = (DeferrableSurface) obj2;
                ((C5552c) this.f18182c).getClass();
                Class<?> cls3 = ((DeferrableSurface) obj).f1931h;
                int i2 = 0;
                if (cls3 == MediaCodec.class || cls3 == cls2) {
                    i = 2;
                } else if (cls3 == cls) {
                    i = 0;
                } else {
                    i = 1;
                }
                Class<?> cls4 = deferrableSurface.f1931h;
                if (cls4 == MediaCodec.class || cls4 == cls2) {
                    i2 = 2;
                } else if (cls4 != cls) {
                    i2 = 1;
                }
                return i - i2;
            case 1:
                Map map = (Map) this.f18182c;
                ServerId serverId = (ServerId) obj2;
                int i3 = C16497a.f43085j;
                C16497a.C16498a aVar = (C16497a.C16498a) map.get((ServerId) obj);
                Time time2 = null;
                if (aVar != null) {
                    time = aVar.f43095b;
                } else {
                    time = null;
                }
                C16497a.C16498a aVar2 = (C16497a.C16498a) map.get(serverId);
                if (aVar2 != null) {
                    time2 = aVar2.f43095b;
                }
                return C20975x0.m49116c(time, time2);
            case 2:
                return ((C18509f) this.f18182c).compare(((MotQrCodeTrip) obj).f39073c.mo24369b().f23697e, ((MotQrCodeTrip) obj2).f39073c.mo24369b().f23697e);
            default:
                LineServiceAlertDigest lineServiceAlertDigest = ((WaitToTransitLineLeg) obj).f42139j;
                LineServiceAlertDigest lineServiceAlertDigest2 = ((WaitToTransitLineLeg) obj2).f42139j;
                ((C12772a) this.f18182c).getClass();
                return C12772a.m32576a(lineServiceAlertDigest, lineServiceAlertDigest2);
        }
    }
}
