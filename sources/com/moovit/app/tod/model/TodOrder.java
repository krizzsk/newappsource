package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.tod.order.TodPaymentInfo;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p977zz.C20946j0;

public class TodOrder implements C5384a, Parcelable {
    public static final Parcelable.Creator<TodOrder> CREATOR = new C15504a();

    /* renamed from: b */
    public final ServerId f40239b;

    /* renamed from: c */
    public final long f40240c;

    /* renamed from: d */
    public final List<TodOrderAssignment> f40241d;

    /* renamed from: e */
    public final TodPaymentInfo f40242e;

    /* renamed from: com.moovit.app.tod.model.TodOrder$a */
    public class C15504a implements Parcelable.Creator<TodOrder> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodOrder(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodOrder[i];
        }
    }

    public TodOrder(ServerId serverId, long j, ArrayList arrayList, TodPaymentInfo todPaymentInfo) {
        this.f40239b = serverId;
        this.f40240c = j;
        this.f40241d = Collections.unmodifiableList(arrayList);
        this.f40242e = todPaymentInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f40239b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40239b, i);
        parcel.writeLong(this.f40240c);
        C20946j0.m49055b(i, parcel, this.f40241d);
        parcel.writeParcelable(this.f40242e, i);
    }

    public TodOrder(Parcel parcel) {
        ServerId serverId = (ServerId) parcel.readParcelable(ServerId.class.getClassLoader());
        C21100e.m49373x(serverId, "orderId");
        this.f40239b = serverId;
        this.f40240c = parcel.readLong();
        this.f40241d = Collections.unmodifiableList(C20946j0.m49054a(parcel, TodOrderAssignment.class));
        TodPaymentInfo todPaymentInfo = (TodPaymentInfo) parcel.readParcelable(TodPaymentInfo.class.getClassLoader());
        C21100e.m49373x(todPaymentInfo, "paymentInfo");
        this.f40242e = todPaymentInfo;
    }
}
