package com.moovit.app.useraccount.manager.favorites;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.moovit.network.model.ServerId;
import p401bz.C13709c;
import p455dy.C16750c;
import p567iq.C17635b;
import p977zz.C20964s0;

public class FavoritesSetterWorker extends Worker {
    public FavoritesSetterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final ListenableWorker.C1379a doWork() {
        String b = getInputData().mo5691b("metro_id");
        if (!C20964s0.m49089g(b)) {
            return new ListenableWorker.C1379a.C1380a();
        }
        ServerId b2 = ServerId.m11392b(b);
        Context applicationContext = getApplicationContext();
        if (C13709c.m34226b(applicationContext) != null) {
            C17635b.m43779f(applicationContext).f50172b.mo42913b(new C16750c(applicationContext, b2), true);
        }
        return new ListenableWorker.C1379a.C1382c();
    }
}
