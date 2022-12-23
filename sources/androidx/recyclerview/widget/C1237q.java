package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1227p;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
public final class C1237q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1227p.C1235f f4670b;

    /* renamed from: c */
    public final /* synthetic */ int f4671c;

    /* renamed from: d */
    public final /* synthetic */ C1227p f4672d;

    public C1237q(C1227p pVar, C1227p.C1235f fVar, int i) {
        this.f4672d = pVar;
        this.f4670b = fVar;
        this.f4671c = i;
    }

    public final void run() {
        RecyclerView recyclerView = this.f4672d.f4642s;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            C1227p.C1235f fVar = this.f4670b;
            if (!fVar.f4667k && fVar.f4661e.getAbsoluteAdapterPosition() != -1) {
                RecyclerView.C1128j itemAnimator = this.f4672d.f4642s.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo4778h()) {
                    C1227p pVar = this.f4672d;
                    int size = pVar.f4640q.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (!((C1227p.C1235f) pVar.f4640q.get(i)).f4668l) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        this.f4672d.f4637n.onSwiped(this.f4670b.f4661e, this.f4671c);
                        return;
                    }
                }
                this.f4672d.f4642s.post(this);
            }
        }
    }
}
