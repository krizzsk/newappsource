package com.moovit.micromobility.purchase.step;

import android.os.Parcelable;
import ce0.C21100e;

public abstract class MicroMobilityPurchaseStepResult implements Parcelable {

    /* renamed from: b */
    public final String f14923b;

    /* renamed from: com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult$a */
    public interface C4162a {
    }

    public MicroMobilityPurchaseStepResult(String str) {
        C21100e.m49373x(str, "contextId");
        this.f14923b = str;
    }

    /* renamed from: b */
    public abstract void mo19524b(C4162a aVar);
}
