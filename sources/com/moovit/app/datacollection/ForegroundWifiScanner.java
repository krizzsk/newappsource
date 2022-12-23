package com.moovit.app.datacollection;

import android.content.Context;
import android.content.ContextWrapper;
import android.location.Location;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.moovit.C14688a;
import com.moovit.location.C16202a;
import com.tranzmate.moovit.protocol.crowd.MVCrowdData;
import com.tranzmate.moovit.protocol.crowd.MVWifiScan;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.TBase;
import p304x.C7073m;
import p401bz.C13708b;
import p567iq.C17637d;
import p858uz.C20059f;
import p858uz.C20061g;
import p874vr.C20199a;
import p977zz.C20932c0;
import q00.C19047a;

public final class ForegroundWifiScanner extends ContextWrapper implements C1031o, C14688a.C14690b, C20059f {

    /* renamed from: f */
    public static final /* synthetic */ int f37916f = 0;

    /* renamed from: b */
    public boolean f37917b = false;

    /* renamed from: c */
    public C14688a f37918c = null;

    /* renamed from: d */
    public C20061g f37919d = null;

    /* renamed from: e */
    public ScheduledExecutorService f37920e = null;

    /* renamed from: com.moovit.app.datacollection.ForegroundWifiScanner$a */
    public static class C14846a extends C13708b {

        /* renamed from: c */
        public final MVWifiScan f37921c;

        public C14846a(ForegroundWifiScanner foregroundWifiScanner, MVWifiScan mVWifiScan) {
            super(foregroundWifiScanner);
            this.f37921c = mVWifiScan;
        }

        /* renamed from: a */
        public final TBase mo21426a() {
            MVWifiScan mVWifiScan = this.f37921c;
            MVCrowdData mVCrowdData = new MVCrowdData();
            mVWifiScan.getClass();
            mVCrowdData.setField_ = MVCrowdData._Fields.WIFI_SCAN;
            mVCrowdData.value_ = mVWifiScan;
            return mVCrowdData;
        }
    }

    public ForegroundWifiScanner(Context context) {
        super(context.getApplicationContext());
    }

    /* renamed from: a */
    public final void mo20300a() {
        C14688a aVar;
        int intValue;
        if (this.f37917b && (aVar = this.f37918c) != null && ((C17637d) aVar.mo44594b("UI_CONFIGURATION")).f45350g && (intValue = ((Integer) ((C19047a) this.f37918c.mo44594b("CONFIGURATION")).mo51505b(C20199a.f51298r0)).intValue()) > 0) {
            C20061g permissionAwareHighAccuracyFrequentUpdates = C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
            this.f37919d = permissionAwareHighAccuracyFrequentUpdates;
            permissionAwareHighAccuracyFrequentUpdates.mo50903a(this);
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new C20932c0("wifi-scanner", 11));
            this.f37920e = newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new C7073m(this, 8), 2, (long) intValue, TimeUnit.SECONDS);
        }
    }

    /* renamed from: c */
    public final void mo20301c(Object obj, String str) {
    }

    /* renamed from: d */
    public final void mo20302d(Object obj, String str) {
    }

    @C1045x(Lifecycle.Event.ON_START)
    public final void onApplicationStart() {
        this.f37917b = true;
        C14688a aVar = new C14688a(C16530d.m42016i(2, "CONFIGURATION", "UI_CONFIGURATION"), this);
        this.f37918c = aVar;
        if (aVar.mo44597e()) {
            mo20300a();
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public final void onApplicationStop() {
        this.f37917b = false;
        C14688a aVar = this.f37918c;
        if (aVar != null) {
            aVar.mo44596d();
            this.f37918c = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f37920e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f37920e = null;
        }
        C20061g gVar = this.f37919d;
        if (gVar != null) {
            gVar.mo50904b(this);
            this.f37919d = null;
        }
    }

    public final void onLocationChanged(Location location) {
    }
}
