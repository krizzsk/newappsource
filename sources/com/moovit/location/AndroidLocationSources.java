package com.moovit.location;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.LocationManager;
import android.os.Looper;
import androidx.annotation.Keep;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.location.C16202a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p858uz.C20049b;
import p858uz.C20061g;
import p977zz.C20935e;

@Keep
public class AndroidLocationSources extends C16202a {
    private final BroadcastReceiver changeReceiver = new C16187a();
    private final C16188b locationSettings;
    private final List<C20935e<Void>> locationSettingsChangeListeners = new ArrayList();
    /* access modifiers changed from: private */
    public final Map<MoovitActivity, C20935e<Integer>> successCallbacksByActivity = new WeakHashMap();

    /* renamed from: com.moovit.location.AndroidLocationSources$a */
    public class C16187a extends BroadcastReceiver {
        public C16187a() {
        }

        public final void onReceive(Context context, Intent intent) {
            AndroidLocationSources.this.onLocationSettingsChanged();
        }
    }

    /* renamed from: com.moovit.location.AndroidLocationSources$b */
    public class C16188b implements C16202a.C16203a {

        /* renamed from: a */
        public final List<String> f42190a = Arrays.asList(new String[]{"gps", ServerParameters.NETWORK});

        /* renamed from: b */
        public final LocationManager f42191b;

        public C16188b(LocationManager locationManager) {
            this.f42191b = locationManager;
        }

        /* renamed from: a */
        public final boolean mo48507a() {
            for (String provider : this.f42190a) {
                if (this.f42191b.getProvider(provider) != null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo48508b() {
            return mo48507a();
        }

        /* renamed from: c */
        public final boolean mo48509c() {
            for (String next : this.f42190a) {
                if (this.f42191b.getProvider(next) != null && this.f42191b.isProviderEnabled(next)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final void mo48510d(MoovitActivity moovitActivity, C20935e<Integer> eVar) {
            AndroidLocationSources.this.successCallbacksByActivity.put(moovitActivity, eVar);
            moovitActivity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 100);
        }
    }

    public AndroidLocationSources(Context context) {
        super(context);
        this.locationSettings = new C16188b((LocationManager) context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY));
    }

    /* access modifiers changed from: private */
    public void onLocationSettingsChanged() {
        for (C20935e<Void> invoke : this.locationSettingsChangeListeners) {
            invoke.invoke(null);
        }
    }

    private static Criteria toCriteria(LocationRequest locationRequest) {
        Criteria criteria = new Criteria();
        int priority = locationRequest.getPriority();
        if (priority == 100) {
            criteria.setAccuracy(1);
        } else if (priority == 102) {
            criteria.setHorizontalAccuracy(2);
            criteria.setPowerRequirement(2);
        } else if (priority == 104) {
            criteria.setHorizontalAccuracy(2);
            criteria.setPowerRequirement(1);
        } else if (priority == 105) {
            criteria.setAccuracy(2);
            criteria.setPowerRequirement(1);
        }
        return criteria;
    }

    public void addSettingsChangeListener(C20935e<Void> eVar) {
        this.locationSettingsChangeListeners.add(eVar);
        if (this.locationSettingsChangeListeners.size() == 1) {
            this.context.registerReceiver(this.changeReceiver, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        }
    }

    public C20061g createLocationSource(Context context, Looper looper, LocationRequest locationRequest) {
        C20049b bVar = new C20049b(context, looper);
        bVar.mo52309l(locationRequest);
        return bVar;
    }

    public void onLocationSettingsResolutionResult(MoovitActivity moovitActivity, int i, Intent intent) {
        C20935e remove = this.successCallbacksByActivity.remove(moovitActivity);
        if (remove != null) {
            remove.invoke(Integer.valueOf(this.locationSettings.mo48509c() ^ true ? 1 : 0));
        }
    }

    public Task<Void> removeBackgroundLocationUpdates(PendingIntent pendingIntent) {
        LocationManager locationManager = (LocationManager) this.context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (locationManager == null) {
            return Tasks.forException(new RuntimeException("Unable to retrieve LocationManager instance."));
        }
        locationManager.removeUpdates(pendingIntent);
        return Tasks.forResult(null);
    }

    public void removeSettingsChangeListener(C20935e<Void> eVar) {
        this.locationSettingsChangeListeners.remove(eVar);
        if (this.locationSettingsChangeListeners.isEmpty()) {
            this.context.unregisterReceiver(this.changeReceiver);
        }
    }

    public Task<Void> requestBackgroundLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        LocationManager locationManager = (LocationManager) this.context.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (locationManager == null) {
            return Tasks.forException(new RuntimeException("Unable to retrieve LocationManager instance."));
        }
        locationManager.requestLocationUpdates(locationRequest.getInterval(), locationRequest.getSmallestDisplacement(), toCriteria(locationRequest), pendingIntent);
        return Tasks.forResult(null);
    }

    public Task<C16202a.C16203a> requestLocationSettings() {
        return Tasks.forResult(this.locationSettings);
    }
}
