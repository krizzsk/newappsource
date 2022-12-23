package com.google.android.play.core.assetpacks;

import ce0.C21100e;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.firebase.perf.metrics.Trace;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc;
import com.google.i18n.phonenumbers.internal.RegexCache;
import com.moovit.image.glide.utils.GlideDataHelper;
import com.moovit.network.model.ServerId;
import java.io.File;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.regex.Matcher;
import p025b6.C1492e;
import p025b6.C1494g;
import p060d6.C4397l;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p441dk.C16672a;
import p532hf.C17427b;
import p725pj.C18926a;
import p810sz.C19600l;
import p906wz.C20431c;
import p906wz.C20433e;
import p906wz.C20436g;
import v10.C20065a;
import z10.C20797b;

/* renamed from: com.google.android.play.core.assetpacks.m0 */
public final class C14291m0 implements C1494g, C20433e {

    /* renamed from: b */
    public Object f35949b;

    public /* synthetic */ C14291m0(C13868n nVar) {
        this.f35949b = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22690a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo22691b() {
    }

    /* renamed from: c */
    public final void mo22692c(boolean z) {
        ((Trace) this.f35949b).putAttribute("type", z ? "locally" : "remotely");
    }

    /* renamed from: d */
    public final void mo22693d() {
        ((Trace) this.f35949b).start();
    }

    /* renamed from: e */
    public final C13487h mo42865e() {
        C13872r<Void> a = ((C13868n) this.f35949b).mo40784a(C21100e.m49331Z(), "AuthenticationToken.txt");
        if (!a.mo40817a()) {
            return new C13487h(null, (C18926a) null);
        }
        return new C13487h(null, new C16672a(a.f34120b, C16672a.f43421x, "Failed deleting the authentication token"));
    }

    /* renamed from: f */
    public final boolean mo42866f(CharSequence charSequence, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        String b = phonemetadata$PhoneNumberDesc.mo43829b();
        if (b.length() == 0) {
            return false;
        }
        Matcher matcher = ((RegexCache) this.f35949b).mo43873a(b).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo22694g(C20431c cVar, HttpURLConnection httpURLConnection) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo22695h() {
    }

    /* renamed from: i */
    public final EncodeStrategy mo5852i(C1492e eVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* renamed from: k */
    public final /* synthetic */ void mo22697k() {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo22698l() {
    }

    /* renamed from: n */
    public final boolean mo979n(Object obj, File file, C1492e eVar) {
        return GlideDataHelper.m40840c(file, (C20065a) ((C4397l) obj).get(), (C19600l) this.f35949b);
    }

    /* renamed from: o */
    public final void mo22699o(C20431c cVar, C20436g gVar, boolean z) {
        boolean z2;
        String str;
        if (gVar != null) {
            Trace trace = (Trace) this.f35949b;
            if (z) {
                str = "item_cache_hit";
            } else {
                str = "item_cache_miss";
            }
            trace.incrementMetric(str, 1);
        }
        if (gVar == null || !cVar.mo21057B()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ((Trace) this.f35949b).stop();
        }
    }

    public C14291m0(int i) {
        if (i != 6) {
            this.f35949b = new RegexCache(100);
        } else {
            this.f35949b = new HashMap();
        }
    }

    public /* synthetic */ C14291m0(C20797b bVar) {
        this.f35949b = bVar;
    }

    public C14291m0(ServerId serverId, String str, String str2) {
        String str3;
        C17427b.m43467a().getClass();
        Trace d = Trace.m36075d(str);
        this.f35949b = d;
        if (serverId != null) {
            str3 = serverId.mo19751c();
        } else {
            str3 = "unknown";
        }
        d.putAttribute("metroId", str3);
        ((Trace) this.f35949b).putAttribute("host", str2 == null ? "unknown" : str2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14291m0(c70.C13752e r3, java.lang.String r4) {
        /*
            r2 = this;
            tp.a0 r0 = r3.f33853b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            y90.f r0 = r0.f50160a
            com.moovit.network.model.ServerId r0 = r0.f32927c
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            com.moovit.analytics.AnalyticsFlowKey r3 = r3.f33854c
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = r3.name()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r1)
        L_0x0019:
            r2.<init>(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14291m0.<init>(c70.e, java.lang.String):void");
    }
}
