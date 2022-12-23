package p304x;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: x.v1 */
public final /* synthetic */ class C7111v1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C7115w1 f22100b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f22101c;

    /* renamed from: d */
    public final /* synthetic */ boolean f22102d;

    public /* synthetic */ C7111v1(C7115w1 w1Var, CallbackToFutureAdapter.C0673a aVar, boolean z) {
        this.f22100b = w1Var;
        this.f22101c = aVar;
        this.f22102d = z;
    }

    public final void run() {
        this.f22100b.mo23370a(this.f22101c, this.f22102d);
    }
}
