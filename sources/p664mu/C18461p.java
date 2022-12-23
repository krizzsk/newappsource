package p664mu;

import android.content.Context;
import c00.C13717b;
import c00.C13723g;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitActivity;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.ticketing.ticket.C7758e;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p589jq.C17910b;
import p645ly.C18298a;
import p905wy.C20427a;

/* renamed from: mu.p */
public final /* synthetic */ class C18461p implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f47054b;

    /* renamed from: c */
    public final /* synthetic */ Object f47055c;

    public /* synthetic */ C18461p(Object obj, int i) {
        this.f47054b = i;
        this.f47055c = obj;
    }

    public final void onComplete(Task task) {
        List list;
        switch (this.f47054b) {
            case 0:
                MoovitActivity moovitActivity = (MoovitActivity) this.f47055c;
                if (!task.isSuccessful() || task.getResult() == null) {
                    list = Collections.emptyList();
                } else {
                    list = (List) task.getResult();
                }
                if (!C13717b.m34258e(list) && C13723g.m34280a(list, new C17910b(4))) {
                    moovitActivity.startActivity(MotStationExitActivationActivity.m38689y2(moovitActivity, list));
                    return;
                }
                return;
            case 1:
                C18298a aVar = (C18298a) this.f47055c;
                int i = C18298a.f46661d;
                aVar.getClass();
                try {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) task.getResult(ApiException.class);
                    if (googleSignInAccount == null) {
                        aVar.mo50585K1(-9999, "null GoogleSignInAccount");
                        return;
                    } else if (aVar.f46662c != null) {
                        aVar.mo50583I1(googleSignInAccount.getId(), googleSignInAccount.getIdToken());
                        return;
                    } else {
                        return;
                    }
                } catch (ApiException e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode != 12501) {
                        aVar.mo50585K1(statusCode, GoogleSignInStatusCodes.getStatusCodeString(statusCode));
                        return;
                    }
                    return;
                }
            case 2:
                WondoRewardsActivity wondoRewardsActivity = (WondoRewardsActivity) this.f47055c;
                int i2 = WondoRewardsActivity.f40774Z;
                wondoRewardsActivity.getClass();
                if (!task.isSuccessful() || task.getResult() == null) {
                    wondoRewardsActivity.f40777Y.mo4627l0(wondoRewardsActivity.f40776X);
                    return;
                }
                List list2 = (List) task.getResult();
                if (C13717b.m34258e(list2)) {
                    wondoRewardsActivity.f40777Y.mo4627l0(wondoRewardsActivity.f40775U);
                    return;
                } else {
                    wondoRewardsActivity.f40777Y.mo4627l0(new C20427a(wondoRewardsActivity, list2));
                    return;
                }
            case 3:
                Context context = (Context) this.f47055c;
                if (task.isSuccessful()) {
                    ProfilerLog.m41879c(context).mo49244b("FusedLocationClientCommands", "removeLocationUpdates-completed successfully");
                    return;
                }
                ProfilerLog c = ProfilerLog.m41879c(context);
                StringBuilder k = C13555b.m33972k("removeLocationUpdates-failed with error ");
                k.append(task.getException());
                c.mo49244b("FusedLocationClientCommands", k.toString());
                Objects.toString(task.getException());
                return;
            default:
                ((C7758e) this.f47055c).f23540p.setRefreshing(false);
                return;
        }
    }
}
