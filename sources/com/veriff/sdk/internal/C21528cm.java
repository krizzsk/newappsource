package com.veriff.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21525cl;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.veriff.sdk.internal.cm */
public class C21528cm {

    /* renamed from: a */
    private static final AtomicInteger f54176a = new AtomicInteger();

    /* renamed from: b */
    private final C21512ci f54177b;

    /* renamed from: c */
    private final C21525cl.C21527a f54178c;

    /* renamed from: e */
    private boolean f54179e;

    /* renamed from: f */
    private boolean f54180f = true;

    /* renamed from: g */
    private int f54181g;

    /* renamed from: m */
    private Object f54182m;

    public C21528cm(C21512ci ciVar, Uri uri, int i) {
        ciVar.getClass();
        this.f54177b = ciVar;
        this.f54178c = new C21525cl.C21527a(uri, i, ciVar.f54117j);
    }

    /* renamed from: c */
    private Drawable m51453c() {
        int i = this.f54181g;
        if (i != 0) {
            return this.f54177b.f54110c.getDrawable(i);
        }
        return null;
    }

    /* renamed from: a */
    public C21528cm mo54525a(int i) {
        if (!this.f54180f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i != 0) {
            this.f54181g = i;
            return this;
        } else {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
    }

    /* renamed from: b */
    public C21528cm mo54529b() {
        this.f54182m = null;
        return this;
    }

    /* renamed from: a */
    public C21528cm mo54524a() {
        this.f54179e = false;
        return this;
    }

    /* renamed from: a */
    public C21528cm mo54526a(int i, int i2) {
        this.f54178c.mo54520a(i, i2);
        return this;
    }

    /* renamed from: a */
    public void mo54527a(ImageView imageView) {
        mo54528a(imageView, (C21487bt) null);
    }

    /* renamed from: a */
    public void mo54528a(ImageView imageView, C21487bt btVar) {
        Bitmap a;
        ImageView imageView2 = imageView;
        C21487bt btVar2 = btVar;
        long nanoTime = System.nanoTime();
        C21537cs.m51503a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f54178c.mo54521a()) {
            this.f54177b.mo54489a(imageView2);
            if (this.f54180f) {
                C21522cj.m51437a(imageView2, m51453c());
            }
        } else {
            if (this.f54179e) {
                if (!this.f54178c.mo54522b()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f54180f) {
                            C21522cj.m51437a(imageView2, m51453c());
                        }
                        this.f54177b.mo54490a(imageView2, new C21490bw(this, imageView2, btVar2));
                        return;
                    }
                    this.f54178c.mo54520a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C21525cl a2 = m51452a(nanoTime);
            String a3 = C21537cs.m51501a(a2);
            if (!C21506ce.m51404a(0) || (a = this.f54177b.mo54485a(a3)) == null) {
                if (this.f54180f) {
                    C21522cj.m51437a(imageView2, m51453c());
                }
                this.f54177b.mo54491a((C21476bp) new C21499ca(this.f54177b, imageView, a2, 0, 0, 0, (Drawable) null, a3, this.f54182m, btVar, false));
                return;
            }
            this.f54177b.mo54489a(imageView2);
            C21512ci ciVar = this.f54177b;
            Context context = ciVar.f54110c;
            C21512ci.C21518d dVar = C21512ci.C21518d.MEMORY;
            C21522cj.m51436a(imageView, context, a, dVar, false, ciVar.f54118k);
            if (this.f54177b.f54119l) {
                String b = a2.mo54513b();
                C21537cs.m51506a("Main", "completed", b, "from " + dVar);
            }
            if (btVar2 != null) {
                btVar.mo54437a();
            }
        }
    }

    /* renamed from: a */
    private C21525cl m51452a(long j) {
        int andIncrement = f54176a.getAndIncrement();
        C21525cl c = this.f54178c.mo54523c();
        c.f54151a = andIncrement;
        c.f54152b = j;
        boolean z = this.f54177b.f54119l;
        if (z) {
            C21537cs.m51506a("Main", "created", c.mo54513b(), c.toString());
        }
        C21525cl a = this.f54177b.mo54486a(c);
        if (a != c) {
            a.f54151a = andIncrement;
            a.f54152b = j;
            if (z) {
                String a2 = a.mo54512a();
                C21537cs.m51506a("Main", "changed", a2, "into " + a);
            }
        }
        return a;
    }
}
