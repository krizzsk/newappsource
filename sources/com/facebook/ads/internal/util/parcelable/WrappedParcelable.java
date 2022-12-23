package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new C2313a();

    /* renamed from: b */
    public final byte[] f8483b;

    /* renamed from: com.facebook.ads.internal.util.parcelable.WrappedParcelable$a */
    public class C2313a implements Parcelable.Creator<WrappedParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        public final Object[] newArray(int i) {
            return new WrappedParcelable[i];
        }
    }

    public WrappedParcelable(Parcel parcel) {
        this.f8483b = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f8483b;
        if (bArr == null) {
            return null;
        }
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        return readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f8483b);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f8483b = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f8483b = bArr;
    }
}
