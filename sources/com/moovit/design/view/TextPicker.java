package com.moovit.design.view;

import a00.C13382a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import c00.C13717b;
import com.moovit.commons.utils.UiUtils;
import java.util.Arrays;
import java.util.Collection;
import p451du.C16709f;
import p644lx.C18284b;
import p783rw.C19370b;
import p883wc.C20289a;
import w00.C20260a;
import w00.C20261b;
import w00.C20263d;
import w00.C20264e;
import w00.C20266g;
import w00.C20267h;

public class TextPicker extends LinearLayout {

    /* renamed from: j */
    public static final int f41390j = C20266g.Widget_Moovit_TextPicker;

    /* renamed from: b */
    public final ViewAnimator f41391b;

    /* renamed from: c */
    public final Button f41392c;

    /* renamed from: d */
    public final Button f41393d;

    /* renamed from: e */
    public final Animation f41394e;

    /* renamed from: f */
    public final Animation f41395f;

    /* renamed from: g */
    public final Animation f41396g;

    /* renamed from: h */
    public final Animation f41397h;

    /* renamed from: i */
    public C15867a f41398i;

    /* renamed from: com.moovit.design.view.TextPicker$a */
    public interface C15867a {
        /* renamed from: c */
        void mo310c(int i);
    }

    public TextPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.textPickerStyle);
    }

    /* renamed from: a */
    public final void mo47770a() {
        int displayedTextIndex;
        if (this.f41398i != null && (displayedTextIndex = getDisplayedTextIndex()) != -1) {
            this.f41398i.mo310c(displayedTextIndex);
        }
    }

    /* renamed from: b */
    public final void mo47771b() {
        int i;
        int displayedTextIndex = getDisplayedTextIndex();
        int i2 = 0;
        if (displayedTextIndex == -1) {
            UiUtils.m40238F(4, this.f41393d, this.f41392c);
            return;
        }
        Button button = this.f41392c;
        if (displayedTextIndex == 0) {
            i = 4;
        } else {
            i = 0;
        }
        button.setVisibility(i);
        Button button2 = this.f41393d;
        if (displayedTextIndex == this.f41391b.getChildCount() - 1) {
            i2 = 4;
        }
        button2.setVisibility(i2);
    }

    public int getDisplayedTextIndex() {
        if (this.f41391b.getChildCount() == 0) {
            return -1;
        }
        return this.f41391b.getDisplayedChild();
    }

    public C15867a getTextChangeListener() {
        return this.f41398i;
    }

    public void setDisplayedTextIndex(int i) {
        int displayedTextIndex = getDisplayedTextIndex();
        if (i != displayedTextIndex) {
            if (i > displayedTextIndex) {
                this.f41391b.setInAnimation(this.f41396g);
                this.f41391b.setOutAnimation(this.f41397h);
            } else {
                this.f41391b.setInAnimation(this.f41394e);
                this.f41391b.setOutAnimation(this.f41395f);
            }
            this.f41391b.setDisplayedChild(i);
            mo47771b();
            mo47770a();
        }
    }

    public void setTextChangeListener(C15867a aVar) {
        this.f41398i = aVar;
    }

    public void setTexts(Collection<? extends CharSequence> collection) {
        this.f41391b.removeAllViews();
        if (!C13717b.m34258e(collection)) {
            for (CharSequence text : collection) {
                TextView textView = new TextView(getContext(), (AttributeSet) null, C20261b.textPickerTextStyle);
                textView.setText(text);
                C13382a.m33672h(textView);
                this.f41391b.addView(textView);
            }
        }
        setDisplayedTextIndex(0);
    }

    /* JADX INFO: finally extract failed */
    public TextPicker(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, f41390j), attributeSet, i);
        this.f41398i = null;
        Context context2 = getContext();
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context2).inflate(C20264e.text_picker, this, true);
        Button button = (Button) findViewById(C20263d.start_arrow);
        this.f41392c = button;
        button.setOnClickListener(new C19370b(this, 7));
        Button button2 = (Button) findViewById(C20263d.end_arrow);
        this.f41393d = button2;
        button2.setOnClickListener(new C18284b(this, 4));
        this.f41394e = AnimationUtils.loadAnimation(context2, C20260a.cross_in_from_start);
        this.f41396g = AnimationUtils.loadAnimation(context2, C20260a.cross_in_from_end);
        this.f41397h = AnimationUtils.loadAnimation(context2, C20260a.cross_out_to_start);
        this.f41395f = AnimationUtils.loadAnimation(context2, C20260a.cross_out_to_end);
        ViewAnimator viewAnimator = (ViewAnimator) findViewById(C20263d.view_animator);
        this.f41391b = viewAnimator;
        TypedArray o = UiUtils.m40256o(context2, attributeSet, C20267h.TextPicker, i);
        try {
            CharSequence text = o.getText(C20267h.TextPicker_nextContentDescription);
            button.setContentDescription(o.getText(C20267h.TextPicker_previousContentDescription));
            button2.setContentDescription(text);
            CharSequence[] textArray = o.getTextArray(C20267h.TextPicker_textsArray);
            if (textArray != null) {
                setTexts(Arrays.asList(textArray));
            }
            o.recycle();
            UiUtils.m40259r(viewAnimator, new C16709f(this, 1));
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }
}
