package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.C0016g;
import p001a0.C0017h;
import p099ga.C4910k0;

public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new C3984a();

    /* renamed from: b */
    public final String f14018b;

    /* renamed from: c */
    public final String f14019c;

    /* renamed from: d */
    public final List<VariantInfo> f14020d;

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new C3983a();

        /* renamed from: b */
        public final int f14021b;

        /* renamed from: c */
        public final int f14022c;

        /* renamed from: d */
        public final String f14023d;

        /* renamed from: e */
        public final String f14024e;

        /* renamed from: f */
        public final String f14025f;

        /* renamed from: g */
        public final String f14026g;

        /* renamed from: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo$a */
        public class C3983a implements Parcelable.Creator<VariantInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            public final Object[] newArray(int i) {
                return new VariantInfo[i];
            }
        }

        public VariantInfo(Parcel parcel) {
            this.f14021b = parcel.readInt();
            this.f14022c = parcel.readInt();
            this.f14023d = parcel.readString();
            this.f14024e = parcel.readString();
            this.f14025f = parcel.readString();
            this.f14026g = parcel.readString();
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            if (this.f14021b != variantInfo.f14021b || this.f14022c != variantInfo.f14022c || !TextUtils.equals(this.f14023d, variantInfo.f14023d) || !TextUtils.equals(this.f14024e, variantInfo.f14024e) || !TextUtils.equals(this.f14025f, variantInfo.f14025f) || !TextUtils.equals(this.f14026g, variantInfo.f14026g)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = ((this.f14021b * 31) + this.f14022c) * 31;
            String str = this.f14023d;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (i4 + i) * 31;
            String str2 = this.f14024e;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str3 = this.f14025f;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str4 = this.f14026g;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i8 + i5;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14021b);
            parcel.writeInt(this.f14022c);
            parcel.writeString(this.f14023d);
            parcel.writeString(this.f14024e);
            parcel.writeString(this.f14025f);
            parcel.writeString(this.f14026g);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$a */
    public class C3984a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        public final Object createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        public final Object[] newArray(int i) {
            return new HlsTrackMetadataEntry[i];
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f14018b = parcel.readString();
        this.f14019c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f14020d = Collections.unmodifiableList(arrayList);
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
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        if (!TextUtils.equals(this.f14018b, hlsTrackMetadataEntry.f14018b) || !TextUtils.equals(this.f14019c, hlsTrackMetadataEntry.f14019c) || !this.f14020d.equals(hlsTrackMetadataEntry.f14020d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.f14018b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f14019c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.f14020d.hashCode() + ((i3 + i2) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.f14018b;
        if (str2 != null) {
            String str3 = this.f14019c;
            StringBuilder O = C0017h.m58O(C0016g.m25h(str3, C0016g.m25h(str2, 5)), " [", str2, ", ", str3);
            O.append("]");
            str = O.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            return "HlsTrackMetadataEntry".concat(valueOf);
        }
        return new String("HlsTrackMetadataEntry");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14018b);
        parcel.writeString(this.f14019c);
        int size = this.f14020d.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f14020d.get(i2), 0);
        }
    }
}
