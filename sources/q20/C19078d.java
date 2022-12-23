package q20;

import aa0.C7530f;
import android.content.Context;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.commons.geo.LatLonE6;
import p824tp.C19735m;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: q20.d */
public final class C19078d {
    /* renamed from: a */
    public static String m46199a(Context context, String str, boolean z) {
        String str2;
        if (C20964s0.m49090h(str)) {
            str2 = null;
        } else if (C20975x0.m49121h(context, str)) {
            str2 = "open_app";
        } else {
            str2 = "download_app";
        }
        if (z && str2 != null) {
            return C20964s0.m49102t(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, str2, "get_directions");
        } else if (z) {
            return "get_directions";
        } else {
            return str2;
        }
    }

    /* renamed from: b */
    public static int m46200b(int i) {
        if (i <= 19) {
            return C19735m.colorCritical;
        }
        if (i <= 59) {
            return C19735m.colorProblem;
        }
        return C19735m.colorGood;
    }

    /* renamed from: c */
    public static int m46201c(Context context, LatLonE6 latLonE6, C19047a aVar) {
        int round = Math.round(C7530f.m17271d(context, latLonE6));
        if (round <= 0) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.ceil((double) ((((float) round) / ((Float) aVar.mo51505b(C19053d.f48482u)).floatValue()) / 60.0f));
    }
}
