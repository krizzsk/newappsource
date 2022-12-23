package com.masabi.justride.sdk.p415ui.features.universalticket.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.FrameLayout;
import bf0.C21049c;
import com.appboy.models.MessageButton;
import kotlin.Metadata;
import mf0.C24362h;
import p583jk.C17884p;
import p584jl.C17885a;
import p611ko.C18110b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/components/UniversalTicketButtonFrame;", "Landroid/widget/FrameLayout;", "", "text", "Lbf0/d;", "setButtonText", "", "buttonId", "setButtonId", "leftDrawable", "setLeftDrawable", "(Ljava/lang/Integer;)V", "", "enabled", "setEnabled", "Landroid/widget/Button;", "f", "Lbf0/c;", "getButton", "()Landroid/widget/Button;", "button", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame */
public final class UniversalTicketButtonFrame extends FrameLayout {

    /* renamed from: b */
    public final int f37228b;

    /* renamed from: c */
    public final int f37229c;

    /* renamed from: d */
    public final int f37230d;

    /* renamed from: e */
    public Integer f37231e;

    /* renamed from: f */
    public final C21049c f37232f;

    /* renamed from: g */
    public int f37233g;

    /* renamed from: h */
    public CharSequence f37234h;

    /* renamed from: i */
    public float f37235i;

    public UniversalTicketButtonFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (String) null, 60);
    }

    public UniversalTicketButtonFrame(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (String) null, 56);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UniversalTicketButtonFrame(android.content.Context r3, android.util.AttributeSet r4, int r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r0 = r7 & 4
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r5 = 0
        L_0x000b:
            r0 = r7 & 8
            if (r0 == 0) goto L_0x0011
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0011:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0017
            java.lang.String r6 = ""
        L_0x0017:
            r7 = 0
            java.lang.String r0 = "context"
            mf0.C24362h.m61211f(r3, r0)
            java.lang.String r0 = "text"
            mf0.C24362h.m61211f(r6, r0)
            r2.<init>(r3, r4, r5)
            r2.f37233g = r1
            r2.f37234h = r6
            r2.f37235i = r7
            r4 = -1
            r5 = 1711276032(0x66000000, float:1.5111573E23)
            r2.f37228b = r5
            r5 = 855638016(0x33000000, float:2.9802322E-8)
            r2.f37229c = r5
            java.lang.String r5 = "#FFE4E4E4"
            int r5 = android.graphics.Color.parseColor(r5)
            r2.f37230d = r5
            com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame$button$2 r5 = new com.masabi.justride.sdk.ui.features.universalticket.components.UniversalTicketButtonFrame$button$2
            r5.<init>(r2, r3)
            bf0.c r3 = kotlin.C23812a.m58432b(r5)
            r2.f37232f = r3
            r3 = 1
            r2.setClickable(r3)
            r2.setFocusable(r3)
            android.widget.Button r3 = r2.getButton()
            java.lang.CharSequence r5 = r2.f37234h
            r3.setText(r5)
            android.widget.Button r3 = r2.getButton()
            r3.setTextColor(r4)
            java.lang.Integer r3 = r2.f37231e
            if (r3 == 0) goto L_0x006d
            int r3 = r3.intValue()
            android.widget.Button r4 = r2.getButton()
            p583jk.C17884p.m44362d(r4, r3)
        L_0x006d:
            r2.mo44457a()
            r2.mo44458b()
            android.widget.Button r3 = r2.getButton()
            r2.addView(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.masabi.justride.sdk.p415ui.features.universalticket.components.UniversalTicketButtonFrame.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.String, int):void");
    }

    private final Button getButton() {
        return (Button) this.f37232f.getValue();
    }

    /* renamed from: a */
    public final void mo44457a() {
        Button button = getButton();
        int i = this.f37233g;
        int i2 = this.f37230d;
        int i3 = this.f37229c;
        float f = this.f37235i;
        C24362h.m61211f(button, "$this$setBackground");
        Resources resources = button.getResources();
        C24362h.m61210e(resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C24362h.m61210e(displayMetrics, "displayMetrics");
        C18110b bVar = new C18110b(displayMetrics);
        GradientDrawable a = bVar.mo50548a(f, i);
        GradientDrawable a2 = bVar.mo50548a(f, i3);
        int L = (int) C17885a.m44410L(displayMetrics, 2.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a2, a});
        layerDrawable.setLayerInset(1, 0, 0, 0, L);
        GradientDrawable a3 = bVar.mo50548a(f, i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, a3);
        stateListDrawable.addState(new int[0], layerDrawable);
        button.setBackground(stateListDrawable);
    }

    /* renamed from: b */
    public final void mo44458b() {
        Resources resources = getResources();
        C24362h.m61210e(resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C24362h.m61210e(displayMetrics, "displayMetrics");
        int i = this.f37228b;
        float L = C17885a.m44410L(displayMetrics, this.f37235i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(L);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        setForeground(stateListDrawable);
    }

    public final void setButtonId(int i) {
        getButton().setId(i);
    }

    public final void setButtonText(CharSequence charSequence) {
        C24362h.m61211f(charSequence, MessageButton.TEXT);
        this.f37234h = charSequence;
        getButton().setText(charSequence);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getButton().setEnabled(z);
    }

    public final void setLeftDrawable(Integer num) {
        this.f37231e = num;
        if (num == null) {
            getButton().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            C17884p.m44362d(getButton(), num.intValue());
        }
    }
}
