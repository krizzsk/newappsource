package p304x;

import androidx.room.C1257b;
import java.util.concurrent.Executor;
import p066e0.C4424e;
import p217q2.C6161j;
import p269u2.C6684e;
import p304x.C7090q;
import p910xf.C20482k;
import p910xf.C20488n;

/* renamed from: x.j */
public final /* synthetic */ class C7064j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21962b;

    /* renamed from: c */
    public final /* synthetic */ Object f21963c;

    /* renamed from: d */
    public final /* synthetic */ Object f21964d;

    /* renamed from: e */
    public final /* synthetic */ Object f21965e;

    public /* synthetic */ C7064j(int i, Object obj, Object obj2, Object obj3) {
        this.f21962b = i;
        this.f21963c = obj;
        this.f21964d = obj2;
        this.f21965e = obj3;
    }

    public final void run() {
        switch (this.f21962b) {
            case 0:
                C4424e eVar = (C4424e) this.f21965e;
                C7090q.C7091a aVar = ((C7090q) this.f21963c).f22057x;
                aVar.f22058a.add(eVar);
                aVar.f22059b.put(eVar, (Executor) this.f21964d);
                return;
            case 1:
                ((C1257b) this.f21963c).getClass();
                ((C6684e) this.f21964d).mo22147e();
                Object obj = ((C6161j) this.f21965e).f19534c;
                throw null;
            default:
                ((C20488n) this.f21963c).f51880e.mo19991e(this.f21964d, (C20482k.C20483a) this.f21965e);
                return;
        }
    }
}
