package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p099ga.C4910k0;

public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C3968a();

    /* renamed from: b */
    public final float f13955b;

    /* renamed from: c */
    public final int f13956c;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$a */
    public class C3968a implements Parcelable.Creator<SmtaMetadataEntry> {
        public final Object createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        public final Object[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public SmtaMetadataEntry(float f, int i) {
        this.f13955b = f;
        this.f13956c = i;
    }

    /* renamed from: X1 */
    public final /* synthetic */ byte[] mo16090X1() {
        return null;
    }

    /* renamed from: c2 */
    public final /* synthetic */ void mo16091c2(C4910k0.C4911a aVar) {
    }

    /* renamed from: d0 */
    public final /* synthetic */ Format mo16092d0() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.f13955b == smtaMetadataEntry.f13955b && this.f13956c == smtaMetadataEntry.f13956c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f13955b).hashCode() + 527) * 31) + this.f13956c;
    }

    public final String toString() {
        float f = this.f13955b;
        int i = this.f13956c;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f13955b);
        parcel.writeInt(this.f13956c);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f13955b = parcel.readFloat();
        this.f13956c = parcel.readInt();
    }
}
