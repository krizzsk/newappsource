package p424cr;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import c00.C13717b;
import c00.C13733n;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.appwidgets.FavoritesWidget;
import com.moovit.app.appwidgets.FavoritesWidgetRemoteService;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LineFavorite;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.events.Events;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p389bl.C13641g;
import p455dy.C16753e;
import p810sz.C19576b;
import p810sz.C19600l;
import p834tz.C19804c;
import p952yy.C20787c;
import p977zz.C20927a0;
import p977zz.C20943i;
import p977zz.C20964s0;

/* renamed from: cr.a */
public final class C16473a implements Runnable {

    /* renamed from: b */
    public final Context f43066b;

    /* renamed from: c */
    public final Intent f43067c;

    /* renamed from: d */
    public final BroadcastReceiver.PendingResult f43068d;

    /* renamed from: cr.a$a */
    public class C16474a implements C13733n<C20787c, ServerId> {
        public final Object convert(Object obj) throws Exception {
            return ((C20787c) obj).f52456a;
        }
    }

    public C16473a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f43066b = context;
        this.f43067c = intent;
        C21100e.m49373x(pendingResult, "result");
        this.f43068d = pendingResult;
    }

    /* renamed from: a */
    public static Object m41963a(String str) {
        Object h = MoovitAppApplication.m37038x().f37321e.mo50695h(str, false);
        if (h != null) {
            return h;
        }
        throw new IllegalStateException(C25541a.m63881k("Unable to load: ", str));
    }

    /* renamed from: b */
    public final void mo49288b(RemoteViews remoteViews) {
        C16753e d = ((UserAccountManager) m41963a("USER_ACCOUNT")).mo46573d();
        LocationFavorite locationFavorite = d.f43620d;
        LocationFavorite locationFavorite2 = d.f43621e;
        if (locationFavorite != null) {
            String str = locationFavorite.f40599c;
            if (!C20964s0.m49090h(str)) {
                remoteViews.setTextViewText(R.id.favorite_widget_home, str);
            } else {
                remoteViews.setTextViewText(R.id.favorite_widget_home, this.f43066b.getResources().getText(R.string.dashboard_favorites_home));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (LocationDescriptor) locationFavorite.f52687b);
            remoteViews.setOnClickPendingIntent(R.id.favorite_widget_home, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.TP_HOME", bundle, Uri.fromParts("navigate", "home", ((LocationDescriptor) locationFavorite.f52687b).toString())));
        } else {
            remoteViews.setTextViewText(R.id.favorite_widget_home, this.f43066b.getResources().getText(R.string.dashboard_favorites_home));
            remoteViews.setOnClickPendingIntent(R.id.favorite_widget_home, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.EDIT_HOME", (Bundle) null, (Uri) null));
        }
        if (locationFavorite2 != null) {
            String str2 = locationFavorite2.f40599c;
            if (!C20964s0.m49090h(str2)) {
                remoteViews.setTextViewText(R.id.favorite_widget_work, str2);
            } else {
                remoteViews.setTextViewText(R.id.favorite_widget_work, this.f43066b.getResources().getText(R.string.dashboard_favorites_work));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (LocationDescriptor) locationFavorite2.f52687b);
            remoteViews.setOnClickPendingIntent(R.id.favorite_widget_work, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.TP_WORK", bundle2, Uri.fromParts("navigate", "work", ((LocationDescriptor) locationFavorite2.f52687b).toString())));
            return;
        }
        remoteViews.setTextViewText(R.id.favorite_widget_work, this.f43066b.getResources().getText(R.string.dashboard_favorites_work));
        remoteViews.setOnClickPendingIntent(R.id.favorite_widget_work, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.EDIT_WORK", (Bundle) null, (Uri) null));
    }

    /* renamed from: c */
    public final void mo49289c() {
        RemoteViews remoteViews = new RemoteViews(this.f43066b.getPackageName(), R.layout.app_widget_favorite_error);
        remoteViews.setOnClickPendingIntent(R.id.retry_button, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.REFRESH_FAVORITES", (Bundle) null, (Uri) null));
        AppWidgetManager.getInstance(this.f43066b).updateAppWidget(new ComponentName(this.f43066b, FavoritesWidget.class), remoteViews);
    }

    /* renamed from: d */
    public final void mo49290d(AppWidgetManager appWidgetManager, ArrayList arrayList, ServerIdMap serverIdMap, int i, ArrayList arrayList2, Bundle bundle, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        List list;
        boolean z2;
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        int i6 = i;
        Bundle bundle2 = bundle;
        int i7 = i2;
        Bundle bundle3 = new Bundle();
        bundle3.putInt("appWidgetId", i7);
        TransitStop transitStop = (TransitStop) serverIdMap.get(arrayList.get(i6));
        RemoteViews remoteViews = new RemoteViews(this.f43066b.getPackageName(), R.layout.app_widget_favorite_layout);
        if (arrayList.size() == 1) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        remoteViews.setViewVisibility(R.id.prev_station, i3);
        if (arrayList.size() == 1) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        remoteViews.setViewVisibility(R.id.next_station, i4);
        if (i6 > 0) {
            remoteViews.setBoolean(R.id.prev_station, "setEnabled", true);
            remoteViews.setOnClickPendingIntent(R.id.prev_station, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.PREV_STOP", bundle3, Uri.fromParts(Events.PROPERTY_ACTION, "prev", String.valueOf(i2))));
        } else {
            remoteViews.setBoolean(R.id.prev_station, "setEnabled", false);
            remoteViews.setOnClickPendingIntent(R.id.prev_station, PendingIntent.getActivity(this.f43066b.getApplicationContext(), 0, new Intent(), C20927a0.m49010e(134217728)));
        }
        if (i6 < arrayList.size() - 1) {
            remoteViews.setBoolean(R.id.next_station, "setEnabled", true);
            remoteViews.setOnClickPendingIntent(R.id.next_station, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.NEXT_STOP", bundle3, Uri.fromParts(Events.PROPERTY_ACTION, "next", String.valueOf(i2))));
            i5 = 0;
        } else {
            i5 = 0;
            remoteViews.setBoolean(R.id.next_station, "setEnabled", false);
            remoteViews.setOnClickPendingIntent(R.id.next_station, PendingIntent.getActivity(this.f43066b.getApplicationContext(), 0, new Intent(), C20927a0.m49010e(134217728)));
        }
        remoteViews.setTextViewText(R.id.station_label, transitStop.f23731c);
        remoteViews.removeAllViews(R.id.pagination);
        remoteViews.setViewVisibility(R.id.pagination, i5);
        if (arrayList.size() > 1) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                RemoteViews remoteViews2 = new RemoteViews(this.f43066b.getPackageName(), R.layout.app_widget_favorite_pagination_dot);
                if (i8 == i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                remoteViews2.setBoolean(R.id.root, "setEnabled", z2);
                remoteViews.addView(R.id.pagination, remoteViews2);
            }
        } else {
            remoteViews.setViewVisibility(R.id.pagination, 8);
        }
        remoteViews.setOnClickPendingIntent(R.id.top_bar, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.HEADER_CLICKED", (Bundle) null, (Uri) null));
        if (z) {
            remoteViews.setViewVisibility(R.id.empty_view, 0);
            remoteViews.setViewVisibility(R.id.list, 8);
        } else {
            remoteViews.setViewVisibility(R.id.empty_view, 8);
            remoteViews.setViewVisibility(R.id.list, 0);
            Context context = this.f43066b;
            ServerId serverId = transitStop.f23730b;
            int i9 = 3;
            if (C20943i.m49051d(16)) {
                i9 = (int) (Math.ceil(((double) appWidgetManager2.getAppWidgetOptions(i7).getInt("appWidgetMinWidth", 0)) + 30.0d) / 70.0d);
            }
            if (arrayList2 == null) {
                list = Collections.emptyList();
            } else {
                list = arrayList2;
            }
            int i11 = FavoritesWidgetRemoteService.f37598b;
            Intent intent = new Intent(context, FavoritesWidgetRemoteService.class);
            intent.setData(Uri.fromParts("stop", serverId.mo19751c(), String.valueOf(System.currentTimeMillis())));
            intent.putExtra("line_list_extra", C13641g.m34110B(C13717b.m34264k(list), C19576b.m46958a(new C19804c(ServerId.f15140e, C19600l.f49782l))));
            if (bundle2 != null) {
                intent.putExtra("schedule_bundle_key", bundle2);
            }
            intent.putExtra("column_cells_key", i9);
            intent.putExtra("stop_id_extra", serverId.f15142b);
            intent.setExtrasClassLoader(LineFavorite.class.getClassLoader());
            remoteViews.setRemoteAdapter(R.id.list, intent);
            remoteViews.setPendingIntentTemplate(R.id.list, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.LINE_CLICKED", (Bundle) null, (Uri) null));
        }
        remoteViews.setOnClickPendingIntent(R.id.refresh_button, C20927a0.m49008c(this.f43066b, FavoritesWidget.class, "com.moovit.appwidgets.REFRESH_FAVORITES", bundle3, Uri.fromParts(Events.PROPERTY_ACTION, "refresh", String.valueOf(i2))));
        if (bundle2 != null) {
            remoteViews.setTextViewText(R.id.text, this.f43066b.getResources().getString(R.string.last_refresh, new Object[]{C7925b.m18024l(this.f43066b, System.currentTimeMillis())}));
            remoteViews.setViewVisibility(R.id.progress_bar, 4);
            remoteViews.setViewVisibility(R.id.refresh_button, 0);
        } else {
            remoteViews.setTextViewText(R.id.text, this.f43066b.getResources().getString(R.string.loading));
            remoteViews.setViewVisibility(R.id.progress_bar, 0);
            remoteViews.setViewVisibility(R.id.refresh_button, 4);
        }
        mo49288b(remoteViews);
        if (bundle2 == null) {
            appWidgetManager2.partiallyUpdateAppWidget(i7, remoteViews);
        } else {
            appWidgetManager2.updateAppWidget(i7, remoteViews);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x023e A[Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0289 A[Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0300 A[Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49291e(android.content.Intent r32) {
        /*
            r31 = this;
            r10 = r31
            r0 = r32
            java.lang.String r11 = "FavoritesWidget"
            java.lang.String r12 = "metroInfo"
            android.content.Context r1 = r10.f43066b
            iq.b r1 = p567iq.C17635b.m43779f(r1)
            u2.a r1 = r1.f50173c
            android.content.Context r2 = r10.f43066b
            java.lang.Object r1 = r1.f20758b
            hq.c r1 = (p543hq.C17476c) r1
            java.lang.Class<com.moovit.app.appwidgets.FavoritesWidget> r3 = com.moovit.app.appwidgets.FavoritesWidget.class
            com.moovit.analytics.AnalyticsFlowKey r1 = r1.mo49947a(r3)
            r13 = 1
            hq.b[] r3 = new p543hq.C17474b[r13]
            hq.b r4 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r5 = com.moovit.analytics.AnalyticsEventKey.FAVORITES_WIDGET_UPDATE
            r4.<init>(r5)
            r14 = 0
            r3[r14] = r4
            p269u2.C6677a.m15759j(r2, r1, r13, r3)
            java.lang.String r1 = "USER_CONTEXT"
            java.lang.Object r1 = m41963a(r1)
            tp.a0 r1 = (p824tp.C19722a0) r1
            c70.e r15 = new c70.e
            android.content.Context r2 = r10.f43066b
            r9 = 0
            r15.<init>(r2, r1, r9)
            java.lang.String r2 = "CONFIGURATION"
            java.lang.Object r2 = m41963a(r2)
            r16 = r2
            q00.a r16 = (q00.C19047a) r16
            java.lang.String r2 = "METRO_CONTEXT"
            java.lang.Object r2 = m41963a(r2)
            r17 = r2
            tp.f r17 = (p824tp.C19728f) r17
            java.lang.String r2 = "USER_ACCOUNT"
            java.lang.Object r2 = m41963a(r2)
            com.moovit.app.useraccount.manager.UserAccountManager r2 = (com.moovit.app.useraccount.manager.UserAccountManager) r2
            dy.e r8 = r2.mo46573d()
            android.content.Context r2 = r10.f43066b
            android.appwidget.AppWidgetManager r7 = android.appwidget.AppWidgetManager.getInstance(r2)
            java.util.List r2 = r8.mo49438l()
            java.util.ArrayList r6 = com.moovit.network.model.ServerId.m11393d(r2)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x00ac
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.content.Context r1 = r10.f43066b
            java.lang.String r1 = r1.getPackageName()
            r2 = 2131558475(0x7f0d004b, float:1.8742267E38)
            r0.<init>(r1, r2)
            android.content.Context r1 = r10.f43066b
            java.lang.Class<com.moovit.app.appwidgets.FavoritesWidget> r2 = com.moovit.app.appwidgets.FavoritesWidget.class
            java.lang.String r3 = "com.moovit.appwidgets.OPEN_DASHBOARD"
            android.app.PendingIntent r1 = p977zz.C20927a0.m49008c(r1, r2, r3, r9, r9)
            r2 = 2131364471(0x7f0a0a77, float:1.834878E38)
            r0.setOnClickPendingIntent(r2, r1)
            r1 = 2131362119(0x7f0a0147, float:1.834401E38)
            android.content.Context r2 = r10.f43066b
            java.lang.Class<com.moovit.app.appwidgets.FavoritesWidget> r4 = com.moovit.app.appwidgets.FavoritesWidget.class
            android.app.PendingIntent r2 = p977zz.C20927a0.m49008c(r2, r4, r3, r9, r9)
            r0.setOnClickPendingIntent(r1, r2)
            r10.mo49288b(r0)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r10.f43066b
            java.lang.Class<com.moovit.app.appwidgets.FavoritesWidget> r3 = com.moovit.app.appwidgets.FavoritesWidget.class
            r1.<init>(r2, r3)
            r7.updateAppWidget(r1, r0)
            return
        L_0x00ac:
            java.lang.String r2 = "appWidgetIds"
            int[] r2 = r0.getIntArrayExtra(r2)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r3 = "appWidgetId"
            int r3 = r0.getIntExtra(r3, r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r3 == 0) goto L_0x00be
            int[] r2 = new int[r13]     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r2[r14] = r3     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
        L_0x00be:
            r5 = r2
            java.lang.String r2 = "FavoritesWidgetUpdateTask.stops"
            android.content.Context r3 = r15.f33852a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            tp.f r3 = p824tp.C19728f.m47195a(r3)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            g30.h r3 = r3.f50165a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            i30.e r4 = new i30.e     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r4.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            ce0.C21100e.m49373x(r3, r12)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.metroentities.MetroEntityType r9 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r13 = r4.f17412b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r13.mo47002b(r9, r6)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            i30.c r9 = new i30.c     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r9.<init>(r15, r2, r3, r4)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.ArrayList r2 = r9.mo52625I()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            i30.d r2 = i30.C5268d.m13299a(r2)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitStop> r13 = r2.f17404a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            y90.f r1 = r1.f50160a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r9 = r1.f32927c     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r4 = r5.length     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r3 = 0
        L_0x00ed:
            if (r3 >= r4) goto L_0x033c
            r1 = r5[r3]     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.append(r2)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r14 = "_"
            r1.append(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r14 = r9.mo19751c()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.append(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r14 = "_stopId"
            r1.append(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r1 = r1.toString()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r14 = -1
            java.lang.Integer r21 = java.lang.Integer.valueOf(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r14 = "name"
            ce0.C21100e.m49373x(r1, r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            android.content.Context r14 = r10.f43066b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r0 = 0
            android.content.SharedPreferences r14 = r14.getSharedPreferences(r11, r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r0 = r21.intValue()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r0 = r14.getInt(r1, r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r0 = r0.intValue()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r14 = -1
            if (r0 == r14) goto L_0x0141
            com.moovit.network.model.ServerId r14 = new com.moovit.network.model.ServerId     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r14.<init>(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            boolean r14 = r6.contains(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r14 != 0) goto L_0x014a
        L_0x0141:
            r0 = 0
            java.lang.Object r14 = r6.get(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r14 = (com.moovit.network.model.ServerId) r14     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r0 = r14.f15142b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
        L_0x014a:
            r21 = r3
            r14 = 0
        L_0x014d:
            int r3 = r6.size()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r14 >= r3) goto L_0x0161
            java.lang.Object r3 = r6.get(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r3 = (com.moovit.network.model.ServerId) r3     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r3 = r3.f15142b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r0 != r3) goto L_0x015e
            goto L_0x0162
        L_0x015e:
            int r14 = r14 + 1
            goto L_0x014d
        L_0x0161:
            r14 = 0
        L_0x0162:
            java.lang.String r3 = r32.getAction()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r3 == 0) goto L_0x01d0
            r22 = r0
            java.lang.String r0 = "com.moovit.appwidgets.PREV_STOP"
            boolean r0 = r3.equals(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r0 == 0) goto L_0x019a
            if (r14 <= 0) goto L_0x019a
            int r14 = r14 + -1
            java.lang.Object r0 = r6.get(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r0 = (com.moovit.network.model.ServerId) r0     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r0 = r0.f15142b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            android.content.Context r3 = r10.f43066b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r23 = r4
            r4 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r11, r4)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r4 = r4.intValue()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r3.putInt(r1, r4)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r3.apply()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            goto L_0x01d6
        L_0x019a:
            r23 = r4
            java.lang.String r0 = "com.moovit.appwidgets.NEXT_STOP"
            boolean r0 = r3.equals(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r0 == 0) goto L_0x01d4
            int r0 = r6.size()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r3 = 1
            int r0 = r0 - r3
            if (r14 >= r0) goto L_0x01d4
            int r14 = r14 + 1
            java.lang.Object r0 = r6.get(r14)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r0 = (com.moovit.network.model.ServerId) r0     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r0 = r0.f15142b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            android.content.Context r3 = r10.f43066b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r4 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r11, r4)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r4 = r20.intValue()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r3.putInt(r1, r4)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r3.apply()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            goto L_0x01d6
        L_0x01d0:
            r22 = r0
            r23 = r4
        L_0x01d4:
            r0 = r22
        L_0x01d6:
            r20 = 0
            r22 = 0
            int r25 = r2.intValue()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r26 = 0
            r1 = r31
            r27 = r2
            r2 = r7
            r3 = r6
            r24 = 0
            r4 = r13
            r28 = r5
            r5 = r14
            r29 = r6
            r6 = r20
            r20 = r7
            r7 = r22
            r30 = r8
            r8 = r25
            r18 = r9
            r10 = 0
            r9 = r26
            r1.mo49290d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            yy.b r7 = new yy.b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r7.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r2.<init>(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.add(r2)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r9 = 1
            r7.f52453g = r9     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r8.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            yy.f r19 = new yy.f     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r6.<init>(r1)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r2 = r19
            r3 = r15
            r4 = r17
            r5 = r16
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.ArrayList r1 = r19.mo52625I()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r7.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
        L_0x0238:
            boolean r2 = r1.hasNext()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r2 == 0) goto L_0x026d
            java.lang.Object r2 = r1.next()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            yy.g r2 = (p952yy.C20793g) r2     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.List<yy.c> r2 = r2.f52481n     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r2 == 0) goto L_0x0238
            java.util.Iterator r2 = r2.iterator()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
        L_0x024c:
            boolean r3 = r2.hasNext()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r3 == 0) goto L_0x0238
            java.lang.Object r3 = r2.next()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            yy.c r3 = (p952yy.C20787c) r3     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r8.add(r3)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r4 = r3.f52456a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r4 = r4.mo19751c()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.transit.Schedule r3 = r3.f52458c     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.transit.Schedule$b r5 = com.moovit.transit.Schedule.f23658d     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            byte[] r3 = p389bl.C13641g.m34110B(r3, r5)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r7.putByteArray(r4, r3)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            goto L_0x024c
        L_0x026d:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r6.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.<init>(r0)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.Object r0 = r13.get(r1)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.transit.TransitStop r0 = (com.moovit.transit.TransitStop) r0     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.List<com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine>> r0 = r0.f23735g     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            boolean r0 = r0.isEmpty()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            boolean r1 = r8.isEmpty()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r1 != 0) goto L_0x0300
            yy.c$a r1 = new yy.c$a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.transit.Schedule$d r2 = com.moovit.transit.Schedule.m17782D()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.<init>(r2)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.Collections.sort(r8, r1)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            cr.a$a r1 = new cr.a$a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.ArrayList r1 = c00.C13720d.m34273c(r8, r10, r1)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.String r2 = "FavoritesWidgetUpdateTask.lines"
            android.content.Context r3 = r15.f33852a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            tp.f r3 = p824tp.C19728f.m47195a(r3)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            g30.h r3 = r3.f50165a     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            i30.e r4 = new i30.e     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r4.<init>()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            ce0.C21100e.m49373x(r3, r12)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.metroentities.MetroEntityType r5 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r8 = r4.f17412b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r8.mo47002b(r5, r1)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            i30.c r5 = new i30.c     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r5.<init>(r15, r2, r3, r4)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.ArrayList r2 = r5.mo52625I()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            i30.d r2 = i30.C5268d.m13299a(r2)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitLine> r2 = r2.f17406c     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r8 = r30
            java.util.ArrayList r3 = r8.f43618b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.ArrayList r3 = com.moovit.network.model.ServerId.m11393d(r3)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
        L_0x02d6:
            boolean r4 = r1.hasNext()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            if (r4 == 0) goto L_0x0302
            java.lang.Object r4 = r1.next()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r4 = (com.moovit.network.model.ServerId) r4     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.transit.TransitLine r5 = (com.moovit.transit.TransitLine) r5     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.transit.TransitLineGroup r5 = r5.mo24369b()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            com.moovit.network.model.ServerId r5 = r5.f23694b     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            boolean r5 = r3.contains(r5)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            zz.i0 r9 = new zz.i0     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r9.<init>(r4, r5)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r6.add(r9)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r9 = 1
            goto L_0x02d6
        L_0x0300:
            r8 = r30
        L_0x0302:
            int r9 = r27.intValue()     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            r1 = r31
            r2 = r20
            r3 = r29
            r4 = r13
            r5 = r14
            r14 = r8
            r8 = r9
            r19 = 1
            r9 = r0
            r1.mo49290d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ MetroRevisionMismatchException -> 0x032e, ServerException | IOException -> 0x032a }
            int r3 = r21 + 1
            r10 = r31
            r0 = r32
            r8 = r14
            r9 = r18
            r7 = r20
            r4 = r23
            r5 = r28
            r6 = r29
            r14 = 0
            goto L_0x00ed
        L_0x032a:
            r31.mo49289c()
            goto L_0x033c
        L_0x032e:
            r0 = move-exception
            com.moovit.network.model.ServerId r1 = r0.mo49154b()
            long r2 = r0.mo49153a()
            java.lang.String r0 = "fav_widget_mismatch"
            g30.C4789q.m12122d(r0, r1, r2)
        L_0x033c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p424cr.C16473a.mo49291e(android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        mo49289c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r2.f43068d.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r2 = this;
            android.content.Intent r0 = r2.f43067c     // Catch:{ Exception -> 0x000d }
            r2.mo49291e(r0)     // Catch:{ Exception -> 0x000d }
        L_0x0005:
            android.content.BroadcastReceiver$PendingResult r0 = r2.f43068d
            r0.finish()
            goto L_0x0011
        L_0x000b:
            r0 = move-exception
            goto L_0x0012
        L_0x000d:
            r2.mo49289c()     // Catch:{ all -> 0x000b }
            goto L_0x0005
        L_0x0011:
            return
        L_0x0012:
            android.content.BroadcastReceiver$PendingResult r1 = r2.f43068d
            r1.finish()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p424cr.C16473a.run():void");
    }
}
