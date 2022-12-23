package p054d0;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0627p;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import mf0.C24361g;
import p066e0.C4451q;
import p066e0.C4461y;
import p102h0.C5023g;
import p102h0.C5035n;
import p115i0.C5235k;
import p304x.C7070l;
import p304x.C7073m;
import p695od.C18728c;

/* renamed from: d0.r */
public final class C4305r implements C4451q {

    /* renamed from: a */
    public final C4451q f15241a;

    /* renamed from: b */
    public final C4451q f15242b;

    /* renamed from: c */
    public final C5035n f15243c;

    /* renamed from: d */
    public final Executor f15244d;

    /* renamed from: e */
    public final int f15245e;

    /* renamed from: f */
    public C4272c f15246f = null;

    /* renamed from: g */
    public C4282g0 f15247g = null;

    /* renamed from: h */
    public final Object f15248h = new Object();

    /* renamed from: i */
    public boolean f15249i = false;

    /* renamed from: j */
    public boolean f15250j = false;

    /* renamed from: k */
    public CallbackToFutureAdapter.C0673a<Void> f15251k;

    /* renamed from: l */
    public CallbackToFutureAdapter.C0675c f15252l;

    public C4305r(C4451q qVar, int i, C5235k kVar, ExecutorService executorService) {
        this.f15241a = qVar;
        this.f15242b = kVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(qVar.mo19823b());
        arrayList.add(kVar.mo19823b());
        this.f15243c = C5023g.m12854b(arrayList);
        this.f15244d = executorService;
        this.f15245e = i;
    }

    /* renamed from: a */
    public final void mo19822a(C4461y yVar) {
        synchronized (this.f15248h) {
            if (!this.f15249i) {
                this.f15250j = true;
                C18728c<C0627p> imageProxy = yVar.getImageProxy(yVar.getCaptureIds().get(0).intValue());
                C24361g.m61175n(imageProxy.isDone());
                try {
                    this.f15247g = imageProxy.get().getImageInfo();
                    this.f15241a.mo19822a(yVar);
                } catch (InterruptedException | ExecutionException unused) {
                    throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
                }
            }
        }
    }

    /* renamed from: b */
    public final C18728c<Void> mo19823b() {
        C18728c<Void> cVar;
        synchronized (this.f15248h) {
            if (!this.f15249i || this.f15250j) {
                if (this.f15252l == null) {
                    this.f15252l = CallbackToFutureAdapter.m1884a(new C7070l(this, 2));
                }
                cVar = C5023g.m12858f(this.f15252l);
            } else {
                cVar = C5023g.m12860h(this.f15243c, new C4303q(0), C14226d.m35352s0());
            }
        }
        return cVar;
    }

    /* renamed from: c */
    public final void mo19824c() {
        boolean z;
        boolean z2;
        CallbackToFutureAdapter.C0673a<Void> aVar;
        synchronized (this.f15248h) {
            z = this.f15249i;
            z2 = this.f15250j;
            aVar = this.f15251k;
            if (z && !z2) {
                this.f15246f.close();
            }
        }
        if (z && !z2 && aVar != null) {
            this.f15243c.addListener(new C7073m(aVar, 1), C14226d.m35352s0());
        }
    }

    public final void close() {
        synchronized (this.f15248h) {
            if (!this.f15249i) {
                this.f15249i = true;
                this.f15241a.close();
                this.f15242b.close();
                mo19824c();
            }
        }
    }

    public final void onOutputSurface(Surface surface, int i) {
        this.f15242b.onOutputSurface(surface, i);
    }

    public final void onResolutionUpdate(Size size) {
        C4272c cVar = new C4272c(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f15245e));
        this.f15246f = cVar;
        this.f15241a.onOutputSurface(cVar.getSurface(), 35);
        this.f15241a.onResolutionUpdate(size);
        this.f15242b.onResolutionUpdate(size);
        this.f15246f.mo2556a(new C4301p(this), C14226d.m35352s0());
    }
}
