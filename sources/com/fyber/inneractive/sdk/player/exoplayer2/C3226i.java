package com.fyber.inneractive.sdk.player.exoplayer2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C3418b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.i */
public final class C3226i implements Parcelable {
    public static final Parcelable.Creator<C3226i> CREATOR = new C3227a();

    /* renamed from: A */
    public int f11627A;

    /* renamed from: a */
    public final String f11628a;

    /* renamed from: b */
    public final int f11629b;

    /* renamed from: c */
    public final String f11630c;

    /* renamed from: d */
    public final C3243a f11631d;

    /* renamed from: e */
    public final String f11632e;

    /* renamed from: f */
    public final String f11633f;

    /* renamed from: g */
    public final int f11634g;

    /* renamed from: h */
    public final List<byte[]> f11635h;

    /* renamed from: i */
    public final C3059a f11636i;

    /* renamed from: j */
    public final int f11637j;

    /* renamed from: k */
    public final int f11638k;

    /* renamed from: l */
    public final float f11639l;

    /* renamed from: m */
    public final int f11640m;

    /* renamed from: n */
    public final float f11641n;

    /* renamed from: o */
    public final int f11642o;

    /* renamed from: p */
    public final byte[] f11643p;

    /* renamed from: q */
    public final C3418b f11644q;

    /* renamed from: r */
    public final int f11645r;

    /* renamed from: s */
    public final int f11646s;

    /* renamed from: t */
    public final int f11647t;

    /* renamed from: u */
    public final int f11648u;

    /* renamed from: v */
    public final int f11649v;

    /* renamed from: w */
    public final long f11650w;

    /* renamed from: x */
    public final int f11651x;

    /* renamed from: y */
    public final String f11652y;

    /* renamed from: z */
    public final int f11653z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.i$a */
    public class C3227a implements Parcelable.Creator<C3226i> {
        public Object createFromParcel(Parcel parcel) {
            return new C3226i(parcel);
        }

        public Object[] newArray(int i) {
            return new C3226i[i];
        }
    }

    public C3226i(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C3418b bVar, int i7, int i8, int i9, int i11, int i12, int i13, String str5, int i14, long j, List<byte[]> list, C3059a aVar, C3243a aVar2) {
        this.f11628a = str;
        this.f11632e = str2;
        this.f11633f = str3;
        this.f11630c = str4;
        this.f11629b = i;
        this.f11634g = i2;
        this.f11637j = i3;
        this.f11638k = i4;
        this.f11639l = f;
        this.f11640m = i5;
        this.f11641n = f2;
        this.f11643p = bArr;
        this.f11642o = i6;
        this.f11644q = bVar;
        this.f11645r = i7;
        this.f11646s = i8;
        this.f11647t = i9;
        this.f11648u = i11;
        this.f11649v = i12;
        this.f11651x = i13;
        this.f11652y = str5;
        this.f11653z = i14;
        this.f11650w = j;
        this.f11635h = list == null ? Collections.emptyList() : list;
        this.f11636i = aVar;
        this.f11631d = aVar2;
    }

    /* renamed from: a */
    public static C3226i m8175a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, C3059a aVar) {
        return m8176a(str, str2, (String) null, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (C3418b) null, (C3059a) null);
    }

    /* renamed from: b */
    public int mo14324b() {
        int i;
        int i2 = this.f11637j;
        if (i2 == -1 || (i = this.f11638k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3226i.class == obj.getClass()) {
            C3226i iVar = (C3226i) obj;
            if (this.f11629b == iVar.f11629b && this.f11634g == iVar.f11634g && this.f11637j == iVar.f11637j && this.f11638k == iVar.f11638k && this.f11639l == iVar.f11639l && this.f11640m == iVar.f11640m && this.f11641n == iVar.f11641n && this.f11642o == iVar.f11642o && this.f11645r == iVar.f11645r && this.f11646s == iVar.f11646s && this.f11647t == iVar.f11647t && this.f11648u == iVar.f11648u && this.f11649v == iVar.f11649v && this.f11650w == iVar.f11650w && this.f11651x == iVar.f11651x && C3406u.m8596a((Object) this.f11628a, (Object) iVar.f11628a) && C3406u.m8596a((Object) this.f11652y, (Object) iVar.f11652y) && this.f11653z == iVar.f11653z && C3406u.m8596a((Object) this.f11632e, (Object) iVar.f11632e) && C3406u.m8596a((Object) this.f11633f, (Object) iVar.f11633f) && C3406u.m8596a((Object) this.f11630c, (Object) iVar.f11630c) && C3406u.m8596a((Object) this.f11636i, (Object) iVar.f11636i) && C3406u.m8596a((Object) this.f11631d, (Object) iVar.f11631d) && C3406u.m8596a((Object) this.f11644q, (Object) iVar.f11644q) && Arrays.equals(this.f11643p, iVar.f11643p) && this.f11635h.size() == iVar.f11635h.size()) {
                for (int i = 0; i < this.f11635h.size(); i++) {
                    if (!Arrays.equals(this.f11635h.get(i), iVar.f11635h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f11627A == 0) {
            String str = this.f11628a;
            int i7 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i8 = (i + 527) * 31;
            String str2 = this.f11632e;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.hashCode();
            }
            int i9 = (i8 + i2) * 31;
            String str3 = this.f11633f;
            if (str3 == null) {
                i3 = 0;
            } else {
                i3 = str3.hashCode();
            }
            int i11 = (i9 + i3) * 31;
            String str4 = this.f11630c;
            if (str4 == null) {
                i4 = 0;
            } else {
                i4 = str4.hashCode();
            }
            int i12 = (((((((((((i11 + i4) * 31) + this.f11629b) * 31) + this.f11637j) * 31) + this.f11638k) * 31) + this.f11645r) * 31) + this.f11646s) * 31;
            String str5 = this.f11652y;
            if (str5 == null) {
                i5 = 0;
            } else {
                i5 = str5.hashCode();
            }
            int i13 = (((i12 + i5) * 31) + this.f11653z) * 31;
            C3059a aVar = this.f11636i;
            if (aVar == null) {
                i6 = 0;
            } else {
                i6 = aVar.hashCode();
            }
            int i14 = (i13 + i6) * 31;
            C3243a aVar2 = this.f11631d;
            if (aVar2 != null) {
                i7 = Arrays.hashCode(aVar2.f11715a);
            }
            this.f11627A = i14 + i7;
        }
        return this.f11627A;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Format(");
        k.append(this.f11628a);
        k.append(", ");
        k.append(this.f11632e);
        k.append(", ");
        k.append(this.f11633f);
        k.append(", ");
        k.append(this.f11629b);
        k.append(", ");
        k.append(this.f11652y);
        k.append(", [");
        k.append(this.f11637j);
        k.append(", ");
        k.append(this.f11638k);
        k.append(", ");
        k.append(this.f11639l);
        k.append("], [");
        k.append(this.f11645r);
        k.append(", ");
        return C13437d.m33707l(k, this.f11646s, "])");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f11628a);
        parcel.writeString(this.f11632e);
        parcel.writeString(this.f11633f);
        parcel.writeString(this.f11630c);
        parcel.writeInt(this.f11629b);
        parcel.writeInt(this.f11634g);
        parcel.writeInt(this.f11637j);
        parcel.writeInt(this.f11638k);
        parcel.writeFloat(this.f11639l);
        parcel.writeInt(this.f11640m);
        parcel.writeFloat(this.f11641n);
        if (this.f11643p != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.f11643p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f11642o);
        parcel.writeParcelable(this.f11644q, i);
        parcel.writeInt(this.f11645r);
        parcel.writeInt(this.f11646s);
        parcel.writeInt(this.f11647t);
        parcel.writeInt(this.f11648u);
        parcel.writeInt(this.f11649v);
        parcel.writeInt(this.f11651x);
        parcel.writeString(this.f11652y);
        parcel.writeInt(this.f11653z);
        parcel.writeLong(this.f11650w);
        int size = this.f11635h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f11635h.get(i3));
        }
        parcel.writeParcelable(this.f11636i, 0);
        parcel.writeParcelable(this.f11631d, 0);
    }

    /* renamed from: a */
    public static C3226i m8176a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, C3418b bVar, C3059a aVar) {
        return new C3226i(str, (String) null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, bVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, aVar, (C3243a) null);
    }

    /* renamed from: a */
    public static C3226i m8178a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, C3059a aVar, int i6, String str4) {
        return m8177a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, aVar, i6, str4, (C3243a) null);
    }

    /* renamed from: a */
    public static C3226i m8177a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, C3059a aVar, int i8, String str4, C3243a aVar2) {
        return new C3226i(str, (String) null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3418b) null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    /* renamed from: a */
    public static C3226i m8183a(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new C3226i(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3418b) null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, (List<byte[]>) null, (C3059a) null, (C3243a) null);
    }

    /* renamed from: a */
    public static C3226i m8180a(String str, String str2, String str3, int i, int i2, String str4, C3059a aVar) {
        return m8179a(str, str2, (String) null, i, i2, str4, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static C3226i m8179a(String str, String str2, String str3, int i, int i2, String str4, int i3, C3059a aVar, long j, List<byte[]> list) {
        return new C3226i(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3418b) null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, aVar, (C3243a) null);
    }

    /* renamed from: a */
    public static C3226i m8182a(String str, String str2, String str3, int i, List<byte[]> list, String str4, C3059a aVar) {
        return new C3226i(str, (String) null, str2, (String) null, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3418b) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, aVar, (C3243a) null);
    }

    /* renamed from: a */
    public static C3226i m8174a(String str, String str2, long j) {
        return new C3226i((String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3418b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (C3059a) null, (C3243a) null);
    }

    /* renamed from: a */
    public static C3226i m8181a(String str, String str2, String str3, int i, C3059a aVar) {
        return new C3226i(str, (String) null, str2, (String) null, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C3418b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, aVar, (C3243a) null);
    }

    /* renamed from: a */
    public C3226i mo14323a(long j) {
        return new C3226i(this.f11628a, this.f11632e, this.f11633f, this.f11630c, this.f11629b, this.f11634g, this.f11637j, this.f11638k, this.f11639l, this.f11640m, this.f11641n, this.f11643p, this.f11642o, this.f11644q, this.f11645r, this.f11646s, this.f11647t, this.f11648u, this.f11649v, this.f11651x, this.f11652y, this.f11653z, j, this.f11635h, this.f11636i, this.f11631d);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: a */
    public final MediaFormat mo14322a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f11633f);
        String str = this.f11652y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m8184a(mediaFormat, "max-input-size", this.f11634g);
        m8184a(mediaFormat, "width", this.f11637j);
        m8184a(mediaFormat, "height", this.f11638k);
        float f = this.f11639l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m8184a(mediaFormat, "rotation-degrees", this.f11640m);
        m8184a(mediaFormat, "channel-count", this.f11645r);
        m8184a(mediaFormat, "sample-rate", this.f11646s);
        m8184a(mediaFormat, "encoder-delay", this.f11648u);
        m8184a(mediaFormat, "encoder-padding", this.f11649v);
        for (int i = 0; i < this.f11635h.size(); i++) {
            mediaFormat.setByteBuffer(C16759e.m42349e("csd-", i), ByteBuffer.wrap(this.f11635h.get(i)));
        }
        C3418b bVar = this.f11644q;
        if (bVar != null) {
            m8184a(mediaFormat, "color-transfer", bVar.f12216c);
            m8184a(mediaFormat, "color-standard", bVar.f12214a);
            m8184a(mediaFormat, "color-range", bVar.f12215b);
            byte[] bArr = bVar.f12217d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public C3226i(Parcel parcel) {
        this.f11628a = parcel.readString();
        this.f11632e = parcel.readString();
        this.f11633f = parcel.readString();
        this.f11630c = parcel.readString();
        this.f11629b = parcel.readInt();
        this.f11634g = parcel.readInt();
        this.f11637j = parcel.readInt();
        this.f11638k = parcel.readInt();
        this.f11639l = parcel.readFloat();
        this.f11640m = parcel.readInt();
        this.f11641n = parcel.readFloat();
        this.f11643p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f11642o = parcel.readInt();
        this.f11644q = (C3418b) parcel.readParcelable(C3418b.class.getClassLoader());
        this.f11645r = parcel.readInt();
        this.f11646s = parcel.readInt();
        this.f11647t = parcel.readInt();
        this.f11648u = parcel.readInt();
        this.f11649v = parcel.readInt();
        this.f11651x = parcel.readInt();
        this.f11652y = parcel.readString();
        this.f11653z = parcel.readInt();
        this.f11650w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f11635h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f11635h.add(parcel.createByteArray());
        }
        this.f11636i = (C3059a) parcel.readParcelable(C3059a.class.getClassLoader());
        this.f11631d = (C3243a) parcel.readParcelable(C3243a.class.getClassLoader());
    }

    @TargetApi(16)
    /* renamed from: a */
    public static void m8184a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
