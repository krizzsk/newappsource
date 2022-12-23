package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0003\u0010\u0018\u001a\u00020\u00042\b\b\u0003\u0010\u0019\u001a\u00020\u00042\b\b\u0003\u0010\u001a\u001a\u00020\u00042\b\b\u0003\u0010\u001b\u001a\u00020\u0015HÆ\u0001R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b'\u0010\u001f¨\u0006*"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/VideoConfig;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "Lcom/veriff/sdk/internal/data/Resolution;", "component1", "component2", "component3", "component4", "", "component5", "resolution", "frameRate", "bitRate", "videoIframeInterval", "maxFileSize", "copy", "I", "getBitRate", "()I", "getFrameRate", "J", "getMaxFileSize", "()J", "Lcom/veriff/sdk/internal/data/Resolution;", "getResolution", "()Lcom/veriff/sdk/internal/data/Resolution;", "getVideoIframeInterval", "<init>", "(Lcom/veriff/sdk/internal/data/Resolution;IIIJ)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ka */
public final class C21903ka implements Parcelable {
    public static final Parcelable.Creator<C21903ka> CREATOR = new C21904a();

    /* renamed from: a */
    private final C21886js f55372a;

    /* renamed from: b */
    private final int f55373b;

    /* renamed from: c */
    private final int f55374c;

    /* renamed from: d */
    private final int f55375d;

    /* renamed from: e */
    private final long f55376e;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ka$a */
    public static class C21904a implements Parcelable.Creator<C21903ka> {
        /* renamed from: a */
        public final C21903ka createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C21903ka((C21886js) Enum.valueOf(C21886js.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        /* renamed from: a */
        public final C21903ka[] newArray(int i) {
            return new C21903ka[i];
        }
    }

    public C21903ka() {
        this((C21886js) null, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    public C21903ka(C21886js jsVar, @C21419au(mo54221a = "frame_rate") int i, @C21419au(mo54221a = "bit_rate") int i2, @C21419au(mo54221a = "video_iframe_interval") int i3, @C21419au(mo54221a = "max_file_size") long j) {
        C24362h.m61211f(jsVar, "resolution");
        this.f55372a = jsVar;
        this.f55373b = i;
        this.f55374c = i2;
        this.f55375d = i3;
        this.f55376e = j;
    }

    /* renamed from: a */
    public final C21886js mo55674a() {
        return this.f55372a;
    }

    /* renamed from: a */
    public final C21903ka mo55675a(C21886js jsVar, @C21419au(mo54221a = "frame_rate") int i, @C21419au(mo54221a = "bit_rate") int i2, @C21419au(mo54221a = "video_iframe_interval") int i3, @C21419au(mo54221a = "max_file_size") long j) {
        C24362h.m61211f(jsVar, "resolution");
        return new C21903ka(jsVar, i, i2, i3, j);
    }

    /* renamed from: b */
    public final int mo55676b() {
        return this.f55373b;
    }

    /* renamed from: c */
    public final int mo55677c() {
        return this.f55374c;
    }

    /* renamed from: d */
    public final int mo55678d() {
        return this.f55375d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long mo55680e() {
        return this.f55376e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21903ka)) {
            return false;
        }
        C21903ka kaVar = (C21903ka) obj;
        return C24362h.m61206a(this.f55372a, kaVar.f55372a) && this.f55373b == kaVar.f55373b && this.f55374c == kaVar.f55374c && this.f55375d == kaVar.f55375d && this.f55376e == kaVar.f55376e;
    }

    public int hashCode() {
        C21886js jsVar = this.f55372a;
        int hashCode = jsVar != null ? jsVar.hashCode() : 0;
        long j = this.f55376e;
        return (((((((hashCode * 31) + this.f55373b) * 31) + this.f55374c) * 31) + this.f55375d) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VideoConfig(resolution=");
        k.append(this.f55372a);
        k.append(", frameRate=");
        k.append(this.f55373b);
        k.append(", bitRate=");
        k.append(this.f55374c);
        k.append(", videoIframeInterval=");
        k.append(this.f55375d);
        k.append(", maxFileSize=");
        return C25541a.m63884o(k, this.f55376e, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f55372a.name());
        parcel.writeInt(this.f55373b);
        parcel.writeInt(this.f55374c);
        parcel.writeInt(this.f55375d);
        parcel.writeLong(this.f55376e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21903ka(com.veriff.sdk.internal.C21886js r5, int r6, int r7, int r8, long r9, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            com.veriff.sdk.internal.js r5 = com.veriff.sdk.internal.C21886js.R360P
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000d
            r6 = 5
            r12 = 5
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0019
            r7 = 125000(0x1e848, float:1.75162E-40)
            r0 = 125000(0x1e848, float:1.75162E-40)
            goto L_0x001a
        L_0x0019:
            r0 = r7
        L_0x001a:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0023
            r8 = 10
            r1 = 10
            goto L_0x0024
        L_0x0023:
            r1 = r8
        L_0x0024:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x002b
            r9 = 12000000(0xb71b00, double:5.9287878E-317)
        L_0x002b:
            r2 = r9
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21903ka.<init>(com.veriff.sdk.internal.js, int, int, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
