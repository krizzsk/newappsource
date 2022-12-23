package com.fyber.inneractive.sdk.util;

import android.location.Location;
import com.fyber.inneractive.sdk.util.C3699i;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.fyber.inneractive.sdk.util.h */
public class C3696h implements OnSuccessListener<Location> {

    /* renamed from: a */
    public final /* synthetic */ C3699i.C3700a f12872a;

    public C3696h(C3699i.C3700a aVar) {
        this.f12872a = aVar;
    }

    public void onSuccess(Object obj) {
        Location location = (Location) obj;
        C3699i.C3700a aVar = this.f12872a;
        if (aVar != null) {
            ((C3738v) aVar).f12937a.f12949b = location;
        }
    }
}
