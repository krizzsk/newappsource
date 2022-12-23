package p944yq;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import c00.C13717b;
import c40.C1777a;
import c40.C1778b;
import c40.C1779c;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.app.search.locations.C15284a;
import com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.utils.Color;
import com.moovit.image.model.ImageSet;
import com.moovit.location.C16202a;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.map.walking.MapWalkingDirectionsActivity;
import com.moovit.micromobility.external.CycleCenterReservationActivity;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.transit.LocationDescriptor;
import j20.C17707d;
import java.util.Iterator;
import java.util.List;
import l30.C5585p;
import lf0.C24236l;
import mf0.C24362h;
import o20.C18699e;
import o20.C18714t;
import p693nz.C18659h;
import p977zz.C20950l0;
import t30.C6586z;
import u30.C6687a;

/* renamed from: yq.a */
public final /* synthetic */ class C20750a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f52354b;

    /* renamed from: c */
    public final /* synthetic */ Object f52355c;

    public /* synthetic */ C20750a(Object obj, int i) {
        this.f52354b = i;
        this.f52355c = obj;
    }

    public final void onSuccess(Object obj) {
        int i;
        Iterator<C1779c> it;
        int i2;
        int i3;
        Object obj2 = obj;
        char c = 0;
        switch (this.f52354b) {
            case 0:
                ((C20751b) this.f52355c).f52363l = (String) obj2;
                return;
            case 1:
                View view = (View) this.f52355c;
                if (C13717b.m34258e((List) obj2)) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                return;
            case 2:
                ((C15284a) this.f52355c).f39496S = (C16202a.C16203a) obj2;
                return;
            case 3:
                C24236l lVar = (C24236l) this.f52355c;
                int i4 = MLKitBarcodeScannerFragment.f40812q;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke(obj2);
                return;
            case 4:
                MapWalkingDirectionsActivity mapWalkingDirectionsActivity = (MapWalkingDirectionsActivity) this.f52355c;
                C17707d dVar = (C17707d) obj2;
                int i5 = MapWalkingDirectionsActivity.f42571p0;
                mapWalkingDirectionsActivity.getClass();
                LocationDescriptor locationDescriptor = dVar.f45454e;
                if (locationDescriptor == null) {
                    locationDescriptor = dVar.f45450a;
                }
                mapWalkingDirectionsActivity.f42575Z = locationDescriptor;
                return;
            case 5:
                C5585p pVar = (C5585p) this.f52355c;
                C18659h<String, Polyline> hVar = C5585p.f18297h;
                pVar.getClass();
                Iterator<C1779c> it2 = ((C6586z) obj2).f20403m.iterator();
                while (it2.hasNext()) {
                    C1779c next = it2.next();
                    C1778b bVar = next.f6253a;
                    if (bVar != null) {
                        Color color = bVar.f6250c;
                        int i6 = bVar.f6251d;
                        if (i6 == -1) {
                            i2 = 0;
                        } else {
                            i2 = i6;
                        }
                        int i7 = bVar.f6252e;
                        if (i7 == -1) {
                            i3 = 256;
                        } else {
                            i3 = i7;
                        }
                        Object[] objArr = new Object[3];
                        objArr[c] = color;
                        objArr[1] = Integer.valueOf(i2);
                        objArr[2] = Integer.valueOf(i3);
                        C18659h<Object, C18699e<C16286k>> hVar2 = C5585p.f18300k;
                        C18699e eVar = hVar2.get(objArr);
                        if (eVar == null) {
                            Color.C15756a aVar = Color.f40999c;
                            Color color2 = new Color(android.graphics.Color.argb(Math.round((((float) 20) / 100.0f) * 255.0f), android.graphics.Color.red(color.f41007b), android.graphics.Color.green(color.f41007b), android.graphics.Color.blue(color.f41007b)));
                            LineStyle.LineJoin lineJoin = LineStyle.LineJoin.ROUND;
                            C21100e.m49373x(lineJoin, "lineJoin");
                            C21100e.m49357p(5.0f, "strokeWidth");
                            LineStyle lineStyle = r6;
                            it = it2;
                            LineStyle lineStyle2 = new LineStyle(color, 5.0f, lineJoin, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED);
                            eVar = new C18699e(new C16286k(color2, lineStyle), i2, i3, (SparseArray) null);
                            hVar2.put(objArr, eVar);
                        } else {
                            it = it2;
                        }
                        MapFragment mapFragment = pVar.f18304c;
                        C18714t tVar = new C18714t(bVar, bVar.f6248a, bVar.f6249b, eVar);
                        mapFragment.getClass();
                        C21100e.m49369v(1);
                        mapFragment.f42368n.mo48811s().mo51066d(tVar);
                    } else {
                        it = it2;
                    }
                    C1777a aVar2 = next.f6254b;
                    if (aVar2 != null) {
                        ImageSet imageSet = aVar2.f6247b;
                        C18659h<ImageSet, C18699e<MarkerZoomStyle>> hVar3 = C5585p.f18301l;
                        C18699e<MEZS> eVar2 = hVar3.get(imageSet);
                        if (eVar2 == null) {
                            eVar2 = C18699e.m45697a(MarkerZoomStyle.m41440c(aVar2.f6247b));
                            hVar3.put(imageSet, eVar2);
                        }
                        MapFragment mapFragment2 = pVar.f18304c;
                        LatLonE6 latLonE6 = aVar2.f6246a;
                        mapFragment2.mo48648p2(latLonE6, latLonE6, eVar2);
                    }
                    it2 = it;
                    c = 0;
                }
                return;
            case 6:
                C20950l0<Integer> l0Var = CycleCenterReservationActivity.f14868w0;
                ((CycleCenterReservationActivity) this.f52355c).mo19484y2((PaymentAccount) obj2);
                return;
            default:
                String str = (String) obj2;
                MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) ((C6687a) this.f52355c).f40822c;
                ((MicroMobilityPurchaseStep) microMobilityPurchaseActivity.f14912X.f20768b.mo4292b(str)).mo19519b(microMobilityPurchaseActivity, str);
                return;
        }
    }
}
