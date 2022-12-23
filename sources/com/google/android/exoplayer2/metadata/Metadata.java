package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import p099ga.C4910k0;
import p277ub.C6774a0;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C3945a();

    /* renamed from: b */
    public final Entry[] f13864b;

    public interface Entry extends Parcelable {
        /* renamed from: X1 */
        byte[] mo16090X1();

        /* renamed from: c2 */
        void mo16091c2(C4910k0.C4911a aVar);

        /* renamed from: d0 */
        Format mo16092d0();
    }

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    public class C3945a implements Parcelable.Creator<Metadata> {
        public final Object createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        public final Object[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f13864b = entryArr;
    }

    /* renamed from: b */
    public final Metadata mo16084b(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        Entry[] entryArr2 = this.f13864b;
        int i = C6774a0.f20959a;
        Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
        return new Metadata((Entry[]) copyOf);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13864b, ((Metadata) obj).f13864b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13864b);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f13864b));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13864b.length);
        for (Entry writeParcelable : this.f13864b) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Metadata(ArrayList arrayList) {
        this.f13864b = (Entry[]) arrayList.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f13864b = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f13864b;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
