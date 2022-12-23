package com.facebook.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C2410j0;
import java.util.concurrent.CountDownLatch;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0124u;

/* renamed from: com.facebook.internal.k0 */
public final /* synthetic */ class C2418k0 implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ String[] f8684a;

    /* renamed from: b */
    public final /* synthetic */ int f8685b;

    /* renamed from: c */
    public final /* synthetic */ C2410j0.C2414d f8686c;

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f8687d;

    public /* synthetic */ C2418k0(String[] strArr, int i, C2410j0.C2414d dVar, CountDownLatch countDownLatch) {
        this.f8684a = strArr;
        this.f8685b = i;
        this.f8686c = dVar;
        this.f8687d = countDownLatch;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        String[] strArr = this.f8684a;
        int i = this.f8685b;
        C2410j0.C2414d dVar = this.f8686c;
        CountDownLatch countDownLatch = this.f8687d;
        C24362h.m61211f(strArr, "$results");
        C24362h.m61211f(dVar, "this$0");
        C24362h.m61211f(countDownLatch, "$latch");
        try {
            FacebookRequestError facebookRequestError = uVar.f366c;
            String str = "Error staging photo.";
            if (facebookRequestError != null) {
                String b = facebookRequestError.mo11894b();
                if (b != null) {
                    str = b;
                }
                throw new FacebookGraphResponseException(uVar, str);
            }
            JSONObject jSONObject = uVar.f365b;
            if (jSONObject != null) {
                String optString = jSONObject.optString("uri");
                if (optString != null) {
                    strArr[i] = optString;
                    countDownLatch.countDown();
                    return;
                }
                throw new FacebookException(str);
            }
            throw new FacebookException(str);
        } catch (Exception e) {
            dVar.f8680c[i] = e;
        }
    }
}
