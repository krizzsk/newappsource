package p060d6;

import com.bumptech.glide.load.engine.C2166a;

/* renamed from: d6.b */
public final class C4381b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C2166a f15409b;

    public C4381b(C2166a aVar) {
        this.f15409b = aVar;
    }

    public final void run() {
        C2166a aVar = this.f15409b;
        aVar.getClass();
        while (true) {
            try {
                aVar.mo10952b((C2166a.C2167a) aVar.f7028d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
