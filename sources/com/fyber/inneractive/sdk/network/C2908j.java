package com.fyber.inneractive.sdk.network;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.j */
public class C2908j {

    /* renamed from: a */
    public int f9920a;

    /* renamed from: b */
    public String f9921b;

    /* renamed from: c */
    public InputStream f9922c;

    /* renamed from: d */
    public Map<String, List<String>> f9923d;

    /* renamed from: e */
    public String f9924e;

    public C2908j() {
    }

    /* renamed from: a */
    public void mo13707a(InputStream inputStream) {
        this.f9922c = inputStream;
    }

    public C2908j(InputStream inputStream, int i, String str, Map<String, List<String>> map, String str2) {
        this.f9922c = inputStream;
        this.f9920a = i;
        this.f9921b = str;
        this.f9923d = map;
        this.f9924e = str2;
    }

    /* renamed from: a */
    public void mo13706a(int i) {
        this.f9920a = i;
    }

    /* renamed from: a */
    public void mo13709a(Map<String, List<String>> map) {
        this.f9923d = map;
    }

    /* renamed from: a */
    public void mo13708a(String str) {
        this.f9924e = str;
    }

    /* renamed from: a */
    public void mo13704a() throws IOException {
        InputStream inputStream = this.f9922c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
