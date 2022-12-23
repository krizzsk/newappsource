package com.moovit.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import c00.C13717b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.dashboard.C14944i;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.design.view.list.ListItemLayout;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.C16202a;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.DistanceUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p229r1.C6233c;
import p543hq.C17474b;
import p583jk.C17884p;
import p762qz.C19206b;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p858uz.C20061g;
import p977zz.C20964s0;
import x00.C20440a;

public class SearchLocationMapActivity extends MoovitActivity implements MapFragment.C16238s, MapFragment.C16232m {

    /* renamed from: p0 */
    public static final /* synthetic */ int f23138p0 = 0;

    /* renamed from: U */
    public final C7601a f23139U = new C7601a();

    /* renamed from: X */
    public C6233c<C7602b, Object> f23140X;

    /* renamed from: Y */
    public LinkedHashMap f23141Y = new LinkedHashMap();

    /* renamed from: Z */
    public ViewPager f23142Z;

    /* renamed from: l0 */
    public ProgressBar f23143l0;

    /* renamed from: m0 */
    public Button f23144m0;

    /* renamed from: n0 */
    public C7603c f23145n0 = null;

    /* renamed from: o0 */
    public FormatTextView f23146o0 = null;

    /* renamed from: com.moovit.search.SearchLocationMapActivity$a */
    public class C7601a extends ViewPager.SimpleOnPageChangeListener {
        public C7601a() {
        }

        public final void onPageSelected(int i) {
            int b = SearchLocationMapActivity.this.f23142Z.mo47353b(i);
            SearchLocationMapActivity.this.f23146o0.setArguments(Integer.valueOf(b + 1), Integer.valueOf(SearchLocationMapActivity.this.f23145n0.getCount()));
            C7602b bVar = SearchLocationMapActivity.this.f23145n0.f23150a.get(b);
            SearchLocationMapActivity.this.mo23899y2(bVar);
            SearchLocationMapActivity searchLocationMapActivity = SearchLocationMapActivity.this;
            LatLonE6 location = bVar.getLocation();
            MapFragment mapFragment = (MapFragment) searchLocationMapActivity.mo44529n1(C19740r.map_fragment);
            mapFragment.mo48664z2(location, mapFragment.mo48622S2());
            SearchLocationMapActivity.this.mo44545v2(new C17474b(AnalyticsEventKey.SWIPE_CARD));
        }
    }

    /* renamed from: com.moovit.search.SearchLocationMapActivity$b */
    public class C7602b implements C19206b {

        /* renamed from: b */
        public LocationDescriptor f23148b;

        /* renamed from: c */
        public Integer f23149c;

        public C7602b(LocationDescriptor locationDescriptor, Integer num) {
            this.f23148b = locationDescriptor;
            this.f23149c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7602b)) {
                return false;
            }
            return ((C7602b) obj).f23148b.equals(this.f23148b);
        }

        public final LatLonE6 getLocation() {
            return this.f23148b.mo24310d();
        }

        public final int hashCode() {
            int hashCode = this.f23148b.hashCode() * 31;
            Integer num = this.f23149c;
            return hashCode + (num != null ? num.hashCode() : 0);
        }
    }

    /* renamed from: com.moovit.search.SearchLocationMapActivity$c */
    public class C7603c extends PagerAdapter {

        /* renamed from: a */
        public List<C7602b> f23150a;

        public C7603c(ArrayList arrayList) {
            this.f23150a = arrayList;
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public final int getCount() {
            List<C7602b> list = this.f23150a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            String str;
            com.moovit.commons.view.pager.ViewPager viewPager = (com.moovit.commons.view.pager.ViewPager) viewGroup;
            ListItemLayout listItemLayout = (ListItemLayout) LayoutInflater.from(SearchLocationMapActivity.this).inflate(C19742t.search_location_map_pager_item, viewPager, false);
            LocationDescriptor locationDescriptor = this.f23150a.get(i).f23148b;
            Integer num = this.f23150a.get(i).f23149c;
            ImageView imageView = (ImageView) listItemLayout.findViewById(C19740r.image);
            TextView textView = (TextView) listItemLayout.findViewById(C19740r.distance);
            TextView textView2 = (TextView) listItemLayout.findViewById(C19740r.title);
            ImagesOrTextsView imagesOrTextsView = (ImagesOrTextsView) listItemLayout.findViewById(C19740r.subtitle);
            Image image = locationDescriptor.f23655j;
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
            SearchLocationMapActivity searchLocationMapActivity = SearchLocationMapActivity.this;
            int i2 = SearchLocationMapActivity.f23138p0;
            searchLocationMapActivity.getClass();
            if (num == null || num.intValue() <= 0) {
                str = null;
            } else {
                str = DistanceUtils.m17934a((int) DistanceUtils.m17936c(searchLocationMapActivity, (float) num.intValue()), searchLocationMapActivity);
            }
            if (str != null) {
                UiUtils.m40234B(textView, str);
            }
            UiUtils.m40234B(textView2, locationDescriptor.f23651f);
            C20964s0.m49107y(textView2, C19735m.textAppearanceBodyStrong, C19735m.colorOnSurface);
            List<C20440a> list = locationDescriptor.f23652g;
            if (!C13717b.m34258e(list)) {
                imagesOrTextsView.setItems(list);
                imagesOrTextsView.setVisibility(0);
            } else {
                imagesOrTextsView.setVisibility(8);
            }
            viewPager.addView(listItemLayout);
            return listItemLayout;
        }

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        this.f23142Z.removeOnPageChangeListener(this.f23139U);
        mo44547w2("location_on_map_clicked");
        C7602b bVar = (C7602b) obj;
        mo23899y2(bVar);
        int indexOf = this.f23145n0.f23150a.indexOf(bVar);
        this.f23146o0.setArguments(Integer.valueOf(indexOf + 1), Integer.valueOf(this.f23145n0.getCount()));
        this.f23142Z.setCurrentLogicalItem(indexOf);
        this.f23142Z.addOnPageChangeListener(this.f23139U);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.search_location_map_activity);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LOCATION_ITEM_EXTRA");
        if (parcelableArrayListExtra == null) {
            finish();
            return;
        }
        this.f23143l0 = (ProgressBar) findViewById(C19740r.progress_bar);
        this.f23144m0 = (Button) findViewById(C19740r.done);
        if (!C13717b.m34258e(parcelableArrayListExtra)) {
            MapFragment mapFragment = (MapFragment) mo44529n1(C19740r.map_fragment);
            mapFragment.mo48658u2(this);
            mapFragment.f42350I.add(this);
            mapFragment.mo48656t2(new C14944i(3, this, parcelableArrayListExtra));
        }
    }

    /* renamed from: h */
    public final void mo23898h(MapFragment.MapFollowMode mapFollowMode) {
        LatLonE6 j;
        if (MapFragment.MapFollowMode.LOCATION.equals(mapFollowMode) && (j = LatLonE6.m40177j(mo44542u1())) != null) {
            MapFragment mapFragment = (MapFragment) mo44529n1(C19740r.map_fragment);
            mapFragment.mo48664z2(j, mapFragment.mo48622S2());
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: y2 */
    public final void mo23899y2(C7602b bVar) {
        MapFragment mapFragment = (MapFragment) mo44529n1(C19740r.map_fragment);
        mapFragment.mo48636g3(this.f23140X.f19680b);
        F f = this.f23140X.f19679a;
        C19206b bVar2 = (C19206b) f;
        this.f23141Y.put((C7602b) this.f23140X.f19679a, mapFragment.mo48646o2(bVar2, bVar2, C16281i.m41505a(((C7602b) f).f23148b.f23655j, false)));
        mapFragment.mo48636g3(this.f23141Y.remove(bVar));
        Object o2 = mapFragment.mo48646o2(bVar, bVar, C16281i.m41505a(bVar.f23148b.f23655j, true));
        this.f23141Y.put(bVar, o2);
        this.f23140X = new C6233c<>(bVar, o2);
    }

    /* renamed from: z2 */
    public final void mo23900z2(List<? extends C19206b> list) {
        MapFragment mapFragment = (MapFragment) mo44529n1(C19740r.map_fragment);
        if (list.size() == 1) {
            mapFragment.mo48663x2(((C19206b) list.get(0)).getLocation());
            return;
        }
        BoxE6 f = BoxE6.m40166f(list);
        ResourceImage resourceImage = new ResourceImage(C19739q.map_general_poi_bg, new String[0]);
        mapFragment.mo48606B2(C16281i.m41515k(getApplicationContext(), resourceImage), f, false);
    }
}
