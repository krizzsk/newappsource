package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.cache.a */
public class C2953a {

    /* renamed from: a */
    public File f10107a;

    /* renamed from: b */
    public String f10108b;

    /* renamed from: c */
    public boolean f10109c;

    /* renamed from: d */
    public Object f10110d = new Object();

    /* renamed from: e */
    public Map<String, String> f10111e = new HashMap();

    /* renamed from: f */
    public volatile boolean f10112f = false;

    public C2953a(String str, String str2, File file, boolean z, String str3) {
        this.f10107a = file;
        this.f10108b = str2;
        this.f10109c = z;
    }

    /* renamed from: a */
    public File mo13752a() {
        File file;
        synchronized (this.f10110d) {
            file = this.f10107a;
        }
        return file;
    }
}
