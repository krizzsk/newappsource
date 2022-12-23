package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p099ga.C4910k0;

public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new C3965a();

    /* renamed from: b */
    public final long f13946b;

    /* renamed from: c */
    public final long f13947c;

    /* renamed from: d */
    public final long f13948d;

    /* renamed from: e */
    public final long f13949e;

    /* renamed from: f */
    public final long f13950f;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata$a */
    public class C3965a implements Parcelable.Creator<MotionPhotoMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        public final Object[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f13946b = j;
        this.f13947c = j2;
        this.f13948d = j3;
        this.f13949e = j4;
        this.f13950f = j5;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        if (this.f13946b == motionPhotoMetadata.f13946b && this.f13947c == motionPhotoMetadata.f13947c && this.f13948d == motionPhotoMetadata.f13948d && this.f13949e == motionPhotoMetadata.f13949e && this.f13950f == motionPhotoMetadata.f13950f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13946b;
        long j2 = this.f13947c;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.f13948d;
        int i2 = (int) (j3 ^ (j3 >>> 32));
        long j4 = this.f13949e;
        int i3 = (int) (j4 ^ (j4 >>> 32));
        long j5 = this.f13950f;
        return ((int) ((j5 >>> 32) ^ j5)) + ((i3 + ((i2 + ((i + ((((int) (j ^ (j >>> 32))) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j = this.f13946b;
        long j2 = this.f13947c;
        long j3 = this.f13948d;
        long j4 = this.f13949e;
        long j5 = this.f13950f;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13946b);
        parcel.writeLong(this.f13947c);
        parcel.writeLong(this.f13948d);
        parcel.writeLong(this.f13949e);
        parcel.writeLong(this.f13950f);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f13946b = parcel.readLong();
        this.f13947c = parcel.readLong();
        this.f13948d = parcel.readLong();
        this.f13949e = parcel.readLong();
        this.f13950f = parcel.readLong();
    }
}
