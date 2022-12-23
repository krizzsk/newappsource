package p321y4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.layer.C1894a;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p037c5.C1791l;
import p059d5.C4374f;
import p107h5.C5058f;
import p120i5.C5282c;
import p332z4.C7456a;
import p332z4.C7465d;
import p332z4.C7477p;

/* renamed from: y4.o */
public final class C7329o implements C7316d, C7325l, C7321i, C7456a.C7457a, C7322j {

    /* renamed from: a */
    public final Matrix f22529a = new Matrix();

    /* renamed from: b */
    public final Path f22530b = new Path();

    /* renamed from: c */
    public final C1876l f22531c;

    /* renamed from: d */
    public final C1894a f22532d;

    /* renamed from: e */
    public final String f22533e;

    /* renamed from: f */
    public final boolean f22534f;

    /* renamed from: g */
    public final C7465d f22535g;

    /* renamed from: h */
    public final C7465d f22536h;

    /* renamed from: i */
    public final C7477p f22537i;

    /* renamed from: j */
    public C7315c f22538j;

    public C7329o(C1876l lVar, C1894a aVar, C4374f fVar) {
        this.f22531c = lVar;
        this.f22532d = aVar;
        this.f22533e = fVar.f15387a;
        this.f22534f = fVar.f15391e;
        C7456a<Float, Float> i = fVar.f15388b.mo6602i();
        this.f22535g = (C7465d) i;
        aVar.mo6806e(i);
        i.mo23712a(this);
        C7456a<Float, Float> i2 = fVar.f15389c.mo6602i();
        this.f22536h = (C7465d) i2;
        aVar.mo6806e(i2);
        i2.mo23712a(this);
        C1791l lVar2 = fVar.f15390d;
        lVar2.getClass();
        C7477p pVar = new C7477p(lVar2);
        this.f22537i = pVar;
        pVar.mo23739a(aVar);
        pVar.mo23740b(this);
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22531c.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        this.f22538j.mo6804b(list, list2);
    }

    /* renamed from: c */
    public final void mo5839c(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        C5058f.m12907d(dVar, i, arrayList, dVar2, this);
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        this.f22538j.mo6805d(rectF, matrix, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23556e(java.util.ListIterator<p321y4.C7314b> r9) {
        /*
            r8 = this;
            y4.c r0 = r8.f22538j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r9.previous()
            y4.b r0 = (p321y4.C7314b) r0
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x002a:
            java.util.Collections.reverse(r6)
            y4.c r9 = new y4.c
            com.airbnb.lottie.l r2 = r8.f22531c
            com.airbnb.lottie.model.layer.a r3 = r8.f22532d
            boolean r5 = r8.f22534f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f22538j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p321y4.C7329o.mo23556e(java.util.ListIterator):void");
    }

    /* renamed from: f */
    public final void mo6807f(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f22535g.mo23717f()).floatValue();
        float floatValue2 = ((Float) this.f22536h.mo23717f()).floatValue();
        float floatValue3 = this.f22537i.f22931m.mo23717f().floatValue() / 100.0f;
        float floatValue4 = this.f22537i.f22932n.mo23717f().floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.f22529a.set(matrix);
                float f = (float) i2;
                this.f22529a.preConcat(this.f22537i.mo23743e(f + floatValue2));
                PointF pointF = C5058f.f17056a;
                this.f22538j.mo6807f(canvas, this.f22529a, (int) ((((floatValue4 - floatValue3) * (f / floatValue)) + floatValue3) * ((float) i)));
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        if (!this.f22537i.mo23741c(cVar, obj)) {
            if (obj == C1903q.f6697u) {
                this.f22535g.mo23722k(cVar);
            } else if (obj == C1903q.f6698v) {
                this.f22536h.mo23722k(cVar);
            }
        }
    }

    public final String getName() {
        return this.f22533e;
    }

    /* renamed from: q */
    public final Path mo23551q() {
        Path q = this.f22538j.mo23551q();
        this.f22530b.reset();
        float floatValue = ((Float) this.f22535g.mo23717f()).floatValue();
        float floatValue2 = ((Float) this.f22536h.mo23717f()).floatValue();
        int i = (int) floatValue;
        while (true) {
            i--;
            if (i < 0) {
                return this.f22530b;
            }
            this.f22529a.set(this.f22537i.mo23743e(((float) i) + floatValue2));
            this.f22530b.addPath(q, this.f22529a);
        }
    }
}
