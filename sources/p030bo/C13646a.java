package p030bo;

import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import hi0.C23521b0;
import hi0.C23556q;
import hi0.C23562t;
import hi0.C23566v;
import hi0.C23569w;
import hi0.C23571x;
import hi0.C23574z;
import java.util.Collections;
import java.util.Map;
import p030bo.C13649c;
import p411cm.C13845c;

/* renamed from: bo.a */
public final class C13646a implements C13648b {

    /* renamed from: a */
    public final C23566v f33680a;

    /* renamed from: b */
    public final C13649c.C13650a f33681b;

    /* renamed from: bo.a$a */
    public static /* synthetic */ class C13647a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33682a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.masabi.justride.sdk.internal.models.network.HttpMethod[] r0 = com.masabi.justride.sdk.internal.models.network.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33682a = r0
                com.masabi.justride.sdk.internal.models.network.HttpMethod r1 = com.masabi.justride.sdk.internal.models.network.HttpMethod.DELETE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33682a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.masabi.justride.sdk.internal.models.network.HttpMethod r1 = com.masabi.justride.sdk.internal.models.network.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33682a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.masabi.justride.sdk.internal.models.network.HttpMethod r1 = com.masabi.justride.sdk.internal.models.network.HttpMethod.PUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33682a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.masabi.justride.sdk.internal.models.network.HttpMethod r1 = com.masabi.justride.sdk.internal.models.network.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.C13646a.C13647a.<clinit>():void");
        }
    }

    public C13646a(C23566v vVar, C13649c.C13650a aVar) {
        this.f33680a = vVar;
        this.f33681b = aVar;
    }

    /* renamed from: a */
    public final void mo40531a(String str, HttpMethod httpMethod, Map<String, String> map, Map<String, String> map2, byte[] bArr, C13845c cVar) {
        C23562t tVar;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        Uri build = buildUpon.build();
        if (map2.containsKey(HttpHeader.CONTENT_TYPE)) {
            C23571x.C23572a aVar = new C23571x.C23572a();
            aVar.mo58731e(build.toString());
            String[] strArr = new String[(map2.size() * 2)];
            int i = 0;
            for (Map.Entry next2 : map2.entrySet()) {
                if (next2.getKey() == null || next2.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) next2.getKey()).trim();
                String trim2 = ((String) next2.getValue()).trim();
                C23556q.m57707a(trim);
                C23556q.m57708b(trim2, trim);
                strArr[i] = trim;
                strArr[i + 1] = trim2;
                i += 2;
            }
            C23556q.C23557a aVar2 = new C23556q.C23557a();
            Collections.addAll(aVar2.f59532a, strArr);
            aVar.f59644c = aVar2;
            String str2 = map2.get(HttpHeader.CONTENT_TYPE);
            if (str2 != null) {
                tVar = C23562t.m57743c(str2);
            } else {
                tVar = null;
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            C23574z c = C23521b0.m57646c(tVar, bArr);
            int i2 = C13647a.f33682a[httpMethod.ordinal()];
            if (i2 == 1) {
                aVar.mo58728b("DELETE", c);
            } else if (i2 == 2) {
                aVar.mo58728b("POST", c);
            } else if (i2 == 3) {
                aVar.mo58728b("PUT", c);
            } else if (i2 == 4) {
                aVar.mo58728b("GET", (C23521b0) null);
            }
            C23571x a = aVar.mo58727a();
            C13649c cVar2 = new C13649c(cVar, this.f33681b.f33685a);
            C23566v vVar = this.f33680a;
            vVar.getClass();
            FirebasePerfOkHttpClient.enqueue(C23569w.m57753i(vVar, a, false), cVar2);
            return;
        }
        throw new JustRideSdkException("You must supply a Content-Type header");
    }
}
