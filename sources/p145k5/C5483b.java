package p145k5;

import com.appboy.Appboy;
import com.appboy.models.outgoing.AppboyProperties;
import java.math.BigDecimal;

/* renamed from: k5.b */
public final /* synthetic */ class C5483b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Appboy f18001b;

    /* renamed from: c */
    public final /* synthetic */ String f18002c;

    /* renamed from: d */
    public final /* synthetic */ String f18003d;

    /* renamed from: e */
    public final /* synthetic */ BigDecimal f18004e;

    /* renamed from: f */
    public final /* synthetic */ int f18005f;

    /* renamed from: g */
    public final /* synthetic */ AppboyProperties f18006g;

    public /* synthetic */ C5483b(Appboy appboy, String str, String str2, BigDecimal bigDecimal, int i, AppboyProperties appboyProperties) {
        this.f18001b = appboy;
        this.f18002c = str;
        this.f18003d = str2;
        this.f18004e = bigDecimal;
        this.f18005f = i;
        this.f18006g = appboyProperties;
    }

    public final void run() {
        this.f18001b.m5393a(this.f18002c, this.f18003d, this.f18004e, this.f18005f, this.f18006g);
    }
}
