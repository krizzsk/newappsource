package p647mc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.C14026d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p090g1.C4732a;
import p355ac.C13402c;
import p763rc.C19252b;
import p811tc.C19648g;
import p811tc.C19654k;

/* renamed from: mc.f */
public final class C18360f extends C14026d {

    /* renamed from: mc.f$a */
    public static class C18361a extends C19648g {
        public C18361a(C19654k kVar) {
            super(kVar);
        }

        public final boolean isStateful() {
            return true;
        }
    }

    public C18360f(FloatingActionButton floatingActionButton, FloatingActionButton.C14021b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: e */
    public final float mo41737e() {
        return this.f34882v.getElevation();
    }

    /* renamed from: f */
    public final void mo41738f(Rect rect) {
        boolean z;
        if (FloatingActionButton.this.f34832m) {
            super.mo41738f(rect);
            return;
        }
        if (!this.f34866f || this.f34882v.getSizeDimension() >= this.f34871k) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int sizeDimension = (this.f34871k - this.f34882v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: g */
    public final void mo41739g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C19648g s = mo50826s();
        this.f34862b = s;
        s.setTintList(colorStateList);
        if (mode != null) {
            this.f34862b.setTintMode(mode);
        }
        this.f34862b.mo52001k(this.f34882v.getContext());
        if (i > 0) {
            Context context = this.f34882v.getContext();
            C19654k kVar = this.f34861a;
            kVar.getClass();
            C18355b bVar = new C18355b(kVar);
            int color = C4732a.getColor(context, C13402c.design_fab_stroke_top_outer_color);
            int color2 = C4732a.getColor(context, C13402c.design_fab_stroke_top_inner_color);
            int color3 = C4732a.getColor(context, C13402c.design_fab_stroke_end_inner_color);
            int color4 = C4732a.getColor(context, C13402c.design_fab_stroke_end_outer_color);
            bVar.f46799i = color;
            bVar.f46800j = color2;
            bVar.f46801k = color3;
            bVar.f46802l = color4;
            float f = (float) i;
            if (bVar.f46798h != f) {
                bVar.f46798h = f;
                bVar.f46792b.setStrokeWidth(f * 1.3333f);
                bVar.f46804n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList != null) {
                bVar.f46803m = colorStateList.getColorForState(bVar.getState(), bVar.f46803m);
            }
            bVar.f46806p = colorStateList;
            bVar.f46804n = true;
            bVar.invalidateSelf();
            this.f34864d = bVar;
            C18355b bVar2 = this.f34864d;
            bVar2.getClass();
            C19648g gVar = this.f34862b;
            gVar.getClass();
            drawable = new LayerDrawable(new Drawable[]{bVar2, gVar});
        } else {
            this.f34864d = null;
            drawable = this.f34862b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C19252b.m46506c(colorStateList2), drawable, (Drawable) null);
        this.f34863c = rippleDrawable;
        this.f34865e = rippleDrawable;
    }

    /* renamed from: h */
    public final void mo41740h() {
    }

    /* renamed from: i */
    public final void mo41741i() {
        mo41749q();
    }

    /* renamed from: j */
    public final void mo41742j(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f34882v.isEnabled()) {
            this.f34882v.setElevation(this.f34868h);
            if (this.f34882v.isPressed()) {
                this.f34882v.setTranslationZ(this.f34870j);
            } else if (this.f34882v.isFocused() || this.f34882v.isHovered()) {
                this.f34882v.setTranslationZ(this.f34869i);
            } else {
                this.f34882v.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
            }
        } else {
            this.f34882v.setElevation(BitmapDescriptorFactory.HUE_RED);
            this.f34882v.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: k */
    public final void mo41743k(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f34882v.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C14026d.f34853D, mo50825r(f, f3));
            stateListAnimator.addState(C14026d.f34854E, mo50825r(f, f2));
            stateListAnimator.addState(C14026d.f34855F, mo50825r(f, f2));
            stateListAnimator.addState(C14026d.f34856G, mo50825r(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f34882v, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f34882v;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f34882v, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C14026d.f34852C);
            stateListAnimator.addState(C14026d.f34857H, animatorSet);
            stateListAnimator.addState(C14026d.f34858I, mo50825r(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
            this.f34882v.setStateListAnimator(stateListAnimator);
        }
        if (mo41747o()) {
            mo41749q();
        }
    }

    /* renamed from: m */
    public final void mo41745m(ColorStateList colorStateList) {
        Drawable drawable = this.f34863c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C19252b.m46506c(colorStateList));
        } else {
            super.mo41745m(colorStateList);
        }
    }

    /* renamed from: o */
    public final boolean mo41747o() {
        boolean z;
        if (!FloatingActionButton.this.f34832m) {
            if (!this.f34866f || this.f34882v.getSizeDimension() >= this.f34871k) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final void mo41748p() {
    }

    /* renamed from: r */
    public final AnimatorSet mo50825r(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f34882v, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f34882v, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C14026d.f34852C);
        return animatorSet;
    }

    /* renamed from: s */
    public final C19648g mo50826s() {
        C19654k kVar = this.f34861a;
        kVar.getClass();
        return new C18361a(kVar);
    }
}
