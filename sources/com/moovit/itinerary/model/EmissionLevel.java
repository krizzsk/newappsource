package com.moovit.itinerary.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.util.ColorScheme;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class EmissionLevel implements Parcelable {
    public static final Parcelable.Creator<EmissionLevel> CREATOR = new C16083a();

    /* renamed from: d */
    public static final C16084b f41889d = new C16084b(EmissionLevel.class);

    /* renamed from: b */
    public final int f41890b;

    /* renamed from: c */
    public final ColorScheme f41891c;

    /* renamed from: com.moovit.itinerary.model.EmissionLevel$a */
    public class C16083a implements Parcelable.Creator<EmissionLevel> {
        public final Object createFromParcel(Parcel parcel) {
            return (EmissionLevel) C19612n.m46981v(parcel, EmissionLevel.f41889d);
        }

        public final Object[] newArray(int i) {
            return new EmissionLevel[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.EmissionLevel$b */
    public class C16084b extends C19619s<EmissionLevel> {
        public C16084b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new EmissionLevel(pVar.mo51924l(), (ColorScheme) ColorScheme.CODER.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EmissionLevel emissionLevel = (EmissionLevel) obj;
            qVar.mo51939l(emissionLevel.f41890b);
            ColorScheme.CODER.write(emissionLevel.f41891c, qVar);
        }
    }

    public EmissionLevel(int i, ColorScheme colorScheme) {
        C21100e.m49359q(i, "co2");
        this.f41890b = i;
        C21100e.m49373x(colorScheme, "color");
        this.f41891c = colorScheme;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmissionLevel)) {
            return false;
        }
        EmissionLevel emissionLevel = (EmissionLevel) obj;
        if (this.f41890b != emissionLevel.f41890b || !this.f41891c.equals(emissionLevel.f41891c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f41890b, C17884p.m44335F(this.f41891c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41889d);
    }
}
