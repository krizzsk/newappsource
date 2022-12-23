package p879vw;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.taxi.TaxiOrder;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.usebutton.sdk.Button;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;
import p145k5.C5488g;
import p176n0.C5788g;

/* renamed from: vw.d */
public final class C20242d implements C20241c {
    /* renamed from: a */
    public final void mo52437a(Context context) {
        Tasks.call(MoovitExecutors.MAIN_THREAD, new C5488g(context, 5));
    }

    /* renamed from: b */
    public final void mo52438b(MoovitActivity moovitActivity, TaxiProvider taxiProvider, TaxiOrder taxiOrder, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("m.uber.com").appendPath("ul").appendQueryParameter(Events.PROPERTY_ACTION, "setPickup").appendQueryParameter("client_id", moovitActivity.getString(R.string.uber_client_id));
        LocationDescriptor locationDescriptor = taxiOrder.f39913b;
        if (locationDescriptor.mo24310d() == null) {
            builder.appendQueryParameter("pickup", "my_location");
        } else {
            LatLonE6 d = locationDescriptor.mo24310d();
            builder.appendQueryParameter("pickup[latitude]", d.mo46925n());
            builder.appendQueryParameter("pickup[longitude]", d.mo46927q());
            String f = locationDescriptor.mo24313f();
            if (f == null || locationDescriptor.f23647b == LocationDescriptor.LocationType.CURRENT) {
                builder.appendQueryParameter("pickup[nickname]", "");
            } else {
                builder.appendQueryParameter("pickup[nickname]", f);
            }
        }
        LocationDescriptor locationDescriptor2 = taxiOrder.f39914c;
        if (locationDescriptor2 == null || locationDescriptor2.mo24310d() == null) {
            builder.appendQueryParameter("dropoff[latitude]", "");
            builder.appendQueryParameter("dropoff[longitude]", "");
            builder.appendQueryParameter("dropoff[nickname]", "");
        } else {
            LatLonE6 d2 = locationDescriptor2.mo24310d();
            builder.appendQueryParameter("dropoff[latitude]", d2.mo46925n());
            builder.appendQueryParameter("dropoff[longitude]", d2.mo46927q());
            String f2 = locationDescriptor2.mo24313f();
            if (f2 == null || locationDescriptor2.f23647b == LocationDescriptor.LocationType.CURRENT) {
                builder.appendQueryParameter("dropoff[nickname]", "");
            } else {
                builder.appendQueryParameter("dropoff[nickname]", f2);
            }
        }
        Button.purchasePath().fetch(new PurchasePathRequest(builder.build().toString()), new C5788g(moovitActivity, taxiProvider, str));
    }
}
