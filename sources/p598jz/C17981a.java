package p598jz;

import aa0.C7530f;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import p824tp.C19746x;

/* renamed from: jz.a */
public final /* synthetic */ class C17981a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C17983c f46066b;

    public /* synthetic */ C17981a(C17983c cVar) {
        this.f46066b = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LatLonE6 latLonE6;
        C17983c cVar = this.f46066b;
        int i2 = C17983c.f46068i;
        Context context = cVar.getContext();
        if (!(context == null || (latLonE6 = (LatLonE6) cVar.mo46752K1().getParcelable("commercialLocationExtra")) == null)) {
            LocationDescriptor k = LocationDescriptor.m17770k(latLonE6);
            k.f23651f = cVar.f46069h;
            Uri f = C7530f.m17273f(k);
            if (f != null) {
                Intent intent = new Intent();
                intent.setData(f);
                intent.setPackage(context.getPackageName());
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    cVar.startActivity(intent);
                    cVar.dismissAllowingStateLoss();
                } else {
                    intent.setPackage((String) null);
                    cVar.startActivity(Intent.createChooser(intent, context.getString(C19746x.open_file_chooser)));
                    cVar.dismissAllowingStateLoss();
                }
            }
        }
        cVar.dismissAllowingStateLoss();
    }
}
