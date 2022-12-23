package com.moovit.map.collections.category.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CommercialMetadata implements Parcelable {
    public static final Parcelable.Creator<CommercialMetadata> CREATOR = new C16262a();

    /* renamed from: c */
    public static final C16263b f42487c = new C16263b(CommercialMetadata.class);

    /* renamed from: b */
    public final ServerId f42488b;

    /* renamed from: com.moovit.map.collections.category.types.CommercialMetadata$a */
    public class C16262a implements Parcelable.Creator<CommercialMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (CommercialMetadata) C19612n.m46981v(parcel, CommercialMetadata.f42487c);
        }

        public final Object[] newArray(int i) {
            return new CommercialMetadata[i];
        }
    }

    /* renamed from: com.moovit.map.collections.category.types.CommercialMetadata$b */
    public class C16263b extends C19619s<CommercialMetadata> {
        public C16263b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new CommercialMetadata(new ServerId(pVar.mo51924l()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ServerId serverId = ((CommercialMetadata) obj).f42488b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
        }
    }

    public CommercialMetadata(ServerId serverId) {
        this.f42488b = serverId;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42487c);
    }
}
