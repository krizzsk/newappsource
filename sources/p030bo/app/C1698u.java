package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: bo.app.u */
public class C1698u {

    /* renamed from: a */
    public static final String f6018a = AppboyLogger.getBrazeLogTag(C1698u.class);

    /* renamed from: b */
    public static C1684s f6019b;

    static {
        try {
            f6019b = new C1684s();
        } catch (Exception e) {
            AppboyLogger.m5452e(f6018a, "Exception initializing static TLS socket factory.", e);
        }
    }

    /* renamed from: a */
    public static URLConnection m4769a(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        if (url.getProtocol().equals("https")) {
            try {
                ((HttpsURLConnection) uRLConnection).setSSLSocketFactory(f6019b);
            } catch (Exception e) {
                AppboyLogger.m5452e(f6018a, "Exception setting TLS socket factory on url connection.", e);
            }
        }
        return uRLConnection;
    }
}
