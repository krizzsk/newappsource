package com.moovit.app.useraccount.manager.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.transit.TransitStop;
import java.io.IOException;
import java.util.ArrayList;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class LinesAtStopGroup extends FavoriteGroup<TransitStop, LineFavorite> {
    public static final Parcelable.Creator<LinesAtStopGroup> CREATOR = new C15604a();

    /* renamed from: d */
    public static final C15605b f40595d = new C15605b();

    /* renamed from: e */
    public static final C15606c f40596e = new C15606c(LinesAtStopGroup.class);

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LinesAtStopGroup$a */
    public class C15604a implements Parcelable.Creator<LinesAtStopGroup> {
        public final Object createFromParcel(Parcel parcel) {
            return (LinesAtStopGroup) C19612n.m46981v(parcel, LinesAtStopGroup.f40596e);
        }

        public final Object[] newArray(int i) {
            return new LinesAtStopGroup[i];
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LinesAtStopGroup$b */
    public class C15605b extends C19621u<LinesAtStopGroup> {
        public C15605b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LinesAtStopGroup linesAtStopGroup = (LinesAtStopGroup) obj;
            TransitStop.C7827b bVar = TransitStop.f23728r;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a((TransitStop) linesAtStopGroup.f40591b, qVar);
            qVar.mo51965h(linesAtStopGroup.mo46585b(), LineFavorite.f40593c);
        }
    }

    /* renamed from: com.moovit.app.useraccount.manager.favorites.LinesAtStopGroup$c */
    public class C15606c extends C19620t<LinesAtStopGroup> {
        public C15606c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            TransitStop.C7828c cVar = TransitStop.f23729s;
            pVar.getClass();
            ArrayList g = pVar.mo51959g(LineFavorite.f40594d);
            LinesAtStopGroup linesAtStopGroup = new LinesAtStopGroup((TransitStop) cVar.read(pVar));
            linesAtStopGroup.f40592c.addAll(g);
            return linesAtStopGroup;
        }
    }

    public LinesAtStopGroup(TransitStop transitStop) {
        super(transitStop);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40595d);
    }
}
