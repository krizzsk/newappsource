package com.moovit.app.useraccount.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.useraccount.notifications.C15628a;
import com.moovit.gcm.GcmListenerService;
import com.moovit.gcm.notification.GcmNotification;
import com.tranzmate.R;
import ei0.C23315b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o00.C18671h;
import o00.C18681n;
import p130j2.C5367a;
import p304x.C7038d0;
import p501fw.C17102a;
import p503fy.C17125a;
import p503fy.C17127b;
import p543hq.C17474b;
import p574iy.C17679b;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;
import p977zz.C20941h;

public class UserNotificationsCenterActivity extends MoovitAppActivity implements C15628a.C15629a {

    /* renamed from: o0 */
    public static final /* synthetic */ int f40616o0 = 0;

    /* renamed from: U */
    public C17125a f40617U;

    /* renamed from: X */
    public C15628a f40618X;

    /* renamed from: Y */
    public RecyclerView f40619Y;

    /* renamed from: Z */
    public SwipeRefreshLayout f40620Z;

    /* renamed from: l0 */
    public C17679b f40621l0;

    /* renamed from: m0 */
    public final C15626a f40622m0 = new C15626a();

    /* renamed from: n0 */
    public final C15627b f40623n0 = new C15627b();

    /* renamed from: com.moovit.app.useraccount.notifications.UserNotificationsCenterActivity$a */
    public class C15626a extends BroadcastReceiver {
        public C15626a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("com.moovit.useraccount.manager.notifications.user_notifications_update_success".equals(action)) {
                UserNotificationsCenterActivity userNotificationsCenterActivity = UserNotificationsCenterActivity.this;
                int i = UserNotificationsCenterActivity.f40616o0;
                try {
                    C23315b.m57413a(0, userNotificationsCenterActivity.getApplicationContext());
                } catch (ShortcutBadgeException unused) {
                }
                C17127b.m43096b(userNotificationsCenterActivity).mo49721f(false);
                userNotificationsCenterActivity.mo46634y2();
                userNotificationsCenterActivity.f40620Z.setRefreshing(false);
            } else if ("com.moovit.useraccount.manager.notifications.user_notifications_update_failure".equals(action)) {
                UserNotificationsCenterActivity userNotificationsCenterActivity2 = UserNotificationsCenterActivity.this;
                Snackbar k = Snackbar.m35158k(-2, userNotificationsCenterActivity2.f40619Y, userNotificationsCenterActivity2.getString(R.string.network_unavailable_error));
                k.mo42256m(R.string.retry_connect, new C17102a(userNotificationsCenterActivity2, 9));
                k.mo42259p();
                userNotificationsCenterActivity2.f40620Z.setRefreshing(false);
            }
        }
    }

    /* renamed from: com.moovit.app.useraccount.notifications.UserNotificationsCenterActivity$b */
    public class C15627b extends BroadcastReceiver {
        public C15627b() {
        }

        public final void onReceive(Context context, Intent intent) {
            UserNotificationsCenterActivity userNotificationsCenterActivity = UserNotificationsCenterActivity.this;
            int i = UserNotificationsCenterActivity.f40616o0;
            userNotificationsCenterActivity.f40620Z.setRefreshing(true);
            C17125a aVar = userNotificationsCenterActivity.f40617U;
            synchronized (aVar) {
                if (aVar.f44339e == null) {
                    C17125a.C17126a aVar2 = new C17125a.C17126a();
                    aVar.f44339e = aVar2;
                    aVar2.execute(new Void[0]);
                }
            }
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.user_notifications_center_activity);
        init();
        this.f40620Z.setRefreshing(true);
        C17125a aVar = this.f40617U;
        synchronized (aVar) {
            if (aVar.f44339e == null) {
                C17125a.C17126a aVar2 = new C17125a.C17126a();
                aVar.f44339e = aVar2;
                aVar2.execute(new Void[0]);
            }
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo46634y2();
        C17125a.m43088h(this, this.f40622m0);
        for (String g : C17125a.f44334f) {
            GcmListenerService.m40504g(this.f40623n0, this, g);
        }
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C15627b bVar = this.f40623n0;
        Uri uri = GcmListenerService.f41490b;
        C5367a.m13473a(this).mo21148d(bVar);
        C15626a aVar = this.f40622m0;
        Set<String> set = C17125a.f44334f;
        C5367a.m13473a(this).mo21148d(aVar);
    }

    public final void init() {
        this.f40621l0 = new C17679b(this);
        Set<String> set = C17125a.f44334f;
        this.f40617U = (C17125a) getSystemService("user_notifications_manager_service");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        this.f40619Y = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C15628a aVar = new C15628a(this.f40617U);
        this.f40618X = aVar;
        aVar.f40628i = this;
        this.f40619Y.setAdapter(aVar);
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(0, R.drawable.divider_horizontal);
        this.f40619Y.mo4593g(new C18681n(this, sparseIntArray, true), -1);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.f40620Z = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(R.attr.colorSecondary, this));
        this.f40620Z.setOnRefreshListener(new C7038d0(this, 14));
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        List<GcmNotification> list;
        C17474b.C17475a m1 = super.mo19762m1();
        C17127b b = C17127b.m43096b(this);
        synchronized (b) {
            list = b.f44347c;
        }
        m1.mo49935c(AnalyticsAttributeKey.UNREAD_MESSAGES_COUNT, C17127b.m43096b(this).mo49718c());
        m1.mo49935c(AnalyticsAttributeKey.TOTAL_MESSAGES_COUNT, list.size());
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo46634y2() {
        List<GcmNotification> list;
        C17127b bVar = this.f40617U.f44338d;
        synchronized (bVar) {
            list = bVar.f44347c;
        }
        if (list.size() == 0) {
            this.f40619Y.mo4627l0(new C18671h(R.layout.user_notifications_empty_layout));
            return;
        }
        if (this.f40619Y.getAdapter() instanceof C18671h) {
            this.f40619Y.mo4627l0(this.f40618X);
        }
        C15628a aVar = this.f40618X;
        aVar.f40627h.clear();
        aVar.f40627h.addAll(list);
        aVar.notifyDataSetChanged();
    }
}
