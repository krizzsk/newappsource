package p030bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* renamed from: bo.app.o4 */
public final class C1655o4 {

    /* renamed from: a */
    public static final String f5909a = AppboyLogger.getBrazeLogTag(C1655o4.class);

    /* renamed from: a */
    public static URI m4563a(Uri uri) {
        try {
            return new URI(uri.toString());
        } catch (URISyntaxException unused) {
            String str = f5909a;
            StringBuilder k = C13555b.m33972k("Could not create URI from uri [");
            k.append(uri.toString());
            k.append("]");
            AppboyLogger.m5459w(str, k.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static URL m4564a(URI uri) {
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            String str = f5909a;
            StringBuilder k = C13555b.m33972k("Unable to parse URI [");
            k.append(e.getMessage());
            k.append("]");
            AppboyLogger.m5452e(str, k.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m4562a(Object... objArr) {
        long j = 1;
        for (Object hashCode : objArr) {
            int hashCode2 = hashCode.hashCode();
            j *= hashCode2 == 0 ? 1 : (long) hashCode2;
        }
        return Long.toHexString(j);
    }
}
