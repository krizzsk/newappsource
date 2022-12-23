package p897wq;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14741h;
import com.usebutton.sdk.internal.util.DiskLruCache;

/* renamed from: wq.c */
public final class C20394c implements C20395d {
    /* renamed from: a */
    public final void mo52609a(MoovitApplication moovitApplication, boolean z, boolean z2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(moovitApplication).edit();
        if (z2) {
            edit.remove("gad_rdp");
        } else {
            edit.putInt("gad_rdp", 1);
        }
        edit.apply();
    }

    /* renamed from: b */
    public final void mo52610b(AdManagerAdRequest.Builder builder, C14741h hVar, boolean z, boolean z2) {
        Bundle bundle = new Bundle(2);
        if (!z) {
            bundle.putString("npa", DiskLruCache.VERSION_1);
        }
        if (!z2) {
            bundle.putInt("rdp", 1);
        }
        if (!bundle.isEmpty()) {
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        }
    }
}
