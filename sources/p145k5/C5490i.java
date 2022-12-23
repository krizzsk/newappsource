package p145k5;

import android.widget.ImageView;
import com.appboy.Appboy;
import com.google.firebase.installations.C14459a;
import com.umo.ads.p348o.zzc;
import mf0.C24362h;

/* renamed from: k5.i */
public final /* synthetic */ class C5490i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18025b;

    /* renamed from: c */
    public final /* synthetic */ boolean f18026c;

    /* renamed from: d */
    public final /* synthetic */ Object f18027d;

    public /* synthetic */ C5490i(int i, Object obj, boolean z) {
        this.f18025b = i;
        this.f18027d = obj;
        this.f18026c = z;
    }

    public final void run() {
        int i;
        switch (this.f18025b) {
            case 0:
                ((Appboy) this.f18027d).m5409c(this.f18026c);
                return;
            case 1:
                boolean z = this.f18026c;
                Object obj = C14459a.f36530m;
                ((C14459a) this.f18027d).mo43365a(z);
                return;
            default:
                zzc zzc = (zzc) this.f18027d;
                boolean z2 = this.f18026c;
                C24362h.m61211f(zzc, "this$0");
                ImageView imageView = zzc.f30864t;
                int i2 = 8;
                if (imageView != null) {
                    if (z2) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    imageView.setVisibility(i);
                }
                ImageView imageView2 = zzc.f30865u;
                if (imageView2 != null) {
                    if (z2) {
                        i2 = 0;
                    }
                    imageView2.setVisibility(i2);
                    return;
                }
                return;
        }
    }
}
