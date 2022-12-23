package p054d0;

import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.C0416i1;
import androidx.camera.core.C0627p;
import androidx.camera.core.C0629q;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.C0581f;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.android.play.core.appupdate.C14226d;
import p066e0.C4444m0;
import p066e0.C4451q;
import p066e0.C4462z;
import p089g0.C4721b;
import p102h0.C5023g;
import p102h0.C5028j;
import p695od.C18728c;

/* renamed from: d0.q0 */
public final class C4304q0 extends DeferrableSurface {

    /* renamed from: m */
    public final Object f15232m = new Object();

    /* renamed from: n */
    public boolean f15233n;

    /* renamed from: o */
    public final C0629q f15234o;

    /* renamed from: p */
    public final Surface f15235p;

    /* renamed from: q */
    public final C0581f f15236q;

    /* renamed from: r */
    public final C4451q f15237r;

    /* renamed from: s */
    public final C0629q.C0630a f15238s;

    /* renamed from: t */
    public final DeferrableSurface f15239t;

    /* renamed from: u */
    public String f15240u;

    public C4304q0(int i, int i2, int i3, Handler handler, C0581f.C0582a aVar, C4451q qVar, SurfaceRequest.C0532b bVar, String str) {
        super(new Size(i, i2), i3);
        C4291k0 k0Var = new C4291k0(this, 1);
        this.f15233n = false;
        Size size = new Size(i, i2);
        C4721b bVar2 = new C4721b(handler);
        C0629q qVar2 = new C0629q(i, i2, i3, 2);
        this.f15234o = qVar2;
        qVar2.mo2556a(k0Var, bVar2);
        this.f15235p = qVar2.getSurface();
        this.f15238s = qVar2.f2151b;
        this.f15237r = qVar;
        qVar.onResolutionUpdate(size);
        this.f15236q = aVar;
        this.f15239t = bVar;
        this.f15240u = str;
        C5023g.m12853a(bVar.mo2452c(), new C4302p0(this), C14226d.m35352s0());
        mo2453d().addListener(new C0416i1(this, 2), C14226d.m35352s0());
    }

    /* renamed from: g */
    public final C18728c<Surface> mo2360g() {
        C5028j.C5031c e;
        synchronized (this.f15232m) {
            e = C5023g.m12857e(this.f15235p);
        }
        return e;
    }

    /* renamed from: h */
    public final void mo19821h(C4462z zVar) {
        if (!this.f15233n) {
            C0627p pVar = null;
            try {
                pVar = zVar.acquireNextImage();
            } catch (IllegalStateException unused) {
                C4289j0.m11435b("ProcessingSurfaceTextur");
            }
            if (pVar != null) {
                C4282g0 imageInfo = pVar.getImageInfo();
                if (imageInfo == null) {
                    pVar.close();
                    return;
                }
                Integer num = (Integer) imageInfo.getTagBundle().mo19986a(this.f15240u);
                if (num == null) {
                    pVar.close();
                    return;
                }
                this.f15236q.getId();
                if (num.intValue() != 0) {
                    C4289j0.m11435b("ProcessingSurfaceTextur");
                    pVar.close();
                    return;
                }
                C4444m0 m0Var = new C4444m0(pVar, this.f15240u);
                this.f15237r.mo19822a(m0Var);
                ((C0627p) m0Var.f15504c).close();
            }
        }
    }
}
