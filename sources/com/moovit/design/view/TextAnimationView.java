package com.moovit.design.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import c00.C13717b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.commons.utils.UiUtils;
import j00.C17703j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k00.C17988b;
import p068e2.C4524a;
import p883wc.C20289a;
import w00.C20261b;
import w00.C20267h;
import y00.C20683b;
import y00.C20684c;
import y00.C20685d;

public class TextAnimationView extends MaterialTextView {

    /* renamed from: l */
    public static final /* synthetic */ int f41378l = 0;

    /* renamed from: h */
    public final C15866a f41379h;

    /* renamed from: i */
    public final ArrayList<String> f41380i;

    /* renamed from: j */
    public final C20683b f41381j;

    /* renamed from: k */
    public AnimatorSet f41382k;

    /* renamed from: com.moovit.design.view.TextAnimationView$a */
    public static class C15866a implements Runnable {

        /* renamed from: b */
        public final TextAnimationView f41383b;

        /* renamed from: c */
        public final Rect f41384c = new Rect();

        /* renamed from: d */
        public boolean f41385d;

        /* renamed from: e */
        public boolean f41386e;

        /* renamed from: f */
        public boolean f41387f;

        /* renamed from: g */
        public boolean f41388g;

        /* renamed from: h */
        public Drawable f41389h;

        public C15866a(TextAnimationView textAnimationView) {
            boolean z = false;
            this.f41385d = false;
            this.f41386e = false;
            this.f41387f = false;
            this.f41388g = false;
            this.f41389h = null;
            this.f41383b = textAnimationView;
            this.f41385d = textAnimationView.getLayoutDirection() == 1 ? true : z;
        }

        public final void run() {
            if (this.f41386e) {
                Drawable drawable = this.f41389h;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    this.f41383b.postInvalidateOnAnimation(bounds.left, bounds.top, bounds.right, bounds.bottom);
                }
                this.f41383b.postOnAnimationDelayed(this, 500);
                if (this.f41388g) {
                    this.f41387f = !this.f41387f;
                }
            }
        }
    }

    public TextAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.textAnimationViewStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f41381j.mo52833a();
        mo47753f();
    }

    /* renamed from: e */
    public final void mo47752e() {
        if (!isShown() || !isAttachedToWindow()) {
            AnimatorSet animatorSet = this.f41382k;
            if (animatorSet != null && animatorSet.isStarted()) {
                this.f41382k.end();
            }
            C15866a aVar = this.f41379h;
            if (aVar.f41386e) {
                aVar.f41386e = false;
                aVar.f41387f = false;
                aVar.f41388g = false;
                Drawable drawable = aVar.f41389h;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    aVar.f41383b.postInvalidateOnAnimation(bounds.left, bounds.top, bounds.right, bounds.bottom);
                }
                aVar.f41383b.removeCallbacks(aVar);
                return;
            }
            return;
        }
        C15866a aVar2 = this.f41379h;
        if (!aVar2.f41386e) {
            aVar2.f41386e = true;
            aVar2.f41387f = true;
            aVar2.f41388g = true;
            aVar2.f41383b.postOnAnimation(aVar2);
        }
        AnimatorSet animatorSet2 = this.f41382k;
        if (animatorSet2 != null && !animatorSet2.isStarted()) {
            this.f41382k.start();
        }
    }

    /* renamed from: f */
    public final void mo47753f() {
        this.f41379h.f41389h = this.f41381j.f52253b;
        invalidate();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo47752e();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo47752e();
    }

    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.onDraw(canvas);
        C15866a aVar = this.f41379h;
        if (aVar.f41387f && (drawable = aVar.f41389h) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            Layout layout = aVar.f41383b.getLayout();
            int max = Math.max(0, layout.getLineCount() - 1);
            int ceil = (int) Math.ceil((double) layout.getLineWidth(max));
            aVar.f41383b.getLineBounds(max, aVar.f41384c);
            Rect rect = aVar.f41384c;
            int i3 = rect.top;
            int i4 = rect.bottom;
            if (aVar.f41385d) {
                i = rect.right - ceil;
                i2 = i - intrinsicWidth;
            } else {
                int i5 = ceil + rect.left;
                i = i5 + intrinsicWidth;
                i2 = i5;
            }
            drawable.setBounds(i2, i3, i, i4);
            aVar.f41389h.draw(canvas);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setAnimatedTextHints(bundle.getStringArrayList("hints"));
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putStringArrayList("hints", this.f41380i);
        return bundle;
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo47752e();
    }

    public void setAnimatedTextHints(List<String> list) {
        setHint("");
        this.f41380i.clear();
        if (list != null) {
            this.f41380i.ensureCapacity(list.size());
            this.f41380i.addAll(list);
        }
        AnimatorSet animatorSet = this.f41382k;
        if (animatorSet != null) {
            animatorSet.end();
        }
        ArrayList<String> arrayList = this.f41380i;
        AnimatorSet animatorSet2 = null;
        boolean z = false;
        if (!C13717b.m34258e(arrayList)) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, new C17703j(next), new int[]{0, next.length()});
                ofInt.setDuration((long) (next.length() * 150));
                ofInt.setInterpolator(new C4524a());
                ofInt.setStartDelay(1500);
                ofInt.addListener(new C15868a(this, next));
                float f = UiUtils.m40247f(getResources(), -20.0f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{0.0f, f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet4.setDuration(500);
                animatorSet4.setStartDelay(1000);
                animatorSet4.addListener(new C20685d(this));
                if (animatorSet2 != null) {
                    animatorSet3.play(animatorSet2).before(ofInt);
                }
                animatorSet3.play(ofInt).before(animatorSet4);
                animatorSet2 = animatorSet4;
            }
            animatorSet3.addListener(new C20684c(this));
            animatorSet2 = animatorSet3;
        }
        this.f41382k = animatorSet2;
        C15866a aVar = this.f41379h;
        if (aVar.f41383b.getLayoutDirection() == 1) {
            z = true;
        }
        aVar.f41385d = z;
        mo47752e();
    }

    public void setCursorDrawable(int i) {
        setCursorDrawable(C17988b.m44611b(i, getContext()));
    }

    public void setCursorTintColor(int i) {
        C20683b bVar = this.f41381j;
        bVar.getClass();
        if (bVar.mo52836d(ColorStateList.valueOf(i))) {
            mo47753f();
        }
    }

    public void setCursorTintColorRes(int i) {
        if (this.f41381j.mo52835c(i)) {
            mo47753f();
        }
    }

    public void setCursorTintList(ColorStateList colorStateList) {
        if (this.f41381j.mo52836d(colorStateList)) {
            mo47753f();
        }
    }

    public void setCursorTintMode(PorterDuff.Mode mode) {
        if (this.f41381j.mo52837e(mode)) {
            mo47753f();
        }
    }

    public final void setTextAlignment(int i) {
        if (i == 2) {
            super.setTextAlignment(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r3 > 1791) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r0.f41383b.getLayoutDirection() == 1) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextHint(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r5.setAnimatedTextHints(r0)
            com.moovit.design.view.TextAnimationView$a r0 = r5.f41379h
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L_0x0021
            r0.getClass()
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0014
            goto L_0x002a
        L_0x0014:
            char r3 = r6.charAt(r1)
            r4 = 1424(0x590, float:1.995E-42)
            if (r3 < r4) goto L_0x002a
            r4 = 1791(0x6ff, float:2.51E-42)
            if (r3 > r4) goto L_0x002a
            goto L_0x0029
        L_0x0021:
            com.moovit.design.view.TextAnimationView r3 = r0.f41383b
            int r3 = r3.getLayoutDirection()
            if (r3 != r2) goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r0.f41385d = r1
            r5.setHint(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.design.view.TextAnimationView.setTextHint(java.lang.String):void");
    }

    /* JADX INFO: finally extract failed */
    public TextAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, 0), attributeSet, i);
        this.f41379h = new C15866a(this);
        this.f41380i = new ArrayList<>(0);
        setTextAlignment(2);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C20267h.TextAnimationView, i);
        try {
            this.f41381j = new C20683b(this, o, C20267h.TextAnimationView_cursorDrawable, C20267h.TextAnimationView_cursorTint, C20267h.TextAnimationView_cursorTintMode);
            o.recycle();
            mo47753f();
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }

    public void setCursorDrawable(Drawable drawable) {
        if (this.f41381j.mo52834b(drawable)) {
            mo47753f();
        }
    }
}
