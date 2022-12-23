package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.C2410j0;
import com.unity3d.ads.metadata.MediationMetaData;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p054d0.C4268a1;

/* renamed from: com.facebook.internal.p */
public final class C2425p extends C2410j0 {

    /* renamed from: q */
    public static final /* synthetic */ int f8698q = 0;

    /* renamed from: p */
    public boolean f8699p;

    static {
        Class<C2425p> cls = C2425p.class;
    }

    public C2425p(FragmentActivity fragmentActivity, String str, String str2) {
        super(fragmentActivity, str);
        this.f8662c = str2;
    }

    /* renamed from: f */
    public static void m6377f(C2425p pVar) {
        C24362h.m61211f(pVar, "this$0");
        super.cancel();
    }

    /* renamed from: b */
    public final Bundle mo12566b(String str) {
        Uri parse = Uri.parse(str);
        C2397f0 f0Var = C2397f0.f8630a;
        Bundle G = C2397f0.m6298G(parse.getQuery());
        String string = G.getString("bridge_args");
        G.remove("bridge_args");
        if (!C2397f0.m6292A(string)) {
            try {
                G.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C2382c.m6277a(new JSONObject(string)));
            } catch (JSONException unused) {
                C2397f0 f0Var2 = C2397f0.f8630a;
                C0115o oVar = C0115o.f331a;
            }
        }
        String string2 = G.getString("method_results");
        G.remove("method_results");
        if (!C2397f0.m6292A(string2)) {
            try {
                G.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C2382c.m6277a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                C2397f0 f0Var3 = C2397f0.f8630a;
                C0115o oVar2 = C0115o.f331a;
            }
        }
        G.remove(MediationMetaData.KEY_VERSION);
        G.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C2440z.m6405l());
        return G;
    }

    public final void cancel() {
        C2410j0.C2416f fVar = this.f8664e;
        if (!this.f8671l || this.f8669j || fVar == null || !fVar.isShown()) {
            super.cancel();
        } else if (!this.f8699p) {
            this.f8699p = true;
            fVar.loadUrl(C24362h.m61216k("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            new Handler(Looper.getMainLooper()).postDelayed(new C4268a1(this, 6), 1500);
        }
    }
}
