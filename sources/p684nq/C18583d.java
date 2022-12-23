package p684nq;

import androidx.fragment.app.Fragment;
import c00.C13722f;
import com.google.android.gms.tasks.Task;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.ridesharing.model.EventBookingBucket;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.util.time.Time;
import p502fx.C17124i;
import p664mu.C18443f;
import p80.C12989a;
import p80.C12991b;
import p810sz.C19617r;
import p924xt.C20596g;
import t60.C19634d;
import w40.C25765g;

/* renamed from: nq.d */
public final /* synthetic */ class C18583d implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f47312b;

    public /* synthetic */ C18583d(int i) {
        this.f47312b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f47312b) {
            case 0:
                int i = C18584e.f47313w;
                if (((MotActivation) obj).f38990g == MotActivation.Status.ACTIVE) {
                    return true;
                }
                return false;
            case 1:
                return ((C20596g) obj).isEmpty();
            case 2:
                return ((Time) obj).mo24633j();
            case 3:
                Time time = (Time) obj;
                if (!time.mo24633j() || time.f23912m == null) {
                    return false;
                }
                return true;
            case 4:
                C18443f fVar = C18443f.f47013e;
                if (((MotActivation) obj).f38990g == MotActivation.Status.ACTIVE) {
                    return true;
                }
                return false;
            case 5:
                return ((EventBookingBucket) obj).f42925g.isEmpty();
            case 6:
                if (((C17124i) obj).f44327b == 1) {
                    return true;
                }
                return false;
            case 7:
                C19617r rVar = C25765g.f64279a;
                return ((Fragment) obj) instanceof C19634d;
            case 8:
                Task task = (Task) obj;
                int i2 = BaseTicketActivationActivity.f23235X;
                if (!task.isSuccessful() || task.getResult() == null) {
                    return false;
                }
                return true;
            default:
                C12991b.C12992a aVar = C12991b.f32158f;
                if (((C12989a) obj).f32156h == null) {
                    return true;
                }
                return false;
        }
    }
}
