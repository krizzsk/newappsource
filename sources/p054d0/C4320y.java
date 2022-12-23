package p054d0;

import androidx.camera.core.C0608j;
import androidx.camera.core.C0627p;
import com.google.android.play.core.appupdate.C14226d;
import p066e0.C4462z;
import p102h0.C5018c;
import p102h0.C5023g;

/* renamed from: d0.y */
public final class C4320y extends C0608j {

    /* renamed from: d0.y$a */
    public class C4321a implements C5018c<Void> {

        /* renamed from: a */
        public final /* synthetic */ C0627p f15298a;

        public C4321a(C0627p pVar) {
            this.f15298a = pVar;
        }

        public final void onFailure(Throwable th) {
            this.f15298a.close();
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* renamed from: a */
    public final C0627p mo2536a(C4462z zVar) {
        return zVar.acquireNextImage();
    }

    /* renamed from: d */
    public final void mo2539d() {
    }

    /* renamed from: f */
    public final void mo2541f(C0627p pVar) {
        C5023g.m12853a(mo2537b(pVar), new C4321a(pVar), C14226d.m35352s0());
    }
}
