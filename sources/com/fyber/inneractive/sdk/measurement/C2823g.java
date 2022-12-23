package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C2807y;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.response.C3650g;
import com.google.android.play.core.appupdate.C14226d;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p699oh.C18748a;
import p699oh.C18749b;
import p699oh.C18753f;
import p723ph.C18923a;

/* renamed from: com.fyber.inneractive.sdk.measurement.g */
public class C2823g {

    /* renamed from: a */
    public C18749b f9690a;

    /* renamed from: b */
    public C18748a f9691b;

    /* renamed from: c */
    public C18923a f9692c;

    /* renamed from: d */
    public boolean f9693d = false;

    /* renamed from: e */
    public boolean f9694e = false;

    /* renamed from: f */
    public C2807y f9695f;

    /* renamed from: a */
    public final void mo13612a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", new Object[]{"OpenMeasurementNativeVideoTracker", th.getMessage()});
        C2807y yVar = this.f9695f;
        C3650g gVar = null;
        InneractiveAdRequest inneractiveAdRequest = yVar != null ? yVar.f9590a : null;
        if (yVar != null) {
            gVar = (C3650g) yVar.f9591b;
        }
        C2931r.m7253a(simpleName, format, inneractiveAdRequest, gVar);
    }

    /* renamed from: a */
    public final List<C18753f> mo13611a(List<C2825i> list) {
        ArrayList arrayList = new ArrayList();
        for (C2825i next : list) {
            C18753f fVar = null;
            try {
                if (next.f9698a != null) {
                    if (!TextUtils.isEmpty(next.f9702e)) {
                        if (!TextUtils.isEmpty(next.f9701d)) {
                            String str = next.f9702e;
                            URL url = next.f9698a;
                            String str2 = next.f9701d;
                            C14226d.m35348n0(str, "VendorKey is null or empty");
                            C14226d.m35346l0(url, "ResourceURL is null");
                            C14226d.m35348n0(str2, "VerificationParameters is null or empty");
                            fVar = new C18753f(str, url, str2);
                        }
                    }
                    URL url2 = next.f9698a;
                    C14226d.m35346l0(url2, "ResourceURL is null");
                    fVar = new C18753f((String) null, url2, (String) null);
                }
            } catch (Throwable th) {
                mo13612a(th);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }
}
