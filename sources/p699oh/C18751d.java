package p699oh;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.C3762c;
import com.iab.omid.library.fyber.adsession.AdSessionContextType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: oh.d */
public final class C18751d {

    /* renamed from: a */
    public final C18752e f47697a;

    /* renamed from: b */
    public final WebView f47698b;

    /* renamed from: c */
    public final ArrayList f47699c;

    /* renamed from: d */
    public final HashMap f47700d = new HashMap();

    /* renamed from: e */
    public final String f47701e;

    /* renamed from: f */
    public final String f47702f;

    /* renamed from: g */
    public final String f47703g;

    /* renamed from: h */
    public final AdSessionContextType f47704h;

    public C18751d(C18752e eVar, C3762c cVar, String str, List list, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.f47699c = arrayList;
        this.f47697a = eVar;
        this.f47698b = cVar;
        this.f47701e = str;
        this.f47704h = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String uuid = UUID.randomUUID().toString();
                this.f47700d.put(uuid, (C18753f) it.next());
            }
        }
        this.f47703g = "";
        this.f47702f = "";
    }
}
