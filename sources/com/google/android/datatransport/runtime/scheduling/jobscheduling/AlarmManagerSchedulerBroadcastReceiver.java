package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.appboy.models.InAppMessageBase;
import com.facebook.appevents.C2316a;
import p028ba.C1508b;
import p028ba.C1515i;
import p086fa.C4715a;
import p275u9.C6738j;
import p275u9.C6751s;
import p275u9.C6756w;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f13390a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(InAppMessageBase.EXTRAS);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C6756w.m15897b(context);
        C6738j.C6739a a = C6751s.m15889a();
        a.mo22916b(queryParameter);
        a.mo22917c(C4715a.m12026b(intValue));
        if (queryParameter2 != null) {
            a.f20867b = Base64.decode(queryParameter2, 0);
        }
        C1515i iVar = C6756w.m15896a().f20892d;
        iVar.f5446e.execute(new C1508b(iVar, a.mo22915a(), i, new C2316a(2)));
    }
}
