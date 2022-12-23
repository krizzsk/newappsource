package com.moovit.navigation;

import a10.C13386a;
import android.app.AlarmManager;
import android.content.ContextWrapper;
import android.location.Location;
import ce0.C21100e;
import com.appboy.support.StringUtils;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.mock.MockLocationsMode;
import com.moovit.navigation.NavigationLeg;
import com.moovit.navigation.event.NavigationDeviationEvent;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.navigation.event.NavigationReturnEvent;
import com.moovit.network.model.ServerId;
import d40.C4343a;
import d40.C4347c;
import d40.C4351g;
import d40.C4366l;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p435de.C16596f;
import p543hq.C17473a;
import p543hq.C17474b;
import p977zz.C20936e0;
import p977zz.C20975x0;

/* renamed from: com.moovit.navigation.d */
public abstract class C4231d<T extends C4347c> extends ContextWrapper {

    /* renamed from: a */
    public final String f15096a = "accurate";

    /* renamed from: b */
    public final C4351g f15097b;

    /* renamed from: c */
    public final Navigable f15098c;

    /* renamed from: d */
    public final C4366l<T> f15099d;

    /* renamed from: e */
    public boolean f15100e = false;

    /* renamed from: f */
    public NavigationProgressEvent f15101f = null;

    /* renamed from: g */
    public NavigationDeviationEvent f15102g = null;

    /* renamed from: com.moovit.navigation.d$a */
    public static /* synthetic */ class C4232a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15103a;

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
                com.moovit.navigation.NavigationLeg$Type[] r0 = com.moovit.navigation.NavigationLeg.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15103a = r0
                com.moovit.navigation.NavigationLeg$Type r1 = com.moovit.navigation.NavigationLeg.Type.TRANSIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15103a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.navigation.NavigationLeg$Type r1 = com.moovit.navigation.NavigationLeg.Type.CAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15103a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.navigation.NavigationLeg$Type r1 = com.moovit.navigation.NavigationLeg.Type.TAXI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15103a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.navigation.NavigationLeg$Type r1 = com.moovit.navigation.NavigationLeg.Type.WALK     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15103a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.navigation.NavigationLeg$Type r1 = com.moovit.navigation.NavigationLeg.Type.BICYCLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15103a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.navigation.NavigationLeg$Type r1 = com.moovit.navigation.NavigationLeg.Type.DOCKLESS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15103a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.navigation.NavigationLeg$Type r1 = com.moovit.navigation.NavigationLeg.Type.WAIT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.navigation.C4231d.C4232a.<clinit>():void");
        }
    }

    public C4231d(C4351g gVar, Navigable navigable, C4366l lVar) {
        super(gVar);
        C4366l lVar2;
        C21100e.m49373x(gVar, "navigationManager");
        this.f15097b = gVar;
        C21100e.m49373x(navigable, "navigable");
        this.f15098c = navigable;
        if (lVar != null) {
            lVar2 = lVar;
        } else {
            lVar2 = new C4366l();
        }
        this.f15099d = lVar2;
        if (lVar == null) {
            mo19711j(0);
        }
    }

    /* renamed from: h */
    public static boolean m11343h(ActivityRecognitionResult activityRecognitionResult, NavigationLeg navigationLeg) {
        if (activityRecognitionResult == null || activityRecognitionResult.getActivityConfidence(4) >= 50 || activityRecognitionResult.getActivityConfidence(5) >= 50) {
            return true;
        }
        switch (C4232a.f15103a[navigationLeg.f15054b.ordinal()]) {
            case 1:
                return m11344i(activityRecognitionResult);
            case 2:
            case 3:
                return m11344i(activityRecognitionResult);
            case 4:
                if (activityRecognitionResult.getActivityConfidence(2) < 30 && activityRecognitionResult.getActivityConfidence(1) < 30 && activityRecognitionResult.getActivityConfidence(3) < 30 && activityRecognitionResult.getActivityConfidence(0) >= 75) {
                    return false;
                }
                return true;
            case 5:
                if (activityRecognitionResult.getActivityConfidence(1) >= 75) {
                    return true;
                }
                return false;
            case 6:
                if (activityRecognitionResult.getActivityConfidence(1) >= 75) {
                    return true;
                }
                return false;
            case 7:
                if (activityRecognitionResult.getActivityConfidence(3) < 30 && activityRecognitionResult.getActivityConfidence(0) >= 75) {
                    return false;
                }
                return true;
            default:
                StringBuilder k = C13555b.m33972k("Unknown leg type: ");
                k.append(navigationLeg.f15054b);
                throw new ApplicationBugException(k.toString());
        }
    }

    /* renamed from: i */
    public static boolean m11344i(ActivityRecognitionResult activityRecognitionResult) {
        if (activityRecognitionResult.getActivityConfidence(0) >= 30 || activityRecognitionResult.getMostProbableActivity().getType() == 0 || activityRecognitionResult.getActivityConfidence(3) >= 30) {
            return true;
        }
        int activityConfidence = activityRecognitionResult.getActivityConfidence(2);
        int activityConfidence2 = activityRecognitionResult.getActivityConfidence(1);
        if (activityConfidence >= 75 || activityConfidence2 >= 75) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo19704a(int i) {
        String str;
        List<NavigationLeg> u0 = this.f15098c.mo19644u0();
        if (i < 0 || i >= u0.size()) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        NavigationLeg.Type type = null;
        if (i < u0.size() - 1) {
            type = u0.get(i + 1).f15054b;
        }
        switch (C17473a.f44989e[u0.get(i).f15054b.ordinal()]) {
            case 1:
                return "walk_step";
            case 2:
                return "bike_step";
            case 3:
                return "dockless_step";
            case 4:
                if (type == NavigationLeg.Type.TAXI) {
                    str = "wait_taxi_step";
                } else {
                    str = "wait_step";
                }
                return str;
            case 5:
                return "ride_step";
            case 6:
                return "ride_taxi_step";
            case 7:
                return "ride_personal_car_step";
            default:
                return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
    }

    /* renamed from: b */
    public final NavigationLeg mo19705b() {
        return this.f15098c.mo19644u0().get(this.f15099d.f15362a);
    }

    /* renamed from: c */
    public final GeofencePath mo19706c(int i) {
        return mo19705b().f15055c.get(i).f15068h;
    }

    /* renamed from: d */
    public final int mo19707d() {
        return this.f15098c.mo19644u0().get(this.f15099d.f15362a).f15055c.size();
    }

    /* renamed from: e */
    public final T mo19708e(int i) {
        return (C4347c) this.f15099d.f15363b.get(i);
    }

    /* renamed from: f */
    public final NavigationProgressEvent mo19709f(C4347c cVar, NavigationGeofence navigationGeofence, NavigationGeofence navigationGeofence2, Location location, NavigationGeofence navigationGeofence3) {
        float f;
        GeofenceMetadata geofenceMetadata;
        int i;
        int i2;
        NavigationGeofence navigationGeofence4;
        NavigationGeofence navigationGeofence5;
        float f2;
        int i3;
        float f3;
        int i4;
        int i5;
        ArrivalState arrivalState;
        int i6;
        int i7;
        int i8;
        float f4;
        C4347c cVar2 = cVar;
        NavigationGeofence navigationGeofence6 = navigationGeofence;
        NavigationGeofence navigationGeofence7 = navigationGeofence2;
        Location location2 = location;
        NavigationGeofence navigationGeofence8 = navigationGeofence3;
        NavigationProgressEvent navigationProgressEvent = null;
        if (location2 == null || navigationGeofence7 == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            try {
                float distanceTo = navigationGeofence6.f15046b.f40974b.mo46929u((Location) null).distanceTo(location2);
                float distanceTo2 = location2.distanceTo(navigationGeofence7.f15046b.f40974b.mo46929u((Location) null));
                f = 1.0f - (distanceTo2 / (distanceTo + distanceTo2));
            } catch (Exception e) {
                e = e;
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("Navigable Id: ");
                k.append(this.f15098c.mo19639e0());
                a.mo49363b(k.toString());
                a.mo49364c(new BadNavigableException(e));
                return navigationProgressEvent;
            }
        }
        GeofenceMetadata geofenceMetadata2 = navigationGeofence6.f15051g;
        if (navigationGeofence7 != null) {
            geofenceMetadata = navigationGeofence7.f15051g;
        } else {
            geofenceMetadata = null;
        }
        GeofenceMetadata geofenceMetadata3 = navigationGeofence8.f15051g;
        int i9 = this.f15099d.f15362a;
        NavigationLeg b = mo19705b();
        ServerId serverId = b.f15056d;
        NavigationPath navigationPath = b.f15055c.get(cVar2.f15316a);
        if (serverId != null) {
            if (!navigationPath.f15067g.contains(serverId)) {
                throw new IllegalStateException("Trying to interpolate progress on path index " + cVar2.f15316a + " that doesn't stop at destination stop id " + serverId);
            }
        }
        int max = Math.max(geofenceMetadata2.f15029g, 0);
        if (serverId == null) {
            i = 0;
        } else {
            List<ServerId> list = navigationPath.f15065e;
            try {
                C21100e.m49359q(max, "startIndex");
                int indexOf = list.subList(max, list.size()).indexOf(serverId) + max;
                if (indexOf == 0 && list.lastIndexOf(serverId) != indexOf) {
                    indexOf = list.lastIndexOf(serverId);
                }
                i = indexOf + 1;
            } catch (Exception e2) {
                e = e2;
                navigationProgressEvent = null;
                C16596f a2 = C16596f.m42113a();
                StringBuilder k2 = C13555b.m33972k("Navigable Id: ");
                k2.append(this.f15098c.mo19639e0());
                a2.mo49363b(k2.toString());
                a2.mo49364c(new BadNavigableException(e));
                return navigationProgressEvent;
            }
        }
        int currentTimeMillis = ((int) (System.currentTimeMillis() - this.f15098c.mo19641j0())) / 1000;
        int i11 = geofenceMetadata3.f15029g;
        if (i11 < 0) {
            i2 = 0;
        } else {
            i2 = i - i11;
        }
        int i12 = geofenceMetadata3.f15030h;
        int i13 = geofenceMetadata3.f15031i;
        ArrivalState arrivalState2 = geofenceMetadata3.f15024b;
        GeofencePath c = mo19706c(cVar2.f15316a);
        int i14 = -1;
        if (i12 != -1) {
            navigationGeofence4 = c.f15035b.get(i12);
            i14 = -1;
        } else {
            navigationGeofence4 = null;
        }
        if (i13 != i14) {
            navigationGeofence5 = c.f15035b.get(i13);
        } else {
            navigationGeofence5 = null;
        }
        if (navigationGeofence4 != null) {
            f2 = (float) navigationGeofence4.f15051g.f15026d;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (navigationGeofence5 != null) {
            i3 = navigationGeofence5.f15051g.f15026d;
        } else {
            i3 = navigationPath.f15069i;
        }
        float f5 = (float) i3;
        if (navigationGeofence4 != null) {
            f3 = (float) navigationGeofence4.f15051g.f15027e;
        } else {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        int i15 = geofenceMetadata2.f15027e;
        int i16 = i11;
        int i17 = geofenceMetadata2.f15026d;
        if (geofenceMetadata != null) {
            i4 = i2;
            arrivalState = arrivalState2;
            i6 = (int) (((float) i17) - (((float) (i17 - geofenceMetadata.f15026d)) * f));
            i7 = (int) (((float) i15) - (((float) (i15 - geofenceMetadata.f15027e)) * f));
            i5 = i9;
        } else {
            arrivalState = arrivalState2;
            i4 = i2;
            i5 = i9;
            i6 = i17;
            i7 = i15;
        }
        float f6 = 1.0f - (((float) i6) / ((float) navigationPath.f15069i));
        float f7 = 1.0f - (((float) i7) / ((float) (currentTimeMillis + i7)));
        float f8 = (float) i17;
        float f9 = f8 - f2;
        if (geofenceMetadata != null) {
            i8 = i7;
            f9 -= (f9 - (((float) geofenceMetadata.f15026d) - f2)) * f;
        } else {
            i8 = i7;
        }
        float f11 = f5 - f8;
        if (geofenceMetadata != null) {
            f11 += ((f5 - ((float) geofenceMetadata.f15026d)) - f11) * f;
        }
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        float f12 = f11 + f9;
        if (f12 != BitmapDescriptorFactory.HUE_RED) {
            f4 = 1.0f - (f9 / f12);
        } else {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        float f13 = ((float) i15) - f3;
        if (geofenceMetadata != null) {
            f13 -= (f13 - (((float) geofenceMetadata.f15027e) - f3)) * f;
        }
        float currentTimeMillis2 = 1.0f - (f13 / (((float) ((System.currentTimeMillis() - cVar2.f15318c) / 1000)) + f13));
        int i18 = geofenceMetadata2.f15032j;
        if (geofenceMetadata != null) {
            i18 = (int) (((float) i18) - (f * ((float) (i18 - geofenceMetadata.f15032j))));
        }
        int i19 = i18;
        try {
            NavigationProgressEvent navigationProgressEvent2 = new NavigationProgressEvent(this.f15098c.mo19639e0(), i5, this.f15099d.f15364c, navigationGeofence8.f15047c, arrivalState, f6, f7, i6, i4, i8, i16, (int) f9, f4, (int) f13, currentTimeMillis2, location, i19);
            return navigationProgressEvent2;
        } catch (Exception e3) {
            e = e3;
            navigationProgressEvent = null;
            C16596f a22 = C16596f.m42113a();
            StringBuilder k22 = C13555b.m33972k("Navigable Id: ");
            k22.append(this.f15098c.mo19639e0());
            a22.mo49363b(k22.toString());
            a22.mo49364c(new BadNavigableException(e));
            return navigationProgressEvent;
        }
    }

    /* renamed from: g */
    public final NavigationProgressEvent mo19710g(C4347c cVar, NavigationGeofence navigationGeofence, NavigationGeofence navigationGeofence2, NavigationGeofence navigationGeofence3, Location location) {
        boolean z;
        NavigationGeofence navigationGeofence4 = navigationGeofence;
        NavigationGeofence navigationGeofence5 = navigationGeofence2;
        NavigationGeofence navigationGeofence6 = navigationGeofence3;
        Location location2 = location;
        if (location2 == null || (navigationGeofence4 == null && navigationGeofence6 == null)) {
            return mo19709f(cVar, navigationGeofence2, (NavigationGeofence) null, (Location) null, navigationGeofence2);
        }
        if (navigationGeofence4 != null && navigationGeofence6 == null) {
            return mo19709f(cVar, navigationGeofence, navigationGeofence2, location, navigationGeofence2);
        }
        if (navigationGeofence4 == null) {
            return mo19709f(cVar, navigationGeofence2, navigationGeofence3, location, navigationGeofence2);
        }
        if (navigationGeofence5.f15051g.f15028f) {
            return mo19709f(cVar, navigationGeofence, navigationGeofence3, location, navigationGeofence2);
        }
        Location u = navigationGeofence4.f15046b.f40974b.mo46929u((Location) null);
        Location u2 = navigationGeofence5.f15046b.f40974b.mo46929u((Location) null);
        Location u3 = navigationGeofence6.f15046b.f40974b.mo46929u((Location) null);
        float distanceTo = u.distanceTo(u2);
        float distanceTo2 = u2.distanceTo(u3);
        float distanceTo3 = u.distanceTo(location2);
        float distanceTo4 = u2.distanceTo(location2);
        float distanceTo5 = u3.distanceTo(location2);
        double d = (double) distanceTo3;
        double d2 = (double) distanceTo4;
        double d3 = (double) distanceTo;
        int i = C20936e0.f52684d;
        double d4 = d2 * d2;
        double d5 = (double) distanceTo5;
        double d6 = (double) distanceTo2;
        if ((((d5 * d5) + d4) - (d6 * d6)) / ((d5 * 2.0d) * d2) < (((d * d) + d4) - (d3 * d3)) / ((d * 2.0d) * d2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo19709f(cVar, navigationGeofence2, navigationGeofence3, location, navigationGeofence2);
        }
        return mo19709f(cVar, navigationGeofence, navigationGeofence2, location, navigationGeofence2);
    }

    /* renamed from: j */
    public final void mo19711j(int i) {
        List<NavigationPath> list = this.f15098c.mo19644u0().get(i).f15055c;
        C4366l<T> lVar = this.f15099d;
        lVar.f15362a = i;
        lVar.f15363b.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f15099d.f15363b.add(new C4343a(i2, (NavigationGeofence) null, false, this.f15098c.mo19641j0()));
        }
        this.f15099d.f15364c = 0;
        if (i > 0) {
            C4226a aVar = (C4226a) this;
            Location h = aVar.f15082h.mo50014i();
            if (h == null) {
                h = aVar.mo19705b().f15055c.get(aVar.f15099d.f15364c).f15068h.f15035b.get(0).f15046b.f40974b.mo46929u((Location) null);
            }
            aVar.mo19699p(h);
        }
    }

    /* renamed from: k */
    public final void mo19712k(Location location) {
        NavigationGeofence navigationGeofence;
        NavigationGeofence navigationGeofence2;
        NavigationGeofence navigationGeofence3;
        C4347c e = mo19708e(this.f15099d.f15364c);
        NavigationGeofence navigationGeofence4 = e.f15317b;
        if (navigationGeofence4 != null) {
            GeofencePath c = mo19706c(e.f15316a);
            if (location != null) {
                c.getClass();
                int i = navigationGeofence4.f15050f;
                while (true) {
                    i--;
                    if (i < 0) {
                        navigationGeofence3 = null;
                        break;
                    }
                    navigationGeofence3 = c.f15035b.get(i);
                    if (!navigationGeofence3.f15051g.f15028f) {
                        break;
                    }
                }
                navigationGeofence = navigationGeofence3;
            } else {
                navigationGeofence = null;
            }
            if (location != null) {
                navigationGeofence2 = c.mo19625b(navigationGeofence4);
            } else {
                navigationGeofence2 = null;
            }
            NavigationProgressEvent g = mo19710g(e, navigationGeofence, navigationGeofence4, navigationGeofence2, location);
            if (g != null) {
                mo19713l(g);
            }
        }
    }

    /* renamed from: l */
    public final void mo19713l(NavigationProgressEvent navigationProgressEvent) {
        boolean z;
        int i;
        int i2;
        String str;
        NavigationProgressEvent navigationProgressEvent2 = this.f15101f;
        ArrivalState arrivalState = navigationProgressEvent.f15115f;
        if (navigationProgressEvent2 == null || navigationProgressEvent2.f15112c < navigationProgressEvent.f15112c || arrivalState.compareTo(navigationProgressEvent2.f15115f) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Navigable navigable = this.f15098c;
            ArrivalState arrivalState2 = navigationProgressEvent.f15115f;
            if (arrivalState2 != ArrivalState.TRAVELLING) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.NAVIGATION_PROGRESS_CHANGED);
                aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, navigable.mo19639e0());
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.NAVIGATION_PROGRESS_TYPE;
                int i3 = C17473a.f44988d[arrivalState2.ordinal()];
                if (i3 == 1) {
                    str = "navigation_travelling";
                } else if (i3 == 2) {
                    str = "navigation_arriving_soon";
                } else if (i3 == 3) {
                    str = "navigation_arrival_imminent";
                } else if (i3 == 4) {
                    str = "navigation_disembark";
                } else if (i3 != 5) {
                    str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
                } else {
                    str = "navigation_arrived";
                }
                aVar.mo49939g(analyticsAttributeKey, str);
                aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, mo19704a(navigationProgressEvent.f15112c));
                aVar.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, navigationProgressEvent.f15112c);
                aVar.mo49934b(AnalyticsAttributeKey.BATTERY_CONSUMPTION, C20975x0.m49120g(this));
                this.f15097b.mo19856f(aVar.mo49933a());
            }
        }
        if (navigationProgressEvent2 != null) {
            i = navigationProgressEvent2.f15112c;
        } else {
            i = -1;
        }
        int i4 = navigationProgressEvent.f15112c;
        if (i != i4) {
            Navigable navigable2 = this.f15098c;
            NavigationPath navigationPath = navigable2.mo19644u0().get(navigationProgressEvent.f15112c).f15055c.get(0);
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.NAVIGATION_LEG_ADVANCE);
            aVar2.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, navigable2.mo19639e0());
            aVar2.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, mo19704a(navigationProgressEvent.f15112c));
            aVar2.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, navigationProgressEvent.f15112c);
            aVar2.mo49934b(AnalyticsAttributeKey.BATTERY_CONSUMPTION, C20975x0.m49120g(this));
            aVar2.mo49935c(AnalyticsAttributeKey.TOTAL_STOPS_IN_STEP, navigationPath.f15065e.size());
            aVar2.mo49936d(AnalyticsAttributeKey.TOTAL_TIME_IN_STEP_MINUTES, TimeUnit.SECONDS.toMinutes((long) navigationPath.f15070j));
            this.f15097b.mo19856f(aVar2.mo49933a());
        }
        if (navigationProgressEvent2 != null) {
            i2 = navigationProgressEvent2.f15119j;
        } else {
            i2 = navigationProgressEvent.f15119j;
        }
        int i5 = navigationProgressEvent.f15119j;
        if (i == i4 && i2 != i5) {
            Navigable navigable3 = this.f15098c;
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.NAVIGATION_STATION_ADVANCE);
            aVar3.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, navigable3.mo19639e0());
            aVar3.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, navigationProgressEvent.f15112c);
            aVar3.mo49935c(AnalyticsAttributeKey.STOP_INDEX, navigationProgressEvent.f15121l);
            this.f15097b.mo19856f(aVar3.mo49933a());
        }
        this.f15101f = navigationProgressEvent;
        this.f15097b.mo19857g(navigationProgressEvent);
        long millis = TimeUnit.SECONDS.toMillis((long) navigationProgressEvent.f15127r) + this.f15098c.mo19642k0(navigationProgressEvent);
        C4351g gVar = this.f15097b;
        AlarmManager alarmManager = (AlarmManager) gVar.f15324a.getSystemService("alarm");
        alarmManager.cancel(gVar.f15338o);
        alarmManager.set(1, millis, gVar.f15338o);
        gVar.f15325b.mo19639e0();
        new Date(millis);
        ArrivalState arrivalState3 = navigationProgressEvent.f15115f;
        this.f15097b.f15326c.f15081d = navigationProgressEvent;
        List<NavigationLeg> u0 = this.f15098c.mo19644u0();
        ArrivalState arrivalState4 = ArrivalState.ARRIVED;
        if (arrivalState3 == arrivalState4 && navigationProgressEvent.f15112c == u0.size() - 1) {
            C4351g gVar2 = this.f15097b;
            gVar2.startService(NavigationService.m11309z(gVar2, this.f15098c.mo19639e0(), "arrive_to_dest"));
            return;
        }
        NavigationLeg.Type type = mo19705b().f15054b;
        if (arrivalState3 == arrivalState4 && type != NavigationLeg.Type.WAIT && this.f15099d.f15362a < u0.size() - 1) {
            mo19711j(this.f15099d.f15362a + 1);
        }
    }

    /* renamed from: m */
    public final void mo19714m(boolean z) {
        boolean z2;
        Location h;
        if (this.f15100e != z) {
            this.f15100e = z;
            if (z) {
                C4226a aVar = (C4226a) this;
                aVar.f15082h.mo50903a(aVar.f15083i);
                if (((MockLocationsMode) C13386a.f33223c.f43936b) != MockLocationsMode.NONE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((!z2 || ((C4343a) aVar.mo19708e(aVar.f15099d.f15364c)).f15317b != null) && (h = aVar.f15082h.mo50014i()) != null) {
                    aVar.mo19699p(h);
                    return;
                }
                return;
            }
            C4226a aVar2 = (C4226a) this;
            aVar2.f15082h.mo50904b(aVar2.f15083i);
        }
    }

    /* renamed from: n */
    public final void mo19715n(boolean z) {
        boolean z2;
        if (this.f15102g != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                this.f15102g = null;
                NavigationReturnEvent navigationReturnEvent = new NavigationReturnEvent(this.f15098c.mo19639e0(), this.f15099d.f15362a);
                this.f15097b.mo19857g(navigationReturnEvent);
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.NAVIGATION_PROGRESS_CHANGED);
                aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, this.f15098c.mo19639e0());
                aVar.mo49939g(AnalyticsAttributeKey.NAVIGATION_PROGRESS_TYPE, "navigation_return_to_path");
                aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, mo19704a(navigationReturnEvent.f15130c));
                aVar.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, navigationReturnEvent.f15130c);
                aVar.mo49934b(AnalyticsAttributeKey.BATTERY_CONSUMPTION, C20975x0.m49120g(this));
                this.f15097b.mo19856f(aVar.mo49933a());
                return;
            }
            NavigationDeviationEvent navigationDeviationEvent = new NavigationDeviationEvent(this.f15098c.mo19639e0(), this.f15099d.f15362a);
            this.f15097b.mo19857g(navigationDeviationEvent);
            this.f15102g = navigationDeviationEvent;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.NAVIGATION_PROGRESS_CHANGED);
            aVar2.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, this.f15098c.mo19639e0());
            aVar2.mo49939g(AnalyticsAttributeKey.NAVIGATION_PROGRESS_TYPE, "navigation_deviation");
            aVar2.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, mo19704a(navigationDeviationEvent.f15108c));
            aVar2.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, navigationDeviationEvent.f15108c);
            aVar2.mo49934b(AnalyticsAttributeKey.BATTERY_CONSUMPTION, C20975x0.m49120g(this));
            this.f15097b.mo19856f(aVar2.mo49933a());
        }
    }

    public final String toString() {
        return this.f15096a;
    }
}
