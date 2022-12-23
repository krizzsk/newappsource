package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C3970a();

    /* renamed from: b */
    public final long f13960b;

    /* renamed from: c */
    public final boolean f13961c;

    /* renamed from: d */
    public final boolean f13962d;

    /* renamed from: e */
    public final boolean f13963e;

    /* renamed from: f */
    public final boolean f13964f;

    /* renamed from: g */
    public final long f13965g;

    /* renamed from: h */
    public final long f13966h;

    /* renamed from: i */
    public final List<C3971b> f13967i;

    /* renamed from: j */
    public final boolean f13968j;

    /* renamed from: k */
    public final long f13969k;

    /* renamed from: l */
    public final int f13970l;

    /* renamed from: m */
    public final int f13971m;

    /* renamed from: n */
    public final int f13972n;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public class C3970a implements Parcelable.Creator<SpliceInsertCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        public final Object[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    public static final class C3971b {

        /* renamed from: a */
        public final int f13973a;

        /* renamed from: b */
        public final long f13974b;

        /* renamed from: c */
        public final long f13975c;

        public C3971b(int i, long j, long j2) {
            this.f13973a = i;
            this.f13974b = j;
            this.f13975c = j2;
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C3971b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f13960b = j;
        this.f13961c = z;
        this.f13962d = z2;
        this.f13963e = z3;
        this.f13964f = z4;
        this.f13965g = j2;
        this.f13966h = j3;
        this.f13967i = Collections.unmodifiableList(list);
        this.f13968j = z5;
        this.f13969k = j4;
        this.f13970l = i;
        this.f13971m = i2;
        this.f13972n = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13960b);
        parcel.writeByte(this.f13961c ? (byte) 1 : 0);
        parcel.writeByte(this.f13962d ? (byte) 1 : 0);
        parcel.writeByte(this.f13963e ? (byte) 1 : 0);
        parcel.writeByte(this.f13964f ? (byte) 1 : 0);
        parcel.writeLong(this.f13965g);
        parcel.writeLong(this.f13966h);
        int size = this.f13967i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C3971b bVar = this.f13967i.get(i2);
            parcel.writeInt(bVar.f13973a);
            parcel.writeLong(bVar.f13974b);
            parcel.writeLong(bVar.f13975c);
        }
        parcel.writeByte(this.f13968j ? (byte) 1 : 0);
        parcel.writeLong(this.f13969k);
        parcel.writeInt(this.f13970l);
        parcel.writeInt(this.f13971m);
        parcel.writeInt(this.f13972n);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f13960b = parcel.readLong();
        boolean z = false;
        this.f13961c = parcel.readByte() == 1;
        this.f13962d = parcel.readByte() == 1;
        this.f13963e = parcel.readByte() == 1;
        this.f13964f = parcel.readByte() == 1;
        this.f13965g = parcel.readLong();
        this.f13966h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C3971b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f13967i = Collections.unmodifiableList(arrayList);
        this.f13968j = parcel.readByte() == 1 ? true : z;
        this.f13969k = parcel.readLong();
        this.f13970l = parcel.readInt();
        this.f13971m = parcel.readInt();
        this.f13972n = parcel.readInt();
    }
}
