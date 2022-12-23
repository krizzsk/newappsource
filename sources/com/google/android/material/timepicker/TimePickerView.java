package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13405f;
import p355ac.C13407h;

class TimePickerView extends ConstraintLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f35706i = 0;

    /* renamed from: h */
    public final MaterialButtonToggleGroup f35707h;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class C14212a implements View.OnClickListener {
        public C14212a() {
        }

        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.f35706i;
            timePickerView.getClass();
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C14213b implements MaterialButtonToggleGroup.C13933d {
        public C14213b() {
        }

        /* renamed from: a */
        public final void mo41163a(int i) {
            TimePickerView timePickerView = TimePickerView.this;
            int i2 = TimePickerView.f35706i;
            timePickerView.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: l */
    public final void mo42667l() {
        boolean z;
        C0738a.C0739a aVar;
        if (this.f35707h.getVisibility() == 0) {
            C0738a aVar2 = new C0738a();
            aVar2.mo3238e(this);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            char c = 1;
            if (C6333d0.C6338e.m15063d(this) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c = 2;
            }
            int i = C13405f.material_clock_display;
            if (aVar2.f3116f.containsKey(Integer.valueOf(i)) && (aVar = aVar2.f3116f.get(Integer.valueOf(i))) != null) {
                switch (c) {
                    case 1:
                        C0738a.C0741b bVar = aVar.f3121e;
                        bVar.f3182j = -1;
                        bVar.f3180i = -1;
                        bVar.f3144G = -1;
                        bVar.f3151N = Integer.MIN_VALUE;
                        break;
                    case 2:
                        C0738a.C0741b bVar2 = aVar.f3121e;
                        bVar2.f3186l = -1;
                        bVar2.f3184k = -1;
                        bVar2.f3145H = -1;
                        bVar2.f3153P = Integer.MIN_VALUE;
                        break;
                    case 3:
                        C0738a.C0741b bVar3 = aVar.f3121e;
                        bVar3.f3190n = -1;
                        bVar3.f3188m = -1;
                        bVar3.f3146I = 0;
                        bVar3.f3152O = Integer.MIN_VALUE;
                        break;
                    case 4:
                        C0738a.C0741b bVar4 = aVar.f3121e;
                        bVar4.f3192o = -1;
                        bVar4.f3194p = -1;
                        bVar4.f3147J = 0;
                        bVar4.f3154Q = Integer.MIN_VALUE;
                        break;
                    case 5:
                        C0738a.C0741b bVar5 = aVar.f3121e;
                        bVar5.f3196q = -1;
                        bVar5.f3197r = -1;
                        bVar5.f3198s = -1;
                        bVar5.f3150M = 0;
                        bVar5.f3157T = Integer.MIN_VALUE;
                        break;
                    case 6:
                        C0738a.C0741b bVar6 = aVar.f3121e;
                        bVar6.f3199t = -1;
                        bVar6.f3200u = -1;
                        bVar6.f3149L = 0;
                        bVar6.f3156S = Integer.MIN_VALUE;
                        break;
                    case 7:
                        C0738a.C0741b bVar7 = aVar.f3121e;
                        bVar7.f3201v = -1;
                        bVar7.f3202w = -1;
                        bVar7.f3148K = 0;
                        bVar7.f3155R = Integer.MIN_VALUE;
                        break;
                    case 8:
                        C0738a.C0741b bVar8 = aVar.f3121e;
                        bVar8.f3140C = -1.0f;
                        bVar8.f3139B = -1;
                        bVar8.f3138A = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            aVar2.mo3236b(this);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo42667l();
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            mo42667l();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14212a aVar = new C14212a();
        LayoutInflater.from(context).inflate(C13407h.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(C13405f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C13405f.material_clock_period_toggle);
        this.f35707h = materialButtonToggleGroup;
        materialButtonToggleGroup.f34453d.add(new C14213b());
        Chip chip = (Chip) findViewById(C13405f.material_minute_tv);
        Chip chip2 = (Chip) findViewById(C13405f.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(C13405f.material_clock_hand);
        C14215b bVar = new C14215b(new GestureDetector(getContext(), new C14214a(this)));
        chip.setOnTouchListener(bVar);
        chip2.setOnTouchListener(bVar);
        int i2 = C13405f.selection_type;
        chip.setTag(i2, 12);
        chip2.setTag(i2, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }
}
