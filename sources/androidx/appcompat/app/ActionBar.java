package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import p114i.C5224j;
import p175n.C5765a;

public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface C0214a {
        /* renamed from: a */
        void mo804a();
    }

    /* renamed from: a */
    public boolean mo779a() {
        return false;
    }

    /* renamed from: b */
    public abstract boolean mo780b();

    /* renamed from: c */
    public abstract void mo781c(boolean z);

    /* renamed from: d */
    public abstract int mo782d();

    /* renamed from: e */
    public abstract Context mo783e();

    /* renamed from: f */
    public boolean mo784f() {
        return false;
    }

    /* renamed from: g */
    public abstract void mo785g();

    /* renamed from: h */
    public void mo786h() {
    }

    /* renamed from: i */
    public abstract boolean mo787i(int i, KeyEvent keyEvent);

    /* renamed from: j */
    public boolean mo788j(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: k */
    public boolean mo789k() {
        return false;
    }

    /* renamed from: l */
    public abstract void mo790l(boolean z);

    /* renamed from: m */
    public abstract void mo791m(boolean z);

    /* renamed from: n */
    public abstract void mo792n();

    /* renamed from: o */
    public abstract void mo793o(boolean z);

    /* renamed from: p */
    public abstract void mo794p(int i);

    /* renamed from: q */
    public abstract void mo795q(int i);

    /* renamed from: r */
    public abstract void mo796r(Drawable drawable);

    /* renamed from: s */
    public abstract void mo797s(boolean z);

    /* renamed from: t */
    public abstract void mo798t(boolean z);

    /* renamed from: u */
    public abstract void mo799u(CharSequence charSequence);

    /* renamed from: v */
    public abstract void mo800v(int i);

    /* renamed from: w */
    public abstract void mo801w(CharSequence charSequence);

    /* renamed from: x */
    public abstract void mo802x(CharSequence charSequence);

    /* renamed from: y */
    public C5765a mo803y(AppCompatDelegateImpl.C0226e eVar) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f556a = 8388627;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.ActionBarLayout);
            this.f556a = obtainStyledAttributes.getInt(C5224j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-2, -2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f556a = layoutParams.f556a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
