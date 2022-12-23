package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d */
public final class C3252d extends C3261h {
    public static final Parcelable.Creator<C3252d> CREATOR = new C3253a();

    /* renamed from: b */
    public final String f11727b;

    /* renamed from: c */
    public final boolean f11728c;

    /* renamed from: d */
    public final boolean f11729d;

    /* renamed from: e */
    public final String[] f11730e;

    /* renamed from: f */
    public final C3261h[] f11731f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d$a */
    public class C3253a implements Parcelable.Creator<C3252d> {
        public Object createFromParcel(Parcel parcel) {
            return new C3252d(parcel);
        }

        public Object[] newArray(int i) {
            return new C3252d[i];
        }
    }

    public C3252d(String str, boolean z, boolean z2, String[] strArr, C3261h[] hVarArr) {
        super("CTOC");
        this.f11727b = str;
        this.f11728c = z;
        this.f11729d = z2;
        this.f11730e = strArr;
        this.f11731f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3252d.class != obj.getClass()) {
            return false;
        }
        C3252d dVar = (C3252d) obj;
        if (this.f11728c != dVar.f11728c || this.f11729d != dVar.f11729d || !C3406u.m8596a((Object) this.f11727b, (Object) dVar.f11727b) || !Arrays.equals(this.f11730e, dVar.f11730e) || !Arrays.equals(this.f11731f, dVar.f11731f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = ((((this.f11728c ? 1 : 0) + true) * 31) + (this.f11729d ? 1 : 0)) * 31;
        String str = this.f11727b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11727b);
        parcel.writeByte(this.f11728c ? (byte) 1 : 0);
        parcel.writeByte(this.f11729d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f11730e);
        parcel.writeInt(this.f11731f.length);
        int i2 = 0;
        while (true) {
            C3261h[] hVarArr = this.f11731f;
            if (i2 < hVarArr.length) {
                parcel.writeParcelable(hVarArr[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }

    public C3252d(Parcel parcel) {
        super("CTOC");
        this.f11727b = parcel.readString();
        boolean z = true;
        this.f11728c = parcel.readByte() != 0;
        this.f11729d = parcel.readByte() == 0 ? false : z;
        this.f11730e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f11731f = new C3261h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f11731f[i] = (C3261h) parcel.readParcelable(C3261h.class.getClassLoader());
        }
    }
}
