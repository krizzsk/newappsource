package p756qt;

import android.view.View;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.tod.C15462b;
import com.moovit.location.C16202a;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.ticketing.validation.receipt.offline.TicketReceiptSyncManager;
import com.tranzmate.R;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import p259t5.C6592b;
import p259t5.C6593c;
import p297w5.C6994a;
import y80.C13265d;

/* renamed from: qt.e */
public final /* synthetic */ class C19176e implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f48761b;

    /* renamed from: c */
    public final /* synthetic */ Object f48762c;

    public /* synthetic */ C19176e(Object obj, int i) {
        this.f48761b = i;
        this.f48762c = obj;
    }

    public final void onSuccess(Object obj) {
        boolean z;
        boolean z2;
        switch (this.f48761b) {
            case 0:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f48762c;
                C16202a.C16203a aVar = (C16202a.C16203a) obj;
                int i = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                boolean z3 = true;
                if (aVar == null || !aVar.mo48507a()) {
                    z = false;
                } else {
                    z = true;
                }
                if (aVar == null || !aVar.mo48509c()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (aVar == null || !aVar.mo48508b()) {
                    z3 = false;
                }
                if (z && z2) {
                    userCreationFailureActivity.mo45253z2("location_not_detected");
                    userCreationFailureActivity.setContentView((int) R.layout.location_not_detected_layout);
                    userCreationFailureActivity.findViewById(R.id.location_not_detected).findViewById(R.id.primary_button).setOnClickListener(new C6994a(userCreationFailureActivity, 11));
                    return;
                } else if (z3) {
                    userCreationFailureActivity.mo45253z2("location_services_unavailable");
                    userCreationFailureActivity.setContentView((int) R.layout.location_service_off_layout);
                    View findViewById = userCreationFailureActivity.findViewById(R.id.location_service_off);
                    findViewById.findViewById(R.id.primary_button).setOnClickListener(new C6593c(userCreationFailureActivity, 13));
                    findViewById.findViewById(R.id.secondary_button).setOnClickListener(new C4054t(2, userCreationFailureActivity, aVar));
                    return;
                } else {
                    userCreationFailureActivity.mo45253z2("location_services_unavailable_permanently");
                    userCreationFailureActivity.setContentView((int) R.layout.location_services_not_present_layout);
                    userCreationFailureActivity.findViewById(R.id.location_services_not_present).findViewById(R.id.primary_button).setOnClickListener(new C6592b(userCreationFailureActivity, 15));
                    return;
                }
            case 1:
                int i2 = C15462b.f40053x;
                ((C15462b) this.f48762c).mo46205p2((PaymentAccount) obj);
                return;
            default:
                C12887v vVar = (C12887v) this.f48762c;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                vVar.getClass();
                if (((C13265d) obj).f32915m) {
                    TicketReceiptSyncManager.m17739a(vVar.f31895a);
                    return;
                }
                return;
        }
    }
}
