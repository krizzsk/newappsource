package p734ps;

import com.moovit.MoovitApplication;
import com.moovit.app.general.settings.notifications.UserDeliverySchedule;
import com.moovit.app.general.settings.notifications.UserNotificationSetting;
import p528gz.C17272g;
import p528gz.C17289h;

/* renamed from: ps.d */
public final class C18976d extends C17289h {
    public C18976d(MoovitApplication<?, ?, ?> moovitApplication) {
        super(moovitApplication);
    }

    public final void onSuccess(Object obj) {
        boolean z;
        C17272g.C17277e eVar = (C17272g.C17277e) obj;
        C18977e a = C18977e.m46090a(this.f44667b);
        UserDeliverySchedule c = a.mo51489c();
        C17272g.C17284l lVar = C17272g.f44657q;
        if (!Boolean.TRUE.equals((Boolean) a.mo51488b().get(UserNotificationSetting.PushNotificationNewsAndUpdate)) || (!c.equals(UserDeliverySchedule.AnyTime) && !c.equals(UserDeliverySchedule.CommuteHours))) {
            z = false;
        } else {
            z = true;
        }
        eVar.mo49818a(lVar, Boolean.valueOf(z));
    }
}
