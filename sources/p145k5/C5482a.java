package p145k5;

import com.appboy.Appboy;

/* renamed from: k5.a */
public final /* synthetic */ class C5482a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Appboy f17998b;

    /* renamed from: c */
    public final /* synthetic */ double f17999c;

    /* renamed from: d */
    public final /* synthetic */ double f18000d;

    public /* synthetic */ C5482a(Appboy appboy, double d, double d2) {
        this.f17998b = appboy;
        this.f17999c = d;
        this.f18000d = d2;
    }

    public final void run() {
        this.f17998b.m5381a(this.f17999c, this.f18000d);
    }
}
