package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p277ub.C6774a0;

public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR = new C3992a();

    /* renamed from: b */
    public final ImmutableList<String> f14128b;

    /* renamed from: c */
    public final int f14129c;

    /* renamed from: d */
    public final ImmutableList<String> f14130d;

    /* renamed from: e */
    public final int f14131e;

    /* renamed from: f */
    public final boolean f14132f;

    /* renamed from: g */
    public final int f14133g;

    /* renamed from: com.google.android.exoplayer2.trackselection.TrackSelectionParameters$a */
    public class C3992a implements Parcelable.Creator<TrackSelectionParameters> {
        public final Object createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        public final Object[] newArray(int i) {
            return new TrackSelectionParameters[i];
        }
    }

    static {
        ImmutableList.m35687D();
        ImmutableList.m35687D();
    }

    public TrackSelectionParameters(ImmutableList<String> immutableList, int i, ImmutableList<String> immutableList2, int i2, boolean z, int i3) {
        this.f14128b = immutableList;
        this.f14129c = i;
        this.f14130d = immutableList2;
        this.f14131e = i2;
        this.f14132f = z;
        this.f14133g = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        if (this.f14128b.equals(trackSelectionParameters.f14128b) && this.f14129c == trackSelectionParameters.f14129c && this.f14130d.equals(trackSelectionParameters.f14130d) && this.f14131e == trackSelectionParameters.f14131e && this.f14132f == trackSelectionParameters.f14132f && this.f14133g == trackSelectionParameters.f14133g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f14130d.hashCode() + ((((this.f14128b.hashCode() + 31) * 31) + this.f14129c) * 31)) * 31) + this.f14131e) * 31) + (this.f14132f ? 1 : 0)) * 31) + this.f14133g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f14128b);
        parcel.writeInt(this.f14129c);
        parcel.writeList(this.f14130d);
        parcel.writeInt(this.f14131e);
        boolean z = this.f14132f;
        int i2 = C6774a0.f20959a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f14133g);
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.TrackSelectionParameters$b */
    public static class C3993b {

        /* renamed from: a */
        public ImmutableList<String> f14134a;

        /* renamed from: b */
        public int f14135b;

        /* renamed from: c */
        public ImmutableList<String> f14136c;

        /* renamed from: d */
        public int f14137d;

        /* renamed from: e */
        public boolean f14138e;

        /* renamed from: f */
        public int f14139f;

        @Deprecated
        public C3993b() {
            this.f14134a = ImmutableList.m35687D();
            this.f14135b = 0;
            this.f14136c = ImmutableList.m35687D();
            this.f14137d = 0;
            this.f14138e = false;
            this.f14139f = 0;
        }

        public C3993b(TrackSelectionParameters trackSelectionParameters) {
            this.f14134a = trackSelectionParameters.f14128b;
            this.f14135b = trackSelectionParameters.f14129c;
            this.f14136c = trackSelectionParameters.f14130d;
            this.f14137d = trackSelectionParameters.f14131e;
            this.f14138e = trackSelectionParameters.f14132f;
            this.f14139f = trackSelectionParameters.f14133g;
        }
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, (ClassLoader) null);
        this.f14128b = ImmutableList.m35691z(arrayList);
        this.f14129c = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, (ClassLoader) null);
        this.f14130d = ImmutableList.m35691z(arrayList2);
        this.f14131e = parcel.readInt();
        int i = C6774a0.f20959a;
        this.f14132f = parcel.readInt() != 0;
        this.f14133g = parcel.readInt();
    }
}
