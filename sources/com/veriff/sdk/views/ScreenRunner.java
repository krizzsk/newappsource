package com.veriff.sdk.views;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.veriff.sdk.views.C22932d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002()B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0005\u001a\u00020\u0003H\u0017J\b\u0010\u0006\u001a\u00020\u0003H\u0017J\b\u0010\u0007\u001a\u00020\u0003H\u0017J\b\u0010\b\u001a\u00020\u0003H\u0017J\b\u0010\t\u001a\u00020\u0003H\u0017J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u0003H\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0001H\u0007R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006*"}, mo59060d2 = {"Lcom/veriff/sdk/views/ScreenRunner;", "Lcom/veriff/sdk/views/Screen;", "Landroidx/lifecycle/o;", "Lbf0/d;", "create", "start", "resume", "pause", "stop", "destroy", "Lcom/veriff/sdk/views/ScreenRunner$Listener;", "listener", "addListener", "clearScreen", "", "onBackButtonPressed", "screen", "showScreen", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/view/ViewGroup;", "container", "Landroid/view/ViewGroup;", "currentScreen", "Lcom/veriff/sdk/views/Screen;", "Lcom/veriff/sdk/views/ScreenRunner$ScreenState;", "currentState", "Lcom/veriff/sdk/views/ScreenRunner$ScreenState;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "page", "<init>", "(Landroid/view/ViewGroup;)V", "Listener", "ScreenState", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class ScreenRunner implements C1031o, C22932d {

    /* renamed from: a */
    private C22807b f57869a = C22807b.DESTROYED;

    /* renamed from: b */
    private C22932d f57870b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<C22806a> f57871c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private final View f57872d;

    /* renamed from: e */
    private final ViewGroup f57873e;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/ScreenRunner$Listener;", "", "Lbf0/d;", "onClear", "Lcom/veriff/sdk/views/Screen;", "screen", "onShow", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.ScreenRunner$a */
    public interface C22806a {
        /* renamed from: a */
        void mo57562a();

        /* renamed from: a */
        void mo57563a(C22932d dVar);
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/ScreenRunner$ScreenState;", "", "(Ljava/lang/String;I)V", "DESTROYED", "CREATED", "STARTED", "RESUMED", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.ScreenRunner$b */
    public enum C22807b {
        DESTROYED,
        CREATED,
        STARTED,
        RESUMED
    }

    public ScreenRunner(ViewGroup viewGroup) {
        C24362h.m61211f(viewGroup, "container");
        this.f57873e = viewGroup;
        this.f57872d = viewGroup;
    }

    /* renamed from: a */
    public final void mo57561a(C22932d dVar) {
        C24362h.m61211f(dVar, "screen");
        mo57559a();
        this.f57873e.addView(dVar.getView());
        dVar.create();
        this.f57873e.setVisibility(0);
        C22807b bVar = this.f57869a;
        C22807b bVar2 = C22807b.RESUMED;
        if (bVar == bVar2 || bVar == C22807b.STARTED) {
            dVar.start();
            if (this.f57869a == bVar2) {
                dVar.resume();
            }
        } else {
            this.f57869a = C22807b.CREATED;
        }
        this.f57870b = dVar;
        for (C22806a a : this.f57871c) {
            a.mo57563a(dVar);
        }
    }

    @C1045x(Lifecycle.Event.ON_CREATE)
    public void create() {
        this.f57869a = C22807b.CREATED;
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            dVar.create();
        }
    }

    @C1045x(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f57869a = C22807b.DESTROYED;
    }

    /* renamed from: f */
    public boolean mo56147f() {
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            return dVar.mo56147f();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getPage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.internal.C21783is getPage() {
        /*
            r1 = this;
            com.veriff.sdk.views.d r0 = r1.f57870b
            if (r0 == 0) goto L_0x000b
            com.veriff.sdk.internal.is r0 = r0.getPage()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            com.veriff.sdk.internal.is r0 = com.veriff.sdk.internal.C21783is.unknown
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.views.ScreenRunner.getPage():com.veriff.sdk.internal.is");
    }

    public Integer getStatusBarColor() {
        return C22932d.C22933a.m56591a(this);
    }

    public View getView() {
        return this.f57872d;
    }

    @C1045x(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            dVar.pause();
        }
        this.f57869a = C22807b.STARTED;
    }

    @C1045x(Lifecycle.Event.ON_RESUME)
    public void resume() {
        this.f57869a = C22807b.RESUMED;
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            dVar.resume();
        }
    }

    @C1045x(Lifecycle.Event.ON_START)
    public void start() {
        this.f57869a = C22807b.STARTED;
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            dVar.start();
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public void stop() {
        this.f57869a = C22807b.CREATED;
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            dVar.stop();
        }
    }

    /* renamed from: a */
    public final void mo57559a() {
        C22932d dVar = this.f57870b;
        if (dVar != null) {
            int i = C22939f.f58241a[this.f57869a.ordinal()];
            if (i == 1) {
                dVar.pause();
                dVar.stop();
                dVar.destroy();
            } else if (i == 2) {
                dVar.stop();
                dVar.destroy();
            } else if (i == 3) {
                dVar.destroy();
            }
        }
        this.f57873e.removeAllViews();
        this.f57873e.setVisibility(8);
        this.f57870b = null;
        for (C22806a a : this.f57871c) {
            a.mo57562a();
        }
    }

    /* renamed from: a */
    public final void mo57560a(C22806a aVar) {
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f57871c.add(aVar);
    }
}
