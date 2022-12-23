package com.moovit.app.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.math.BigDecimal;
import java.util.EnumSet;
import java.util.UUID;
import p130j2.C5367a;
import w50.C20283g;

/* renamed from: com.moovit.app.ads.t */
public final /* synthetic */ class C14759t implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f37570b;

    /* renamed from: c */
    public final /* synthetic */ Object f37571c;

    /* renamed from: d */
    public final /* synthetic */ Object f37572d;

    public /* synthetic */ C14759t(int i, Object obj, Object obj2) {
        this.f37570b = i;
        this.f37571c = obj;
        this.f37572d = obj2;
    }

    public final void onComplete(Task task) {
        switch (this.f37570b) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f37572d;
                EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
                C5367a.m13473a((Context) this.f37571c).mo21147c(new Intent("com.moovit.ads.action.updated"));
                if (pendingResult != null) {
                    pendingResult.finish();
                    return;
                }
                return;
            default:
                BigDecimal bigDecimal = C20283g.f51427r;
                ((C20283g) this.f37571c).mo52455g((UUID) this.f37572d, task);
                return;
        }
    }
}
