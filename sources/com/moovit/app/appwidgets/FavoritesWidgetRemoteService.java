package com.moovit.app.appwidgets;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.moovit.app.MoovitAppApplication;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DbEntityRef;
import com.moovit.image.model.Image;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.MinutesSpanFormatter;
import com.tranzmate.R;
import g20.C17161i;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p389bl.C13641g;
import p435de.C16596f;
import p583jk.C17884p;
import p810sz.C19575a;
import p810sz.C19589j;
import p824tp.C19728f;
import p834tz.C19803b;
import p977zz.C20944i0;
import p977zz.C20964s0;
import r10.C19220d;

public class FavoritesWidgetRemoteService extends RemoteViewsService {

    /* renamed from: b */
    public static final /* synthetic */ int f37598b = 0;

    /* renamed from: com.moovit.app.appwidgets.FavoritesWidgetRemoteService$a */
    public static class C14778a implements RemoteViewsService.RemoteViewsFactory {

        /* renamed from: a */
        public C17161i<C16181a.C16184c, TransitLine> f37599a;

        /* renamed from: b */
        public final ServerId f37600b;

        /* renamed from: c */
        public final List<C20944i0<ServerId, Boolean>> f37601c;

        /* renamed from: d */
        public HashMap f37602d;

        /* renamed from: e */
        public final Context f37603e;

        /* renamed from: f */
        public final C14779a f37604f;

        /* renamed from: g */
        public int f37605g;

        /* renamed from: h */
        public RemoteViews f37606h;

        /* renamed from: com.moovit.app.appwidgets.FavoritesWidgetRemoteService$a$a */
        public class C14779a extends C16181a.C16182a<RemoteViews> {

            /* renamed from: c */
            public final /* synthetic */ Context f37607c;

            public C14779a(Context context) {
                this.f37607c = context;
            }

            /* renamed from: e */
            public final void mo44802e(Object obj, CharSequence charSequence) {
                ((RemoteViews) obj).setContentDescription(C14778a.this.f37605g, charSequence);
            }

            /* renamed from: f */
            public final void mo44803f(Image image, Object obj) {
                Bitmap bitmap;
                RemoteViews remoteViews = (RemoteViews) obj;
                try {
                    bitmap = (Bitmap) ((C19220d) C17884p.m44353X(this.f37607c).mo10870l().mo10859b0(image)).mo51628o0(image).mo10863e0(Integer.MIN_VALUE, Integer.MIN_VALUE).get(3, TimeUnit.SECONDS);
                } catch (Exception e) {
                    C16596f.m42113a().mo49364c(new ApplicationBugException("Failed to load widget remote icon", e));
                    bitmap = null;
                }
                remoteViews.setImageViewBitmap(R.id.icon, bitmap);
            }

            /* renamed from: g */
            public final void mo44804g(Object obj, CharSequence charSequence) {
                int i;
                RemoteViews remoteViews = (RemoteViews) obj;
                remoteViews.setTextViewText(R.id.subtitle, charSequence);
                if (C20964s0.m49090h(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                remoteViews.setViewVisibility(R.id.subtitle, i);
            }

            /* renamed from: h */
            public final void mo44805h(Object obj, CharSequence charSequence) {
                int i;
                RemoteViews remoteViews = (RemoteViews) obj;
                remoteViews.setTextViewText(R.id.title, charSequence);
                if (C20964s0.m49090h(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                remoteViews.setViewVisibility(R.id.title, i);
            }
        }

        public C14778a(Context context, Intent intent) {
            int i;
            int i2;
            this.f37603e = context;
            byte[] byteArrayExtra = intent.getByteArrayExtra("line_list_extra");
            boolean z = false;
            if (byteArrayExtra == null) {
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("FavoritesWidgetRemoteService ");
                k.append(intent.toString());
                a.mo49364c(new Exception(k.toString()));
                this.f37601c = Collections.emptyList();
            } else {
                this.f37601c = (List) C13641g.m34120h(byteArrayExtra, C19575a.m46957a(new C19803b(ServerId.f15141f, C19589j.f49771c), false));
            }
            this.f37600b = new ServerId(intent.getIntExtra("stop_id_extra", -1));
            Bundle bundleExtra = intent.getBundleExtra("schedule_bundle_key");
            if (bundleExtra != null) {
                this.f37602d = new HashMap();
                for (String next : bundleExtra.keySet()) {
                    this.f37602d.put(ServerId.m11392b(next), (Schedule) C13641g.m34120h(bundleExtra.getByteArray(next), Schedule.f23659e));
                }
            }
            z = intent.getIntExtra("column_cells_key", 3) <= 3 ? true : z;
            if (z) {
                i = R.layout.app_widget_favorite_line_with_time;
            } else {
                i = R.layout.app_widget_favorite_line_with_time_width;
            }
            this.f37605g = i;
            String packageName = context.getPackageName();
            if (z) {
                i2 = R.layout.app_widget_favorite_loading_row;
            } else {
                i2 = R.layout.app_widget_favorite_loading_row_width;
            }
            this.f37606h = new RemoteViews(packageName, i2);
            this.f37604f = new C14779a(context);
        }

        public final int getCount() {
            return this.f37601c.size();
        }

        public final long getItemId(int i) {
            return (long) ((ServerId) this.f37601c.get(i).f52692a).f15142b;
        }

        public final RemoteViews getLoadingView() {
            return this.f37606h;
        }

        public final RemoteViews getViewAt(int i) {
            int i2;
            Schedule schedule;
            if (this.f37599a == null) {
                C19728f fVar = (C19728f) MoovitAppApplication.m37038x().f37321e.mo50695h("METRO_CONTEXT", false);
                if (fVar == null) {
                    return this.f37606h;
                }
                this.f37599a = fVar.mo52082b(LinePresentationType.STOP_DETAIL);
            }
            TransitLine transitLine = DbEntityRef.newTransitLineRef((ServerId) this.f37601c.get(i).f52692a).get();
            if (transitLine == null) {
                return this.f37606h;
            }
            V remoteViews = new RemoteViews(this.f37603e.getPackageName(), this.f37605g);
            synchronized (this.f37604f) {
                Context context = this.f37603e;
                C17161i<C16181a.C16184c, TransitLine> iVar = this.f37599a;
                C14779a aVar = this.f37604f;
                aVar.f42179b = remoteViews;
                try {
                    iVar.mo48496a(context, aVar, transitLine);
                } finally {
                    aVar.f42179b = null;
                }
            }
            if (((Boolean) this.f37601c.get(i).f52693b).booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            remoteViews.setViewVisibility(R.id.image_badge, i2);
            remoteViews.setViewVisibility(R.id.accessory, 0);
            remoteViews.setViewVisibility(R.id.accessory_rt, 4);
            remoteViews.setTextViewText(R.id.accessory, this.f37603e.getResources().getString(R.string.units_time_na));
            HashMap hashMap = this.f37602d;
            if (!(hashMap == null || (schedule = (Schedule) hashMap.get(transitLine.f23687c)) == null || schedule.mo24326m() == null)) {
                if (schedule.mo24326m().mo24633j()) {
                    remoteViews.setViewVisibility(R.id.accessory_rt, 0);
                    remoteViews.setViewVisibility(R.id.accessory, 4);
                    remoteViews.setTextViewText(R.id.accessory_rt, C7925b.f23937d.mo24607g(this.f37603e, schedule.mo24326m().mo24631g(), MinutesSpanFormatter.f23890b));
                } else {
                    remoteViews.setViewVisibility(R.id.accessory, 0);
                    remoteViews.setViewVisibility(R.id.accessory_rt, 4);
                    remoteViews.setTextViewText(R.id.accessory, C7925b.m18024l(this.f37603e, schedule.mo24326m().mo24631g()));
                }
            }
            Intent intent = new Intent("com.moovit.appwidgets.LINE_CLICKED");
            intent.putExtra("line_group_id", transitLine.mo24369b().f23694b);
            intent.putExtra("line_id", transitLine.f23687c);
            intent.putExtra("stop_id", this.f37600b);
            remoteViews.setOnClickFillInIntent(R.id.line_row, intent);
            return remoteViews;
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public final void onCreate() {
        }

        public final void onDataSetChanged() {
        }

        public final void onDestroy() {
        }
    }

    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C14778a(this, intent);
    }
}
