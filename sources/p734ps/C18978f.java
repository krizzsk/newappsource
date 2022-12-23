package p734ps;

import android.content.Context;
import ce0.C21100e;
import com.moovit.app.general.settings.notifications.UserDeliverySchedule;
import com.moovit.app.general.settings.notifications.UserNotificationSetting;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.notificationsettings.MVNotificationSelection;
import com.tranzmate.moovit.protocol.notificationsettings.MVUpdateUserSettingsRequest;
import com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSetting;
import com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingOption;
import com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: ps.f */
public final class C18978f extends C13712f {

    /* renamed from: c */
    public final Map<UserNotificationSetting, Boolean> f48320c;

    /* renamed from: d */
    public final UserDeliverySchedule f48321d;

    /* renamed from: ps.f$a */
    public static /* synthetic */ class C18979a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48322a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f48323b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                com.moovit.app.general.settings.notifications.UserNotificationSetting[] r0 = com.moovit.app.general.settings.notifications.UserNotificationSetting.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48323b = r0
                r1 = 1
                com.moovit.app.general.settings.notifications.UserNotificationSetting r2 = com.moovit.app.general.settings.notifications.UserNotificationSetting.PushNotificationNewsAndUpdate     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f48323b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.general.settings.notifications.UserNotificationSetting r3 = com.moovit.app.general.settings.notifications.UserNotificationSetting.PushNotificationMyFavorite     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f48323b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.general.settings.notifications.UserNotificationSetting r4 = com.moovit.app.general.settings.notifications.UserNotificationSetting.PushNotificationServiceAlert     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f48323b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.general.settings.notifications.UserNotificationSetting r4 = com.moovit.app.general.settings.notifications.UserNotificationSetting.PushNotificationMobileTicketing     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f48323b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.app.general.settings.notifications.UserNotificationSetting r4 = com.moovit.app.general.settings.notifications.UserNotificationSetting.PushNotificationStopGeofence     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.moovit.app.general.settings.notifications.UserDeliverySchedule[] r3 = com.moovit.app.general.settings.notifications.UserDeliverySchedule.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f48322a = r3
                com.moovit.app.general.settings.notifications.UserDeliverySchedule r4 = com.moovit.app.general.settings.notifications.UserDeliverySchedule.CommuteHours     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f48322a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.moovit.app.general.settings.notifications.UserDeliverySchedule r3 = com.moovit.app.general.settings.notifications.UserDeliverySchedule.Never     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f48322a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.moovit.app.general.settings.notifications.UserDeliverySchedule r1 = com.moovit.app.general.settings.notifications.UserDeliverySchedule.AnyTime     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p734ps.C18978f.C18979a.<clinit>():void");
        }
    }

    public C18978f(Context context, TreeMap treeMap, UserDeliverySchedule userDeliverySchedule) {
        super(context);
        C21100e.m49373x(treeMap, "settings");
        this.f48320c = treeMap;
        C21100e.m49373x(userDeliverySchedule, "userDeliverySchedule");
        this.f48321d = userDeliverySchedule;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        MVUserNotificationSetting mVUserNotificationSetting;
        MVUserNotificationSettingOption mVUserNotificationSettingOption;
        MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = new MVUpdateUserSettingsRequest();
        for (Map.Entry next : this.f48320c.entrySet()) {
            UserNotificationSetting userNotificationSetting = (UserNotificationSetting) next.getKey();
            MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = new MVUserNotificationSettingUpdate();
            int i = C18979a.f48323b[userNotificationSetting.ordinal()];
            if (i == 1) {
                mVUserNotificationSetting = MVUserNotificationSetting.PushNotificationNewsAndUpdate;
            } else if (i == 2) {
                mVUserNotificationSetting = MVUserNotificationSetting.PushNotificationMyFavorite;
            } else if (i == 3) {
                mVUserNotificationSetting = MVUserNotificationSetting.PushNotificationServiceAlert;
            } else if (i == 4) {
                mVUserNotificationSetting = MVUserNotificationSetting.PushNotificationMobileTicketing;
            } else if (i != 5) {
                mVUserNotificationSetting = null;
            } else {
                mVUserNotificationSetting = MVUserNotificationSetting.PushNotificationStopGeofence;
            }
            mVUserNotificationSettingUpdate.type = mVUserNotificationSetting;
            if (userNotificationSetting != UserNotificationSetting.PushNotificationMobileTicketing && userNotificationSetting != UserNotificationSetting.PushNotificationServiceAlert && userNotificationSetting != UserNotificationSetting.PushNotificationMyFavorite && userNotificationSetting != UserNotificationSetting.PushNotificationNewsAndUpdate && userNotificationSetting != UserNotificationSetting.PushNotificationStopGeofence) {
                boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                MVNotificationSelection mVNotificationSelection = new MVNotificationSelection();
                mVNotificationSelection.setField_ = MVNotificationSelection._Fields.IS_SELECTED;
                mVNotificationSelection.value_ = Boolean.valueOf(booleanValue);
                mVUserNotificationSettingUpdate.chosen = mVNotificationSelection;
            } else if (UserDeliverySchedule.Never.equals(this.f48321d)) {
                MVNotificationSelection mVNotificationSelection2 = new MVNotificationSelection();
                mVNotificationSelection2.setField_ = MVNotificationSelection._Fields.IS_SELECTED;
                mVNotificationSelection2.value_ = Boolean.FALSE;
                mVUserNotificationSettingUpdate.chosen = mVNotificationSelection2;
            } else if (((Boolean) next.getValue()).booleanValue()) {
                MVNotificationSelection mVNotificationSelection3 = new MVNotificationSelection();
                int i2 = C18979a.f48322a[this.f48321d.ordinal()];
                if (i2 == 1) {
                    mVUserNotificationSettingOption = MVUserNotificationSettingOption.CommuteHours;
                } else if (i2 != 2) {
                    mVUserNotificationSettingOption = MVUserNotificationSettingOption.AnyTime;
                } else {
                    mVUserNotificationSettingOption = MVUserNotificationSettingOption.Never;
                }
                mVUserNotificationSettingOption.getClass();
                mVNotificationSelection3.setField_ = MVNotificationSelection._Fields.ADVANCE_SELECTION;
                mVNotificationSelection3.value_ = mVUserNotificationSettingOption;
                mVUserNotificationSettingUpdate.chosen = mVNotificationSelection3;
            } else {
                MVNotificationSelection mVNotificationSelection4 = new MVNotificationSelection();
                mVNotificationSelection4.setField_ = MVNotificationSelection._Fields.IS_SELECTED;
                mVNotificationSelection4.value_ = Boolean.FALSE;
                mVUserNotificationSettingUpdate.chosen = mVNotificationSelection4;
            }
            if (mVUpdateUserSettingsRequest.settingsUpdate == null) {
                mVUpdateUserSettingsRequest.settingsUpdate = new ArrayList();
            }
            mVUpdateUserSettingsRequest.settingsUpdate.add(mVUserNotificationSettingUpdate);
        }
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.UPDATE_USER_SETTINGS;
        mVServerMessage.value_ = mVUpdateUserSettingsRequest;
        return mVServerMessage;
    }
}
