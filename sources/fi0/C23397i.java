package fi0;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ei0.C23314a;
import java.util.Collections;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: fi0.i */
public final class C23397i implements C23314a {

    /* renamed from: a */
    public final Uri f59171a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public final List<String> mo58444a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f59171a, "setAppBadgeCount", (String) null, bundle);
    }
}
