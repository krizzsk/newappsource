package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p022b3.C1463c;
import p022b3.C1464d;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1336a();

    /* renamed from: b */
    public final C1464d f5035b;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C1336a implements Parcelable.Creator<ParcelImpl> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f5035b = new C1463c(parcel).mo5805n();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new C1463c(parcel).mo5814w(this.f5035b);
    }
}
