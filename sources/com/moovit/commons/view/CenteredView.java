package com.moovit.commons.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moovit.commons.utils.UiUtils;
import p622kz.C18165g;

public class CenteredView<T extends View> extends FrameLayout {

    /* renamed from: c */
    public static final C15784a f41049c = new C15784a();

    /* renamed from: b */
    public T f41050b;

    /* renamed from: com.moovit.commons.view.CenteredView$a */
    public class C15784a extends LayoutTransition {
        public final void addChild(ViewGroup viewGroup, View view) {
            viewGroup.setVisibility(view.getVisibility());
        }

        public final void hideChild(ViewGroup viewGroup, View view, int i) {
            viewGroup.setVisibility(view.getVisibility());
        }

        public final void removeChild(ViewGroup viewGroup, View view) {
            viewGroup.setVisibility(view.getVisibility());
        }

        public final void showChild(ViewGroup viewGroup, View view, int i) {
            viewGroup.setVisibility(view.getVisibility());
        }

        public final void hideChild(ViewGroup viewGroup, View view) {
            viewGroup.setVisibility(view.getVisibility());
        }

        public final void showChild(ViewGroup viewGroup, View view) {
            viewGroup.setVisibility(view.getVisibility());
        }
    }

    public CenteredView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public static View m40287b(String str, Context context, AttributeSet attributeSet, int i) throws ClassNotFoundException {
        try {
            return (View) Class.forName(str).asSubclass(View.class).getConstructor(new Class[]{Context.class, AttributeSet.class, Integer.TYPE}).newInstance(new Object[]{context, attributeSet, Integer.valueOf(i)});
        } catch (Exception e) {
            throw new InflateException(e);
        }
    }

    /* renamed from: a */
    public T mo47023a(String str, Context context, AttributeSet attributeSet, int i) {
        T t;
        if (str == null) {
            return null;
        }
        try {
            if (isInEditMode()) {
                t = m40287b(str, context, attributeSet, i);
            } else {
                t = LayoutInflater.from(context).createView(str, (String) null, attributeSet);
            }
            if (t != null) {
                return t;
            }
            throw new InflateException("Unable to inflate view " + str);
        } catch (ClassNotFoundException e) {
            throw new InflateException(C25541a.m63881k("Unable to inflate view ", str), e);
        }
    }

    public T getView() {
        return this.f41050b;
    }

    public void setView(T t) {
        removeAllViews();
        if (t != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            t.setLayoutParams(layoutParams);
            addView(t, layoutParams);
        }
        this.f41050b = t;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        T t = this.f41050b;
        if (t != null) {
            t.setVisibility(i);
        }
    }

    public CenteredView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutTransition(f41049c);
        TypedArray n = UiUtils.m40255n(context, attributeSet, C18165g.CenteredView);
        try {
            View a = mo47023a(n.getString(C18165g.CenteredView_target), context, attributeSet, i);
            if (a != null) {
                a.setBackgroundDrawable((Drawable) null);
            }
            setPadding(0, 0, 0, 0);
            setView(a);
        } finally {
            n.recycle();
        }
    }
}
