package com.moovit.map;

import a10.C13386a;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import b00.C13556a;
import b00.C13558c;
import c00.C13717b;
import c00.C13723g;
import c70.C13753f;
import c70.C13772m;
import ce0.C21100e;
import com.android.billingclient.api.C1963s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.C14753n;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.image.C16025f;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageRef;
import com.moovit.location.C16202a;
import com.moovit.map.C16245a;
import com.moovit.map.items.C16283a;
import com.moovit.map.items.C16284b;
import com.moovit.map.items.MapItem;
import j00.C17684c;
import j00.C17685d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n10.C18505b;
import o20.C18696b;
import o20.C18699e;
import o20.C18700f;
import o20.C18701g;
import o20.C18710p;
import o20.C18711q;
import o20.C18713s;
import o20.C18714t;
import o20.C18715u;
import p009a8.C0111k;
import p011aa.C0141e;
import p025b6.C1495h;
import p072e6.C4565c;
import p115i0.C5227c;
import p20.C18872a;
import p20.C18873b;
import p20.C18874c;
import p20.C18877d;
import p20.C18878e;
import p20.C18879f;
import p20.C18880g;
import p450dt.C16701b;
import p484ff.C16984m;
import p501fw.C17102a;
import p584jl.C17885a;
import p669mz.C18481b;
import p717oz.C18861a;
import p739px.C19037a;
import p762qz.C19206b;
import p824tp.C19728f;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19741s;
import p824tp.C19747y;
import p824tp.C19748z;
import p853uu.C19999i;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p930xz.C20677a;
import p930xz.C20678b;
import p930xz.C20681d;
import p977zz.C20944i0;
import q00.C19047a;
import r10.C19220d;
import r20.C19223a;
import r20.C19224b;
import t20.C19627a;
import v10.C20065a;

public class MapFragment extends C15682c<MoovitActivity> {

    /* renamed from: I0 */
    public static C5227c f42333I0 = new C5227c(17);

    /* renamed from: A */
    public C16226h f42334A;

    /* renamed from: A0 */
    public int f42335A0;

    /* renamed from: B */
    public final C16219a f42336B;

    /* renamed from: B0 */
    public int f42337B0;

    /* renamed from: C */
    public final ArrayList f42338C;

    /* renamed from: C0 */
    public boolean f42339C0;

    /* renamed from: D */
    public final ArrayList f42340D;

    /* renamed from: D0 */
    public C4565c f42341D0;

    /* renamed from: E */
    public final ArrayList f42342E;

    /* renamed from: E0 */
    public C16240u f42343E0;

    /* renamed from: F */
    public final ArrayList f42344F;

    /* renamed from: F0 */
    public C16202a.C16203a f42345F0;

    /* renamed from: G */
    public final ArrayList f42346G;

    /* renamed from: G0 */
    public boolean f42347G0;

    /* renamed from: H */
    public final ArrayList f42348H;

    /* renamed from: H0 */
    public boolean f42349H0;

    /* renamed from: I */
    public final ArrayList f42350I;

    /* renamed from: J */
    public final ArrayList f42351J;

    /* renamed from: K */
    public final ArrayList f42352K;

    /* renamed from: L */
    public final ArrayList f42353L;

    /* renamed from: M */
    public final HashSet f42354M;

    /* renamed from: N */
    public Set<MapFollowMode> f42355N;

    /* renamed from: O */
    public MapFollowMode f42356O;

    /* renamed from: P */
    public boolean f42357P;

    /* renamed from: Q */
    public FloatingActionButton f42358Q;

    /* renamed from: R */
    public CompassView f42359R;

    /* renamed from: S */
    public AlphaAnimation f42360S;

    /* renamed from: T */
    public final C16220b f42361T;

    /* renamed from: U */
    public final C16984m f42362U;

    /* renamed from: X */
    public final C18700f f42363X;

    /* renamed from: Y */
    public final C17102a f42364Y;

    /* renamed from: Z */
    public final C19037a f42365Z;

    /* renamed from: l0 */
    public final C18701g f42366l0;

    /* renamed from: m0 */
    public C20681d f42367m0;

    /* renamed from: n */
    public C16285j f42368n;

    /* renamed from: n0 */
    public final Rect f42369n0;

    /* renamed from: o */
    public BoxE6 f42370o = null;

    /* renamed from: o0 */
    public boolean f42371o0;

    /* renamed from: p */
    public float f42372p = -1.0f;

    /* renamed from: p0 */
    public boolean f42373p0;

    /* renamed from: q */
    public boolean f42374q;

    /* renamed from: q0 */
    public final HashMap f42375q0;

    /* renamed from: r */
    public boolean f42376r;

    /* renamed from: r0 */
    public Handler f42377r0;

    /* renamed from: s */
    public C5227c f42378s;

    /* renamed from: s0 */
    public boolean f42379s0;

    /* renamed from: t */
    public final HashSet f42380t;

    /* renamed from: t0 */
    public boolean f42381t0;

    /* renamed from: u */
    public final CollectionHashMap.ArrayListHashMap<Point, C20944i0<C16283a, C13556a>> f42382u;

    /* renamed from: u0 */
    public boolean f42383u0;

    /* renamed from: v */
    public final EnumMap f42384v;

    /* renamed from: v0 */
    public boolean f42385v0;

    /* renamed from: w */
    public MapOverlaysLayout f42386w;

    /* renamed from: w0 */
    public float f42387w0;

    /* renamed from: x */
    public float f42388x;

    /* renamed from: x0 */
    public final C16221c f42389x0;

    /* renamed from: y */
    public float f42390y;

    /* renamed from: y0 */
    public float f42391y0;

    /* renamed from: z */
    public final IdentityHashMap f42392z;

    /* renamed from: z0 */
    public float f42393z0;

    public enum MapFollowMode {
        NONE(r3, r14, r20, r21, false, false),
        LOCATION(C19739q.img_my_location, r14, r20, r21, true, false),
        BOTH(C19739q.img_compass, r20, r20, r21, true, true);
        
        private final int buttonResId;
        private final boolean isFollowLocation;
        private final boolean isFollowRotation;
        private final int offlineUserMarkerResId;
        private final int rotatableUserMarkerResId;
        private final int userMarkerResId;

        private MapFollowMode(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            this.buttonResId = i;
            this.userMarkerResId = i2;
            this.rotatableUserMarkerResId = i3;
            this.offlineUserMarkerResId = i4;
            this.isFollowLocation = z;
            this.isFollowRotation = z2;
        }

        public static MapFollowMode fromId(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return LOCATION;
            }
            if (i == 2) {
                return BOTH;
            }
            throw new IllegalArgumentException(C16759e.m42349e("Bad map follow mode parameter value: ", i));
        }

        public static EnumSet<MapFollowMode> fromMask(int i) {
            EnumSet<MapFollowMode> of = EnumSet.of(NONE);
            if ((i & 1) != 0) {
                of.add(LOCATION);
            }
            if ((i & 2) != 0) {
                of.add(BOTH);
            }
            return of;
        }

        public int getButtonResId() {
            return this.buttonResId;
        }

        public int getOfflineUserMarkerResId() {
            return this.offlineUserMarkerResId;
        }

        public int getRotatableUserMarkerResId() {
            return this.rotatableUserMarkerResId;
        }

        public int getUserMarkerResId() {
            return this.userMarkerResId;
        }

        public boolean isFollowLocation() {
            return this.isFollowLocation;
        }

        public boolean isFollowRotation() {
            return this.isFollowRotation;
        }
    }

    /* renamed from: com.moovit.map.MapFragment$a */
    public class C16219a extends C19627a {
        public C16219a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16283a aVar = (C16283a) cVar;
            C16284b bVar = (C16284b) gVar;
            MapFragment mapFragment = MapFragment.this;
            C5227c cVar2 = MapFragment.f42333I0;
            mapFragment.getClass();
            C16283a aVar2 = (C16283a) bVar.f51773b;
            aVar2.getClass();
            Point point = new Point(aVar2.f42555w);
            List<MapItem> list = bVar.f42557m;
            MapItem.Type type = ((C16283a) bVar.f51773b).f42554v;
            ArrayList arrayList = new ArrayList(list.size());
            for (MapItem next : list) {
                C16226h hVar = mapFragment.f42334A;
                if (hVar == null || hVar.mo5858c(next)) {
                    arrayList.add(new C18713s(next, next.f42551d, C18699e.m45697a(MarkerZoomStyle.m41440c(next.f42552e)), BitmapDescriptorFactory.HUE_RED));
                }
            }
            mapFragment.f42368n.mo48795j();
            new C16275e(mapFragment, arrayList, true, type, point).mo48679b(mapFragment.getContext());
            List list2 = (List) mapFragment.f42382u.get(point);
            Iterator it = list2.iterator();
            C20944i0 i0Var = new C20944i0(point, type);
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C16283a aVar3 = (C16283a) ((C20944i0) it.next()).f52692a;
                aVar3.getClass();
                if (i0Var.equals(new C20944i0(new Point(aVar3.f42555w), aVar3.f42554v))) {
                    it.remove();
                    break;
                }
            }
            if (list2.isEmpty()) {
                C21100e.m49371w(mapFragment.f42382u.remove(point));
            }
        }
    }

    /* renamed from: com.moovit.map.MapFragment$b */
    public class C16220b extends BroadcastReceiver {
        public C16220b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (MapFragment.this.getView() != null) {
                MapFragment mapFragment = MapFragment.this;
                mapFragment.mo48657t3(mapFragment.f42356O);
            }
        }
    }

    /* renamed from: com.moovit.map.MapFragment$c */
    public class C16221c implements C16223e {
        public C16221c() {
        }

        /* renamed from: a */
        public final int mo48672a() {
            return MapFragment.this.getResources().getInteger(C19741s.zoom_to_cluster_animation_length);
        }

        /* renamed from: b */
        public final int mo48673b(LatLonE6 latLonE6, LatLonE6 latLonE62, float f, float f2) {
            MapFragment.this.getClass();
            return MapFragment.m41339J2(latLonE6, latLonE62, f, f2);
        }
    }

    /* renamed from: com.moovit.map.MapFragment$d */
    public static /* synthetic */ class C16222d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42397a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.map.MapFragment$MapFollowMode[] r0 = com.moovit.map.MapFragment.MapFollowMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42397a = r0
                com.moovit.map.MapFragment$MapFollowMode r1 = com.moovit.map.MapFragment.MapFollowMode.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42397a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.map.MapFragment$MapFollowMode r1 = com.moovit.map.MapFragment.MapFollowMode.LOCATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42397a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.map.MapFragment$MapFollowMode r1 = com.moovit.map.MapFragment.MapFollowMode.BOTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.MapFragment.C16222d.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.map.MapFragment$e */
    public interface C16223e {
        /* renamed from: a */
        int mo48672a();

        /* renamed from: b */
        int mo48673b(LatLonE6 latLonE6, LatLonE6 latLonE62, float f, float f2);
    }

    /* renamed from: com.moovit.map.MapFragment$f */
    public class C16224f<MI extends C18880g, RS extends C18879f<RS, MI>> extends C0141e implements Runnable, C18874c.C18875a {

        /* renamed from: b */
        public final C18878e<MI, RS> f42398b;

        /* renamed from: c */
        public final ArrayList f42399c = new ArrayList();

        /* renamed from: d */
        public final boolean f42400d;

        /* renamed from: e */
        public C18711q f42401e = null;

        /* renamed from: f */
        public C13556a f42402f = null;

        /* renamed from: g */
        public final C13558c f42403g = new C13558c(new C13556a[0]);

        /* renamed from: h */
        public final C13558c f42404h = new C13558c(new C13556a[0]);

        /* renamed from: i */
        public long f42405i;

        /* renamed from: j */
        public int f42406j = 0;

        public C16224f(C18878e eVar) {
            this.f42398b = eVar;
            this.f42400d = false;
            this.f42405i = SystemClock.elapsedRealtime();
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13772m mVar = (C13772m) cVar;
            this.f42402f = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            int i;
            C13772m mVar = (C13772m) cVar;
            C18879f fVar = (C18879f) gVar;
            this.f42399c.clear();
            Collection collection = (Collection) fVar.f33924g;
            this.f42406j = collection.size();
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C18877d dVar = (C18877d) it.next();
                Collection<T> collection2 = dVar.f48049a;
                int i2 = dVar.f48051c;
                int i3 = dVar.f48052d;
                ImageRef imageRef = dVar.f48050b;
                if (imageRef != null) {
                    int floor = (int) Math.floor((double) MapFragment.this.f42368n.getMaxZoom());
                    C13558c cVar2 = this.f42403g;
                    Context context = MapFragment.this.getContext();
                    C18874c.C18876b b = MapFragment.this.f42368n.mo48785b();
                    C21100e.m49369v(1);
                    C18873b bVar = new C18873b(i2, floor, context, imageRef, this, b, collection2);
                    bVar.execute(new Void[0]);
                    cVar2.f33501b.add(bVar);
                } else {
                    Context context2 = MapFragment.this.getContext();
                    if (context2 != null) {
                        C16225g gVar2 = new C16225g(context2, this, collection2, i2, i3);
                        gVar2.mo48196g();
                        this.f42404h.f33501b.add(gVar2);
                    }
                }
            }
            long j = fVar.f48053h;
            if (j == -1) {
                this.f42405i = -1;
            } else {
                this.f42405i = SystemClock.elapsedRealtime() + j;
                mo48675q();
            }
            MapFragment mapFragment = MapFragment.this;
            this.f42398b.mo51345b();
            int size = mapFragment.f42353L.size();
            for (i = 0; i < size; i++) {
                ((C16234o) mapFragment.f42353L.get(i)).mo48682a();
            }
        }

        /* renamed from: p */
        public final void mo48674p() {
            if (this.f42401e != null) {
                MapFragment.this.f42368n.mo48782E(true);
                try {
                    this.f42401e.clear();
                    this.f42401e.mo51067f(this.f42399c);
                } finally {
                    MapFragment.this.f42368n.mo48782E(false);
                    this.f42399c.clear();
                }
            }
        }

        /* renamed from: q */
        public final void mo48675q() {
            if (this.f42405i >= 0) {
                MapFragment.this.f42377r0.removeCallbacks(this);
                long elapsedRealtime = this.f42405i - SystemClock.elapsedRealtime();
                if (elapsedRealtime <= 0) {
                    mo48676r();
                } else {
                    MapFragment.this.f42377r0.postDelayed(this, elapsedRealtime);
                }
            }
        }

        /* renamed from: r */
        public final void mo48676r() {
            MapFragment mapFragment = MapFragment.this;
            C13753f<C13772m<RS>> a = this.f42398b.mo51344a(mapFragment.mo46783R1());
            A a2 = mapFragment.f40822c;
            a2.getClass();
            this.f42402f = a2.mo44527k2(a.f33855a, a.f33856b, a.f33857c, this);
        }

        public final void run() {
            mo48676r();
        }
    }

    /* renamed from: com.moovit.map.MapFragment$h */
    public interface C16226h {
        /* renamed from: c */
        boolean mo5858c(MapItem mapItem);
    }

    /* renamed from: com.moovit.map.MapFragment$i */
    public static abstract class C16227i implements C13556a {

        /* renamed from: b */
        public final List<C18713s> f42413b;

        /* renamed from: c */
        public C16228a f42414c;

        /* renamed from: d */
        public final boolean f42415d;

        /* renamed from: com.moovit.map.MapFragment$i$a */
        public class C16228a extends C16025f<C20065a> {

            /* renamed from: i */
            public final /* synthetic */ Map f42416i;

            /* renamed from: j */
            public final /* synthetic */ List f42417j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16228a(Context context, ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2) {
                super(context, arrayList);
                this.f42416i = identityHashMap;
                this.f42417j = arrayList2;
            }

            /* renamed from: b */
            public final C19220d<C20065a> mo48191b(Context context, Image image) {
                C19220d<C20065a> b = super.mo48191b(context, image);
                C1495h hVar = (C1495h) this.f42416i.get(image);
                if (hVar != null) {
                    return (C19220d) b.mo22719J(C20065a.class, hVar, true);
                }
                return b;
            }

            /* renamed from: c */
            public final boolean mo48192c(Object obj) {
                C20065a aVar = (C20065a) obj;
                if (aVar == null || aVar.f50910b == null) {
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public final void mo48195f(HashMap hashMap, boolean z) {
                for (MarkerZoomStyle markerZoomStyle : this.f42417j) {
                    markerZoomStyle.f42450d = (C20065a) hashMap.get(markerZoomStyle.f42448b);
                }
                if (z) {
                    C16227i iVar = C16227i.this;
                    iVar.mo48678a(iVar.f42413b, Collections.emptyList());
                    return;
                }
                ArrayList arrayList = new ArrayList(C16227i.this.f42413b);
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                C13723g.m34285f(arrayList, arrayList2, new C16701b(this, 2));
                C16227i.this.mo48678a(arrayList, arrayList2);
            }
        }

        public C16227i(List<C18713s> list, boolean z) {
            this.f42413b = list;
            this.f42415d = z;
        }

        /* renamed from: a */
        public abstract void mo48678a(List<C18713s> list, List<C18713s> list2);

        /* renamed from: b */
        public final void mo48679b(Context context) {
            boolean z;
            List<C18713s> list = this.f42413b;
            ArrayList arrayList = new ArrayList();
            for (C18713s sVar : list) {
                C18699e<MEZS> eVar = sVar.f47614c;
                SparseArray<MEZS> sparseArray = eVar.f47605d;
                boolean z2 = true;
                if (sparseArray == null || !this.f42415d) {
                    MarkerZoomStyle markerZoomStyle = (MarkerZoomStyle) eVar.f47602a;
                    if (markerZoomStyle.f42450d == null) {
                        z2 = false;
                    }
                    if (!z2) {
                        arrayList.add(markerZoomStyle);
                    }
                } else {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        MarkerZoomStyle markerZoomStyle2 = (MarkerZoomStyle) sparseArray.valueAt(i);
                        if (markerZoomStyle2 != null) {
                            if (markerZoomStyle2.f42450d != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                arrayList.add(markerZoomStyle2);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                mo48678a(this.f42413b, Collections.emptyList());
                return;
            }
            C0111k kVar = new C0111k(4);
            C18505b bVar = new C18505b(2);
            IdentityHashMap identityHashMap = new IdentityHashMap(arrayList.size());
            for (Object next : arrayList) {
                identityHashMap.put(kVar.convert(next), bVar.convert(next));
            }
            C16228a aVar = new C16228a(context, arrayList, identityHashMap, arrayList);
            this.f42414c = aVar;
            aVar.mo48196g();
        }

        public final boolean cancel(boolean z) {
            C16228a aVar = this.f42414c;
            if (aVar == null) {
                return true;
            }
            aVar.cancel(z);
            return true;
        }
    }

    /* renamed from: com.moovit.map.MapFragment$j */
    public static class C16229j {

        /* renamed from: a */
        public Object f42419a;

        /* renamed from: b */
        public C13556a f42420b;

        /* renamed from: c */
        public boolean f42421c = true;

        /* renamed from: d */
        public ObjectAnimator f42422d;
    }

    /* renamed from: com.moovit.map.MapFragment$k */
    public interface C16230k {
        /* renamed from: a */
        void mo48680a();
    }

    /* renamed from: com.moovit.map.MapFragment$l */
    public interface C16231l {
        /* renamed from: a */
        void mo48681a(LatLonE6 latLonE6, boolean z);
    }

    /* renamed from: com.moovit.map.MapFragment$m */
    public interface C16232m {
        /* renamed from: h */
        void mo23898h(MapFollowMode mapFollowMode);
    }

    /* renamed from: com.moovit.map.MapFragment$n */
    public interface C16233n {
        /* renamed from: d */
        void mo48579d(MapItem mapItem);
    }

    /* renamed from: com.moovit.map.MapFragment$o */
    public interface C16234o {
        /* renamed from: a */
        void mo48682a();
    }

    /* renamed from: com.moovit.map.MapFragment$p */
    public interface C16235p {
        /* renamed from: a */
        void mo48683a();
    }

    /* renamed from: com.moovit.map.MapFragment$q */
    public static abstract class C16236q {
        /* renamed from: a */
        public static boolean m41429a(int i, int i2) {
            return (i & i2) != 0;
        }

        /* renamed from: b */
        public static boolean m41430b(int i) {
            return m41429a(i, 85);
        }

        /* renamed from: c */
        public abstract void mo48515c(int i);
    }

    /* renamed from: com.moovit.map.MapFragment$r */
    public interface C16237r {
        /* renamed from: a */
        void mo21406a();
    }

    /* renamed from: com.moovit.map.MapFragment$s */
    public interface C16238s {
        /* renamed from: L0 */
        void mo23897L0(MapFragment mapFragment, Object obj);
    }

    /* renamed from: com.moovit.map.MapFragment$t */
    public interface C16239t {
        /* renamed from: a */
        void mo48684a(C18880g gVar);
    }

    /* renamed from: com.moovit.map.MapFragment$u */
    public static class C16240u {

        /* renamed from: a */
        public final BoxE6 f42423a;

        /* renamed from: b */
        public final Rect f42424b;

        public C16240u(BoxE6 boxE6, Rect rect) {
            this.f42423a = boxE6;
            this.f42424b = rect;
        }
    }

    public MapFragment() {
        super(MoovitActivity.class);
        this.f42374q = false;
        this.f42376r = false;
        this.f42378s = f42333I0;
        this.f42380t = new HashSet();
        this.f42382u = new CollectionHashMap.ArrayListHashMap<>();
        this.f42384v = new EnumMap(MapItem.Type.class);
        this.f42388x = -1.0f;
        this.f42390y = -1.0f;
        this.f42392z = new IdentityHashMap();
        this.f42334A = null;
        this.f42336B = new C16219a();
        this.f42338C = new ArrayList();
        this.f42340D = new ArrayList();
        this.f42342E = new ArrayList();
        this.f42344F = new ArrayList();
        this.f42346G = new ArrayList();
        this.f42348H = new ArrayList();
        this.f42350I = new ArrayList();
        this.f42351J = new ArrayList();
        this.f42352K = new ArrayList();
        this.f42353L = new ArrayList();
        this.f42354M = new HashSet(1);
        this.f42355N = Collections.unmodifiableSet(EnumSet.allOf(MapFollowMode.class));
        this.f42356O = MapFollowMode.NONE;
        this.f42361T = new C16220b();
        this.f42362U = new C16984m(this, 8);
        this.f42363X = new C18700f(this, 0);
        this.f42364Y = new C17102a(this, 14);
        this.f42365Z = new C19037a(this, 5);
        this.f42366l0 = new C18701g(this);
        this.f42369n0 = new Rect();
        this.f42371o0 = true;
        this.f42373p0 = false;
        this.f42375q0 = new HashMap();
        this.f42379s0 = true;
        this.f42381t0 = true;
        this.f42383u0 = false;
        this.f42385v0 = false;
        this.f42389x0 = new C16221c();
        this.f42391y0 = 1.0f;
        this.f42393z0 = 1.0f;
        this.f42335A0 = 0;
        this.f42337B0 = 0;
        this.f42343E0 = null;
        this.f42345F0 = null;
        this.f42347G0 = true;
        this.f42349H0 = false;
        setRetainInstance(true);
        for (MapItem.Type put : MapItem.Type.values()) {
            this.f42384v.put(put, new HashSet());
        }
    }

    /* renamed from: J2 */
    public static int m41339J2(LatLonE6 latLonE6, LatLonE6 latLonE62, float f, float f2) {
        float f3;
        if (latLonE6 == null || latLonE62 == null) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            float[] fArr = new float[1];
            Location.distanceBetween(latLonE6.mo46922k(), latLonE6.mo46926o(), latLonE62.mo46922k(), latLonE62.mo46926o(), fArr);
            f3 = fArr[0];
        }
        return (int) (Math.max(0.0d, Math.log10((double) ((Math.abs(f2 - f) * 100.0f) + f3))) * 100.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (com.moovit.map.MapFragment.C16229j) r4;
     */
    /* renamed from: y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m41340y2(o20.C18711q r3, java.lang.Object r4, com.moovit.commons.geo.LatLonE6 r5, p762qz.C19207c.C19208a r6) {
        /*
            boolean r0 = r4 instanceof com.moovit.map.MapFragment.C16229j
            if (r0 != 0) goto L_0x0005
            goto L_0x002f
        L_0x0005:
            com.moovit.map.MapFragment$j r4 = (com.moovit.map.MapFragment.C16229j) r4
            java.lang.Object r0 = r4.f42419a
            if (r0 != 0) goto L_0x000c
            goto L_0x002f
        L_0x000c:
            o20.r r1 = new o20.r
            r1.<init>(r3)
            java.util.Objects.requireNonNull(r6)
            o20.h r3 = new o20.h
            r3.<init>(r6)
            r6 = 1
            com.moovit.commons.geo.LatLonE6[] r6 = new com.moovit.commons.geo.LatLonE6[r6]
            r2 = 0
            r6[r2] = r5
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r0, r1, r3, r6)
            r3.start()
            android.animation.ObjectAnimator r5 = r4.f42422d
            if (r5 == 0) goto L_0x002d
            r5.cancel()
        L_0x002d:
            r4.f42422d = r3
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.MapFragment.m41340y2(o20.q, java.lang.Object, com.moovit.commons.geo.LatLonE6, qz.c$a):void");
    }

    /* renamed from: A2 */
    public final void mo48605A2(Rect rect, BoxE6 boxE6, boolean z) {
        C16221c cVar = this.f42389x0;
        if (z) {
            this.f42343E0 = new C16240u(boxE6, rect);
        }
        mo48607C2(new C16245a.C16251f(this, boxE6, rect, cVar), !z);
    }

    /* renamed from: B2 */
    public final void mo48606B2(Rect rect, BoxE6 boxE6, boolean z) {
        mo48605A2(mo48617N2(rect), boxE6, z);
    }

    /* renamed from: C2 */
    public final void mo48607C2(C16245a aVar, boolean z) {
        this.f42368n.mo48789f(aVar);
        if (z) {
            this.f42343E0 = null;
        }
    }

    /* renamed from: D2 */
    public final void mo48608D2() {
        Iterator<C20944i0<C16283a, C13556a>> it = this.f42382u.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                ((C13556a) ((C20944i0) it2.next()).f52693b).cancel(true);
            }
        }
        this.f42382u.clear();
    }

    /* renamed from: E2 */
    public final void mo48609E2() {
        C21100e.m49369v(1);
        mo48610F2();
        C21100e.m49369v(1);
        C1963s n = this.f42368n.mo48799n();
        C18696b bVar = (C18696b) n.f6792b;
        if (bVar != null) {
            mo48611G2(bVar);
        }
        if (mo48624U2()) {
            ((C18696b) n.f6791a).clear();
        }
        mo48613I2();
        mo48612H2();
    }

    /* renamed from: F2 */
    public final void mo48610F2() {
        mo48611G2(this.f42368n.mo48783F());
    }

    /* renamed from: G2 */
    public final void mo48611G2(C18696b<C18713s> bVar) {
        C21100e.m49369v(1);
        Set<C13556a> set = (Set) this.f42392z.remove(bVar);
        if (set != null) {
            for (C13556a cancel : set) {
                cancel.cancel(true);
            }
        }
        if (mo48624U2()) {
            bVar.clear();
        }
    }

    /* renamed from: H2 */
    public final void mo48612H2() {
        C21100e.m49369v(1);
        if (mo48624U2()) {
            this.f42368n.mo48811s().clear();
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: I2 */
    public final void mo48613I2() {
        C21100e.m49369v(1);
        if (mo48624U2()) {
            this.f42368n.mo48815w().clear();
        }
    }

    /* renamed from: K2 */
    public final C18711q mo48614K2(int i) {
        return this.f42368n.mo48816x(i);
    }

    /* renamed from: L2 */
    public final LatLonE6 mo48615L2() {
        return this.f42368n.mo48800o();
    }

    /* renamed from: M2 */
    public final float mo48616M2() {
        float f = this.f42390y;
        return f >= BitmapDescriptorFactory.HUE_RED ? f : (float) getResources().getInteger(C19741s.map_default_follow_zoom);
    }

    /* renamed from: N2 */
    public final Rect mo48617N2(Rect rect) {
        Rect rect2 = new Rect();
        if (rect != null) {
            rect2.set(rect);
        }
        Rect R2 = mo48621R2();
        int width = R2.width();
        int height = R2.height();
        int i = width / 10;
        rect2.left += i;
        int i2 = height / 10;
        rect2.top += i2;
        rect2.bottom += i2;
        rect2.right += i;
        return rect2;
    }

    /* renamed from: O2 */
    public final float mo48618O2() {
        float f = this.f42388x;
        return f >= BitmapDescriptorFactory.HUE_RED ? f : (float) getResources().getInteger(C19741s.map_default_zoom);
    }

    /* renamed from: P2 */
    public final MapFollowMode mo48619P2(MapFollowMode mapFollowMode) {
        int i = C16222d.f42397a[mapFollowMode.ordinal()];
        if (i == 1) {
            Set<MapFollowMode> set = this.f42355N;
            MapFollowMode mapFollowMode2 = MapFollowMode.LOCATION;
            if (set.contains(mapFollowMode2)) {
                return mapFollowMode2;
            }
            Set<MapFollowMode> set2 = this.f42355N;
            MapFollowMode mapFollowMode3 = MapFollowMode.BOTH;
            if (!set2.contains(mapFollowMode3) || !mo48625V2()) {
                return MapFollowMode.NONE;
            }
            return mapFollowMode3;
        } else if (i == 2) {
            Set<MapFollowMode> set3 = this.f42355N;
            MapFollowMode mapFollowMode4 = MapFollowMode.BOTH;
            if (!set3.contains(mapFollowMode4) || !mo48625V2()) {
                return MapFollowMode.LOCATION;
            }
            return mapFollowMode4;
        } else if (i == 3) {
            Set<MapFollowMode> set4 = this.f42355N;
            MapFollowMode mapFollowMode5 = MapFollowMode.LOCATION;
            if (set4.contains(mapFollowMode5)) {
                return mapFollowMode5;
            }
            return MapFollowMode.BOTH;
        } else {
            throw new IllegalArgumentException("Unknown map follow mode: " + mapFollowMode);
        }
    }

    /* renamed from: Q2 */
    public final LatLonE6 mo48620Q2() {
        C20061g P1 = mo46781P1();
        if (P1 == null) {
            return null;
        }
        return LatLonE6.m40177j(P1.mo50014i());
    }

    /* renamed from: R2 */
    public final Rect mo48621R2() {
        Rect rect = new Rect();
        View view = getView();
        if (view instanceof MapFragmentView) {
            ((MapFragmentView) view).mo48685a(rect);
        }
        int i = rect.left;
        Rect rect2 = this.f42369n0;
        rect.left = i + rect2.left;
        rect.right -= rect2.right;
        rect.top += rect2.top;
        rect.bottom -= rect2.bottom;
        return rect;
    }

    /* renamed from: S2 */
    public final float mo48622S2() {
        return this.f42368n.mo48780C();
    }

    /* renamed from: T2 */
    public final void mo48623T2() {
        LatLonE6 latLonE6;
        C20061g P1 = mo46781P1();
        if (P1 != null) {
            latLonE6 = LatLonE6.m40177j(P1.mo50014i());
        } else {
            latLonE6 = null;
        }
        if (latLonE6 == null) {
            mo46781P1().mo50016n().addOnSuccessListener((Activity) requireActivity(), new C14753n(this, 5));
        }
        if (latLonE6 == null) {
            latLonE6 = C19728f.m47195a(this.f40822c).f50165a.f16139n;
        }
        this.f42368n.mo48787d(latLonE6, mo48618O2());
    }

    /* renamed from: U2 */
    public final boolean mo48624U2() {
        C16285j jVar = this.f42368n;
        return jVar != null && jVar.isReady();
    }

    /* renamed from: V2 */
    public final boolean mo48625V2() {
        boolean z;
        C20681d dVar = this.f42367m0;
        if (dVar != null) {
            if (((C20678b) dVar).f52241g != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W2 */
    public final boolean mo48626W2() {
        if (this.f42356O.isFollowRotation()) {
            return true;
        }
        if (!this.f42373p0 || !this.f42357P) {
            return false;
        }
        return true;
    }

    /* renamed from: X2 */
    public final void mo48627X2(LatLonE6 latLonE6) {
        int size = this.f42351J.size();
        for (int i = 0; i < size; i++) {
            ((C16230k) this.f42351J.get(i)).mo48680a();
        }
    }

    /* renamed from: Y2 */
    public final void mo48628Y2(LatLonE6 latLonE6, boolean z) {
        int size = this.f42352K.size();
        for (int i = 0; i < size; i++) {
            ((C16231l) this.f42352K.get(i)).mo48681a(latLonE6, z);
        }
    }

    /* renamed from: Z2 */
    public final void mo48629Z2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        MapFollowMode mapFollowMode;
        if (mo48624U2()) {
            boolean z9 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 85) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i & 4) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i & 32) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i & 64) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i & 8) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            Iterator it = this.f42340D.iterator();
            while (it.hasNext()) {
                ((C16236q) it.next()).mo48515c(i);
            }
            if (!z && (!z2 || ((!z6 && z5) || (!z4 && z3)))) {
                mo48655s3();
            }
            if (mo48622S2() >= this.f42372p) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f42368n.mo48808p().setVisible(z8);
            if (z && z3 && this.f42356O.isFollowLocation()) {
                mo48641l3(MapFollowMode.NONE, true);
            } else if (z && z7 && (mapFollowMode = this.f42356O) == MapFollowMode.BOTH) {
                mo48641l3(mo48619P2(mapFollowMode), true);
            }
            if (z7 && this.f42359R != null) {
                float z11 = this.f42368n.mo48818z();
                if (z11 == BitmapDescriptorFactory.HUE_RED && !this.f42356O.isFollowRotation()) {
                    z9 = false;
                }
                if (z9) {
                    this.f42359R.setNorth(z11);
                    Animation animation = this.f42359R.getAnimation();
                    AlphaAnimation alphaAnimation = this.f42360S;
                    if (animation == alphaAnimation) {
                        alphaAnimation.cancel();
                    } else if (this.f42359R.getVisibility() != 0) {
                        this.f42359R.setVisibility(0);
                    }
                } else if (this.f42359R.getVisibility() == 0) {
                    this.f42359R.startAnimation(this.f42360S);
                }
            }
            if (z) {
                this.f42343E0 = null;
            }
        }
    }

    /* renamed from: a3 */
    public final void mo48630a3() {
        boolean z;
        boolean z2;
        this.f42368n.mo48797l(this.f42379s0);
        this.f42368n.mo48812t(this.f42381t0);
        this.f42368n.mo48817y(this.f42347G0);
        C16285j jVar = this.f42368n;
        Rect rect = this.f42369n0;
        jVar.mo48809q(rect.left, rect.top, rect.right, rect.bottom);
        this.f42368n.mo48790g(this.f42335A0, this.f42391y0, this.f42393z0, this.f42337B0);
        MapFragmentView view = this.f42368n.getView();
        boolean z3 = this.f42383u0;
        boolean z4 = this.f42385v0;
        if (!(view.f42437m == z3 && view.f42439o == z4)) {
            view.f42437m = z3;
            view.f42439o = z4;
            if (z3 || z4) {
                z2 = false;
            } else {
                z2 = true;
            }
            view.setWillNotDraw(z2);
            view.invalidate();
        }
        this.f42368n.getView().setFitsSystemWindows(this.f42349H0);
        if (!this.f42339C0) {
            this.f42368n.mo48781D(this.f42356O);
        }
        mo48659u3();
        for (C16224f fVar : this.f42375q0.values()) {
            if (fVar.f42401e != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                fVar.f42401e = this.f42368n.mo48816x(-1);
                if (!fVar.f42399c.isEmpty()) {
                    fVar.mo48674p();
                }
            }
        }
        C16285j jVar2 = this.f42368n;
        getContext();
        jVar2.mo48786c((List) C13386a.f33222b.f43936b);
        mo48661v3(mo46781P1().mo50014i(), false, false);
        Iterator it = this.f42338C.iterator();
        while (it.hasNext()) {
            ((C16237r) it.next()).mo21406a();
            it.remove();
        }
    }

    /* renamed from: b3 */
    public final void mo48631b3(Object obj) {
        if (obj instanceof MapItem) {
            MapItem mapItem = (MapItem) obj;
            Iterator it = this.f42342E.iterator();
            while (it.hasNext()) {
                ((C16233n) it.next()).mo48579d(mapItem);
            }
        } else if (obj instanceof C18872a) {
            mo48607C2(new C16245a.C16251f(this, BoxE6.m40166f(((C18872a) obj).f48041f), mo48617N2((Rect) null), new C16245a.C16249d(getResources().getInteger(C19741s.zoom_to_cluster_animation_length))), true);
        } else if (obj instanceof C18880g) {
            C18880g gVar = (C18880g) obj;
            Iterator it2 = this.f42344F.iterator();
            while (it2.hasNext()) {
                ((C16239t) it2.next()).mo48684a(gVar);
            }
        } else {
            Iterator it3 = this.f42346G.iterator();
            while (it3.hasNext()) {
                ((C16238s) it3.next()).mo23897L0(this, obj);
            }
        }
    }

    /* renamed from: c2 */
    public final void mo46790c2(Location location) {
        mo48661v3(location, true, false);
    }

    /* renamed from: c3 */
    public final void mo48632c3(C20677a aVar) {
        float f;
        if (mo48624U2()) {
            if (aVar == null) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = -((float) Math.toDegrees((double) aVar.f52237a));
            }
            if (this.f42356O.isFollowRotation()) {
                mo48607C2(new C16245a.C16250e(f, Strategy.TTL_SECONDS_DEFAULT, C17685d.f45436a), true);
            }
            if (this.f42373p0 && this.f42357P) {
                this.f42368n.mo48796k(f);
            }
        }
    }

    /* renamed from: d2 */
    public final void mo46791d2(C20061g gVar, C20061g gVar2) {
        super.mo46791d2(gVar, gVar2);
        if (isVisible()) {
            mo46790c2(mo46781P1().mo50014i());
        }
    }

    /* renamed from: d3 */
    public final void mo48633d3() {
        if (mo48624U2()) {
            mo48608D2();
            this.f42368n.mo48782E(true);
            try {
                this.f42368n.mo48808p().clear();
                this.f42380t.clear();
                mo48655s3();
            } finally {
                this.f42368n.mo48782E(false);
            }
        }
    }

    /* renamed from: e2 */
    public final void mo46792e2(Bundle bundle) {
        boolean z;
        int i;
        super.mo46792e2(bundle);
        Context context = getContext();
        C18710p k = MoovitApplication.f37317k.mo44559k(context);
        k.mo48772b();
        this.f42339C0 = false;
        C19728f a = C19728f.m47195a(context.getApplicationContext());
        if (a != null) {
            this.f42370o = a.f50165a.f16132g.getBounds();
        }
        Resources resources = getResources();
        if (this.f42372p < BitmapDescriptorFactory.HUE_RED) {
            if (k.mo48771a() == MapImplType.BAIDU) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = C19741s.baidu_map_items_min_zoom;
            } else {
                i = C19741s.default_map_items_min_zoom;
            }
            this.f42372p = (float) resources.getInteger(i);
            mo48633d3();
        }
        C20678b bVar = new C20678b(getContext());
        if (!this.f42339C0) {
            if (this.f42367m0 != null && mo48626W2()) {
                C18701g gVar = this.f42366l0;
                C18481b bVar2 = this.f40828i;
                if (bVar2.f47084a != null) {
                    if (bVar2.f47085b) {
                        bVar.mo50904b(gVar);
                    }
                    bVar2.f47084a.mo47007p(bVar, gVar);
                }
            }
            this.f42367m0 = bVar;
            if (mo48626W2()) {
                C18701g gVar2 = this.f42366l0;
                C18481b bVar3 = this.f40828i;
                if (bVar3.f47084a == null) {
                    bVar3.f47084a = new CollectionHashMap.HashSetHashMap<>();
                }
                bVar3.f47084a.mo47001a(bVar, gVar2);
                if (bVar3.f47085b) {
                    bVar.mo50903a(gVar2);
                }
            }
            if (isVisible()) {
                mo48632c3((C20677a) ((C18861a) this.f42367m0).f48035e);
            }
        }
        if (bundle != null) {
            mo48641l3(MapFollowMode.valueOf(bundle.getString("mapFollowMode")), false);
            boolean z2 = bundle.getBoolean("isSubwayLayerVisible", false);
            this.f42374q = z2;
            C16285j jVar = this.f42368n;
            if (jVar != null) {
                jVar.mo48798m(z2);
            }
            boolean z3 = bundle.getBoolean("isPathwayLayerVisible", false);
            this.f42376r = z3;
            C16285j jVar2 = this.f42368n;
            if (jVar2 != null) {
                jVar2.mo48778A(z3);
            }
            mo48647o3((Rect) bundle.getParcelable("mapPadding"));
        }
        mo48659u3();
        if (getView() != null) {
            mo48623T2();
        }
    }

    /* renamed from: e3 */
    public final void mo48634e3(Object obj) {
        C21100e.m49369v(1);
        if (obj instanceof C19224b) {
            C1963s n = this.f42368n.mo48799n();
            C19224b bVar = (C19224b) obj;
            ((C18696b) n.f6791a).remove(bVar.f48822b);
            if (((C18696b) n.f6792b) != null) {
                bVar.f48824d = true;
                Set set = (Set) this.f42392z.get((C18696b) n.f6792b);
                if (set != null) {
                    set.remove(bVar);
                }
                List<Object> list = bVar.f48823c;
                if (!C13717b.m34258e(list)) {
                    C18696b bVar2 = (C18696b) n.f6792b;
                    for (Object h3 : list) {
                        mo48637h3(h3, bVar2);
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid removal token: " + obj);
    }

    /* renamed from: f3 */
    public final void mo48635f3(C16236q qVar) {
        this.f42340D.remove(qVar);
    }

    /* renamed from: g3 */
    public final void mo48636g3(Object obj) {
        mo48637h3(obj, this.f42368n.mo48783F());
    }

    /* renamed from: h3 */
    public final void mo48637h3(Object obj, C18696b<C18713s> bVar) {
        C16229j jVar = (C16229j) obj;
        C21100e.m49369v(2);
        Object obj2 = jVar.f42419a;
        if (obj2 != null) {
            bVar.remove(obj2);
            return;
        }
        C13556a aVar = jVar.f42420b;
        if (aVar != null) {
            aVar.cancel(true);
            C13556a aVar2 = jVar.f42420b;
            Set set = (Set) this.f42392z.get(bVar);
            if (set != null) {
                set.remove(aVar2);
            }
        }
    }

    /* renamed from: i3 */
    public final void mo48638i3(Object obj) {
        C21100e.m49369v(1);
        this.f42368n.mo48811s().remove(obj);
    }

    /* renamed from: j3 */
    public final void mo48639j3(Object obj) {
        C21100e.m49369v(1);
        this.f42368n.mo48815w().remove(obj);
    }

    /* renamed from: k3 */
    public final void mo48640k3(MapFollowMode... mapFollowModeArr) {
        HashSet hashSet = new HashSet(Arrays.asList(mapFollowModeArr));
        hashSet.add(MapFollowMode.NONE);
        this.f42355N = Collections.unmodifiableSet(hashSet);
        mo48641l3(this.f42356O, false);
        mo48653r3();
    }

    /* renamed from: l3 */
    public final void mo48641l3(MapFollowMode mapFollowMode, boolean z) {
        boolean z2;
        if (!this.f42339C0) {
            C21100e.m49373x(mapFollowMode, "mapFollowMode");
            if (mapFollowMode.isFollowRotation() && !mo48625V2()) {
                mapFollowMode = MapFollowMode.LOCATION;
            }
            MapFollowMode mapFollowMode2 = this.f42356O;
            if (mapFollowMode != mapFollowMode2) {
                boolean isFollowLocation = mapFollowMode2.isFollowLocation();
                boolean z3 = false;
                if (this.f42367m0 == null || !mo48626W2()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f42356O = mapFollowMode;
                if (this.f42367m0 != null && mo48626W2()) {
                    z3 = true;
                }
                if (mapFollowMode.isFollowLocation() && !isFollowLocation) {
                    mo48661v3(mo46781P1().mo50014i(), true, true);
                }
                if (z3 && !z2) {
                    C20681d dVar = this.f42367m0;
                    C18701g gVar = this.f42366l0;
                    C18481b bVar = this.f40828i;
                    if (bVar.f47084a == null) {
                        bVar.f47084a = new CollectionHashMap.HashSetHashMap<>();
                    }
                    bVar.f47084a.mo47001a(dVar, gVar);
                    if (bVar.f47085b) {
                        ((C18861a) dVar).mo50903a(gVar);
                    }
                    mo48632c3((C20677a) ((C18861a) this.f42367m0).f48035e);
                }
                if (!z3 && z2) {
                    C20681d dVar2 = this.f42367m0;
                    C18701g gVar2 = this.f42366l0;
                    C18481b bVar2 = this.f40828i;
                    if (bVar2.f47084a != null) {
                        if (bVar2.f47085b) {
                            ((C18861a) dVar2).mo50904b(gVar2);
                        }
                        bVar2.f47084a.mo47007p(dVar2, gVar2);
                    }
                    if (!z) {
                        mo48607C2(new C16245a.C16250e(BitmapDescriptorFactory.HUE_RED, 400, C17685d.f45437b), true);
                    }
                }
                Iterator it = this.f42350I.iterator();
                while (it.hasNext()) {
                    ((C16232m) it.next()).mo23898h(mapFollowMode);
                }
                if (mo48624U2()) {
                    mo48657t3(mapFollowMode);
                }
            }
        }
    }

    /* renamed from: m2 */
    public final C19224b mo48642m2(Polyline polyline, LineStyle lineStyle, Color color) {
        C18699e eVar = new C18699e(lineStyle);
        C18715u uVar = new C18715u(polyline, polyline, eVar);
        C21100e.m49369v(1);
        C1963s n = this.f42368n.mo48799n();
        C19224b bVar = new C19224b(((C18696b) n.f6791a).mo51066d(uVar));
        C18696b bVar2 = (C18696b) n.f6792b;
        if (bVar2 != null) {
            Set set = (Set) this.f42392z.get(bVar2);
            if (set == null) {
                set = new HashSet();
                this.f42392z.put(bVar2, set);
            }
            set.add(bVar);
            Tasks.call(AsyncTask.THREAD_POOL_EXECUTOR, new C19223a(polyline, ((LineStyle) eVar.f47602a).f42326b, color)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C19999i(this, bVar, n, 1));
        }
        return bVar;
    }

    /* renamed from: m3 */
    public final void mo48643m3(int i, int i2) {
        C17885a.m44443j(this.f42358Q, i2);
        this.f42358Q.setSupportImageTintList((ColorStateList) null);
        this.f42358Q.setImageResource(i);
    }

    /* renamed from: n2 */
    public final void mo48644n2(C18878e eVar) {
        if (this.f42377r0 == null) {
            this.f42377r0 = new Handler();
        }
        if (!this.f42375q0.containsKey(eVar.mo51345b())) {
            C16224f fVar = new C16224f(eVar);
            this.f42375q0.put(eVar.mo51345b(), fVar);
            if (mo48624U2()) {
                fVar.f42401e = this.f42368n.mo48816x(-1);
                if (!fVar.f42399c.isEmpty()) {
                    fVar.mo48674p();
                }
            }
            if (this.f40824e) {
                fVar.mo48675q();
                return;
            }
            return;
        }
        StringBuilder k = C13555b.m33972k("MapItemCollectionLoader has been already added: ");
        k.append(eVar.mo51345b());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: n3 */
    public final void mo48645n3(int i, int i2, int i3, int i4) {
        Rect rect = this.f42369n0;
        if (rect.left != i || rect.top != i2 || rect.right != i3 || rect.bottom != i4) {
            rect.set(i, i2, i3, i4);
            if (mo48624U2()) {
                this.f42368n.mo48809q(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: o2 */
    public final Object mo48646o2(C19206b bVar, Object obj, MarkerZoomStyle markerZoomStyle) {
        return mo48648p2(bVar, obj, new C18699e(markerZoomStyle));
    }

    /* renamed from: o3 */
    public final void mo48647o3(Rect rect) {
        mo48645n3(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        C16285j c = MoovitApplication.f37317k.mo44559k(context).mo48773c(this, layoutInflater, viewGroup, bundle, C19047a.m46164a(context));
        this.f42368n = c;
        c.mo48790g(this.f42335A0, this.f42391y0, this.f42393z0, this.f42337B0);
        MapOverlaysLayout v = this.f42368n.mo48814v();
        this.f42386w = v;
        if (!this.f42339C0) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) v.findViewById(C19740r.map_follow_mode_button);
            this.f42358Q = floatingActionButton;
            floatingActionButton.setOnClickListener(this.f42364Y);
            mo48653r3();
        }
        CompassView compassView = (CompassView) this.f42386w.findViewById(C19740r.map_compass);
        this.f42359R = compassView;
        if (compassView != null) {
            compassView.setOnClickListener(this.f42365Z);
            CompassView compassView2 = this.f42359R;
            LinearInterpolator linearInterpolator = C17685d.f45436a;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new C17684c(compassView2));
            this.f42360S = alphaAnimation;
            alphaAnimation.setDuration(500);
        }
        this.f42368n.mo48813u(this.f42341D0);
        this.f42368n.mo48798m(this.f42374q);
        this.f42368n.mo48778A(this.f42376r);
        mo48657t3(this.f42356O);
        C20681d dVar = this.f42367m0;
        if (dVar != null) {
            ((C20678b) dVar).f52249o = this.f40822c.getWindowManager().getDefaultDisplay();
        }
        MapFragmentView view = this.f42368n.getView();
        view.setOwner(this);
        return view;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C20681d dVar = this.f42367m0;
        if (dVar != null) {
            ((C20678b) dVar).f52249o = null;
        }
        mo48608D2();
        for (Set<C13556a> it : this.f42392z.values()) {
            for (C13556a cancel : it) {
                cancel.cancel(true);
            }
        }
        this.f42392z.clear();
        Iterator it2 = this.f42375q0.values().iterator();
        while (it2.hasNext()) {
            C16224f fVar = (C16224f) it2.next();
            if (!fVar.f42400d) {
                it2.remove();
                if (this.f40824e) {
                    MapFragment.this.f42377r0.removeCallbacks(fVar);
                    C13556a aVar = fVar.f42402f;
                    if (aVar != null) {
                        aVar.cancel(true);
                    }
                }
                if (mo48624U2()) {
                    this.f42368n.mo48779B(fVar.f42401e);
                    fVar.f42403g.cancel(true);
                    fVar.f42404h.cancel(true);
                    fVar.f42405i = SystemClock.elapsedRealtime();
                    fVar.f42401e = null;
                }
            } else if (mo48624U2()) {
                this.f42368n.mo48779B(fVar.f42401e);
                fVar.f42403g.cancel(true);
                fVar.f42404h.cancel(true);
                fVar.f42405i = SystemClock.elapsedRealtime();
                fVar.f42401e = null;
            }
        }
        this.f42358Q = null;
        this.f42368n.getView().setOwner((MapFragment) null);
        this.f42368n.onDestroy();
        this.f42368n = null;
        this.f42341D0 = null;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray n = UiUtils.m40255n(context, attributeSet, C19748z.MapFragment);
        try {
            this.f42372p = n.getFloat(C19748z.MapFragment_mapItemMinZoom, -1.0f);
            mo48633d3();
            mo48645n3(n.getDimensionPixelSize(C19748z.MapFragment_mapPaddingLeft, 0), n.getDimensionPixelSize(C19748z.MapFragment_mapPaddingTop, 0), n.getDimensionPixelSize(C19748z.MapFragment_mapPaddingRight, 0), n.getDimensionPixelSize(C19748z.MapFragment_mapPaddingBottom, 0));
            this.f42388x = n.getFloat(C19748z.MapFragment_defaultZoom, -1.0f);
            this.f42390y = n.getFloat(C19748z.MapFragment_defaultFollowZoom, -1.0f);
            int integer = n.getInteger(C19748z.MapFragment_displayMapItems, 0);
            ArrayList arrayList = new ArrayList();
            if ((integer & 1) != 0) {
                arrayList.add(MapItem.Type.STOP);
            }
            this.f42354M.clear();
            this.f42354M.addAll(arrayList);
            mo48633d3();
            boolean z = n.getBoolean(C19748z.MapFragment_displayUserMarker, true);
            if (this.f42373p0 != z) {
                this.f42373p0 = z;
                mo48659u3();
            }
            boolean z2 = n.getBoolean(C19748z.MapFragment_gesturesEnabled, true);
            this.f42379s0 = z2;
            if (mo48624U2()) {
                this.f42368n.mo48797l(z2);
            }
            mo48651q3(n.getBoolean(C19748z.MapFragment_userInteractionEnabled, true));
            mo48649p3(n.getBoolean(C19748z.MapFragment_mapTopShadow, true), n.getBoolean(C19748z.MapFragment_mapBottomShadow, true));
            this.f42387w0 = n.getFloat(C19748z.MapFragment_minZoomToSelectOverlappingMarkers, Float.NaN);
            this.f42356O = MapFollowMode.fromId(n.getInt(C19748z.MapFragment_followMode, 0));
            this.f42355N = MapFollowMode.fromMask(n.getInt(C19748z.MapFragment_enabledFollowModes, -1));
            this.f42357P = n.getBoolean(C19748z.MapFragment_showRotationInUserAvatar, false);
            this.f42391y0 = n.getFloat(C19748z.MapFragment_mapViewWidthCoef, 1.0f);
            this.f42393z0 = n.getFloat(C19748z.MapFragment_mapViewHeightCoef, 1.0f);
            this.f42335A0 = n.getDimensionPixelOffset(C19748z.MapFragment_mapViewExtraWidth, 0);
            this.f42337B0 = n.getDimensionPixelOffset(C19748z.MapFragment_mapViewExtraHeight, 0);
            boolean z3 = n.getBoolean(C19748z.MapFragment_showSubwayLayer, false);
            this.f42374q = z3;
            C16285j jVar = this.f42368n;
            if (jVar != null) {
                jVar.mo48798m(z3);
            }
            boolean z4 = n.getBoolean(C19748z.MapFragment_showPathwayLayer, false);
            this.f42376r = z4;
            C16285j jVar2 = this.f42368n;
            if (jVar2 != null) {
                jVar2.mo48778A(z4);
            }
            boolean z5 = n.getBoolean(C19748z.MapFragment_requestDisallowInterceptTouchEvent, true);
            this.f42347G0 = z5;
            if (mo48624U2()) {
                this.f42368n.mo48817y(z5);
            }
            boolean z6 = n.getBoolean(C19748z.MapFragment_android_fitsSystemWindows, false);
            this.f42349H0 = z6;
            if (mo48624U2()) {
                this.f42368n.getView().setFitsSystemWindows(z6);
            }
        } finally {
            n.recycle();
        }
    }

    public final void onLowMemory() {
        super.onLowMemory();
        if (mo48624U2()) {
            this.f42368n.onLowMemory();
        }
    }

    public final void onPause() {
        super.onPause();
        this.f42368n.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f42368n.onResume();
        mo48661v3(mo46781P1().mo50014i(), false, false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("mapFollowMode", this.f42356O.name());
        bundle.putBoolean("isSubwayLayerVisible", this.f42374q);
        bundle.putBoolean("isPathwayLayerVisible", this.f42376r);
        bundle.putParcelable("mapPadding", this.f42369n0);
        C16285j jVar = this.f42368n;
        if (jVar != null) {
            jVar.onSaveInstanceState(bundle);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f42368n.onStart();
        for (C16224f q : this.f42375q0.values()) {
            q.mo48675q();
        }
        A a = this.f40822c;
        C16202a.registerPassiveBroadcastReceiver(a, this.f42361T);
        C16202a aVar = C16202a.get(a);
        aVar.addSettingsChangeListener(this.f42363X);
        aVar.requestLocationSettings().addOnSuccessListener((Activity) a, this.f42362U);
    }

    public final void onStop() {
        super.onStop();
        Context context = getContext();
        C16202a.get(context).removeSettingsChangeListener(this.f42363X);
        C16202a.unregisterPassiveBroadcastReceiver(context, this.f42361T);
        this.f42368n.onStop();
        for (C16224f fVar : this.f42375q0.values()) {
            MapFragment.this.f42377r0.removeCallbacks(fVar);
            C13556a aVar = fVar.f42402f;
            if (aVar != null) {
                aVar.cancel(true);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f40826g) {
            mo48623T2();
        }
    }

    /* renamed from: p2 */
    public final Object mo48648p2(C19206b bVar, Object obj, C18699e<MarkerZoomStyle> eVar) {
        return mo48650q2(bVar, obj, eVar, this.f42368n.mo48783F());
    }

    /* renamed from: p3 */
    public final void mo48649p3(boolean z, boolean z2) {
        boolean z3;
        this.f42383u0 = z;
        this.f42385v0 = z2;
        if (mo48624U2()) {
            MapFragmentView view = this.f42368n.getView();
            if (view.f42437m != z || view.f42439o != z2) {
                view.f42437m = z;
                view.f42439o = z2;
                if (z || z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                view.setWillNotDraw(z3);
                view.invalidate();
            }
        }
    }

    /* renamed from: q2 */
    public final Object mo48650q2(C19206b bVar, Object obj, C18699e eVar, C18711q qVar) {
        Iterator it;
        Object obj2;
        List<C19206b> singletonList = Collections.singletonList(bVar);
        List singletonList2 = Collections.singletonList(obj);
        ArrayList arrayList = new ArrayList(singletonList.size());
        if (singletonList2 == null) {
            it = null;
        } else {
            it = singletonList2.iterator();
        }
        for (C19206b location : singletonList) {
            LatLonE6 location2 = location.getLocation();
            if (it == null) {
                obj2 = null;
            } else {
                obj2 = it.next();
            }
            arrayList.add(mo48652r2(new C18713s(obj2, location2, eVar, BitmapDescriptorFactory.HUE_RED), qVar));
        }
        return arrayList.get(0);
    }

    /* renamed from: q3 */
    public final void mo48651q3(boolean z) {
        this.f42381t0 = z;
        if (mo48624U2()) {
            this.f42368n.mo48812t(z);
        }
    }

    /* renamed from: r2 */
    public final C16229j mo48652r2(C18713s sVar, C18696b<C18713s> bVar) {
        C21100e.m49369v(2);
        C16229j jVar = new C16229j();
        this.f42368n.mo48795j();
        C16276f fVar = new C16276f(this, sVar, true, bVar, jVar);
        jVar.f42419a = null;
        jVar.f42420b = fVar;
        Set set = (Set) this.f42392z.get(bVar);
        if (set == null) {
            set = new HashSet();
            this.f42392z.put(bVar, set);
        }
        set.add(fVar);
        fVar.mo48679b(getContext());
        return jVar;
    }

    /* renamed from: r3 */
    public final void mo48653r3() {
        boolean z;
        if (this.f42358Q != null) {
            int i = 0;
            if (this.f42355N.contains(MapFollowMode.LOCATION) || this.f42355N.contains(MapFollowMode.BOTH)) {
                z = true;
            } else {
                z = false;
            }
            FloatingActionButton floatingActionButton = this.f42358Q;
            if (!z || this.f42345F0 == null) {
                i = 8;
            }
            floatingActionButton.setVisibility(i);
        }
    }

    /* renamed from: s2 */
    public final void mo48654s2(C16236q qVar) {
        this.f42340D.add(qVar);
    }

    /* renamed from: s3 */
    public final void mo48655s3() {
        Set<Point> set;
        if (this.f42371o0 && !this.f42354M.isEmpty() && mo48624U2()) {
            this.f42368n.mo48782E(true);
            try {
                if (mo48622S2() < this.f42372p) {
                    for (Map.Entry<Point, C20944i0<C16283a, C13556a>> value : this.f42382u.entrySet()) {
                        for (C20944i0 i0Var : (List) value.getValue()) {
                            ((C13556a) i0Var.f52693b).cancel(true);
                            C16283a aVar = (C16283a) i0Var.f52692a;
                            HashSet hashSet = this.f42380t;
                            aVar.getClass();
                            hashSet.remove(new C20944i0(new Point(aVar.f42555w), aVar.f42554v));
                        }
                    }
                    this.f42382u.clear();
                    return;
                }
                BoxE6 h = this.f42368n.mo48793h();
                BoxE6 boxE6 = this.f42370o;
                if (boxE6 != null) {
                    h = h.mo46899j(boxE6);
                }
                if (h != null) {
                    C5227c cVar = this.f42378s;
                    mo48615L2();
                    cVar.getClass();
                    set = C16283a.m41526P(h);
                } else {
                    set = Collections.emptySet();
                }
                mo48622S2();
                set.size();
                this.f42368n.mo48782E(false);
                Iterator<Point> it = this.f42382u.keySet().iterator();
                while (it.hasNext()) {
                    Point next = it.next();
                    if (!set.contains(next)) {
                        for (C20944i0 i0Var2 : (List) this.f42382u.get(next)) {
                            this.f42380t.remove(new C20944i0(next, ((C16283a) i0Var2.f52692a).f42554v));
                            ((C13556a) i0Var2.f52693b).cancel(true);
                        }
                        it.remove();
                    }
                }
                Iterator it2 = this.f42354M.iterator();
                while (it2.hasNext()) {
                    MapItem.Type type = (MapItem.Type) it2.next();
                    Set set2 = (Set) this.f42384v.get(type);
                    set2.retainAll(set);
                    ArrayList arrayList = new ArrayList();
                    for (Point point : set) {
                        C20944i0 i0Var3 = new C20944i0(point, type);
                        if (!this.f42380t.contains(i0Var3)) {
                            arrayList.add(point);
                            this.f42380t.add(i0Var3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        set2.addAll(arrayList);
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Point point2 = (Point) it3.next();
                            C16283a aVar2 = new C16283a(mo46783R1(), type, point2);
                            C13556a f2 = mo46793f2(aVar2.mo48776O(), aVar2, C16283a.f42553y, this.f42336B);
                            if (f2 != null) {
                                this.f42382u.mo47001a(point2, new C20944i0(aVar2, f2));
                            }
                        }
                    } else if (set2.isEmpty()) {
                        Iterator it4 = this.f42348H.iterator();
                        while (it4.hasNext()) {
                            ((C16235p) it4.next()).mo48683a();
                        }
                    }
                }
            } finally {
                this.f42368n.mo48782E(false);
            }
        }
    }

    /* renamed from: t2 */
    public final void mo48656t2(C16237r rVar) {
        if (mo48624U2()) {
            rVar.mo21406a();
        } else {
            this.f42338C.add(rVar);
        }
    }

    /* renamed from: t3 */
    public final void mo48657t3(MapFollowMode mapFollowMode) {
        if (!this.f42339C0) {
            if (this.f42345F0 != null) {
                this.f42358Q.setImageDrawable((Drawable) null);
                if (!C16202a.get(requireContext()).hasLocationPermissions()) {
                    mo48643m3(C19739q.ic_alert_24_problem, 0);
                } else if (!this.f42345F0.mo48507a() || !this.f42345F0.mo48509c()) {
                    mo48643m3(C19739q.ic_location_off_24, C19747y.ThemeOverlay_Moovit_FloatingActionButton_Problem);
                } else {
                    mo48643m3(mapFollowMode.getButtonResId(), 0);
                }
            }
            if (mo48624U2()) {
                this.f42368n.mo48781D(mapFollowMode);
            }
        }
    }

    /* renamed from: u2 */
    public final void mo48658u2(C16238s sVar) {
        this.f42346G.add(sVar);
    }

    /* renamed from: u3 */
    public final void mo48659u3() {
        Location location;
        C20681d dVar;
        float f;
        if (mo48624U2()) {
            Location i = mo46781P1().mo50014i();
            C16285j jVar = this.f42368n;
            if (this.f42373p0) {
                location = i;
            } else {
                location = null;
            }
            jVar.mo48810r(location);
            if (this.f42373p0 && i != null && (dVar = this.f42367m0) != null && this.f42357P) {
                C20677a aVar = (C20677a) ((C18861a) dVar).f48035e;
                if (aVar == null) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = -((float) Math.toDegrees((double) aVar.f52237a));
                }
                this.f42368n.mo48796k(f);
            }
        }
    }

    /* renamed from: v2 */
    public final Object mo48660v2(Polygon polygon, C16286k kVar) {
        C18714t tVar = new C18714t(polygon, polygon, (List<Polygon>) null, new C18699e(kVar));
        C21100e.m49369v(1);
        return this.f42368n.mo48811s().mo51066d(tVar);
    }

    /* renamed from: v3 */
    public final void mo48661v3(Location location, boolean z, boolean z2) {
        if (mo48624U2()) {
            if (location != null && this.f42356O.isFollowLocation() && !this.f42339C0) {
                LatLonE6 j = LatLonE6.m40177j(location);
                if (!z) {
                    mo48607C2(new C16245a.C16247b(j), true);
                    if (z2) {
                        mo48607C2(new C16245a.C16253h(mo48616M2()), true);
                    }
                } else if (z2) {
                    mo48664z2(j, mo48616M2());
                } else {
                    mo48663x2(j);
                }
            }
            if (this.f42373p0) {
                this.f42368n.mo48810r(location);
            }
        }
    }

    /* renamed from: w2 */
    public final Object mo48662w2(Polyline polyline, LineStyle lineStyle) {
        C18715u uVar = new C18715u(polyline, polyline, new C18699e(lineStyle));
        C21100e.m49369v(1);
        return this.f42368n.mo48815w().mo51066d(uVar);
    }

    /* renamed from: x2 */
    public final void mo48663x2(LatLonE6 latLonE6) {
        mo48607C2(new C16245a.C16247b(latLonE6, m41339J2(mo48615L2(), latLonE6, mo48622S2(), mo48622S2())), true);
    }

    /* renamed from: z2 */
    public final void mo48664z2(LatLonE6 latLonE6, float f) {
        C16245a.C16248c cVar = new C16245a.C16248c();
        cVar.f42458b = new C16245a.C16247b(latLonE6);
        cVar.f42459c = new C16245a.C16253h(f);
        cVar.f42457a = -1;
        mo48607C2(cVar, true);
    }

    /* renamed from: com.moovit.map.MapFragment$g */
    public static class C16225g extends C16025f<C20065a> {

        /* renamed from: i */
        public final C16224f<?, ?> f42408i;

        /* renamed from: j */
        public final SparseArray<? extends Collection<? extends C18880g>> f42409j;

        /* renamed from: k */
        public final Collection<? extends C18880g> f42410k;

        /* renamed from: l */
        public final int f42411l;

        /* renamed from: m */
        public final int f42412m;

        public C16225g(Context context, C16224f fVar, HashSet hashSet, SparseArray sparseArray) {
            super(context, hashSet);
            this.f42408i = fVar;
            this.f42409j = sparseArray;
            this.f42410k = null;
            this.f42411l = 0;
            this.f42412m = 0;
        }

        /* renamed from: c */
        public final boolean mo48192c(Object obj) {
            C20065a aVar = (C20065a) obj;
            if (aVar == null || aVar.f50910b == null) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final void mo48195f(HashMap hashMap, boolean z) {
            int i;
            HashMap hashMap2 = hashMap;
            if (z) {
                C16224f<?, ?> fVar = this.f42408i;
                fVar.f42404h.f33501b.remove(this);
                SparseArray<? extends Collection<? extends C18880g>> sparseArray = this.f42409j;
                if (sparseArray != null) {
                    SparseArray sparseArray2 = new SparseArray();
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sparseArray2.put(sparseArray.keyAt(i2) * 100, sparseArray.valueAt(i2));
                    }
                    int size2 = sparseArray2.size();
                    int i3 = 0;
                    while (true) {
                        boolean z2 = true;
                        if (i3 >= size2) {
                            break;
                        }
                        int keyAt = sparseArray2.keyAt(i3);
                        if (i3 != size2 - 1) {
                            z2 = false;
                        }
                        for (C18880g gVar : (Collection) sparseArray2.valueAt(i3)) {
                            Image image = gVar.f48055c;
                            MarkerZoomStyle markerZoomStyle = new MarkerZoomStyle(image);
                            markerZoomStyle.f42450d = (C20065a) hashMap2.get(image);
                            if (z2) {
                                i = 25600;
                            } else {
                                i = keyAt + 100;
                            }
                            fVar.f42399c.add(new C18713s(gVar, gVar.f48054b, new C18699e(markerZoomStyle, keyAt, i, (SparseArray) null), BitmapDescriptorFactory.HUE_RED));
                        }
                        i3++;
                    }
                    int i4 = fVar.f42406j - 1;
                    fVar.f42406j = i4;
                    if (i4 == 0) {
                        fVar.mo48674p();
                        return;
                    }
                    return;
                }
                Collection<? extends C18880g> collection = this.f42410k;
                int i5 = this.f42411l * 100;
                int i6 = this.f42412m * 100;
                for (C18880g gVar2 : collection) {
                    Image image2 = gVar2.f48055c;
                    MarkerZoomStyle markerZoomStyle2 = new MarkerZoomStyle(image2);
                    markerZoomStyle2.f42450d = (C20065a) hashMap2.get(image2);
                    fVar.f42399c.add(new C18713s(gVar2, gVar2.f48054b, new C18699e(markerZoomStyle2, i5, i6, (SparseArray) null), BitmapDescriptorFactory.HUE_RED));
                }
                int i7 = fVar.f42406j - 1;
                fVar.f42406j = i7;
                if (i7 == 0) {
                    fVar.mo48674p();
                }
            }
        }

        public C16225g(Context context, C16224f<?, ?> fVar, Collection<? extends C18880g> collection, int i, int i2) {
            super(context, collection);
            this.f42408i = fVar;
            this.f42409j = null;
            this.f42410k = collection;
            this.f42411l = i;
            this.f42412m = i2;
        }
    }
}
