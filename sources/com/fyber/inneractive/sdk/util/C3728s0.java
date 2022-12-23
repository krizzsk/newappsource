package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.s0 */
public class C3728s0 implements Comparable<C3728s0> {

    /* renamed from: a */
    public C3729a f12917a;

    /* renamed from: b */
    public Uri f12918b;

    /* renamed from: c */
    public List<String> f12919c;

    /* renamed from: com.fyber.inneractive.sdk.util.s0$a */
    public enum C3729a {
        Primary(1),
        FallBack(2);
        

        /* renamed from: a */
        public Integer f12923a;

        /* access modifiers changed from: public */
        C3729a(Integer num) {
            this.f12923a = num;
        }
    }

    public C3728s0(C3729a aVar, Uri uri, List<String> list) {
        this.f12917a = aVar;
        this.f12918b = uri;
        this.f12919c = list;
    }

    public int compareTo(Object obj) {
        return this.f12917a.f12923a.compareTo(((C3728s0) obj).f12917a.f12923a);
    }
}
