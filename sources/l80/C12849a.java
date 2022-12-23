package l80;

import android.content.Context;
import android.content.Intent;
import android.webkit.URLUtil;
import com.moovit.web.WebViewActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: l80.a */
public final class C12849a {
    /* renamed from: a */
    public static Intent m32653a(Context context, C19047a aVar, String str) {
        boolean z;
        String str2;
        String str3 = (String) aVar.mo51505b(C19053d.f48465Q);
        if (!C20964s0.m49090h(str3) && !C20964s0.m49090h(str)) {
            if (str.charAt(0) == '@') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = C25541a.m63881k("@", str);
            }
            if (z) {
                str = str.substring(1);
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            objArr[0] = str;
            String format = String.format(locale, str3, objArr);
            if (URLUtil.isValidUrl(format)) {
                return WebViewActivity.m18168y2(context, format, str2);
            }
        }
        return null;
    }
}
