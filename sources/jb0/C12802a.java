package jb0;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.p341rd.animation.type.AnimationType;
import ib0.C12770a;
import kb0.C12825a;
import kb0.C12826b;
import kb0.C12827c;
import kb0.C12828d;
import kb0.C12829e;
import kb0.C12830f;
import kb0.C12831g;
import kb0.C12832h;
import kb0.C12833i;
import kb0.C12834j;

/* renamed from: jb0.a */
public final class C12802a {

    /* renamed from: a */
    public C12825a f31652a;

    /* renamed from: b */
    public C12826b f31653b;

    /* renamed from: c */
    public C12830f f31654c;

    /* renamed from: d */
    public C12834j f31655d;

    /* renamed from: e */
    public C12831g f31656e;

    /* renamed from: f */
    public C12828d f31657f;

    /* renamed from: g */
    public C12833i f31658g;

    /* renamed from: h */
    public C12827c f31659h;

    /* renamed from: i */
    public C12832h f31660i;

    /* renamed from: j */
    public C12829e f31661j;

    /* renamed from: k */
    public int f31662k;

    /* renamed from: l */
    public int f31663l;

    /* renamed from: m */
    public int f31664m;

    public C12802a(C12770a aVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f31652a = new C12825a(paint, aVar);
        this.f31653b = new C12826b(paint, aVar);
        this.f31654c = new C12830f(paint, aVar);
        this.f31655d = new C12834j(paint, aVar);
        this.f31656e = new C12831g(paint, aVar);
        this.f31657f = new C12828d(paint, aVar);
        this.f31658g = new C12833i(paint, aVar);
        this.f31659h = new C12827c(paint, aVar);
        this.f31660i = new C12832h(paint, aVar);
        this.f31661j = new C12829e(paint, aVar);
    }

    /* renamed from: a */
    public final void mo39642a(Canvas canvas, boolean z) {
        Paint paint;
        if (this.f31653b != null) {
            C12825a aVar = this.f31652a;
            int i = this.f31662k;
            int i2 = this.f31663l;
            int i3 = this.f31664m;
            C12770a aVar2 = (C12770a) aVar.f43144b;
            float f = (float) aVar2.f31540c;
            int i4 = aVar2.f31546i;
            float f2 = aVar2.f31547j;
            int i5 = aVar2.f31549l;
            int i6 = aVar2.f31548k;
            int i7 = aVar2.f31557t;
            AnimationType a = aVar2.mo39619a();
            if ((a == AnimationType.SCALE && !z) || (a == AnimationType.SCALE_DOWN && z)) {
                f *= f2;
            }
            if (i != i7) {
                i5 = i6;
            }
            if (a != AnimationType.FILL || i == i7) {
                paint = (Paint) aVar.f43143a;
            } else {
                paint = aVar.f31703d;
                paint.setStrokeWidth((float) i4);
            }
            paint.setColor(i5);
            canvas.drawCircle((float) i2, (float) i3, f, paint);
        }
    }
}
