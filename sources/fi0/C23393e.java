package fi0;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import ei0.C23314a;
import gi0.C23421a;
import java.util.Arrays;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;
import p648me.leolin.shortcutbadger.impl.DefaultBadger;

/* renamed from: fi0.e */
public final class C23393e implements C23314a {

    /* renamed from: b */
    public static final String[] f59169b = {"_id", "class"};

    /* renamed from: a */
    public DefaultBadger f59170a = new DefaultBadger();

    /* renamed from: c */
    public static ContentValues m57510c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    /* renamed from: a */
    public final List<String> mo58444a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        if (this.f59170a != null) {
            if (C23421a.m57548a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() > 0 || (Build.VERSION.SDK_INT >= 26 && C23421a.m57548a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f59170a.mo58445b(context, componentName, i);
                return;
            }
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f59169b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z2 = false;
                while (cursor.moveToNext()) {
                    int i2 = cursor.getInt(0);
                    contentResolver.update(parse, m57510c(componentName, i, false), "_id=?", new String[]{String.valueOf(i2)});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    contentResolver.insert(parse, m57510c(componentName, i, true));
                }
            }
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }
}
