package p880vx;

import android.content.Context;
import android.location.Location;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import java.util.concurrent.TimeUnit;
import p716oy.C18860a;
import p824tp.C19722a0;
import p858uz.C20059f;
import p858uz.C20061g;
import p977zz.C20944i0;
import z20.C20806a;

/* renamed from: vx.a */
public abstract class C20243a extends UserContextLoader {

    /* renamed from: e */
    public static final long f51348e = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: f */
    public static final /* synthetic */ int f51349f = 0;

    /* renamed from: c */
    public ServerId f51350c = C18860a.m45884a().f48013a;

    /* renamed from: d */
    public boolean f51351d = false;

    /* renamed from: o */
    public static LatLonE6 m47812o(Context context, C20061g gVar) throws Exception {
        C16202a.C16203a locationSettings = C16202a.get(context).getLocationSettings();
        if (!locationSettings.mo48507a() || !locationSettings.mo48509c()) {
            return null;
        }
        C20059f.C20060a aVar = new C20059f.C20060a();
        gVar.mo50015m(aVar);
        C20944i0 a = aVar.mo53033a(f51348e);
        if (((Boolean) a.f52692a).booleanValue()) {
            return LatLonE6.m40177j((Location) a.f52693b);
        }
        gVar.mo50904b(aVar);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0 != null) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y90.C13272f mo46741k(c70.C13752e r7) throws java.io.IOException, com.moovit.commons.appdata.AppDataPartLoadFailedException, com.moovit.commons.request.ServerException {
        /*
            r6 = this;
            com.moovit.network.model.ServerId r0 = r6.f51350c
            r1 = 0
            if (r0 == 0) goto L_0x000e
            vx.c r0 = new vx.c
            com.moovit.network.model.ServerId r2 = r6.f51350c
            r0.<init>(r2, r7)
            goto L_0x00a7
        L_0x000e:
            c10.d r0 = c10.C13743d.f33820d
            com.moovit.network.model.ServerId r2 = r0.mo40666b()
            if (r2 == 0) goto L_0x001d
            vx.c r0 = new vx.c
            r0.<init>(r2, r7)
            goto L_0x00a7
        L_0x001d:
            com.moovit.commons.geo.LatLonE6 r0 = r0.mo40665a()
            if (r0 == 0) goto L_0x002b
            vx.c r2 = new vx.c
            r2.<init>(r0, r1, r7)
        L_0x0028:
            r0 = r2
            goto L_0x00a7
        L_0x002b:
            android.content.Context r0 = r7.f33852a
            boolean r2 = p977zz.C20934d0.m49032c(r0)
            boolean r3 = r6.f51351d
            if (r3 != 0) goto L_0x0040
            if (r2 == 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            com.moovit.commons.appdata.AppDataPartLoadFailedException r7 = new com.moovit.commons.appdata.AppDataPartLoadFailedException
            com.moovit.appdata.UserContextLoader$FailureReason r0 = com.moovit.appdata.UserContextLoader.FailureReason.LOCATION_PERMISSION_MISSING
            r7.<init>(r0, r1, r1)
            throw r7
        L_0x0040:
            if (r2 != 0) goto L_0x0050
            d80.d r3 = new d80.d     // Catch:{ Exception -> 0x0082 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0082 }
            wz.g r0 = r3.mo52626J()     // Catch:{ Exception -> 0x0082 }
            d80.e r0 = (d80.C12602e) r0     // Catch:{ Exception -> 0x0082 }
            com.moovit.commons.geo.LatLonE6 r0 = r0.f31150f     // Catch:{ Exception -> 0x0082 }
            goto L_0x0092
        L_0x0050:
            com.moovit.location.a r3 = com.moovit.location.C16202a.get(r0)     // Catch:{ Exception -> 0x0082 }
            uz.g r3 = r3.getLowAccuracyRareUpdates()     // Catch:{ Exception -> 0x0082 }
            com.google.android.gms.tasks.Task r4 = r3.mo50016n()     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r4 = com.google.android.gms.tasks.Tasks.await(r4)     // Catch:{ Exception -> 0x0082 }
            android.location.Location r4 = (android.location.Location) r4     // Catch:{ Exception -> 0x0082 }
            com.moovit.commons.geo.LatLonE6 r4 = com.moovit.commons.geo.LatLonE6.m40177j(r4)     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x006a
            r0 = r4
            goto L_0x0092
        L_0x006a:
            com.moovit.commons.geo.LatLonE6 r3 = m47812o(r0, r3)     // Catch:{ Exception -> 0x0082 }
            if (r3 == 0) goto L_0x0072
            r0 = r3
            goto L_0x0092
        L_0x0072:
            d80.d r3 = new d80.d     // Catch:{ Exception -> 0x0082 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0082 }
            wz.g r0 = r3.mo52626J()     // Catch:{ Exception -> 0x0082 }
            d80.e r0 = (d80.C12602e) r0     // Catch:{ Exception -> 0x0082 }
            com.moovit.commons.geo.LatLonE6 r0 = r0.f31150f     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0082:
            r0 = move-exception
            de.f r3 = p435de.C16596f.m42113a()
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Failed to obtain a location"
            r4.<init>(r5, r0)
            r3.mo49364c(r4)
        L_0x0091:
            r0 = r1
        L_0x0092:
            if (r0 != 0) goto L_0x00a1
            com.moovit.commons.appdata.AppDataPartLoadFailedException r7 = new com.moovit.commons.appdata.AppDataPartLoadFailedException
            if (r2 == 0) goto L_0x009b
            com.moovit.appdata.UserContextLoader$FailureReason r0 = com.moovit.appdata.UserContextLoader.FailureReason.LOCATION_NOT_DETECTED
            goto L_0x009d
        L_0x009b:
            com.moovit.appdata.UserContextLoader$FailureReason r0 = com.moovit.appdata.UserContextLoader.FailureReason.LOCATION_PERMISSION_MISSING
        L_0x009d:
            r7.<init>(r0, r1, r1)
            throw r7
        L_0x00a1:
            vx.c r2 = new vx.c
            r2.<init>(r0, r1, r7)
            goto L_0x0028
        L_0x00a7:
            wz.g r7 = r0.mo52626J()
            vx.d r7 = (p880vx.C20246d) r7
            y90.f r7 = r7.f51352m
            if (r7 == 0) goto L_0x00b2
            return r7
        L_0x00b2:
            com.moovit.commons.appdata.AppDataPartLoadFailedException r7 = new com.moovit.commons.appdata.AppDataPartLoadFailedException
            com.moovit.appdata.UserContextLoader$FailureReason r0 = com.moovit.appdata.UserContextLoader.FailureReason.UNSUPPORTED_METRO
            r7.<init>(r0, r1, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p880vx.C20243a.mo46741k(c70.e):y90.f");
    }

    /* renamed from: n */
    public void mo46742n(Context context, C19722a0 a0Var) {
        super.mo46742n(context, a0Var);
        new C20806a.C20807a("install_se").mo52935c();
    }
}
