package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p001a0.C0016g;
import p099ga.C4910k0;
import p277ub.C6774a0;

public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new C3948a();

    /* renamed from: h */
    public static final Format f13877h;

    /* renamed from: i */
    public static final Format f13878i;

    /* renamed from: b */
    public final String f13879b;

    /* renamed from: c */
    public final String f13880c;

    /* renamed from: d */
    public final long f13881d;

    /* renamed from: e */
    public final long f13882e;

    /* renamed from: f */
    public final byte[] f13883f;

    /* renamed from: g */
    public int f13884g;

    /* renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$a */
    public class C3948a implements Parcelable.Creator<EventMessage> {
        public final Object createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        public final Object[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    static {
        Format.C3872b bVar = new Format.C3872b();
        bVar.f13446k = "application/id3";
        f13877h = bVar.mo15806a();
        Format.C3872b bVar2 = new Format.C3872b();
        bVar2.f13446k = "application/x-scte35";
        f13878i = bVar2.mo15806a();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f13879b = str;
        this.f13880c = str2;
        this.f13881d = j;
        this.f13882e = j2;
        this.f13883f = bArr;
    }

    /* renamed from: X1 */
    public final byte[] mo16090X1() {
        if (mo16092d0() != null) {
            return this.f13883f;
        }
        return null;
    }

    /* renamed from: c2 */
    public final /* synthetic */ void mo16091c2(C4910k0.C4911a aVar) {
    }

    /* renamed from: d0 */
    public final Format mo16092d0() {
        String str = this.f13879b;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f13878i;
            case 1:
            case 2:
                return f13877h;
            default:
                return null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.f13881d != eventMessage.f13881d || this.f13882e != eventMessage.f13882e || !C6774a0.m15941a(this.f13879b, eventMessage.f13879b) || !C6774a0.m15941a(this.f13880c, eventMessage.f13880c) || !Arrays.equals(this.f13883f, eventMessage.f13883f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.f13884g == 0) {
            String str = this.f13879b;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String str2 = this.f13880c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.f13881d;
            long j2 = this.f13882e;
            this.f13884g = Arrays.hashCode(this.f13883f) + ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f13884g;
    }

    public final String toString() {
        String str = this.f13879b;
        long j = this.f13882e;
        long j2 = this.f13881d;
        String str2 = this.f13880c;
        StringBuilder sb = new StringBuilder(C0016g.m25h(str2, C0016g.m25h(str, 79)));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13879b);
        parcel.writeString(this.f13880c);
        parcel.writeLong(this.f13881d);
        parcel.writeLong(this.f13882e);
        parcel.writeByteArray(this.f13883f);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i = C6774a0.f20959a;
        this.f13879b = readString;
        this.f13880c = parcel.readString();
        this.f13881d = parcel.readLong();
        this.f13882e = parcel.readLong();
        this.f13883f = parcel.createByteArray();
    }
}
