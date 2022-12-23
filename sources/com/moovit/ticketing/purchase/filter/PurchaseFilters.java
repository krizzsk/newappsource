package com.moovit.ticketing.purchase.filter;

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

public class PurchaseFilters implements Parcelable {
    public static final Parcelable.Creator<PurchaseFilters> CREATOR = new C7686a();

    /* renamed from: d */
    public static final C7687b f23360d = new C7687b(PurchaseFilters.class);

    /* renamed from: b */
    public final List<String> f23361b;

    /* renamed from: c */
    public final List<String> f23362c;

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilters$a */
    public class C7686a implements Parcelable.Creator<PurchaseFilters> {
        public final Object createFromParcel(Parcel parcel) {
            return (PurchaseFilters) C19612n.m46981v(parcel, PurchaseFilters.f23360d);
        }

        public final Object[] newArray(int i) {
            return new PurchaseFilters[i];
        }
    }

    /* renamed from: com.moovit.ticketing.purchase.filter.PurchaseFilters$b */
    public class C7687b extends C19619s<PurchaseFilters> {
        public C7687b(Class cls) {
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
            return new PurchaseFilters(arrayList, arrayList2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PurchaseFilters purchaseFilters = (PurchaseFilters) obj;
            List<String> list = purchaseFilters.f23361b;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51965h(list, iVar);
            qVar.mo51965h(purchaseFilters.f23362c, iVar);
        }
    }

    public PurchaseFilters(List<String> list, List<String> list2) {
        C21100e.m49373x(list, "names");
        this.f23361b = list;
        C21100e.m49373x(list2, LinksConfiguration.KEY_VALUES);
        this.f23362c = list2;
        if (list.size() != list2.size()) {
            StringBuilder k = C13555b.m33972k("Illegal purchase filters. names=");
            k.append(list.size());
            k.append(", valise=");
            k.append(list2.size());
            throw new IllegalStateException(k.toString());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23360d);
    }
}
