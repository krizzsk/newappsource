package p250s9;

import android.database.Cursor;
import android.location.Address;
import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13733n;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.moovit.app.home.dashboard.suggestions.itinerary.ItinerarySuggestionFragment;
import com.moovit.app.search.locations.C15284a;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.tranzmate.R;
import f00.C16919g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m50.C18331g;
import p041ca.C1835u;
import p086fa.C4715a;
import p173ma.C5735h;
import p173ma.C5739k;
import p237r9.C6269b;
import p275u9.C6738j;
import p275u9.C6751s;
import p277ub.C6777c;
import p289va.C6891c;
import p503fy.C17127b;
import p577je.C17791f;
import p601ke.C18028a;
import p664mu.C18443f;
import p783rw.C19373e;
import p785ry.C19381a;
import p785ry.C19385e;
import p798sn.C19493a;
import p837ue.C19895d;
import p977zz.C20949l;
import s80.C13070g;
import t60.C19637f;
import x00.C20440a;

/* renamed from: s9.b */
public final /* synthetic */ class C6489b implements C1835u.C1836a, C6777c, C5739k, C18028a.C18029a, SuccessContinuation, RecyclerView.C1126h, C20949l, C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f20236b;

    public /* synthetic */ C6489b(int i) {
        this.f20236b = i;
    }

    /* renamed from: a */
    public C5735h[] mo22593a() {
        return new C5735h[]{new C6891c()};
    }

    public void accept(Object obj) {
        ((C3912b.C3913a) obj).mo16003c();
    }

    public Object apply(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        C6269b bVar = C1835u.f6351g;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C6738j.C6739a a = C6751s.m15889a();
            a.mo22916b(cursor.getString(1));
            a.mo22917c(C4715a.m12026b(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            a.f20867b = bArr;
            arrayList.add(a.mo22915a());
        }
        return arrayList;
    }

    /* renamed from: b */
    public C5735h[] mo252b(Uri uri, Map map) {
        return mo22593a();
    }

    public Object convert(Object obj) {
        String str;
        switch (this.f20236b) {
            case 0:
                Address address = (Address) obj;
                ServerId serverId = C15284a.f39471U;
                ResourceImage resourceImage = new ResourceImage(R.drawable.img_map_station_gondola, new String[0]);
                String addressLine = address.getAddressLine(0);
                if (address.getMaxAddressLineIndex() >= 1) {
                    str = address.getAddressLine(1);
                } else {
                    str = "";
                }
                C20440a aVar = new C20440a((CharSequence) str, (String) null);
                return new SearchLocationItem(new ServerId(-1), SearchLocationItem.Type.SITE, resourceImage, addressLine, Collections.singletonList(aVar), LatLonE6.m40176g(address.getLatitude(), address.getLongitude()), false, (String) null, -1, SearchLocationItem.Source.DEFAULT, -1);
            case 1:
                return ((TodRide) obj).f40264b;
            case 2:
                C16919g.C16920a aVar2 = C17127b.f44341e;
                return ((GcmNotification) obj).f41524g.f41546b;
            case 3:
                return Boolean.valueOf(((C18331g) obj).mo50785m2());
            case 4:
                return ((PaymentGatewayFragment.C16322a) obj).mo23106L();
            case 5:
                return C13070g.m33015g((C19493a) obj);
            default:
                return Integer.valueOf(((List) obj).size());
        }
    }

    /* renamed from: f */
    public Object mo245f(JsonReader jsonReader) {
        String str;
        C19895d dVar = C18028a.f46139a;
        jsonReader.beginObject();
        String str2 = null;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("filename")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null filename");
                }
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                bArr = Base64.decode(jsonReader.nextString(), 2);
                if (bArr == null) {
                    throw new NullPointerException("Null contents");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " filename";
        } else {
            str = "";
        }
        if (bArr == null) {
            str = C25541a.m63881k(str, " contents");
        }
        if (str.isEmpty()) {
            return new C17791f(str2, bArr);
        }
        throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
    }

    /* renamed from: g */
    public int mo255g(int i, int i2) {
        int i3 = ItinerarySuggestionFragment.f38318r;
        return (i - i2) - 1;
    }

    public boolean invoke(Object obj) {
        switch (this.f20236b) {
            case 12:
                String str = C19373e.f49295k;
                ((C19373e.C19374a) obj).mo51779T0();
                return true;
            default:
                int i = C19637f.f49826h;
                ((C19637f.C19638a) obj).mo51972A0();
                return true;
        }
    }

    public Task then(Object obj) {
        List<WondoCode> list;
        switch (this.f20236b) {
            case 9:
                C14535a.C14536a aVar = (C14535a.C14536a) obj;
                return Tasks.forResult(null);
            case 11:
                List list2 = (List) obj;
                C18443f fVar = C18443f.f47013e;
                if (list2 == null) {
                    list2 = Collections.emptyList();
                }
                return Tasks.forResult(list2);
            default:
                C19381a aVar2 = (C19381a) obj;
                C19385e eVar = C19385e.f49315c;
                if (aVar2 != null) {
                    list = aVar2.f49305c;
                } else {
                    list = Collections.emptyList();
                }
                return Tasks.forResult(list);
        }
    }
}
