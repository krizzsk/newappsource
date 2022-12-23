package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p242s1.C6409w;

/* renamed from: androidx.fragment.app.p */
public final class C0955p {
    /* renamed from: a */
    public static int m2786a(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: androidx.fragment.app.p$a */
    public static class C0956a {

        /* renamed from: a */
        public final Animation f3832a;

        /* renamed from: b */
        public final Animator f3833b;

        public C0956a(Animation animation) {
            this.f3832a = animation;
            this.f3833b = null;
        }

        public C0956a(Animator animator) {
            this.f3832a = null;
            this.f3833b = animator;
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    public static class C0957b extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f3834b;

        /* renamed from: c */
        public final View f3835c;

        /* renamed from: d */
        public boolean f3836d;

        /* renamed from: e */
        public boolean f3837e;

        /* renamed from: f */
        public boolean f3838f = true;

        public C0957b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3834b = viewGroup;
            this.f3835c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.f3838f = true;
            if (this.f3836d) {
                return !this.f3837e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3836d = true;
                C6409w.m15313a(this.f3834b, this);
            }
            return true;
        }

        public final void run() {
            if (this.f3836d || !this.f3838f) {
                this.f3834b.endViewTransition(this.f3835c);
                this.f3837e = true;
                return;
            }
            this.f3838f = false;
            this.f3834b.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3838f = true;
            if (this.f3836d) {
                return !this.f3837e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3836d = true;
                C6409w.m15313a(this.f3834b, this);
            }
            return true;
        }
    }
}
