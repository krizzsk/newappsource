package p853uu;

import android.content.Context;
import android.location.Location;
import c00.C13717b;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.p417qr.C15174a;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import p736pu.C19006n;
import p824tp.C19728f;

/* renamed from: uu.g */
public final class C19997g extends LocationSettingsFixer.C16200b {

    /* renamed from: d */
    public final /* synthetic */ C15174a f50841d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19997g(C15174a aVar, Context context) {
        super(context);
        this.f50841d = aVar;
    }

    /* renamed from: b */
    public final void mo23896b(Location location) {
        MotActivation motActivation;
        MotActivationStationInfo motActivationStationInfo;
        if (location == null || location.isFromMockProvider()) {
            C15174a aVar = this.f50841d;
            int i = C15174a.f39086r;
            if (aVar.f40824e) {
                AlertDialogFragment.C15856a aVar2 = new AlertDialogFragment.C15856a(aVar.requireContext());
                aVar2.mo47676e(R.drawable.img_empty_warning, false);
                aVar2.mo47683l(R.string.payment_mot_train_no_location_error_title).mo47678g(R.string.payment_mot_train_no_location_error_subtitle).mo47681j(R.string.std_positive_button).mo47673b().show(aVar.getChildFragmentManager(), (String) null);
                return;
            }
            return;
        }
        C15174a aVar3 = this.f50841d;
        LatLonE6 j = LatLonE6.m40177j(location);
        if (aVar3.f39090q == null && aVar3.mo46785T1("METRO_CONTEXT") && (motActivationStationInfo = motActivation.f38997n) != null) {
            aVar3.mo46796i2();
            String str = (motActivation = (MotActivation) C13717b.m34256c(aVar3.f39089p)).f38989f;
            C19006n nVar = new C19006n(aVar3.mo46783R1(), (C19728f) aVar3.mo46776J1("METRO_CONTEXT"), j, motActivationStationInfo.mo45575c(), str, false);
            RequestOptions L1 = aVar3.mo46777L1();
            L1.f42909f = true;
            aVar3.f39090q = aVar3.mo46793f2(C19006n.class.getName() + nVar.f51768k, nVar, L1, aVar3.f39087n);
        }
    }
}
