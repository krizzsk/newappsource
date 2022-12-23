package p574iy;

import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.useraccount.notifications.C15628a;
import com.moovit.app.useraccount.notifications.UserNotificationsCenterActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.gcm.notification.GcmNotification;
import d90.C12608b;
import p543hq.C17474b;

/* renamed from: iy.a */
public final /* synthetic */ class C17678a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f45428b = 0;

    /* renamed from: c */
    public final /* synthetic */ int f45429c;

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.Adapter f45430d;

    /* renamed from: e */
    public final /* synthetic */ Object f45431e;

    public /* synthetic */ C17678a(C15628a aVar, int i, GcmNotification gcmNotification) {
        this.f45430d = aVar;
        this.f45429c = i;
        this.f45431e = gcmNotification;
    }

    public /* synthetic */ C17678a(C12608b.C12609a aVar, ListItemView listItemView, int i) {
        this.f45430d = aVar;
        this.f45431e = listItemView;
        this.f45429c = i;
    }

    public final void onClick(View view) {
        switch (this.f45428b) {
            case 0:
                int i = this.f45429c;
                GcmNotification gcmNotification = (GcmNotification) this.f45431e;
                C15628a.C15629a aVar = ((C15628a) this.f45430d).f40628i;
                if (aVar != null) {
                    UserNotificationsCenterActivity userNotificationsCenterActivity = (UserNotificationsCenterActivity) aVar;
                    userNotificationsCenterActivity.f40617U.f44338d.mo49717a(gcmNotification);
                    userNotificationsCenterActivity.f40618X.notifyItemChanged(i);
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "notification_clicked");
                    aVar2.mo49939g(AnalyticsAttributeKey.PUSH_ID, gcmNotification.f41524g.f41546b);
                    userNotificationsCenterActivity.mo44545v2(aVar2.mo49933a());
                    gcmNotification.f41524g.mo47976b(userNotificationsCenterActivity.f40621l0);
                    return;
                }
                return;
            default:
                C12608b.C12609a aVar3 = (C12608b.C12609a) this.f45430d;
                ListItemView listItemView = (ListItemView) this.f45431e;
                int i2 = this.f45429c;
                aVar3.getClass();
                listItemView.toggle();
                aVar3.f31164i.put(i2, listItemView.isChecked());
                C12608b bVar = C12608b.this;
                SparseBooleanArray sparseBooleanArray = aVar3.f31164i;
                int i3 = C12608b.f31159r;
                bVar.getClass();
                int i4 = 0;
                while (true) {
                    if (i4 >= sparseBooleanArray.size()) {
                        bVar.f31161q.setEnabled(false);
                    } else if (sparseBooleanArray.valueAt(i4)) {
                        bVar.f31161q.setEnabled(true);
                    } else {
                        i4++;
                    }
                }
                aVar3.notifyDataSetChanged();
                return;
        }
    }
}
