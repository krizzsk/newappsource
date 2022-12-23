package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p435de.C16596f;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p834tz.C19805d;
import p977zz.C20950l0;

public class TransitFrequency implements C5384a, Parcelable {
    public static final Parcelable.Creator<TransitFrequency> CREATOR = new C7807a();

    /* renamed from: e */
    public static final C19805d f23676e = new C19805d(C19584i.f49769a);

    /* renamed from: f */
    public static final C7808b f23677f = new C7808b();

    /* renamed from: g */
    public static final C7809c f23678g = new C7809c(TransitFrequency.class);

    /* renamed from: b */
    public final ServerId f23679b;

    /* renamed from: c */
    public final List<C20950l0<Integer>> f23680c;

    /* renamed from: d */
    public final List<C20950l0<Integer>> f23681d;

    /* renamed from: com.moovit.transit.TransitFrequency$a */
    public class C7807a implements Parcelable.Creator<TransitFrequency> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitFrequency) C19612n.m46981v(parcel, TransitFrequency.f23678g);
        }

        public final Object[] newArray(int i) {
            return new TransitFrequency[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitFrequency$b */
    public class C7808b extends C19621u<TransitFrequency> {
        public C7808b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitFrequency transitFrequency = (TransitFrequency) obj;
            ServerId serverId = transitFrequency.f23679b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            List<C20950l0<Integer>> list = transitFrequency.f23680c;
            C19805d dVar = TransitFrequency.f23676e;
            qVar.mo51965h(list, dVar);
            qVar.mo51965h(transitFrequency.f23681d, dVar);
        }
    }

    /* renamed from: com.moovit.transit.TransitFrequency$c */
    public class C7809c extends C19620t<TransitFrequency> {
        public C7809c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            C19805d dVar = TransitFrequency.f23676e;
            return new TransitFrequency(serverId, pVar.mo51959g(dVar), pVar.mo51959g(dVar));
        }
    }

    public TransitFrequency(ServerId serverId, ArrayList arrayList, ArrayList arrayList2) {
        this.f23679b = serverId;
        C21100e.m49373x(arrayList, "windows");
        this.f23680c = arrayList;
        C21100e.m49373x(arrayList2, "intervals");
        this.f23681d = arrayList2;
        if (arrayList.size() != arrayList2.size()) {
            C16596f a = C16596f.m42113a();
            a.mo49363b("frequency id=" + serverId + ", windows size=" + arrayList.size() + ", intervals size=" + arrayList2.size());
            throw new BadResponseException("windows & intervals must be with the same size");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitFrequency)) {
            return false;
        }
        return this.f23679b.equals(((TransitFrequency) obj).f23679b);
    }

    public final ServerId getServerId() {
        return this.f23679b;
    }

    public final int hashCode() {
        return this.f23679b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23677f);
    }
}
