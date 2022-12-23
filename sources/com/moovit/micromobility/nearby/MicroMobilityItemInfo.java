package com.moovit.micromobility.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.network.model.ServerId;
import com.moovit.util.StyledText;
import java.io.IOException;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityItemInfo implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityItemInfo> CREATOR = new C4151a();

    /* renamed from: m */
    public static final C4152b f14893m = new C4152b(MicroMobilityItemInfo.class);

    /* renamed from: b */
    public final ServerId f14894b;

    /* renamed from: c */
    public final String f14895c;

    /* renamed from: d */
    public final LatLonE6 f14896d;

    /* renamed from: e */
    public final Image f14897e;

    /* renamed from: f */
    public final Image f14898f;

    /* renamed from: g */
    public final String f14899g;

    /* renamed from: h */
    public final String f14900h;

    /* renamed from: i */
    public final String f14901i;

    /* renamed from: j */
    public final List<StyledText> f14902j;

    /* renamed from: k */
    public final MicroMobilityIntegrationItem f14903k;

    /* renamed from: l */
    public final List<MicroMobilityProperty> f14904l;

    /* renamed from: com.moovit.micromobility.nearby.MicroMobilityItemInfo$a */
    public class C4151a implements Parcelable.Creator<MicroMobilityItemInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityItemInfo) C19612n.m46981v(parcel, MicroMobilityItemInfo.f14893m);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityItemInfo[i];
        }
    }

    /* renamed from: com.moovit.micromobility.nearby.MicroMobilityItemInfo$b */
    public class C4152b extends C19619s<MicroMobilityItemInfo> {
        public C4152b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new MicroMobilityItemInfo(serverId, pVar.mo51947p(), (LatLonE6) LatLonE6.f40979g.read(pVar), (Image) C16019d.m40803a().f41718d.read(pVar), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51947p(), pVar.mo51958f(StyledText.f23869f), (MicroMobilityIntegrationItem) MicroMobilityIntegrationItem.f14811f.read(pVar), pVar.mo51958f(MicroMobilityProperty.f14905g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityItemInfo microMobilityItemInfo = (MicroMobilityItemInfo) obj;
            ServerId serverId = microMobilityItemInfo.f14894b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(microMobilityItemInfo.f14895c);
            LatLonE6.f40978f.write(microMobilityItemInfo.f14896d, qVar);
            C16019d.m40803a().f41718d.write(microMobilityItemInfo.f14897e, qVar);
            qVar.mo51967q(microMobilityItemInfo.f14898f, C16019d.m40803a().f41718d);
            qVar.mo51955t(microMobilityItemInfo.f14899g);
            qVar.mo51955t(microMobilityItemInfo.f14900h);
            qVar.mo51954p(microMobilityItemInfo.f14901i);
            qVar.mo51964g(microMobilityItemInfo.f14902j, StyledText.f23869f);
            MicroMobilityIntegrationItem microMobilityIntegrationItem = microMobilityItemInfo.f14903k;
            MicroMobilityIntegrationItem.C4123b bVar = MicroMobilityIntegrationItem.f14811f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(microMobilityIntegrationItem, qVar);
            qVar.mo51964g(microMobilityItemInfo.f14904l, MicroMobilityProperty.f14905g);
        }
    }

    public MicroMobilityItemInfo(ServerId serverId, String str, LatLonE6 latLonE6, Image image, Image image2, String str2, String str3, String str4, List<StyledText> list, MicroMobilityIntegrationItem microMobilityIntegrationItem, List<MicroMobilityProperty> list2) {
        C21100e.m49373x(serverId, "typeId");
        this.f14894b = serverId;
        C21100e.m49373x(str, "typeName");
        this.f14895c = str;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f14896d = latLonE6;
        C21100e.m49373x(image, "mapImage");
        this.f14897e = image;
        this.f14898f = image2;
        this.f14899g = str2;
        this.f14900h = str3;
        C21100e.m49373x(str4, "serviceName");
        this.f14901i = str4;
        this.f14902j = list;
        C21100e.m49373x(microMobilityIntegrationItem, "integrationItem");
        this.f14903k = microMobilityIntegrationItem;
        this.f14904l = list2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14893m);
    }
}
