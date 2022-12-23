package p176n0;

import androidx.camera.core.SurfaceRequest;
import com.cubic.umo.pass.model.BillingAddress;
import com.cubic.umo.pass.model.CreditCard;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.usebutton.sdk.purchasepath.PurchasePath;
import com.usebutton.sdk.purchasepath.PurchasePathListener;
import p543hq.C17474b;
import p977zz.C20975x0;
import w90.C13222b;
import w90.C13226d;

/* renamed from: n0.g */
public final /* synthetic */ class C5788g implements SurfaceRequest.C0537g, PurchasePathListener, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ Object f18732b;

    /* renamed from: c */
    public final /* synthetic */ Object f18733c;

    /* renamed from: d */
    public final /* synthetic */ Object f18734d;

    public /* synthetic */ C5788g(Object obj, Object obj2, Object obj3) {
        this.f18732b = obj;
        this.f18733c = obj2;
        this.f18734d = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005b, code lost:
        r8 = androidx.camera.view.PreviewView.this;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21662a(androidx.camera.core.SurfaceRequest.C0536f r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f18732b
            androidx.camera.view.PreviewView$a r0 = (androidx.camera.view.PreviewView.C0651a) r0
            java.lang.Object r1 = r7.f18733c
            androidx.camera.core.impl.CameraInternal r1 = (androidx.camera.core.impl.CameraInternal) r1
            java.lang.Object r2 = r7.f18734d
            androidx.camera.core.SurfaceRequest r2 = (androidx.camera.core.SurfaceRequest) r2
            r0.getClass()
            java.util.Objects.toString(r8)
            java.lang.String r3 = "PreviewView"
            p054d0.C4289j0.m11435b(r3)
            x.z r1 = r1.getCameraInfoInternal()
            java.lang.Integer r1 = r1.getLensFacing()
            int r1 = r1.intValue()
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0029
            r1 = 1
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            androidx.camera.view.PreviewView r5 = androidx.camera.view.PreviewView.this
            androidx.camera.view.b r5 = r5.f2237d
            android.util.Size r2 = r2.f1841b
            r5.getClass()
            java.util.Objects.toString(r8)
            java.util.Objects.toString(r2)
            java.lang.String r6 = "PreviewTransform"
            p054d0.C4289j0.m11435b(r6)
            android.graphics.Rect r6 = r8.mo2363a()
            r5.f2259b = r6
            int r6 = r8.mo2364b()
            r5.f2260c = r6
            int r6 = r8.mo2365c()
            r5.f2261d = r6
            r5.f2258a = r2
            r5.f2262e = r1
            int r8 = r8.mo2365c()
            r1 = -1
            if (r8 == r1) goto L_0x0069
            androidx.camera.view.PreviewView r8 = androidx.camera.view.PreviewView.this
            androidx.camera.view.c r1 = r8.f2236c
            if (r1 == 0) goto L_0x0066
            boolean r1 = r1 instanceof androidx.camera.view.C0660d
            if (r1 == 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r8.f2238e = r3
            goto L_0x006d
        L_0x0069:
            androidx.camera.view.PreviewView r8 = androidx.camera.view.PreviewView.this
            r8.f2238e = r4
        L_0x006d:
            androidx.camera.view.PreviewView r8 = androidx.camera.view.PreviewView.this
            r8.mo2612b()
            androidx.camera.view.PreviewView r8 = androidx.camera.view.PreviewView.this
            r8.mo2611a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p176n0.C5788g.mo21662a(androidx.camera.core.SurfaceRequest$f):void");
    }

    public final void onComplete(PurchasePath purchasePath, Throwable th) {
        boolean z;
        MoovitActivity moovitActivity = (MoovitActivity) this.f18732b;
        String str = (String) this.f18734d;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.RESPONSE);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "uber");
        aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, ((TaxiProvider) this.f18733c).f39968c);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.SUCCESS;
        if (purchasePath != null) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo49941i(analyticsAttributeKey, z);
        aVar.mo49941i(AnalyticsAttributeKey.TAXI_APP_INSTALLED, C20975x0.m49121h(moovitActivity, "com.ubercab"));
        aVar.mo49945m(AnalyticsAttributeKey.ITINERARY_GUID, str);
        moovitActivity.mo44545v2(aVar.mo49933a());
        if (purchasePath != null) {
            purchasePath.start(moovitActivity);
        }
    }

    public final Task then(Object obj) {
        C13222b bVar = (C13222b) this.f18732b;
        Boolean bool = (Boolean) obj;
        C13222b bVar2 = C13222b.f32795d;
        bVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        bVar.f32798c.mo11667c((CreditCard) this.f18733c, (BillingAddress) this.f18734d, new C13226d(taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
