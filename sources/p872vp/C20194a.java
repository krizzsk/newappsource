package p872vp;

import android.content.Context;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.notificationsettings.MVNotificationSelection;
import com.tranzmate.moovit.protocol.notificationsettings.MVUpdateUserSettingsRequest;
import com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSetting;
import com.tranzmate.moovit.protocol.notificationsettings.MVUserNotificationSettingUpdate;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: vp.a */
public final class C20194a extends C13712f {

    /* renamed from: c */
    public boolean f51233c = true;

    public C20194a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        MVUpdateUserSettingsRequest mVUpdateUserSettingsRequest = new MVUpdateUserSettingsRequest();
        MVUserNotificationSettingUpdate mVUserNotificationSettingUpdate = new MVUserNotificationSettingUpdate();
        boolean z = this.f51233c;
        MVNotificationSelection mVNotificationSelection = new MVNotificationSelection();
        mVNotificationSelection.setField_ = MVNotificationSelection._Fields.IS_SELECTED;
        mVNotificationSelection.value_ = Boolean.valueOf(z);
        mVUserNotificationSettingUpdate.chosen = mVNotificationSelection;
        mVUserNotificationSettingUpdate.type = MVUserNotificationSetting.AccessibilityEnabled;
        if (mVUpdateUserSettingsRequest.settingsUpdate == null) {
            mVUpdateUserSettingsRequest.settingsUpdate = new ArrayList();
        }
        mVUpdateUserSettingsRequest.settingsUpdate.add(mVUserNotificationSettingUpdate);
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.UPDATE_USER_SETTINGS;
        mVServerMessage.value_ = mVUpdateUserSettingsRequest;
        return mVServerMessage;
    }
}
