package com.veriff.sdk.views.camera;

import bf0.C21050d;
import com.veriff.sdk.views.C22932d;
import com.veriff.sdk.views.ScreenRunner;
import kotlin.Metadata;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/FlowStatusBar;", "", "", "flowColor", "Ljava/lang/Integer;", "Lcom/veriff/sdk/views/ScreenRunner$Listener;", "flowListener", "Lcom/veriff/sdk/views/ScreenRunner$Listener;", "getFlowListener", "()Lcom/veriff/sdk/views/ScreenRunner$Listener;", "overlayListener", "getOverlayListener", "", "overlayShown", "Z", "Lkotlin/Function1;", "Lbf0/d;", "setColorFn", "<init>", "(Llf0/l;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.w */
public final class C22926w {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f58215a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Integer f58216b;

    /* renamed from: c */
    private final ScreenRunner.C22806a f58217c;

    /* renamed from: d */
    private final ScreenRunner.C22806a f58218d;

    public C22926w(C24236l<? super Integer, C21050d> lVar) {
        C24362h.m61211f(lVar, "setColorFn");
        this.f58217c = new C22928b(this, lVar);
        this.f58218d = new C22927a(this, lVar);
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo59060d2 = {"com/veriff/sdk/views/camera/FlowStatusBar$overlayListener$1", "Lcom/veriff/sdk/views/ScreenRunner$Listener;", "Lbf0/d;", "onClear", "Lcom/veriff/sdk/views/Screen;", "screen", "onShow", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.w$b */
    public static final class C22928b implements ScreenRunner.C22806a {

        /* renamed from: a */
        public final /* synthetic */ C22926w f58221a;

        /* renamed from: b */
        public final /* synthetic */ C24236l f58222b;

        public C22928b(C22926w wVar, C24236l lVar) {
            this.f58221a = wVar;
            this.f58222b = lVar;
        }

        /* renamed from: a */
        public void mo57563a(C22932d dVar) {
            C24362h.m61211f(dVar, "screen");
            this.f58221a.f58215a = true;
            this.f58222b.invoke(dVar.getStatusBarColor());
        }

        /* renamed from: a */
        public void mo57562a() {
            this.f58221a.f58215a = false;
            this.f58222b.invoke(this.f58221a.f58216b);
        }
    }

    /* renamed from: b */
    public final ScreenRunner.C22806a mo57810b() {
        return this.f58218d;
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo59060d2 = {"com/veriff/sdk/views/camera/FlowStatusBar$flowListener$1", "Lcom/veriff/sdk/views/ScreenRunner$Listener;", "Lbf0/d;", "onClear", "Lcom/veriff/sdk/views/Screen;", "screen", "onShow", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.camera.w$a */
    public static final class C22927a implements ScreenRunner.C22806a {

        /* renamed from: a */
        public final /* synthetic */ C22926w f58219a;

        /* renamed from: b */
        public final /* synthetic */ C24236l f58220b;

        public C22927a(C22926w wVar, C24236l lVar) {
            this.f58219a = wVar;
            this.f58220b = lVar;
        }

        /* renamed from: a */
        public void mo57563a(C22932d dVar) {
            C24362h.m61211f(dVar, "screen");
            this.f58219a.f58216b = dVar.getStatusBarColor();
            if (!this.f58219a.f58215a) {
                this.f58220b.invoke(this.f58219a.f58216b);
            }
        }

        /* renamed from: a */
        public void mo57562a() {
            this.f58219a.f58216b = null;
            if (!this.f58219a.f58215a) {
                this.f58220b.invoke(this.f58219a.f58216b);
            }
        }
    }

    /* renamed from: a */
    public final ScreenRunner.C22806a mo57809a() {
        return this.f58217c;
    }
}
