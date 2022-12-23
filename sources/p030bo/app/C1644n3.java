package p030bo.app;

import android.net.Uri;
import java.util.Map;

/* renamed from: bo.app.n3 */
public abstract class C1644n3 implements C1628l3 {

    /* renamed from: a */
    public final Map<String, String> f5863a;

    /* renamed from: b */
    public final Uri f5864b;

    public C1644n3(Uri uri, Map<String, String> map) {
        this.f5863a = map;
        this.f5864b = Uri.parse(uri + mo6253n());
    }

    /* renamed from: n */
    public String mo6253n() {
        Map<String, String> map = this.f5863a;
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("?");
        for (String next : this.f5863a.keySet()) {
            sb.append(next);
            sb.append('=');
            sb.append(this.f5863a.get(next));
            sb.append('&');
        }
        return sb.substring(0, sb.length() - 1);
    }
}
