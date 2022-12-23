package p664mu;

import android.content.Intent;
import android.os.Bundle;
import c00.C13717b;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.MoovitActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.ticketing.activation.C7634b;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import java.util.List;
import je0.C23715f;
import n80.C12914a;
import n80.C12916c;
import p130j2.C5367a;
import p664mu.C18462q;
import q80.C13011b;
import w40.C25761d;

/* renamed from: mu.n */
public final /* synthetic */ class C18459n implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f47049b;

    /* renamed from: c */
    public final /* synthetic */ Object f47050c;

    /* renamed from: d */
    public final /* synthetic */ Object f47051d;

    public /* synthetic */ C18459n(int i, Object obj, Object obj2) {
        this.f47049b = i;
        this.f47050c = obj;
        this.f47051d = obj2;
    }

    public /* synthetic */ C18459n(LocationSettingsFixer locationSettingsFixer, MoovitActivity moovitActivity) {
        this.f47049b = 1;
        this.f47051d = locationSettingsFixer;
        this.f47050c = moovitActivity;
    }

    public final void onSuccess(Object obj) {
        TransitStop transitStop;
        switch (this.f47049b) {
            case 0:
                MoovitActivity moovitActivity = (MoovitActivity) this.f47050c;
                TransitType.VehicleType vehicleType = (TransitType.VehicleType) this.f47051d;
                List list = (List) obj;
                if (!C13717b.m34258e(list)) {
                    MotActivation motActivation = (MotActivation) C13717b.m34256c(list);
                    MotActivation.ActivationType activationType = motActivation.f38994k;
                    int i = C18462q.C18463a.f47057b[activationType.ordinal()];
                    if (i == 1 || i == 2) {
                        C18462q.m45323c(moovitActivity, activationType, vehicleType);
                        return;
                    } else if (i == 3) {
                        MotActivationStationInfo motActivationStationInfo = motActivation.f38997n;
                        if (motActivationStationInfo != null) {
                            transitStop = motActivationStationInfo.mo45574b();
                        } else {
                            transitStop = null;
                        }
                        if (transitStop == null) {
                            C18462q.m45323c(moovitActivity, activationType, vehicleType);
                            return;
                        }
                    }
                }
                C18462q.m45322b(moovitActivity, vehicleType);
                return;
            case 1:
                ((LocationSettingsFixer) this.f47051d).mo48526g((MoovitActivity) this.f47050c, (C16202a.C16203a) obj);
                return;
            case 2:
                Void voidR = (Void) obj;
                C5367a.m13473a(((C25761d) this.f47050c).f64271a).mo21147c(new Intent((String) this.f47051d));
                return;
            default:
                BaseTicketActivationActivity baseTicketActivationActivity = (BaseTicketActivationActivity) this.f47050c;
                C13011b bVar = (C13011b) obj;
                int i2 = BaseTicketActivationActivity.f23235X;
                baseTicketActivationActivity.getClass();
                TicketId ticketId = ((C12916c) this.f47051d).f31981a.f23473b;
                if (bVar != null) {
                    C23715f fVar = bVar.f32202n;
                    if (fVar != null) {
                        C12914a aVar = (C12914a) fVar;
                        String str = aVar.f31979b;
                        String str2 = aVar.f31980c;
                        int i3 = C7634b.f23238h;
                        Bundle bundle = new Bundle();
                        bundle.putString("title", str);
                        bundle.putString(InAppMessageBase.MESSAGE, str2);
                        bundle.putParcelable("ticketId", ticketId);
                        C7634b bVar2 = new C7634b();
                        bVar2.setArguments(bundle);
                        bVar2.show(baseTicketActivationActivity.getSupportFragmentManager(), "TicketProviderActivationConfirmationDialogFragment");
                        return;
                    }
                    TicketId ticketId2 = bVar.f32201m;
                    baseTicketActivationActivity.startActivity(TicketValidationActivity.m17717y2(baseTicketActivationActivity, ticketId2.f23511b, ticketId2.f23512c, ticketId2));
                    baseTicketActivationActivity.finish();
                    return;
                }
                return;
        }
    }
}
