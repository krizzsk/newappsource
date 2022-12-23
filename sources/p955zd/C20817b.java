package p955zd;

import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Comparator;

/* renamed from: zd.b */
public final /* synthetic */ class C20817b implements Comparator {

    /* renamed from: b */
    public static final C20817b f52543b = new C20817b();

    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Parcelable.Creator<Thing> creator = Thing.CREATOR;
        if (str == null) {
            return str2 != null ? -1 : 0;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
