package p860vd;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzgx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: vd.a */
public final class C20105a {

    /* renamed from: a */
    public static final HashSet f51016a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    public static final List f51017b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    public static final List f51018c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    public static final List f51019d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    public static final List f51020e = Arrays.asList((String[]) ArrayUtils.concat(zzgx.zza, zzgx.zzb));

    /* renamed from: f */
    public static final List f51021f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m47692a(android.os.Bundle r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r6 = m47694c(r5)
            r1 = 0
            if (r6 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r4 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.List r6 = f51019d
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.containsKey(r2)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x002e:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L_0x0057
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L_0x004d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0061
            r5 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0057:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0061
            r5 = 0
            goto L_0x0062
        L_0x0061:
            r5 = -1
        L_0x0062:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L_0x0077
            if (r5 == r0) goto L_0x0071
            if (r5 == r3) goto L_0x006b
            return r1
        L_0x006b:
            java.lang.String r5 = "fiam_integration"
            r4.putString(r6, r5)
            return r0
        L_0x0071:
            java.lang.String r5 = "fdl_integration"
            r4.putString(r6, r5)
            return r0
        L_0x0077:
            java.lang.String r5 = "fcm_integration"
            r4.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p860vd.C20105a.m47692a(android.os.Bundle, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static boolean m47693b(Bundle bundle, String str) {
        if (f51017b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f51019d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m47694c(String str) {
        return !f51018c.contains(str);
    }

    /* renamed from: d */
    public static boolean m47695d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc")) {
                return true;
            }
            return false;
        } else if ("_ln".equals(str2)) {
            if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN)) {
                return true;
            }
            return false;
        } else if (f51020e.contains(str2)) {
            return false;
        } else {
            for (String matches : f51021f) {
                if (str2.matches(matches)) {
                    return false;
                }
            }
            return true;
        }
    }
}
