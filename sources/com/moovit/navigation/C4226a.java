package com.moovit.navigation;

import a10.C13386a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationRequest;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.mock.MockLocationsMode;
import com.moovit.navigation.NavigationPath;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.network.model.ServerId;
import d40.C4343a;
import d40.C4347c;
import d40.C4348d;
import d40.C4351g;
import d40.C4366l;
import f40.C4681a;
import i20.C17556r;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p977zz.C20944i0;

/* renamed from: com.moovit.navigation.a */
public final class C4226a extends C4231d<C4343a> {

    /* renamed from: h */
    public final C17556r f15082h;

    /* renamed from: i */
    public final C4348d f15083i = new C4348d(this);

    /* renamed from: j */
    public ActivityRecognitionResult f15084j;

    /* renamed from: com.moovit.navigation.a$a */
    public class C4227a extends BroadcastReceiver {
        public C4227a() {
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z;
            C4226a aVar = C4226a.this;
            ActivityRecognitionResult extractResult = ActivityRecognitionResult.extractResult(intent);
            aVar.getClass();
            if (((MockLocationsMode) C13386a.f33223c.f43936b) != MockLocationsMode.NONE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar.f15084j = extractResult;
                Location h = aVar.f15082h.mo50014i();
                if (h != null) {
                    aVar.mo19699p(h);
                }
            }
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(10);
    }

    public C4226a(C4351g gVar, Navigable navigable, LocationRequest locationRequest, C4366l lVar) {
        super(gVar, navigable, lVar);
        new C4227a();
        this.f15084j = null;
        int i = C4681a.f15949a;
        this.f15082h = new C17556r(gVar, C16202a.get(gVar).createLocationSource(gVar, gVar.f15324a.f41041b, locationRequest));
    }

    /* renamed from: o */
    public static boolean m11332o(NavigationGeofence navigationGeofence, Location location) {
        Geofence geofence = navigationGeofence.f15046b;
        LatLonE6 latLonE6 = geofence.f40974b;
        double abs = Math.abs(location.getLatitude() - latLonE6.mo46922k());
        double cos = ((Math.cos((location.getLatitude() * 3.141592653589793d) / 180.0d) * Math.abs(location.getLongitude() - latLonE6.mo46926o())) * 4.0075017E7d) / 360.0d;
        double accuracy = (((double) location.getAccuracy()) * 2.0d) + ((double) geofence.f40975c);
        if ((abs * 4.0075017E7d) / 360.0d > accuracy || cos > accuracy || ((double) latLonE6.mo46918d(location)) > accuracy) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final void mo19699p(Location location) {
        boolean z;
        int i;
        GeofencePath c;
        NavigationGeofence b;
        NavigationGeofence navigationGeofence;
        NavigationProgressEvent g;
        NavigationGeofence navigationGeofence2;
        boolean z2;
        boolean z3;
        if (((MockLocationsMode) C13386a.f33223c.f43936b) != MockLocationsMode.NONE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            NavigationLeg b2 = mo19705b();
            if (C4231d.m11343h(this.f15084j, b2)) {
                mo19700q(this.f15099d, location);
                int i2 = this.f15099d.f15364c;
                ServerId serverId = b2.f15056d;
                boolean z4 = !b2.f15058f;
                i = Math.max(0, i2);
                int i3 = -1;
                while (true) {
                    if (i >= mo19707d()) {
                        i = i3;
                        break;
                    }
                    NavigationPath navigationPath = b2.f15055c.get(i);
                    if (serverId == null || navigationPath.f15067g.contains(serverId)) {
                        C4343a aVar = (C4343a) mo19708e(i);
                        if (aVar.f15317b != null && ((z3 = aVar.f15312d) || z4)) {
                            if (z3) {
                                break;
                            } else if (i3 == -1) {
                                i3 = i;
                            }
                        }
                    }
                    i++;
                }
            } else {
                i = -1;
            }
            if (i == -1 || !((C4343a) mo19708e(i)).f15312d) {
                int i4 = this.f15099d.f15362a;
                List<NavigationLeg> u0 = this.f15098c.mo19644u0();
                int i5 = i4 + 1;
                loop1:
                while (true) {
                    if (i5 >= u0.size()) {
                        i5 = -1;
                        break;
                    }
                    NavigationLeg navigationLeg = u0.get(i5);
                    if (C4231d.m11343h(this.f15084j, navigationLeg)) {
                        List<NavigationPath> list = navigationLeg.f15055c;
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            GeofencePath geofencePath = list.get(i6).f15068h;
                            for (int i7 = 0; i7 < geofencePath.f15035b.size(); i7++) {
                                if (m11332o(geofencePath.f15035b.get(i7), location)) {
                                    break loop1;
                                }
                            }
                        }
                        continue;
                    }
                    i5++;
                }
                if (i5 == -1) {
                    z2 = false;
                } else {
                    mo19711j(i5);
                    mo19700q(this.f15099d, location);
                    z2 = true;
                }
                if (z2) {
                    int i8 = this.f15099d.f15362a;
                    mo19715n(false);
                } else if (i != -1) {
                    this.f15099d.f15364c = i;
                    mo19715n(false);
                } else {
                    mo19715n(true);
                    return;
                }
            } else {
                this.f15099d.f15364c = i;
                mo19715n(false);
            }
            if (((C4343a) mo19708e(this.f15099d.f15364c)).f15312d) {
                mo19712k(location);
            } else if (location != null) {
                C4347c e = mo19708e(this.f15099d.f15364c);
                NavigationGeofence navigationGeofence3 = e.f15317b;
                if (navigationGeofence3 != null && (b = c.mo19625b(navigationGeofence3)) != null) {
                    if (navigationGeofence3.f15051g.f15028f) {
                        int i9 = navigationGeofence3.f15050f;
                        while (true) {
                            i9--;
                            if (i9 < 0) {
                                navigationGeofence2 = null;
                                break;
                            }
                            navigationGeofence2 = (c = mo19706c(e.f15316a)).f15035b.get(i9);
                            if (!navigationGeofence2.f15051g.f15028f) {
                                break;
                            }
                        }
                        navigationGeofence = navigationGeofence2;
                    } else {
                        navigationGeofence = navigationGeofence3;
                    }
                    if (navigationGeofence != null) {
                        LatLonE6 latLonE6 = navigationGeofence.f15046b.f40974b;
                        LatLonE6 latLonE62 = b.f15046b.f40974b;
                        if (latLonE62.mo46918d(location) + latLonE6.mo46918d(location) <= LatLonE6.m40174c(latLonE6, latLonE62) * 3.0f && (g = mo19710g(e, (NavigationGeofence) null, navigationGeofence, b, location)) != null) {
                            mo19713l(g);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("userLocation may not be null");
            }
        }
    }

    /* renamed from: q */
    public final void mo19700q(C4366l<C4343a> lVar, Location location) {
        int i;
        C20944i0 i0Var;
        Iterator<T> it = lVar.f15363b.iterator();
        while (it.hasNext()) {
            C4343a aVar = (C4343a) it.next();
            NavigationPath navigationPath = mo19705b().f15055c.get(aVar.f15316a);
            List<T> unmodifiableList = Collections.unmodifiableList(navigationPath.f15068h.f15035b);
            NavigationGeofence navigationGeofence = aVar.f15313e;
            if (navigationGeofence == null) {
                i = 0;
            } else {
                i = navigationGeofence.f15050f;
            }
            while (i < unmodifiableList.size() && !m11332o((NavigationGeofence) unmodifiableList.get(i), location)) {
                i++;
            }
            NavigationGeofence navigationGeofence2 = null;
            if (navigationPath.f15064d != NavigationPath.ShapeReliability.RELIABLE) {
                if (i != unmodifiableList.size()) {
                    navigationGeofence2 = (NavigationGeofence) unmodifiableList.get(i);
                }
                i0Var = new C20944i0(navigationGeofence2, navigationGeofence2);
            } else {
                int i2 = i;
                while (i2 < unmodifiableList.size() && m11332o((NavigationGeofence) unmodifiableList.get(i2), location)) {
                    i2++;
                }
                List<T> subList = unmodifiableList.subList(i, i2);
                float f = Float.MAX_VALUE;
                NavigationGeofence navigationGeofence3 = null;
                for (T t : subList) {
                    float d = t.f15046b.f40974b.mo46918d(location);
                    if (d >= f) {
                        break;
                    }
                    navigationGeofence3 = t;
                    f = d;
                }
                if (!subList.isEmpty()) {
                    navigationGeofence2 = (NavigationGeofence) subList.get(0);
                }
                i0Var = new C20944i0(navigationGeofence3, navigationGeofence2);
            }
            aVar.f15313e = (NavigationGeofence) i0Var.f52693b;
            NavigationGeofence navigationGeofence4 = (NavigationGeofence) i0Var.f52692a;
            if (navigationGeofence4 == null) {
                aVar.f15312d = false;
            } else {
                NavigationGeofence navigationGeofence5 = aVar.f15317b;
                if (navigationGeofence5 == null || navigationGeofence4.compareTo(navigationGeofence5) >= 0) {
                    aVar.f15317b = navigationGeofence4;
                    aVar.f15312d = true;
                    if (navigationGeofence4.f15051g.f15025c) {
                        aVar.f15318c = System.currentTimeMillis();
                    }
                } else {
                    aVar.f15312d = m11332o(navigationGeofence5, location);
                }
            }
        }
    }
}
