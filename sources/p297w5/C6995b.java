package p297w5;

import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageModalView;

/* renamed from: w5.b */
public final /* synthetic */ class C6995b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppboyInAppMessageModalView f21766b;

    /* renamed from: c */
    public final /* synthetic */ int f21767c;

    /* renamed from: d */
    public final /* synthetic */ int f21768d;

    /* renamed from: e */
    public final /* synthetic */ int f21769e;

    /* renamed from: f */
    public final /* synthetic */ double f21770f;

    public /* synthetic */ C6995b(AppboyInAppMessageModalView appboyInAppMessageModalView, int i, int i2, int i3, double d) {
        this.f21766b = appboyInAppMessageModalView;
        this.f21767c = i;
        this.f21768d = i2;
        this.f21769e = i3;
        this.f21770f = d;
    }

    public final void run() {
        this.f21766b.lambda$resizeGraphicFrameIfAppropriate$1(this.f21767c, this.f21768d, this.f21769e, this.f21770f);
    }
}
