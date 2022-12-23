package com.moovit.app.editing.transit;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStopPathway;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class EditorTransitStopPathway extends TransitStopPathway {
    public static final Parcelable.Creator<EditorTransitStopPathway> CREATOR = new C14870a();

    /* renamed from: k */
    public static final C14871b f38002k = new C14871b();

    /* renamed from: l */
    public static final C14872c f38003l = new C14872c(EditorTransitStopPathway.class);

    /* renamed from: h */
    public ServerId f38004h;

    /* renamed from: i */
    public String f38005i;

    /* renamed from: j */
    public boolean f38006j;

    /* renamed from: com.moovit.app.editing.transit.EditorTransitStopPathway$a */
    public class C14870a implements Parcelable.Creator<EditorTransitStopPathway> {
        public final Object createFromParcel(Parcel parcel) {
            return (EditorTransitStopPathway) C19612n.m46981v(parcel, EditorTransitStopPathway.f38003l);
        }

        public final Object[] newArray(int i) {
            return new EditorTransitStopPathway[i];
        }
    }

    /* renamed from: com.moovit.app.editing.transit.EditorTransitStopPathway$b */
    public class C14871b extends C19621u<EditorTransitStopPathway> {
        public C14871b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            EditorTransitStopPathway editorTransitStopPathway = (EditorTransitStopPathway) obj;
            ServerId serverId = editorTransitStopPathway.f38004h;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            TransitStopPathway.C7830b bVar = TransitStopPathway.f23746f;
            qVar.mo51939l(0);
            bVar.mo19622a(editorTransitStopPathway, qVar);
            qVar.mo51955t(editorTransitStopPathway.f38005i);
            qVar.mo51934b(editorTransitStopPathway.f38006j);
        }
    }

    /* renamed from: com.moovit.app.editing.transit.EditorTransitStopPathway$c */
    public class C14872c extends C19620t<EditorTransitStopPathway> {
        public C14872c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new EditorTransitStopPathway(serverId, (TransitStopPathway) TransitStopPathway.f23747g.read(pVar), pVar.mo51948t(), pVar.mo51919b());
        }
    }

    public EditorTransitStopPathway(LatLonE6 latLonE6, ServerId serverId) {
        super(serverId, 3, "", latLonE6);
        this.f38004h = serverId;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EditorTransitStopPathway)) {
            return false;
        }
        EditorTransitStopPathway editorTransitStopPathway = (EditorTransitStopPathway) obj;
        if (!super.equals(obj) || editorTransitStopPathway.f23749c != this.f23749c || !editorTransitStopPathway.f23750d.equals(this.f23750d) || !editorTransitStopPathway.f23751e.equals(this.f23751e) || !editorTransitStopPathway.f38004h.equals(this.f38004h) || !editorTransitStopPathway.f38005i.equals(this.f38005i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f23748b.f15142b, this.f38006j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38002k);
    }

    public EditorTransitStopPathway(ServerId serverId, TransitStopPathway transitStopPathway, String str, boolean z) {
        super(transitStopPathway.f23748b, transitStopPathway.f23749c, transitStopPathway.f23750d, transitStopPathway.f23751e);
        this.f38004h = serverId;
        this.f38006j = z;
        this.f38005i = str;
    }
}
