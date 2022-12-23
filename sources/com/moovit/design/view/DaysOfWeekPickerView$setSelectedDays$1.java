package com.moovit.design.view;

import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "", "chip", "Lcom/google/android/material/chip/Chip;", "invoke", "(Lcom/google/android/material/chip/Chip;)Ljava/lang/Boolean;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class DaysOfWeekPickerView$setSelectedDays$1 extends Lambda implements C24236l<Chip, Boolean> {

    /* renamed from: f */
    public static final DaysOfWeekPickerView$setSelectedDays$1 f41352f = new DaysOfWeekPickerView$setSelectedDays$1();

    public DaysOfWeekPickerView$setSelectedDays$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        Chip chip = (Chip) obj;
        C24362h.m61211f(chip, "chip");
        return Boolean.valueOf(chip.isEnabled());
    }
}
