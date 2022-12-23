package com.moovit.request;

import android.os.Parcel;
import android.os.Parcelable;

public final class RequestOptions implements Parcelable {
    public static final Parcelable.Creator<RequestOptions> CREATOR = new C16419a();

    /* renamed from: b */
    public int f42905b;

    /* renamed from: c */
    public boolean f42906c;

    /* renamed from: d */
    public boolean f42907d;

    /* renamed from: e */
    public boolean f42908e;

    /* renamed from: f */
    public boolean f42909f;

    /* renamed from: com.moovit.request.RequestOptions$a */
    public class C16419a implements Parcelable.Creator<RequestOptions> {
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int readInt = parcel.readInt();
            byte readByte = parcel.readByte();
            if ((readByte & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((readByte & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((readByte & 4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((readByte & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new RequestOptions(readInt, z, z2, z3, z4);
        }

        public final Object[] newArray(int i) {
            return new RequestOptions[i];
        }
    }

    public RequestOptions() {
        this(500, false, false, false, false);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte b;
        parcel.writeInt(this.f42905b);
        if (this.f42906c) {
            b = (byte) 1;
        } else {
            b = 0;
        }
        if (this.f42907d) {
            b = (byte) (b | 2);
        }
        if (this.f42908e) {
            b = (byte) (b | 4);
        }
        if (this.f42909f) {
            b = (byte) (b | 8);
        }
        parcel.writeByte(b);
    }

    public RequestOptions(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f42905b = i;
        this.f42906c = z;
        this.f42907d = z2;
        this.f42908e = z3;
        this.f42909f = z4;
    }
}
