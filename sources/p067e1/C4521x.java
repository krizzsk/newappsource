package p067e1;

import android.app.Notification;
import android.os.Bundle;

/* renamed from: e1.x */
public final class C4521x extends C4471a0 {

    /* renamed from: a */
    public CharSequence f15619a;

    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
    }

    public final void apply(C4508n nVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((C4480d0) nVar).f15541b).setBigContentTitle(this.mBigContentTitle).bigText(this.f15619a);
        if (this.mSummaryTextSet) {
            bigText.setSummaryText(this.mSummaryText);
        }
    }

    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
