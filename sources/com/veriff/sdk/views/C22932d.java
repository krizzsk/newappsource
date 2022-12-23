package com.veriff.sdk.views;

import android.view.View;
import com.veriff.sdk.internal.C21783is;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H\u0017J\b\u0010\u0005\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0002H\u0017J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\b\u0010\b\u001a\u00020\u0002H\u0017J\b\u0010\n\u001a\u00020\tH\u0017R\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8WX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/views/Screen;", "", "Lbf0/d;", "create", "start", "resume", "pause", "stop", "destroy", "", "onBackButtonPressed", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "", "getStatusBarColor", "()Ljava/lang/Integer;", "statusBarColor", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "page", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.d */
public interface C22932d {

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.views.d$a */
    public static final class C22933a {
        /* renamed from: a */
        public static Integer m56591a(C22932d dVar) {
            return null;
        }

        /* renamed from: b */
        public static void m56592b(C22932d dVar) {
        }

        /* renamed from: c */
        public static void m56593c(C22932d dVar) {
        }

        /* renamed from: d */
        public static void m56594d(C22932d dVar) {
        }

        /* renamed from: e */
        public static void m56595e(C22932d dVar) {
        }

        /* renamed from: f */
        public static void m56596f(C22932d dVar) {
        }

        /* renamed from: g */
        public static void m56597g(C22932d dVar) {
        }

        /* renamed from: h */
        public static boolean m56598h(C22932d dVar) {
            return false;
        }
    }

    void create();

    void destroy();

    /* renamed from: f */
    boolean mo56147f();

    C21783is getPage();

    Integer getStatusBarColor();

    View getView();

    void pause();

    void resume();

    void start();

    void stop();
}
