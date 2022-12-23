package a10;

import com.moovit.developeroptions.ExtraTileLayer;
import com.moovit.map.MapImplType;
import com.moovit.mock.MockLocationsMode;
import f00.C16919g;
import p810sz.C19575a;
import p810sz.C19576b;

/* renamed from: a10.a */
public interface C13386a {

    /* renamed from: a */
    public static final C16919g.C16921b f33221a = new C16919g.C16921b("map_impl_type", MapImplType.CODER, null);

    /* renamed from: b */
    public static final C16919g.C16926g f33222b = new C16919g.C16926g(C19575a.m46957a(ExtraTileLayer.f41462h, true), new C19576b(ExtraTileLayer.f41462h, true));

    /* renamed from: c */
    public static final C16919g.C16921b f33223c = new C16919g.C16921b("mock_locations_when_navigating_mode", MockLocationsMode.CODER, MockLocationsMode.NONE);

    /* renamed from: d */
    public static final C16919g.C16920a f33224d = new C16919g.C16920a("draw_navigable_geofences", false);

    /* renamed from: e */
    public static final C16919g.C16920a f33225e = new C16919g.C16920a("use_google_geocoder_for_omni_search", false);
}
