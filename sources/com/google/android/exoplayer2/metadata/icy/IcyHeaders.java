package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p001a0.C0016g;
import p001a0.C0017h;
import p099ga.C4910k0;
import p277ub.C6774a0;
import p583jk.C17875h;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C3951a();

    /* renamed from: b */
    public final int f13895b;

    /* renamed from: c */
    public final String f13896c;

    /* renamed from: d */
    public final String f13897d;

    /* renamed from: e */
    public final String f13898e;

    /* renamed from: f */
    public final boolean f13899f;

    /* renamed from: g */
    public final int f13900g;

    /* renamed from: com.google.android.exoplayer2.metadata.icy.IcyHeaders$a */
    public class C3951a implements Parcelable.Creator<IcyHeaders> {
        public final Object createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        public final Object[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        C17875h.m44301k(i2 == -1 || i2 > 0);
        this.f13895b = i;
        this.f13896c = str;
        this.f13897d = str2;
        this.f13898e = str3;
        this.f13899f = z;
        this.f13900g = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders m10633b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r12.get(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = -1
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            int r5 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0034 }
            int r5 = r5 * 1000
            if (r5 <= 0) goto L_0x001f
            r1 = 1
            goto L_0x0030
        L_0x001f:
            java.lang.String r6 = "Invalid bitrate: "
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0032 }
            int r8 = r7.length()     // Catch:{ NumberFormatException -> 0x0032 }
            if (r8 == 0) goto L_0x002e
            r6.concat(r7)     // Catch:{ NumberFormatException -> 0x0032 }
        L_0x002e:
            r1 = 0
            r5 = -1
        L_0x0030:
            r6 = r5
            goto L_0x004a
        L_0x0032:
            goto L_0x0036
        L_0x0034:
            r5 = -1
        L_0x0036:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r6 = r1.length()
            if (r6 == 0) goto L_0x0045
            java.lang.String r6 = "Invalid bitrate header: "
            r6.concat(r1)
        L_0x0045:
            r6 = r5
            r1 = 0
            goto L_0x004a
        L_0x0048:
            r1 = 0
            r6 = -1
        L_0x004a:
            java.lang.String r5 = "icy-genre"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            r7 = 0
            if (r5 == 0) goto L_0x005e
            java.lang.Object r1 = r5.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r8 = r1
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r8 = r7
        L_0x005f:
            java.lang.String r5 = "icy-name"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0072
            java.lang.Object r1 = r5.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r9 = r7
        L_0x0073:
            java.lang.String r5 = "icy-url"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0086
            java.lang.Object r1 = r5.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r10 = r7
        L_0x0087:
            java.lang.String r5 = "icy-pub"
            java.lang.Object r5 = r12.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x00a0
            java.lang.Object r1 = r5.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = "1"
            boolean r1 = r1.equals(r5)
            r11 = r1
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r11 = 0
        L_0x00a1:
            java.lang.String r5 = "icy-metaint"
            java.lang.Object r12 = r12.get(r5)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x00da
            java.lang.Object r12 = r12.get(r4)
            java.lang.String r12 = (java.lang.String) r12
            int r4 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x00cc }
            if (r4 <= 0) goto L_0x00b9
            r2 = r4
            goto L_0x00c7
        L_0x00b9:
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00c9 }
            int r5 = r3.length()     // Catch:{ NumberFormatException -> 0x00c9 }
            if (r5 == 0) goto L_0x00c6
            r0.concat(r3)     // Catch:{ NumberFormatException -> 0x00c9 }
        L_0x00c6:
            r3 = r1
        L_0x00c7:
            r1 = r3
            goto L_0x00da
        L_0x00c9:
            r2 = r4
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r3 = r12.length()
            if (r3 == 0) goto L_0x00da
            r0.concat(r12)
        L_0x00da:
            if (r1 == 0) goto L_0x00e8
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r12 = new com.google.android.exoplayer2.metadata.icy.IcyHeaders
            r5 = r12
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r7 = r12
        L_0x00e8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.m10633b(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.f13895b != icyHeaders.f13895b || !C6774a0.m15941a(this.f13896c, icyHeaders.f13896c) || !C6774a0.m15941a(this.f13897d, icyHeaders.f13897d) || !C6774a0.m15941a(this.f13898e, icyHeaders.f13898e) || this.f13899f != icyHeaders.f13899f || this.f13900g != icyHeaders.f13900g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (527 + this.f13895b) * 31;
        String str = this.f13896c;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f13897d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f13898e;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.f13899f ? 1 : 0)) * 31) + this.f13900g;
    }

    public final String toString() {
        String str = this.f13897d;
        String str2 = this.f13896c;
        int i = this.f13895b;
        int i2 = this.f13900g;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str2, C0016g.m25h(str, 80)), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        O.append("\", bitrate=");
        O.append(i);
        O.append(", metadataInterval=");
        O.append(i2);
        return O.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13895b);
        parcel.writeString(this.f13896c);
        parcel.writeString(this.f13897d);
        parcel.writeString(this.f13898e);
        boolean z = this.f13899f;
        int i2 = C6774a0.f20959a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f13900g);
    }

    public IcyHeaders(Parcel parcel) {
        this.f13895b = parcel.readInt();
        this.f13896c = parcel.readString();
        this.f13897d = parcel.readString();
        this.f13898e = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13899f = parcel.readInt() != 0;
        this.f13900g = parcel.readInt();
    }
}
