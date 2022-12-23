package p379;

import com.google.android.gms.measurement.internal.zzfy;
import com.google.firebase.storage.StorageRegistrar;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.maintenance.MaintenanceWorker;
import com.moovit.payment.clearance.ClearanceProvider;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import p081f3.C4665k;
import p227r.C6227a;
import p404ce.C13791f;
import p404ce.C13806s;
import vi0.C25121g;

/* renamed from: d */
public final /* synthetic */ class C16530d implements C13791f, C6227a {
    /* renamed from: a */
    public static void m42008a(ClearanceProvider clearanceProvider) {
        Throwable th;
        if (clearanceProvider.mo48829f().contains(ClearanceProvider.Capabilities.PAYMENT)) {
            th = new ApplicationBugException("Developer error, did not implement createPaymentFragment(...)!");
        } else {
            th = new UnsupportedOperationException("Clearance provider doesn't support payment");
        }
        throw th;
    }

    /* renamed from: b */
    public static C4665k.C4666a m42009b(C18322a aVar, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        return (C4665k.C4666a) ((C4665k.C4666a) new C4665k.C4666a(MaintenanceWorker.class, j, timeUnit, j2, timeUnit2).mo20189a("maintenance_job")).mo20189a(aVar.mo50104a());
    }

    /* renamed from: c */
    public static double m42010c(double d, double d2, double d3, double d4) {
        return ((d - d2) * d3) + d4;
    }

    /* renamed from: d */
    public static int m42011d(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* renamed from: e */
    public static String m42012e(String str, long j, String str2) {
        return str + j + str2;
    }

    /* renamed from: f */
    public static String m42013f(String str, File file) {
        return str + file;
    }

    /* renamed from: g */
    public static String m42014g(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: h */
    public static String m42015h(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public static HashSet m42016i(int i, String str, String str2) {
        HashSet hashSet = new HashSet(i);
        hashSet.add(str);
        hashSet.add(str2);
        return hashSet;
    }

    /* renamed from: j */
    public static Map m42017j(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    /* renamed from: k */
    public static void m42018k(zzfy zzfy, String str) {
        zzfy.zzay().zzd().zza(str);
    }

    /* renamed from: l */
    public static void m42019l(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    /* renamed from: n */
    public static void m42020n(C25121g gVar, int i) {
        gVar.mo61678B(i);
        gVar.mo61712y();
        gVar.mo61713z();
        gVar.mo61688L();
    }

    /* renamed from: o */
    public static int m42021o(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public Object apply(Object obj) {
        return ((TodBookingOrderViewModel.OrderInformation) obj).f40082b;
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return StorageRegistrar.lambda$getComponents$0(sVar);
    }
}
