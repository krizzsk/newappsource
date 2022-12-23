package p054d0;

import aa0.C7530f;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.camera.core.C0556i;
import androidx.camera.core.C0612l;
import androidx.camera.core.C0624m;
import androidx.camera.core.C0636s;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0581f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c00.C13717b;
import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.protocol.GetMotUserActivationsRequest;
import com.moovit.app.reports.service.ReportBarView;
import com.moovit.app.stopdetail.C15356f;
import com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.ticketing.validation.receipt.media.C7774b;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.CongestionLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import l30.C5570c0;
import l30.C5577i;
import l30.C5596y;
import p054d0.C4298o;
import p066e0.C4449p;
import p089g0.C4720a;
import p102h0.C5023g;
import p102h0.C5028j;
import p140k0.C5445a;
import p140k0.C5446b;
import p250s9.C6489b;
import p304x.C7038d0;
import p304x.C7042e0;
import p664mu.C18443f;
import p695od.C18728c;
import p977zz.C20944i0;
import p977zz.C20949l;
import q00.C19047a;
import q20.C19078d;
import q50.C19080b;
import s30.C6452b;
import t30.C6581u;
import x00.C20440a;

/* renamed from: d0.c0 */
public final /* synthetic */ class C4273c0 implements CallbackToFutureAdapter.C0674b, SuccessContinuation, ReportBarView.C15217b, C20949l, C0556i.C0557a {

    /* renamed from: b */
    public final /* synthetic */ int f15188b;

    /* renamed from: c */
    public final /* synthetic */ Object f15189c;

    /* renamed from: d */
    public final /* synthetic */ Object f15190d;

    public /* synthetic */ C4273c0(int i, Object obj, Object obj2) {
        this.f15188b = i;
        this.f15189c = obj;
        this.f15190d = obj2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2441a() {
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        C18728c cVar;
        String str;
        C4449p pVar;
        boolean z;
        C0612l lVar = (C0612l) this.f15189c;
        C0612l.C0619g gVar = (C0612l.C0619g) this.f15190d;
        lVar.f2129z.mo2556a(new C4276d0(aVar), C14226d.m35358z0());
        synchronized (lVar.f2118o) {
            if (lVar.f2118o.get() == null) {
                lVar.f2118o.set(Integer.valueOf(lVar.mo2546D()));
            }
        }
        C4289j0.m11435b("ImageCapture");
        ArrayList arrayList = new ArrayList();
        if (lVar.f2110A != null) {
            pVar = lVar.mo2545B(C4298o.m11451a());
            if (lVar.f2125v == null && ((C4298o.C4299a) pVar).f15228a.size() > 1) {
                cVar = new C5028j.C5029a(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
                C5023g.m12853a(cVar, new C0624m(lVar, aVar), lVar.f2121r);
                aVar.mo2696a(new C4278e0(cVar, 0), C14226d.m35352s0());
                return "takePictureInternal";
            } else if (((C4298o.C4299a) pVar).f15228a.size() > lVar.f2124u) {
                cVar = new C5028j.C5029a(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
                C5023g.m12853a(cVar, new C0624m(lVar, aVar), lVar.f2121r);
                aVar.mo2696a(new C4278e0(cVar, 0), C14226d.m35352s0());
                return "takePictureInternal";
            } else {
                lVar.f2110A.mo2578c(pVar);
                C0636s sVar = lVar.f2110A;
                C4720a s0 = C14226d.m35352s0();
                C7038d0 d0Var = new C7038d0(gVar, 1);
                synchronized (sVar.f2175a) {
                    sVar.f2195u = s0;
                    sVar.f2194t = d0Var;
                }
                str = lVar.f2110A.f2190p;
            }
        } else {
            C4449p B = lVar.mo2545B(C4298o.m11451a());
            if (((C4298o.C4299a) B).f15228a.size() > 1) {
                cVar = new C5028j.C5029a(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
                C5023g.m12853a(cVar, new C0624m(lVar, aVar), lVar.f2121r);
                aVar.mo2696a(new C4278e0(cVar, 0), C14226d.m35352s0());
                return "takePictureInternal";
            }
            C4449p pVar2 = B;
            str = null;
            pVar = pVar2;
        }
        for (C0581f next : ((C4298o.C4299a) pVar).f15228a) {
            C0578e.C0579a aVar2 = new C0578e.C0579a();
            C0578e eVar = lVar.f2122s;
            aVar2.f1979c = eVar.f1972c;
            aVar2.mo2481c(eVar.f1971b);
            aVar2.mo2479a(Collections.unmodifiableList(lVar.f2128y.f1944f));
            aVar2.f1977a.add(lVar.f2113D);
            if (lVar.mo2370e() == 256) {
                C0612l.f2109G.getClass();
                if (((C5446b) C5445a.f17964a.mo19960g(C5446b.class)) != null) {
                    C0572a aVar3 = C0578e.f1968h;
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C0572a aVar4 = C0578e.f1968h;
                    gVar.getClass();
                    aVar2.f1978b.mo2503w(aVar4, 0);
                }
                C0572a aVar5 = C0578e.f1969i;
                gVar.getClass();
                aVar2.f1978b.mo2503w(aVar5, 0);
            }
            aVar2.mo2481c(next.getCaptureConfig().f1971b);
            if (str != null) {
                next.getId();
                aVar2.f1982f.f15509a.put(str, 0);
            }
            aVar2.mo2480b(lVar.f2112C);
            arrayList.add(aVar2.mo2482d());
        }
        cVar = C5023g.m12860h(lVar.mo2367b().mo2444b(lVar.f2117n, lVar.f2119p, arrayList), new C7042e0(1), C14226d.m35352s0());
        C5023g.m12853a(cVar, new C0624m(lVar, aVar), lVar.f2121r);
        aVar.mo2696a(new C4278e0(cVar, 0), C14226d.m35352s0());
        return "takePictureInternal";
    }

    /* renamed from: c */
    public final void mo2442c(C4310t0 t0Var) {
        MLKitBarcodeScannerFragment.m40040m2((MLKitBarcodeScannerFragment) this.f15189c, (C0556i) this.f15190d, t0Var);
    }

    public final boolean invoke(Object obj) {
        switch (this.f15188b) {
            case 4:
                String str = C15356f.f39753h;
                ((C15356f.C15357a) obj).mo45899A((ServerId) this.f15189c, (CongestionLevel) this.f15190d);
                return false;
            default:
                int i = C19080b.f48501o;
                ((ClearanceProvider.C16293a) obj).mo48833U((ClearanceProviderType) this.f15189c, ((C19080b.C19081a) this.f15190d).f48503a);
                return true;
        }
    }

    public final Task then(Object obj) {
        switch (this.f15188b) {
            case 2:
                C18443f fVar = (C18443f) this.f15189c;
                SuccessContinuation successContinuation = (SuccessContinuation) this.f15190d;
                List list = (List) obj;
                C18443f fVar2 = C18443f.f47013e;
                fVar.getClass();
                if (!C13717b.m34258e(list)) {
                    return Tasks.forResult(list);
                }
                Task e = C18443f.m45299e(GetMotUserActivationsRequest.Source.HISTORICAL, fVar.f47017c);
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                return e.onSuccessTask(executorService, new C6489b(11)).onSuccessTask(executorService, successContinuation);
            case 6:
                C13752e eVar = (C13752e) obj;
                C5577i iVar = C5577i.f18275d;
                return Tasks.call(MoovitExecutors.f37327IO, new C6581u(eVar, (String) this.f15189c, (String) this.f15190d));
            case 7:
                MoovitActivity moovitActivity = (MoovitActivity) this.f15189c;
                C19047a aVar = (C19047a) this.f15190d;
                LocationDescriptor locationDescriptor = (LocationDescriptor) obj;
                int i = C6452b.f20158y;
                LatLonE6 d = locationDescriptor.mo24310d();
                ArrayList arrayList = new ArrayList();
                C20440a aVar2 = new C20440a((CharSequence) moovitActivity.getString(C5570c0.string_list_delimiter_dot), (String) null);
                if (!C13717b.m34258e(locationDescriptor.f23652g)) {
                    arrayList.addAll(locationDescriptor.f23652g);
                }
                int round = Math.round(C7530f.m17271d(moovitActivity, d));
                if (round > 0) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(aVar2);
                    }
                    arrayList.add(new C20440a((CharSequence) DistanceUtils.m17934a((int) DistanceUtils.m17936c(moovitActivity, (float) round), moovitActivity), (String) null));
                }
                int c = C19078d.m46201c(moovitActivity, d, aVar);
                if (c > 0) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(aVar2);
                    }
                    arrayList.add(new C20440a((Image) new ResourceImage(C5596y.ic_walk_16_on_surface_emphasis_high, new String[0]), (String) null));
                    arrayList.add(new C20440a((CharSequence) " ", (String) null));
                    arrayList.add(new C20440a((CharSequence) C7925b.f23935b.mo24602b(moovitActivity, (long) c), (String) null));
                }
                return Tasks.forResult(new C20944i0(locationDescriptor, arrayList));
            default:
                return C7774b.m17735o2((ViewGroup) this.f15189c, (Context) this.f15190d, (Uri) obj);
        }
    }
}
