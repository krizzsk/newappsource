package com.moovit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b00.C13556a;
import c00.C13733n;
import c70.C13752e;
import com.moovit.C14688a;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.location.C16202a;
import com.moovit.request.RequestOptions;
import java.util.Collections;
import java.util.Set;
import p543hq.C17474b;
import p669mz.C18481b;
import p824tp.C19723b;
import p824tp.C19732j;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;
import p977zz.C20949l;

/* renamed from: com.moovit.c */
public abstract class C15682c<A extends MoovitActivity> extends Fragment implements C19723b, AlertDialogFragment.C15857b {

    /* renamed from: b */
    public final Class<A> f40821b;

    /* renamed from: c */
    public A f40822c;

    /* renamed from: d */
    public boolean f40823d = false;

    /* renamed from: e */
    public boolean f40824e = false;

    /* renamed from: f */
    public boolean f40825f = false;

    /* renamed from: g */
    public boolean f40826g = false;

    /* renamed from: h */
    public Bundle f40827h;

    /* renamed from: i */
    public final C18481b f40828i = new C18481b();

    /* renamed from: j */
    public C20061g f40829j;

    /* renamed from: k */
    public final C19732j f40830k = new C19732j(this);

    /* renamed from: l */
    public C14688a f40831l;

    /* renamed from: m */
    public final C15683a f40832m = new C15683a();

    /* renamed from: com.moovit.c$a */
    public class C15683a implements C14688a.C14690b {
        public C15683a() {
        }

        /* renamed from: a */
        public final void mo20300a() {
            C15682c.this.mo40555V1();
        }

        /* renamed from: c */
        public final void mo20301c(Object obj, String str) {
            C15682c.this.mo46787X1(obj, str);
        }

        /* renamed from: d */
        public final void mo20302d(Object obj, String str) {
            C15682c.this.getClass();
        }
    }

    public C15682c(Class<A> cls) {
        this.f40821b = cls;
    }

    /* renamed from: E1 */
    public void mo44504E1(Bundle bundle, String str) {
        if ("LOCATION_PERMISSIONS_RATIONAL_FRAGMENT".equals(str)) {
            C16202a.get(this.f40822c).onRequestPrePermissionResult((C15682c<?>) this, -2);
        }
    }

    /* renamed from: H1 */
    public final boolean mo46775H1() {
        return this.f40831l.mo44593a();
    }

    /* renamed from: I1 */
    public C20061g mo21526I1() {
        return null;
    }

    /* renamed from: J1 */
    public final <T> T mo46776J1(String str) {
        return this.f40831l.mo44594b(str);
    }

    /* renamed from: K1 */
    public Set<String> mo23781K1() {
        return Collections.emptySet();
    }

    /* renamed from: L1 */
    public final RequestOptions mo46777L1() {
        this.f40822c.getClass();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42906c = getRetainInstance();
        return requestOptions;
    }

    /* renamed from: M1 */
    public AnalyticsFlowKey mo46778M1() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C15682c) {
            return ((C15682c) parentFragment).mo46778M1();
        }
        A a = this.f40822c;
        if (a != null) {
            return a.f37306O;
        }
        return null;
    }

    /* renamed from: N1 */
    public final <C, V> V mo46779N1(Class<C> cls, C13733n<C, V> nVar) {
        C c;
        Fragment targetFragment = getTargetFragment();
        if (cls.isInstance(targetFragment)) {
            c = cls.cast(targetFragment);
        } else {
            Fragment parentFragment = getParentFragment();
            if (cls.isInstance(parentFragment)) {
                c = cls.cast(parentFragment);
            } else {
                FragmentActivity activity = getActivity();
                if (cls.isInstance(activity)) {
                    c = cls.cast(activity);
                } else {
                    c = null;
                }
            }
        }
        if (c != null) {
            return nVar.convert(c);
        }
        return null;
    }

    /* renamed from: O1 */
    public final Location mo46780O1() {
        return mo46781P1().mo50014i();
    }

    /* renamed from: P1 */
    public final C20061g mo46781P1() {
        C20061g gVar = this.f40829j;
        if (gVar != null) {
            return gVar;
        }
        throw new ApplicationBugException("No LocationSource has been created for fragment " + this);
    }

    /* renamed from: Q1 */
    public final Bundle mo46782Q1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        StringBuilder k = C13555b.m33972k("Missing arguments for fragment ");
        k.append(getClass());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: R1 */
    public final C13752e mo46783R1() {
        return this.f40822c.mo44548x1();
    }

    /* renamed from: S1 */
    public void mo46784S1() {
        this.f40822c.mo44506I1();
    }

    /* renamed from: T1 */
    public final boolean mo46785T1(String str) {
        return this.f40831l.mo44595c(str);
    }

    /* renamed from: U1 */
    public final <C> void mo46786U1(Class<C> cls, C20949l<C> lVar) {
        Fragment targetFragment = getTargetFragment();
        if (!cls.isInstance(targetFragment) || !lVar.invoke(cls.cast(targetFragment))) {
            Fragment parentFragment = getParentFragment();
            if (!cls.isInstance(parentFragment) || !lVar.invoke(cls.cast(parentFragment))) {
                FragmentActivity activity = getActivity();
                if (cls.isInstance(activity)) {
                    lVar.invoke(cls.cast(activity));
                }
            }
        }
    }

    /* renamed from: V0 */
    public void mo19423V0(Bundle bundle, String str) {
    }

    /* renamed from: V1 */
    public void mo40555V1() {
        View view = getView();
        if (view != null) {
            mo23788W1(view);
        }
    }

    /* renamed from: W1 */
    public void mo23788W1(View view) {
    }

    /* renamed from: X1 */
    public void mo46787X1(Object obj, String str) {
    }

    /* renamed from: Y0 */
    public final void mo46756Y0() {
        if (!this.f40826g) {
            this.f40826g = true;
            mo46792e2(this.f40827h);
            this.f40827h = null;
        }
    }

    /* renamed from: Y1 */
    public void mo46788Y1(A a) {
    }

    @Deprecated
    /* renamed from: Z1 */
    public void mo40440Z1(int i, String str) {
    }

    /* renamed from: a2 */
    public void mo45459a2() {
    }

    /* renamed from: b2 */
    public void mo46789b2() {
    }

    /* renamed from: c2 */
    public void mo46790c2(Location location) {
    }

    /* renamed from: d2 */
    public void mo46791d2(C20061g gVar, C20061g gVar2) {
        if (gVar != null) {
            C19732j jVar = this.f40830k;
            C18481b bVar = this.f40828i;
            if (bVar.f47084a != null) {
                if (bVar.f47085b) {
                    gVar.mo50904b(jVar);
                }
                bVar.f47084a.mo47007p(gVar, jVar);
            }
        }
        if (gVar2 != null) {
            C19732j jVar2 = this.f40830k;
            C18481b bVar2 = this.f40828i;
            if (bVar2.f47084a == null) {
                bVar2.f47084a = new CollectionHashMap.HashSetHashMap<>();
            }
            bVar2.f47084a.mo47001a(gVar2, jVar2);
            if (bVar2.f47085b) {
                gVar2.mo50903a(jVar2);
            }
        }
    }

    /* renamed from: e2 */
    public void mo46792e2(Bundle bundle) {
        if (bundle != null) {
            bundle.getBoolean("isFirstInitialization");
        }
        C20061g I1 = mo21526I1();
        C20061g gVar = this.f40829j;
        this.f40829j = I1;
        mo46791d2(gVar, I1);
    }

    /* renamed from: f2 */
    public final <RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> C13556a mo46793f2(String str, RQ rq, RequestOptions requestOptions, C20437h<RQ, RS> hVar) {
        return this.f40822c.mo44527k2(str, rq, requestOptions, hVar);
    }

    /* renamed from: g2 */
    public final <RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> C13556a mo46794g2(String str, RQ rq, C20437h<RQ, RS> hVar) {
        return mo46793f2(str, rq, mo46777L1(), hVar);
    }

    /* renamed from: h2 */
    public final void mo46795h2(AlertDialogFragment alertDialogFragment) {
        this.f40822c.mo44530n2(alertDialogFragment);
    }

    /* renamed from: i2 */
    public final void mo46796i2() {
        this.f40822c.mo44543u2((CharSequence) null);
    }

    /* renamed from: j2 */
    public void mo46797j2(C17474b bVar) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C15682c) {
            ((C15682c) parentFragment).mo46797j2(bVar);
            return;
        }
        A a = this.f40822c;
        if (a != null) {
            a.mo44545v2(bVar);
        }
    }

    /* renamed from: k2 */
    public final void mo46798k2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: l2 */
    public final <T extends View> T mo46799l2(int i) {
        return getView().findViewById(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 105) {
            C16202a.get(getContext()).onPermissionSettingsResult((C15682c<?>) this);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f40821b.isInstance(activity)) {
            A a = (MoovitActivity) this.f40821b.cast(activity);
            this.f40822c = a;
            a.f37307P.mo40650a(this);
            mo46788Y1(a);
            return;
        }
        throw new ApplicationBugException(getClass() + " can only be used with a " + this.f40821b);
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Set<String> K1 = mo23781K1();
        C14688a aVar = new C14688a(K1, this.f40832m);
        this.f40831l = aVar;
        if (aVar.mo44597e()) {
            for (String b : K1) {
                this.f40831l.mo44594b(b);
            }
            mo40555V1();
        }
        this.f40827h = bundle;
        if (this.f40822c.f37299H) {
            mo46756Y0();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f40831l.mo44596d();
        this.f40825f = true;
        if (this.f40826g) {
            mo45459a2();
        }
    }

    public final void onDetach() {
        super.onDetach();
        mo46789b2();
        this.f40822c.f37307P.mo40651b(this);
        this.f40822c = null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        this.f40823d = true;
    }

    public void onPause() {
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 104) {
            C16202a.get(getContext()).onRequestPermissionResult((C15682c<?>) this, strArr, iArr);
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isFirstInitialization", false);
    }

    public void onStart() {
        super.onStart();
        this.f40824e = true;
        this.f40828i.mo50905a();
    }

    public void onStop() {
        super.onStop();
        this.f40824e = false;
        this.f40828i.mo50906b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (mo46775H1()) {
            mo23788W1(view);
        }
    }

    /* renamed from: t0 */
    public boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("LOCATION_PERMISSIONS_RATIONAL_FRAGMENT".equals(str)) {
            C16202a.get(this.f40822c).onRequestPrePermissionResult((C15682c<?>) this, i);
        }
        return true;
    }

    /* renamed from: v1 */
    public final boolean mo46757v1() {
        return this.f40823d;
    }

    /* renamed from: y */
    public final Fragment mo46758y() {
        return this;
    }
}
