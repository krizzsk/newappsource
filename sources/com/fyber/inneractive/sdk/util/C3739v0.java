package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.model.vast.C2841h;

/* renamed from: com.fyber.inneractive.sdk.util.v0 */
public class C3739v0 {
    /* renamed from: a */
    public static boolean m10004a(String str, C2841h hVar) {
        String str2;
        if (str != null) {
            str2 = str.substring(str.lastIndexOf(".") + 1);
        } else {
            str2 = "";
        }
        String str3 = hVar.toString();
        if (str3.equalsIgnoreCase(str2)) {
            return true;
        }
        if (!str2.equals("jpeg") && !str2.equals("jpg")) {
            return false;
        }
        if (str3.equals("Jpeg") || str3.equals("Jpg")) {
            return true;
        }
        return false;
    }
}
