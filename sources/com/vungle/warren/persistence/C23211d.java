package com.vungle.warren.persistence;

import com.vungle.warren.persistence.C23192a;

/* renamed from: com.vungle.warren.persistence.d */
public final class C23211d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f58911b;

    /* renamed from: c */
    public final /* synthetic */ Class f58912c;

    /* renamed from: d */
    public final /* synthetic */ C23192a.C23206m f58913d;

    /* renamed from: e */
    public final /* synthetic */ C23192a f58914e;

    /* renamed from: com.vungle.warren.persistence.d$a */
    public class C23212a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f58915b;

        public C23212a(Object obj) {
            this.f58915b = obj;
        }

        public final void run() {
            C23211d.this.f58913d.mo58063a(this.f58915b);
        }
    }

    public C23211d(C23192a aVar, String str, Class cls, C23192a.C23206m mVar) {
        this.f58914e = aVar;
        this.f58911b = str;
        this.f58912c = cls;
        this.f58913d = mVar;
    }

    public final void run() {
        this.f58914e.f58876c.execute(new C23212a(C23192a.m57219a(this.f58914e, this.f58912c, this.f58911b)));
    }
}
