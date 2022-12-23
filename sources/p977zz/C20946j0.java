package p977zz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zz.j0 */
public final class C20946j0 {
    /* renamed from: a */
    public static <P extends Parcelable> ArrayList<P> m49054a(Parcel parcel, Class<P> cls) {
        ArrayList<P> arrayList = new ArrayList<>();
        if (C20943i.m49051d(29)) {
            parcel.readParcelableList(arrayList, cls.getClassLoader());
        } else {
            parcel.readList(arrayList, cls.getClassLoader());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m49055b(int i, Parcel parcel, List list) {
        if (C20943i.m49051d(29)) {
            parcel.writeParcelableList(list, i);
        } else {
            parcel.writeList(list);
        }
    }
}
