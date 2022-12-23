package com.masabi.justride.sdk.platform.geolocation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import bf0.C21049c;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.ExecutorService;
import kotlin.C23812a;
import mf0.C24362h;
import p090g1.C4732a;
import p795sk.C19468a;
import p894wn.C20379b;
import p988j$.util.function.Consumer;

public final class AndroidGeolocationService implements C20379b {

    /* renamed from: a */
    public final LocationManager f37163a;

    /* renamed from: b */
    public final C21049c f37164b = C23812a.m58432b(AndroidGeolocationService$locationListener$2.f37170f);

    /* renamed from: c */
    public final C21049c f37165c = C23812a.m58432b(AndroidGeolocationService$locationExecutor$2.f37169f);

    /* renamed from: d */
    public final C21049c f37166d = C23812a.m58432b(AndroidGeolocationService$locationConsumer$2.f37168f);

    /* renamed from: e */
    public final boolean f37167e;

    public AndroidGeolocationService(Context context, boolean z) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        this.f37167e = z;
        this.f37163a = (LocationManager) C4732a.getSystemService(context, LocationManager.class);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public final C19468a mo44368a() {
        boolean z;
        String str;
        Location location;
        if (!this.f37167e || this.f37163a == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        LocationManager locationManager = this.f37163a;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setHorizontalAccuracy(3);
            criteria.setPowerRequirement(1);
            str = locationManager.getBestProvider(criteria, true);
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        LocationManager locationManager2 = this.f37163a;
        if (locationManager2 != null) {
            location = locationManager2.getLastKnownLocation(str);
        } else {
            location = null;
        }
        if (location != null) {
            return new C19468a(location.getLatitude(), location.getLongitude(), (double) location.getAccuracy(), location.getTime());
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final void mo44369b() {
        boolean z;
        String str;
        if (!this.f37167e || this.f37163a == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LocationManager locationManager = this.f37163a;
            if (locationManager != null) {
                Criteria criteria = new Criteria();
                criteria.setHorizontalAccuracy(3);
                criteria.setPowerRequirement(1);
                str = locationManager.getBestProvider(criteria, true);
            } else {
                str = null;
            }
            if (str == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                LocationManager locationManager2 = this.f37163a;
                if (locationManager2 != null) {
                    locationManager2.getCurrentLocation(str, (CancellationSignal) null, (ExecutorService) this.f37165c.getValue(), Consumer.Wrapper.convert((Consumer) this.f37166d.getValue()));
                    return;
                }
                return;
            }
            LocationManager locationManager3 = this.f37163a;
            if (locationManager3 != null) {
                locationManager3.requestSingleUpdate(str, (C14662b) this.f37164b.getValue(), Looper.getMainLooper());
            }
        }
    }
}
