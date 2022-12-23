package com.moovit.micromobility.purchase.step.filter;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityAppliedFilters implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityAppliedFilters> CREATOR = new C4166a();

    /* renamed from: d */
    public static final C4167b f14938d = new C4167b(MicroMobilityAppliedFilters.class);

    /* renamed from: b */
    public final List<String> f14939b;

    /* renamed from: c */
    public final List<String> f14940c;

    /* renamed from: com.moovit.micromobility.purchase.step.filter.MicroMobilityAppliedFilters$a */
    public class C4166a implements Parcelable.Creator<MicroMobilityAppliedFilters> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityAppliedFilters) C19612n.m46981v(parcel, MicroMobilityAppliedFilters.f14938d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityAppliedFilters[i];
        }
    }

    /* renamed from: com.moovit.micromobility.purchase.step.filter.MicroMobilityAppliedFilters$b */
    public class C4167b extends C19619s<MicroMobilityAppliedFilters> {
        public C4167b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ArrayList arrayList;
            int l = pVar.mo51924l();
            ArrayList arrayList2 = null;
            if (l == -1) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(l);
                for (int i2 = 0; i2 < l; i2++) {
                    arrayList.add(pVar.mo51948t());
                }
            }
            int l2 = pVar.mo51924l();
            if (l2 != -1) {
                arrayList2 = new ArrayList(l2);
                for (int i3 = 0; i3 < l2; i3++) {
                    arrayList2.add(pVar.mo51948t());
                }
            }
            return new MicroMobilityAppliedFilters(arrayList, arrayList2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityAppliedFilters microMobilityAppliedFilters = (MicroMobilityAppliedFilters) obj;
            List<String> list = microMobilityAppliedFilters.f14939b;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51965h(list, iVar);
            qVar.mo51965h(microMobilityAppliedFilters.f14940c, iVar);
        }
    }

    public MicroMobilityAppliedFilters(ArrayList arrayList, ArrayList arrayList2) {
        C21100e.m49373x(arrayList, "names");
        this.f14939b = arrayList;
        C21100e.m49373x(arrayList2, LinksConfiguration.KEY_VALUES);
        this.f14940c = arrayList2;
        if (arrayList.size() != arrayList2.size()) {
            StringBuilder k = C13555b.m33972k("Illegal purchase filters. names=");
            k.append(arrayList.size());
            k.append(", valise=");
            k.append(arrayList2.size());
            throw new IllegalStateException(k.toString());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14938d);
    }
}
