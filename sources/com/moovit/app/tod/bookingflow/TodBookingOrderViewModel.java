package com.moovit.app.tod.bookingflow;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.ads.C14762w;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffInformation;
import com.moovit.app.tod.bookingflow.model.TodBookingDropOffLocationState;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupInformation;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.transit.LocationDescriptor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import mf0.C24361g;
import p001a0.C0016g;
import p028ba.C1512f;
import p122i7.C5297a;
import p145k5.C5488g;
import p304x.C7074m0;
import p501fw.C17110h;
import p583jk.C17884p;
import p646lz.C18299a;
import p687nt.C18588a;
import p687nt.C18617o;
import p824tp.C19722a0;
import p873vq.C20197b;
import p900wt.C20415e;
import p923xs.C20576h;
import p950yw.C20780g;
import p950yw.C20781h;
import p950yw.C20782i;
import p950yw.C20783j;
import p977zz.C20961r;
import p977zz.C20963s;
import p977zz.C20975x0;

public final class TodBookingOrderViewModel extends C0989a {

    /* renamed from: c */
    public final C1043v<OrderInformation> f40071c;

    /* renamed from: d */
    public final C1040t<C20961r<TodBookingPickupInformation>> f40072d;

    /* renamed from: e */
    public final C1043v<LocationDescriptor> f40073e;

    /* renamed from: f */
    public final C1040t<TodBookingPickupLocationState> f40074f;

    /* renamed from: g */
    public final C1043v<Boolean> f40075g;

    /* renamed from: h */
    public final C1040t f40076h;

    /* renamed from: i */
    public final C1043v<C20961r<TodBookingDropOffInformation>> f40077i;

    /* renamed from: j */
    public final C1043v<LocationDescriptor> f40078j;

    /* renamed from: k */
    public final C1040t<TodBookingDropOffLocationState> f40079k;

    /* renamed from: l */
    public final C1043v<Boolean> f40080l;

    /* renamed from: m */
    public final C1040t f40081m;

    public TodBookingOrderViewModel(Application application, C1001d0 d0Var) {
        super(application);
        C21100e.m49373x(d0Var, "savedState");
        C1043v<OrderInformation> d = d0Var.mo4294d(false, "order_info", (Object) null);
        this.f40071c = d;
        this.f40075g = d0Var.mo4294d(false, "pickup_loading", (Object) null);
        C1040t E = C24361g.m61135E(C24361g.m61159c0(d, new C16530d()));
        C1040t E2 = C24361g.m61135E(C24361g.m61159c0(d, new C7074m0(1)));
        C1040t<C20961r<TodBookingPickupInformation>> tVar = new C1040t<>();
        this.f40072d = tVar;
        tVar.addSource(E, new C20780g(0, this, E2));
        tVar.addSource(E2, new C20781h(this, E));
        C1043v<LocationDescriptor> d2 = d0Var.mo4294d(false, "pickup_location", (Object) null);
        this.f40073e = d2;
        C1040t<TodBookingPickupLocationState> tVar2 = new C1040t<>();
        this.f40074f = tVar2;
        tVar2.addSource(C24361g.m61135E(tVar), new C5297a(this, 4));
        tVar2.addSource(C24361g.m61135E(d2), new C17110h(this, 3));
        this.f40076h = C24361g.m61159c0(C24361g.m61135E(tVar), new C0016g());
        this.f40080l = d0Var.mo4294d(false, "drop_off_loading", (Object) null);
        C1043v<C20961r<TodBookingDropOffInformation>> vVar = new C1043v<>();
        this.f40077i = vVar;
        C1043v<LocationDescriptor> d3 = d0Var.mo4294d(false, "drop_off_location", (Object) null);
        this.f40078j = d3;
        C1040t<TodBookingDropOffLocationState> tVar3 = new C1040t<>();
        this.f40079k = tVar3;
        tVar3.addSource(C24361g.m61135E(vVar), new C20576h(this, 1));
        tVar3.addSource(C24361g.m61135E(d3), new C20197b(this, 1));
        this.f40081m = C24361g.m61135E(C24361g.m61159c0(d, new C20415e(2)));
    }

    /* renamed from: a */
    public static C13752e m39599a(MoovitApplication<?, ?, ?> moovitApplication) {
        C21100e.m49355o();
        if (UserContextLoader.m40004l(moovitApplication)) {
            C13752e l = moovitApplication.mo44560l();
            if (l.f33853b != null) {
                return l;
            }
            C18299a aVar = moovitApplication.f37321e;
            C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
            if (a0Var != null) {
                return new C13752e(moovitApplication, a0Var, (AnalyticsFlowKey) null);
            }
            StringBuilder k = C13555b.m33972k("Failed to load user context: ");
            k.append(aVar.mo50694g("USER_CONTEXT"));
            throw new ApplicationBugException(k.toString());
        }
        throw new ApplicationBugException("Missing user context!");
    }

    /* renamed from: b */
    public final void mo46213b(Long l, String str) {
        boolean z;
        TodBookingPickupInformation todBookingPickupInformation = null;
        if (str == null) {
            this.f40072d.postValue(null);
            return;
        }
        C20961r value = this.f40072d.getValue();
        if (value != null && value.f52711a) {
            todBookingPickupInformation = (TodBookingPickupInformation) value.f52712b;
        }
        if (todBookingPickupInformation == null || todBookingPickupInformation.f40097e) {
            z = true;
        } else {
            z = !str.equals(todBookingPickupInformation.f40094b);
        }
        if (z) {
            this.f40075g.setValue(Boolean.TRUE);
            Tasks.call(MoovitExecutors.f37327IO, new C5488g(this, 6)).onSuccessTask(MoovitExecutors.COMPUTATION, new C1512f(3, str, l)).addOnCompleteListener(new C20963s(this.f40072d)).addOnCompleteListener(new C18588a(this, 1));
        }
    }

    /* renamed from: c */
    public final void mo46214c(C20961r<TodBookingDropOffInformation> rVar, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        if (locationDescriptor == null || rVar == null || !rVar.f52711a || locationDescriptor2 == null) {
            this.f40079k.postValue(null);
            return;
        }
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C20783j((TodBookingDropOffInformation) rVar.f52712b, locationDescriptor, locationDescriptor2)).addOnCompleteListener((Executor) executorService, new C14762w(2, this, locationDescriptor, locationDescriptor2));
    }

    /* renamed from: d */
    public final void mo46215d(C20961r<TodBookingPickupInformation> rVar, LocationDescriptor locationDescriptor) {
        if (rVar == null || !rVar.f52711a || locationDescriptor == null) {
            this.f40075g.setValue(Boolean.FALSE);
            this.f40074f.postValue(null);
            return;
        }
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C18617o(1, (TodBookingPickupInformation) rVar.f52712b, locationDescriptor)).addOnCompleteListener((Executor) executorService, new C20782i(this, locationDescriptor));
    }

    public static class OrderInformation implements Parcelable {
        public static final Parcelable.Creator<OrderInformation> CREATOR = new C15467a();

        /* renamed from: b */
        public final String f40082b;

        /* renamed from: c */
        public final String f40083c;

        /* renamed from: d */
        public final long f40084d;

        /* renamed from: e */
        public final LocationDescriptor f40085e;

        /* renamed from: f */
        public final LocationDescriptor f40086f;

        /* renamed from: com.moovit.app.tod.bookingflow.TodBookingOrderViewModel$OrderInformation$a */
        public class C15467a implements Parcelable.Creator<OrderInformation> {
            public final Object createFromParcel(Parcel parcel) {
                return new OrderInformation(parcel);
            }

            public final Object[] newArray(int i) {
                return new OrderInformation[i];
            }
        }

        public OrderInformation(String str, String str2, long j, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
            C21100e.m49373x(str, "providerId");
            this.f40082b = str;
            C21100e.m49373x(str2, "taxiProviderId");
            this.f40083c = str2;
            this.f40084d = j;
            this.f40085e = locationDescriptor;
            this.f40086f = locationDescriptor2;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderInformation)) {
                return false;
            }
            OrderInformation orderInformation = (OrderInformation) obj;
            if (!this.f40082b.equals(orderInformation.f40082b) || !this.f40083c.equals(orderInformation.f40083c) || this.f40084d != orderInformation.f40084d || !C20975x0.m49118e(this.f40085e, orderInformation.f40085e) || !C20975x0.m49118e(this.f40086f, orderInformation.f40086f)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C17884p.m44333D(C17884p.m44335F(this.f40082b), C17884p.m44335F(this.f40083c), C17884p.m44334E(this.f40084d), C17884p.m44335F(this.f40085e), C17884p.m44335F(this.f40086f));
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("MainState[providerId=");
            k.append(this.f40082b);
            k.append(", taxiProviderId=");
            k.append(this.f40083c);
            k.append(", pickupTime=");
            k.append(this.f40084d);
            k.append(", pickup=");
            k.append(this.f40085e);
            k.append(", dropOff=");
            k.append(this.f40086f);
            k.append(']');
            return k.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f40082b);
            parcel.writeString(this.f40083c);
            parcel.writeLong(this.f40084d);
            parcel.writeParcelable(this.f40085e, i);
            parcel.writeParcelable(this.f40086f, i);
        }

        public OrderInformation(Parcel parcel) {
            String readString = parcel.readString();
            C21100e.m49373x(readString, "providerId");
            this.f40082b = readString;
            String readString2 = parcel.readString();
            C21100e.m49373x(readString2, "taxiProviderId");
            this.f40083c = readString2;
            this.f40084d = parcel.readLong();
            this.f40085e = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
            this.f40086f = (LocationDescriptor) parcel.readParcelable(LocationDescriptor.class.getClassLoader());
        }
    }
}
