package com.moovit.app.ads;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.C1388b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.MobileAdsManager;
import java.util.ArrayList;
import p695od.C18728c;

public final class MobileAdsWorker extends ListenableWorker {
    public MobileAdsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final C18728c<ListenableWorker.C1379a> startWork() {
        C1388b inputData = getInputData();
        String b = inputData.mo5691b("adInitiator");
        if (b == null) {
            b = "unknown";
        }
        boolean z = false;
        Object obj = inputData.f5152a.get("reloadAds");
        if (obj instanceof Boolean) {
            z = ((Boolean) obj).booleanValue();
        }
        MobileAdsManager h = MobileAdsManager.m37073h();
        if (z) {
            ArrayList arrayList = new ArrayList(h.f37467i.values());
            h.f37466h.cancel();
            h.f37465g.clear();
            h.f37467i.clear();
            h.f37466h = new CancellationTokenSource();
            MoovitExecutors.COMPUTATION.execute(new MobileAdsManager.C14730g(h.f37461c, arrayList));
        }
        return CallbackToFutureAdapter.m1884a(new C14761v(h, b, z));
    }
}
