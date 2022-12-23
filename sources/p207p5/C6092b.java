package p207p5;

import com.appboy.p044ui.contentcards.AppboyCardAdapter;

/* renamed from: p5.b */
public final /* synthetic */ class C6092b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppboyCardAdapter f19350b;

    /* renamed from: c */
    public final /* synthetic */ int f19351c;

    public /* synthetic */ C6092b(AppboyCardAdapter appboyCardAdapter, int i) {
        this.f19350b = appboyCardAdapter;
        this.f19351c = i;
    }

    public final void run() {
        this.f19350b.lambda$onViewDetachedFromWindow$0(this.f19351c);
    }
}
