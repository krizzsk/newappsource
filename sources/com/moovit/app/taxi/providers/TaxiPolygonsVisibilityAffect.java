package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p810sz.C19577c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001j\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo59060d2 = {"Lcom/moovit/app/taxi/providers/TaxiPolygonsVisibilityAffect;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NONE", "VISIBLE_INSIDE", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public enum TaxiPolygonsVisibilityAffect implements Parcelable {
    NONE,
    VISIBLE_INSIDE;
    
    /* access modifiers changed from: private */
    public static final C19577c<TaxiPolygonsVisibilityAffect> CODER = null;
    public static final Parcelable.Creator<TaxiPolygonsVisibilityAffect> CREATOR = null;
    public static final C15435a Companion = null;

    /* renamed from: com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect$a */
    public static final class C15435a {
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiPolygonsVisibilityAffect$b */
    public static final class C15436b implements Parcelable.Creator<TaxiPolygonsVisibilityAffect> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return TaxiPolygonsVisibilityAffect.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new TaxiPolygonsVisibilityAffect[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TaxiPolygonsVisibilityAffect taxiPolygonsVisibilityAffect;
        TaxiPolygonsVisibilityAffect taxiPolygonsVisibilityAffect2;
        Companion = new C15435a();
        CREATOR = new C15436b();
        CODER = new C19577c<>(TaxiPolygonsVisibilityAffect.class, taxiPolygonsVisibilityAffect, taxiPolygonsVisibilityAffect2);
    }

    public static final C19577c<TaxiPolygonsVisibilityAffect> getCODER() {
        Companion.getClass();
        return CODER;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(name());
    }
}
