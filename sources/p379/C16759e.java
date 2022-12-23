package p379;

import android.media.UnsupportedSchemeException;
import android.util.SparseArray;
import ce0.C21100e;
import com.google.android.exoplayer2.drm.C3918d;
import com.google.android.exoplayer2.drm.C3920f;
import com.google.android.exoplayer2.drm.C3925g;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.gms.measurement.internal.zzfy;
import com.moovit.sdk.maintenance.SdkMaintenanceWorker;
import g30.C4776h;
import i30.C5269e;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l70.C18178a;
import p081f3.C4665k;
import x90.C13240a;

/* renamed from: e */
public final /* synthetic */ class C16759e implements C3920f.C3923c {
    /* renamed from: b */
    public static C4665k.C4666a m42346b(C18178a aVar, TimeUnit timeUnit, TimeUnit timeUnit2) {
        return (C4665k.C4666a) ((C4665k.C4666a) new C4665k.C4666a(SdkMaintenanceWorker.class, 24, timeUnit, 12, timeUnit2).mo20189a("sdk_maintenance_job")).mo20189a(aVar.mo50598a());
    }

    /* renamed from: c */
    public static float m42347c(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* renamed from: d */
    public static C5269e m42348d(C4776h hVar, String str) {
        C5269e eVar = new C5269e();
        C21100e.m49373x(hVar, str);
        return eVar;
    }

    /* renamed from: e */
    public static String m42349e(String str, int i) {
        return str + i;
    }

    /* renamed from: f */
    public static String m42350f(String str, String str2, int i) {
        return str + str2 + i;
    }

    /* renamed from: g */
    public static StringBuilder m42351g(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    /* renamed from: h */
    public static StringBuilder m42352h(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* renamed from: i */
    public static void m42353i(int i, C13240a.C13241a aVar, SparseArray sparseArray, int i2, int i3, C13240a.C13241a aVar2, int i4, int i5, C13240a.C13241a aVar3, int i6) {
        sparseArray.append(i2, C13240a.m33358j(i, aVar));
        sparseArray.append(i4, C13240a.m33358j(i3, aVar2));
        sparseArray.append(i6, C13240a.m33358j(i5, aVar3));
    }

    /* renamed from: j */
    public static void m42354j(zzfy zzfy, String str) {
        zzfy.zzay().zzk().zza(str);
    }

    /* renamed from: k */
    public static void m42355k(StringBuilder sb, double d, String str, String str2) {
        sb.append(d);
        sb.append(str);
        sb.append(str2);
    }

    /* renamed from: a */
    public C3920f mo16019a(UUID uuid) {
        try {
            return new C3925g(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        } catch (UnsupportedDrmException unused) {
            new StringBuilder(String.valueOf(uuid).length() + 53);
            return new C3918d();
        }
    }
}
