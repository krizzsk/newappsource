package p009a8;

import android.content.Intent;
import android.net.Uri;
import com.appboy.models.outgoing.FacebookUser;
import com.facebook.Profile;
import com.facebook.internal.C2397f0;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p130j2.C5367a;

/* renamed from: a8.w */
public final class C0127w {

    /* renamed from: d */
    public static final C0128a f369d = new C0128a();

    /* renamed from: e */
    public static volatile C0127w f370e;

    /* renamed from: a */
    public final C5367a f371a;

    /* renamed from: b */
    public final C0126v f372b;

    /* renamed from: c */
    public Profile f373c;

    /* renamed from: a8.w$a */
    public static final class C0128a {
        /* renamed from: a */
        public final synchronized C0127w mo282a() {
            C0127w wVar;
            try {
                if (C0127w.f370e == null) {
                    C5367a a = C5367a.m13473a(C0115o.m210a());
                    C24362h.m61210e(a, "getInstance(applicationContext)");
                    C0127w.f370e = new C0127w(a, new C0126v());
                }
                wVar = C0127w.f370e;
                if (wVar == null) {
                    C24362h.m61217l("instance");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return wVar;
        }
    }

    public C0127w(C5367a aVar, C0126v vVar) {
        this.f371a = aVar;
        this.f372b = vVar;
    }

    /* renamed from: a */
    public final void mo281a(Profile profile, boolean z) {
        Profile profile2 = this.f373c;
        this.f373c = profile;
        if (z) {
            if (profile != null) {
                C0126v vVar = this.f372b;
                vVar.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.f8445b);
                    jSONObject.put(FacebookUser.FIRST_NAME_KEY, profile.f8446c);
                    jSONObject.put("middle_name", profile.f8447d);
                    jSONObject.put(FacebookUser.LAST_NAME_KEY, profile.f8448e);
                    jSONObject.put("name", profile.f8449f);
                    Uri uri = profile.f8450g;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.f8451h;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    vVar.f368a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                this.f372b.f368a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!C2397f0.m6307a(profile2, profile)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            this.f371a.mo21147c(intent);
        }
    }
}
