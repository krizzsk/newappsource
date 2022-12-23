package p239rb;

import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.util.time.Time;
import com.moovit.view.address.AddressInputView;
import com.veriff.sdk.internal.C22719xz;
import java.util.Comparator;
import p713ov.C18841h;
import p810sz.C19617r;
import p977zz.C20944i0;
import p977zz.C20975x0;
import w40.C25765g;

/* renamed from: rb.j */
public final /* synthetic */ class C6298j implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f19926b;

    public /* synthetic */ C6298j(int i) {
        this.f19926b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f19926b) {
            case 0:
                return Long.compare(((C6289e) obj).f19897b, ((C6289e) obj2).f19897b);
            case 1:
                int i = C18841h.f47970s;
                return Long.compare(((EventBookingOption) obj).f42928c, ((EventBookingOption) obj2).f42928c);
            case 2:
                int i2 = LineServiceAlertDigestView.f39539m;
                return C20975x0.m49116c(((LineServiceAlertDigest) obj).f23186c.f23213b, ((LineServiceAlertDigest) obj2).f23186c.f23213b);
            case 3:
                return Long.compare(((Time) ((C20944i0) obj).f52693b).f23901b, ((Time) ((C20944i0) obj2).f52693b).f23901b);
            case 4:
                C19617r rVar = C25765g.f64279a;
                return ((PaymentAccountProfile) obj).f64035d.compareTo(((PaymentAccountProfile) obj2).f64035d);
            case 5:
                int i3 = AddressInputView.f24023t;
                return ((AddressInputView.C7938e) obj).f24040a.compareTo(((AddressInputView.C7938e) obj2).f24040a);
            default:
                return C22719xz.m55467a((String) obj, (String) obj2);
        }
    }
}
