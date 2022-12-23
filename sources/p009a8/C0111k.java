package p009a8;

import android.util.JsonReader;
import c00.C13719c;
import c00.C13733n;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.drm.C3915c;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.moovit.MoovitExecutors;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.C7841a;
import com.moovit.transit.TransitType;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.surveys.MVSurveyType;
import h90.C12739a;
import j80.C12773b;
import j80.C12778f;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import m50.C18331g;
import m80.C12887v;
import o50.C18717b;
import p066e0.C4454r0;
import p115i0.C5227c;
import p404ce.C13791f;
import p404ce.C13792g;
import p404ce.C13806s;
import p595jw.C17948a;
import p601ke.C18028a;
import p798sn.C19493a;
import p977zz.C20949l;
import q60.C19088b;
import s80.C13070g;
import s90.C13076d;

/* renamed from: a8.k */
public final /* synthetic */ class C0111k implements FeatureManager.C2369a, C3915c.C3917b, C13792g, C18028a.C18029a, SuccessContinuation, C20949l, C13733n, C13791f {

    /* renamed from: b */
    public final /* synthetic */ int f326b;

    public /* synthetic */ C0111k(int i) {
        this.f326b = i;
    }

    /* renamed from: a */
    public List mo243a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public Object convert(Object obj) {
        switch (this.f326b) {
            case 0:
                return ((SearchLocationItem) obj).f39457b.mo19751c();
            case 1:
                return C17948a.m44574a((MVSurveyType) obj);
            case 2:
                return obj;
            case 3:
                C13719c cVar = C7841a.f23766a;
                return MVRouteType.findByValue(((TransitType) obj).f23757b.f15142b);
            case 4:
                return ((MarkerZoomStyle) obj).f42448b;
            case 5:
                return Boolean.valueOf(((C18331g) obj).mo50785m2());
            default:
                return C13070g.m33009a((C19493a) obj);
        }
    }

    /* renamed from: f */
    public Object mo245f(JsonReader jsonReader) {
        return C18028a.m44702b(jsonReader);
    }

    /* renamed from: i */
    public void mo246i(boolean z) {
        C0115o oVar = C0115o.f331a;
        if (z && C0098d0.m169b()) {
            FeatureManager featureManager = FeatureManager.f8588a;
            FeatureManager.m6255a(new C4454r0(2), FeatureManager.Feature.CrashReport);
            FeatureManager.m6255a(new C5227c(3), FeatureManager.Feature.ErrorReport);
            FeatureManager.m6255a(new C0112l(2), FeatureManager.Feature.AnrReport);
        }
    }

    public boolean invoke(Object obj) {
        int i = C19088b.f48519z;
        ((C19088b.C19091c) obj).mo51523i0();
        return true;
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        switch (this.f326b) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(sVar);
            default:
                return FirebasePerfRegistrar.providesFirebasePerformance(sVar);
        }
    }

    public void release() {
    }

    public Task then(Object obj) {
        List<C12739a> list = null;
        switch (this.f326b) {
            case 5:
                String str = (String) obj;
                int i = C18717b.f47627u;
                return Tasks.forResult(null);
            case 7:
                C12773b bVar = (C12773b) obj;
                int i2 = C12778f.f31585g;
                if (bVar == null) {
                    return Tasks.forException(new ApplicationBugException("lineGroupServiceAlerts must not be null"));
                }
                return Tasks.call(MoovitExecutors.COMPUTATION, new C12778f.C12784f(bVar));
            default:
                C13076d dVar = (C13076d) obj;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                if (dVar != null) {
                    list = dVar.f32349d;
                }
                if (list != null) {
                    return Tasks.forResult(list);
                }
                return Tasks.forException(new ApplicationBugException("Couldn't load stored values"));
        }
    }
}
