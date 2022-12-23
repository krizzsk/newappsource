package p373au;

import a00.C13382a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.EventLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e20.C16783l;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p583jk.C17884p;
import p872vp.C20195b;
import p977zz.C20930c;
import p977zz.C20964s0;
import y10.C20690e;

/* renamed from: au.c */
public final class C13527c extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C13531d f33447g = new C13531d();

    /* renamed from: h */
    public final List<Leg> f33448h;

    /* renamed from: i */
    public final String f33449i;

    /* renamed from: au.c$a */
    public static class C13528a implements C13722f<Leg>, Leg.C16144a<Boolean> {
        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return Boolean.valueOf(!waitToMultiTransitLinesLeg.mo48467b().f42140k);
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            boolean z;
            if (C16783l.m42488t(walkLeg, TimeUnit.MINUTES) >= 5) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return Boolean.valueOf(!waitToTransitLineLeg.f42140k);
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            boolean z;
            if (C16783l.m42488t(bicycleLeg, TimeUnit.MINUTES) >= 1) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: j */
        public final Object mo39918j(EventLeg eventLeg) {
            eventLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 13");
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            return ((Boolean) ((Leg) obj).mo48338i0(this)).booleanValue();
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return Boolean.FALSE;
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: au.c$b */
    public static class C13529b implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final Context f33450b;

        /* renamed from: c */
        public final StringBuilder f33451c = new StringBuilder();

        public C13529b(Context context) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f33450b = context;
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            long n = C7925b.m18026n(carLeg.f41958b.mo24631g(), carLeg.f41959c.mo24631g());
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_connecting_route_drive, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_drive, new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            List<WaitToTransitLineLeg> list = waitToMultiTransitLinesLeg.f42117b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i != 0 || this.f33451c.length() <= 0) {
                    C13382a.m33666b(this.f33451c, this.f33450b.getString(R.string.tripplan_itinerary_alt_route_divide_label));
                } else {
                    C13382a.m33666b(this.f33451c, this.f33450b.getString(R.string.voice_over_tripplan_connecting_route));
                }
                mo40418o(list.get(i).f42135f.get());
            }
            return null;
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            TaxiProvider taxiProvider;
            String str;
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_tripplan_connecting_route));
            }
            TaxiProvidersManager b = TaxiProvidersManager.m39496b(this.f33450b.getApplicationContext());
            if (b != null) {
                taxiProvider = b.mo46163c(taxiLeg.f42097b);
            } else {
                taxiProvider = null;
            }
            if (taxiProvider != null) {
                str = taxiProvider.f39977l.f39988b;
            } else {
                str = this.f33450b.getString(R.string.taxi_title);
            }
            this.f33451c.append(str);
            return null;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            throw new UnsupportedOperationException("MultiTransitLinesLeg isn't supported!");
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            long n = C7925b.m18026n(walkLeg.f42147b.mo24631g(), walkLeg.f42148c.mo24631g());
            if (n < 5) {
                return null;
            }
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routs_connecting_route_walk, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routs_walk, new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            long n = C7925b.m18026n(bicycleRentalLeg.f41947b.mo24631g(), bicycleRentalLeg.f41948c.mo24631g());
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_connecting_route_bike, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_bike, new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            if (this.f33451c.length() > 0) {
                C13382a.m33666b(this.f33451c, this.f33450b.getString(R.string.voice_over_tripplan_connecting_route));
            }
            mo40418o(waitToTransitLineLeg.f42135f.get());
            return null;
        }

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ Object mo39916h(CarpoolLeg carpoolLeg) {
            return null;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            long n = C7925b.m18026n(bicycleLeg.f41939b.mo24631g(), bicycleLeg.f41940c.mo24631g());
            if (n < 1) {
                return null;
            }
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_connecting_route_bike, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_bike, new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: j */
        public final Object mo39918j(EventLeg eventLeg) {
            eventLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 13");
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            long n = C7925b.m18026n(docklessBicycleLeg.f41996b.mo24631g(), docklessBicycleLeg.f41997c.mo24631g());
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_connecting_route_ride, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_ride, new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            waitToTaxiLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 6");
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            long n = C7925b.m18026n(docklessCarLeg.f42018b.mo24631g(), docklessCarLeg.f42019c.mo24631g());
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_connecting_route_drive, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_drive, new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            transitLineLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 2");
        }

        /* renamed from: o */
        public final void mo40418o(TransitLine transitLine) {
            TransitAgency transitAgency = transitLine.mo24369b().f23696d.get();
            C13382a.m33666b(this.f33451c, transitAgency.f23674d.get().mo24433b(this.f33450b));
            String l = C20195b.m47768l(transitLine);
            if (!C20964s0.m49090h(l)) {
                C13382a.m33666b(this.f33451c, C13382a.m33667c(this.f33450b.getString(R.string.voice_over_line, new Object[]{l}), transitAgency.f23673c));
            }
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            long n = C7925b.m18026n(docklessScooterLeg.f42062b.mo24631g(), docklessScooterLeg.f42063c.mo24631g());
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_connecting_route_ride, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_ride, new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            pathwayWalkLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 8");
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            long n = C7925b.m18026n(docklessMopedLeg.f42040b.mo24631g(), docklessMopedLeg.f42041c.mo24631g());
            if (this.f33451c.length() > 0) {
                this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_connecting_route_ride, new Object[]{Long.valueOf(n)}));
                return null;
            }
            this.f33451c.append(this.f33450b.getString(R.string.voice_over_suggest_routes_ride, new Object[]{Long.valueOf(n)}));
            return null;
        }
    }

    /* renamed from: au.c$c */
    public static final class C13530c implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final C12797f f33452b;

        public C13530c(C12797f fVar) {
            C21100e.m49373x(fVar, "holder");
            this.f33452b = fVar;
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            long n = C7925b.m18026n(carLeg.f41958b.mo24631g(), carLeg.f41959c.mo24631g());
            ((TextView) this.f33452b.itemView).setText(String.format(C20930c.m49020b(this.f33452b.mo39638e()), "%d", new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            Image image = waitToMultiTransitLinesLeg.f42119d;
            if (image == null) {
                TransitLineGroup transitLineGroup = waitToMultiTransitLinesLeg.mo48467b().f42135f.get().f23686b;
                image = transitLineGroup.mo24376b(4, transitLineGroup.f23697e);
            }
            mo40419o(image, waitToMultiTransitLinesLeg);
            return null;
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            Context e = this.f33452b.mo39638e();
            ImageView imageView = (ImageView) this.f33452b.itemView;
            TaxiProvider c = TaxiProvidersManager.m39496b(e.getApplicationContext()).mo46163c(taxiLeg.f42097b);
            if (c != null) {
                Image image = c.f39972g;
                C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
                return null;
            }
            imageView.setImageResource(R.drawable.ic_taxi_24_on_surface);
            return null;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            throw new UnsupportedOperationException("MultiTransitLinesLeg isn't supported!");
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            long n = C7925b.m18026n(walkLeg.f42147b.mo24631g(), walkLeg.f42148c.mo24631g());
            ((TextView) this.f33452b.itemView).setText(String.format(C20930c.m49020b(this.f33452b.mo39638e()), "%d", new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            TextView textView = (TextView) this.f33452b.itemView;
            DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
            if (c != null) {
                ResourceImage b = c.get().mo24299b();
                C17884p.m44354Y(textView).mo51642v(b).mo51628o0(b).mo10848R(new C20690e(textView, UiUtils.Edge.LEFT));
            } else {
                C15780a.m40272e(textView, R.drawable.ic_bicycle_24_on_surface_emphasis_high);
            }
            long n = C7925b.m18026n(bicycleRentalLeg.f41947b.mo24631g(), bicycleRentalLeg.f41948c.mo24631g());
            textView.setText(String.format(C20930c.m49020b(this.f33452b.mo39638e()), "%d", new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            TransitLineGroup transitLineGroup = waitToTransitLineLeg.f42135f.get().f23686b;
            mo40419o(transitLineGroup.mo24376b(4, transitLineGroup.f23697e), waitToTransitLineLeg);
            return null;
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            ImageView imageView = (ImageView) this.f33452b.itemView;
            Image image = carpoolLeg.f41973i;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
            return null;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            TextView textView = (TextView) this.f33452b.itemView;
            C15780a.m40272e(textView, R.drawable.ic_bicycle_24_on_surface_emphasis_high);
            long n = C7925b.m18026n(bicycleLeg.f41939b.mo24631g(), bicycleLeg.f41940c.mo24631g());
            textView.setText(String.format(C20930c.m49020b(this.f33452b.mo39638e()), "%d", new Object[]{Long.valueOf(n)}));
            return null;
        }

        /* renamed from: j */
        public final Object mo39918j(EventLeg eventLeg) {
            eventLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 13");
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            ImageView imageView = (ImageView) this.f33452b.itemView;
            Image image = docklessBicycleLeg.f42002h.f42010f;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22737v(Integer.MIN_VALUE, UiUtils.m40248g(this.f33452b.mo39638e(), 25.0f)).mo51623j0().mo10850T(imageView);
            return null;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            waitToTaxiLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 6");
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            ImageView imageView = (ImageView) this.f33452b.itemView;
            Image image = docklessCarLeg.f42024h.f42032f;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22737v(Integer.MIN_VALUE, UiUtils.m40248g(this.f33452b.mo39638e(), 25.0f)).mo51623j0().mo10850T(imageView);
            return null;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            transitLineLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 2");
        }

        /* renamed from: o */
        public final void mo40419o(Image image, Leg leg) {
            if ((this.f33452b.getItemViewType() & 65535) == 4) {
                ListItemView listItemView = (ListItemView) this.f33452b.itemView;
                listItemView.setIcon(image);
                listItemView.setIconTopEndDecorationDrawable(C16783l.m42492x(leg).getSmallIconResId());
                return;
            }
            ImageView imageView = (ImageView) this.f33452b.itemView;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            ImageView imageView = (ImageView) this.f33452b.itemView;
            Image image = docklessScooterLeg.f42068h.f42076f;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22737v(Integer.MIN_VALUE, UiUtils.m40248g(this.f33452b.mo39638e(), 25.0f)).mo51623j0().mo10850T(imageView);
            return null;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            pathwayWalkLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 8");
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            ImageView imageView = (ImageView) this.f33452b.itemView;
            Image image = docklessMopedLeg.f42046h.f42054f;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22737v(Integer.MIN_VALUE, UiUtils.m40248g(this.f33452b.mo39638e(), 25.0f)).mo51623j0().mo10850T(imageView);
            return null;
        }
    }

    /* renamed from: au.c$d */
    public static final class C13531d implements Leg.C16144a<Integer> {
        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            return 5;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return Integer.valueOf(ServiceStatusCategory.IMPORTANT_LEVEL.contains(C16783l.m42492x(waitToMultiTransitLinesLeg)) ? 4 : 3);
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            return 3;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            throw new UnsupportedOperationException("MultiTransitLinesLeg isn't supported!");
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            return 1;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return 2;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return Integer.valueOf(ServiceStatusCategory.IMPORTANT_LEVEL.contains(C16783l.m42492x(waitToTransitLineLeg)) ? 4 : 3);
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            return 3;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            return 2;
        }

        /* renamed from: j */
        public final Object mo39918j(EventLeg eventLeg) {
            eventLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 13");
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return 3;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            waitToTaxiLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 6");
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return 3;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            transitLineLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 2");
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return 3;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            pathwayWalkLeg.getClass();
            throw new UnsupportedOperationException("Unsupported leg type: 8");
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return 3;
        }
    }

    public C13527c(Context context, Itinerary itinerary) {
        List<T> unmodifiableList = Collections.unmodifiableList(C13723g.m34282c(itinerary.mo48295u0(), new C13528a()));
        this.f33448h = unmodifiableList;
        C13529b bVar = new C13529b(context);
        bVar.f33451c.setLength(0);
        for (T i0 : unmodifiableList) {
            i0.mo48338i0(bVar);
        }
        this.f33449i = bVar.f33451c.toString();
    }

    public final int getItemCount() {
        return (this.f33448h.size() * 2) - 1;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        if (i % 2 == 1) {
            i2 = 0;
        } else {
            i2 = ((Integer) this.f33448h.get(i / 2).mo48338i0(this.f33447g)).intValue();
        }
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            i3 = SQLiteDatabase.OPEN_PRIVATECACHE;
        } else if (i == 0) {
            i3 = SQLiteDatabase.OPEN_FULLMUTEX;
        } else if (i == itemCount - 1) {
            i3 = 196608;
        } else {
            i3 = SQLiteDatabase.OPEN_SHAREDCACHE;
        }
        return i3 | i2;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        if ((fVar.getItemViewType() & 65535) != 0) {
            this.f33448h.get(i / 2).mo48338i0(new C13530c(fVar));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        int i2 = 65535 & i;
        if (i2 == 0) {
            view = LayoutInflater.from(context).inflate(R.layout.itinerary_legs_summary_seperator, viewGroup, false);
        } else if (i2 == 1) {
            view = LayoutInflater.from(context).inflate(R.layout.itinerary_legs_summary_walk_leg, viewGroup, false);
        } else if (i2 == 2) {
            view = LayoutInflater.from(context).inflate(R.layout.itinerary_legs_summary_bicycle_leg, viewGroup, false);
        } else if (i2 == 3) {
            view = LayoutInflater.from(context).inflate(R.layout.itinerary_legs_summary_transit_leg, viewGroup, false);
        } else if (i2 == 4) {
            view = LayoutInflater.from(context).inflate(R.layout.itinerary_legs_summary_transit_leg_with_service_alert, viewGroup, false);
        } else if (i2 == 5) {
            view = LayoutInflater.from(context).inflate(R.layout.itinerary_legs_summary_car_leg, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown item view type: ", i2));
        }
        int i3 = i & -65536;
        if (i3 == 65536) {
            view.setBackgroundResource(R.drawable.suggested_routes_shadow_start);
        } else if (i3 == 131072) {
            view.setBackgroundResource(R.drawable.suggested_routes_shadow_middle);
        } else if (i3 == 196608) {
            view.setBackgroundResource(R.drawable.suggested_routes_shadow_end);
        } else if (i3 == 262144) {
            view.setBackgroundResource(R.drawable.suggested_routes_shadow_single);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown view type mask: ", i3));
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15059s(view, 4);
        return new C12797f(view);
    }
}
