package p927xw;

import android.content.Context;
import android.net.Uri;
import com.moovit.user.LocaleInfo;
import p977zz.C20964s0;

/* renamed from: xw.h */
public final class C20640h {
    /* renamed from: a */
    public static String m48521a(Context context, String str) {
        String str2;
        if (C20964s0.m49090h(str)) {
            return str;
        }
        LocaleInfo b = LocaleInfo.m17919b(context);
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (b != null) {
            str2 = b.toString();
        } else {
            str2 = "";
        }
        return buildUpon.appendQueryParameter("locale", str2).build().toString();
    }
}
