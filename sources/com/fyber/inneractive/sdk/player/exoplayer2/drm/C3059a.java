package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.C3052b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a */
public final class C3059a implements Comparator<C3061b>, Parcelable {
    public static final Parcelable.Creator<C3059a> CREATOR = new C3060a();

    /* renamed from: a */
    public final C3061b[] f10531a;

    /* renamed from: b */
    public int f10532b;

    /* renamed from: c */
    public final int f10533c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$a */
    public class C3060a implements Parcelable.Creator<C3059a> {
        public Object createFromParcel(Parcel parcel) {
            return new C3059a(parcel);
        }

        public Object[] newArray(int i) {
            return new C3059a[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3059a(boolean r3, com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a.C3061b... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r4 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a.C3061b[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0043
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f10535b
            r1 = r4[r3]
            java.util.UUID r1 = r1.f10535b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Duplicate data for uuid: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            r3 = r4[r3]
            java.util.UUID r3 = r3.f10535b
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0043:
            r2.f10531a = r4
            int r3 = r4.length
            r2.f10533c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a.<init>(boolean, com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[]):void");
    }

    public int compare(Object obj, Object obj2) {
        C3061b bVar = (C3061b) obj;
        C3061b bVar2 = (C3061b) obj2;
        UUID uuid = C3052b.f10508b;
        if (!uuid.equals(bVar.f10535b)) {
            return bVar.f10535b.compareTo(bVar2.f10535b);
        }
        if (uuid.equals(bVar2.f10535b)) {
            return 0;
        }
        return 1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3059a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10531a, ((C3059a) obj).f10531a);
    }

    public int hashCode() {
        if (this.f10532b == 0) {
            this.f10532b = Arrays.hashCode(this.f10531a);
        }
        return this.f10532b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f10531a, 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b */
    public static final class C3061b implements Parcelable {
        public static final Parcelable.Creator<C3061b> CREATOR = new C3062a();

        /* renamed from: a */
        public int f10534a;

        /* renamed from: b */
        public final UUID f10535b;

        /* renamed from: c */
        public final String f10536c;

        /* renamed from: d */
        public final byte[] f10537d;

        /* renamed from: e */
        public final boolean f10538e;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b$a */
        public class C3062a implements Parcelable.Creator<C3061b> {
            public Object createFromParcel(Parcel parcel) {
                return new C3061b(parcel);
            }

            public Object[] newArray(int i) {
                return new C3061b[i];
            }
        }

        public C3061b(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f10535b = (UUID) C3380a.m8503a(uuid);
            this.f10536c = (String) C3380a.m8503a(str);
            this.f10537d = (byte[]) C3380a.m8503a(bArr);
            this.f10538e = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3061b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C3061b bVar = (C3061b) obj;
            if (!this.f10536c.equals(bVar.f10536c) || !C3406u.m8596a((Object) this.f10535b, (Object) bVar.f10535b) || !Arrays.equals(this.f10537d, bVar.f10537d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f10534a == 0) {
                this.f10534a = Arrays.hashCode(this.f10537d) + C13715c.m34238d(this.f10536c, this.f10535b.hashCode() * 31, 31);
            }
            return this.f10534a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f10535b.getMostSignificantBits());
            parcel.writeLong(this.f10535b.getLeastSignificantBits());
            parcel.writeString(this.f10536c);
            parcel.writeByteArray(this.f10537d);
            parcel.writeByte(this.f10538e ? (byte) 1 : 0);
        }

        public C3061b(Parcel parcel) {
            this.f10535b = new UUID(parcel.readLong(), parcel.readLong());
            this.f10536c = parcel.readString();
            this.f10537d = parcel.createByteArray();
            this.f10538e = parcel.readByte() != 0;
        }
    }

    public C3059a(Parcel parcel) {
        C3061b[] bVarArr = (C3061b[]) parcel.createTypedArray(C3061b.CREATOR);
        this.f10531a = bVarArr;
        this.f10533c = bVarArr.length;
    }
}
