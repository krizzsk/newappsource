package p009a8;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.C2376b;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import org.json.JSONObject;
import p009a8.C0098d0;
import p262t8.C6606a;

/* renamed from: a8.c0 */
public final /* synthetic */ class C0096c0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f283b;

    public /* synthetic */ C0096c0(long j) {
        this.f283b = j;
    }

    public final void run() {
        String str;
        long j = this.f283b;
        Class<C0098d0> cls = C0098d0.class;
        if (!C6606a.m15601b(cls)) {
            try {
                if (C0098d0.f296f.mo212a()) {
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                    C2429s f = FetchedAppSettingsManager.m6264f(C0115o.m211b(), false);
                    if (f != null && f.f8715h) {
                        Context a = C0115o.m210a();
                        C2376b bVar = C2376b.f8604f;
                        C2376b a2 = C2376b.C2377a.m6272a(a);
                        if (a2 == null || a2.mo12541a() == null) {
                            str = null;
                        } else {
                            str = a2.mo12541a();
                        }
                        if (str != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("advertiser_id", str);
                            bundle.putString("fields", "auto_event_setup_enabled");
                            String str2 = GraphRequest.f8425j;
                            GraphRequest g = GraphRequest.C2281c.m6137g((AccessToken) null, "app", (GraphRequest.C2280b) null);
                            g.f8431d = bundle;
                            JSONObject jSONObject = g.mo11903c().f365b;
                            if (jSONObject != null) {
                                C0098d0.C0099a aVar = C0098d0.f297g;
                                aVar.f302c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                aVar.f303d = j;
                                C0098d0.f291a.mo211j(aVar);
                            }
                        }
                    }
                }
                C0098d0.f293c.set(false);
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }
}
