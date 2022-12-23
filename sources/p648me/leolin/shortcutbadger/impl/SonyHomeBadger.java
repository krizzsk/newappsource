package p648me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import ei0.C23314a;
import fi0.C23394f;
import java.util.Arrays;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: me.leolin.shortcutbadger.impl.SonyHomeBadger */
public class SonyHomeBadger implements C23314a {

    /* renamed from: a */
    public final Uri f61637a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    public C23394f f61638b;

    /* renamed from: a */
    public final List<String> mo58444a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        boolean z2 = false;
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            if (i > 0) {
                z2 = true;
            }
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z2);
            context.sendBroadcast(intent);
        } else if (i >= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i));
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f61638b == null) {
                    this.f61638b = new C23394f(context.getApplicationContext().getContentResolver());
                }
                this.f61638b.startInsert(0, (Object) null, this.f61637a, contentValues);
                return;
            }
            context.getApplicationContext().getContentResolver().insert(this.f61637a, contentValues);
        }
    }
}
