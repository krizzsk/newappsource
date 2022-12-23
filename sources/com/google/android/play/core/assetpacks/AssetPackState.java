package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.appsflyer.ServerParameters;
import mf0.C24361g;

public abstract class AssetPackState {
    /* renamed from: h */
    public static C14263f0 m35443h(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new C14263f0(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    /* renamed from: i */
    public static C14263f0 m35444i(Bundle bundle, String str, C14335x0 x0Var, C14245a2 a2Var, C14342z zVar) {
        double d;
        int i;
        Bundle bundle2 = bundle;
        String str2 = str;
        C14335x0 x0Var2 = x0Var;
        int zza = zVar.zza(bundle2.getInt(C24361g.m61192v0(ServerParameters.STATUS, str2)));
        int i2 = bundle2.getInt(C24361g.m61192v0("error_code", str2));
        long j = bundle2.getLong(C24361g.m61192v0("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C24361g.m61192v0("total_bytes_to_download", str2));
        synchronized (x0Var) {
            Double d2 = (Double) x0Var2.f36118a.get(str2);
            if (d2 == null) {
                d = 0.0d;
            } else {
                d = d2.doubleValue();
            }
        }
        long j3 = bundle2.getLong(C24361g.m61192v0("pack_version", str2));
        long j4 = bundle2.getLong(C24361g.m61192v0("pack_base_version", str2));
        int i3 = 4;
        if (zza == 4) {
            if (j4 == 0 || j4 == j3) {
                zza = 4;
            } else {
                i = 2;
                return m35443h(str, i3, i2, j, j2, d, i, bundle2.getString(C24361g.m61192v0("pack_version_tag", str2), String.valueOf(bundle2.getInt(ServerParameters.APP_VERSION_CODE))), a2Var.mo42798a(str2));
            }
        }
        i3 = zza;
        i = 1;
        return m35443h(str, i3, i2, j, j2, d, i, bundle2.getString(C24361g.m61192v0("pack_version_tag", str2), String.valueOf(bundle2.getInt(ServerParameters.APP_VERSION_CODE))), a2Var.mo42798a(str2));
    }

    /* renamed from: a */
    public abstract long mo42774a();

    /* renamed from: b */
    public abstract int mo42775b();

    /* renamed from: c */
    public abstract String mo42776c();

    /* renamed from: d */
    public abstract int mo42777d();

    /* renamed from: e */
    public abstract long mo42778e();

    /* renamed from: f */
    public abstract int mo42779f();

    /* renamed from: g */
    public abstract int mo42780g();

    /* renamed from: j */
    public abstract String mo42781j();

    /* renamed from: k */
    public abstract String mo42782k();
}
