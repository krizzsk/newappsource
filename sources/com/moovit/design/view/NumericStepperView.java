package com.moovit.design.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.widget.C0801k;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import k00.C17988b;
import p090g1.C4732a;
import p480ez.C16910b;
import p584jl.C17885a;
import p761qy.C19201a;
import p883wc.C20289a;
import p977zz.C20930c;
import p977zz.C20936e0;
import p977zz.C20941h;
import p977zz.C20950l0;
import w00.C20261b;
import w00.C20262c;
import w00.C20263d;
import w00.C20264e;
import w00.C20265f;
import w00.C20266g;
import w00.C20267h;

public class NumericStepperView extends LinearLayout {

    /* renamed from: h */
    public static final int f41362h = C20266g.Widget_Moovit_NumericStepper;

    /* renamed from: b */
    public final Button f41363b;

    /* renamed from: c */
    public final Button f41364c;

    /* renamed from: d */
    public final FormatTextView f41365d;

    /* renamed from: e */
    public C20950l0<Integer> f41366e;

    /* renamed from: f */
    public int f41367f;

    /* renamed from: g */
    public C15863a f41368g;

    /* renamed from: com.moovit.design.view.NumericStepperView$a */
    public interface C15863a {
        /* renamed from: g */
        void mo19812g(NumericStepperView numericStepperView, int i);
    }

    public NumericStepperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.numericStepperStyle);
    }

    /* renamed from: a */
    public final void mo47718a(int i, int i2, boolean z) {
        this.f41366e = new C20950l0<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.f41365d.setEms(Math.max(2, String.format(C20930c.m49020b(getContext()), "%d", new Object[]{Integer.valueOf(i2)}).length()));
        int b = C20936e0.m49036b(i, i2, this.f41367f);
        if (this.f41367f != b) {
            mo47719b(b, z);
        }
        mo47720c();
    }

    /* renamed from: b */
    public final void mo47719b(int i, boolean z) {
        boolean z2;
        C15863a aVar;
        if (!this.f41366e.mo53021b(Integer.valueOf(i))) {
            z2 = false;
        } else {
            this.f41367f = i;
            z2 = true;
        }
        if (z2) {
            mo47720c();
            if (z && (aVar = this.f41368g) != null) {
                aVar.mo19812g(this, this.f41367f);
            }
        }
    }

    /* renamed from: c */
    public final void mo47720c() {
        boolean z;
        boolean z2 = true;
        this.f41365d.setArguments(Integer.valueOf(this.f41367f));
        Button button = this.f41363b;
        if (!isEnabled() || this.f41367f == ((Integer) this.f41366e.f52696b).intValue()) {
            z = false;
        } else {
            z = true;
        }
        button.setEnabled(z);
        Button button2 = this.f41364c;
        if (!isEnabled() || this.f41367f == ((Integer) this.f41366e.f52695a).intValue()) {
            z2 = false;
        }
        button2.setEnabled(z2);
    }

    public int getCounter() {
        return this.f41367f;
    }

    public void setAddContentDescription(CharSequence charSequence) {
        this.f41363b.setContentDescription(charSequence);
    }

    public void setAddIcon(int i) {
        C17885a.m44465u0(this.f41363b, C17988b.m44611b(i, getContext()), 2);
    }

    public void setCounter(int i) {
        if (this.f41367f != i) {
            mo47719b(i, true);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        mo47720c();
    }

    public void setListener(C15863a aVar) {
        this.f41368g = aVar;
    }

    public void setResourceTextColor(int i) {
        setTextColor(C4732a.getColorStateList(getContext(), i));
    }

    public void setSpacing(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f41365d.getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f41365d.setLayoutParams(layoutParams);
    }

    public void setSubtractContentDescription(CharSequence charSequence) {
        this.f41364c.setContentDescription(charSequence);
    }

    public void setSubtractIcon(int i) {
        C17885a.m44465u0(this.f41364c, C17988b.m44611b(i, getContext()), 2);
    }

    public void setTextAppearance(int i) {
        C0801k.m2424f(this.f41365d, i);
    }

    public void setTextColor(int i) {
        this.f41365d.setTextColor(i);
    }

    public void setThemeTextAppearance(int i) {
        setTextAppearance(C20941h.m49047j(i, getContext()));
    }

    /* JADX INFO: finally extract failed */
    public NumericStepperView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, f41362h), attributeSet, i);
        this.f41366e = new C20950l0<>(0, 99);
        Context context2 = getContext();
        setOrientation(0);
        LayoutInflater.from(context2).inflate(C20264e.numeric_stepper_layout, this);
        this.f41365d = (FormatTextView) findViewById(C20263d.counter_view);
        Button button = (Button) findViewById(C20263d.add_button);
        this.f41363b = button;
        button.setOnClickListener(new C19201a(this, 4));
        Button button2 = (Button) findViewById(C20263d.subtract_button);
        this.f41364c = button2;
        button2.setOnClickListener(new C16910b(this, 1));
        TypedArray o = UiUtils.m40256o(context2, attributeSet, C20267h.NumericStepperView, i);
        try {
            int resourceId = o.getResourceId(C20267h.NumericStepperView_android_textAppearance, 0);
            if (resourceId != 0) {
                setTextAppearance(resourceId);
            }
            ColorStateList b = C20941h.m49039b(context2, o, C20267h.NumericStepperView_android_textColor);
            if (b != null) {
                setTextColor(b);
            }
            setAddIcon(o.getResourceId(C20267h.NumericStepperView_addIcon, C20262c.wdg_numeric_stepper_ic_add_16));
            setAddContentDescription(o.getResourceId(C20267h.NumericStepperView_addIconContentDescription, C20265f.voiceover_add));
            setSubtractIcon(o.getResourceId(C20267h.NumericStepperView_subtractIcon, C20262c.wdg_numeric_stepper_ic_subtract_16));
            setSubtractContentDescription(o.getResourceId(C20267h.NumericStepperView_subtractIconContentDescription, C20265f.voiceover_subtract));
            setSpacing(C20941h.m49041d(context2, o, C20267h.NumericStepperView_spacing, UiUtils.m40249h(context2.getResources(), 8.0f)));
            mo47718a(o.getInt(C20267h.NumericStepperView_minValue, 0), o.getInt(C20267h.NumericStepperView_maxValue, 99), true);
            o.recycle();
            mo47719b(((Integer) this.f41366e.f52695a).intValue(), false);
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }

    public void setAddContentDescription(int i) {
        setAddContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setSubtractContentDescription(int i) {
        setSubtractContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f41365d.setTextColor(colorStateList);
    }
}
