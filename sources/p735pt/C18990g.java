package p735pt;

import android.net.Uri;
import com.moovit.transit.LocationDescriptor;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import p435de.C16596f;
import p977zz.C20964s0;

/* renamed from: pt.g */
public final class C18990g {
    /* renamed from: a */
    public static String m46098a(String str, String str2, String str3) {
        try {
            return URLDecoder.decode(Uri.parse("moovit://directions").buildUpon().appendQueryParameter("dest_lat", str).appendQueryParameter("dest_lon", str2).appendQueryParameter("dest_name", str3).appendQueryParameter("auto_run", String.valueOf(true)).appendQueryParameter("partner_id", "google_search").build().toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C16596f a = C16596f.m42113a();
            a.mo49363b("failed build direction url: " + e);
            return Uri.parse("moovit://directions").buildUpon().appendQueryParameter("dest_lat", str).appendQueryParameter("dest_lon", str2).appendQueryParameter("auto_run", String.valueOf(true)).appendQueryParameter("partner_id", "google_search").build().toString();
        }
    }

    /* renamed from: b */
    public static String m46099b(LocationDescriptor locationDescriptor) {
        String n = locationDescriptor.mo24310d().mo46925n();
        String q = locationDescriptor.mo24310d().mo46927q();
        String a = m46098a(n, q, locationDescriptor.mo24313f());
        if (a.length() <= 256) {
            return a;
        }
        if (C20964s0.m49090h(locationDescriptor.f23651f)) {
            return m46098a(n, q, locationDescriptor.f23651f);
        }
        return m46098a(n, q, locationDescriptor.mo24313f().substring(0, a.length() - 256));
    }

    /* renamed from: c */
    public static boolean m46100c(LocationDescriptor locationDescriptor) {
        if (locationDescriptor == null || locationDescriptor.mo24310d() == null || locationDescriptor.mo24313f() == null || LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b)) {
            return false;
        }
        return true;
    }
}
