package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class FavoritesPayload extends GcmPayload {
    public static final Parcelable.Creator<FavoritesPayload> CREATOR = new C15920a();

    /* renamed from: c */
    public static final C15921b f41544c = new C15921b();

    /* renamed from: d */
    public static final C15922c f41545d = new C15922c(FavoritesPayload.class);

    /* renamed from: com.moovit.gcm.payload.FavoritesPayload$a */
    public class C15920a implements Parcelable.Creator<FavoritesPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (FavoritesPayload) C19612n.m46981v(parcel, FavoritesPayload.f41545d);
        }

        public final Object[] newArray(int i) {
            return new FavoritesPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.FavoritesPayload$b */
    public class C15921b extends C19621u<FavoritesPayload> {
        public C15921b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((FavoritesPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.FavoritesPayload$c */
    public class C15922c extends C19620t<FavoritesPayload> {
        public C15922c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new FavoritesPayload(pVar.mo51947p());
        }
    }

    public FavoritesPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48031v(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "favorites";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41544c);
    }
}
