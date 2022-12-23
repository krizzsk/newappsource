package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

/* renamed from: bo.app.v */
public class C1705v {

    /* renamed from: b */
    public static final String f6034b = AppboyLogger.getBrazeLogTag(C1705v.class);

    /* renamed from: a */
    public final SharedPreferences f6035a;

    public C1705v(Context context) {
        this.f6035a = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
    }

    /* renamed from: a */
    public String mo6406a() {
        String string = this.f6035a.getString("last_user", "");
        if (StringUtils.getByteSize(string) <= 997) {
            return string;
        }
        String str = f6034b;
        AppboyLogger.m5459w(str, "Stored user ID is longer than 997 bytes. Truncating. Original user ID: " + string);
        String truncateToByteLength = StringUtils.truncateToByteLength(string, 997);
        mo6407a(truncateToByteLength);
        return truncateToByteLength;
    }

    /* renamed from: a */
    public void mo6407a(String str) {
        if (StringUtils.getByteSize(str) > 997) {
            String str2 = f6034b;
            AppboyLogger.m5459w(str2, "Offline user storage provider was given user ID longer than 997 . Rejecting. User ID: " + str);
            return;
        }
        StringUtils.checkNotNullOrEmpty(str);
        SharedPreferences.Editor edit = this.f6035a.edit();
        edit.putString("last_user", str);
        edit.apply();
    }
}
