package com.usebutton.sdk.internal;

import android.webkit.CookieManager;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.InvalidCookieException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class RestrictedDomainManager {
    private static final String TAG = "RestrictedDomainManager";
    private final CookieManager cookieManager;
    private List<String> restrictedDomains = Collections.singletonList(".linksynergy.com");

    public RestrictedDomainManager(CookieManager cookieManager2) {
        this.cookieManager = cookieManager2;
    }

    public void clearCookies(Set<String> set) {
        ArrayList<String> arrayList = new ArrayList<>(this.restrictedDomains);
        if (set != null) {
            arrayList = new ArrayList<>(set);
        }
        for (String str : arrayList) {
            String cookie = this.cookieManager.getCookie(str);
            try {
                for (Map.Entry next : parseCookies(cookie).entrySet()) {
                    ButtonLog.verboseFormat(TAG, "Deleting Cookie: %s", next);
                    CookieManager cookieManager2 = this.cookieManager;
                    cookieManager2.setCookie(str, ((String) next.getKey()) + "=;expires=Tue, 1 Jun 1993 00:00:00 UTC;");
                }
            } catch (InvalidCookieException e) {
                ButtonLog.warn(TAG, String.format("Invalid CookieString: %s Domain: %s", new Object[]{cookie, str}), e);
            }
        }
    }

    public Map<String, String> parseCookies(String str) throws InvalidCookieException {
        String str2;
        HashMap hashMap = new HashMap();
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(";");
            int i = 0;
            while (i < split.length) {
                String[] split2 = split[i].split("=");
                if (split2.length % 2 == 0) {
                    String str3 = "";
                    if (split2.length > 0) {
                        str2 = split2[0];
                    } else {
                        str2 = str3;
                    }
                    if (split2.length > 1) {
                        str3 = split2[1];
                    }
                    hashMap.put(str2.trim(), str3);
                    i++;
                } else {
                    throw new InvalidCookieException();
                }
            }
        }
        return hashMap;
    }
}
