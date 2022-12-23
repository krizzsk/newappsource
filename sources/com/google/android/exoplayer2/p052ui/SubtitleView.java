package com.google.android.exoplayer2.p052ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5342i;
import p174mb.C5762b;
import p277ub.C6774a0;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
public final class SubtitleView extends FrameLayout implements C5342i {

    /* renamed from: b */
    public List<C5332a> f14419b = Collections.emptyList();

    /* renamed from: c */
    public C4027a f14420c = C4027a.f14444g;

    /* renamed from: d */
    public int f14421d = 0;

    /* renamed from: e */
    public float f14422e = 0.0533f;

    /* renamed from: f */
    public float f14423f = 0.08f;

    /* renamed from: g */
    public boolean f14424g = true;

    /* renamed from: h */
    public boolean f14425h = true;

    /* renamed from: i */
    public int f14426i;

    /* renamed from: j */
    public C4022a f14427j;

    /* renamed from: k */
    public View f14428k;

    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    public interface C4022a {
        /* renamed from: a */
        void mo16350a(List<C5332a> list, C4027a aVar, float f, int i, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, (AttributeSet) null);
        this.f14427j = canvasSubtitleOutput;
        this.f14428k = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f14426i = 1;
    }

    private List<C5332a> getCuesWithStylingPreferencesApplied() {
        if (this.f14424g && this.f14425h) {
            return this.f14419b;
        }
        ArrayList arrayList = new ArrayList(this.f14419b.size());
        for (int i = 0; i < this.f14419b.size(); i++) {
            C5332a aVar = this.f14419b.get(i);
            aVar.getClass();
            C5332a.C5333a aVar2 = new C5332a.C5333a(aVar);
            if (!this.f14424g) {
                aVar2.f17619n = false;
                CharSequence charSequence = aVar2.f17606a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVar2.f17606a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = aVar2.f17606a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof C5762b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                C4030b0.m10908a(aVar2);
            } else if (!this.f14425h) {
                C4030b0.m10908a(aVar2);
            }
            arrayList.add(aVar2.mo21116a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C6774a0.f20959a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C4027a getUserCaptionStyle() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = C6774a0.f20959a;
        if (i6 < 19 || isInEditMode()) {
            return C4027a.f14444g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return C4027a.f14444g;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i6 < 21) {
            return new C4027a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = -1;
        }
        if (userStyle.hasBackgroundColor()) {
            i2 = userStyle.backgroundColor;
        } else {
            i2 = -16777216;
        }
        if (userStyle.hasWindowColor()) {
            i3 = userStyle.windowColor;
        } else {
            i3 = 0;
        }
        if (userStyle.hasEdgeType()) {
            i4 = userStyle.edgeType;
        } else {
            i4 = 0;
        }
        if (userStyle.hasEdgeColor()) {
            i5 = userStyle.edgeColor;
        } else {
            i5 = -1;
        }
        return new C4027a(i, i2, i3, i4, i5, userStyle.getTypeface());
    }

    private <T extends View & C4022a> void setView(T t) {
        removeView(this.f14428k);
        View view = this.f14428k;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f14437c.destroy();
        }
        this.f14428k = t;
        this.f14427j = (C4022a) t;
        addView(t);
    }

    /* renamed from: B */
    public final void mo16508B(List<C5332a> list) {
        setCues(list);
    }

    /* renamed from: a */
    public final void mo16636a() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: b */
    public final void mo16637b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* renamed from: c */
    public final void mo16638c() {
        this.f14427j.mo16350a(getCuesWithStylingPreferencesApplied(), this.f14420c, this.f14422e, this.f14421d, this.f14423f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f14425h = z;
        mo16638c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f14424g = z;
        mo16638c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f14423f = f;
        mo16638c();
    }

    public void setCues(List<C5332a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f14419b = list;
        mo16638c();
    }

    public void setFractionalTextSize(float f) {
        this.f14421d = 0;
        this.f14422e = f;
        mo16638c();
    }

    public void setStyle(C4027a aVar) {
        this.f14420c = aVar;
        mo16638c();
    }

    public void setViewType(int i) {
        if (this.f14426i != i) {
            if (i == 1) {
                setView(new CanvasSubtitleOutput(getContext(), (AttributeSet) null));
            } else if (i == 2) {
                setView(new WebViewSubtitleOutput(getContext(), (AttributeSet) null));
            } else {
                throw new IllegalArgumentException();
            }
            this.f14426i = i;
        }
    }
}
