package p734ps;

import android.content.DialogInterface;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.general.settings.notifications.NotificationSettingsActivity;
import com.moovit.app.general.settings.notifications.UserDeliverySchedule;
import java.util.List;
import p543hq.C17474b;

/* renamed from: ps.a */
public final /* synthetic */ class C18972a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C18974c f48306b;

    /* renamed from: c */
    public final /* synthetic */ List f48307c;

    public /* synthetic */ C18972a(C18974c cVar, List list) {
        this.f48306b = cVar;
        this.f48307c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C18974c cVar = this.f48306b;
        List list = this.f48307c;
        int i2 = C18974c.f48310h;
        cVar.getClass();
        UserDeliverySchedule userDeliverySchedule = (UserDeliverySchedule) list.get(i);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_ITEM, userDeliverySchedule.analyticsName);
        cVar.mo22564R1(aVar.mo49933a());
        NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) cVar.f40792c;
        notificationSettingsActivity.f38061Z.setSubtitle(userDeliverySchedule.name);
        C18977e.f48313c.mo49545d(notificationSettingsActivity.f38058U.f48319a, Integer.valueOf(userDeliverySchedule.ordinal()));
        notificationSettingsActivity.mo45009z2(userDeliverySchedule);
        dialogInterface.dismiss();
    }
}
