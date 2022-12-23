package com.moovit.design.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import p988j$.time.DayOfWeek;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"", "kotlin.jvm.PlatformType", "viewId", "j$/time/DayOfWeek", "invoke", "(Ljava/lang/Integer;)Lj$/time/DayOfWeek;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class DaysOfWeekPickerView$getSelectedDays$1 extends Lambda implements C24236l<Integer, DayOfWeek> {
    public final /* synthetic */ DaysOfWeekPickerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DaysOfWeekPickerView$getSelectedDays$1(DaysOfWeekPickerView daysOfWeekPickerView) {
        super(1);
        this.this$0 = daysOfWeekPickerView;
    }

    public final Object invoke(Object obj) {
        return (DayOfWeek) this.this$0.f41350m.get((Integer) obj);
    }
}
