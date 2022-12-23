package p066e0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import p030bo.app.C1623k6;
import p030bo.app.C1710v4;
import p030bo.app.C1721w5;
import p695od.C18728c;

/* renamed from: e0.t */
public final /* synthetic */ class C4456t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15521b;

    /* renamed from: c */
    public final /* synthetic */ long f15522c;

    /* renamed from: d */
    public final /* synthetic */ Object f15523d;

    /* renamed from: e */
    public final /* synthetic */ Object f15524e;

    /* renamed from: f */
    public final /* synthetic */ Object f15525f;

    public /* synthetic */ C4456t(Object obj, Object obj2, Object obj3, long j, int i) {
        this.f15521b = i;
        this.f15523d = obj;
        this.f15524e = obj2;
        this.f15525f = obj3;
        this.f15522c = j;
    }

    public final void run() {
        switch (this.f15521b) {
            case 0:
                ((Executor) this.f15523d).execute(new C4453r((C18728c) this.f15524e, (CallbackToFutureAdapter.C0673a) this.f15525f, this.f15522c));
                return;
            default:
                ((C1623k6) this.f15523d).m4412b((C1710v4) this.f15524e, (C1721w5) this.f15525f, this.f15522c);
                return;
        }
    }
}
