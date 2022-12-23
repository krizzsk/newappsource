package com.google.firebase.remoteconfig.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C14537b;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p358af.C13436c;
import p836ud.C19885a;
import p886wf.C20297c;
import p886wf.C20299d;
import p956ze.C20839b;

/* renamed from: com.google.firebase.remoteconfig.internal.a */
public final class C14535a {

    /* renamed from: j */
    public static final long f36684j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    public static final int[] f36685k = {2, 4, 8, 16, 32, 64, RecyclerView.C1119a0.FLAG_IGNORE, 256};

    /* renamed from: a */
    public final C13436c f36686a;

    /* renamed from: b */
    public final C20839b<C19885a> f36687b;

    /* renamed from: c */
    public final Executor f36688c;

    /* renamed from: d */
    public final Clock f36689d;

    /* renamed from: e */
    public final Random f36690e;

    /* renamed from: f */
    public final C20297c f36691f;

    /* renamed from: g */
    public final ConfigFetchHttpClient f36692g;

    /* renamed from: h */
    public final C14537b f36693h;

    /* renamed from: i */
    public final Map<String, String> f36694i;

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a */
    public static class C14536a {

        /* renamed from: a */
        public final int f36695a;

        /* renamed from: b */
        public final C20299d f36696b;

        /* renamed from: c */
        public final String f36697c;

        public C14536a(int i, C20299d dVar, String str) {
            this.f36695a = i;
            this.f36696b = dVar;
            this.f36697c = str;
        }
    }

    public C14535a(C13436c cVar, C20839b bVar, ExecutorService executorService, Clock clock, Random random, C20297c cVar2, ConfigFetchHttpClient configFetchHttpClient, C14537b bVar2, HashMap hashMap) {
        this.f36686a = cVar;
        this.f36687b = bVar;
        this.f36688c = executorService;
        this.f36689d = clock;
        this.f36690e = random;
        this.f36691f = cVar2;
        this.f36692g = configFetchHttpClient;
        this.f36693h = bVar2;
        this.f36694i = hashMap;
    }

    /* renamed from: a */
    public final C14536a mo43593a(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        boolean z;
        String str3;
        Long l;
        boolean z2 = false;
        try {
            HttpURLConnection b = this.f36692g.mo43591b();
            ConfigFetchHttpClient configFetchHttpClient = this.f36692g;
            HashMap b2 = mo43594b();
            String string = this.f36693h.f36700a.getString("last_fetch_etag", (String) null);
            Map<String, String> map = this.f36694i;
            C19885a aVar = this.f36687b.get();
            if (aVar == null) {
                l = null;
            } else {
                l = (Long) aVar.mo52169d(true).get("_fot");
            }
            C14536a fetch = configFetchHttpClient.fetch(b, str, str2, b2, string, map, l, date);
            String str4 = fetch.f36697c;
            if (str4 != null) {
                C14537b bVar = this.f36693h;
                synchronized (bVar.f36701b) {
                    bVar.f36700a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f36693h.mo43596b(0, C14537b.f36699e);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int a = e.mo43589a();
            if (a == 429 || a == 502 || a == 503 || a == 504) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = this.f36693h.mo43595a().f36703a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f36685k;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i, iArr.length) - 1]);
                this.f36693h.mo43596b(i, new Date(date.getTime() + (millis / 2) + ((long) this.f36690e.nextInt((int) millis))));
            }
            C14537b.C14538a a2 = this.f36693h.mo43595a();
            int a3 = e.mo43589a();
            if (a2.f36703a > 1 || a3 == 429) {
                z2 = true;
            }
            if (!z2) {
                int a4 = e.mo43589a();
                if (a4 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (a4 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (a4 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (a4 != 500) {
                    switch (a4) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
                throw new FirebaseRemoteConfigServerException(e.mo43589a(), C25541a.m63881k("Fetch failed: ", str3), e);
            }
            throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.", a2.f36704b.getTime());
        }
    }

    /* renamed from: b */
    public final HashMap mo43594b() {
        HashMap hashMap = new HashMap();
        C19885a aVar = this.f36687b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.mo52169d(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }
}
