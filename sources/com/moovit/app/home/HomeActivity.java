package com.moovit.app.home;

import aa0.C7524a;
import aa0.C7526c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.C0238b;
import androidx.appcompat.widget.C0416i1;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0932h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import c00.C13717b;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14733a;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.LazyAdDisplayHelper;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.general.more.DrawerFragment;
import com.moovit.app.home.tab.C15014a;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.home.tab.HomeTabSpec;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.UiUtils;
import com.moovit.location.C16202a;
import com.moovit.navigation.Navigable;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.request.MetroRevisionMismatchException;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import d40.C4360j;
import g30.C4776h;
import g30.C4780l;
import g30.C4787o;
import h10.C17293a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import k10.C17993a;
import mf0.C24361g;
import p001a0.C0017h;
import p139k.C5442d;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p431cy.C16523a;
import p431cy.C16525b;
import p450dt.C16700a;
import p450dt.C16701b;
import p450dt.C16702c;
import p450dt.C16703d;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17056a;
import p495fq.C17060e;
import p495fq.C17063g;
import p503fy.C17125a;
import p503fy.C17127b;
import p519gq.C17214b;
import p519gq.C17216d;
import p543hq.C17474b;
import p567iq.C17637d;
import p617ku.C18139a;
import p755qs.C19171h;
import p761qy.C19204d;
import p824tp.C19728f;
import p858uz.C20061g;
import p862vf.C20118b;
import p928xx.C20654a;
import p944yq.C20751b;
import p944yq.C20754c;
import p977zz.C20936e0;
import p977zz.C20977y0;

public class HomeActivity extends MoovitAppActivity implements C15014a.C15015a {

    /* renamed from: o0 */
    public static final /* synthetic */ int f38149o0 = 0;

    /* renamed from: U */
    public final C14919a f38150U = new C14919a();

    /* renamed from: X */
    public DrawerLayout f38151X;

    /* renamed from: Y */
    public C0238b f38152Y;

    /* renamed from: Z */
    public List<HomeTabSpec> f38153Z;

    /* renamed from: l0 */
    public ArrayList f38154l0;

    /* renamed from: m0 */
    public int f38155m0 = -1;

    /* renamed from: n0 */
    public DrawerFragment f38156n0;

    /* renamed from: com.moovit.app.home.HomeActivity$a */
    public class C14919a extends DrawerLayout.C0821f {
        public C14919a() {
        }

        /* renamed from: d */
        public final void mo936d() {
            HomeActivity homeActivity = HomeActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "more_menu_open");
            homeActivity.mo44545v2(aVar.mo49933a());
            DrawerFragment drawerFragment = HomeActivity.this.f38156n0;
            if (drawerFragment.mo46785T1("USER_ACCOUNT")) {
                UserAccountManager userAccountManager = (UserAccountManager) drawerFragment.mo46776J1("USER_ACCOUNT");
                C17125a e = userAccountManager.mo46574e();
                synchronized (e) {
                    if (e.f44339e == null) {
                        C17125a.C17126a aVar2 = new C17125a.C17126a();
                        e.f44339e = aVar2;
                        aVar2.execute(new Void[0]);
                    }
                }
                C16523a c = userAccountManager.mo46572c();
                synchronized (c) {
                    if (c.f43140e == null) {
                        C16523a.C16524a aVar3 = new C16523a.C16524a();
                        c.f43140e = aVar3;
                        aVar3.execute(new Void[0]);
                    }
                }
            }
        }
    }

    /* renamed from: y2 */
    public static Intent m37644y2(Context context, Uri uri, HomeTab homeTab, int i) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.setData(uri);
        intent.putExtra("extra_tab", homeTab);
        intent.putExtra("extra_tab_position", i);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo45093A2(Intent intent, Bundle bundle) {
        int i;
        if (this.f38151X.mo3557o()) {
            this.f38151X.mo3542d(false);
        }
        int i2 = this.f38155m0;
        if (bundle != null) {
            i = bundle.getInt("extra_tab_position", i2);
        } else if (intent.getData() != null) {
            Uri data = intent.getData();
            int size = this.f38153Z.size();
            int i3 = 0;
            boolean z = true;
            while (true) {
                if (i3 < size) {
                    C16703d z2 = mo45095z2(i3);
                    if (z2 == null) {
                        z = false;
                    } else if (z2.mo49409o2(data)) {
                        i = i3;
                        break;
                    }
                    i3++;
                } else {
                    if (!z) {
                        FragmentManager supportFragmentManager = getSupportFragmentManager();
                        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                        for (int i4 = 0; i4 < size; i4++) {
                            if (mo45095z2(i4) == null) {
                                HomeTabSpec homeTabSpec = this.f38153Z.get(i4);
                                C16703d b = homeTabSpec.mo45224b(supportFragmentManager);
                                K.mo4041e(R.id.fragments_container, b, homeTabSpec.f38422b.name(), 1);
                                K.mo4049o(b);
                            }
                        }
                        C0416i1 i1Var = new C0416i1(this, 12);
                        if (!K.f3777g) {
                            K.f3778h = false;
                            if (K.f3787q == null) {
                                K.f3787q = new ArrayList<>();
                            }
                            K.f3787q.add(i1Var);
                            K.mo4040d();
                        } else {
                            throw new IllegalStateException("This transaction is already being added to the back stack");
                        }
                    }
                    i = this.f38155m0;
                }
            }
        } else if (intent.hasExtra("extra_tab")) {
            i = C13717b.m34257d(this.f38153Z, new C16701b((HomeTab) intent.getParcelableExtra("extra_tab"), 0));
        } else {
            i = intent.getIntExtra("extra_tab_position", i2);
        }
        int b2 = C20936e0.m49036b(0, this.f38154l0.size() - 1, i);
        if (b2 != i2) {
            mo45094B2(b2);
        }
    }

    /* renamed from: B2 */
    public final void mo45094B2(int i) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        int i2 = this.f38155m0;
        boolean z = false;
        if (i2 != -1) {
            C16703d z2 = mo45095z2(i2);
            if (z2 != null) {
                K.mo4051q(z2, Lifecycle.State.STARTED);
                K.mo4049o(z2);
            }
            C15014a aVar = (C15014a) this.f38154l0.get(this.f38155m0);
            if (aVar.f38432i) {
                aVar.f38432i = false;
                aVar.mo45233a();
            }
        }
        C16703d z22 = mo45095z2(i);
        if (z22 == null) {
            HomeTabSpec homeTabSpec = this.f38153Z.get(i);
            K.mo4041e(R.id.fragments_container, homeTabSpec.mo45224b(supportFragmentManager), homeTabSpec.f38422b.name(), 1);
        } else {
            K.mo4051q(z22, Lifecycle.State.RESUMED);
            FragmentManager fragmentManager = z22.mFragmentManager;
            if (fragmentManager == null || fragmentManager == K.f3707r) {
                K.mo4109b(new C0932h0.C0933a((Fragment) z22, 5));
            } else {
                StringBuilder k = C13555b.m33972k("Cannot show Fragment attached to a different FragmentManager. Fragment ");
                k.append(z22.toString());
                k.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(k.toString());
            }
        }
        C15014a aVar2 = (C15014a) this.f38154l0.get(i);
        if (!aVar2.f38432i) {
            aVar2.f38432i = true;
            aVar2.mo45233a();
        }
        if (this.f38155m0 == -1) {
            z = true;
        }
        if (z) {
            K.mo4045k();
        } else {
            K.mo4040d();
        }
        this.f38155m0 = i;
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo44542u1());
        C14733a aVar3 = (C14733a) getSupportFragmentManager().mo3983z(R.id.banner_ad_fragment);
        if (aVar3 != null) {
            aVar3.mo44739o2(aVar2.f38426c.getUi().adSource, hVar);
        }
    }

    /* renamed from: J1 */
    public final boolean mo44507J1() {
        return false;
    }

    /* renamed from: N1 */
    public final void mo19768N1(Object obj, String str) {
        Set<String> categories;
        super.mo19768N1(obj, str);
        if ("METRO_CONTEXT".equals(str) && obj != null) {
            C19728f fVar = (C19728f) obj;
            Intent intent = getIntent();
            if ("android.intent.action.MAIN".equals(intent.getAction()) && (categories = intent.getCategories()) != null && categories.contains("android.intent.category.LAUNCHER")) {
                C4776h hVar = fVar.f50165a;
                ServerId serverId = hVar.f16126a;
                long j = hVar.f16127b;
                C4787o oVar = new C4787o(serverId, mo44548x1());
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42905b = Integer.MAX_VALUE;
                requestOptions.f42909f = true;
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C4787o.class, sb, "#");
                sb.append(oVar.f16166w);
                mo44527k2(sb.toString(), oVar, requestOptions, new C16702c(this, j, serverId));
            }
        }
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        if (!this.f38151X.mo3557o()) {
            return this instanceof AdjustAdsPreferencesActivity;
        }
        this.f38151X.mo3542d(true);
        return true;
    }

    /* renamed from: Z1 */
    public final void mo44517Z1() {
        Iterator it = this.f38154l0.iterator();
        while (it.hasNext()) {
            C15014a aVar = (C15014a) it.next();
            if (!aVar.f38433j) {
                aVar.f38433j = true;
                aVar.mo45233a();
            }
        }
    }

    /* renamed from: a2 */
    public final void mo44518a2(C4360j jVar, Navigable navigable) {
        HashSet hashSet = new HashSet(Collections.unmodifiableCollection(jVar.f15351b.values()));
        hashSet.remove(navigable);
        boolean z = !hashSet.isEmpty();
        Iterator it = this.f38154l0.iterator();
        while (it.hasNext()) {
            C15014a aVar = (C15014a) it.next();
            if (aVar.f38433j != z) {
                aVar.f38433j = z;
                aVar.mo45233a();
            }
        }
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo45093A2(intent, (Bundle) null);
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        C16525b c = new C17056a(this).mo49508c();
        C17214b bVar = new C17214b((MoovitActivity) c.f43143a, (C16851b) c.f43144b);
        c.f43144b = bVar;
        C16525b c2 = new C17060e(this).mo49508c();
        TimeUnit timeUnit = TimeUnit.HOURS;
        c2.mo49314a(timeUnit.toMillis(1));
        C16525b c3 = new C20751b(this).mo49508c();
        c3.mo49314a(timeUnit.toMillis(1));
        C16525b c4 = new C17063g(this).mo49508c();
        c4.mo49314a(TimeUnit.DAYS.toMillis(1));
        C16525b c5 = new C20754c(this).mo49508c();
        C17216d dVar = new C17216d((MoovitActivity) c5.f43143a, (C16851b) c5.f43144b);
        c5.f43144b = dVar;
        return new C16855d(this, R.id.alert_conditions, Arrays.asList(new C16851b[]{bVar, new C17293a(this, "home"), (C16851b) c2.f43144b, (C16851b) c3.f43144b, (C16851b) c4.f43144b, dVar}));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.home_activity);
        C20977y0.m49123b(this, false);
        this.f38156n0 = (DrawerFragment) getSupportFragmentManager().mo3983z(R.id.drawer_fragment);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.f38151X = drawerLayout;
        drawerLayout.setScrimColor(0);
        this.f38151X.mo3535a(this.f38150U);
        UiUtils.C15778b bVar = new UiUtils.C15778b();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6342i.m15104u((ViewGroup) findViewById(R.id.activity_content), bVar);
        List<HomeTabSpec> list = ((C17637d) getSystemService("ui_configuration")).f45344a;
        this.f38153Z = list;
        int size = list.size();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.tabs_container);
        linearLayout.setWeightSum((float) size);
        if (size > 1) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.f38154l0 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            HomeTabSpec homeTabSpec = this.f38153Z.get(i2);
            homeTabSpec.getClass();
            C15014a aVar = new C15014a(LayoutInflater.from(this).inflate(R.layout.bottom_bar_tab, linearLayout, false), homeTabSpec.f38422b, i2, size, this);
            this.f38154l0.add(aVar);
            linearLayout.addView(aVar.f38425b, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
        mo45093A2(getIntent(), bundle);
        if (bundle == null) {
            C7524a[] aVarArr = {new C19171h(), new C19204d(), new C20654a(), new C18139a(), new C17993a.C17994a()};
            if (!C24361g.m61154X(aVarArr)) {
                C7526c cVar = new C7526c(this, aVarArr);
                Tasks.call(MoovitExecutors.f37327IO, cVar).addOnSuccessListener((Activity) this, cVar);
            }
        }
        boolean d = C20118b.m47697e().mo52357d("ads_directions_lazy_interstitial");
        if (bundle == null && d) {
            getLifecycle().mo4224a(new LazyAdDisplayHelper(this, AdSource.TRANSITION_INTERSTITIAL));
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putInt("extra_tab_position", this.f38155m0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        C0238b bVar = this.f38152Y;
        if (bVar != null) {
            C5442d dVar = bVar.f714c;
            if (dVar instanceof C16700a) {
                C16700a aVar = (C16700a) dVar;
                boolean e = C17127b.m43096b(this).mo49720e();
                if (aVar.f43492p != e) {
                    aVar.f43492p = e;
                    aVar.invalidateSelf();
                }
            }
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0238b bVar = this.f38152Y;
        if (bVar != null) {
            bVar.f712a.mo901d();
            bVar.mo938f();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        C0238b bVar = this.f38152Y;
        if (bVar != null) {
            bVar.getClass();
            if (menuItem == null || menuItem.getItemId() != 16908332) {
                z = false;
            } else {
                bVar.mo939g();
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C0238b bVar = this.f38152Y;
        if (bVar != null) {
            bVar.mo938f();
        }
    }

    /* renamed from: s2 */
    public final void mo44538s2(MetroRevisionMismatchException metroRevisionMismatchException) {
        boolean z;
        C16703d dVar;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i = C4780l.f16147n;
        if (supportFragmentManager.mo3923A("metro_updated_loading_dialog_tag") != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Set<String> s1 = mo19438s1();
            if (this.f37299H) {
                dVar = mo45095z2(this.f38155m0);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                s1.addAll(dVar.mo23781K1());
            }
            C4780l.m12112S1(supportFragmentManager, metroRevisionMismatchException, (HashSet) s1);
        }
    }

    public final void setSupportActionBar(Toolbar toolbar) {
        Context context;
        ArrayList arrayList;
        C0238b bVar = this.f38152Y;
        if (!(bVar == null || (arrayList = this.f38151X.f3460u) == null)) {
            arrayList.remove(bVar);
        }
        super.setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C0238b bVar2 = new C0238b(this, this.f38151X, toolbar);
            this.f38152Y = bVar2;
            if (toolbar != null) {
                context = toolbar.getContext();
            } else {
                context = this;
            }
            bVar2.f714c = new C16700a(context, C17127b.m43096b(this).mo49720e());
            bVar2.mo938f();
            this.f38151X.mo3535a(this.f38152Y);
            this.f38152Y.mo938f();
            supportActionBar.mo793o(((GtfsConfiguration) mo44537r1("GTFS_CONFIGURATION")).mo19763c());
            supportActionBar.mo797s(true);
        }
    }

    /* renamed from: y1 */
    public final Intent mo44550y1() {
        return m37644y2(this, (Uri) null, (HomeTab) null, this.f38155m0);
    }

    /* renamed from: z2 */
    public final C16703d mo45095z2(int i) {
        return (C16703d) getSupportFragmentManager().mo3923A(this.f38153Z.get(i).f38422b.name());
    }
}
