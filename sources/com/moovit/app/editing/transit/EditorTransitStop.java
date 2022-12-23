package com.moovit.app.editing.transit;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.C16019d;
import com.moovit.image.model.ImageSet;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class EditorTransitStop implements Parcelable {
    public static final Parcelable.Creator<EditorTransitStop> CREATOR = new C14867a();

    /* renamed from: i */
    public static final C14868b f37993i = new C14868b();

    /* renamed from: j */
    public static final C14869c f37994j = new C14869c(EditorTransitStop.class);

    /* renamed from: b */
    public final ServerId f37995b;

    /* renamed from: c */
    public final String f37996c;

    /* renamed from: d */
    public final LatLonE6 f37997d;

    /* renamed from: e */
    public final List<EditorTransitStopPathway> f37998e;

    /* renamed from: f */
    public final ImageSet f37999f;

    /* renamed from: g */
    public final String f38000g;

    /* renamed from: h */
    public final boolean f38001h;

    /* renamed from: com.moovit.app.editing.transit.EditorTransitStop$a */
    public class C14867a implements Parcelable.Creator<EditorTransitStop> {
        public final Object createFromParcel(Parcel parcel) {
            return (EditorTransitStop) C19612n.m46981v(parcel, EditorTransitStop.f37994j);
        }

        public final Object[] newArray(int i) {
            return new EditorTransitStop[i];
        }
    }

    /* renamed from: com.moovit.app.editing.transit.EditorTransitStop$b */
    public class C14868b extends C19621u<EditorTransitStop> {
        public C14868b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            EditorTransitStop editorTransitStop = (EditorTransitStop) obj;
            ServerId serverId = editorTransitStop.f37995b;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51955t(editorTransitStop.f37996c);
            qVar.mo51967q(editorTransitStop.f37997d, LatLonE6.f40978f);
            qVar.mo51965h(editorTransitStop.f37998e, EditorTransitStopPathway.f38002k);
            ImageSet imageSet = editorTransitStop.f37999f;
            ImageSet.C16054b bVar = C16019d.m40803a().f41719e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(imageSet, qVar);
            qVar.mo51955t(editorTransitStop.f38000g);
            qVar.mo51934b(editorTransitStop.f38001h);
        }
    }

    /* renamed from: com.moovit.app.editing.transit.EditorTransitStop$c */
    public class C14869c extends C19620t<EditorTransitStop> {
        public C14869c(Class cls) {
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
            return new EditorTransitStop(serverId, pVar.mo51948t(), (LatLonE6) pVar.mo51962q(LatLonE6.f40979g), pVar.mo51959g(EditorTransitStopPathway.f38003l), (ImageSet) C16019d.m40803a().f41719e.read(pVar), pVar.mo51948t(), pVar.mo51919b());
        }
    }

    public EditorTransitStop(ServerId serverId, String str, LatLonE6 latLonE6, ArrayList arrayList, ImageSet imageSet, String str2, boolean z) {
        this.f37995b = serverId;
        this.f37996c = str;
        this.f37997d = latLonE6;
        this.f37998e = arrayList;
        this.f37999f = imageSet;
        this.f38000g = str2;
        this.f38001h = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37993i);
    }
}
