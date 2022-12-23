package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001a0.C0016g;
import p001a0.C0017h;
import p161la.C5653b;
import p161la.C5656e;
import p277ub.C6774a0;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new C3871a();

    /* renamed from: A */
    public final int f13400A;

    /* renamed from: B */
    public final int f13401B;

    /* renamed from: C */
    public final int f13402C;

    /* renamed from: D */
    public final int f13403D;

    /* renamed from: E */
    public final int f13404E;

    /* renamed from: F */
    public final Class<? extends C5653b> f13405F;

    /* renamed from: G */
    public int f13406G;

    /* renamed from: b */
    public final String f13407b;

    /* renamed from: c */
    public final String f13408c;

    /* renamed from: d */
    public final String f13409d;

    /* renamed from: e */
    public final int f13410e;

    /* renamed from: f */
    public final int f13411f;

    /* renamed from: g */
    public final int f13412g;

    /* renamed from: h */
    public final int f13413h;

    /* renamed from: i */
    public final int f13414i;

    /* renamed from: j */
    public final String f13415j;

    /* renamed from: k */
    public final Metadata f13416k;

    /* renamed from: l */
    public final String f13417l;

    /* renamed from: m */
    public final String f13418m;

    /* renamed from: n */
    public final int f13419n;

    /* renamed from: o */
    public final List<byte[]> f13420o;

    /* renamed from: p */
    public final DrmInitData f13421p;

    /* renamed from: q */
    public final long f13422q;

    /* renamed from: r */
    public final int f13423r;

    /* renamed from: s */
    public final int f13424s;

    /* renamed from: t */
    public final float f13425t;

    /* renamed from: u */
    public final int f13426u;

    /* renamed from: v */
    public final float f13427v;

    /* renamed from: w */
    public final byte[] f13428w;

    /* renamed from: x */
    public final int f13429x;

    /* renamed from: y */
    public final ColorInfo f13430y;

    /* renamed from: z */
    public final int f13431z;

    /* renamed from: com.google.android.exoplayer2.Format$a */
    public class C3871a implements Parcelable.Creator<Format> {
        public final Object createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        public final Object[] newArray(int i) {
            return new Format[i];
        }
    }

    public Format(C3872b bVar) {
        this.f13407b = bVar.f13436a;
        this.f13408c = bVar.f13437b;
        this.f13409d = C6774a0.m15964x(bVar.f13438c);
        this.f13410e = bVar.f13439d;
        this.f13411f = bVar.f13440e;
        int i = bVar.f13441f;
        this.f13412g = i;
        int i2 = bVar.f13442g;
        this.f13413h = i2;
        this.f13414i = i2 != -1 ? i2 : i;
        this.f13415j = bVar.f13443h;
        this.f13416k = bVar.f13444i;
        this.f13417l = bVar.f13445j;
        this.f13418m = bVar.f13446k;
        this.f13419n = bVar.f13447l;
        List<byte[]> list = bVar.f13448m;
        this.f13420o = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = bVar.f13449n;
        this.f13421p = drmInitData;
        this.f13422q = bVar.f13450o;
        this.f13423r = bVar.f13451p;
        this.f13424s = bVar.f13452q;
        this.f13425t = bVar.f13453r;
        int i3 = bVar.f13454s;
        int i4 = 0;
        this.f13426u = i3 == -1 ? 0 : i3;
        float f = bVar.f13455t;
        this.f13427v = f == -1.0f ? 1.0f : f;
        this.f13428w = bVar.f13456u;
        this.f13429x = bVar.f13457v;
        this.f13430y = bVar.f13458w;
        this.f13431z = bVar.f13459x;
        this.f13400A = bVar.f13460y;
        this.f13401B = bVar.f13461z;
        int i5 = bVar.f13432A;
        this.f13402C = i5 == -1 ? 0 : i5;
        int i6 = bVar.f13433B;
        this.f13403D = i6 != -1 ? i6 : i4;
        this.f13404E = bVar.f13434C;
        Class<? extends C5653b> cls = bVar.f13435D;
        if (cls != null || drmInitData == null) {
            this.f13405F = cls;
        } else {
            this.f13405F = C5656e.class;
        }
    }

    /* renamed from: b */
    public final C3872b mo15797b() {
        return new C3872b(this);
    }

    /* renamed from: c */
    public final boolean mo15798c(Format format) {
        if (this.f13420o.size() != format.f13420o.size()) {
            return false;
        }
        for (int i = 0; i < this.f13420o.size(); i++) {
            if (!Arrays.equals(this.f13420o.get(i), format.f13420o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f13406G;
        if ((i2 == 0 || (i = format.f13406G) == 0 || i2 == i) && this.f13410e == format.f13410e && this.f13411f == format.f13411f && this.f13412g == format.f13412g && this.f13413h == format.f13413h && this.f13419n == format.f13419n && this.f13422q == format.f13422q && this.f13423r == format.f13423r && this.f13424s == format.f13424s && this.f13426u == format.f13426u && this.f13429x == format.f13429x && this.f13431z == format.f13431z && this.f13400A == format.f13400A && this.f13401B == format.f13401B && this.f13402C == format.f13402C && this.f13403D == format.f13403D && this.f13404E == format.f13404E && Float.compare(this.f13425t, format.f13425t) == 0 && Float.compare(this.f13427v, format.f13427v) == 0 && C6774a0.m15941a(this.f13405F, format.f13405F) && C6774a0.m15941a(this.f13407b, format.f13407b) && C6774a0.m15941a(this.f13408c, format.f13408c) && C6774a0.m15941a(this.f13415j, format.f13415j) && C6774a0.m15941a(this.f13417l, format.f13417l) && C6774a0.m15941a(this.f13418m, format.f13418m) && C6774a0.m15941a(this.f13409d, format.f13409d) && Arrays.equals(this.f13428w, format.f13428w) && C6774a0.m15941a(this.f13416k, format.f13416k) && C6774a0.m15941a(this.f13430y, format.f13430y) && C6774a0.m15941a(this.f13421p, format.f13421p) && mo15798c(format)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.f13406G == 0) {
            String str = this.f13407b;
            int i8 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i9 = (527 + i) * 31;
            String str2 = this.f13408c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i11 = (i9 + i2) * 31;
            String str3 = this.f13409d;
            if (str3 == null) {
                i3 = 0;
            } else {
                i3 = str3.hashCode();
            }
            int i12 = (((((((((i11 + i3) * 31) + this.f13410e) * 31) + this.f13411f) * 31) + this.f13412g) * 31) + this.f13413h) * 31;
            String str4 = this.f13415j;
            if (str4 == null) {
                i4 = 0;
            } else {
                i4 = str4.hashCode();
            }
            int i13 = (i12 + i4) * 31;
            Metadata metadata = this.f13416k;
            if (metadata == null) {
                i5 = 0;
            } else {
                i5 = metadata.hashCode();
            }
            int i14 = (i13 + i5) * 31;
            String str5 = this.f13417l;
            if (str5 == null) {
                i6 = 0;
            } else {
                i6 = str5.hashCode();
            }
            int i15 = (i14 + i6) * 31;
            String str6 = this.f13418m;
            if (str6 == null) {
                i7 = 0;
            } else {
                i7 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.f13425t);
            int floatToIntBits2 = (((((((((((((((Float.floatToIntBits(this.f13427v) + ((((floatToIntBits + ((((((((((i15 + i7) * 31) + this.f13419n) * 31) + ((int) this.f13422q)) * 31) + this.f13423r) * 31) + this.f13424s) * 31)) * 31) + this.f13426u) * 31)) * 31) + this.f13429x) * 31) + this.f13431z) * 31) + this.f13400A) * 31) + this.f13401B) * 31) + this.f13402C) * 31) + this.f13403D) * 31) + this.f13404E) * 31;
            Class<? extends C5653b> cls = this.f13405F;
            if (cls != null) {
                i8 = cls.hashCode();
            }
            this.f13406G = floatToIntBits2 + i8;
        }
        return this.f13406G;
    }

    public final String toString() {
        String str = this.f13407b;
        String str2 = this.f13408c;
        String str3 = this.f13417l;
        String str4 = this.f13418m;
        String str5 = this.f13415j;
        int i = this.f13414i;
        String str6 = this.f13409d;
        int i2 = this.f13423r;
        int i3 = this.f13424s;
        float f = this.f13425t;
        int i4 = this.f13431z;
        int i5 = this.f13400A;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str6, C0016g.m25h(str5, C0016g.m25h(str4, C0016g.m25h(str3, C0016g.m25h(str2, C0016g.m25h(str, 104)))))), "Format(", str, ", ", str2);
        C0017h.m61R(O, ", ", str3, ", ", str4);
        O.append(", ");
        O.append(str5);
        O.append(", ");
        O.append(i);
        O.append(", ");
        O.append(str6);
        O.append(", [");
        O.append(i2);
        O.append(", ");
        O.append(i3);
        O.append(", ");
        O.append(f);
        O.append("], [");
        O.append(i4);
        O.append(", ");
        O.append(i5);
        O.append("])");
        return O.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13407b);
        parcel.writeString(this.f13408c);
        parcel.writeString(this.f13409d);
        parcel.writeInt(this.f13410e);
        parcel.writeInt(this.f13411f);
        parcel.writeInt(this.f13412g);
        parcel.writeInt(this.f13413h);
        parcel.writeString(this.f13415j);
        int i2 = 0;
        parcel.writeParcelable(this.f13416k, 0);
        parcel.writeString(this.f13417l);
        parcel.writeString(this.f13418m);
        parcel.writeInt(this.f13419n);
        int size = this.f13420o.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f13420o.get(i3));
        }
        parcel.writeParcelable(this.f13421p, 0);
        parcel.writeLong(this.f13422q);
        parcel.writeInt(this.f13423r);
        parcel.writeInt(this.f13424s);
        parcel.writeFloat(this.f13425t);
        parcel.writeInt(this.f13426u);
        parcel.writeFloat(this.f13427v);
        if (this.f13428w != null) {
            i2 = 1;
        }
        int i4 = C6774a0.f20959a;
        parcel.writeInt(i2);
        byte[] bArr = this.f13428w;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f13429x);
        parcel.writeParcelable(this.f13430y, i);
        parcel.writeInt(this.f13431z);
        parcel.writeInt(this.f13400A);
        parcel.writeInt(this.f13401B);
        parcel.writeInt(this.f13402C);
        parcel.writeInt(this.f13403D);
        parcel.writeInt(this.f13404E);
    }

    /* renamed from: com.google.android.exoplayer2.Format$b */
    public static final class C3872b {

        /* renamed from: A */
        public int f13432A;

        /* renamed from: B */
        public int f13433B;

        /* renamed from: C */
        public int f13434C;

        /* renamed from: D */
        public Class<? extends C5653b> f13435D;

        /* renamed from: a */
        public String f13436a;

        /* renamed from: b */
        public String f13437b;

        /* renamed from: c */
        public String f13438c;

        /* renamed from: d */
        public int f13439d;

        /* renamed from: e */
        public int f13440e;

        /* renamed from: f */
        public int f13441f;

        /* renamed from: g */
        public int f13442g;

        /* renamed from: h */
        public String f13443h;

        /* renamed from: i */
        public Metadata f13444i;

        /* renamed from: j */
        public String f13445j;

        /* renamed from: k */
        public String f13446k;

        /* renamed from: l */
        public int f13447l;

        /* renamed from: m */
        public List<byte[]> f13448m;

        /* renamed from: n */
        public DrmInitData f13449n;

        /* renamed from: o */
        public long f13450o;

        /* renamed from: p */
        public int f13451p;

        /* renamed from: q */
        public int f13452q;

        /* renamed from: r */
        public float f13453r;

        /* renamed from: s */
        public int f13454s;

        /* renamed from: t */
        public float f13455t;

        /* renamed from: u */
        public byte[] f13456u;

        /* renamed from: v */
        public int f13457v;

        /* renamed from: w */
        public ColorInfo f13458w;

        /* renamed from: x */
        public int f13459x;

        /* renamed from: y */
        public int f13460y;

        /* renamed from: z */
        public int f13461z;

        public C3872b() {
            this.f13441f = -1;
            this.f13442g = -1;
            this.f13447l = -1;
            this.f13450o = Long.MAX_VALUE;
            this.f13451p = -1;
            this.f13452q = -1;
            this.f13453r = -1.0f;
            this.f13455t = 1.0f;
            this.f13457v = -1;
            this.f13459x = -1;
            this.f13460y = -1;
            this.f13461z = -1;
            this.f13434C = -1;
        }

        /* renamed from: a */
        public final Format mo15806a() {
            return new Format(this);
        }

        /* renamed from: b */
        public final void mo15807b(int i) {
            this.f13436a = Integer.toString(i);
        }

        public C3872b(Format format) {
            this.f13436a = format.f13407b;
            this.f13437b = format.f13408c;
            this.f13438c = format.f13409d;
            this.f13439d = format.f13410e;
            this.f13440e = format.f13411f;
            this.f13441f = format.f13412g;
            this.f13442g = format.f13413h;
            this.f13443h = format.f13415j;
            this.f13444i = format.f13416k;
            this.f13445j = format.f13417l;
            this.f13446k = format.f13418m;
            this.f13447l = format.f13419n;
            this.f13448m = format.f13420o;
            this.f13449n = format.f13421p;
            this.f13450o = format.f13422q;
            this.f13451p = format.f13423r;
            this.f13452q = format.f13424s;
            this.f13453r = format.f13425t;
            this.f13454s = format.f13426u;
            this.f13455t = format.f13427v;
            this.f13456u = format.f13428w;
            this.f13457v = format.f13429x;
            this.f13458w = format.f13430y;
            this.f13459x = format.f13431z;
            this.f13460y = format.f13400A;
            this.f13461z = format.f13401B;
            this.f13432A = format.f13402C;
            this.f13433B = format.f13403D;
            this.f13434C = format.f13404E;
            this.f13435D = format.f13405F;
        }
    }

    public Format(Parcel parcel) {
        this.f13407b = parcel.readString();
        this.f13408c = parcel.readString();
        this.f13409d = parcel.readString();
        this.f13410e = parcel.readInt();
        this.f13411f = parcel.readInt();
        int readInt = parcel.readInt();
        this.f13412g = readInt;
        int readInt2 = parcel.readInt();
        this.f13413h = readInt2;
        this.f13414i = readInt2 != -1 ? readInt2 : readInt;
        this.f13415j = parcel.readString();
        this.f13416k = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f13417l = parcel.readString();
        this.f13418m = parcel.readString();
        this.f13419n = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f13420o = new ArrayList(readInt3);
        boolean z = false;
        for (int i = 0; i < readInt3; i++) {
            List<byte[]> list = this.f13420o;
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            list.add(createByteArray);
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f13421p = drmInitData;
        this.f13422q = parcel.readLong();
        this.f13423r = parcel.readInt();
        this.f13424s = parcel.readInt();
        this.f13425t = parcel.readFloat();
        this.f13426u = parcel.readInt();
        this.f13427v = parcel.readFloat();
        int i2 = C6774a0.f20959a;
        Class cls = null;
        this.f13428w = parcel.readInt() != 0 ? true : z ? parcel.createByteArray() : null;
        this.f13429x = parcel.readInt();
        this.f13430y = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f13431z = parcel.readInt();
        this.f13400A = parcel.readInt();
        this.f13401B = parcel.readInt();
        this.f13402C = parcel.readInt();
        this.f13403D = parcel.readInt();
        this.f13404E = parcel.readInt();
        this.f13405F = drmInitData != null ? C5656e.class : cls;
    }
}
