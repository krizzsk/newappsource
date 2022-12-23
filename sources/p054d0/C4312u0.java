package p054d0;

import android.util.SparseArray;
import androidx.camera.core.C0627p;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p066e0.C4461y;
import p358af.C13437d;
import p695od.C18728c;

/* renamed from: d0.u0 */
public final class C4312u0 implements C4461y {

    /* renamed from: a */
    public final Object f15266a = new Object();

    /* renamed from: b */
    public final SparseArray<CallbackToFutureAdapter.C0673a<C0627p>> f15267b = new SparseArray<>();

    /* renamed from: c */
    public final SparseArray<C18728c<C0627p>> f15268c = new SparseArray<>();

    /* renamed from: d */
    public final ArrayList f15269d = new ArrayList();

    /* renamed from: e */
    public final List<Integer> f15270e;

    /* renamed from: f */
    public String f15271f;

    /* renamed from: g */
    public boolean f15272g = false;

    /* renamed from: d0.u0$a */
    public class C4313a implements CallbackToFutureAdapter.C0674b<C0627p> {

        /* renamed from: b */
        public final /* synthetic */ int f15273b;

        public C4313a(int i) {
            this.f15273b = i;
        }

        public final Object attachCompleter(CallbackToFutureAdapter.C0673a<C0627p> aVar) {
            synchronized (C4312u0.this.f15266a) {
                C4312u0.this.f15267b.put(this.f15273b, aVar);
            }
            return C13437d.m33707l(C13555b.m33972k("getImageProxy(id: "), this.f15273b, ")");
        }
    }

    public C4312u0(List<Integer> list, String str) {
        this.f15270e = list;
        this.f15271f = str;
        mo19833d();
    }

    /* renamed from: a */
    public final void mo19830a(C0627p pVar) {
        synchronized (this.f15266a) {
            if (!this.f15272g) {
                Integer num = (Integer) pVar.getImageInfo().getTagBundle().mo19986a(this.f15271f);
                if (num != null) {
                    CallbackToFutureAdapter.C0673a aVar = this.f15267b.get(num.intValue());
                    if (aVar != null) {
                        this.f15269d.add(pVar);
                        aVar.mo2697b(pVar);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    /* renamed from: b */
    public final void mo19831b() {
        synchronized (this.f15266a) {
            if (!this.f15272g) {
                Iterator it = this.f15269d.iterator();
                while (it.hasNext()) {
                    ((C0627p) it.next()).close();
                }
                this.f15269d.clear();
                this.f15268c.clear();
                this.f15267b.clear();
                this.f15272g = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo19832c() {
        synchronized (this.f15266a) {
            if (!this.f15272g) {
                Iterator it = this.f15269d.iterator();
                while (it.hasNext()) {
                    ((C0627p) it.next()).close();
                }
                this.f15269d.clear();
                this.f15268c.clear();
                this.f15267b.clear();
                mo19833d();
            }
        }
    }

    /* renamed from: d */
    public final void mo19833d() {
        synchronized (this.f15266a) {
            for (Integer intValue : this.f15270e) {
                int intValue2 = intValue.intValue();
                this.f15268c.put(intValue2, CallbackToFutureAdapter.m1884a(new C4313a(intValue2)));
            }
        }
    }

    public final List<Integer> getCaptureIds() {
        return Collections.unmodifiableList(this.f15270e);
    }

    public final C18728c<C0627p> getImageProxy(int i) {
        C18728c<C0627p> cVar;
        synchronized (this.f15266a) {
            if (!this.f15272g) {
                cVar = this.f15268c.get(i);
                if (cVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return cVar;
    }
}
