package p805su;

import android.os.Bundle;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import p543hq.C17474b;
import p805su.C19560p;

/* renamed from: su.o */
public final /* synthetic */ class C19559o implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C19560p.C19561a f49716b;

    /* renamed from: c */
    public final /* synthetic */ MotQrCodeTrip f49717c;

    /* renamed from: d */
    public final /* synthetic */ int f49718d;

    public /* synthetic */ C19559o(C19560p.C19561a aVar, MotQrCodeTrip motQrCodeTrip, int i) {
        this.f49716b = aVar;
        this.f49717c = motQrCodeTrip;
        this.f49718d = i;
    }

    public final void onClick(View view) {
        C19560p.C19561a aVar = this.f49716b;
        MotQrCodeTrip motQrCodeTrip = this.f49717c;
        int i = this.f49718d;
        C19560p pVar = C19560p.this;
        int i2 = C19560p.f49719q;
        pVar.getClass();
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_trip_clicked");
        aVar2.mo49937e(AnalyticsAttributeKey.LINE_GROUP_ID, motQrCodeTrip.f39073c.mo24369b().f23694b);
        aVar2.mo49937e(AnalyticsAttributeKey.LINE_ID, motQrCodeTrip.f39073c.f23687c);
        aVar2.mo49937e(AnalyticsAttributeKey.STOP_ID, motQrCodeTrip.f39072b.f23730b);
        aVar2.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
        aVar2.mo49943k(AnalyticsAttributeKey.PREDICTED_LINE_ID, pVar.mo51896n2().mo45611c());
        pVar.mo46797j2(aVar2.mo49933a());
        MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) pVar.f40822c;
        motQrCodeActivationActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("trip", motQrCodeTrip);
        C19544f fVar = new C19544f();
        fVar.setArguments(bundle);
        motQrCodeActivationActivity.mo45585z2(fVar, "destination", true);
    }
}
