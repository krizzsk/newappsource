package p066e0;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.concurrent.TimeoutException;
import mf0.C24362h;
import p001a0.C0016g;
import p009a8.C0115o;
import p135j8.C5396c;
import p135j8.C5405i;
import p135j8.C5406j;
import p695od.C18728c;

/* renamed from: e0.r */
public final /* synthetic */ class C4453r implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15511b = 1;

    /* renamed from: c */
    public final /* synthetic */ long f15512c;

    /* renamed from: d */
    public final /* synthetic */ Object f15513d;

    /* renamed from: e */
    public final /* synthetic */ Object f15514e;

    public /* synthetic */ C4453r(Context context, String str, long j) {
        this.f15512c = j;
        this.f15513d = str;
        this.f15514e = context;
    }

    public /* synthetic */ C4453r(C18728c cVar, CallbackToFutureAdapter.C0673a aVar, long j) {
        this.f15513d = cVar;
        this.f15514e = aVar;
        this.f15512c = j;
    }

    public final void run() {
        Long l;
        int i;
        C5405i iVar;
        switch (this.f15511b) {
            case 0:
                C18728c cVar = (C18728c) this.f15513d;
                CallbackToFutureAdapter.C0673a aVar = (CallbackToFutureAdapter.C0673a) this.f15514e;
                long j = this.f15512c;
                if (!cVar.isDone()) {
                    aVar.mo2698c(new TimeoutException(C0016g.m29l("Cannot complete surfaceList within ", j)));
                    cVar.cancel(true);
                    return;
                }
                return;
            default:
                long j2 = this.f15512c;
                String str = (String) this.f15513d;
                Context context = (Context) this.f15514e;
                C5396c cVar2 = C5396c.f17719a;
                C24362h.m61211f(str, "$activityName");
                C5405i iVar2 = C5396c.f17725g;
                if (iVar2 == null) {
                    l = null;
                } else {
                    l = iVar2.f17747b;
                }
                if (C5396c.f17725g == null) {
                    C5396c.f17725g = new C5405i(Long.valueOf(j2), (Long) null);
                    C5406j jVar = C5406j.f17752a;
                    String str2 = C5396c.f17727i;
                    C24362h.m61210e(context, "appContext");
                    C5406j.m13510b(str, str2, context);
                } else if (l != null) {
                    long longValue = j2 - l.longValue();
                    C5396c.f17719a.getClass();
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                    C2429s b = FetchedAppSettingsManager.m6261b(C0115o.m211b());
                    if (b == null) {
                        i = 60;
                    } else {
                        i = b.f8709b;
                    }
                    if (longValue > ((long) (i * 1000))) {
                        C5406j jVar2 = C5406j.f17752a;
                        C5406j.m13511c(str, C5396c.f17725g, C5396c.f17727i);
                        String str3 = C5396c.f17727i;
                        C24362h.m61210e(context, "appContext");
                        C5406j.m13510b(str, str3, context);
                        C5396c.f17725g = new C5405i(Long.valueOf(j2), (Long) null);
                    } else if (longValue > 1000 && (iVar = C5396c.f17725g) != null) {
                        iVar.f17749d++;
                    }
                }
                C5405i iVar3 = C5396c.f17725g;
                if (iVar3 != null) {
                    iVar3.f17747b = Long.valueOf(j2);
                }
                C5405i iVar4 = C5396c.f17725g;
                if (iVar4 != null) {
                    iVar4.mo21171a();
                    return;
                }
                return;
        }
    }
}
