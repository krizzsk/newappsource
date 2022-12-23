package com.moovit.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class GtfsConfiguration implements Parcelable {
    public static final Parcelable.Creator<GtfsConfiguration> CREATOR = new C4258a();

    /* renamed from: e */
    public static final GtfsConfiguration f15144e = new GtfsConfiguration(0, -1, -1);

    /* renamed from: f */
    public static final int[] f15145f = {1, 2, 4, 8, 16, 32, 64, RecyclerView.C1119a0.FLAG_IGNORE, 256, 512, 1024, 2048};

    /* renamed from: g */
    public static C4259b f15146g = new C4259b(GtfsConfiguration.class);

    /* renamed from: b */
    public final int f15147b;

    /* renamed from: c */
    public final int f15148c;

    /* renamed from: d */
    public final int f15149d;

    /* renamed from: com.moovit.offline.GtfsConfiguration$a */
    public class C4258a implements Parcelable.Creator<GtfsConfiguration> {
        public final Object createFromParcel(Parcel parcel) {
            return (GtfsConfiguration) C19612n.m46981v(parcel, GtfsConfiguration.f15146g);
        }

        public final Object[] newArray(int i) {
            return new GtfsConfiguration[i];
        }
    }

    /* renamed from: com.moovit.offline.GtfsConfiguration$b */
    public class C4259b extends C19619s<GtfsConfiguration> {
        public C4259b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new GtfsConfiguration(pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            GtfsConfiguration gtfsConfiguration = (GtfsConfiguration) obj;
            qVar.mo51939l(gtfsConfiguration.f15147b);
            qVar.mo51939l(gtfsConfiguration.f15148c);
            qVar.mo51939l(gtfsConfiguration.f15149d);
        }
    }

    public GtfsConfiguration(int i, int i2, int i3) {
        this.f15147b = i;
        this.f15148c = i2;
        this.f15149d = i3;
    }

    /* renamed from: b */
    public static ArrayList m11401b(int i) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = f15145f;
        for (int i2 = 0; i2 < 12; i2++) {
            int i3 = iArr[i2];
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    arrayList.add("metro.dat");
                } else if (i3 == 2) {
                    arrayList.add("lines.dat");
                    arrayList.add("line_ids.dat");
                } else if (i3 == 4) {
                    arrayList.add("stops.dat");
                    arrayList.add("stop_ids.dat");
                } else if (i3 == 8) {
                    arrayList.add("patterns.dat");
                    arrayList.add("pattern_ids.dat");
                } else if (i3 == 16) {
                    arrayList.add("images.dat");
                } else if (i3 == 32) {
                    arrayList.add("walks.dat");
                } else if (i3 == 64) {
                    arrayList.add("services.dat");
                    arrayList.add("service_ids.dat");
                } else if (i3 == 128) {
                    arrayList.add("trips.dat");
                    arrayList.add("trips_index.dat");
                    arrayList.add("trip_frequencies.dat");
                    arrayList.add("trip_frequencies_index.dat");
                } else if (i3 == 256) {
                    arrayList.add("bicycle_stops.dat");
                    arrayList.add("bicycle_stop_ids.dat");
                } else if (i3 == 512) {
                    arrayList.add("shapes.dat");
                } else if (i3 == 1024) {
                    arrayList.add("frequencies.dat");
                } else if (i3 == 2048) {
                    arrayList.add("shape_segments.dat");
                } else {
                    throw new IllegalStateException(C16759e.m42349e("Unknown file type: ", i3));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo19763c() {
        return this.f15148c > 0 && this.f15149d > 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15146g);
    }
}
