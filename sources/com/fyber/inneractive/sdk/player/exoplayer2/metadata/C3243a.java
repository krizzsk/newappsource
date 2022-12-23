package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a */
public final class C3243a implements Parcelable {
    public static final Parcelable.Creator<C3243a> CREATOR = new C3244a();

    /* renamed from: a */
    public final C3245b[] f11715a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$a */
    public class C3244a implements Parcelable.Creator<C3243a> {
        public Object createFromParcel(Parcel parcel) {
            return new C3243a(parcel);
        }

        public Object[] newArray(int i) {
            return new C3243a[0];
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$b */
    public interface C3245b extends Parcelable {
    }

    public C3243a(List<? extends C3245b> list) {
        C3245b[] bVarArr = new C3245b[list.size()];
        this.f11715a = bVarArr;
        list.toArray(bVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3243a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11715a, ((C3243a) obj).f11715a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11715a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11715a.length);
        for (C3245b writeParcelable : this.f11715a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C3243a(Parcel parcel) {
        this.f11715a = new C3245b[parcel.readInt()];
        int i = 0;
        while (true) {
            C3245b[] bVarArr = this.f11715a;
            if (i < bVarArr.length) {
                bVarArr[i] = (C3245b) parcel.readParcelable(C3245b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
