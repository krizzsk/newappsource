package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C14068i;
import java.util.ArrayList;
import java.util.Iterator;
import mf0.C24361g;
import p068e2.C4524a;
import p141k1.C5450a;
import p355ac.C13401b;
import p355ac.C13406g;
import p380bc.C13577a;
import p380bc.C13581e;
import p380bc.C13582f;
import p380bc.C13583g;
import p583jk.C17884p;
import p647mc.C18355b;
import p647mc.C18358d;
import p647mc.C18359e;
import p647mc.C18360f;
import p670nc.C18537a;
import p742qc.C19098b;
import p763rc.C19252b;
import p787sc.C19445b;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19666o;

/* renamed from: com.google.android.material.floatingactionbutton.d */
public class C14026d {

    /* renamed from: C */
    public static final C4524a f34852C = C13577a.f33539c;

    /* renamed from: D */
    public static final int[] f34853D = {16842919, 16842910};

    /* renamed from: E */
    public static final int[] f34854E = {16843623, 16842908, 16842910};

    /* renamed from: F */
    public static final int[] f34855F = {16842908, 16842910};

    /* renamed from: G */
    public static final int[] f34856G = {16843623, 16842910};

    /* renamed from: H */
    public static final int[] f34857H = {16842910};

    /* renamed from: I */
    public static final int[] f34858I = new int[0];

    /* renamed from: A */
    public final Matrix f34859A = new Matrix();

    /* renamed from: B */
    public C18359e f34860B;

    /* renamed from: a */
    public C19654k f34861a;

    /* renamed from: b */
    public C19648g f34862b;

    /* renamed from: c */
    public Drawable f34863c;

    /* renamed from: d */
    public C18355b f34864d;

    /* renamed from: e */
    public LayerDrawable f34865e;

    /* renamed from: f */
    public boolean f34866f;

    /* renamed from: g */
    public boolean f34867g = true;

    /* renamed from: h */
    public float f34868h;

    /* renamed from: i */
    public float f34869i;

    /* renamed from: j */
    public float f34870j;

    /* renamed from: k */
    public int f34871k;

    /* renamed from: l */
    public Animator f34872l;

    /* renamed from: m */
    public C13583g f34873m;

    /* renamed from: n */
    public C13583g f34874n;

    /* renamed from: o */
    public float f34875o;

    /* renamed from: p */
    public float f34876p = 1.0f;

    /* renamed from: q */
    public int f34877q;

    /* renamed from: r */
    public int f34878r = 0;

    /* renamed from: s */
    public ArrayList<Animator.AnimatorListener> f34879s;

    /* renamed from: t */
    public ArrayList<Animator.AnimatorListener> f34880t;

    /* renamed from: u */
    public ArrayList<C14032f> f34881u;

    /* renamed from: v */
    public final FloatingActionButton f34882v;

    /* renamed from: w */
    public final C19445b f34883w;

    /* renamed from: x */
    public final Rect f34884x = new Rect();

    /* renamed from: y */
    public final RectF f34885y = new RectF();

    /* renamed from: z */
    public final RectF f34886z = new RectF();

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    public class C14027a extends C13582f {
        public C14027a() {
        }

        public final Object evaluate(float f, Object obj, Object obj2) {
            C14026d.this.f34876p = f;
            ((Matrix) obj).getValues(this.f33546a);
            ((Matrix) obj2).getValues(this.f33547b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f33547b;
                float f2 = fArr[i];
                float f3 = this.f33546a[i];
                fArr[i] = C16759e.m42347c(f2, f3, f, f3);
            }
            this.f33548c.setValues(this.f33547b);
            return this.f33548c;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    public class C14028b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f34888a;

        /* renamed from: b */
        public final /* synthetic */ float f34889b;

        /* renamed from: c */
        public final /* synthetic */ float f34890c;

        /* renamed from: d */
        public final /* synthetic */ float f34891d;

        /* renamed from: e */
        public final /* synthetic */ float f34892e;

        /* renamed from: f */
        public final /* synthetic */ float f34893f;

        /* renamed from: g */
        public final /* synthetic */ float f34894g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f34895h;

        public C14028b(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f34888a = f;
            this.f34889b = f2;
            this.f34890c = f3;
            this.f34891d = f4;
            this.f34892e = f5;
            this.f34893f = f6;
            this.f34894g = f7;
            this.f34895h = matrix;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C14026d.this.f34882v.setAlpha(C13577a.m33993a(this.f34888a, this.f34889b, BitmapDescriptorFactory.HUE_RED, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = C14026d.this.f34882v;
            float f = this.f34890c;
            floatingActionButton.setScaleX(((this.f34891d - f) * floatValue) + f);
            FloatingActionButton floatingActionButton2 = C14026d.this.f34882v;
            float f2 = this.f34892e;
            floatingActionButton2.setScaleY(((this.f34891d - f2) * floatValue) + f2);
            C14026d dVar = C14026d.this;
            float f3 = this.f34893f;
            float f4 = this.f34894g;
            dVar.f34876p = C16759e.m42347c(f4, f3, floatValue, f3);
            dVar.mo41734a(C16759e.m42347c(f4, f3, floatValue, f3), this.f34895h);
            C14026d.this.f34882v.setImageMatrix(this.f34895h);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    public class C14029c extends C14035i {
        public C14029c(C18360f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public final float mo41752a() {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    public class C14030d extends C14035i {

        /* renamed from: e */
        public final /* synthetic */ C14026d f34897e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14030d(C18360f fVar) {
            super(fVar);
            this.f34897e = fVar;
        }

        /* renamed from: a */
        public final float mo41752a() {
            C14026d dVar = this.f34897e;
            return dVar.f34868h + dVar.f34869i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    public class C14031e extends C14035i {

        /* renamed from: e */
        public final /* synthetic */ C14026d f34898e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14031e(C18360f fVar) {
            super(fVar);
            this.f34898e = fVar;
        }

        /* renamed from: a */
        public final float mo41752a() {
            C14026d dVar = this.f34898e;
            return dVar.f34868h + dVar.f34870j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    public interface C14032f {
        /* renamed from: a */
        void mo41725a();

        /* renamed from: b */
        void mo41726b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    public interface C14033g {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    public class C14034h extends C14035i {

        /* renamed from: e */
        public final /* synthetic */ C14026d f34899e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14034h(C18360f fVar) {
            super(fVar);
            this.f34899e = fVar;
        }

        /* renamed from: a */
        public final float mo41752a() {
            return this.f34899e.f34868h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    public abstract class C14035i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f34900a;

        /* renamed from: b */
        public float f34901b;

        /* renamed from: c */
        public float f34902c;

        /* renamed from: d */
        public final /* synthetic */ C14026d f34903d;

        public C14035i(C18360f fVar) {
            this.f34903d = fVar;
        }

        /* renamed from: a */
        public abstract float mo41752a();

        public final void onAnimationEnd(Animator animator) {
            C14026d dVar = this.f34903d;
            float f = (float) ((int) this.f34902c);
            C19648g gVar = dVar.f34862b;
            if (gVar != null) {
                gVar.mo52003m(f);
            }
            this.f34900a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            if (!this.f34900a) {
                C19648g gVar = this.f34903d.f34862b;
                if (gVar == null) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = gVar.f49837b.f49874n;
                }
                this.f34901b = f;
                this.f34902c = mo41752a();
                this.f34900a = true;
            }
            C14026d dVar = this.f34903d;
            float f2 = this.f34901b;
            float animatedFraction = (float) ((int) ((valueAnimator.getAnimatedFraction() * (this.f34902c - f2)) + f2));
            C19648g gVar2 = dVar.f34862b;
            if (gVar2 != null) {
                gVar2.mo52003m(animatedFraction);
            }
        }
    }

    public C14026d(FloatingActionButton floatingActionButton, FloatingActionButton.C14021b bVar) {
        this.f34882v = floatingActionButton;
        this.f34883w = bVar;
        C14068i iVar = new C14068i();
        C18360f fVar = (C18360f) this;
        iVar.mo41880a(f34853D, m34975d(new C14031e(fVar)));
        iVar.mo41880a(f34854E, m34975d(new C14030d(fVar)));
        iVar.mo41880a(f34855F, m34975d(new C14030d(fVar)));
        iVar.mo41880a(f34856G, m34975d(new C14030d(fVar)));
        iVar.mo41880a(f34857H, m34975d(new C14034h(fVar)));
        iVar.mo41880a(f34858I, m34975d(new C14029c(fVar)));
        this.f34875o = floatingActionButton.getRotation();
    }

    /* renamed from: d */
    public static ValueAnimator m34975d(C14035i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f34852C);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    public final void mo41734a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f34882v.getDrawable();
        if (drawable != null && this.f34877q != 0) {
            RectF rectF = this.f34885y;
            RectF rectF2 = this.f34886z;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f34877q;
            rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f34877q;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: b */
    public final AnimatorSet mo41735b(C13583g gVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f34882v, View.ALPHA, new float[]{f});
        gVar.mo40467f("opacity").mo40472a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f34882v, View.SCALE_X, new float[]{f2});
        gVar.mo40467f("scale").mo40472a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C18358d());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f34882v, View.SCALE_Y, new float[]{f2});
        gVar.mo40467f("scale").mo40472a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C18358d());
        }
        arrayList.add(ofFloat3);
        mo41734a(f3, this.f34859A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f34882v, new C13581e(), new C14027a(), new Matrix[]{new Matrix(this.f34859A)});
        gVar.mo40467f("iconScale").mo40472a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C17884p.m44345P(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet mo41736c(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        ofFloat.addUpdateListener(new C14028b(this.f34882v.getAlpha(), f, this.f34882v.getScaleX(), f2, this.f34882v.getScaleY(), this.f34876p, f3, new Matrix(this.f34859A)));
        arrayList.add(ofFloat);
        C17884p.m44345P(animatorSet, arrayList);
        Context context = this.f34882v.getContext();
        int i = C13401b.motionDurationLong1;
        int integer = this.f34882v.getContext().getResources().getInteger(C13406g.material_motion_duration_long_1);
        TypedValue a = C19098b.m46245a(i, context);
        if (a != null && a.type == 16) {
            integer = a.data;
        }
        animatorSet.setDuration((long) integer);
        animatorSet.setInterpolator(C18537a.m45455c(this.f34882v.getContext(), C13401b.motionEasingStandard, C13577a.f33538b));
        return animatorSet;
    }

    /* renamed from: e */
    public float mo41737e() {
        throw null;
    }

    /* renamed from: f */
    public void mo41738f(Rect rect) {
        int i;
        float f;
        if (this.f34866f) {
            i = (this.f34871k - this.f34882v.getSizeDimension()) / 2;
        } else {
            i = 0;
        }
        if (this.f34867g) {
            f = mo41737e() + this.f34870j;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        int max = Math.max(i, (int) Math.ceil((double) f));
        int max2 = Math.max(i, (int) Math.ceil((double) (f * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: g */
    public void mo41739g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    /* renamed from: h */
    public void mo41740h() {
        throw null;
    }

    /* renamed from: i */
    public void mo41741i() {
        throw null;
    }

    /* renamed from: j */
    public void mo41742j(int[] iArr) {
        throw null;
    }

    /* renamed from: k */
    public void mo41743k(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: l */
    public final void mo41744l() {
        ArrayList<C14032f> arrayList = this.f34881u;
        if (arrayList != null) {
            Iterator<C14032f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo41725a();
            }
        }
    }

    /* renamed from: m */
    public void mo41745m(ColorStateList colorStateList) {
        Drawable drawable = this.f34863c;
        if (drawable != null) {
            C5450a.C5452b.m13617h(drawable, C19252b.m46506c(colorStateList));
        }
    }

    /* renamed from: n */
    public final void mo41746n(C19654k kVar) {
        this.f34861a = kVar;
        C19648g gVar = this.f34862b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f34863c;
        if (drawable instanceof C19666o) {
            ((C19666o) drawable).setShapeAppearanceModel(kVar);
        }
        C18355b bVar = this.f34864d;
        if (bVar != null) {
            bVar.f46805o = kVar;
            bVar.invalidateSelf();
        }
    }

    /* renamed from: o */
    public boolean mo41747o() {
        throw null;
    }

    /* renamed from: p */
    public void mo41748p() {
        throw null;
    }

    /* renamed from: q */
    public final void mo41749q() {
        Rect rect = this.f34884x;
        mo41738f(rect);
        C24361g.m61185s(this.f34865e, "Didn't initialize content background");
        if (mo41747o()) {
            C14026d.super.setBackgroundDrawable(new InsetDrawable(this.f34865e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            C19445b bVar = this.f34883w;
            LayerDrawable layerDrawable = this.f34865e;
            FloatingActionButton.C14021b bVar2 = (FloatingActionButton.C14021b) bVar;
            if (layerDrawable != null) {
                C14026d.super.setBackgroundDrawable(layerDrawable);
            } else {
                bVar2.getClass();
            }
        }
        C19445b bVar3 = this.f34883w;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton.C14021b bVar4 = (FloatingActionButton.C14021b) bVar3;
        FloatingActionButton.this.f34833n.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i5 = floatingActionButton.f34830k;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
