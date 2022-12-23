package tc0;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.play.core.assetpacks.C14291m0;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p229r1.C6235e;
import qc0.C13046a;

/* renamed from: tc0.c */
public final class C13134c implements C13046a {

    /* renamed from: a */
    public static C14291m0 f32630a;

    /* renamed from: tc0.c$a */
    public class C13135a implements Runnable {

        /* renamed from: b */
        public SignalsHandler f32631b;

        public C13135a(SignalsHandler signalsHandler) {
            this.f32631b = signalsHandler;
        }

        public final void run() {
            String str;
            HashMap hashMap = new HashMap();
            String str2 = null;
            for (Map.Entry value : ((Map) C13134c.f32630a.f35949b).entrySet()) {
                C13133b bVar = (C13133b) value.getValue();
                String str3 = bVar.f32627a;
                QueryInfo queryInfo = bVar.f32628b;
                if (queryInfo != null) {
                    str = queryInfo.getQuery();
                } else {
                    str = null;
                }
                hashMap.put(str3, str);
                String str4 = bVar.f32629c;
                if (str4 != null) {
                    str2 = str4;
                }
            }
            if (hashMap.size() > 0) {
                this.f32631b.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str2 == null) {
                this.f32631b.onSignalsCollected("");
            } else {
                this.f32631b.onSignalsCollectionFailed(str2);
            }
        }
    }

    public C13134c(C14291m0 m0Var) {
        f32630a = m0Var;
    }

    /* renamed from: a */
    public final void mo39932a(Context context, String[] strArr, String[] strArr2, SignalsHandler signalsHandler) {
        C6235e eVar = new C6235e();
        for (String b : strArr) {
            eVar.mo22238c();
            mo40043b(context, b, AdFormat.INTERSTITIAL, eVar);
        }
        for (String b2 : strArr2) {
            eVar.mo22238c();
            mo40043b(context, b2, AdFormat.REWARDED, eVar);
        }
        C13135a aVar = new C13135a(signalsHandler);
        eVar.f19682b = aVar;
        if (eVar.f19681a <= 0) {
            aVar.run();
        }
    }

    /* renamed from: b */
    public final void mo40043b(Context context, String str, AdFormat adFormat, C6235e eVar) {
        AdRequest build = new AdRequest.Builder().build();
        C13133b bVar = new C13133b(str);
        C13132a aVar = new C13132a(bVar, eVar);
        ((Map) f32630a.f35949b).put(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar);
    }
}
