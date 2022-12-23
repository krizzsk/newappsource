package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p099ga.C4883f;
import p277ub.C6774a0;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C3910a();

    /* renamed from: b */
    public final SchemeData[] f13715b;

    /* renamed from: c */
    public int f13716c;

    /* renamed from: d */
    public final String f13717d;

    /* renamed from: e */
    public final int f13718e;

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    public class C3910a implements Parcelable.Creator<DrmInitData> {
        public final Object createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        public final Object[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData() {
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrmInitData(java.lang.String r1, boolean r2, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f13717d = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
        L_0x000e:
            r0.f13715b = r3
            int r1 = r3.length
            r0.f13718e = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.<init>(java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]):void");
    }

    /* renamed from: b */
    public final DrmInitData mo15979b(String str) {
        if (C6774a0.m15941a(this.f13717d, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f13715b);
    }

    public final int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        UUID uuid = C4883f.f16441a;
        if (!uuid.equals(schemeData.f13720c)) {
            return schemeData.f13720c.compareTo(schemeData2.f13720c);
        }
        if (uuid.equals(schemeData2.f13720c)) {
            return 0;
        }
        return 1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (!C6774a0.m15941a(this.f13717d, drmInitData.f13717d) || !Arrays.equals(this.f13715b, drmInitData.f13715b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.f13716c == 0) {
            String str = this.f13717d;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            this.f13716c = (i * 31) + Arrays.hashCode(this.f13715b);
        }
        return this.f13716c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13717d);
        parcel.writeTypedArray(this.f13715b, 0);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C3909a();

        /* renamed from: b */
        public int f13719b;

        /* renamed from: c */
        public final UUID f13720c;

        /* renamed from: d */
        public final String f13721d;

        /* renamed from: e */
        public final String f13722e;

        /* renamed from: f */
        public final byte[] f13723f;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$a */
        public class C3909a implements Parcelable.Creator<SchemeData> {
            public final Object createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            public final Object[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData() {
            throw null;
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f13720c = uuid;
            this.f13721d = str;
            str2.getClass();
            this.f13722e = str2;
            this.f13723f = bArr;
        }

        /* renamed from: b */
        public final boolean mo15985b(UUID uuid) {
            return C4883f.f16441a.equals(this.f13720c) || uuid.equals(this.f13720c);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!C6774a0.m15941a(this.f13721d, schemeData.f13721d) || !C6774a0.m15941a(this.f13722e, schemeData.f13722e) || !C6774a0.m15941a(this.f13720c, schemeData.f13720c) || !Arrays.equals(this.f13723f, schemeData.f13723f)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            if (this.f13719b == 0) {
                int hashCode = this.f13720c.hashCode() * 31;
                String str = this.f13721d;
                if (str == null) {
                    i = 0;
                } else {
                    i = str.hashCode();
                }
                this.f13719b = Arrays.hashCode(this.f13723f) + C13715c.m34238d(this.f13722e, (hashCode + i) * 31, 31);
            }
            return this.f13719b;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f13720c.getMostSignificantBits());
            parcel.writeLong(this.f13720c.getLeastSignificantBits());
            parcel.writeString(this.f13721d);
            parcel.writeString(this.f13722e);
            parcel.writeByteArray(this.f13723f);
        }

        public SchemeData(Parcel parcel) {
            this.f13720c = new UUID(parcel.readLong(), parcel.readLong());
            this.f13721d = parcel.readString();
            String readString = parcel.readString();
            int i = C6774a0.f20959a;
            this.f13722e = readString;
            this.f13723f = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f13717d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = C6774a0.f20959a;
        this.f13715b = schemeDataArr;
        this.f13718e = schemeDataArr.length;
    }
}
