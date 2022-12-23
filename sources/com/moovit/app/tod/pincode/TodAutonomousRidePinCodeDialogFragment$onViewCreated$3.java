package com.moovit.app.tod.pincode;

import android.widget.Button;
import android.widget.TextView;
import bf0.C21050d;
import com.moovit.app.tod.model.TodPassengerPinCodeActionInfo;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.PinCodeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodPassengerPinCodeActionInfo;", "pinCodeActionInfo", "Lbf0/d;", "invoke", "(Lcom/moovit/app/tod/model/TodPassengerPinCodeActionInfo;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class TodAutonomousRidePinCodeDialogFragment$onViewCreated$3 extends Lambda implements C24236l<TodPassengerPinCodeActionInfo, C21050d> {
    public final /* synthetic */ TodAutonomousRidePinCodeDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodAutonomousRidePinCodeDialogFragment$onViewCreated$3(TodAutonomousRidePinCodeDialogFragment todAutonomousRidePinCodeDialogFragment) {
        super(1);
        this.this$0 = todAutonomousRidePinCodeDialogFragment;
    }

    public final Object invoke(Object obj) {
        TodPassengerPinCodeActionInfo todPassengerPinCodeActionInfo = (TodPassengerPinCodeActionInfo) obj;
        TodAutonomousRidePinCodeDialogFragment todAutonomousRidePinCodeDialogFragment = this.this$0;
        if (todPassengerPinCodeActionInfo == null) {
            int i = TodAutonomousRidePinCodeDialogFragment.f40368m;
            todAutonomousRidePinCodeDialogFragment.dismissAllowingStateLoss();
        } else {
            TextView textView = todAutonomousRidePinCodeDialogFragment.f40370i;
            if (textView != null) {
                textView.setText(todPassengerPinCodeActionInfo.f40260c);
                TextView textView2 = todAutonomousRidePinCodeDialogFragment.f40371j;
                if (textView2 != null) {
                    UiUtils.m40234B(textView2, todPassengerPinCodeActionInfo.f40262e);
                    PinCodeView pinCodeView = todAutonomousRidePinCodeDialogFragment.f40372k;
                    if (pinCodeView != null) {
                        pinCodeView.setLength(todPassengerPinCodeActionInfo.f40259b);
                        Button button = todAutonomousRidePinCodeDialogFragment.f40373l;
                        if (button != null) {
                            button.setText(todPassengerPinCodeActionInfo.f40261d);
                        } else {
                            C24362h.m61217l("actionButton");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("pinCodeView");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("instructionsView");
                    throw null;
                }
            } else {
                C24362h.m61217l("titleView");
                throw null;
            }
        }
        return C21050d.f52856a;
    }
}
