package com.moovit.app.appwidgets;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.home.dashboard.FavoriteLocationEditorActivity;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.network.model.ServerId;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;
import p067e1.C4503l0;
import p130j2.C5367a;
import p172m9.C5720b;
import p269u2.C6677a;
import p424cr.C16473a;
import p455dy.C16753e;
import p543hq.C17474b;
import p543hq.C17476c;
import p567iq.C17635b;
import p646lz.C18299a;
import p646lz.C18304b;

public class FavoritesWidget extends MoovitWidget {

    /* renamed from: b */
    public static final ThreadPoolExecutor f37592b = C5720b.m14033A(1, "FavoritesWidget");

    /* renamed from: c */
    public static final C14773a f37593c = new C14773a();

    /* renamed from: d */
    public static final C14774b f37594d = new C14774b();

    /* renamed from: e */
    public static final C14775c f37595e = new C14775c();

    /* renamed from: f */
    public static final C14776d f37596f = new C14776d();

    /* renamed from: g */
    public static final C14777e f37597g = new C14777e();

    /* renamed from: com.moovit.app.appwidgets.FavoritesWidget$a */
    public class C14773a implements C16753e.C16755b {
        /* renamed from: q */
        public final void mo44782q() {
            FavoritesWidget.m37150e();
        }

        /* renamed from: v0 */
        public final void mo44783v0() {
            FavoritesWidget.m37150e();
        }
    }

    /* renamed from: com.moovit.app.appwidgets.FavoritesWidget$b */
    public class C14774b implements C16753e.C16757d {
        /* renamed from: C */
        public final void mo44784C() {
            FavoritesWidget.m37150e();
        }

        /* renamed from: f */
        public final void mo44785f() {
            FavoritesWidget.m37150e();
        }
    }

    /* renamed from: com.moovit.app.appwidgets.FavoritesWidget$c */
    public class C14775c implements C16753e.C16756c {
        /* renamed from: h */
        public final void mo44786h(C16753e eVar, LocationFavorite locationFavorite) {
        }

        /* renamed from: k */
        public final void mo44787k(C16753e eVar, LocationFavorite locationFavorite) {
            FavoritesWidget.m37150e();
        }

        /* renamed from: s */
        public final void mo44788s(C16753e eVar, LocationFavorite locationFavorite) {
        }

        /* renamed from: t1 */
        public final void mo44789t1(C16753e eVar, LocationFavorite locationFavorite) {
            FavoritesWidget.m37150e();
        }

        /* renamed from: y0 */
        public final void mo44790y0(C16753e eVar, LocationFavorite locationFavorite) {
        }
    }

    /* renamed from: com.moovit.app.appwidgets.FavoritesWidget$d */
    public class C14776d extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.moovit.useraccount.user_connect_success")) {
                FavoritesWidget.m37150e();
            }
        }
    }

    /* renamed from: com.moovit.app.appwidgets.FavoritesWidget$e */
    public class C14777e implements C18304b {
        /* renamed from: d */
        public final void mo44553d(Object obj, String str) {
        }

        /* renamed from: g */
        public final void mo44554g(Object obj, String str) {
            if ("USER_ACCOUNT".equals(str)) {
                C16753e d = ((UserAccountManager) obj).mo46573d();
                C14773a aVar = FavoritesWidget.f37593c;
                d.mo49444s(aVar);
                C14774b bVar = FavoritesWidget.f37594d;
                d.mo49448w(bVar);
                C14775c cVar = FavoritesWidget.f37595e;
                d.mo49446u(cVar);
                MoovitAppApplication x = MoovitAppApplication.m37038x();
                C14776d dVar = FavoritesWidget.f37596f;
                C5367a.m13473a(x).mo21148d(dVar);
                UserAccountManager.m39860h(MoovitAppApplication.m37038x(), dVar, Arrays.asList(new String[]{"com.moovit.useraccount.user_connect_success", "com.moovit.useraccount.user_connect_failure"}));
                d.mo49432f(aVar);
                d.mo49436j(bVar);
                d.mo49434h(cVar);
            }
        }
    }

    /* renamed from: e */
    public static void m37150e() {
        MoovitAppApplication x = MoovitAppApplication.m37038x();
        int[] q = C5720b.m14066q(x, FavoritesWidget.class);
        if (q != null && q.length != 0) {
            Intent intent = new Intent(x, FavoritesWidget.class);
            intent.setAction("com.moovit.appwidgets.INTERNAL_REFRESH_FAVORITES");
            x.sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    public final SharedPreferences mo44775a(Context context) {
        return context.getSharedPreferences("favorites_widget", 0);
    }

    /* renamed from: b */
    public final AnalyticsEventKey mo44776b() {
        return AnalyticsEventKey.FAVORITES_WIDGET_INSTALLED;
    }

    /* renamed from: c */
    public final AnalyticsEventKey mo44777c() {
        return AnalyticsEventKey.FAVORITES_WIDGET_UNINSTALLED;
    }

    /* renamed from: d */
    public final void mo44778d() {
        C18299a aVar = MoovitAppApplication.m37038x().f37321e;
        C14777e eVar = f37597g;
        synchronized (aVar) {
            aVar.f46672k.remove(eVar);
        }
        C18299a aVar2 = MoovitAppApplication.m37038x().f37321e;
        synchronized (aVar2) {
            aVar2.f46672k.add(eVar);
        }
    }

    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        Intent intent = new Intent();
        intent.putExtra("appWidgetIds", C5720b.m14066q(context, getClass()));
        intent.putExtra("appWidgetId", i);
        f37592b.execute(new C16473a(context, intent, goAsync()));
    }

    public final void onReceive(Context context, Intent intent) {
        C17474b bVar;
        String action = intent.getAction();
        int[] q = C5720b.m14066q(context, getClass());
        if (action != null) {
            if (action.equals("com.sec.android.widgetapp.APPWIDGET_RESIZE")) {
                super.onReceive(context, intent);
                int intExtra = intent.getIntExtra("widgetId", 0);
                Intent intent2 = new Intent();
                intent2.putExtra("appWidgetIds", q);
                intent2.putExtra("appWidgetId", intExtra);
                f37592b.execute(new C16473a(context, intent2, goAsync()));
                return;
            } else if (action.contains("android.")) {
                super.onReceive(context, intent);
                return;
            } else {
                C4503l0 l0Var = new C4503l0(context);
                if (action.equals("com.moovit.appwidgets.NEXT_STOP") || action.equals("com.moovit.appwidgets.PREV_STOP")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_SWITCH_STATIONS).mo49933a();
                } else {
                    bVar = null;
                }
                if (action.equals("com.moovit.appwidgets.REFRESH_FAVORITES")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_REFRESH).mo49933a();
                }
                if (action.equals("com.moovit.appwidgets.HEADER_CLICKED")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_HEADER_TAPPED).mo49933a();
                    l0Var.mo20022b(new Intent(context, C17635b.m43779f(context).f50171a.f50150a));
                }
                if (action.equals("com.moovit.appwidgets.EDIT_HOME")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_EDIT_HOME).mo49933a();
                    l0Var.mo20022b(FavoriteLocationEditorActivity.m37664C2(context));
                }
                if (action.equals("com.moovit.appwidgets.EDIT_WORK")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_EDIT_WORK).mo49933a();
                    l0Var.mo20022b(FavoriteLocationEditorActivity.m37665D2(context));
                }
                if (action.equals("com.moovit.appwidgets.TP_HOME")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_TP_HOME).mo49933a();
                    TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
                    dVar.f23791b = (LocationDescriptor) intent.getParcelableExtra(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
                    l0Var.mo20022b(SuggestRoutesActivity.m39325M2(context, dVar.mo23958a(), true));
                }
                if (action.equals("com.moovit.appwidgets.TP_WORK")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_TP_WORK).mo49933a();
                    TripPlanParams.C7626d dVar2 = new TripPlanParams.C7626d();
                    dVar2.f23791b = (LocationDescriptor) intent.getParcelableExtra(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
                    l0Var.mo20022b(SuggestRoutesActivity.m39325M2(context, dVar2.mo23958a(), true));
                }
                if (action.equals("com.moovit.appwidgets.LINE_CLICKED")) {
                    ServerId serverId = (ServerId) intent.getParcelableExtra("line_group_id");
                    ServerId serverId2 = (ServerId) intent.getParcelableExtra("line_id");
                    ServerId serverId3 = (ServerId) intent.getParcelableExtra("stop_id");
                    if (serverId != null) {
                        bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_LINE_TAPPED).mo49933a();
                        l0Var.mo20022b(new Intent(context, C17635b.m43779f(context).f50171a.f50150a));
                        l0Var.mo20022b(LineDetailActivity.m38386y2(context, serverId, serverId2, serverId3, (Time) null));
                    }
                }
                if (action.equals("com.moovit.appwidgets.OPEN_DASHBOARD")) {
                    bVar = new C17474b.C17475a(AnalyticsEventKey.FAVORITES_WIDGET_OPEN_DASHBOARD).mo49933a();
                    l0Var.mo20022b(HomeActivity.m37644y2(context, (Uri) null, (HomeTab) null, 0));
                }
                if (bVar != null) {
                    C6677a.m15759j(context, ((C17476c) C17635b.m43779f(context).f50173c.f20758b).mo49947a(getClass()), false, bVar);
                }
                if (l0Var.f15585b.size() > 0) {
                    l0Var.mo20024e();
                    return;
                }
            }
        }
        Intent intent3 = new Intent(intent);
        intent3.putExtra("appWidgetIds", q);
        f37592b.execute(new C16473a(context, intent3, goAsync()));
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        C6677a.m15759j(context, ((C17476c) C17635b.m43779f(context).f50173c.f20758b).mo49947a(getClass()), false, new C17474b(AnalyticsEventKey.FAVORITES_WIDGET_AUTO_REFRESH));
        Intent intent = new Intent();
        intent.putExtra("appWidgetIds", iArr);
        f37592b.execute(new C16473a(context, intent, goAsync()));
    }
}
