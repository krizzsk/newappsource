package p434dd;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dd.l0 */
public final class C16564l0 {

    /* renamed from: a */
    public static final /* synthetic */ int f43221a = 0;

    static {
        C16564l0.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m42065a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
