package p977zz;

import android.content.res.Resources;
import android.net.Uri;

/* renamed from: zz.u0 */
public final class C20969u0 {
    /* renamed from: a */
    public static Uri m49110a(Resources resources, Integer num) {
        try {
            return Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m49111b(Uri uri, String str) {
        return uri != null && str.equals(uri.getScheme());
    }
}
