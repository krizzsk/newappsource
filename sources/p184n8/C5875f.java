package p184n8;

import com.facebook.appevents.p047ml.ModelManager;
import com.facebook.internal.C2397f0;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.HashSet;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0115o;
import p184n8.C5876g;
import p262t8.C6606a;

/* renamed from: n8.f */
public final /* synthetic */ class C5875f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ JSONObject f18877b;

    /* renamed from: c */
    public final /* synthetic */ String f18878c;

    /* renamed from: d */
    public final /* synthetic */ C5876g f18879d;

    /* renamed from: e */
    public final /* synthetic */ String f18880e;

    public /* synthetic */ C5875f(JSONObject jSONObject, String str, C5876g gVar, String str2) {
        this.f18877b = jSONObject;
        this.f18878c = str;
        this.f18879d = gVar;
        this.f18880e = str2;
    }

    public final void run() {
        JSONObject jSONObject = this.f18877b;
        String str = this.f18878c;
        C5876g gVar = this.f18879d;
        String str2 = this.f18880e;
        if (!C6606a.m15601b(C5876g.class)) {
            try {
                C24362h.m61211f(jSONObject, "$viewData");
                C24362h.m61211f(str, "$buttonText");
                C24362h.m61211f(gVar, "this$0");
                C24362h.m61211f(str2, "$pathID");
                try {
                    C2397f0 f0Var = C2397f0.f8630a;
                    String m = C2397f0.m6319m(C0115o.m210a());
                    if (m != null) {
                        String lowerCase = m.toLowerCase();
                        C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        float[] a = C5869a.m14303a(lowerCase, jSONObject);
                        String c = C5869a.m14304c(str, gVar.f18885e, lowerCase);
                        if (a != null) {
                            ModelManager modelManager = ModelManager.f8546a;
                            String[] f = ModelManager.m6227f(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{a}, new String[]{c});
                            if (f != null) {
                                String str3 = f[0];
                                C5870b.m14315a(str2, str3);
                                if (!C24362h.m61206a(str3, InneractiveMediationNameConsts.OTHER)) {
                                    HashSet hashSet = C5876g.f18881f;
                                    C5876g.C5877a.m14332c(str3, str, a);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C6606a.m15600a(C5876g.class, th);
            }
        }
    }
}
