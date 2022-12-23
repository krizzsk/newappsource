package l30;

import a40.C0078a;
import aa0.C7530f;
import android.content.Context;
import android.location.Location;
import c70.C13756i;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.image.model.ResourceImage;
import com.moovit.map.C16281i;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import com.usebutton.sdk.internal.api.AppActionRequest;
import o20.C18699e;
import p001a0.C0016g;
import p693nz.C18659h;
import p824tp.C19728f;
import p824tp.C19739q;
import p946ys.C20762c;
import p950yw.C20776c;
import p950yw.C20777d;
import p977zz.C20944i0;
import t30.C6586z;
import w20.C20275b;

/* renamed from: l30.p */
public final class C5585p {

    /* renamed from: h */
    public static final C18659h<String, Polyline> f18297h = new C18659h<>(5);

    /* renamed from: i */
    public static final C18659h<Object, Task<MarkerZoomStyle>> f18298i = new C18659h<>(2);

    /* renamed from: j */
    public static final C18659h<String, Task<C6586z>> f18299j = new C18659h<>(5);

    /* renamed from: k */
    public static final C18659h<Object, C18699e<C16286k>> f18300k = new C18659h<>(3);

    /* renamed from: l */
    public static final C18659h<ImageSet, C18699e<MarkerZoomStyle>> f18301l = new C18659h<>(3);

    /* renamed from: a */
    public final Context f18302a;

    /* renamed from: b */
    public final C19728f f18303b;

    /* renamed from: c */
    public final MapFragment f18304c;

    /* renamed from: d */
    public final MarkerZoomStyle f18305d = new MarkerZoomStyle(new ResourceImage(C19739q.ic_trip_start_16_on_surface_emphasis_high, new String[0]));

    /* renamed from: e */
    public final MarkerZoomStyle f18306e = C16281i.m41512h();

    /* renamed from: f */
    public final LineStyle f18307f;

    /* renamed from: g */
    public final LineStyle f18308g;

    /* renamed from: l30.p$a */
    public static /* synthetic */ class C5586a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18309a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.micromobility.ride.MicroMobilityRide$Status[] r0 = com.moovit.micromobility.ride.MicroMobilityRide.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18309a = r0
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.RESERVED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18309a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18309a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.PAUSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18309a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18309a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18309a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18309a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.PENDING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l30.C5585p.C5586a.<clinit>():void");
        }
    }

    public C5585p(Context context, C19728f fVar, MapFragment mapFragment) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f18302a = context;
        this.f18303b = fVar;
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f18304c = mapFragment;
        this.f18307f = C16281i.m41511g(context);
        this.f18308g = C16281i.m41521q(context);
    }

    /* renamed from: b */
    public static String m13796b(String str, LatLonE6 latLonE6, LatLonE6 latLonE62) {
        StringBuilder t = C0016g.m36t(str, ":");
        t.append(latLonE6.f40980b);
        t.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        t.append(latLonE6.f40981c);
        t.append(":");
        t.append(latLonE62.f40980b);
        t.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        t.append(latLonE62.f40981c);
        return t.toString();
    }

    /* renamed from: a */
    public final void mo21409a(MicroMobilityRide microMobilityRide) {
        Tasks.call(MoovitExecutors.COMPUTATION, new C20776c(microMobilityRide, this.f18304c.mo48620Q2())).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C20777d(1, this, microMobilityRide));
    }

    /* renamed from: c */
    public final void mo21410c(MicroMobilityRide microMobilityRide) {
        C0078a aVar = microMobilityRide.f14992j;
        LocationDescriptor locationDescriptor = aVar.f198c;
        mo21413f(aVar.f197b, locationDescriptor).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C5579j(this, locationDescriptor));
    }

    /* renamed from: d */
    public final void mo21411d(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        String b = m13796b("ride", latLonE6, latLonE62);
        Polyline polyline = f18297h.get(b);
        if (polyline != null) {
            this.f18304c.mo48662w2(polyline, this.f18307f);
        } else {
            Tasks.call(MoovitExecutors.COMPUTATION, new C5581l(latLonE6, latLonE62, 0)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C20762c(this, b, latLonE6, latLonE62));
        }
    }

    /* renamed from: e */
    public final void mo21412e(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        String b = m13796b("walking", latLonE6, latLonE62);
        Polyline polyline = f18297h.get(b);
        if (polyline != null) {
            this.f18304c.mo48662w2(polyline, this.f18308g);
            return;
        }
        C13756i a = C13756i.m34349a(this.f18302a.getApplicationContext());
        C20275b bVar = new C20275b(a.mo40679b(), latLonE6.mo46929u((Location) null), latLonE62.mo46929u((Location) null));
        RequestOptions c = a.mo40680c();
        c.f42909f = true;
        a.mo40684g(bVar.f51409w, bVar, c, new C5584o(this, b, latLonE6, latLonE62));
    }

    /* renamed from: f */
    public final Task<MarkerZoomStyle> mo21413f(Image image, LocationDescriptor locationDescriptor) {
        C20944i0 i0Var = new C20944i0(image, locationDescriptor);
        C18659h<Object, Task<MarkerZoomStyle>> hVar = f18298i;
        Task<TContinuationResult> task = hVar.get(i0Var);
        if (task == null) {
            synchronized (hVar) {
                task = hVar.get(i0Var);
                if (task == null) {
                    Task<TContinuationResult> continueWithTask = C7530f.m17272e(this.f18302a, this.f18303b, locationDescriptor).continueWithTask(MoovitExecutors.COMPUTATION, new C5565a(this, image, 1));
                    hVar.put(i0Var, continueWithTask);
                    task = continueWithTask;
                }
            }
        }
        return task;
    }
}
