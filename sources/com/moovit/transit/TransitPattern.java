package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import e00.C16760a;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TransitPattern implements Parcelable, C5384a {
    public static final Parcelable.Creator<TransitPattern> CREATOR = new C7818a();

    /* renamed from: f */
    public static final C7819b f23706f = new C7819b();

    /* renamed from: g */
    public static final C7820c f23707g = new C7820c(TransitPattern.class);

    /* renamed from: b */
    public final ServerId f23708b;

    /* renamed from: c */
    public final List<DbEntityRef<TransitStop>> f23709c;

    /* renamed from: d */
    public final List<String> f23710d;

    /* renamed from: e */
    public final Map<ServerId, int[]> f23711e;

    /* renamed from: com.moovit.transit.TransitPattern$a */
    public class C7818a implements Parcelable.Creator<TransitPattern> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitPattern) C19612n.m46981v(parcel, TransitPattern.f23707g);
        }

        public final Object[] newArray(int i) {
            return new TransitPattern[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitPattern$b */
    public class C7819b extends C19621u<TransitPattern> {
        public C7819b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitPattern transitPattern = (TransitPattern) obj;
            ServerId serverId = transitPattern.f23708b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51965h(transitPattern.f23709c, DbEntityRef.TRANSIT_STOP_REF_CODER);
            List<String> list = transitPattern.f23710d;
            if (list == null) {
                qVar.mo51939l(-1);
                return;
            }
            qVar.mo51939l(list.size());
            for (String t : list) {
                qVar.mo51955t(t);
            }
        }
    }

    /* renamed from: com.moovit.transit.TransitPattern$c */
    public class C7820c extends C19620t<TransitPattern> {
        public C7820c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ArrayList arrayList;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            ArrayList<DbEntityRef<TransitStop>> g = pVar.mo51959g(DbEntityRef.TRANSIT_STOP_REF_CODER);
            int l = pVar.mo51924l();
            if (l == -1) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(l);
                for (int i2 = 0; i2 < l; i2++) {
                    arrayList2.add(pVar.mo51948t());
                }
                arrayList = arrayList2;
            }
            return new TransitPattern(serverId, g, arrayList);
        }
    }

    public TransitPattern(ServerId serverId, ArrayList arrayList, List list) {
        this.f23708b = serverId;
        C21100e.m49373x(arrayList, "stopRefSequence");
        this.f23709c = Collections.unmodifiableList(new ArrayList(arrayList));
        C21100e.m49373x(list, "stopNames");
        this.f23710d = Collections.unmodifiableList(new ArrayList(list));
        if (arrayList.size() == list.size()) {
            int size = arrayList.size();
            C16760a aVar = new C16760a(new C6302b(size), new int[0]);
            int[] iArr = new int[1];
            for (int i = 0; i < size; i++) {
                ServerId serverId2 = ((DbEntityRef) arrayList.get(i)).getServerId();
                iArr[0] = i;
                int[] iArr2 = (int[]) aVar.get(serverId2);
                int length = iArr2.length;
                int[] iArr3 = new int[(length + 1)];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr3[i2] = iArr2[i2];
                }
                for (int i3 = 0; i3 < 1; i3++) {
                    iArr3[length + i3] = iArr[i3];
                }
                aVar.put(serverId2, iArr3);
            }
            this.f23711e = Collections.unmodifiableMap(aVar);
            return;
        }
        throw new IllegalStateException("stop sequence & names must be with the same size");
    }

    /* renamed from: b */
    public final int mo24384b(ServerId serverId) {
        int[] d = mo24386d(serverId);
        if (d.length == 0) {
            return -1;
        }
        return d[0];
    }

    /* renamed from: c */
    public final ServerId mo24385c(int i) {
        if (i < 0 || i >= this.f23709c.size()) {
            return null;
        }
        return this.f23709c.get(i).getServerId();
    }

    /* renamed from: d */
    public final int[] mo24386d(ServerId serverId) {
        return this.f23711e.get(serverId);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitPattern)) {
            return false;
        }
        return this.f23708b.equals(((TransitPattern) obj).f23708b);
    }

    /* renamed from: f */
    public final int mo24389f() {
        return this.f23709c.size();
    }

    /* renamed from: g */
    public final boolean mo24390g(ServerId serverId) {
        return this.f23711e.containsKey(serverId);
    }

    public final ServerId getServerId() {
        return this.f23708b;
    }

    public final int hashCode() {
        return this.f23708b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23706f);
    }
}
