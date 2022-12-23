package p100gb;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.C3912b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p099ga.C4879e1;
import p100gb.C4987o;
import p100gb.C4995u;
import p265tb.C6671u;
import p583jk.C17875h;

/* renamed from: gb.a */
public abstract class C4955a implements C4987o {

    /* renamed from: a */
    public final ArrayList<C4987o.C4989b> f16739a = new ArrayList<>(1);

    /* renamed from: b */
    public final HashSet<C4987o.C4989b> f16740b = new HashSet<>(1);

    /* renamed from: c */
    public final C4995u.C4996a f16741c = new C4995u.C4996a();

    /* renamed from: d */
    public final C3912b.C3913a f16742d = new C3912b.C3913a();

    /* renamed from: e */
    public Looper f16743e;

    /* renamed from: f */
    public C4879e1 f16744f;

    /* renamed from: b */
    public final void mo20616b(C4987o.C4989b bVar) {
        this.f16739a.remove(bVar);
        if (this.f16739a.isEmpty()) {
            this.f16743e = null;
            this.f16744f = null;
            this.f16740b.clear();
            mo20629r();
            return;
        }
        mo20620h(bVar);
    }

    /* renamed from: d */
    public final void mo20617d(C4987o.C4989b bVar, C6671u uVar) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f16743e;
        if (looper == null || looper == myLooper) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        C4879e1 e1Var = this.f16744f;
        this.f16739a.add(bVar);
        if (this.f16743e == null) {
            this.f16743e = myLooper;
            this.f16740b.add(bVar);
            mo20628q(uVar);
        } else if (e1Var != null) {
            mo20625n(bVar);
            bVar.mo20578a(e1Var);
        }
    }

    /* renamed from: e */
    public final void mo20618e(C4995u uVar) {
        C4995u.C4996a aVar = this.f16741c;
        Iterator<C4995u.C4996a.C4997a> it = aVar.f16887c.iterator();
        while (it.hasNext()) {
            C4995u.C4996a.C4997a next = it.next();
            if (next.f16890b == uVar) {
                aVar.f16887c.remove(next);
            }
        }
    }

    /* renamed from: f */
    public final void mo20619f(Handler handler, C4995u uVar) {
        C4995u.C4996a aVar = this.f16741c;
        aVar.getClass();
        aVar.f16887c.add(new C4995u.C4996a.C4997a(handler, uVar));
    }

    /* renamed from: h */
    public final void mo20620h(C4987o.C4989b bVar) {
        boolean z = !this.f16740b.isEmpty();
        this.f16740b.remove(bVar);
        if (z && this.f16740b.isEmpty()) {
            mo20626o();
        }
    }

    /* renamed from: i */
    public final void mo20621i(Handler handler, C3912b bVar) {
        C3912b.C3913a aVar = this.f16742d;
        aVar.getClass();
        aVar.f13727c.add(new C3912b.C3913a.C3914a(handler, bVar));
    }

    /* renamed from: j */
    public final void mo20622j(C3912b bVar) {
        C3912b.C3913a aVar = this.f16742d;
        Iterator<C3912b.C3913a.C3914a> it = aVar.f13727c.iterator();
        while (it.hasNext()) {
            C3912b.C3913a.C3914a next = it.next();
            if (next.f13729b == bVar) {
                aVar.f13727c.remove(next);
            }
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo20623l() {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo20624m() {
    }

    /* renamed from: n */
    public final void mo20625n(C4987o.C4989b bVar) {
        this.f16743e.getClass();
        boolean isEmpty = this.f16740b.isEmpty();
        this.f16740b.add(bVar);
        if (isEmpty) {
            mo20627p();
        }
    }

    /* renamed from: o */
    public void mo20626o() {
    }

    /* renamed from: p */
    public void mo20627p() {
    }

    /* renamed from: q */
    public abstract void mo20628q(C6671u uVar);

    /* renamed from: r */
    public abstract void mo20629r();
}
