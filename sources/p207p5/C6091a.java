package p207p5;

import com.appboy.p044ui.contentcards.AppboyCardAdapter;

/* renamed from: p5.a */
public final /* synthetic */ class C6091a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppboyCardAdapter f19347b;

    /* renamed from: c */
    public final /* synthetic */ int f19348c;

    /* renamed from: d */
    public final /* synthetic */ int f19349d;

    public /* synthetic */ C6091a(AppboyCardAdapter appboyCardAdapter, int i, int i2) {
        this.f19347b = appboyCardAdapter;
        this.f19348c = i;
        this.f19349d = i2;
    }

    public final void run() {
        this.f19347b.lambda$markOnScreenCardsAsRead$1(this.f19348c, this.f19349d);
    }
}
