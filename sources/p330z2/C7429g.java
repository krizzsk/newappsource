package p330z2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

@SuppressLint({"ViewConstructor"})
/* renamed from: z2.g */
public final class C7429g extends ViewGroup implements C7426d {

    /* renamed from: h */
    public static final /* synthetic */ int f22830h = 0;

    /* renamed from: b */
    public ViewGroup f22831b;

    /* renamed from: c */
    public View f22832c;

    /* renamed from: d */
    public final View f22833d;

    /* renamed from: e */
    public int f22834e;

    /* renamed from: f */
    public Matrix f22835f;

    /* renamed from: g */
    public final C7430a f22836g = new C7430a();

    /* renamed from: z2.g$a */
    public class C7430a implements ViewTreeObserver.OnPreDrawListener {
        public C7430a() {
        }

        public final boolean onPreDraw() {
            View view;
            C7429g gVar = C7429g.this;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(gVar);
            C7429g gVar2 = C7429g.this;
            ViewGroup viewGroup = gVar2.f22831b;
            if (viewGroup == null || (view = gVar2.f22832c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C6333d0.C6337d.m15051k(C7429g.this.f22831b);
            C7429g gVar3 = C7429g.this;
            gVar3.f22831b = null;
            gVar3.f22832c = null;
            return true;
        }
    }

    public C7429g(View view) {
        super(view.getContext());
        this.f22833d = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    public static void m17077b(View view, ViewGroup viewGroup) {
        C7444t.m17082a(viewGroup, viewGroup.getLeft(), viewGroup.getTop(), view.getWidth() + viewGroup.getLeft(), view.getHeight() + viewGroup.getTop());
    }

    /* renamed from: a */
    public final void mo23647a(ViewGroup viewGroup, View view) {
        this.f22831b = viewGroup;
        this.f22832c = view;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22833d.setTag(C7434j.ghost_view, this);
        this.f22833d.getViewTreeObserver().addOnPreDrawListener(this.f22836g);
        C7444t.m17084c(4, this.f22833d);
        if (this.f22833d.getParent() != null) {
            ((View) this.f22833d.getParent()).invalidate();
        }
    }

    public final void onDetachedFromWindow() {
        this.f22833d.getViewTreeObserver().removeOnPreDrawListener(this.f22836g);
        C7444t.m17084c(0, this.f22833d);
        this.f22833d.setTag(C7434j.ghost_view, (Object) null);
        if (this.f22833d.getParent() != null) {
            ((View) this.f22833d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        C7421a.m17070a(canvas, true);
        canvas.setMatrix(this.f22835f);
        C7444t.m17084c(0, this.f22833d);
        this.f22833d.invalidate();
        C7444t.m17084c(4, this.f22833d);
        drawChild(canvas, this.f22833d, getDrawingTime());
        C7421a.m17070a(canvas, false);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (((C7429g) this.f22833d.getTag(C7434j.ghost_view)) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C7444t.m17084c(i2, this.f22833d);
        }
    }
}
