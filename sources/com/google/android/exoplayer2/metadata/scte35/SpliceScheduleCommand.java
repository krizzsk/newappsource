package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C3973a();

    /* renamed from: b */
    public final List<C3975c> f13976b;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public class C3973a implements Parcelable.Creator<SpliceScheduleCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        public final Object[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C3974b {

        /* renamed from: a */
        public final int f13977a;

        /* renamed from: b */
        public final long f13978b;

        public C3974b(int i, long j) {
            this.f13977a = i;
            this.f13978b = j;
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f13976b = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f13976b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C3975c cVar = this.f13976b.get(i2);
            parcel.writeLong(cVar.f13979a);
            parcel.writeByte(cVar.f13980b ? (byte) 1 : 0);
            parcel.writeByte(cVar.f13981c ? (byte) 1 : 0);
            parcel.writeByte(cVar.f13982d ? (byte) 1 : 0);
            int size2 = cVar.f13984f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C3974b bVar = cVar.f13984f.get(i3);
                parcel.writeInt(bVar.f13977a);
                parcel.writeLong(bVar.f13978b);
            }
            parcel.writeLong(cVar.f13983e);
            parcel.writeByte(cVar.f13985g ? (byte) 1 : 0);
            parcel.writeLong(cVar.f13986h);
            parcel.writeInt(cVar.f13987i);
            parcel.writeInt(cVar.f13988j);
            parcel.writeInt(cVar.f13989k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C3975c(parcel));
        }
        this.f13976b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C3975c {

        /* renamed from: a */
        public final long f13979a;

        /* renamed from: b */
        public final boolean f13980b;

        /* renamed from: c */
        public final boolean f13981c;

        /* renamed from: d */
        public final boolean f13982d;

        /* renamed from: e */
        public final long f13983e;

        /* renamed from: f */
        public final List<C3974b> f13984f;

        /* renamed from: g */
        public final boolean f13985g;

        /* renamed from: h */
        public final long f13986h;

        /* renamed from: i */
        public final int f13987i;

        /* renamed from: j */
        public final int f13988j;

        /* renamed from: k */
        public final int f13989k;

        public C3975c(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f13979a = j;
            this.f13980b = z;
            this.f13981c = z2;
            this.f13982d = z3;
            this.f13984f = Collections.unmodifiableList(arrayList);
            this.f13983e = j2;
            this.f13985g = z4;
            this.f13986h = j3;
            this.f13987i = i;
            this.f13988j = i2;
            this.f13989k = i3;
        }

        public C3975c(Parcel parcel) {
            this.f13979a = parcel.readLong();
            boolean z = false;
            this.f13980b = parcel.readByte() == 1;
            this.f13981c = parcel.readByte() == 1;
            this.f13982d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(new C3974b(parcel.readInt(), parcel.readLong()));
            }
            this.f13984f = Collections.unmodifiableList(arrayList);
            this.f13983e = parcel.readLong();
            this.f13985g = parcel.readByte() == 1 ? true : z;
            this.f13986h = parcel.readLong();
            this.f13987i = parcel.readInt();
            this.f13988j = parcel.readInt();
            this.f13989k = parcel.readInt();
        }
    }
}
