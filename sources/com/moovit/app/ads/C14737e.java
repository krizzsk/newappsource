package com.moovit.app.ads;

import android.graphics.Bitmap;
import androidx.camera.core.C0627p;
import c00.C13717b;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.awareness.fence.FenceQueryResponse;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.awareness.fence.FenceStateMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.p421qr.QRCodeImageView;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.schedule.ScheduleBasedProfiler;
import java.util.List;
import mf0.C24362h;
import p435de.C16596f;
import p688nu.C18627a;
import p688nu.C18636f;
import y70.C13261b;

/* renamed from: com.moovit.app.ads.e */
public final /* synthetic */ class C14737e implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f37510b;

    /* renamed from: c */
    public final /* synthetic */ Object f37511c;

    public /* synthetic */ C14737e(Object obj, int i) {
        this.f37510b = i;
        this.f37511c = obj;
    }

    public final void onComplete(Task task) {
        AdView adView;
        switch (this.f37510b) {
            case 0:
                C14738f fVar = (C14738f) this.f37511c;
                fVar.getClass();
                if (task.isSuccessful()) {
                    adView = (AdView) task.getResult();
                } else {
                    adView = null;
                }
                fVar.f37516k = adView;
                fVar.notifyItemChanged(0);
                return;
            case 1:
                C18636f fVar2 = (C18636f) this.f37511c;
                int i = C18636f.f47492s;
                fVar2.getClass();
                if (!task.isSuccessful()) {
                    fVar2.f47496q.mo4627l0(fVar2.f47494o);
                    return;
                }
                List list = (List) task.getResult();
                if (C13717b.m34258e(list)) {
                    fVar2.f47497r.setVisibility(8);
                    fVar2.f47496q.mo4627l0(fVar2.f47493n);
                    return;
                }
                fVar2.f47497r.setVisibility(0);
                C18627a aVar = new C18627a(fVar2.f47496q.getContext(), list);
                aVar.f47476l = fVar2;
                fVar2.f47496q.setAdapter(aVar);
                return;
            case 2:
                C0627p pVar = (C0627p) this.f37511c;
                int i2 = MLKitBarcodeScannerFragment.f40812q;
                C24362h.m61211f(pVar, "$imageProxy");
                C24362h.m61211f(task, "it");
                pVar.close();
                return;
            case 3:
                int i3 = MicroMobilityRideActivity.f14823n0;
                ((MicroMobilityRideActivity) this.f37511c).mo44506I1();
                return;
            case 4:
                QRCodeImageView qRCodeImageView = (QRCodeImageView) this.f37511c;
                int i4 = QRCodeImageView.f42887f;
                qRCodeImageView.getClass();
                if (task.getResult() == null) {
                    C16596f.m42113a().mo49364c(new ApplicationBugException(String.format("Failed to generate QR code (%1$s)", new Object[]{qRCodeImageView.f42890d})));
                    qRCodeImageView.mo49144c(false);
                    return;
                }
                qRCodeImageView.setImageBitmap((Bitmap) task.getResult());
                qRCodeImageView.mo49144c(true);
                return;
            default:
                ScheduleBasedProfiler scheduleBasedProfiler = (ScheduleBasedProfiler) this.f37511c;
                scheduleBasedProfiler.getClass();
                if (!task.isSuccessful()) {
                    ProfilerLog c = ProfilerLog.m41879c(scheduleBasedProfiler.f47186a);
                    StringBuilder k = C13555b.m33972k("Could not query fence: ");
                    k.append(scheduleBasedProfiler.f47189d);
                    c.mo49244b("ScheduleBasedProfiler", k.toString());
                    return;
                }
                FenceQueryResponse fenceQueryResponse = (FenceQueryResponse) task.getResult();
                if (fenceQueryResponse == null) {
                    ProfilerLog c2 = ProfilerLog.m41879c(scheduleBasedProfiler.f47186a);
                    StringBuilder k2 = C13555b.m33972k("NULL result: ");
                    k2.append(scheduleBasedProfiler.f47189d);
                    c2.mo49244b("ScheduleBasedProfiler", k2.toString());
                    return;
                }
                FenceStateMap fenceStateMap = fenceQueryResponse.getFenceStateMap();
                if (fenceStateMap == null || C13717b.m34258e(fenceStateMap.getFenceKeys())) {
                    ProfilerLog c3 = ProfilerLog.m41879c(scheduleBasedProfiler.f47186a);
                    StringBuilder k3 = C13555b.m33972k("Empty map for time fences: ");
                    k3.append(scheduleBasedProfiler.f47189d);
                    c3.mo49244b("ScheduleBasedProfiler", k3.toString());
                    return;
                }
                for (String next : fenceStateMap.getFenceKeys()) {
                    FenceState fenceState = fenceStateMap.getFenceState(next);
                    if (fenceState == null) {
                        ProfilerLog c4 = ProfilerLog.m41879c(scheduleBasedProfiler.f47186a);
                        c4.mo49244b("ScheduleBasedProfiler", "NULL Fence: " + next);
                    } else {
                        ProfilerLog c5 = ProfilerLog.m41879c(scheduleBasedProfiler.f47186a);
                        StringBuilder l = C13555b.m33973l("Fence name=", next, ": current state=");
                        l.append(fenceState.getCurrentState());
                        l.append(", previous state=");
                        l.append(fenceState.getPreviousState());
                        l.append(", last update time=");
                        l.append(C13261b.m33383a(fenceState.getLastFenceUpdateTimeMillis()));
                        c5.mo49244b("ScheduleBasedProfiler", l.toString());
                    }
                }
                return;
        }
    }
}
