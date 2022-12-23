package zc0;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p092g3.C4752a;
import p229r1.C6235e;
import qc0.C13046a;

/* renamed from: zc0.c */
public final class C13380c implements C13046a {

    /* renamed from: a */
    public static Map<String, String> f33216a;

    /* renamed from: b */
    public static C4752a f33217b;

    /* renamed from: zc0.c$a */
    public class C13381a implements Runnable {

        /* renamed from: b */
        public SignalsHandler f33218b;

        public C13381a(SignalsHandler signalsHandler) {
            this.f33218b = signalsHandler;
        }

        public final void run() {
            String str;
            C13380c.f33216a = new HashMap();
            String str2 = null;
            for (Map.Entry value : ((Map) C13380c.f33217b.f16037a).entrySet()) {
                C13379b bVar = (C13379b) value.getValue();
                Map<String, String> map = C13380c.f33216a;
                String str3 = bVar.f33213a;
                QueryInfo queryInfo = bVar.f33214b;
                if (queryInfo != null) {
                    str = queryInfo.getQuery();
                } else {
                    str = null;
                }
                map.put(str3, str);
                String str4 = bVar.f33215c;
                if (str4 != null) {
                    str2 = str4;
                }
            }
            if (C13380c.f33216a.size() > 0) {
                this.f33218b.onSignalsCollected(new JSONObject(C13380c.f33216a).toString());
            } else if (str2 == null) {
                this.f33218b.onSignalsCollected("");
            } else {
                this.f33218b.onSignalsCollectionFailed(str2);
            }
        }
    }

    public C13380c(C4752a aVar) {
        f33217b = aVar;
    }

    /* renamed from: a */
    public final void mo39932a(Context context, String[] strArr, String[] strArr2, SignalsHandler signalsHandler) {
        C6235e eVar = new C6235e();
        for (String b : strArr) {
            eVar.mo22238c();
            mo40261b(context, b, AdFormat.INTERSTITIAL, eVar);
        }
        for (String b2 : strArr2) {
            eVar.mo22238c();
            mo40261b(context, b2, AdFormat.REWARDED, eVar);
        }
        C13381a aVar = new C13381a(signalsHandler);
        eVar.f19682b = aVar;
        if (eVar.f19681a <= 0) {
            aVar.run();
        }
    }

    /* renamed from: b */
    public final void mo40261b(Context context, String str, AdFormat adFormat, C6235e eVar) {
        AdRequest build = new AdRequest.Builder().build();
        C13379b bVar = new C13379b(str);
        C13378a aVar = new C13378a(bVar, eVar);
        ((Map) f33217b.f16037a).put(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar);
    }
}
