package com.moovit.location;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.AsyncTask;
import android.os.Looper;
import androidx.annotation.Keep;
import ce0.C21100e;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.location.C16202a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p435de.C16596f;
import p531he.C17399f0;
import p735pt.C18982c;
import p858uz.C20050c;
import p858uz.C20051d;
import p858uz.C20061g;
import p977zz.C20935e;

@Keep
public class FusedLocationSources extends C16202a {
    private final BroadcastReceiver changeReceiver = new C16194a();
    private final List<C20935e<Void>> locationSettingsChangeListeners = new ArrayList();
    private final SettingsClient settingsClient;
    /* access modifiers changed from: private */
    public final Map<MoovitActivity, C20935e<Integer>> settingsResolutionSuccessCallbacksByActivity = new WeakHashMap();

    /* renamed from: com.moovit.location.FusedLocationSources$a */
    public class C16194a extends BroadcastReceiver {
        public C16194a() {
        }

        public final void onReceive(Context context, Intent intent) {
            FusedLocationSources.this.onLocationSettingsChanged();
        }
    }

    public FusedLocationSources(Context context) {
        super(context);
        this.settingsClient = LocationServices.getSettingsClient(context);
    }

    /* access modifiers changed from: private */
    public void onLocationSettingsChanged() {
        for (C20935e<Void> invoke : this.locationSettingsChangeListeners) {
            invoke.invoke(null);
        }
    }

    /* access modifiers changed from: private */
    public C16195b toLocationSettings(Task<LocationSettingsResponse> task) {
        try {
            LocationSettingsResponse result = task.getResult(ApiException.class);
            if (result == null) {
                return new C16195b();
            }
            return new C16195b(result.getLocationSettingsStates());
        } catch (ApiException e) {
            C16596f.m42113a().mo49364c(new ApplicationBugException(String.format("Failed to use FusedLocationProvider, status code: %1$s, message: %2$s", new Object[]{Integer.valueOf(e.getStatusCode()), e.getMessage()})));
            return new C16195b(e);
        } catch (Throwable unused) {
            return new C16195b();
        }
    }

    public void addSettingsChangeListener(C20935e<Void> eVar) {
        this.locationSettingsChangeListeners.add(eVar);
        if (this.locationSettingsChangeListeners.size() == 1) {
            this.context.registerReceiver(this.changeReceiver, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        }
    }

    public C20061g createLocationSource(Context context, Looper looper, LocationRequest locationRequest) {
        C20051d dVar = new C20051d(context, looper);
        if (dVar.f48034d) {
            if (dVar.f50887k != null) {
                dVar.f50884h.removeLocationUpdates((LocationCallback) dVar.f50883g).addOnCompleteListener(AsyncTask.THREAD_POOL_EXECUTOR, new C20050c());
            }
            dVar.f50887k = locationRequest;
            if (locationRequest != null) {
                dVar.f50884h.requestLocationUpdates(locationRequest, (LocationCallback) dVar.f50883g, dVar.f50885i).addOnCompleteListener(AsyncTask.THREAD_POOL_EXECUTOR, new C18982c(1));
            }
        } else {
            dVar.f50887k = locationRequest;
        }
        return dVar;
    }

    public void onLocationSettingsResolutionResult(MoovitActivity moovitActivity, int i, Intent intent) {
        int i2;
        C20935e remove = this.settingsResolutionSuccessCallbacksByActivity.remove(moovitActivity);
        if (remove != null) {
            if (i == -1) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            remove.invoke(Integer.valueOf(i2));
        }
    }

    public Task<Void> removeBackgroundLocationUpdates(PendingIntent pendingIntent) {
        return LocationServices.getFusedLocationProviderClient(this.context).removeLocationUpdates(pendingIntent);
    }

    public void removeSettingsChangeListener(C20935e<Void> eVar) {
        this.locationSettingsChangeListeners.remove(eVar);
        if (this.locationSettingsChangeListeners.isEmpty()) {
            this.context.unregisterReceiver(this.changeReceiver);
        }
    }

    public Task<Void> requestBackgroundLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return LocationServices.getFusedLocationProviderClient(this.context).requestLocationUpdates(locationRequest, pendingIntent);
    }

    public Task<C16202a.C16203a> requestLocationSettings() {
        return this.settingsClient.checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(LocationRequest.create().setPriority(100)).addLocationRequest(LocationRequest.create().setPriority(102)).addLocationRequest(LocationRequest.create().setPriority(104)).build()).continueWith(MoovitExecutors.COMPUTATION, new C17399f0(this, 1));
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    /* renamed from: com.moovit.location.FusedLocationSources$b */
    public class C16195b implements C16202a.C16203a {

        /* renamed from: a */
        public final LocationSettingsStates f42232a;

        /* renamed from: b */
        public final ApiException f42233b;

        public C16195b(LocationSettingsStates locationSettingsStates) {
            C21100e.m49373x(locationSettingsStates, "settingsStates");
            this.f42232a = locationSettingsStates;
            this.f42233b = null;
        }

        /* renamed from: a */
        public final boolean mo48507a() {
            LocationSettingsStates locationSettingsStates = this.f42232a;
            return locationSettingsStates != null && locationSettingsStates.isLocationPresent();
        }

        /* renamed from: b */
        public final boolean mo48508b() {
            ApiException apiException = this.f42233b;
            return (apiException instanceof ResolvableApiException) && apiException.getStatusCode() != 8502;
        }

        /* renamed from: c */
        public final boolean mo48509c() {
            LocationSettingsStates locationSettingsStates = this.f42232a;
            return locationSettingsStates != null && locationSettingsStates.isLocationUsable();
        }

        /* renamed from: d */
        public final void mo48510d(MoovitActivity moovitActivity, C20935e<Integer> eVar) {
            try {
                FusedLocationSources.this.settingsResolutionSuccessCallbacksByActivity.put(moovitActivity, eVar);
                ((ResolvableApiException) this.f42233b).startResolutionForResult(moovitActivity, 100);
            } catch (IntentSender.SendIntentException | ClassCastException e) {
                C16596f.m42113a().mo49364c(e);
            }
        }

        public C16195b(ApiException apiException) {
            this.f42232a = null;
            this.f42233b = apiException;
        }

        public C16195b() {
            this.f42232a = null;
            this.f42233b = null;
        }
    }
}
