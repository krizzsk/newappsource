package p145k5;

import android.content.Context;
import c70.C13752e;
import com.appboy.Appboy;
import com.facebook.internal.C2427r;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import com.google.firebase.perf.p414v1.C14523g;
import com.google.firebase.perf.p414v1.C14530i;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.moovit.app.taxi.providers.C15445a;
import com.veriff.sdk.camera.core.ImageCapture;
import java.util.concurrent.Executor;
import mf0.C24362h;
import org.json.JSONObject;
import p626lf.C18200a;
import p766rf.C19260d;

/* renamed from: k5.d */
public final /* synthetic */ class C5485d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18010b;

    /* renamed from: c */
    public final /* synthetic */ Object f18011c;

    /* renamed from: d */
    public final /* synthetic */ Object f18012d;

    /* renamed from: e */
    public final /* synthetic */ Object f18013e;

    public /* synthetic */ C5485d(int i, Object obj, Object obj2, Object obj3) {
        this.f18010b = i;
        this.f18013e = obj;
        this.f18011c = obj2;
        this.f18012d = obj3;
    }

    public /* synthetic */ C5485d(Context context, String str, String str2) {
        this.f18010b = 1;
        this.f18011c = str;
        this.f18013e = context;
        this.f18012d = str2;
    }

    public final void run() {
        switch (this.f18010b) {
            case 0:
                ((Appboy) this.f18013e).m5408c((String) this.f18011c, (String) this.f18012d);
                return;
            case 1:
                String str = (String) this.f18011c;
                Context context = (Context) this.f18013e;
                String str2 = (String) this.f18012d;
                C2427r rVar = C2427r.f8702a;
                C24362h.m61211f(str, "$applicationId");
                C24362h.m61211f(context, "$context");
                C24362h.m61211f(str2, "$gateKeepersKey");
                C2427r.f8702a.getClass();
                JSONObject a = C2427r.m6379a();
                if (a.length() != 0) {
                    C2427r.m6382d(str, a);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, a.toString()).apply();
                    C2427r.f8706e = Long.valueOf(System.currentTimeMillis());
                }
                C2427r.m6383e();
                C2427r.f8703b.set(false);
                return;
            case 2:
                ((SessionManager) this.f18013e).lambda$setApplicationContext$0((Context) this.f18011c, (PerfSession) this.f18012d);
                return;
            case 3:
                C19260d dVar = (C19260d) this.f18013e;
                C18200a aVar = C19260d.f48933s;
                dVar.getClass();
                C14523g.C14525b z = C14523g.m36191z();
                z.mo43956p();
                C14523g.m36189v((C14523g) z.f36809c, (C14530i) this.f18011c);
                dVar.mo51681c(z, (ApplicationProcessState) this.f18012d);
                return;
            case 4:
                C13752e eVar = (C13752e) this.f18011c;
                ((C15445a) this.f18013e).getClass();
                try {
                    C15445a.m39504k(eVar);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((ImageCapture) this.f18013e).lambda$takePicture$4((Executor) this.f18011c, (ImageCapture.OnImageCapturedCallback) this.f18012d);
                return;
        }
    }
}
