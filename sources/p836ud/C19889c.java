package p836ud;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import p435de.C16592b;
import p836ud.C19885a;
import p860vd.C20105a;
import p860vd.C20107c;
import p860vd.C20109e;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: ud.c */
public final class C19889c implements C19885a {

    /* renamed from: c */
    public static volatile C19889c f50513c;
    @VisibleForTesting

    /* renamed from: a */
    public final AppMeasurementSdk f50514a;
    @VisibleForTesting

    /* renamed from: b */
    public final ConcurrentHashMap f50515b = new ConcurrentHashMap();

    public C19889c(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f50514a = appMeasurementSdk;
    }

    @KeepForSdk
    /* renamed from: a */
    public final void mo52166a(String str, String str2, Bundle bundle) {
        if (C20105a.m47694c(str) && C20105a.m47693b(bundle, str2) && C20105a.m47692a(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.f50514a.logEvent(str, str2, bundle);
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public final void mo52167b(String str) {
        this.f50514a.clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    @KeepForSdk
    /* renamed from: c */
    public final ArrayList mo52168c(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle next : this.f50514a.getConditionalUserProperties(str, "")) {
            HashSet hashSet = C20105a.f51016a;
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            Preconditions.checkNotNull(next);
            C19885a.C19887b bVar = new C19885a.C19887b();
            bVar.f50498a = (String) Preconditions.checkNotNull((String) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, cls2, (Object) null));
            bVar.f50499b = (String) Preconditions.checkNotNull((String) zzgu.zza(next, "name", cls2, (Object) null));
            bVar.f50500c = zzgu.zza(next, "value", Object.class, (Object) null);
            bVar.f50501d = (String) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, cls2, (Object) null);
            bVar.f50502e = ((Long) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cls, 0L)).longValue();
            bVar.f50503f = (String) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, cls2, (Object) null);
            bVar.f50504g = (Bundle) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, (Object) null);
            bVar.f50505h = (String) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, cls2, (Object) null);
            bVar.f50506i = (Bundle) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, (Object) null);
            bVar.f50507j = ((Long) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cls, 0L)).longValue();
            bVar.f50508k = (String) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, cls2, (Object) null);
            bVar.f50509l = (Bundle) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, (Object) null);
            bVar.f50511n = ((Boolean) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            bVar.f50510m = ((Long) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cls, 0L)).longValue();
            bVar.f50512o = ((Long) zzgu.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cls, 0L)).longValue();
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @KeepForSdk
    /* renamed from: d */
    public final Map<String, Object> mo52169d(boolean z) {
        return this.f50514a.getUserProperties((String) null, (String) null, z);
    }

    @KeepForSdk
    /* renamed from: e */
    public final int mo52170e(String str) {
        return this.f50514a.getMaxUserProperties(str);
    }

    @KeepForSdk
    /* renamed from: f */
    public final C19888b mo52171f(String str, C16592b bVar) {
        boolean z;
        Object obj;
        Preconditions.checkNotNull(bVar);
        if (!C20105a.m47694c(str)) {
            return null;
        }
        if (str.isEmpty() || !this.f50515b.containsKey(str) || this.f50515b.get(str) == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f50514a;
        if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
            obj = new C20107c(appMeasurementSdk, bVar);
        } else if (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) {
            obj = new C20109e(appMeasurementSdk, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f50515b.put(str, obj);
        return new C19888b();
    }

    @KeepForSdk
    /* renamed from: g */
    public final void mo52172g(String str) {
        if (C20105a.m47694c(AppMeasurement.FCM_ORIGIN) && C20105a.m47695d(AppMeasurement.FCM_ORIGIN, "_ln")) {
            this.f50514a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (p860vd.C20105a.m47692a(r6.f50509l, r0, r6.f50508k) != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (p860vd.C20105a.m47692a(r6.f50506i, r0, r6.f50505h) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (p860vd.C20105a.m47692a(r6.f50504g, r0, r6.f50503f) == false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52173h(p836ud.C19885a.C19887b r6) {
        /*
            r5 = this;
            java.util.HashSet r0 = p860vd.C20105a.f51016a
            java.lang.String r0 = r6.f50498a
            if (r0 == 0) goto L_0x0070
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000e
            goto L_0x0070
        L_0x000e:
            java.lang.Object r1 = r6.f50500c
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzij.zza(r1)
            if (r1 == 0) goto L_0x0070
        L_0x0018:
            boolean r1 = p860vd.C20105a.m47694c(r0)
            if (r1 != 0) goto L_0x001f
            goto L_0x0070
        L_0x001f:
            java.lang.String r1 = r6.f50499b
            boolean r1 = p860vd.C20105a.m47695d(r0, r1)
            if (r1 != 0) goto L_0x0028
            goto L_0x0070
        L_0x0028:
            java.lang.String r1 = r6.f50508k
            if (r1 == 0) goto L_0x003f
            android.os.Bundle r2 = r6.f50509l
            boolean r1 = p860vd.C20105a.m47693b(r2, r1)
            if (r1 != 0) goto L_0x0035
            goto L_0x0070
        L_0x0035:
            java.lang.String r1 = r6.f50508k
            android.os.Bundle r2 = r6.f50509l
            boolean r1 = p860vd.C20105a.m47692a(r2, r0, r1)
            if (r1 == 0) goto L_0x0070
        L_0x003f:
            java.lang.String r1 = r6.f50505h
            if (r1 == 0) goto L_0x0056
            android.os.Bundle r2 = r6.f50506i
            boolean r1 = p860vd.C20105a.m47693b(r2, r1)
            if (r1 != 0) goto L_0x004c
            goto L_0x0070
        L_0x004c:
            java.lang.String r1 = r6.f50505h
            android.os.Bundle r2 = r6.f50506i
            boolean r1 = p860vd.C20105a.m47692a(r2, r0, r1)
            if (r1 == 0) goto L_0x0070
        L_0x0056:
            java.lang.String r1 = r6.f50503f
            if (r1 == 0) goto L_0x006e
            android.os.Bundle r2 = r6.f50504g
            boolean r1 = p860vd.C20105a.m47693b(r2, r1)
            if (r1 != 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            java.lang.String r1 = r6.f50503f
            android.os.Bundle r2 = r6.f50504g
            boolean r0 = p860vd.C20105a.m47692a(r2, r0, r1)
            if (r0 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 != 0) goto L_0x0074
            return
        L_0x0074:
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r5.f50514a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r6.f50498a
            if (r2 == 0) goto L_0x0084
            java.lang.String r3 = "origin"
            r1.putString(r3, r2)
        L_0x0084:
            java.lang.String r2 = r6.f50499b
            if (r2 == 0) goto L_0x008d
            java.lang.String r3 = "name"
            r1.putString(r3, r2)
        L_0x008d:
            java.lang.Object r2 = r6.f50500c
            if (r2 == 0) goto L_0x0094
            com.google.android.gms.measurement.internal.zzgu.zzb(r1, r2)
        L_0x0094:
            java.lang.String r2 = r6.f50501d
            if (r2 == 0) goto L_0x009d
            java.lang.String r3 = "trigger_event_name"
            r1.putString(r3, r2)
        L_0x009d:
            long r2 = r6.f50502e
            java.lang.String r4 = "trigger_timeout"
            r1.putLong(r4, r2)
            java.lang.String r2 = r6.f50503f
            if (r2 == 0) goto L_0x00ad
            java.lang.String r3 = "timed_out_event_name"
            r1.putString(r3, r2)
        L_0x00ad:
            android.os.Bundle r2 = r6.f50504g
            if (r2 == 0) goto L_0x00b6
            java.lang.String r3 = "timed_out_event_params"
            r1.putBundle(r3, r2)
        L_0x00b6:
            java.lang.String r2 = r6.f50505h
            if (r2 == 0) goto L_0x00bf
            java.lang.String r3 = "triggered_event_name"
            r1.putString(r3, r2)
        L_0x00bf:
            android.os.Bundle r2 = r6.f50506i
            if (r2 == 0) goto L_0x00c8
            java.lang.String r3 = "triggered_event_params"
            r1.putBundle(r3, r2)
        L_0x00c8:
            long r2 = r6.f50507j
            java.lang.String r4 = "time_to_live"
            r1.putLong(r4, r2)
            java.lang.String r2 = r6.f50508k
            if (r2 == 0) goto L_0x00d8
            java.lang.String r3 = "expired_event_name"
            r1.putString(r3, r2)
        L_0x00d8:
            android.os.Bundle r2 = r6.f50509l
            if (r2 == 0) goto L_0x00e1
            java.lang.String r3 = "expired_event_params"
            r1.putBundle(r3, r2)
        L_0x00e1:
            long r2 = r6.f50510m
            java.lang.String r4 = "creation_timestamp"
            r1.putLong(r4, r2)
            boolean r2 = r6.f50511n
            java.lang.String r3 = "active"
            r1.putBoolean(r3, r2)
            long r2 = r6.f50512o
            java.lang.String r6 = "triggered_timestamp"
            r1.putLong(r6, r2)
            r0.setConditionalUserProperty(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p836ud.C19889c.mo52173h(ud.a$b):void");
    }
}
