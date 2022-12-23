package android.support.p015v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0169a();

    /* renamed from: b */
    public int f463b;

    /* renamed from: c */
    public int f464c;

    /* renamed from: d */
    public int f465d;

    /* renamed from: e */
    public int f466e;

    /* renamed from: f */
    public int f467f;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public class C0169a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f463b = parcel.readInt();
        this.f465d = parcel.readInt();
        this.f466e = parcel.readInt();
        this.f467f = parcel.readInt();
        this.f464c = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f463b);
        parcel.writeInt(this.f465d);
        parcel.writeInt(this.f466e);
        parcel.writeInt(this.f467f);
        parcel.writeInt(this.f464c);
    }
}
