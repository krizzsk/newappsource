package p125ia;

import android.view.View;
import com.google.android.exoplayer2.audio.C3876a;
import mf0.C24362h;
import p277ub.C6774a0;

/* renamed from: ia.i */
public final /* synthetic */ class C5322i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f17528b;

    /* renamed from: c */
    public final /* synthetic */ boolean f17529c;

    /* renamed from: d */
    public final /* synthetic */ Object f17530d;

    public /* synthetic */ C5322i(int i, Object obj, boolean z) {
        this.f17528b = i;
        this.f17530d = obj;
        this.f17529c = z;
    }

    public final void run() {
        float f;
        switch (this.f17528b) {
            case 0:
                boolean z = this.f17529c;
                C3876a aVar = ((C3876a.C3877a) this.f17530d).f13480b;
                int i = C6774a0.f20959a;
                aVar.mo15874d(z);
                return;
            default:
                View view = (View) this.f17530d;
                boolean z2 = this.f17529c;
                C24362h.m61211f(view, "$view");
                view.setEnabled(z2);
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                view.setAlpha(f);
                return;
        }
    }
}
