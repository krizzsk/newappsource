package p732pq;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: pq.m */
public final /* synthetic */ class C18953m implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ NotifyDriverLineSelectionActivity f48258b;

    /* renamed from: c */
    public final /* synthetic */ ServerId f48259c;

    /* renamed from: d */
    public final /* synthetic */ ServerId f48260d;

    /* renamed from: e */
    public final /* synthetic */ LongServerId f48261e;

    public /* synthetic */ C18953m(NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity, ServerId serverId, ServerId serverId2, LongServerId longServerId) {
        this.f48258b = notifyDriverLineSelectionActivity;
        this.f48259c = serverId;
        this.f48260d = serverId2;
        this.f48261e = longServerId;
    }

    public final void onComplete(Task task) {
        NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity = this.f48258b;
        ServerId serverId = this.f48259c;
        ServerId serverId2 = this.f48260d;
        LongServerId longServerId = this.f48261e;
        int i = NotifyDriverLineSelectionActivity.f37425r0;
        notifyDriverLineSelectionActivity.getClass();
        if (!task.isSuccessful() || !((Boolean) task.getResult()).booleanValue()) {
            C18956p pVar = new C18956p(notifyDriverLineSelectionActivity.f37433o0, notifyDriverLineSelectionActivity.mo44548x1(), serverId, serverId2, longServerId);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C18956p.class, sb, "#");
            sb.append(pVar.f48265w);
            sb.append("#");
            sb.append(pVar.f48266x);
            sb.append("#");
            sb.append(pVar.f48267y);
            sb.append("#");
            sb.append(pVar.f48268z);
            String sb2 = sb.toString();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            notifyDriverLineSelectionActivity.mo44527k2(sb2, pVar, requestOptions, notifyDriverLineSelectionActivity.f37435q0);
            return;
        }
        notifyDriverLineSelectionActivity.mo44506I1();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "driver_already_notified_dialog_show");
        notifyDriverLineSelectionActivity.mo44545v2(aVar.mo49933a());
        new AlertDialogFragment.C15856a((Context) notifyDriverLineSelectionActivity).mo47683l(R.string.connect_to_driver_already_notified_error_title).mo47678g(R.string.connect_to_driver_already_notified_error_message).mo47681j(R.string.got_it).mo47673b().show(notifyDriverLineSelectionActivity.getSupportFragmentManager(), (String) null);
    }
}
