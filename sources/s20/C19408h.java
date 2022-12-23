package s20;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ce0.C21100e;
import com.android.billingclient.api.C1963s;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.PointD;
import com.moovit.developeroptions.ExtraTileLayer;
import com.moovit.map.C16245a;
import com.moovit.map.C16281i;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MapFragmentView;
import com.moovit.map.MapOverlaysLayout;
import com.moovit.map.google.GoogleMapView;
import com.moovit.map.google.GoogleMapViewParent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import o20.C18696b;
import o20.C18707m;
import o20.C18711q;
import o20.C18713s;
import o20.C18714t;
import o20.C18715u;
import p072e6.C4565c;
import p20.C18874c;
import p641lu.C18277b;
import p786rz.C19387a;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19745w;
import p977zz.C20966t;
import p977zz.C20971v0;
import p977zz.C20973w0;
import q00.C19047a;
import q00.C19053d;
import s20.C19415k;

/* renamed from: s20.h */
public final class C19408h implements C16285j, C18874c.C18876b, GoogleMap.OnMarkerClickListener, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener, GoogleMap.InfoWindowAdapter, GoogleMap.OnCameraMoveStartedListener, GoogleMap.OnCameraMoveListener, GoogleMap.OnCameraMoveCanceledListener, GoogleMap.OnCameraIdleListener {

    /* renamed from: N */
    public static final C18277b f49368N = new C18277b(3);

    /* renamed from: A */
    public CameraPosition f49369A;

    /* renamed from: B */
    public MapFragment.MapFollowMode f49370B;

    /* renamed from: C */
    public Marker f49371C;

    /* renamed from: D */
    public final C19409a f49372D = new C19409a();

    /* renamed from: E */
    public int f49373E = 0;

    /* renamed from: F */
    public final Rect f49374F = new Rect();

    /* renamed from: G */
    public final Rect f49375G = new Rect();

    /* renamed from: H */
    public boolean f49376H = false;

    /* renamed from: I */
    public LatLonE6 f49377I;

    /* renamed from: J */
    public float f49378J;

    /* renamed from: K */
    public final C19411c f49379K = new C19411c();

    /* renamed from: L */
    public C4565c f49380L;

    /* renamed from: M */
    public boolean f49381M;

    /* renamed from: a */
    public final Rect f49382a = new Rect();

    /* renamed from: b */
    public final MapFragment f49383b;

    /* renamed from: c */
    public final FragmentActivity f49384c;

    /* renamed from: d */
    public final MapFragmentView f49385d;

    /* renamed from: e */
    public final C19047a f49386e;

    /* renamed from: f */
    public final MapOverlaysLayout f49387f;

    /* renamed from: g */
    public final GoogleMapView f49388g;

    /* renamed from: h */
    public final GoogleMapViewParent f49389h;

    /* renamed from: i */
    public GoogleMap f49390i;

    /* renamed from: j */
    public final C19414j f49391j;

    /* renamed from: k */
    public final C19415k f49392k;

    /* renamed from: l */
    public final C19415k f49393l;

    /* renamed from: m */
    public final C19419n f49394m;

    /* renamed from: n */
    public final C19406f f49395n;

    /* renamed from: o */
    public final C19425r f49396o;

    /* renamed from: p */
    public final C19406f f49397p;

    /* renamed from: q */
    public final C1963s f49398q;

    /* renamed from: r */
    public final C19401b f49399r;

    /* renamed from: s */
    public C19422p f49400s;

    /* renamed from: t */
    public C18707m f49401t;

    /* renamed from: u */
    public TileOverlay f49402u;

    /* renamed from: v */
    public boolean f49403v;

    /* renamed from: w */
    public C18707m f49404w;

    /* renamed from: x */
    public TileOverlay f49405x;

    /* renamed from: y */
    public boolean f49406y;

    /* renamed from: z */
    public CameraPosition f49407z;

    /* renamed from: s20.h$a */
    public class C19409a implements C16245a.C16252g<Integer> {
        public C19409a() {
        }

        /* renamed from: a */
        public final Object mo48716a(C16245a.C16253h hVar) {
            return Integer.valueOf(hVar.f42454a);
        }

        /* renamed from: b */
        public final Object mo48717b(C16245a.C16247b bVar) {
            return Integer.valueOf(bVar.f42454a);
        }

        /* renamed from: c */
        public final Object mo48718c(C16245a.C16251f fVar) {
            return Integer.valueOf(fVar.f42464c.mo48672a());
        }

        /* renamed from: d */
        public final Object mo48719d(C16245a.C16248c cVar) {
            LatLonE6 latLonE6;
            float f;
            int i = cVar.f42457a;
            if (i == -1) {
                C16245a.C16247b bVar = cVar.f42458b;
                if (bVar == null) {
                    latLonE6 = null;
                } else {
                    latLonE6 = bVar.f42456c;
                }
                C16245a.C16253h hVar = cVar.f42459c;
                if (hVar == null) {
                    f = C19408h.this.mo48780C();
                } else {
                    f = hVar.f42465c;
                }
                C19408h hVar2 = C19408h.this;
                MapFragment mapFragment = hVar2.f49383b;
                LatLonE6 o = hVar2.mo48800o();
                float C = C19408h.this.mo48780C();
                mapFragment.getClass();
                return Integer.valueOf(MapFragment.m41339J2(o, latLonE6, C, f));
            }
            if (i == -2) {
                i = 0;
                Iterator it = cVar.mo48714c().iterator();
                while (it.hasNext()) {
                    i = Math.max(i, ((Integer) ((C16245a) it.next()).mo48712b(this)).intValue());
                }
            }
            return Integer.valueOf(i);
        }

        /* renamed from: e */
        public final Object mo48720e(C16245a.C16250e eVar) {
            return Integer.valueOf(eVar.f42454a);
        }
    }

    /* renamed from: s20.h$b */
    public class C19410b implements View.OnLayoutChangeListener {
        public C19410b() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C19408h hVar = C19408h.this;
            hVar.f49376H = true;
            hVar.f49385d.removeOnLayoutChangeListener(this);
            C19408h hVar2 = C19408h.this;
            if (hVar2.f49390i != null) {
                hVar2.f49391j.mo51839d();
                hVar2.f49394m.mo51839d();
                hVar2.f49396o.mo51839d();
                hVar2.f49399r.mo51839d();
                hVar2.f49400s.mo51839d();
                hVar2.f49383b.mo48630a3();
            }
        }
    }

    /* renamed from: s20.h$c */
    public class C19411c implements C16245a.C16252g<Void> {

        /* renamed from: a */
        public CameraPosition.Builder f49410a;

        /* renamed from: b */
        public CameraUpdate f49411b;

        public C19411c() {
        }

        /* renamed from: a */
        public final Object mo48716a(C16245a.C16253h hVar) {
            this.f49410a.zoom(hVar.f42465c - 1.0f);
            return null;
        }

        /* renamed from: b */
        public final Object mo48717b(C16245a.C16247b bVar) {
            this.f49410a.target(C19408h.m46736I(bVar.f42456c));
            return null;
        }

        /* renamed from: c */
        public final Object mo48718c(C16245a.C16251f fVar) {
            Rect rect = fVar.f42463b;
            BoxE6 boxE6 = fVar.f42462a;
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            boxE6.getClass();
            LatLngBounds build = builder.include(C19408h.m46736I(new LatLonE6(boxE6.f40964b, boxE6.f40966d))).include(C19408h.m46736I(new LatLonE6(boxE6.f40965c, boxE6.f40967e))).build();
            C19408h hVar = C19408h.this;
            MapFragmentView mapFragmentView = hVar.f49385d;
            Rect rect2 = hVar.f49382a;
            if (rect2 == null) {
                mapFragmentView.getClass();
                rect2 = new Rect();
            }
            View view = mapFragmentView.f42431g;
            if (view != null) {
                int x = (int) view.getX();
                int y = (int) mapFragmentView.f42431g.getY();
                rect2.set(x, y, mapFragmentView.f42431g.getWidth() + x, mapFragmentView.f42431g.getHeight() + y);
            }
            rect2.left += rect.left;
            rect2.right -= rect.right;
            rect2.top += rect.top;
            rect2.bottom -= rect.bottom;
            if (!rect2.isEmpty()) {
                this.f49411b = CameraUpdateFactory.newLatLngBounds(build, rect2.width(), rect2.height(), 0);
                return null;
            }
            this.f49410a.target(build.getCenter());
            return null;
        }

        /* renamed from: d */
        public final Object mo48719d(C16245a.C16248c cVar) {
            Iterator it = cVar.mo48714c().iterator();
            while (it.hasNext()) {
                ((C16245a) it.next()).mo48712b(this);
            }
            return null;
        }

        /* renamed from: e */
        public final Object mo48720e(C16245a.C16250e eVar) {
            this.f49410a.bearing(-eVar.f42461c);
            return null;
        }
    }

    /* renamed from: s20.h$d */
    public static class C19412d implements TileProvider {

        /* renamed from: g */
        public static final C20971v0 f49413g = new C20971v0();

        /* renamed from: a */
        public final C18707m f49414a;

        /* renamed from: b */
        public final boolean f49415b;

        /* renamed from: c */
        public final C20973w0 f49416c = new C20973w0(256, 256, Bitmap.Config.ARGB_8888);

        /* renamed from: d */
        public final C20973w0 f49417d = new C20973w0(512, 512, Bitmap.Config.ARGB_8888);

        /* renamed from: e */
        public final C19413i f49418e;

        /* renamed from: f */
        public final C20966t f49419f;

        public C19412d(FragmentActivity fragmentActivity, C18707m mVar) {
            boolean z;
            C19413i iVar;
            C21100e.m49373x(mVar, "spec");
            this.f49414a = mVar;
            if (fragmentActivity.getResources().getDisplayMetrics().density >= 2.0f) {
                z = true;
            } else {
                z = false;
            }
            this.f49415b = z;
            C20966t tVar = null;
            if (!z) {
                iVar = null;
            } else {
                iVar = new C19413i();
            }
            this.f49418e = iVar;
            this.f49419f = z ? new C20966t(ByteArrayOutputStream.class) : tVar;
        }

        /* renamed from: a */
        public final void mo51833a(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
            int width = bitmap.getWidth();
            int[] iArr = (int[]) this.f49418e.get();
            int i3 = width;
            int i4 = width;
            int height = bitmap.getHeight();
            bitmap.getPixels(iArr, 0, i3, 0, 0, i4, height);
            bitmap2.setPixels(iArr, 0, i3, i, i2, i4, height);
        }

        /* renamed from: b */
        public final Bitmap mo51834b(int i, int i2, int i3, Bitmap bitmap) throws IOException {
            byte[] c = mo51835c(i, i2, i3);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inBitmap = bitmap;
            return BitmapFactory.decodeByteArray(c, 0, c.length, options);
        }

        /* renamed from: c */
        public final byte[] mo51835c(int i, int i2, int i3) throws IOException {
            C18707m mVar = this.f49414a;
            String str = mVar.f47615a;
            String str2 = mVar.f47616b;
            StringBuilder sb = (StringBuilder) f49413g.get();
            sb.append(str);
            sb.append(i3);
            sb.append('/');
            sb.append(i);
            sb.append('/');
            sb.append(i2);
            sb.append(str2);
            try {
                URL url = new URL(sb.toString());
                sb.setLength(0);
                return C19387a.m46672d(FirebasePerfUrlConnection.openStream(url));
            } catch (MalformedURLException e) {
                throw new ApplicationBugException((Exception) e);
            } catch (Throwable th) {
                sb.setLength(0);
                throw th;
            }
        }

        public final Tile getTile(int i, int i2, int i3) {
            byte[] bArr;
            float f = ((float) i3) + 1.0f;
            C18707m mVar = this.f49414a;
            if (f < ((float) mVar.f47617c) || f > ((float) mVar.f47618d)) {
                return TileProvider.NO_TILE;
            }
            try {
                if (this.f49415b) {
                    Bitmap bitmap = (Bitmap) this.f49417d.get();
                    Bitmap bitmap2 = (Bitmap) this.f49416c.get();
                    int i4 = i << 1;
                    int i5 = i2 << 1;
                    int i6 = i3 + 1;
                    mo51833a(mo51834b(i4, i5, i6, bitmap2), bitmap, 0, 0);
                    int i7 = i4 + 1;
                    mo51833a(mo51834b(i7, i5, i6, bitmap2), bitmap, 256, 0);
                    int i8 = i5 + 1;
                    mo51833a(mo51834b(i4, i8, i6, bitmap2), bitmap, 0, 256);
                    mo51833a(mo51834b(i7, i8, i6, bitmap2), bitmap, 256, 256);
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f49419f.get();
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.reset();
                } else {
                    bArr = mo51835c(i, i2, i3);
                }
                return new Tile(256, 256, bArr);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public C19408h(MapFragment mapFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C19047a aVar) {
        C21100e.m49373x(mapFragment, "owner");
        this.f49383b = mapFragment;
        this.f49384c = mapFragment.getActivity();
        MapFragmentView mapFragmentView = (MapFragmentView) layoutInflater.inflate(C19742t.google_map_fragment, viewGroup, false);
        this.f49385d = mapFragmentView;
        this.f49389h = (GoogleMapViewParent) mapFragmentView.findViewById(C19740r.map_view);
        this.f49386e = aVar;
        this.f49387f = mapFragmentView.getOverlaysLayout();
        C19414j jVar = new C19414j();
        this.f49391j = jVar;
        C19419n nVar = new C19419n();
        this.f49394m = nVar;
        C19401b bVar = new C19401b();
        this.f49399r = bVar;
        C19425r rVar = new C19425r(bVar.mo51838c(-1004));
        this.f49396o = rVar;
        this.f49395n = nVar.mo51838c(-1005);
        this.f49397p = rVar.mo51838c(-1004);
        this.f49392k = (C19415k) jVar.mo51838c(-1001);
        this.f49393l = (C19415k) jVar.mo51838c(0);
        C19422p pVar = new C19422p();
        this.f49400s = pVar;
        this.f49398q = new C1963s((Object) (C19423q) pVar.mo51838c(-1003), (Object) (C19415k) jVar.mo51838c(-1002));
        GoogleMapViewParent googleMapViewParent = (GoogleMapViewParent) mapFragmentView.getMapView();
        googleMapViewParent.setOwner(this);
        GoogleMapView mapView = googleMapViewParent.getMapView();
        this.f49388g = mapView;
        mapView.onCreate(bundle);
        mapView.getMapAsync(new C19407g(this));
        mapFragmentView.addOnLayoutChangeListener(new C19410b());
    }

    /* renamed from: G */
    public static void m46735G(TileOverlay tileOverlay, boolean z, C18707m mVar, float f) {
        if (tileOverlay != null) {
            if (mVar != null) {
                if (!z || f < ((float) mVar.f47617c) || f > ((float) mVar.f47618d)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            tileOverlay.setVisible(z);
        }
    }

    /* renamed from: I */
    public static LatLng m46736I(LatLonE6 latLonE6) {
        if (latLonE6 == null) {
            return null;
        }
        return new LatLng(latLonE6.mo46922k(), latLonE6.mo46926o());
    }

    /* renamed from: A */
    public final void mo48778A(boolean z) {
        this.f49406y = z;
        if (isReady()) {
            m46735G(this.f49405x, z, this.f49404w, mo48780C());
        }
    }

    /* renamed from: B */
    public final void mo48779B(C18696b<C18713s> bVar) {
        this.f49391j.f49426b.remove(bVar);
        bVar.clear();
    }

    /* renamed from: C */
    public final float mo48780C() {
        return this.f49390i.getCameraPosition().zoom + 1.0f;
    }

    /* renamed from: D */
    public final void mo48781D(MapFragment.MapFollowMode mapFollowMode) {
        this.f49370B = mapFollowMode;
        if (this.f49371C != null) {
            this.f49371C.setIcon(mo51818H(this.f49370B, this.f49383b.mo46780O1()));
        }
    }

    /* renamed from: E */
    public final void mo48782E(boolean z) {
    }

    /* renamed from: F */
    public final C18711q mo48783F() {
        return this.f49393l;
    }

    /* renamed from: H */
    public final BitmapDescriptor mo51818H(MapFragment.MapFollowMode mapFollowMode, Location location) {
        int i;
        if (mapFollowMode == null) {
            mapFollowMode = MapFragment.MapFollowMode.NONE;
        }
        if (location != null && !C16281i.m41522r(location)) {
            return BitmapDescriptorFactory.fromResource(mapFollowMode.getOfflineUserMarkerResId());
        }
        if (this.f49383b.f42357P) {
            i = mapFollowMode.getRotatableUserMarkerResId();
        } else {
            i = mapFollowMode.getUserMarkerResId();
        }
        return BitmapDescriptorFactory.fromResource(i);
    }

    /* renamed from: J */
    public final LatLonE6 mo51819J(double d, double d2) {
        LatLng fromScreenLocation = this.f49390i.getProjection().fromScreenLocation(new Point((int) Math.round(d), (int) Math.round(d2)));
        if (fromScreenLocation == null) {
            return null;
        }
        return LatLonE6.m40176g(fromScreenLocation.latitude, fromScreenLocation.longitude);
    }

    /* renamed from: K */
    public final void mo51820K() {
        boolean z;
        int i;
        CameraPosition cameraPosition = this.f49390i.getCameraPosition();
        CameraPosition cameraPosition2 = this.f49369A;
        LatLng latLng = cameraPosition2.target;
        LatLng latLng2 = cameraPosition.target;
        if (latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 2;
        } else {
            i = 0;
        }
        if (cameraPosition2.bearing != cameraPosition.bearing) {
            i |= 8;
        }
        if (cameraPosition2.zoom != cameraPosition.zoom) {
            i |= 32;
        }
        this.f49407z = cameraPosition;
        this.f49369A = cameraPosition;
        this.f49373E = 0;
        this.f49391j.mo51839d();
        this.f49394m.mo51839d();
        this.f49396o.mo51839d();
        this.f49399r.mo51839d();
        this.f49400s.mo51839d();
        this.f49383b.mo48629Z2(i);
    }

    /* renamed from: L */
    public final void mo51821L(GoogleMap googleMap) {
        TileOverlay tileOverlay;
        C21100e.m49373x(googleMap, "map");
        this.f49390i = googleMap;
        LatLonE6 latLonE6 = this.f49377I;
        if (latLonE6 != null) {
            C16245a.C16248c cVar = new C16245a.C16248c();
            cVar.f42458b = new C16245a.C16247b(latLonE6, 0);
            cVar.f42459c = new C16245a.C16253h(this.f49378J);
            cVar.f42457a = 0;
            mo48789f(cVar);
        }
        CameraPosition cameraPosition = googleMap.getCameraPosition();
        this.f49407z = cameraPosition;
        this.f49369A = cameraPosition;
        googleMap.setOnCameraMoveStartedListener(this);
        googleMap.setOnCameraMoveListener(this);
        googleMap.setOnCameraIdleListener(this);
        googleMap.setOnCameraMoveCanceledListener(this);
        this.f49391j.mo51840f(googleMap);
        this.f49394m.mo51840f(googleMap);
        this.f49399r.mo51840f(googleMap);
        this.f49396o.mo51840f(googleMap);
        this.f49400s.mo51840f(googleMap);
        googleMap.setOnMarkerClickListener(this);
        googleMap.setInfoWindowAdapter(this);
        googleMap.setOnMapClickListener(this);
        googleMap.setOnMapLongClickListener(this);
        googleMap.setMapType(1);
        googleMap.setBuildingsEnabled(false);
        googleMap.setIndoorEnabled(false);
        googleMap.setTrafficEnabled(false);
        googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.f49384c, C19745w.google_maps_style));
        UiSettings uiSettings = googleMap.getUiSettings();
        uiSettings.setIndoorLevelPickerEnabled(false);
        uiSettings.setMapToolbarEnabled(false);
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setMyLocationButtonEnabled(false);
        uiSettings.setCompassEnabled(false);
        C18707m mVar = (C18707m) this.f49386e.mo51505b(C19053d.f48470i);
        this.f49401t = mVar;
        TileOverlay tileOverlay2 = null;
        if (mVar == null) {
            tileOverlay = null;
        } else {
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            tileOverlayOptions.tileProvider(new C19412d(this.f49384c, mVar));
            tileOverlay = this.f49390i.addTileOverlay(tileOverlayOptions);
        }
        this.f49402u = tileOverlay;
        m46735G(tileOverlay, this.f49403v, this.f49401t, mo48780C());
        C18707m mVar2 = (C18707m) this.f49386e.mo51505b(C19053d.f48471j);
        this.f49404w = mVar2;
        if (mVar2 != null) {
            TileOverlayOptions tileOverlayOptions2 = new TileOverlayOptions();
            tileOverlayOptions2.tileProvider(new C19412d(this.f49384c, mVar2));
            tileOverlay2 = this.f49390i.addTileOverlay(tileOverlayOptions2);
        }
        this.f49405x = tileOverlay2;
        m46735G(tileOverlay2, this.f49406y, this.f49404w, mo48780C());
        mo51822M();
        if (this.f49376H) {
            this.f49391j.mo51839d();
            this.f49394m.mo51839d();
            this.f49396o.mo51839d();
            this.f49399r.mo51839d();
            this.f49400s.mo51839d();
            this.f49383b.mo48630a3();
        }
    }

    /* renamed from: M */
    public final void mo51822M() {
        GoogleMap googleMap = this.f49390i;
        if (googleMap != null) {
            Rect rect = this.f49375G;
            int i = rect.left;
            Rect rect2 = this.f49374F;
            googleMap.setPadding(i + rect2.left, rect.top + rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        }
    }

    /* renamed from: a */
    public final Polylon mo48784a(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        double d = (double) i;
        double d2 = (double) i2;
        double d3 = (double) i3;
        double d4 = (double) i4;
        return Polylon.m40193b(mo51819J(d, d2), mo51819J(d3, d2), mo51819J(d3, d4), mo51819J(d, d4));
    }

    /* renamed from: b */
    public final C18874c.C18876b mo48785b() {
        return this;
    }

    /* renamed from: c */
    public final void mo48786c(List<ExtraTileLayer> list) {
        int i;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ExtraTileLayer extraTileLayer = list.get(i2);
            this.f49390i.addTileOverlay(new TileOverlayOptions().tileProvider(new C19412d(this.f49384c, new C18707m(extraTileLayer.f41466e, extraTileLayer.f41467f, extraTileLayer.f41464c, extraTileLayer.f41465d))));
        }
    }

    /* renamed from: d */
    public final void mo48787d(LatLonE6 latLonE6, float f) {
        this.f49377I = latLonE6;
        this.f49378J = f;
    }

    /* renamed from: e */
    public final void mo48788e(Object obj) {
        if (obj instanceof C19415k.C19416a) {
            C19415k.C19416a aVar = (C19415k.C19416a) obj;
            if (aVar.f49423b != null) {
                this.f49391j.getClass();
                ((Marker) aVar.f49423b).showInfoWindow();
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo48789f(C16245a aVar) {
        C19411c cVar = this.f49379K;
        cVar.f49410a = new CameraPosition.Builder(C19408h.this.f49390i.getCameraPosition());
        cVar.f49411b = null;
        aVar.mo48712b(this.f49379K);
        C19411c cVar2 = this.f49379K;
        CameraUpdate cameraUpdate = cVar2.f49411b;
        if (cameraUpdate == null) {
            cameraUpdate = CameraUpdateFactory.newCameraPosition(cVar2.f49410a.build());
        }
        this.f49390i.stopAnimation();
        int intValue = ((Integer) aVar.mo48712b(this.f49372D)).intValue();
        if (intValue <= 0) {
            this.f49390i.moveCamera(cameraUpdate);
        } else {
            this.f49390i.animateCamera(cameraUpdate, intValue, (GoogleMap.CancelableCallback) null);
        }
    }

    /* renamed from: g */
    public final void mo48790g(int i, float f, float f2, int i2) {
        MapFragmentView mapFragmentView = this.f49385d;
        mapFragmentView.f42433i = f;
        mapFragmentView.f42434j = f2;
        mapFragmentView.f42435k = i;
        mapFragmentView.f42436l = i2;
        mapFragmentView.requestLayout();
    }

    public final View getInfoContents(Marker marker) {
        return null;
    }

    public final View getInfoWindow(Marker marker) {
        if (this.f49380L == null) {
            return null;
        }
        this.f49391j.getClass();
        C19415k.C19416a aVar = (C19415k.C19416a) marker.getTag();
        if (aVar == null) {
            return null;
        }
        this.f49391j.getClass();
        return this.f49380L.mo20080d(((C18713s) aVar.f49422a).f47612a);
    }

    public final float getMaxZoom() {
        return this.f49390i.getMaxZoomLevel() + 1.0f;
    }

    public final MapFragmentView getView() {
        return this.f49385d;
    }

    /* renamed from: h */
    public final BoxE6 mo48793h() {
        LatLngBounds latLngBounds = this.f49390i.getProjection().getVisibleRegion().latLngBounds;
        LatLng latLng = latLngBounds.northeast;
        LatLng latLng2 = latLngBounds.southwest;
        return new BoxE6(LatLonE6.m40173b(latLng2.latitude), LatLonE6.m40173b(latLng.latitude), LatLonE6.m40173b(latLng2.longitude), LatLonE6.m40173b(latLng.longitude));
    }

    /* renamed from: i */
    public final PointD mo51343i(int i, LatLonE6 latLonE6) {
        double sin = Math.sin(latLonE6.mo46924m());
        double pow = Math.pow(2.0d, (double) i) * 256.0d;
        return new PointD(((latLonE6.mo46926o() / 360.0d) + 0.5d) * pow, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * pow);
    }

    public final boolean isReady() {
        return this.f49390i != null;
    }

    /* renamed from: j */
    public final void mo48795j() {
    }

    /* renamed from: k */
    public final void mo48796k(float f) {
        Marker marker = this.f49371C;
        if (marker != null) {
            marker.setRotation(f);
        }
    }

    /* renamed from: l */
    public final void mo48797l(boolean z) {
        if (!z) {
            this.f49390i.getUiSettings().setAllGesturesEnabled(false);
            return;
        }
        UiSettings uiSettings = this.f49390i.getUiSettings();
        uiSettings.setTiltGesturesEnabled(false);
        uiSettings.setRotateGesturesEnabled(true);
        uiSettings.setScrollGesturesEnabled(true);
        uiSettings.setZoomGesturesEnabled(true);
    }

    /* renamed from: m */
    public final void mo48798m(boolean z) {
        this.f49403v = z;
        if (isReady()) {
            m46735G(this.f49402u, this.f49403v, this.f49401t, mo48780C());
        }
    }

    /* renamed from: n */
    public final C1963s mo48799n() {
        return this.f49398q;
    }

    /* renamed from: o */
    public final LatLonE6 mo48800o() {
        LatLng latLng = this.f49390i.getCameraPosition().target;
        if (latLng == null) {
            return null;
        }
        return LatLonE6.m40176g(latLng.latitude, latLng.longitude);
    }

    public final void onCameraIdle() {
        mo51820K();
    }

    public final void onCameraMove() {
        int i;
        CameraPosition cameraPosition = this.f49390i.getCameraPosition();
        boolean z = false;
        if (this.f49373E == 1) {
            i = 1;
        } else {
            i = 0;
        }
        CameraPosition cameraPosition2 = this.f49407z;
        LatLng latLng = cameraPosition2.target;
        LatLng latLng2 = cameraPosition.target;
        if (latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude) {
            z = true;
        }
        if (!z) {
            i |= 6;
        }
        if (cameraPosition2.bearing != cameraPosition.bearing) {
            i |= 24;
        }
        if (cameraPosition2.zoom != cameraPosition.zoom) {
            i |= 96;
        }
        if (i != 0) {
            this.f49407z = cameraPosition;
            if ((i & 32) != 0) {
                float C = mo48780C();
                m46735G(this.f49402u, this.f49403v, this.f49401t, C);
                m46735G(this.f49405x, this.f49406y, this.f49404w, C);
            }
            this.f49383b.mo48629Z2(i);
        }
    }

    public final void onCameraMoveCanceled() {
        mo51820K();
    }

    public final void onCameraMoveStarted(int i) {
        this.f49373E = i;
    }

    public final void onDestroy() {
        this.f49388g.onDestroy();
    }

    public final void onLowMemory() {
        this.f49388g.onLowMemory();
    }

    public final void onMapClick(LatLng latLng) {
        LatLonE6 latLonE6;
        MapFragment mapFragment = this.f49383b;
        if (latLng == null) {
            latLonE6 = null;
        } else {
            latLonE6 = LatLonE6.m40176g(latLng.latitude, latLng.longitude);
        }
        mapFragment.mo48628Y2(latLonE6, false);
    }

    public final void onMapLongClick(LatLng latLng) {
        LatLonE6 latLonE6;
        MapFragment mapFragment = this.f49383b;
        if (latLng == null) {
            latLonE6 = null;
        } else {
            latLonE6 = LatLonE6.m40176g(latLng.latitude, latLng.longitude);
        }
        mapFragment.mo48628Y2(latLonE6, true);
    }

    public final boolean onMarkerClick(Marker marker) {
        boolean z;
        float zIndex = marker.getZIndex();
        if (-1001.0f > zIndex || zIndex > 2000.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f49391j.getClass();
        C19415k.C19416a aVar = (C19415k.C19416a) marker.getTag();
        if (z && aVar != null) {
            this.f49383b.mo48631b3(((C18713s) aVar.f49422a).f47612a);
        }
        return true;
    }

    public final void onPause() {
        this.f49388g.onPause();
    }

    public final void onResume() {
        this.f49388g.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f49388g.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        this.f49388g.onStart();
    }

    public final void onStop() {
        this.f49388g.onStop();
    }

    /* renamed from: p */
    public final C18696b<C18713s> mo48808p() {
        return this.f49392k;
    }

    /* renamed from: q */
    public final void mo48809q(int i, int i2, int i3, int i4) {
        this.f49374F.set(i, i2, i3, i4);
        this.f49385d.mo48686b(i, i2, i3, i4);
        mo51822M();
    }

    /* renamed from: r */
    public final void mo48810r(Location location) {
        if (location != null) {
            Marker marker = this.f49371C;
            if (marker == null) {
                this.f49371C = this.f49390i.addMarker(new MarkerOptions().position(m46736I(LatLonE6.m40177j(location))).icon(mo51818H(this.f49370B, location)).anchor(0.5f, 0.5f).zIndex(-1002.0f));
            } else {
                marker.setPosition(m46736I(LatLonE6.m40177j(location)));
            }
            this.f49383b.mo48627X2(LatLonE6.m40177j(location));
            return;
        }
        Marker marker2 = this.f49371C;
        if (marker2 != null) {
            marker2.remove();
            this.f49371C = null;
            this.f49383b.mo48627X2((LatLonE6) null);
        }
    }

    /* renamed from: s */
    public final C18696b<C18714t> mo48811s() {
        return this.f49395n;
    }

    /* renamed from: t */
    public final void mo48812t(boolean z) {
        this.f49381M = z;
    }

    /* renamed from: u */
    public final void mo48813u(C4565c cVar) {
        this.f49380L = cVar;
    }

    /* renamed from: v */
    public final MapOverlaysLayout mo48814v() {
        return this.f49387f;
    }

    /* renamed from: w */
    public final C18696b<C18715u> mo48815w() {
        return this.f49397p;
    }

    /* renamed from: x */
    public final C18711q mo48816x(int i) {
        if (i >= -1000 && i <= 2000 && i != 0) {
            return (C18711q) this.f49391j.mo51838c(i);
        }
        throw new IllegalArgumentException("zIndex must be in the range [-1000, 2000] and not 0");
    }

    /* renamed from: y */
    public final void mo48817y(boolean z) {
        this.f49389h.setRequestDisallowInterceptTouchEvent(z);
    }

    /* renamed from: z */
    public final float mo48818z() {
        return -this.f49390i.getCameraPosition().bearing;
    }
}
