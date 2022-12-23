package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p001a0.C0016g;
import p099ga.C4910k0;

public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new C3947a();

    /* renamed from: b */
    public final int f13875b;

    /* renamed from: c */
    public final String f13876c;

    /* renamed from: com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable$a */
    public class C3947a implements Parcelable.Creator<AppInfoTable> {
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new AppInfoTable(parcel.readInt(), readString);
        }

        public final Object[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.f13875b = i;
        this.f13876c = str;
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

    public final String toString() {
        int i = this.f13875b;
        String str = this.f13876c;
        StringBuilder sb = new StringBuilder(C0016g.m25h(str, 33));
        sb.append("Ait(controlCode=");
        sb.append(i);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13876c);
        parcel.writeInt(this.f13875b);
    }
}
