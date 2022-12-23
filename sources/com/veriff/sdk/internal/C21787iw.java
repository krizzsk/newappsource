package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\u00042\b\b\u0003\u0010\u0014\u001a\u00020\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u0004HÆ\u0001R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/AudioConfig;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "component2", "component3", "audioChannels", "minSampleRate", "bitRate", "copy", "I", "getAudioChannels", "()I", "getBitRate", "getMinSampleRate", "<init>", "(III)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.iw */
public final class C21787iw implements Parcelable {
    public static final Parcelable.Creator<C21787iw> CREATOR = new C21788a();

    /* renamed from: a */
    private final int f55132a;

    /* renamed from: b */
    private final int f55133b;

    /* renamed from: c */
    private final int f55134c;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.iw$a */
    public static class C21788a implements Parcelable.Creator<C21787iw> {
        /* renamed from: a */
        public final C21787iw createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C21787iw(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: a */
        public final C21787iw[] newArray(int i) {
            return new C21787iw[i];
        }
    }

    public C21787iw() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public C21787iw(@C21419au(mo54221a = "audio_channels") int i, @C21419au(mo54221a = "min_sample_rate") int i2, @C21419au(mo54221a = "bit_rate") int i3) {
        this.f55132a = i;
        this.f55133b = i2;
        this.f55134c = i3;
    }

    /* renamed from: a */
    public final int mo55411a() {
        return this.f55132a;
    }

    /* renamed from: a */
    public final C21787iw mo55412a(@C21419au(mo54221a = "audio_channels") int i, @C21419au(mo54221a = "min_sample_rate") int i2, @C21419au(mo54221a = "bit_rate") int i3) {
        return new C21787iw(i, i2, i3);
    }

    /* renamed from: b */
    public final int mo55413b() {
        return this.f55133b;
    }

    /* renamed from: c */
    public final int mo55414c() {
        return this.f55134c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21787iw)) {
            return false;
        }
        C21787iw iwVar = (C21787iw) obj;
        return this.f55132a == iwVar.f55132a && this.f55133b == iwVar.f55133b && this.f55134c == iwVar.f55134c;
    }

    public int hashCode() {
        return (((this.f55132a * 31) + this.f55133b) * 31) + this.f55134c;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AudioConfig(audioChannels=");
        k.append(this.f55132a);
        k.append(", minSampleRate=");
        k.append(this.f55133b);
        k.append(", bitRate=");
        return C13437d.m33707l(k, this.f55134c, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeInt(this.f55132a);
        parcel.writeInt(this.f55133b);
        parcel.writeInt(this.f55134c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21787iw(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED : i2, (i4 & 4) != 0 ? 64000 : i3);
    }
}
