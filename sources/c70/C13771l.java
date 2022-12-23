package c70;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import c70.C13756i;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.network.model.ServerId;
import com.moovit.network.request.UnexpectedInterlocutorException;
import com.moovit.request.MetroIdMismatchException;
import com.moovit.request.MetroRevisionMismatchException;
import com.moovit.request.RequestOptions;
import com.moovit.request.ServerBusyException;
import com.moovit.request.UserRequestError;
import g30.C4789q;
import h30.C5047a;
import java.io.IOException;
import java.net.HttpURLConnection;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19722a0;
import p824tp.C19728f;
import p824tp.C19739q;
import p824tp.C19746x;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: c70.l */
public class C13771l extends Fragment implements C13756i.C13760d {

    /* renamed from: b */
    public C13756i f33908b;

    /* renamed from: c */
    public MoovitActivity f33909c;

    /* renamed from: N */
    public final void mo40691N(C20431c cVar, ServerException serverException, boolean z) {
        MoovitActivity moovitActivity = this.f33909c;
        moovitActivity.getClass();
        if (serverException instanceof MetroRevisionMismatchException) {
            MetroRevisionMismatchException metroRevisionMismatchException = (MetroRevisionMismatchException) serverException;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.METRO_CRITICAL_MISMATCH);
            aVar.mo49935c(AnalyticsAttributeKey.METRO_ID, metroRevisionMismatchException.mo49154b().f15142b);
            aVar.mo49936d(AnalyticsAttributeKey.METRO_REVISION, metroRevisionMismatchException.mo49153a());
            aVar.mo49935c(AnalyticsAttributeKey.REQUEST_SEQUENCE_ID, ((C13746a) cVar).f33832t);
            moovitActivity.mo44545v2(aVar.mo49933a());
            moovitActivity.mo44505H1(metroRevisionMismatchException);
        } else if (serverException instanceof ServerBusyException) {
            if (!z) {
                Toast.makeText(moovitActivity, C19746x.server_busy_error_message, 1).show();
            }
            moovitActivity.mo44544v1();
        } else if (serverException instanceof UserRequestError) {
            UserRequestError userRequestError = (UserRequestError) serverException;
            if (!z) {
                Toast.makeText(moovitActivity, userRequestError.mo49161c(), 1).show();
            }
            moovitActivity.mo44544v1();
            userRequestError.getClass();
        } else if (serverException instanceof UnexpectedInterlocutorException) {
            C16596f.m42113a().mo49364c(serverException);
            if (!z && ((AlertDialogFragment) moovitActivity.getSupportFragmentManager().mo3923A("UNEXPECTED_INTERLOCUTOR_FRAGMENT")) == null) {
                AlertDialogFragment.C15856a aVar2 = new AlertDialogFragment.C15856a((Context) moovitActivity);
                aVar2.mo47676e(C19739q.img_empty_warning, false);
                moovitActivity.mo44531o2(aVar2.mo47683l(C19746x.unexpected_interlocutor_title).mo47678g(C19746x.unexpected_interlocutor_message).mo47680i(C19746x.std_negative_button).mo47681j(C19746x.unexpected_interlocutor_open_browser).mo47682k("UNEXPECTED_INTERLOCUTOR_FRAGMENT").mo47673b(), "UNEXPECTED_INTERLOCUTOR_FRAGMENT");
            }
        } else if (serverException instanceof MetroIdMismatchException) {
            MetroIdMismatchException metroIdMismatchException = (MetroIdMismatchException) serverException;
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.METRO_ID_MISMATCH);
            aVar3.mo49937e(AnalyticsAttributeKey.FROM_METRO, metroIdMismatchException.mo49151a());
            aVar3.mo49937e(AnalyticsAttributeKey.TO_METRO, metroIdMismatchException.mo49152b());
            aVar3.mo49935c(AnalyticsAttributeKey.REQUEST_SEQUENCE_ID, ((C13746a) cVar).f33832t);
            moovitActivity.mo44545v2(aVar3.mo49933a());
            moovitActivity.mo44503B1(metroIdMismatchException);
        }
    }

    /* renamed from: Y */
    public final void mo40692Y(C20431c cVar, IOException iOException, boolean z) {
        MoovitActivity moovitActivity = this.f33909c;
        if (!z) {
            moovitActivity.getClass();
            Toast.makeText(moovitActivity, C19746x.response_read_error_message, 1).show();
        }
        moovitActivity.mo44544v1();
        cVar.getClass();
        iOException.getMessage();
    }

    /* renamed from: a */
    public final void mo40693a() {
    }

    /* renamed from: c */
    public final void mo40694c(C20431c cVar, C20436g gVar) {
        C19728f a;
        MoovitActivity moovitActivity = this.f33909c;
        moovitActivity.getClass();
        if (!(cVar instanceof C5047a) && (cVar instanceof C13746a) && (gVar instanceof C13747b)) {
            C13746a aVar = (C13746a) cVar;
            C13747b bVar = (C13747b) gVar;
            C19722a0 a0Var = aVar.f33829q.f33853b;
            if (a0Var != null) {
                ServerId serverId = a0Var.f50160a.f32927c;
                ServerId serverId2 = bVar.f33833f;
                if (serverId2 != null && serverId2.equals(serverId) && (a = C19728f.m47195a(moovitActivity.getApplicationContext())) != null && serverId.equals(a.f50165a.f16126a)) {
                    long j = bVar.f33834g;
                    if (j > a.f50165a.f16127b) {
                        C4789q.m12121c("mismatch_hint", serverId, j);
                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.METRO_REVISION_MISMATCH);
                        aVar2.mo49935c(AnalyticsAttributeKey.METRO_ID, serverId.f15142b);
                        aVar2.mo49936d(AnalyticsAttributeKey.METRO_REVISION, j);
                        aVar2.mo49935c(AnalyticsAttributeKey.REQUEST_SEQUENCE_ID, aVar.f33832t);
                        moovitActivity.mo44545v2(aVar2.mo49933a());
                    }
                }
            }
        }
    }

    /* renamed from: m0 */
    public final void mo40695m0(C20431c<?, ?> cVar, IOException iOException, boolean z) {
        if (!z) {
            MoovitActivity moovitActivity = this.f33909c;
            moovitActivity.getClass();
            Toast.makeText(moovitActivity, C19746x.request_send_error_message, 1).show();
            moovitActivity.mo44544v1();
            cVar.getClass();
            iOException.getMessage();
        }
    }

    /* renamed from: o0 */
    public final void mo40696o0(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, BadResponseException badResponseException) {
        MoovitActivity moovitActivity = this.f33909c;
        moovitActivity.getClass();
        moovitActivity.mo44509L1("Request URL: " + httpURLConnection.getURL().toString());
        C16596f.m42113a().mo49364c(new BadResponseException("Activity bad response", badResponseException));
        Toast.makeText(moovitActivity, badResponseException.getMessage(), 0).show();
    }

    public final void onAttach(Activity activity) {
        if (activity instanceof MoovitActivity) {
            super.onAttach(activity);
            MoovitActivity moovitActivity = (MoovitActivity) activity;
            this.f33909c = moovitActivity;
            C13756i iVar = this.f33908b;
            if (iVar != null) {
                moovitActivity.getClass();
                iVar.mo40685h(new C13752e(moovitActivity, (C19722a0) MoovitApplication.f37317k.mo44557i("USER_CONTEXT"), moovitActivity.f37306O));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("RequestManagerFragment can only be used as part of a MoovitActivity");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        C13756i iVar = new C13756i((RequestOptions) getArguments().getParcelable("defaultRequestOptions"), this);
        this.f33908b = iVar;
        MoovitActivity moovitActivity = this.f33909c;
        moovitActivity.getClass();
        iVar.mo40685h(new C13752e(moovitActivity, (C19722a0) MoovitApplication.f37317k.mo44557i("USER_CONTEXT"), moovitActivity.f37306O));
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f33908b.mo40683f();
    }

    public final void onDetach() {
        super.onDetach();
        this.f33909c = null;
        this.f33908b.mo40685h((C13752e) null);
    }
}
