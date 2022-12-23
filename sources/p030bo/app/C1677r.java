package p030bo.app;

import com.amazonaws.http.HttpHeader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bo.app.r */
public class C1677r {
    /* renamed from: a */
    public static Map<String, String> m4665a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put(HttpHeader.CONTENT_TYPE, "application/json");
        return hashMap;
    }
}
