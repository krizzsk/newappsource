package ld0;

import com.appsflyer.ServerParameters;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import mf0.C24361g;
import od0.C24554e;
import p359ag.C13452i;
import qd0.C24726b;
import qd0.C24727c;
import qd0.C24728d;
import qd0.C24732e;

/* renamed from: ld0.b */
public final class C24221b implements C24220a {

    /* renamed from: d */
    public static final /* synthetic */ int f61525d = 0;

    /* renamed from: b */
    public final VungleApiClient f61526b;

    /* renamed from: c */
    public final C23192a f61527c;

    /* renamed from: ld0.b$a */
    public class C24222a implements C24726b<C13452i> {
        /* renamed from: a */
        public final void mo58057a(C24732e eVar) {
            int i = C24221b.f61525d;
        }

        public final void onFailure(Throwable th) {
            int i = C24221b.f61525d;
        }
    }

    public C24221b(VungleApiClient vungleApiClient, C23192a aVar) {
        this.f61526b = vungleApiClient;
        this.f61527c = aVar;
    }

    /* renamed from: a */
    public final String[] mo19955a() {
        List list = this.f61527c.mo58282q(C24554e.class).get();
        if (list == null || list.size() <= 0) {
            return new String[0];
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((C24554e) list.get(i)).f62236a;
        }
        return mo19956b(strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r7.f61527c.mo58271f(new od0.C24554e(r4));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] mo19956b(java.lang.String[] r8) {
        /*
            r7 = this;
            int r0 = r8.length
            if (r0 != 0) goto L_0x0004
            return r8
        L_0x0004:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x003a
            r4 = r8[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0037
            com.vungle.warren.VungleApiClient r5 = r7.f61526b     // Catch:{ MalformedURLException -> 0x002d }
            boolean r5 = r5.mo58081j(r4)     // Catch:{ MalformedURLException -> 0x002d }
            if (r5 != 0) goto L_0x0022
            r0.add(r4)     // Catch:{ MalformedURLException -> 0x002d }
            goto L_0x0037
        L_0x0022:
            com.vungle.warren.persistence.a r5 = r7.f61527c     // Catch:{ MalformedURLException -> 0x002d }
            od0.e r6 = new od0.e     // Catch:{ MalformedURLException -> 0x002d }
            r6.<init>(r4)     // Catch:{ MalformedURLException -> 0x002d }
            r5.mo58271f(r6)     // Catch:{ MalformedURLException -> 0x002d }
            goto L_0x0037
        L_0x002d:
            com.vungle.warren.persistence.a r5 = r7.f61527c     // Catch:{ ClearTextTrafficException | DBException -> 0x0037 }
            od0.e r6 = new od0.e     // Catch:{ ClearTextTrafficException | DBException -> 0x0037 }
            r6.<init>(r4)     // Catch:{ ClearTextTrafficException | DBException -> 0x0037 }
            r5.mo58271f(r6)     // Catch:{ ClearTextTrafficException | DBException -> 0x0037 }
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x003a:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ld0.C24221b.mo19956b(java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: c */
    public final void mo19957c(C13452i iVar) {
        VungleApiClient vungleApiClient = this.f61526b;
        if (vungleApiClient.f58571h != null) {
            C13452i iVar2 = new C13452i();
            iVar2.mo40346C(vungleApiClient.mo58076d(false), ServerParameters.DEVICE_KEY);
            iVar2.mo40346C(vungleApiClient.f58576m, "app");
            iVar2.mo40346C(iVar, "request");
            iVar2.mo40346C(vungleApiClient.mo58079h(), "user");
            C13452i e = vungleApiClient.mo58077e();
            if (e != null) {
                iVar2.mo40346C(e, "ext");
            }
            C24728d b = vungleApiClient.f58566c.mo61220b(VungleApiClient.f58560C, vungleApiClient.f58571h, iVar2);
            FirebasePerfOkHttpClient.enqueue(b.f62595b, new C24727c(b, new C24222a()));
            return;
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: d */
    public final void mo19958d(String[] strArr) {
        boolean z;
        for (String str : strArr) {
            int i = C24361g.f61675d;
            try {
                z = new URL(str).getHost().toLowerCase().contains(".vungle.com");
            } catch (MalformedURLException e) {
                e.getMessage();
                z = false;
            }
            if (z) {
                try {
                    this.f61527c.mo58288w(new C24554e(str));
                } catch (DatabaseHelper.DBException unused) {
                }
            }
        }
    }
}
