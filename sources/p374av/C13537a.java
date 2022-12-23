package p374av;

import android.app.Application;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.StepByStepActivity;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.mot.activation.MotActivationConfirmationActivity;
import com.moovit.app.mot.activation.MotActivationDetailsActivity;
import com.moovit.app.mot.center.MotActivationCenterActivity;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.MotQrCodeScanActivity;
import com.moovit.app.mot.purchase.MotStationEntranceActivationActivity;
import com.moovit.app.mot.purchase.MotStationEntranceOnlyActivationActivity;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.payment.registration.steps.mot.payment.MotBitConnectResultActivity;
import com.moovit.ticketing.validation.TicketValidationActivity;
import java.util.Arrays;
import java.util.HashSet;
import p882vz.C20259a;

/* renamed from: av.a */
public final class C13537a extends C20259a {

    /* renamed from: c */
    public static final HashSet f33463c = new HashSet(Arrays.asList(new Class[]{HomeActivity.class, StopDetailActivity.class, LineDetailActivity.class, ItineraryActivity.class, SuggestRoutesActivity.class, StepByStepActivity.class, MultiLegNavActivity.class, TicketValidationActivity.class, MotQrCodeScanActivity.class, MotQrCodeActivationActivity.class, MotStationEntranceActivationActivity.class, MotStationEntranceOnlyActivationActivity.class, MotStationExitActivationActivity.class, MotActivationCenterActivity.class, MotActivationConfirmationActivity.class, MotQrCodeViewerActivity.class, MotActivationDetailsActivity.class, MotBitConnectResultActivity.class, MotPaymentAccountActivity.class}));

    public C13537a(Application application) {
        super(application);
    }
}
