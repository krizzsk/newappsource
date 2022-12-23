package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p099ga.C4910k0;
import p277ub.C6774a0;
import p583jk.C17875h;

public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C3967a();

    /* renamed from: b */
    public final List<Segment> f13951b;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new C3966a();

        /* renamed from: b */
        public final long f13952b;

        /* renamed from: c */
        public final long f13953c;

        /* renamed from: d */
        public final int f13954d;

        /* renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$a */
        public class C3966a implements Parcelable.Creator<Segment> {
            public final Object createFromParcel(Parcel parcel) {
                return new Segment(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            public final Object[] newArray(int i) {
                return new Segment[i];
            }
        }

        public Segment(int i, long j, long j2) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44301k(z);
            this.f13952b = j;
            this.f13953c = j2;
            this.f13954d = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.f13952b == segment.f13952b && this.f13953c == segment.f13953c && this.f13954d == segment.f13954d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f13952b), Long.valueOf(this.f13953c), Integer.valueOf(this.f13954d)});
        }

        public final String toString() {
            return C6774a0.m15950j("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f13952b), Long.valueOf(this.f13953c), Integer.valueOf(this.f13954d));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f13952b);
            parcel.writeLong(this.f13953c);
            parcel.writeInt(this.f13954d);
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$a */
    public class C3967a implements Parcelable.Creator<SlowMotionData> {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        public final Object[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f13951b = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f13953c;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((Segment) arrayList.get(i)).f13952b < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i)).f13953c;
                    i++;
                }
            }
        }
        C17875h.m44301k(!z);
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
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f13951b.equals(((SlowMotionData) obj).f13951b);
    }

    public final int hashCode() {
        return this.f13951b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13951b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f13951b);
    }
}
