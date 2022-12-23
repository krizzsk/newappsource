package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001a0.C0016g;
import p277ub.C6774a0;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C3977a();

    /* renamed from: b */
    public final String f13992b;

    /* renamed from: c */
    public final Uri f13993c;

    /* renamed from: d */
    public final String f13994d;

    /* renamed from: e */
    public final List<StreamKey> f13995e;

    /* renamed from: f */
    public final byte[] f13996f;

    /* renamed from: g */
    public final String f13997g;

    /* renamed from: h */
    public final byte[] f13998h;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadRequest$a */
    public class C3977a implements Parcelable.Creator<DownloadRequest> {
        public final Object createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        public final Object[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13992b = readString;
        this.f13993c = Uri.parse(parcel.readString());
        this.f13994d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f13995e = Collections.unmodifiableList(arrayList);
        this.f13996f = parcel.createByteArray();
        this.f13997g = parcel.readString();
        this.f13998h = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.f13992b.equals(downloadRequest.f13992b) || !this.f13993c.equals(downloadRequest.f13993c) || !C6774a0.m15941a(this.f13994d, downloadRequest.f13994d) || !this.f13995e.equals(downloadRequest.f13995e) || !Arrays.equals(this.f13996f, downloadRequest.f13996f) || !C6774a0.m15941a(this.f13997g, downloadRequest.f13997g) || !Arrays.equals(this.f13998h, downloadRequest.f13998h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f13993c.hashCode() + (this.f13992b.hashCode() * 31 * 31)) * 31;
        String str = this.f13994d;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.f13995e.hashCode();
        int hashCode3 = (Arrays.hashCode(this.f13996f) + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31;
        String str2 = this.f13997g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.f13998h) + ((hashCode3 + i2) * 31);
    }

    public final String toString() {
        String str = this.f13994d;
        String str2 = this.f13992b;
        return C25541a.m63875e(C0016g.m25h(str2, C0016g.m25h(str, 1)), str, ":", str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13992b);
        parcel.writeString(this.f13993c.toString());
        parcel.writeString(this.f13994d);
        parcel.writeInt(this.f13995e.size());
        for (int i2 = 0; i2 < this.f13995e.size(); i2++) {
            parcel.writeParcelable(this.f13995e.get(i2), 0);
        }
        parcel.writeByteArray(this.f13996f);
        parcel.writeString(this.f13997g);
        parcel.writeByteArray(this.f13998h);
    }
}
