package wc0;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.material.internal.C14080o;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p229r1.C6235e;
import qc0.C13046a;

/* renamed from: wc0.c */
public final class C13236c implements C13046a {

    /* renamed from: a */
    public static C14080o f32856a;

    /* renamed from: wc0.c$a */
    public class C13237a implements Runnable {

        /* renamed from: b */
        public SignalsHandler f32857b;

        public C13237a(SignalsHandler signalsHandler) {
            this.f32857b = signalsHandler;
        }

        public final void run() {
            String str;
            HashMap hashMap = new HashMap();
            String str2 = null;
            for (Map.Entry value : ((Map) C13236c.f32856a.f35108a).entrySet()) {
                C13235b bVar = (C13235b) value.getValue();
                String str3 = bVar.f32853a;
                QueryInfo queryInfo = bVar.f32854b;
                if (queryInfo != null) {
                    str = queryInfo.getQuery();
                } else {
                    str = null;
                }
                hashMap.put(str3, str);
                String str4 = bVar.f32855c;
                if (str4 != null) {
                    str2 = str4;
                }
            }
            if (hashMap.size() > 0) {
                this.f32857b.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str2 == null) {
                this.f32857b.onSignalsCollected("");
            } else {
                this.f32857b.onSignalsCollectionFailed(str2);
            }
        }
    }

    public C13236c(C14080o oVar) {
        f32856a = oVar;
    }

    /* renamed from: a */
    public final void mo39932a(Context context, String[] strArr, String[] strArr2, SignalsHandler signalsHandler) {
        C6235e eVar = new C6235e();
        for (String b : strArr) {
            eVar.mo22238c();
            mo40110b(context, b, AdFormat.INTERSTITIAL, eVar);
        }
        for (String b2 : strArr2) {
            eVar.mo22238c();
            mo40110b(context, b2, AdFormat.REWARDED, eVar);
        }
        C13237a aVar = new C13237a(signalsHandler);
        eVar.f19682b = aVar;
        if (eVar.f19681a <= 0) {
            aVar.run();
        }
    }

    /* renamed from: b */
    public final void mo40110b(Context context, String str, AdFormat adFormat, C6235e eVar) {
        AdRequest build = new AdRequest.Builder().build();
        C13235b bVar = new C13235b(str);
        C13234a aVar = new C13234a(bVar, eVar);
        ((Map) f32856a.f35108a).put(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar);
    }
}
