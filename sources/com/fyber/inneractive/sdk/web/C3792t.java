package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.web.t */
public class C3792t {

    /* renamed from: a */
    public final String f13073a;

    /* renamed from: b */
    public final String f13074b;

    /* renamed from: c */
    public final Map<String, String> f13075c;

    public C3792t(WebResourceRequest webResourceRequest) {
        Map<String, String> map;
        this.f13073a = webResourceRequest.getUrl().toString();
        this.f13074b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            map = Collections.emptyMap();
        } else {
            map = webResourceRequest.getRequestHeaders();
        }
        this.f13075c = new HashMap(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3792t.class != obj.getClass()) {
            return false;
        }
        C3792t tVar = (C3792t) obj;
        if (this.f13073a.equals(tVar.f13073a) && this.f13074b.equals(tVar.f13074b)) {
            return this.f13075c.equals(tVar.f13075c);
        }
        return false;
    }

    public int hashCode() {
        return this.f13075c.hashCode() + C13715c.m34238d(this.f13074b, this.f13073a.hashCode() * 31, 31);
    }
}
