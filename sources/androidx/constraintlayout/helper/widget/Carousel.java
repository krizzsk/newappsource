package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0717a;
import androidx.constraintlayout.motion.widget.C0721b;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0738a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p002a1.C0042d;

public class Carousel extends MotionHelper {

    /* renamed from: A */
    public int f2593A = 1;

    /* renamed from: B */
    public float f2594B = 2.0f;

    /* renamed from: C */
    public int f2595C = -1;

    /* renamed from: D */
    public int f2596D = 200;

    /* renamed from: E */
    public C0705a f2597E = new C0705a();

    /* renamed from: n */
    public final ArrayList<View> f2598n = new ArrayList<>();

    /* renamed from: o */
    public int f2599o = 0;

    /* renamed from: p */
    public int f2600p = 0;

    /* renamed from: q */
    public MotionLayout f2601q;

    /* renamed from: r */
    public int f2602r = -1;

    /* renamed from: s */
    public boolean f2603s = false;

    /* renamed from: t */
    public int f2604t = -1;

    /* renamed from: u */
    public int f2605u = -1;

    /* renamed from: v */
    public int f2606v = -1;

    /* renamed from: w */
    public int f2607w = -1;

    /* renamed from: x */
    public float f2608x = 0.9f;

    /* renamed from: y */
    public int f2609y = 0;

    /* renamed from: z */
    public int f2610z = 4;

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    public class C0705a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a */
        public class C0706a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ float f2612b;

            public C0706a(float f) {
                this.f2612b = f;
            }

            public final void run() {
                Carousel.this.f2601q.mo2923A(1.0f, this.f2612b, 5);
            }
        }

        public C0705a() {
        }

        public final void run() {
            Carousel.this.f2601q.setProgress(BitmapDescriptorFactory.HUE_RED);
            Carousel.this.mo2859x();
            Carousel.this.getClass();
            throw null;
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    public interface C0707b {
        /* renamed from: a */
        void mo2863a();

        /* renamed from: b */
        void mo2864b();

        int count();
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2858w(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo2851a(int i) {
        int i2 = this.f2600p;
        this.f2599o = i2;
        if (i == this.f2607w) {
            this.f2600p = i2 + 1;
        } else if (i == this.f2606v) {
            this.f2600p = i2 - 1;
        }
        if (this.f2603s) {
            throw null;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo2852c() {
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f2600p;
    }

    public final void onAttachedToWindow() {
        C0721b bVar;
        C0721b bVar2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f2998c; i++) {
                int i2 = this.f2997b[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.f2602r == i2) {
                    this.f2609y = i;
                }
                this.f2598n.add(viewById);
            }
            this.f2601q = motionLayout;
            if (this.f2593A == 2) {
                C0717a.C0719b s = motionLayout.mo2960s(this.f2605u);
                if (!(s == null || (bVar2 = s.f2788l) == null)) {
                    bVar2.f2806c = 5;
                }
                C0717a.C0719b s2 = this.f2601q.mo2960s(this.f2604t);
                if (!(s2 == null || (bVar = s2.f2788l) == null)) {
                    bVar.f2806c = 5;
                }
            }
            mo2859x();
        }
    }

    public void setAdapter(C0707b bVar) {
    }

    /* renamed from: v */
    public final void mo2857v(int i, boolean z) {
        MotionLayout motionLayout;
        C0717a.C0719b s;
        if (i != -1 && (motionLayout = this.f2601q) != null && (s = motionLayout.mo2960s(i)) != null && z != (!s.f2791o)) {
            s.f2791o = !z;
        }
    }

    /* renamed from: w */
    public final void mo2858w(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.Carousel_carousel_firstView) {
                    this.f2602r = obtainStyledAttributes.getResourceId(index, this.f2602r);
                } else if (index == C0042d.Carousel_carousel_backwardTransition) {
                    this.f2604t = obtainStyledAttributes.getResourceId(index, this.f2604t);
                } else if (index == C0042d.Carousel_carousel_forwardTransition) {
                    this.f2605u = obtainStyledAttributes.getResourceId(index, this.f2605u);
                } else if (index == C0042d.Carousel_carousel_emptyViewsBehavior) {
                    this.f2610z = obtainStyledAttributes.getInt(index, this.f2610z);
                } else if (index == C0042d.Carousel_carousel_previousState) {
                    this.f2606v = obtainStyledAttributes.getResourceId(index, this.f2606v);
                } else if (index == C0042d.Carousel_carousel_nextState) {
                    this.f2607w = obtainStyledAttributes.getResourceId(index, this.f2607w);
                } else if (index == C0042d.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f2608x = obtainStyledAttributes.getFloat(index, this.f2608x);
                } else if (index == C0042d.Carousel_carousel_touchUpMode) {
                    this.f2593A = obtainStyledAttributes.getInt(index, this.f2593A);
                } else if (index == C0042d.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f2594B = obtainStyledAttributes.getFloat(index, this.f2594B);
                } else if (index == C0042d.Carousel_carousel_infinite) {
                    this.f2603s = obtainStyledAttributes.getBoolean(index, this.f2603s);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: x */
    public final void mo2859x() {
    }

    /* renamed from: y */
    public final void mo2860y(int i, View view) {
        C0738a aVar;
        C0738a.C0739a j;
        MotionLayout motionLayout = this.f2601q;
        if (motionLayout != null) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            for (int i2 : constraintSetIds) {
                C0717a aVar2 = this.f2601q.f2688h;
                if (aVar2 == null) {
                    aVar = null;
                } else {
                    aVar = aVar2.mo3001b(i2);
                }
                if (!(aVar == null || (j = aVar.mo3241j(view.getId())) == null)) {
                    j.f3119c.f3222c = 1;
                    view.setVisibility(i);
                }
            }
        }
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2858w(context, attributeSet);
    }
}
