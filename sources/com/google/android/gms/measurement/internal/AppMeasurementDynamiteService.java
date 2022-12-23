package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import p241s0.C6302b;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {
    @VisibleForTesting
    public zzfy zza = null;
    private final Map zzb = new C6302b();

    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(zzcf zzcf, String str) {
        zzb();
        this.zza.zzv().zzV(zzcf, str);
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzq().zzA(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzU((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zze(str, j);
    }

    public void generateEventId(zzcf zzcf) throws RemoteException {
        zzb();
        long zzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzU(zzcf, zzq);
    }

    public void getAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzi(this, zzcf));
    }

    public void getCachedAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzq().zzo());
    }

    public void getConditionalUserProperties(String str, String str2, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzm(this, zzcf, str, str2));
    }

    public void getCurrentScreenClass(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzq().zzp());
    }

    public void getCurrentScreenName(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzq().zzq());
    }

    public void getGmpAppId(zzcf zzcf) throws RemoteException {
        String str;
        zzb();
        zzid zzq = this.zza.zzq();
        if (zzq.zzs.zzw() != null) {
            str = zzq.zzs.zzw();
        } else {
            try {
                str = zzij.zzc(zzq.zzs.zzau(), "google_app_id", zzq.zzs.zzz());
            } catch (IllegalStateException e) {
                zzq.zzs.zzay().zzd().zzb("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        zzc(zzcf, str);
    }

    public void getMaxUserProperties(String str, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzq().zzh(str);
        zzb();
        this.zza.zzv().zzT(zzcf, 25);
    }

    public void getTestFlag(zzcf zzcf, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzv().zzV(zzcf, this.zza.zzq().zzr());
        } else if (i == 1) {
            this.zza.zzv().zzU(zzcf, this.zza.zzq().zzm().longValue());
        } else if (i == 2) {
            zzlh zzv = this.zza.zzv();
            double doubleValue = this.zza.zzq().zzj().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcf.zzd(bundle);
            } catch (RemoteException e) {
                zzv.zzs.zzay().zzk().zzb("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.zza.zzv().zzT(zzcf, this.zza.zzq().zzl().intValue());
        } else if (i == 4) {
            this.zza.zzv().zzP(zzcf, this.zza.zzq().zzi().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzk(this, zzcf, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzcl zzcl, long j) throws RemoteException {
        zzfy zzfy = this.zza;
        if (zzfy == null) {
            this.zza = zzfy.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzcl, Long.valueOf(j));
        } else {
            C16759e.m42354j(zzfy, "Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaz().zzp(new zzn(this, zzcf));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzE(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        Bundle bundle2;
        zzb();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.zza.zzaz().zzp(new zzj(this, zzcf, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object obj;
        Object obj2;
        zzb();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzay().zzt(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zzb();
        zzic zzic = this.zza.zzq().zza;
        if (zzic != null) {
            this.zza.zzq().zzB();
            zzic.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzic zzic = this.zza.zzq().zza;
        if (zzic != null) {
            this.zza.zzq().zzB();
            zzic.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzic zzic = this.zza.zzq().zza;
        if (zzic != null) {
            this.zza.zzq().zzB();
            zzic.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzic zzic = this.zza.zzq().zza;
        if (zzic != null) {
            this.zza.zzq().zzB();
            zzic.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcf, long j) throws RemoteException {
        zzb();
        zzic zzic = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzic != null) {
            this.zza.zzq().zzB();
            zzic.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e) {
            this.zza.zzay().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void performAction(Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        zzb();
        zzcf.zzd((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzgz zzgz;
        zzb();
        synchronized (this.zzb) {
            zzgz = (zzgz) this.zzb.get(Integer.valueOf(zzci.zzd()));
            if (zzgz == null) {
                zzgz = new zzp(this, zzci);
                this.zzb.put(Integer.valueOf(zzci.zzd()), zzgz);
            }
        }
        this.zza.zzq().zzJ(zzgz);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzK(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            C16530d.m42018k(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzq().zzQ(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) throws RemoteException {
        zzb();
        zzid zzq = this.zza.zzq();
        zzq.zzs.zzaz().zzq(new zzhc(zzq, bundle, j));
    }

    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzR(bundle, -20, j);
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        zzb();
        this.zza.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzid zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzs.zzaz().zzp(new zzhz(zzq, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        zzb();
        zzid zzq = this.zza.zzq();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzq.zzs.zzaz().zzp(new zzhd(zzq, bundle2));
    }

    public void setEventInterceptor(zzci zzci) throws RemoteException {
        zzb();
        zzo zzo = new zzo(this, zzci);
        if (this.zza.zzaz().zzs()) {
            this.zza.zzq().zzT(zzo);
        } else {
            this.zza.zzaz().zzp(new zzl(this, zzo));
        }
    }

    public void setInstanceIdProvider(zzck zzck) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzU(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        zzid zzq = this.zza.zzq();
        zzq.zzs.zzaz().zzp(new zzhh(zzq, j));
    }

    public void setUserId(String str, long j) throws RemoteException {
        zzb();
        zzid zzq = this.zza.zzq();
        if (str == null || !TextUtils.isEmpty(str)) {
            zzq.zzs.zzaz().zzp(new zzhe(zzq, str));
            zzq.zzX((String) null, "_id", str, true, j);
            return;
        }
        C16759e.m42354j(zzq.zzs, "User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzX(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    public void unregisterOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzgz zzgz;
        zzb();
        synchronized (this.zzb) {
            zzgz = (zzgz) this.zzb.remove(Integer.valueOf(zzci.zzd()));
        }
        if (zzgz == null) {
            zzgz = new zzp(this, zzci);
        }
        this.zza.zzq().zzZ(zzgz);
    }
}
