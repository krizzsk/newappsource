package p009a8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.usebutton.sdk.context.Identifiers;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import org.json.JSONException;
import p130j2.C5367a;

/* renamed from: a8.e */
public final class C0100e {

    /* renamed from: f */
    public static final C0101a f304f = new C0101a();

    /* renamed from: g */
    public static C0100e f305g;

    /* renamed from: a */
    public final C5367a f306a;

    /* renamed from: b */
    public final C0090a f307b;

    /* renamed from: c */
    public AccessToken f308c;

    /* renamed from: d */
    public final AtomicBoolean f309d = new AtomicBoolean(false);

    /* renamed from: e */
    public Date f310e = new Date(0);

    /* renamed from: a8.e$a */
    public static final class C0101a {
        /* renamed from: a */
        public final C0100e mo216a() {
            C0100e eVar;
            C0100e eVar2 = C0100e.f305g;
            if (eVar2 != null) {
                return eVar2;
            }
            synchronized (this) {
                eVar = C0100e.f305g;
                if (eVar == null) {
                    C5367a a = C5367a.m13473a(C0115o.m210a());
                    C24362h.m61210e(a, "getInstance(applicationContext)");
                    C0100e eVar3 = new C0100e(a, new C0090a());
                    C0100e.f305g = eVar3;
                    eVar = eVar3;
                }
            }
            return eVar;
        }
    }

    /* renamed from: a8.e$b */
    public static final class C0102b implements C0105e {
        /* renamed from: a */
        public final String mo217a() {
            return "fb_extend_sso_token";
        }

        /* renamed from: b */
        public final String mo218b() {
            return "oauth/access_token";
        }
    }

    /* renamed from: a8.e$c */
    public static final class C0103c implements C0105e {
        /* renamed from: a */
        public final String mo217a() {
            return "ig_refresh_token";
        }

        /* renamed from: b */
        public final String mo218b() {
            return "refresh_access_token";
        }
    }

    /* renamed from: a8.e$d */
    public static final class C0104d {

        /* renamed from: a */
        public String f311a;

        /* renamed from: b */
        public int f312b;

        /* renamed from: c */
        public int f313c;

        /* renamed from: d */
        public Long f314d;

        /* renamed from: e */
        public String f315e;
    }

    /* renamed from: a8.e$e */
    public interface C0105e {
        /* renamed from: a */
        String mo217a();

        /* renamed from: b */
        String mo218b();
    }

    public C0100e(C5367a aVar, C0090a aVar2) {
        this.f306a = aVar;
        this.f307b = aVar2;
    }

    /* renamed from: a */
    public final void mo213a(AccessToken.C2264a aVar) {
        C0105e eVar;
        AccessToken accessToken = this.f308c;
        if (accessToken == null) {
            if (aVar != null) {
                new FacebookException("No current access token to refresh");
                aVar.mo11846a();
            }
        } else if (this.f309d.compareAndSet(false, true)) {
            this.f310e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C0104d dVar = new C0104d();
            GraphRequest[] graphRequestArr = new GraphRequest[2];
            C0093b bVar = new C0093b(atomicBoolean, hashSet, hashSet2, hashSet3);
            Bundle b = C25541a.m63872b("fields", "permission,status");
            String str = GraphRequest.f8425j;
            GraphRequest g = GraphRequest.C2281c.m6137g(accessToken, "me/permissions", bVar);
            g.f8431d = b;
            HttpMethod httpMethod = HttpMethod.GET;
            g.mo11910k(httpMethod);
            graphRequestArr[0] = g;
            C0095c cVar = new C0095c(dVar);
            String str2 = accessToken.f8361l;
            if (str2 == null) {
                str2 = Identifiers.IDENTIFIER_FACEBOOK;
            }
            if (C24362h.m61206a(str2, "instagram")) {
                eVar = new C0103c();
            } else {
                eVar = new C0102b();
            }
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVar.mo217a());
            bundle.putString("client_id", accessToken.f8358i);
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest g2 = GraphRequest.C2281c.m6137g(accessToken, eVar.mo218b(), cVar);
            g2.f8431d = bundle;
            g2.mo11910k(httpMethod);
            graphRequestArr[1] = g2;
            C0121t tVar = new C0121t(graphRequestArr);
            C0097d dVar2 = new C0097d(dVar, accessToken, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            if (!tVar.f362e.contains(dVar2)) {
                tVar.f362e.add(dVar2);
            }
            C2400g0.m6340e(tVar);
            new C0120s(tVar).executeOnExecutor(C0115o.m212c(), new Void[0]);
        } else if (aVar != null) {
            new FacebookException("Refresh already in progress");
            aVar.mo11846a();
        }
    }

    /* renamed from: b */
    public final void mo214b(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C0115o.m210a(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f306a.mo21147c(intent);
    }

    /* renamed from: c */
    public final void mo215c(AccessToken accessToken, boolean z) {
        Date date;
        PendingIntent pendingIntent;
        AccessToken accessToken2 = this.f308c;
        this.f308c = accessToken;
        this.f309d.set(false);
        this.f310e = new Date(0);
        if (z) {
            if (accessToken != null) {
                C0090a aVar = this.f307b;
                aVar.getClass();
                try {
                    aVar.f270a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo11840b().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                this.f307b.f270a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                C0115o oVar = C0115o.f331a;
                C2397f0 f0Var = C2397f0.f8630a;
                C2397f0.m6310d(C0115o.m210a());
            }
        }
        if (!C2397f0.m6307a(accessToken2, accessToken)) {
            mo214b(accessToken2, accessToken);
            Context a = C0115o.m210a();
            Date date2 = AccessToken.f8348m;
            AccessToken b = AccessToken.C2266c.m6110b();
            AlarmManager alarmManager = (AlarmManager) a.getSystemService("alarm");
            if (AccessToken.C2266c.m6111c()) {
                if (b == null) {
                    date = null;
                } else {
                    date = b.f8351b;
                }
                if (date != null && alarmManager != null) {
                    Intent intent = new Intent(a, CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    if (Build.VERSION.SDK_INT >= 23) {
                        pendingIntent = PendingIntent.getBroadcast(a, 0, intent, 67108864);
                    } else {
                        pendingIntent = PendingIntent.getBroadcast(a, 0, intent, 0);
                    }
                    try {
                        alarmManager.set(1, b.f8351b.getTime(), pendingIntent);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
