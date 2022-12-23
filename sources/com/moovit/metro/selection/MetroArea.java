package com.moovit.metro.selection;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MetroArea implements C5384a, Parcelable {
    public static final Parcelable.Creator<MetroArea> CREATOR = new C4117a();

    /* renamed from: e */
    public static final C4118b f14801e = new C4118b(MetroArea.class);

    /* renamed from: b */
    public final ServerId f14802b;

    /* renamed from: c */
    public final String f14803c;

    /* renamed from: d */
    public final List<String> f14804d;

    /* renamed from: com.moovit.metro.selection.MetroArea$a */
    public class C4117a implements Parcelable.Creator<MetroArea> {
        public final Object createFromParcel(Parcel parcel) {
            return (MetroArea) C19612n.m46981v(parcel, MetroArea.f14801e);
        }

        public final Object[] newArray(int i) {
            return new MetroArea[i];
        }
    }

    /* renamed from: com.moovit.metro.selection.MetroArea$b */
    public class C4118b extends C19619s<MetroArea> {
        public C4118b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            List list;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            String p = pVar.mo51947p();
            if (i >= 1) {
                int l = pVar.mo51924l();
                if (l == -1) {
                    list = null;
                } else {
                    ArrayList arrayList = new ArrayList(l);
                    for (int i2 = 0; i2 < l; i2++) {
                        arrayList.add(pVar.mo51948t());
                    }
                    list = arrayList;
                }
            } else {
                list = Collections.emptyList();
            }
            return new MetroArea(serverId, p, list);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MetroArea metroArea = (MetroArea) obj;
            ServerId serverId = metroArea.f14802b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(metroArea.f14803c);
            List<String> list = metroArea.f14804d;
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

    public MetroArea(ServerId serverId, String str, List<String> list) {
        C21100e.m49373x(serverId, "serverId");
        this.f14802b = serverId;
        C21100e.m49373x(str, "name");
        this.f14803c = str;
        C21100e.m49373x(list, "keywords");
        this.f14804d = Collections.unmodifiableList(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MetroArea)) {
            return false;
        }
        return this.f14802b.equals(((MetroArea) obj).f14802b);
    }

    public final ServerId getServerId() {
        return this.f14802b;
    }

    public final int hashCode() {
        return this.f14802b.f15142b;
    }

    public final String toString() {
        return this.f14803c + " (id=" + this.f14802b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14801e);
    }
}
