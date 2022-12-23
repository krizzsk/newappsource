package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.appsflyer.ServerParameters;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.HashSet;
import kotlin.collections.C23825c;
import mf0.C24362h;
import p583jk.C17884p;
import uh0.C25081h;

/* renamed from: com.facebook.internal.o */
public final class C2424o {

    /* renamed from: a */
    public static final HashSet<String> f8697a = C17884p.m44336G("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    /* renamed from: a */
    public static final boolean m6376a(Context context, String str) {
        boolean z;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        C24362h.m61210e(str2, ServerParameters.BRAND);
        if (C25081h.m62835F(str2, "generic") && (i & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null) {
                if (signatureArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C24362h.m61210e(signatureArr, "packageInfo.signatures");
                    int length = signatureArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Signature signature = signatureArr[i2];
                        HashSet<String> hashSet = f8697a;
                        C2397f0 f0Var = C2397f0.f8630a;
                        byte[] byteArray = signature.toByteArray();
                        C24362h.m61210e(byteArray, "it.toByteArray()");
                        C2397f0.f8630a.getClass();
                        if (C23825c.m58507d0(hashSet, C2397f0.m6327u("SHA-1", byteArray))) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
