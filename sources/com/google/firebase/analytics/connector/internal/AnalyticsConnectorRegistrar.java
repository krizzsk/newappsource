package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p404ce.C13784b;
import p404ce.C13786c;
import p404ce.C13800m;
import p583jk.C17884p;
import p743qd.C19107d;
import p836ud.C19885a;
import p836ud.C19889c;
import p836ud.C19890d;
import p836ud.C19891e;
import p838uf.C19904f;
import p885we.C20294d;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static C19885a lambda$getComponents$0(C13786c cVar) {
        C19107d dVar = (C19107d) cVar.mo314b(C19107d.class);
        Context context = (Context) cVar.mo314b(Context.class);
        C20294d dVar2 = (C20294d) cVar.mo314b(C20294d.class);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar2);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (C19889c.f50513c == null) {
            synchronized (C19889c.class) {
                if (C19889c.f50513c == null) {
                    Bundle bundle = new Bundle(1);
                    dVar.mo51535a();
                    if ("[DEFAULT]".equals(dVar.f48569b)) {
                        dVar2.mo40734c(C19890d.f50516b, C19891e.f50517a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.mo51541j());
                    }
                    C19889c.f50513c = new C19889c(zzee.zzg(context, (String) null, (String) null, (String) null, bundle).zzd());
                }
            }
        }
        return C19889c.f50513c;
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List<C13784b<?>> getComponents() {
        C13784b.C13785a<C19885a> a = C13784b.m34444a(C19885a.class);
        a.mo40715a(new C13800m(1, 0, C19107d.class));
        a.mo40715a(new C13800m(1, 0, Context.class));
        a.mo40715a(new C13800m(1, 0, C20294d.class));
        a.f33944e = C17884p.f45879d;
        a.mo40717c(2);
        return Arrays.asList(new C13784b[]{a.mo40716b(), C19904f.m47417a("fire-analytics", "21.1.1")});
    }
}
