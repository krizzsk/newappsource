package com.moovit.app.taxi.providers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.util.ServerIdMap;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiProvidersManager implements Parcelable {
    public static final Parcelable.Creator<TaxiProvidersManager> CREATOR = new C15441a();

    /* renamed from: d */
    public static final C15442b f39984d = new C15442b(TaxiProvidersManager.class);

    /* renamed from: b */
    public final List<TaxiProvider> f39985b;

    /* renamed from: c */
    public final Map<ServerId, TaxiProvider> f39986c;

    /* renamed from: com.moovit.app.taxi.providers.TaxiProvidersManager$a */
    public class C15441a implements Parcelable.Creator<TaxiProvidersManager> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiProvidersManager) C19612n.m46981v(parcel, TaxiProvidersManager.f39984d);
        }

        public final Object[] newArray(int i) {
            return new TaxiProvidersManager[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiProvidersManager$b */
    public class C15442b extends C19619s<TaxiProvidersManager> {
        public C15442b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TaxiProvidersManager(pVar.mo51959g(TaxiProvider.f39966s));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((TaxiProvidersManager) obj).f39985b, TaxiProvider.f39966s);
        }
    }

    public TaxiProvidersManager(List<TaxiProvider> list) {
        C21100e.m49373x(list, "providers");
        this.f39985b = Collections.unmodifiableList(list);
        this.f39986c = Collections.unmodifiableMap(ServerIdMap.m17949a(list));
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static TaxiProvidersManager m39496b(Context context) {
        return (TaxiProvidersManager) context.getSystemService("taxi_providers_manager");
    }

    /* renamed from: c */
    public final TaxiProvider mo46163c(ServerId serverId) {
        return this.f39986c.get(serverId);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiProvidersManager{providers=");
        k.append(this.f39985b.size());
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39984d);
    }
}
