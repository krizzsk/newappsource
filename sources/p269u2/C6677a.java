package p269u2;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import c00.C13717b;
import com.bumptech.glide.load.EncodeStrategy;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.geo.LatLonE6;
import ig0.C23598d;
import java.io.File;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kj0.C23811f;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import og0.C24592g;
import p025b6.C1492e;
import p025b6.C1494g;
import p060d6.C4397l;
import p072e6.C4566d;
import p146k6.C5498d;
import p526gx.C17252e;
import p526gx.C17254g;
import p543hq.C17474b;
import p543hq.C17479f;
import p824tp.C19731i;
import p968zq.C20884b;
import p988j$.util.DesugarCollections;
import ug0.C25066c;
import zf0.C25432c;
import zf0.C25449j;

/* renamed from: u2.a */
public final class C6677a implements C6684e, C1494g, C23811f {

    /* renamed from: b */
    public Object f20758b;

    /* renamed from: c */
    public Object f20759c;

    public /* synthetic */ C6677a(Object obj, Object obj2) {
        this.f20758b = obj;
        this.f20759c = obj2;
    }

    /* renamed from: d */
    public static boolean m15758d(Geofence geofence, Location location) {
        double d;
        Geofence geofence2 = geofence;
        if (location.hasAccuracy()) {
            d = (double) location.getAccuracy();
        } else {
            d = 5.0d;
        }
        LatLonE6 latLonE6 = geofence2.f40974b;
        double abs = Math.abs(location.getLatitude() - latLonE6.mo46922k());
        double cos = ((Math.cos((location.getLatitude() * 3.141592653589793d) / 180.0d) * Math.abs(location.getLongitude() - latLonE6.mo46926o())) * 4.0075017E7d) / 360.0d;
        double d2 = (d * 2.0d) + ((double) geofence2.f40975c);
        if ((abs * 4.0075017E7d) / 360.0d > d2 || cos > d2 || ((double) latLonE6.mo46918d(location)) > d2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static void m15759j(Context context, AnalyticsFlowKey analyticsFlowKey, boolean z, C17474b... bVarArr) {
        List asList = Arrays.asList(bVarArr);
        if (!asList.isEmpty()) {
            asList.size();
            analyticsFlowKey.name();
            C13717b.m34269p(asList);
            C17479f fVar = new C17479f(context, analyticsFlowKey);
            synchronized (fVar) {
                fVar.f45008e.addAll(asList);
            }
            C19731i.m47197a(context).f50172b.mo42913b(fVar, z);
        }
    }

    /* renamed from: a */
    public final boolean mo5645a() {
        return false;
    }

    /* renamed from: b */
    public final void mo22847b(Context context, AnalyticsFlowKey analyticsFlowKey, boolean z) {
        C17479f fVar = (C17479f) ((Map) this.f20759c).remove(analyticsFlowKey);
        if (fVar == null) {
            analyticsFlowKey.name();
            return;
        }
        analyticsFlowKey.name();
        C19731i.m47197a(context).f50172b.mo42913b(fVar, z);
    }

    /* renamed from: c */
    public final void mo22145c(C6683d dVar) {
        long j;
        Object[] objArr = (Object[]) this.f20759c;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    dVar.bindNull(i);
                } else if (obj instanceof byte[]) {
                    dVar.bindBlob(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dVar.bindDouble(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    dVar.bindDouble(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dVar.bindLong(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    dVar.bindLong(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    dVar.bindLong(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dVar.bindLong(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    dVar.bindString(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    dVar.bindLong(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    /* renamed from: e */
    public final String mo22147e() {
        return (String) this.f20758b;
    }

    /* renamed from: f */
    public final C25432c mo22848f(C24592g gVar) {
        MemberScope memberScope;
        C25449j jVar;
        C25066c f = gVar.mo59474f();
        if (f != null) {
            gVar.mo59472P();
            if (LightClassOriginKind.SOURCE == null) {
                ((C23598d.C23599a) ((C23598d) this.f20759c)).getClass();
                return null;
            }
        }
        C23912a o = gVar.mo59480o();
        if (o != null) {
            C25432c f2 = mo22848f(o);
            if (f2 == null) {
                memberScope = null;
            } else {
                memberScope = f2.mo53405X();
            }
            if (memberScope == null) {
                jVar = null;
            } else {
                jVar = memberScope.mo58433g(gVar.getName(), NoLookupLocation.FROM_JAVA_LOADER);
            }
            if (jVar instanceof C25432c) {
                return (C25432c) jVar;
            }
            return null;
        } else if (f == null) {
            return null;
        } else {
            C25066c e = f.mo61583e();
            C24362h.m61210e(e, "fqName.parent()");
            LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) C23825c.m58515l0(((LazyJavaPackageFragmentProvider) this.f20758b).mo53522b(e));
            if (lazyJavaPackageFragment == null) {
                return null;
            }
            LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.f60668k.f60625d;
            lazyJavaPackageScope.getClass();
            return lazyJavaPackageScope.mo59548v(gVar.getName(), gVar);
        }
    }

    /* renamed from: g */
    public final void mo22849g(Context context, AnalyticsFlowKey analyticsFlowKey) {
        ((Map) this.f20759c).put(analyticsFlowKey, new C17479f(context, analyticsFlowKey));
        analyticsFlowKey.name();
    }

    public final int getLength() {
        return 0;
    }

    public final Class getType() {
        return (Class) this.f20759c;
    }

    public final Object getValue() {
        return this.f20758b;
    }

    /* renamed from: h */
    public final void mo22850h(AnalyticsFlowKey analyticsFlowKey, C17474b bVar) {
        C17479f fVar = (C17479f) ((Map) this.f20759c).get(analyticsFlowKey);
        if (fVar == null) {
            analyticsFlowKey.name();
            return;
        }
        analyticsFlowKey.name();
        synchronized (fVar) {
            fVar.f45008e.add(bVar);
        }
    }

    /* renamed from: i */
    public final EncodeStrategy mo5852i(C1492e eVar) {
        return ((C1494g) this.f20759c).mo5852i(eVar);
    }

    /* renamed from: n */
    public final boolean mo979n(Object obj, File file, C1492e eVar) {
        return ((C1494g) this.f20759c).mo979n(new C5498d(((BitmapDrawable) ((C4397l) obj).get()).getBitmap(), (C4566d) this.f20758b), file, eVar);
    }

    public final void setValue(Object obj) {
        this.f20758b = obj;
    }

    public /* synthetic */ C6677a(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider) {
        C23598d.C23599a aVar = C23598d.f59677a;
        this.f20758b = lazyJavaPackageFragmentProvider;
        this.f20759c = aVar;
    }

    public /* synthetic */ C6677a(C17252e eVar) {
        this.f20758b = eVar;
        this.f20759c = new C17254g();
    }

    public /* synthetic */ C6677a(Class cls) {
        this.f20759c = cls;
    }

    public /* synthetic */ C6677a(C20884b bVar) {
        this.f20758b = bVar;
        this.f20759c = DesugarCollections.synchronizedMap(new EnumMap(AnalyticsFlowKey.class));
    }
}
