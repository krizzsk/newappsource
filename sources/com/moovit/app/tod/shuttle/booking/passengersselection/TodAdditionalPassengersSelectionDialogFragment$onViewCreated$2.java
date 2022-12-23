package com.moovit.app.tod.shuttle.booking.passengersselection;

import bf0.C21050d;
import com.moovit.design.view.NumericStepperView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"", "kotlin.jvm.PlatformType", "counter", "Lbf0/d;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class TodAdditionalPassengersSelectionDialogFragment$onViewCreated$2 extends Lambda implements C24236l<Integer, C21050d> {
    public final /* synthetic */ NumericStepperView $passengersCountView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodAdditionalPassengersSelectionDialogFragment$onViewCreated$2(NumericStepperView numericStepperView) {
        super(1);
        this.$passengersCountView = numericStepperView;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        NumericStepperView numericStepperView = this.$passengersCountView;
        C24362h.m61210e(num, "counter");
        int intValue = num.intValue();
        if (numericStepperView.f41367f != intValue) {
            numericStepperView.mo47719b(intValue, false);
        }
        return C21050d.f52856a;
    }
}
