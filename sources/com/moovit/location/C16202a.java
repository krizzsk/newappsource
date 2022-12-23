package com.moovit.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ce0.C21100e;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.dialog.AlertDialogFragment;
import com.usebutton.sdk.internal.api.AppActionRequest;
import i20.C17556r;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;
import p067e1.C4464a;
import p090g1.C4732a;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19739q;
import p824tp.C19746x;
import p858uz.C20061g;
import p977zz.C20927a0;
import p977zz.C20934d0;
import p977zz.C20935e;
import p977zz.C20943i;

/* renamed from: com.moovit.location.a */
public abstract class C16202a {
    private static final String ACTION_LOCATION_PERMISSIONS_STATE_CHANGED = "location_permissions_state_changed";
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C16202a INSTANCE = null;
    public static final int PERMISSION_DENIED = 1;
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_REJECTED = 2;
    private static final int PERMISSION_REJECT_THRESHOLD = 300;
    public static final int PERMISSION_SETTINGS = 3;
    public final Context context;
    private boolean defaultIncludeBackgroundPermission = false;
    private C20061g highAccuracyFrequentUpdates;
    private final Map<Object, C16204b<?>> locationPermissionStateByHost = new WeakHashMap();
    private C20061g lowAccuracyRareUpdates;
    private C20061g medAccuracyInfrequentUpdates;
    private C20061g realTimeFrequentUpdates;

    /* renamed from: com.moovit.location.a$a */
    public interface C16203a {
        /* renamed from: a */
        boolean mo48507a();

        /* renamed from: b */
        boolean mo48508b();

        /* renamed from: c */
        boolean mo48509c();

        /* renamed from: d */
        void mo48510d(MoovitActivity moovitActivity, C20935e<Integer> eVar);
    }

    /* renamed from: com.moovit.location.a$b */
    public static class C16204b<H> {

        /* renamed from: a */
        public final long f42270a = SystemClock.elapsedRealtime();

        /* renamed from: b */
        public final C16205c<H> f42271b;

        public C16204b(C16205c<H> cVar) {
            this.f42271b = cVar;
        }
    }

    /* renamed from: com.moovit.location.a$c */
    public interface C16205c<H> {
        /* renamed from: h */
        void mo5770h(int i, Object obj);
    }

    public C16202a(Context context2) {
        C21100e.m49373x(context2, AppActionRequest.KEY_CONTEXT);
        this.context = context2.getApplicationContext();
    }

    private static C16202a create(Context context2) {
        C16202a aVar;
        try {
            aVar = createGooglePlayServicesLocationSources(context2);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to create Google Play Services location source", e));
            aVar = null;
        }
        if (aVar == null) {
            aVar = new AndroidLocationSources(context2);
        }
        aVar.onPostCreate();
        return aVar;
    }

    private static FusedLocationSources createGooglePlayServicesLocationSources(Context context2) {
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context2);
        if (isGooglePlayServicesAvailable == 0) {
            return new FusedLocationSources(context2);
        }
        if (isGooglePlayServicesAvailable == 2 || isGooglePlayServicesAvailable == 3) {
            return new FusedLocationSources(context2);
        }
        return null;
    }

    private static String[] createLocationPermissions(boolean z) {
        if (Build.VERSION.SDK_INT != 29 || !z) {
            return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        }
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    }

    private AlertDialogFragment createLocationPrePermissionDialog(CharSequence charSequence, CharSequence charSequence2) {
        return new AlertDialogFragment.C15856a(this.context).mo47682k("LOCATION_PERMISSIONS_RATIONAL_FRAGMENT").mo47676e(C19739q.img_location, false).mo47684m(charSequence).mo47679h(charSequence2).mo47681j(C19746x.location_rational_positive_button).mo47680i(C19746x.location_rational_negative_button).mo47673b();
    }

    public static C16202a get(Context context2) {
        if (INSTANCE == null) {
            synchronized (C16202a.class) {
                if (INSTANCE == null) {
                    INSTANCE = create(context2.getApplicationContext());
                }
            }
        }
        return INSTANCE;
    }

    private void notifyLocationPermissionsChanged() {
        updateLastKnownLocation();
        Intent intent = new Intent(ACTION_LOCATION_PERMISSIONS_STATE_CHANGED);
        intent.setPackage(this.context.getPackageName());
        Context context2 = this.context;
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        context2.sendBroadcast(intent, context2.getApplicationInfo().packageName + ".permission.BROADCAST_RECEIVER");
    }

    private void onPostCreate() {
        updateLastKnownLocation();
    }

    private <H> void onRequestPermissionHostResult(H h, C16204b<H> bVar, int i) {
        C16205c<H> cVar;
        if (!(bVar == null || (cVar = bVar.f42271b) == null)) {
            cVar.mo5770h(i, h);
        }
        notifyLocationPermissionsChanged();
    }

    private <H> void putRequestState(H h, C16205c<H> cVar) {
        this.locationPermissionStateByHost.put(h, new C16204b(cVar));
    }

    public static void registerPassiveBroadcastReceiver(Context context2, BroadcastReceiver broadcastReceiver) {
        registerPassiveBroadcastReceiver(context2, broadcastReceiver, (Handler) null);
    }

    private <H> C16204b<H> removeRequestState(H h) {
        return this.locationPermissionStateByHost.remove(h);
    }

    private int resolvePermissionResults(MoovitActivity moovitActivity, C16204b<?> bVar, String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (iArr[i] == 0) {
                return 0;
            }
        }
        if (moovitActivity == null || bVar == null || SystemClock.elapsedRealtime() - bVar.f42270a >= 300) {
            return 1;
        }
        return 2;
    }

    public static void unregisterPassiveBroadcastReceiver(Context context2, BroadcastReceiver broadcastReceiver) {
        context2.unregisterReceiver(broadcastReceiver);
    }

    public abstract void addSettingsChangeListener(C20935e<Void> eVar);

    public final LocationRequest createHighAccuracyRequest() {
        LocationRequest priority = LocationRequest.create().setPriority(100);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return priority.setInterval(timeUnit.toMillis(10)).setFastestInterval(timeUnit.toMillis(1));
    }

    public abstract C20061g createLocationSource(Context context2, Looper looper, LocationRequest locationRequest);

    public final C20061g createLocationSource(Context context2, LocationRequest locationRequest) {
        return createLocationSource(context2, Looper.getMainLooper(), locationRequest);
    }

    public final LocationRequest createLowAccuracyRequest() {
        LocationRequest priority = LocationRequest.create().setPriority(104);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        return priority.setInterval(timeUnit.toMillis(10)).setFastestInterval(timeUnit.toMillis(5)).setSmallestDisplacement(10000.0f);
    }

    public final LocationRequest createMedAccuracyRequest() {
        LocationRequest priority = LocationRequest.create().setPriority(102);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return priority.setInterval(timeUnit.toMillis(60)).setFastestInterval(timeUnit.toMillis(30));
    }

    public final LocationRequest createRealTimeRequest() {
        LocationRequest priority = LocationRequest.create().setPriority(100);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return priority.setInterval(timeUnit.toMillis(3)).setFastestInterval(timeUnit.toMillis(1));
    }

    public final C20061g getHighAccuracyFrequentUpdates() {
        if (this.highAccuracyFrequentUpdates == null) {
            this.highAccuracyFrequentUpdates = createLocationSource(this.context, createHighAccuracyRequest());
        }
        return this.highAccuracyFrequentUpdates;
    }

    public final C16203a getLocationSettings() throws Exception {
        C21100e.m49355o();
        return (C16203a) Tasks.await(requestLocationSettings());
    }

    public final C20061g getLowAccuracyRareUpdates() {
        if (this.lowAccuracyRareUpdates == null) {
            this.lowAccuracyRareUpdates = createLocationSource(this.context, createLowAccuracyRequest());
        }
        return this.lowAccuracyRareUpdates;
    }

    public final C20061g getMedAccuracyInfrequentUpdates() {
        if (this.medAccuracyInfrequentUpdates == null) {
            this.medAccuracyInfrequentUpdates = createLocationSource(this.context, createMedAccuracyRequest());
        }
        return this.medAccuracyInfrequentUpdates;
    }

    public final C20061g getPermissionAwareHighAccuracyFrequentUpdates() {
        return new C17556r(this.context, getHighAccuracyFrequentUpdates());
    }

    public final C20061g getPermissionAwareLowAccuracyRareUpdates() {
        return new C17556r(this.context, getLowAccuracyRareUpdates());
    }

    public final C20061g getPermissionAwareMedAccuracyInfrequentUpdates() {
        return new C17556r(this.context, getMedAccuracyInfrequentUpdates());
    }

    public final C20061g getPermissionAwareRealTimeAccuracyFrequentUpdates() {
        return new C17556r(this.context, getRealTimeAccuracyFrequentUpdates());
    }

    public final C20061g getRealTimeAccuracyFrequentUpdates() {
        if (this.realTimeFrequentUpdates == null) {
            this.realTimeFrequentUpdates = createLocationSource(this.context, createRealTimeRequest());
        }
        return this.realTimeFrequentUpdates;
    }

    public boolean hasBackgroundLocationPermissions() {
        Context context2 = this.context;
        if (!C20943i.m49051d(29)) {
            return C20934d0.m49032c(context2);
        }
        try {
            if (C4732a.checkSelfPermission(context2, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public boolean hasCoarseLocationPermissions() {
        return C20934d0.m49030a(this.context);
    }

    public boolean hasLocationPermissions() {
        return C20934d0.m49032c(this.context);
    }

    public boolean hasPreciseLocationPermissions() {
        return C20934d0.m49031b(this.context);
    }

    public void onGooglePlayServicesAvailable() {
        updateLastKnownLocation();
    }

    public abstract void onLocationSettingsResolutionResult(MoovitActivity moovitActivity, int i, Intent intent);

    public void onPermissionSettingsResult(MoovitActivity moovitActivity) {
        onRequestPermissionHostResult(moovitActivity, removeRequestState(moovitActivity), 3);
    }

    public void onRequestPermissionResult(MoovitActivity moovitActivity, String[] strArr, int[] iArr) {
        C16204b removeRequestState = removeRequestState(moovitActivity);
        int resolvePermissionResults = resolvePermissionResults(moovitActivity, removeRequestState, strArr, iArr);
        onRequestPermissionHostResult(moovitActivity, removeRequestState, resolvePermissionResults);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, resolvePermissionResults == 0 ? "allow_location_clicked" : "deny_location_clicked");
        moovitActivity.mo44545v2(aVar.mo49933a());
    }

    public void onRequestPrePermissionResult(MoovitActivity moovitActivity, int i) {
        C16205c<H> cVar;
        int i2 = i == -1 ? 1 : 0;
        C16204b removeRequestState = removeRequestState(moovitActivity);
        if (!(removeRequestState == null || (cVar = removeRequestState.f42271b) == null)) {
            cVar.mo5770h(i2 ^ 1, moovitActivity);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, i2 != 0 ? "allow_pre_location_clicked" : "deny_pre_location_clicked");
        moovitActivity.mo44545v2(aVar.mo49933a());
    }

    public abstract Task<Void> removeBackgroundLocationUpdates(PendingIntent pendingIntent);

    public abstract void removeSettingsChangeListener(C20935e<Void> eVar);

    public void requestBackgroundLocationPermissions(MoovitActivity moovitActivity, C16205c<MoovitActivity> cVar) {
        putRequestState(moovitActivity, cVar);
        C4464a.m11673a(moovitActivity, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 104);
    }

    public abstract Task<Void> requestBackgroundLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent);

    public void requestLocationPermissions(MoovitActivity moovitActivity, C16205c<MoovitActivity> cVar) {
        requestLocationPermissions(moovitActivity, this.defaultIncludeBackgroundPermission, cVar);
    }

    public void requestLocationPrePermissions(MoovitActivity moovitActivity, CharSequence charSequence, CharSequence charSequence2, C16205c<MoovitActivity> cVar) {
        putRequestState(moovitActivity, cVar);
        createLocationPrePermissionDialog(charSequence, charSequence2).show(moovitActivity.getSupportFragmentManager(), "LOCATION_PERMISSIONS_RATIONAL_FRAGMENT");
    }

    public abstract Task<C16203a> requestLocationSettings();

    public void requestPermissionSettings(MoovitActivity moovitActivity, C16205c<MoovitActivity> cVar) {
        Intent b = C20927a0.m49007b(this.context);
        if (b == null) {
            onPermissionSettingsResult(moovitActivity);
            return;
        }
        putRequestState(moovitActivity, cVar);
        moovitActivity.startActivityForResult(b, 105);
    }

    public boolean requiresGooglePlayServices() {
        return false;
    }

    public void setDefaultIncludeBackgroundPermission(boolean z) {
        this.defaultIncludeBackgroundPermission = z;
    }

    public boolean shouldShowBackgroundLocationPermissionRationale(MoovitActivity moovitActivity) {
        return C20943i.m49051d(29);
    }

    public boolean shouldShowCoarseLocationPermissionRationale(MoovitActivity moovitActivity) {
        return C4464a.m11674b(moovitActivity, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public boolean shouldShowLocationsPermissionRationale(MoovitActivity moovitActivity) {
        if (C4464a.m11674b(moovitActivity, "android.permission.ACCESS_FINE_LOCATION") || C4464a.m11674b(moovitActivity, "android.permission.ACCESS_COARSE_LOCATION")) {
            return true;
        }
        return false;
    }

    public boolean shouldShowPreciseLocationPermissionRationale(MoovitActivity moovitActivity) {
        return C4464a.m11674b(moovitActivity, "android.permission.ACCESS_FINE_LOCATION");
    }

    public void updateLastKnownLocation() {
        if (hasLocationPermissions()) {
            getRealTimeAccuracyFrequentUpdates().mo52308p();
            getHighAccuracyFrequentUpdates().mo52308p();
            getMedAccuracyInfrequentUpdates().mo52308p();
            getLowAccuracyRareUpdates().mo52308p();
        }
    }

    public static void registerPassiveBroadcastReceiver(Context context2, BroadcastReceiver broadcastReceiver, Handler handler) {
        IntentFilter intentFilter = new IntentFilter(ACTION_LOCATION_PERMISSIONS_STATE_CHANGED);
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        context2.registerReceiver(broadcastReceiver, intentFilter, C0016g.m31o(new StringBuilder(), context2.getApplicationInfo().packageName, ".permission.BROADCAST_RECEIVER"), handler);
    }

    public void requestLocationPermissions(MoovitActivity moovitActivity, boolean z, C16205c<MoovitActivity> cVar) {
        putRequestState(moovitActivity, cVar);
        C4464a.m11673a(moovitActivity, createLocationPermissions(z), 104);
    }

    public void onPermissionSettingsResult(C15682c<?> cVar) {
        onRequestPermissionHostResult(cVar, removeRequestState(cVar), 3);
    }

    public void requestBackgroundLocationPermissions(C15682c<?> cVar, C16205c<C15682c<?>> cVar2) {
        putRequestState(cVar, cVar2);
        cVar.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 104);
    }

    public void requestLocationPrePermissions(C15682c<?> cVar, CharSequence charSequence, CharSequence charSequence2, C16205c<C15682c<?>> cVar2) {
        putRequestState(cVar, cVar2);
        createLocationPrePermissionDialog(charSequence, charSequence2).show(cVar.getChildFragmentManager(), "LOCATION_PERMISSIONS_RATIONAL_FRAGMENT");
    }

    public void requestLocationPermissions(C15682c<?> cVar, C16205c<C15682c<?>> cVar2) {
        requestLocationPermissions(cVar, this.defaultIncludeBackgroundPermission, cVar2);
    }

    public void requestPermissionSettings(C15682c<?> cVar, C16205c<C15682c<?>> cVar2) {
        Intent b = C20927a0.m49007b(this.context);
        if (b == null) {
            onPermissionSettingsResult(cVar);
            return;
        }
        putRequestState(cVar, cVar2);
        cVar.startActivityForResult(b, 105);
    }

    public void requestLocationPermissions(C15682c<?> cVar, boolean z, C16205c<C15682c<?>> cVar2) {
        putRequestState(cVar, cVar2);
        cVar.requestPermissions(createLocationPermissions(z), 104);
    }

    public void onRequestPermissionResult(C15682c<?> cVar, String[] strArr, int[] iArr) {
        C16204b<H> removeRequestState = removeRequestState(cVar);
        int resolvePermissionResults = resolvePermissionResults(cVar.f40822c, removeRequestState, strArr, iArr);
        onRequestPermissionHostResult(cVar, removeRequestState, resolvePermissionResults);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, resolvePermissionResults == 0 ? "allow_location_clicked" : "deny_location_clicked");
        cVar.mo46797j2(aVar.mo49933a());
    }

    public void onRequestPrePermissionResult(C15682c<?> cVar, int i) {
        C16205c<H> cVar2;
        int i2 = i == -1 ? 1 : 0;
        C16204b<H> removeRequestState = removeRequestState(cVar);
        if (!(removeRequestState == null || (cVar2 = removeRequestState.f42271b) == null)) {
            cVar2.mo5770h(i2 ^ 1, cVar);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, i2 != 0 ? "allow_pre_location_clicked" : "deny_pre_location_clicked");
        cVar.mo46797j2(aVar.mo49933a());
    }
}
