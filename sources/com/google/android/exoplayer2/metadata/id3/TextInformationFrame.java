package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p001a0.C0016g;
import p001a0.C0017h;
import p277ub.C6774a0;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C3962a();

    /* renamed from: c */
    public final String f13938c;

    /* renamed from: d */
    public final String f13939d;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$a */
    public class C3962a implements Parcelable.Creator<TextInformationFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f13938c = str2;
        this.f13939d = str3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16091c2(p099ga.C4910k0.C4911a r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f13927b
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = -1
            r4 = 0
            switch(r1) {
                case 82815: goto L_0x0096;
                case 83253: goto L_0x008b;
                case 83254: goto L_0x0080;
                case 83341: goto L_0x0075;
                case 83378: goto L_0x006a;
                case 83552: goto L_0x005f;
                case 2567331: goto L_0x0054;
                case 2575251: goto L_0x0049;
                case 2581512: goto L_0x003b;
                case 2581513: goto L_0x002d;
                case 2583398: goto L_0x001f;
                case 2590194: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x00a1
        L_0x0011:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001b
            goto L_0x00a1
        L_0x001b:
            r0 = 11
            goto L_0x00a2
        L_0x001f:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0029
            goto L_0x00a1
        L_0x0029:
            r0 = 10
            goto L_0x00a2
        L_0x002d:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0037
            goto L_0x00a1
        L_0x0037:
            r0 = 9
            goto L_0x00a2
        L_0x003b:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0045
            goto L_0x00a1
        L_0x0045:
            r0 = 8
            goto L_0x00a2
        L_0x0049:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0052
            goto L_0x00a1
        L_0x0052:
            r0 = 7
            goto L_0x00a2
        L_0x0054:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005d
            goto L_0x00a1
        L_0x005d:
            r0 = 6
            goto L_0x00a2
        L_0x005f:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0068
            goto L_0x00a1
        L_0x0068:
            r0 = 5
            goto L_0x00a2
        L_0x006a:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0073
            goto L_0x00a1
        L_0x0073:
            r0 = 4
            goto L_0x00a2
        L_0x0075:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007e
            goto L_0x00a1
        L_0x007e:
            r0 = 3
            goto L_0x00a2
        L_0x0080:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0089
            goto L_0x00a1
        L_0x0089:
            r0 = 2
            goto L_0x00a2
        L_0x008b:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0094
            goto L_0x00a1
        L_0x0094:
            r0 = 1
            goto L_0x00a2
        L_0x0096:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r0 = 0
            goto L_0x00a2
        L_0x00a1:
            r0 = -1
        L_0x00a2:
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e5;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00b8;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00a6;
                case 6: goto L_0x00ea;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00e0;
                case 10: goto L_0x00b8;
                case 11: goto L_0x00a6;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            goto L_0x00ee
        L_0x00a6:
            java.lang.String r0 = r5.f13939d     // Catch:{ NumberFormatException -> 0x00ee }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00ee }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ee }
            r6.f16605o = r0     // Catch:{ NumberFormatException -> 0x00ee }
            goto L_0x00ee
        L_0x00b3:
            java.lang.String r0 = r5.f13939d
            r6.f16591a = r0
            goto L_0x00ee
        L_0x00b8:
            java.lang.String r0 = r5.f13939d
            int r1 = p277ub.C6774a0.f20959a
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1, r3)
            r1 = r0[r4]     // Catch:{ NumberFormatException -> 0x00ee }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00ee }
            int r3 = r0.length     // Catch:{ NumberFormatException -> 0x00ee }
            if (r3 <= r2) goto L_0x00d6
            r0 = r0[r2]     // Catch:{ NumberFormatException -> 0x00ee }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00ee }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ee }
            goto L_0x00d7
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00ee }
            r6.f16601k = r1     // Catch:{ NumberFormatException -> 0x00ee }
            r6.f16602l = r0     // Catch:{ NumberFormatException -> 0x00ee }
            goto L_0x00ee
        L_0x00e0:
            java.lang.String r0 = r5.f13939d
            r6.f16594d = r0
            goto L_0x00ee
        L_0x00e5:
            java.lang.String r0 = r5.f13939d
            r6.f16592b = r0
            goto L_0x00ee
        L_0x00ea:
            java.lang.String r0 = r5.f13939d
            r6.f16593c = r0
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.mo16091c2(ga.k0$a):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!C6774a0.m15941a(this.f13927b, textInformationFrame.f13927b) || !C6774a0.m15941a(this.f13938c, textInformationFrame.f13938c) || !C6774a0.m15941a(this.f13939d, textInformationFrame.f13939d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f13927b, 527, 31);
        String str = this.f13938c;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (d + i) * 31;
        String str2 = this.f13939d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str = this.f13927b;
        String str2 = this.f13938c;
        String str3 = this.f13939d;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str3, C0016g.m25h(str2, C0016g.m25h(str, 22))), str, ": description=", str2, ": value=");
        O.append(str3);
        return O.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13927b);
        parcel.writeString(this.f13938c);
        parcel.writeString(this.f13939d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInformationFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p277ub.C6774a0.f20959a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f13938c = r0
            java.lang.String r3 = r3.readString()
            r2.f13939d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.<init>(android.os.Parcel):void");
    }
}
