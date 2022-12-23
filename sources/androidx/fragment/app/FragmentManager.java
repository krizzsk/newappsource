package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0193a;
import androidx.activity.C0201i;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0206a;
import androidx.activity.result.C0209d;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.C0932h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1037q0;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0016g;
import p056d2.C4335b;
import p065e.C4410a;
import p067e1.C4485f0;
import p067e1.C4487g0;
import p090g1.C4743b;
import p090g1.C4744c;
import p176n0.C5795n;
import p242s1.C6364i;
import p242s1.C6377n;
import p358af.C13437d;
import p988j$.util.DesugarCollections;

public abstract class FragmentManager {

    /* renamed from: A */
    public C0889e f3607A = new C0889e();

    /* renamed from: B */
    public C0209d f3608B;

    /* renamed from: C */
    public C0209d f3609C;

    /* renamed from: D */
    public C0209d f3610D;

    /* renamed from: E */
    public ArrayDeque<LaunchedFragmentInfo> f3611E = new ArrayDeque<>();

    /* renamed from: F */
    public boolean f3612F;

    /* renamed from: G */
    public boolean f3613G;

    /* renamed from: H */
    public boolean f3614H;

    /* renamed from: I */
    public boolean f3615I;

    /* renamed from: J */
    public boolean f3616J;

    /* renamed from: K */
    public ArrayList<C0909a> f3617K;

    /* renamed from: L */
    public ArrayList<Boolean> f3618L;

    /* renamed from: M */
    public ArrayList<Fragment> f3619M;

    /* renamed from: N */
    public C0916b0 f3620N;

    /* renamed from: O */
    public C0890f f3621O = new C0890f();

    /* renamed from: a */
    public final ArrayList<C0898n> f3622a = new ArrayList<>();

    /* renamed from: b */
    public boolean f3623b;

    /* renamed from: c */
    public final C0930g0 f3624c = new C0930g0();

    /* renamed from: d */
    public ArrayList<C0909a> f3625d;

    /* renamed from: e */
    public ArrayList<Fragment> f3626e;

    /* renamed from: f */
    public final C0970u f3627f = new C0970u(this);

    /* renamed from: g */
    public OnBackPressedDispatcher f3628g;

    /* renamed from: h */
    public final C0886b f3629h = new C0886b();

    /* renamed from: i */
    public final AtomicInteger f3630i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, BackStackState> f3631j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f3632k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, Object> f3633l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public ArrayList<C0897m> f3634m;

    /* renamed from: n */
    public final C0972v f3635n = new C0972v(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<C0919c0> f3636o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public final C0974w f3637p = new C0974w(this);

    /* renamed from: q */
    public final C0975x f3638q = new C0975x(this);

    /* renamed from: r */
    public final C0976y f3639r = new C0976y(this);

    /* renamed from: s */
    public final C5795n f3640s = new C5795n(this, 1);

    /* renamed from: t */
    public final C0887c f3641t = new C0887c();

    /* renamed from: u */
    public int f3642u = -1;

    /* renamed from: v */
    public C0969t<?> f3643v;

    /* renamed from: w */
    public C0959q f3644w;

    /* renamed from: x */
    public Fragment f3645x;

    /* renamed from: y */
    public Fragment f3646y;

    /* renamed from: z */
    public C0888d f3647z = new C0888d();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class C08836 implements C1025n {
        /* renamed from: f */
        public final void mo740f(C1033p pVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                throw null;
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public class C0885a implements C0206a<Map<String, Boolean>> {
        public C0885a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public final void mo771b(Object obj) {
            int i;
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((Boolean) arrayList.get(i2)).booleanValue()) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3611E.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f3648b;
                int i3 = pollFirst.f3649c;
                Fragment c = FragmentManager.this.f3624c.mo4101c(str);
                if (c != null) {
                    c.onRequestPermissionsResult(i3, strArr, iArr);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public class C0886b extends C0201i {
        public C0886b() {
        }

        /* renamed from: a */
        public final void mo761a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.mo3978u(true);
            if (fragmentManager.f3629h.f526a) {
                fragmentManager.mo3939T();
            } else {
                fragmentManager.f3628g.mo744b();
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public class C0887c implements C6377n {
        public C0887c() {
        }

        /* renamed from: a */
        public final void mo3988a(Menu menu) {
            FragmentManager.this.mo3970n(menu);
        }

        /* renamed from: b */
        public final void mo3989b(Menu menu) {
            FragmentManager.this.mo3972p(menu);
        }

        /* renamed from: c */
        public final boolean mo3990c(MenuItem menuItem) {
            return FragmentManager.this.mo3969m(menuItem);
        }

        /* renamed from: d */
        public final void mo3991d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.mo3964j(menu, menuInflater);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public class C0888d extends C0965s {
        public C0888d() {
        }

        /* renamed from: a */
        public final Fragment mo3992a(String str) {
            return Fragment.instantiate(FragmentManager.this.f3643v.f3854c, str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C0889e implements C0966s0 {
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public class C0890f implements Runnable {
        public C0890f() {
        }

        public final void run() {
            FragmentManager.this.mo3978u(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    public class C0891g implements C0919c0 {

        /* renamed from: b */
        public final /* synthetic */ Fragment f3655b;

        public C0891g(Fragment fragment) {
            this.f3655b = fragment;
        }

        /* renamed from: a */
        public final void mo3899a(Fragment fragment) {
            this.f3655b.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    public class C0892h implements C0206a<ActivityResult> {
        public C0892h() {
        }

        /* renamed from: b */
        public final void mo771b(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3611E.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f3648b;
                int i = pollFirst.f3649c;
                Fragment c = FragmentManager.this.f3624c.mo4101c(str);
                if (c != null) {
                    c.onActivityResult(i, activityResult.f528b, activityResult.f529c);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    public class C0893i implements C0206a<ActivityResult> {
        public C0893i() {
        }

        /* renamed from: b */
        public final void mo771b(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f3611E.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f3648b;
                int i = pollFirst.f3649c;
                Fragment c = FragmentManager.this.f3624c.mo4101c(str);
                if (c != null) {
                    c.onActivityResult(i, activityResult.f528b, activityResult.f529c);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    public interface C0894j {
        int getId();

        String getName();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public static class C0895k extends C4410a<IntentSenderRequest, ActivityResult> {
        /* renamed from: a */
        public final Intent mo3996a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.f535c;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f534b, (Intent) null, intentSenderRequest.f536d, intentSenderRequest.f537e);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m2590J(2)) {
                intent.toString();
            }
            return intent;
        }

        /* renamed from: c */
        public final Object mo3997c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public static abstract class C0896l {
        /* renamed from: a */
        public void mo3998a(Fragment fragment) {
        }

        /* renamed from: b */
        public void mo3999b(Fragment fragment) {
        }

        /* renamed from: c */
        public void mo4000c(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public interface C0897m {
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public interface C0898n {
        /* renamed from: a */
        boolean mo4002a(ArrayList<C0909a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    public class C0899o implements C0898n {

        /* renamed from: a */
        public final String f3658a;

        /* renamed from: b */
        public final int f3659b;

        /* renamed from: c */
        public final int f3660c;

        public C0899o(String str, int i, int i2) {
            this.f3658a = str;
            this.f3659b = i;
            this.f3660c = i2;
        }

        /* renamed from: a */
        public final boolean mo4002a(ArrayList<C0909a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3646y;
            if (fragment != null && this.f3659b < 0 && this.f3658a == null && fragment.getChildFragmentManager().mo3939T()) {
                return false;
            }
            return FragmentManager.this.mo3941V(arrayList, arrayList2, this.f3658a, this.f3659b, this.f3660c);
        }
    }

    /* renamed from: J */
    public static boolean m2590J(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: K */
    public static boolean m2591K(Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.f3624c.mo4103e().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z2 = m2591K(fragment2);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m2592M(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.f3646y) || !m2592M(fragmentManager.f3645x)) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final Fragment mo3923A(String str) {
        C0930g0 g0Var = this.f3624c;
        if (str != null) {
            int size = g0Var.f3764a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = g0Var.f3764a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0923e0 next : g0Var.f3765b.values()) {
                if (next != null) {
                    Fragment fragment2 = next.f3743c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            g0Var.getClass();
        }
        return null;
    }

    /* renamed from: B */
    public final void mo3924B() {
        Iterator it = mo3956f().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f3691e) {
                specialEffectsController.f3691e = false;
                specialEffectsController.mo4026c();
            }
        }
    }

    /* renamed from: C */
    public final C0894j mo3925C(int i) {
        return this.f3625d.get(i);
    }

    /* renamed from: D */
    public final int mo3926D() {
        ArrayList<C0909a> arrayList = this.f3625d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: E */
    public final Fragment mo3927E(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment y = mo3982y(string);
        if (y != null) {
            return y;
        }
        mo3963i0(new IllegalStateException(C25541a.m63882l("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    /* renamed from: F */
    public final ViewGroup mo3928F(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3644w.mo3877c()) {
            View b = this.f3644w.mo3876b(fragment.mContainerId);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    /* renamed from: G */
    public final C0965s mo3929G() {
        Fragment fragment = this.f3645x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo3929G();
        }
        return this.f3647z;
    }

    /* renamed from: H */
    public final List<Fragment> mo3930H() {
        return this.f3624c.mo4104f();
    }

    /* renamed from: I */
    public final C0966s0 mo3931I() {
        Fragment fragment = this.f3645x;
        if (fragment != null) {
            return fragment.mFragmentManager.mo3931I();
        }
        return this.f3607A;
    }

    /* renamed from: L */
    public final boolean mo3932L() {
        Fragment fragment = this.f3645x;
        if (fragment == null) {
            return true;
        }
        if (!fragment.isAdded() || !this.f3645x.getParentFragmentManager().mo3932L()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public final boolean mo3933N() {
        return this.f3613G || this.f3614H;
    }

    /* renamed from: O */
    public final void mo3934O(int i, boolean z) {
        C0969t<?> tVar;
        if (this.f3643v == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3642u) {
            this.f3642u = i;
            C0930g0 g0Var = this.f3624c;
            Iterator<Fragment> it = g0Var.f3764a.iterator();
            while (it.hasNext()) {
                C0923e0 e0Var = g0Var.f3765b.get(it.next().mWho);
                if (e0Var != null) {
                    e0Var.mo4086j();
                }
            }
            Iterator<C0923e0> it2 = g0Var.f3765b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                C0923e0 next = it2.next();
                if (next != null) {
                    next.mo4086j();
                    Fragment fragment = next.f3743c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (fragment.mBeingSaved && !g0Var.f3766c.containsKey(fragment.mWho)) {
                            next.mo4090n();
                        }
                        g0Var.mo4106h(next);
                    }
                }
            }
            mo3961h0();
            if (this.f3612F && (tVar = this.f3643v) != null && this.f3642u == 7) {
                tVar.mo3904h();
                this.f3612F = false;
            }
        }
    }

    /* renamed from: P */
    public final void mo3935P() {
        if (this.f3643v != null) {
            this.f3613G = false;
            this.f3614H = false;
            this.f3620N.f3725g = false;
            for (Fragment next : this.f3624c.mo4104f()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* renamed from: Q */
    public final void mo3936Q() {
        mo3975s(new C0899o((String) null, -1, 0), false);
    }

    /* renamed from: R */
    public final void mo3937R(int i, boolean z) {
        if (i >= 0) {
            mo3975s(new C0899o((String) null, i, 1), z);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Bad id: ", i));
    }

    /* renamed from: S */
    public final void mo3938S(int i) {
        if (i >= 0) {
            mo3940U(i, 1);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("Bad id: ", i));
    }

    /* renamed from: T */
    public final boolean mo3939T() {
        return mo3940U(-1, 0);
    }

    /* renamed from: U */
    public final boolean mo3940U(int i, int i2) {
        mo3978u(false);
        mo3976t(true);
        Fragment fragment = this.f3646y;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().mo3939T()) {
            return true;
        }
        boolean V = mo3941V(this.f3617K, this.f3618L, (String) null, i, i2);
        if (V) {
            this.f3623b = true;
            try {
                mo3944Y(this.f3617K, this.f3618L);
            } finally {
                mo3954e();
            }
        }
        mo3967k0();
        if (this.f3616J) {
            this.f3616J = false;
            mo3961h0();
        }
        this.f3624c.f3765b.values().removeAll(Collections.singleton((Object) null));
        return V;
    }

    /* renamed from: V */
    public final boolean mo3941V(ArrayList<C0909a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<C0909a> arrayList3 = this.f3625d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str != null || i >= 0) {
                int size = this.f3625d.size() - 1;
                while (size >= 0) {
                    C0909a aVar = this.f3625d.get(size);
                    if ((str != null && str.equals(aVar.f3779i)) || (i >= 0 && i == aVar.f3709t)) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z) {
                        while (size > 0) {
                            int i4 = size - 1;
                            C0909a aVar2 = this.f3625d.get(i4);
                            if ((str == null || !str.equals(aVar2.f3779i)) && (i < 0 || i != aVar2.f3709t)) {
                                break;
                            }
                            size = i4;
                        }
                    } else if (size != this.f3625d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            } else {
                i3 = z ? 0 : -1 + this.f3625d.size();
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.f3625d.size() - 1; size2 >= i3; size2--) {
            arrayList.add(this.f3625d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: W */
    public final void mo3942W(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            mo3963i0(new IllegalStateException(C25541a.m63879i("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    /* renamed from: X */
    public final void mo3943X(Fragment fragment) {
        if (m2590J(2)) {
            Objects.toString(fragment);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            C0930g0 g0Var = this.f3624c;
            synchronized (g0Var.f3764a) {
                g0Var.f3764a.remove(fragment);
            }
            fragment.mAdded = false;
            if (m2591K(fragment)) {
                this.f3612F = true;
            }
            fragment.mRemoving = true;
            mo3959g0(fragment);
        }
    }

    /* renamed from: Y */
    public final void mo3944Y(ArrayList<C0909a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3786p) {
                        if (i2 != i) {
                            mo3980w(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3786p) {
                                i2++;
                            }
                        }
                        mo3980w(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    mo3980w(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: Z */
    public final void mo3945Z(Parcelable parcelable) {
        int i;
        boolean z;
        C0923e0 e0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String next : bundle3.keySet()) {
            if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                bundle2.setClassLoader(this.f3643v.f3854c.getClassLoader());
                this.f3632k.put(next.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String next2 : bundle3.keySet()) {
            if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                bundle.setClassLoader(this.f3643v.f3854c.getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        C0930g0 g0Var = this.f3624c;
        g0Var.f3766c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState fragmentState = (FragmentState) it.next();
            g0Var.f3766c.put(fragmentState.f3671c, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState != null) {
            this.f3624c.f3765b.clear();
            Iterator<String> it2 = fragmentManagerState.f3662b.iterator();
            while (it2.hasNext()) {
                FragmentState i2 = this.f3624c.mo4107i(it2.next(), (FragmentState) null);
                if (i2 != null) {
                    C0916b0 b0Var = this.f3620N;
                    Fragment fragment = b0Var.f3720b.get(i2.f3671c);
                    if (fragment != null) {
                        if (m2590J(2)) {
                            fragment.toString();
                        }
                        e0Var = new C0923e0(this.f3635n, this.f3624c, fragment, i2);
                    } else {
                        e0Var = new C0923e0(this.f3635n, this.f3624c, this.f3643v.f3854c.getClassLoader(), mo3929G(), i2);
                    }
                    Fragment fragment2 = e0Var.f3743c;
                    fragment2.mFragmentManager = this;
                    if (m2590J(2)) {
                        fragment2.toString();
                    }
                    e0Var.mo4087k(this.f3643v.f3854c.getClassLoader());
                    this.f3624c.mo4105g(e0Var);
                    e0Var.f3745e = this.f3642u;
                }
            }
            C0916b0 b0Var2 = this.f3620N;
            b0Var2.getClass();
            Iterator it3 = new ArrayList(b0Var2.f3720b.values()).iterator();
            while (true) {
                i = 0;
                if (!it3.hasNext()) {
                    break;
                }
                Fragment fragment3 = (Fragment) it3.next();
                C0930g0 g0Var2 = this.f3624c;
                if (g0Var2.f3765b.get(fragment3.mWho) != null) {
                    i = 1;
                }
                if (i == 0) {
                    if (m2590J(2)) {
                        fragment3.toString();
                        Objects.toString(fragmentManagerState.f3662b);
                    }
                    this.f3620N.mo4059c(fragment3);
                    fragment3.mFragmentManager = this;
                    C0923e0 e0Var2 = new C0923e0(this.f3635n, this.f3624c, fragment3);
                    e0Var2.f3745e = 1;
                    e0Var2.mo4086j();
                    fragment3.mRemoving = true;
                    e0Var2.mo4086j();
                }
            }
            C0930g0 g0Var3 = this.f3624c;
            ArrayList<String> arrayList2 = fragmentManagerState.f3663c;
            g0Var3.f3764a.clear();
            if (arrayList2 != null) {
                for (String next3 : arrayList2) {
                    Fragment b = g0Var3.mo4100b(next3);
                    if (b != null) {
                        if (m2590J(2)) {
                            b.toString();
                        }
                        g0Var3.mo4099a(b);
                    } else {
                        throw new IllegalStateException(C13437d.m33706k("No instantiated fragment for (", next3, ")"));
                    }
                }
            }
            if (fragmentManagerState.f3664d != null) {
                this.f3625d = new ArrayList<>(fragmentManagerState.f3664d.length);
                int i3 = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f3664d;
                    if (i3 >= backStackRecordStateArr.length) {
                        break;
                    }
                    BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                    backStackRecordState.getClass();
                    C0909a aVar = new C0909a(this);
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < backStackRecordState.f3552b.length) {
                        C0932h0.C0933a aVar2 = new C0932h0.C0933a();
                        int i6 = i4 + 1;
                        aVar2.f3788a = backStackRecordState.f3552b[i4];
                        if (m2590J(2)) {
                            Objects.toString(aVar);
                            int i7 = backStackRecordState.f3552b[i6];
                        }
                        aVar2.f3795h = Lifecycle.State.values()[backStackRecordState.f3554d[i5]];
                        aVar2.f3796i = Lifecycle.State.values()[backStackRecordState.f3555e[i5]];
                        int[] iArr = backStackRecordState.f3552b;
                        int i8 = i6 + 1;
                        if (iArr[i6] != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar2.f3790c = z;
                        int i9 = i8 + 1;
                        int i11 = iArr[i8];
                        aVar2.f3791d = i11;
                        int i12 = i9 + 1;
                        int i13 = iArr[i9];
                        aVar2.f3792e = i13;
                        int i14 = i12 + 1;
                        int i15 = iArr[i12];
                        aVar2.f3793f = i15;
                        int i16 = iArr[i14];
                        aVar2.f3794g = i16;
                        aVar.f3772b = i11;
                        aVar.f3773c = i13;
                        aVar.f3774d = i15;
                        aVar.f3775e = i16;
                        aVar.mo4109b(aVar2);
                        i5++;
                        i4 = i14 + 1;
                    }
                    aVar.f3776f = backStackRecordState.f3556f;
                    aVar.f3779i = backStackRecordState.f3557g;
                    aVar.f3777g = true;
                    aVar.f3780j = backStackRecordState.f3559i;
                    aVar.f3781k = backStackRecordState.f3560j;
                    aVar.f3782l = backStackRecordState.f3561k;
                    aVar.f3783m = backStackRecordState.f3562l;
                    aVar.f3784n = backStackRecordState.f3563m;
                    aVar.f3785o = backStackRecordState.f3564n;
                    aVar.f3786p = backStackRecordState.f3565o;
                    aVar.f3709t = backStackRecordState.f3558h;
                    for (int i17 = 0; i17 < backStackRecordState.f3553c.size(); i17++) {
                        String str = backStackRecordState.f3553c.get(i17);
                        if (str != null) {
                            aVar.f3771a.get(i17).f3789b = mo3982y(str);
                        }
                    }
                    aVar.mo4042h(1);
                    if (m2590J(2)) {
                        aVar.toString();
                        PrintWriter printWriter = new PrintWriter(new C0964r0());
                        aVar.mo4048n("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f3625d.add(aVar);
                    i3++;
                }
            } else {
                this.f3625d = null;
            }
            this.f3630i.set(fragmentManagerState.f3665e);
            String str2 = fragmentManagerState.f3666f;
            if (str2 != null) {
                Fragment y = mo3982y(str2);
                this.f3646y = y;
                mo3971o(y);
            }
            ArrayList<String> arrayList3 = fragmentManagerState.f3667g;
            if (arrayList3 != null) {
                while (i < arrayList3.size()) {
                    this.f3631j.put(arrayList3.get(i), fragmentManagerState.f3668h.get(i));
                    i++;
                }
            }
            this.f3611E = new ArrayDeque<>(fragmentManagerState.f3669i);
        }
    }

    /* renamed from: a */
    public final C0923e0 mo3946a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.m2799d(fragment, str);
        }
        if (m2590J(2)) {
            fragment.toString();
        }
        C0923e0 g = mo3958g(fragment);
        fragment.mFragmentManager = this;
        this.f3624c.mo4105g(g);
        if (!fragment.mDetached) {
            this.f3624c.mo4099a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m2591K(fragment)) {
                this.f3612F = true;
            }
        }
        return g;
    }

    /* renamed from: a0 */
    public final Bundle mo3947a0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        mo3924B();
        Iterator it = mo3956f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).mo4028e();
        }
        mo3978u(true);
        this.f3613G = true;
        this.f3620N.f3725g = true;
        C0930g0 g0Var = this.f3624c;
        g0Var.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(g0Var.f3765b.size());
        for (C0923e0 next : g0Var.f3765b.values()) {
            if (next != null) {
                Fragment fragment = next.f3743c;
                next.mo4090n();
                arrayList2.add(fragment.mWho);
                if (m2590J(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        C0930g0 g0Var2 = this.f3624c;
        g0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(g0Var2.f3766c.values());
        if (!arrayList3.isEmpty()) {
            C0930g0 g0Var3 = this.f3624c;
            synchronized (g0Var3.f3764a) {
                backStackRecordStateArr = null;
                if (g0Var3.f3764a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(g0Var3.f3764a.size());
                    Iterator<Fragment> it2 = g0Var3.f3764a.iterator();
                    while (it2.hasNext()) {
                        Fragment next2 = it2.next();
                        arrayList.add(next2.mWho);
                        if (m2590J(2)) {
                            next2.toString();
                        }
                    }
                }
            }
            ArrayList<C0909a> arrayList4 = this.f3625d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f3625d.get(i));
                    if (m2590J(2)) {
                        Objects.toString(this.f3625d.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f3662b = arrayList2;
            fragmentManagerState.f3663c = arrayList;
            fragmentManagerState.f3664d = backStackRecordStateArr;
            fragmentManagerState.f3665e = this.f3630i.get();
            Fragment fragment2 = this.f3646y;
            if (fragment2 != null) {
                fragmentManagerState.f3666f = fragment2.mWho;
            }
            fragmentManagerState.f3667g.addAll(this.f3631j.keySet());
            fragmentManagerState.f3668h.addAll(this.f3631j.values());
            fragmentManagerState.f3669i = new ArrayList<>(this.f3611E);
            bundle.putParcelable("state", fragmentManagerState);
            for (String next3 : this.f3632k.keySet()) {
                bundle.putBundle(C25541a.m63881k("result_", next3), this.f3632k.get(next3));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                FragmentState fragmentState = (FragmentState) it3.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                StringBuilder k = C13555b.m33972k("fragment_");
                k.append(fragmentState.f3671c);
                bundle.putBundle(k.toString(), bundle2);
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo3948b(C0897m mVar) {
        if (this.f3634m == null) {
            this.f3634m = new ArrayList<>();
        }
        this.f3634m.add(mVar);
    }

    /* renamed from: b0 */
    public final Fragment.SavedState mo3949b0(Fragment fragment) {
        Bundle m;
        C0930g0 g0Var = this.f3624c;
        C0923e0 e0Var = g0Var.f3765b.get(fragment.mWho);
        if (e0Var == null || !e0Var.f3743c.equals(fragment)) {
            mo3963i0(new IllegalStateException(C25541a.m63879i("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        } else if (e0Var.f3743c.mState <= -1 || (m = e0Var.mo4089m()) == null) {
            return null;
        } else {
            return new Fragment.SavedState(m);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: androidx.activity.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3950c(androidx.fragment.app.C0969t<?> r4, androidx.fragment.app.C0959q r5, androidx.fragment.app.Fragment r6) {
        /*
            r3 = this;
            androidx.fragment.app.t<?> r0 = r3.f3643v
            if (r0 != 0) goto L_0x015f
            r3.f3643v = r4
            r3.f3644w = r5
            r3.f3645x = r6
            if (r6 == 0) goto L_0x0017
            androidx.fragment.app.FragmentManager$g r5 = new androidx.fragment.app.FragmentManager$g
            r5.<init>(r6)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.c0> r0 = r3.f3636o
            r0.add(r5)
            goto L_0x0023
        L_0x0017:
            boolean r5 = r4 instanceof androidx.fragment.app.C0919c0
            if (r5 == 0) goto L_0x0023
            r5 = r4
            androidx.fragment.app.c0 r5 = (androidx.fragment.app.C0919c0) r5
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.c0> r0 = r3.f3636o
            r0.add(r5)
        L_0x0023:
            androidx.fragment.app.Fragment r5 = r3.f3645x
            if (r5 == 0) goto L_0x002a
            r3.mo3967k0()
        L_0x002a:
            boolean r5 = r4 instanceof androidx.activity.C0202j
            if (r5 == 0) goto L_0x003f
            r5 = r4
            androidx.activity.j r5 = (androidx.activity.C0202j) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.getOnBackPressedDispatcher()
            r3.f3628g = r0
            if (r6 == 0) goto L_0x003a
            r5 = r6
        L_0x003a:
            androidx.fragment.app.FragmentManager$b r1 = r3.f3629h
            r0.mo743a(r5, r1)
        L_0x003f:
            if (r6 == 0) goto L_0x0062
            androidx.fragment.app.FragmentManager r4 = r6.mFragmentManager
            androidx.fragment.app.b0 r4 = r4.f3620N
            java.util.HashMap<java.lang.String, androidx.fragment.app.b0> r5 = r4.f3721c
            java.lang.String r0 = r6.mWho
            java.lang.Object r5 = r5.get(r0)
            androidx.fragment.app.b0 r5 = (androidx.fragment.app.C0916b0) r5
            if (r5 != 0) goto L_0x005f
            androidx.fragment.app.b0 r5 = new androidx.fragment.app.b0
            boolean r0 = r4.f3723e
            r5.<init>(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.b0> r4 = r4.f3721c
            java.lang.String r0 = r6.mWho
            r4.put(r0, r5)
        L_0x005f:
            r3.f3620N = r5
            goto L_0x0086
        L_0x0062:
            boolean r5 = r4 instanceof androidx.lifecycle.C1037q0
            if (r5 == 0) goto L_0x007e
            androidx.lifecycle.q0 r4 = (androidx.lifecycle.C1037q0) r4
            androidx.lifecycle.p0 r4 = r4.getViewModelStore()
            androidx.lifecycle.n0 r5 = new androidx.lifecycle.n0
            androidx.fragment.app.b0$a r0 = androidx.fragment.app.C0916b0.f3719h
            r5.<init>((androidx.lifecycle.C1034p0) r4, (androidx.lifecycle.C1026n0.C1028b) r0)
            java.lang.Class<androidx.fragment.app.b0> r4 = androidx.fragment.app.C0916b0.class
            androidx.lifecycle.k0 r4 = r5.mo4313a(r4)
            androidx.fragment.app.b0 r4 = (androidx.fragment.app.C0916b0) r4
            r3.f3620N = r4
            goto L_0x0086
        L_0x007e:
            androidx.fragment.app.b0 r4 = new androidx.fragment.app.b0
            r5 = 0
            r4.<init>(r5)
            r3.f3620N = r4
        L_0x0086:
            androidx.fragment.app.b0 r4 = r3.f3620N
            boolean r5 = r3.mo3933N()
            r4.f3725g = r5
            androidx.fragment.app.g0 r4 = r3.f3624c
            androidx.fragment.app.b0 r5 = r3.f3620N
            r4.f3767d = r5
            androidx.fragment.app.t<?> r4 = r3.f3643v
            boolean r5 = r4 instanceof p256t2.C6556e
            if (r5 == 0) goto L_0x00b5
            if (r6 != 0) goto L_0x00b5
            t2.e r4 = (p256t2.C6556e) r4
            t2.c r4 = r4.getSavedStateRegistry()
            androidx.fragment.app.z r5 = new androidx.fragment.app.z
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.mo22665c(r0, r5)
            android.os.Bundle r4 = r4.mo22663a(r0)
            if (r4 == 0) goto L_0x00b5
            r3.mo3945Z(r4)
        L_0x00b5:
            androidx.fragment.app.t<?> r4 = r3.f3643v
            boolean r5 = r4 instanceof androidx.activity.result.C0213f
            if (r5 == 0) goto L_0x011b
            androidx.activity.result.f r4 = (androidx.activity.result.C0213f) r4
            androidx.activity.result.e r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto L_0x00d1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            java.lang.String r1 = ":"
            java.lang.String r5 = p001a0.C0016g.m31o(r5, r0, r1)
            goto L_0x00d3
        L_0x00d1:
            java.lang.String r5 = ""
        L_0x00d3:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r5 = p379.C25541a.m63881k(r0, r5)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = p379.C25541a.m63881k(r5, r0)
            e.c r1 = new e.c
            r1.<init>()
            androidx.fragment.app.FragmentManager$h r2 = new androidx.fragment.app.FragmentManager$h
            r2.<init>()
            androidx.activity.result.d r0 = r4.mo776d(r0, r1, r2)
            r3.f3608B = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = p379.C25541a.m63881k(r5, r0)
            androidx.fragment.app.FragmentManager$k r1 = new androidx.fragment.app.FragmentManager$k
            r1.<init>()
            androidx.fragment.app.FragmentManager$i r2 = new androidx.fragment.app.FragmentManager$i
            r2.<init>()
            androidx.activity.result.d r0 = r4.mo776d(r0, r1, r2)
            r3.f3609C = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r5 = p379.C25541a.m63881k(r5, r0)
            e.b r0 = new e.b
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.d r4 = r4.mo776d(r5, r0, r1)
            r3.f3610D = r4
        L_0x011b:
            androidx.fragment.app.t<?> r4 = r3.f3643v
            boolean r5 = r4 instanceof p090g1.C4743b
            if (r5 == 0) goto L_0x0128
            g1.b r4 = (p090g1.C4743b) r4
            androidx.fragment.app.w r5 = r3.f3637p
            r4.addOnConfigurationChangedListener(r5)
        L_0x0128:
            androidx.fragment.app.t<?> r4 = r3.f3643v
            boolean r5 = r4 instanceof p090g1.C4744c
            if (r5 == 0) goto L_0x0135
            g1.c r4 = (p090g1.C4744c) r4
            androidx.fragment.app.x r5 = r3.f3638q
            r4.addOnTrimMemoryListener(r5)
        L_0x0135:
            androidx.fragment.app.t<?> r4 = r3.f3643v
            boolean r5 = r4 instanceof p067e1.C4485f0
            if (r5 == 0) goto L_0x0142
            e1.f0 r4 = (p067e1.C4485f0) r4
            androidx.fragment.app.y r5 = r3.f3639r
            r4.addOnMultiWindowModeChangedListener(r5)
        L_0x0142:
            androidx.fragment.app.t<?> r4 = r3.f3643v
            boolean r5 = r4 instanceof p067e1.C4487g0
            if (r5 == 0) goto L_0x014f
            e1.g0 r4 = (p067e1.C4487g0) r4
            n0.n r5 = r3.f3640s
            r4.addOnPictureInPictureModeChangedListener(r5)
        L_0x014f:
            androidx.fragment.app.t<?> r4 = r3.f3643v
            boolean r5 = r4 instanceof p242s1.C6364i
            if (r5 == 0) goto L_0x015e
            if (r6 != 0) goto L_0x015e
            s1.i r4 = (p242s1.C6364i) r4
            androidx.fragment.app.FragmentManager$c r5 = r3.f3641t
            r4.addMenuProvider(r5)
        L_0x015e:
            return
        L_0x015f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo3950c(androidx.fragment.app.t, androidx.fragment.app.q, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: c0 */
    public final void mo3951c0() {
        synchronized (this.f3622a) {
            boolean z = true;
            if (this.f3622a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f3643v.f3855d.removeCallbacks(this.f3621O);
                this.f3643v.f3855d.post(this.f3621O);
                mo3967k0();
            }
        }
    }

    /* renamed from: d */
    public final void mo3952d(Fragment fragment) {
        if (m2590J(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f3624c.mo4099a(fragment);
                if (m2590J(2)) {
                    fragment.toString();
                }
                if (m2591K(fragment)) {
                    this.f3612F = true;
                }
            }
        }
    }

    /* renamed from: d0 */
    public final void mo3953d0(Fragment fragment, boolean z) {
        ViewGroup F = mo3928F(fragment);
        if (F != null && (F instanceof FragmentContainerView)) {
            ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z);
        }
    }

    /* renamed from: e */
    public final void mo3954e() {
        this.f3623b = false;
        this.f3618L.clear();
        this.f3617K.clear();
    }

    /* renamed from: e0 */
    public final void mo3955e0(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(mo3982y(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    /* renamed from: f */
    public final HashSet mo3956f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f3624c.mo4102d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0923e0) it.next()).f3743c.mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m2673g(viewGroup, mo3931I()));
            }
        }
        return hashSet;
    }

    /* renamed from: f0 */
    public final void mo3957f0(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3982y(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3646y;
            this.f3646y = fragment;
            mo3971o(fragment2);
            mo3971o(this.f3646y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: g */
    public final C0923e0 mo3958g(Fragment fragment) {
        C0930g0 g0Var = this.f3624c;
        C0923e0 e0Var = g0Var.f3765b.get(fragment.mWho);
        if (e0Var != null) {
            return e0Var;
        }
        C0923e0 e0Var2 = new C0923e0(this.f3635n, this.f3624c, fragment);
        e0Var2.mo4087k(this.f3643v.f3854c.getClassLoader());
        e0Var2.f3745e = this.f3642u;
        return e0Var2;
    }

    /* renamed from: g0 */
    public final void mo3959g0(Fragment fragment) {
        ViewGroup F = mo3928F(fragment);
        if (F != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i = C4335b.visible_removing_fragment_view_tag;
                if (F.getTag(i) == null) {
                    F.setTag(i, fragment);
                }
                ((Fragment) F.getTag(i)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    /* renamed from: h */
    public final void mo3960h(Fragment fragment) {
        if (m2590J(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m2590J(2)) {
                    fragment.toString();
                }
                C0930g0 g0Var = this.f3624c;
                synchronized (g0Var.f3764a) {
                    g0Var.f3764a.remove(fragment);
                }
                fragment.mAdded = false;
                if (m2591K(fragment)) {
                    this.f3612F = true;
                }
                mo3959g0(fragment);
            }
        }
    }

    /* renamed from: h0 */
    public final void mo3961h0() {
        Iterator it = this.f3624c.mo4102d().iterator();
        while (it.hasNext()) {
            C0923e0 e0Var = (C0923e0) it.next();
            Fragment fragment = e0Var.f3743c;
            if (fragment.mDeferStart) {
                if (this.f3623b) {
                    this.f3616J = true;
                } else {
                    fragment.mDeferStart = false;
                    e0Var.mo4086j();
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean mo3962i(MenuItem menuItem) {
        if (this.f3642u < 1) {
            return false;
        }
        for (Fragment next : this.f3624c.mo4104f()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public final void mo3963i0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C0964r0());
        C0969t<?> tVar = this.f3643v;
        if (tVar != null) {
            try {
                tVar.mo3900d(printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            mo3974r("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw illegalStateException;
    }

    /* renamed from: j */
    public final boolean mo3964j(Menu menu, MenuInflater menuInflater) {
        if (this.f3642u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3624c.mo4104f()) {
            if (next != null && next.isMenuVisible() && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3626e != null) {
            for (int i = 0; i < this.f3626e.size(); i++) {
                Fragment fragment = this.f3626e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f3626e = arrayList;
        return z;
    }

    /* renamed from: j0 */
    public final void mo3965j0(C0896l lVar) {
        C0972v vVar = this.f3635n;
        synchronized (vVar.f3860a) {
            int i = 0;
            int size = vVar.f3860a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (vVar.f3860a.get(i).f3862a == lVar) {
                    vVar.f3860a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo3966k() {
        boolean z = true;
        this.f3615I = true;
        mo3978u(true);
        Iterator it = mo3956f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).mo4028e();
        }
        C0969t<?> tVar = this.f3643v;
        if (tVar instanceof C1037q0) {
            z = this.f3624c.f3767d.f3724f;
        } else {
            Context context = tVar.f3854c;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (BackStackState backStackState : this.f3631j.values()) {
                for (String b : backStackState.f3566b) {
                    this.f3624c.f3767d.mo4058b(b);
                }
            }
        }
        mo3973q(-1);
        C0969t<?> tVar2 = this.f3643v;
        if (tVar2 instanceof C4744c) {
            ((C4744c) tVar2).removeOnTrimMemoryListener(this.f3638q);
        }
        C0969t<?> tVar3 = this.f3643v;
        if (tVar3 instanceof C4743b) {
            ((C4743b) tVar3).removeOnConfigurationChangedListener(this.f3637p);
        }
        C0969t<?> tVar4 = this.f3643v;
        if (tVar4 instanceof C4485f0) {
            ((C4485f0) tVar4).removeOnMultiWindowModeChangedListener(this.f3639r);
        }
        C0969t<?> tVar5 = this.f3643v;
        if (tVar5 instanceof C4487g0) {
            ((C4487g0) tVar5).removeOnPictureInPictureModeChangedListener(this.f3640s);
        }
        C0969t<?> tVar6 = this.f3643v;
        if (tVar6 instanceof C6364i) {
            ((C6364i) tVar6).removeMenuProvider(this.f3641t);
        }
        this.f3643v = null;
        this.f3644w = null;
        this.f3645x = null;
        if (this.f3628g != null) {
            Iterator<C0193a> it2 = this.f3629h.f527b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f3628g = null;
        }
        C0209d dVar = this.f3608B;
        if (dVar != null) {
            dVar.mo773b();
            this.f3609C.mo773b();
            this.f3610D.mo773b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (mo3926D() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (m2592M(r3.f3645x) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r0.f526a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r3.f3629h;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3967k0() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$n> r0 = r3.f3622a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$n> r1 = r3.f3622a     // Catch:{ all -> 0x0028 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            androidx.fragment.app.FragmentManager$b r1 = r3.f3629h     // Catch:{ all -> 0x0028 }
            r1.f526a = r2     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            androidx.fragment.app.FragmentManager$b r0 = r3.f3629h
            int r1 = r3.mo3926D()
            if (r1 <= 0) goto L_0x0024
            androidx.fragment.app.Fragment r1 = r3.f3645x
            boolean r1 = m2592M(r1)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r0.f526a = r2
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo3967k0():void");
    }

    /* renamed from: l */
    public final void mo3968l() {
        Iterator it = this.f3624c.mo4103e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.mo3968l();
            }
        }
    }

    /* renamed from: m */
    public final boolean mo3969m(MenuItem menuItem) {
        if (this.f3642u < 1) {
            return false;
        }
        for (Fragment next : this.f3624c.mo4104f()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo3970n(Menu menu) {
        if (this.f3642u >= 1) {
            for (Fragment next : this.f3624c.mo4104f()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo3971o(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3982y(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: p */
    public final boolean mo3972p(Menu menu) {
        boolean z = false;
        if (this.f3642u < 1) {
            return false;
        }
        for (Fragment next : this.f3624c.mo4104f()) {
            if (next != null && next.isMenuVisible() && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: q */
    public final void mo3973q(int i) {
        try {
            this.f3623b = true;
            for (C0923e0 next : this.f3624c.f3765b.values()) {
                if (next != null) {
                    next.f3745e = i;
                }
            }
            mo3934O(i, false);
            Iterator it = mo3956f().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).mo4028e();
            }
            this.f3623b = false;
            mo3978u(true);
        } catch (Throwable th) {
            this.f3623b = false;
            throw th;
        }
    }

    /* renamed from: r */
    public final void mo3974r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String k = C25541a.m63881k(str, "    ");
        C0930g0 g0Var = this.f3624c;
        g0Var.getClass();
        String str2 = str + "    ";
        if (!g0Var.f3765b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0923e0 next : g0Var.f3765b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment fragment = next.f3743c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
                }
            }
        }
        int size3 = g0Var.f3764a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(g0Var.f3764a.get(i).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f3626e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f3626e.get(i2).toString());
            }
        }
        ArrayList<C0909a> arrayList2 = this.f3625d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0909a aVar = this.f3625d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo4048n(k, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3630i.get());
        synchronized (this.f3622a) {
            int size4 = this.f3622a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f3622a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3643v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3644w);
        if (this.f3645x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3645x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3642u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3613G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3614H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3615I);
        if (this.f3612F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3612F);
        }
    }

    /* renamed from: s */
    public final void mo3975s(C0898n nVar, boolean z) {
        if (!z) {
            if (this.f3643v == null) {
                if (this.f3615I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (mo3933N()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3622a) {
            if (this.f3643v != null) {
                this.f3622a.add(nVar);
                mo3951c0();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: t */
    public final void mo3976t(boolean z) {
        if (this.f3623b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3643v == null) {
            if (this.f3615I) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f3643v.f3855d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z && mo3933N()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f3617K == null) {
            this.f3617K = new ArrayList<>();
            this.f3618L = new ArrayList<>();
        }
    }

    public final String toString() {
        StringBuilder r = C0016g.m34r(RecyclerView.C1119a0.FLAG_IGNORE, "FragmentManager{");
        r.append(Integer.toHexString(System.identityHashCode(this)));
        r.append(" in ");
        Fragment fragment = this.f3645x;
        if (fragment != null) {
            r.append(fragment.getClass().getSimpleName());
            r.append("{");
            r.append(Integer.toHexString(System.identityHashCode(this.f3645x)));
            r.append("}");
        } else {
            C0969t<?> tVar = this.f3643v;
            if (tVar != null) {
                r.append(tVar.getClass().getSimpleName());
                r.append("{");
                r.append(Integer.toHexString(System.identityHashCode(this.f3643v)));
                r.append("}");
            } else {
                r.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            }
        }
        r.append("}}");
        return r.toString();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: u */
    public final boolean mo3978u(boolean z) {
        boolean z2;
        mo3976t(z);
        boolean z3 = false;
        while (true) {
            ArrayList<C0909a> arrayList = this.f3617K;
            ArrayList<Boolean> arrayList2 = this.f3618L;
            synchronized (this.f3622a) {
                if (this.f3622a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f3622a.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= this.f3622a.get(i).mo4002a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f3622a.clear();
                        this.f3643v.f3855d.removeCallbacks(this.f3621O);
                    }
                }
            }
            if (z2) {
                this.f3623b = true;
                try {
                    mo3944Y(this.f3617K, this.f3618L);
                    mo3954e();
                    z3 = true;
                } catch (Throwable th) {
                    mo3954e();
                    throw th;
                }
            } else {
                mo3967k0();
                if (this.f3616J) {
                    this.f3616J = false;
                    mo3961h0();
                }
                this.f3624c.f3765b.values().removeAll(Collections.singleton((Object) null));
                return z3;
            }
        }
    }

    /* renamed from: v */
    public final void mo3979v(C0898n nVar, boolean z) {
        if (!z || (this.f3643v != null && !this.f3615I)) {
            mo3976t(z);
            if (nVar.mo4002a(this.f3617K, this.f3618L)) {
                this.f3623b = true;
                try {
                    mo3944Y(this.f3617K, this.f3618L);
                } finally {
                    mo3954e();
                }
            }
            mo3967k0();
            if (this.f3616J) {
                this.f3616J = false;
                mo3961h0();
            }
            this.f3624c.f3765b.values().removeAll(Collections.singleton((Object) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014f, code lost:
        r6 = r2;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3980w(java.util.ArrayList<androidx.fragment.app.C0909a> r19, java.util.ArrayList<java.lang.Boolean> r20, int r21, int r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            java.lang.Object r5 = r1.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0909a) r5
            boolean r5 = r5.f3786p
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.f3619M
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f3619M = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.f3619M
            androidx.fragment.app.g0 r7 = r0.f3624c
            java.util.List r7 = r7.mo4104f()
            r6.addAll(r7)
            androidx.fragment.app.Fragment r6 = r0.f3646y
            r7 = 0
            r8 = r3
        L_0x0030:
            r9 = 2
            r10 = 1
            if (r8 >= r4) goto L_0x0174
            java.lang.Object r11 = r1.get(r8)
            androidx.fragment.app.a r11 = (androidx.fragment.app.C0909a) r11
            java.lang.Object r12 = r2.get(r8)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0127
            java.util.ArrayList<androidx.fragment.app.Fragment> r12 = r0.f3619M
            r13 = 0
        L_0x0049:
            java.util.ArrayList<androidx.fragment.app.h0$a> r14 = r11.f3771a
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x0160
            java.util.ArrayList<androidx.fragment.app.h0$a> r14 = r11.f3771a
            java.lang.Object r14 = r14.get(r13)
            androidx.fragment.app.h0$a r14 = (androidx.fragment.app.C0932h0.C0933a) r14
            int r15 = r14.f3788a
            if (r15 == r10) goto L_0x0114
            r10 = 9
            if (r15 == r9) goto L_0x009c
            r9 = 3
            if (r15 == r9) goto L_0x0083
            r9 = 6
            if (r15 == r9) goto L_0x0083
            r9 = 7
            if (r15 == r9) goto L_0x0114
            r9 = 8
            if (r15 == r9) goto L_0x0070
            goto L_0x0109
        L_0x0070:
            java.util.ArrayList<androidx.fragment.app.h0$a> r9 = r11.f3771a
            androidx.fragment.app.h0$a r15 = new androidx.fragment.app.h0$a
            r15.<init>((int) r10, (androidx.fragment.app.Fragment) r6)
            r9.add(r13, r15)
            r6 = 1
            r14.f3790c = r6
            int r13 = r13 + 1
            androidx.fragment.app.Fragment r6 = r14.f3789b
            goto L_0x0109
        L_0x0083:
            androidx.fragment.app.Fragment r9 = r14.f3789b
            r12.remove(r9)
            androidx.fragment.app.Fragment r9 = r14.f3789b
            if (r9 != r6) goto L_0x0109
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r11.f3771a
            androidx.fragment.app.h0$a r14 = new androidx.fragment.app.h0$a
            r14.<init>((androidx.fragment.app.Fragment) r9, (int) r10)
            r6.add(r13, r14)
            int r13 = r13 + 1
            r6 = 1
            r9 = 0
            goto L_0x011c
        L_0x009c:
            androidx.fragment.app.Fragment r9 = r14.f3789b
            int r10 = r9.mContainerId
            int r15 = r12.size()
            int r15 = r15 + -1
            r16 = 0
        L_0x00a8:
            if (r15 < 0) goto L_0x0100
            java.lang.Object r17 = r12.get(r15)
            r3 = r17
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            int r2 = r3.mContainerId
            if (r2 != r10) goto L_0x00f5
            if (r3 != r9) goto L_0x00be
            r2 = 1
            r17 = r10
            r16 = 1
            goto L_0x00f7
        L_0x00be:
            if (r3 != r6) goto L_0x00d2
            java.util.ArrayList<androidx.fragment.app.h0$a> r2 = r11.f3771a
            androidx.fragment.app.h0$a r6 = new androidx.fragment.app.h0$a
            r17 = r10
            r10 = 9
            r6.<init>((int) r10, (androidx.fragment.app.Fragment) r3)
            r2.add(r13, r6)
            int r13 = r13 + 1
            r6 = 0
            goto L_0x00d4
        L_0x00d2:
            r17 = r10
        L_0x00d4:
            androidx.fragment.app.h0$a r2 = new androidx.fragment.app.h0$a
            r10 = 3
            r2.<init>((int) r10, (androidx.fragment.app.Fragment) r3)
            int r10 = r14.f3791d
            r2.f3791d = r10
            int r10 = r14.f3793f
            r2.f3793f = r10
            int r10 = r14.f3792e
            r2.f3792e = r10
            int r10 = r14.f3794g
            r2.f3794g = r10
            java.util.ArrayList<androidx.fragment.app.h0$a> r10 = r11.f3771a
            r10.add(r13, r2)
            r12.remove(r3)
            int r13 = r13 + 1
            goto L_0x00f7
        L_0x00f5:
            r17 = r10
        L_0x00f7:
            int r15 = r15 + -1
            r2 = r20
            r3 = r21
            r10 = r17
            goto L_0x00a8
        L_0x0100:
            if (r16 == 0) goto L_0x010b
            java.util.ArrayList<androidx.fragment.app.h0$a> r2 = r11.f3771a
            r2.remove(r13)
            int r13 = r13 + -1
        L_0x0109:
            r2 = 1
            goto L_0x011a
        L_0x010b:
            r2 = 1
            r14.f3788a = r2
            r14.f3790c = r2
            r12.add(r9)
            goto L_0x011a
        L_0x0114:
            r2 = 1
            androidx.fragment.app.Fragment r3 = r14.f3789b
            r12.add(r3)
        L_0x011a:
            r9 = r6
            r6 = 1
        L_0x011c:
            int r13 = r13 + r6
            r2 = 2
            r10 = 1
            r2 = r20
            r3 = r21
            r6 = r9
            r9 = 2
            goto L_0x0049
        L_0x0127:
            r2 = 1
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r0.f3619M
            java.util.ArrayList<androidx.fragment.app.h0$a> r9 = r11.f3771a
            int r9 = r9.size()
            int r9 = r9 - r2
        L_0x0131:
            if (r9 < 0) goto L_0x0160
            java.util.ArrayList<androidx.fragment.app.h0$a> r10 = r11.f3771a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.h0$a r10 = (androidx.fragment.app.C0932h0.C0933a) r10
            int r12 = r10.f3788a
            if (r12 == r2) goto L_0x0157
            r2 = 3
            if (r12 == r2) goto L_0x0151
            switch(r12) {
                case 6: goto L_0x0151;
                case 7: goto L_0x0157;
                case 8: goto L_0x014e;
                case 9: goto L_0x014b;
                case 10: goto L_0x0146;
                default: goto L_0x0145;
            }
        L_0x0145:
            goto L_0x015c
        L_0x0146:
            androidx.lifecycle.Lifecycle$State r2 = r10.f3795h
            r10.f3796i = r2
            goto L_0x015c
        L_0x014b:
            androidx.fragment.app.Fragment r2 = r10.f3789b
            goto L_0x014f
        L_0x014e:
            r2 = 0
        L_0x014f:
            r6 = r2
            goto L_0x015c
        L_0x0151:
            androidx.fragment.app.Fragment r2 = r10.f3789b
            r3.add(r2)
            goto L_0x015c
        L_0x0157:
            androidx.fragment.app.Fragment r2 = r10.f3789b
            r3.remove(r2)
        L_0x015c:
            int r9 = r9 + -1
            r2 = 1
            goto L_0x0131
        L_0x0160:
            if (r7 != 0) goto L_0x016a
            boolean r2 = r11.f3777g
            if (r2 == 0) goto L_0x0167
            goto L_0x016a
        L_0x0167:
            r2 = 0
            r7 = 0
            goto L_0x016c
        L_0x016a:
            r2 = 1
            r7 = 1
        L_0x016c:
            int r8 = r8 + 1
            r2 = r20
            r3 = r21
            goto L_0x0030
        L_0x0174:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r0.f3619M
            r2.clear()
            if (r5 != 0) goto L_0x01b1
            int r2 = r0.f3642u
            r3 = 1
            if (r2 < r3) goto L_0x01b1
            r2 = r21
        L_0x0182:
            if (r2 >= r4) goto L_0x01b1
            java.lang.Object r3 = r1.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0909a) r3
            java.util.ArrayList<androidx.fragment.app.h0$a> r3 = r3.f3771a
            java.util.Iterator r3 = r3.iterator()
        L_0x0190:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01ae
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.h0$a r5 = (androidx.fragment.app.C0932h0.C0933a) r5
            androidx.fragment.app.Fragment r5 = r5.f3789b
            if (r5 == 0) goto L_0x0190
            androidx.fragment.app.FragmentManager r6 = r5.mFragmentManager
            if (r6 == 0) goto L_0x0190
            androidx.fragment.app.e0 r5 = r0.mo3958g(r5)
            androidx.fragment.app.g0 r6 = r0.f3624c
            r6.mo4105g(r5)
            goto L_0x0190
        L_0x01ae:
            int r2 = r2 + 1
            goto L_0x0182
        L_0x01b1:
            r2 = r21
        L_0x01b3:
            if (r2 >= r4) goto L_0x0401
            java.lang.Object r3 = r1.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0909a) r3
            r5 = r20
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r8 = "Unknown cmd: "
            if (r6 == 0) goto L_0x02f6
            r6 = -1
            r3.mo4042h(r6)
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r3.f3771a
            int r6 = r6.size()
            r9 = 1
            int r6 = r6 - r9
        L_0x01d7:
            if (r6 < 0) goto L_0x03fd
            java.util.ArrayList<androidx.fragment.app.h0$a> r10 = r3.f3771a
            java.lang.Object r10 = r10.get(r6)
            androidx.fragment.app.h0$a r10 = (androidx.fragment.app.C0932h0.C0933a) r10
            androidx.fragment.app.Fragment r11 = r10.f3789b
            if (r11 == 0) goto L_0x0218
            r12 = 0
            r11.mBeingSaved = r12
            r11.setPopDirection(r9)
            int r9 = r3.f3776f
            r12 = 4097(0x1001, float:5.741E-42)
            r13 = 8197(0x2005, float:1.1486E-41)
            r14 = 8194(0x2002, float:1.1482E-41)
            r15 = 4099(0x1003, float:5.744E-42)
            if (r9 == r12) goto L_0x020c
            if (r9 == r14) goto L_0x020e
            if (r9 == r13) goto L_0x0209
            if (r9 == r15) goto L_0x0206
            r12 = 4100(0x1004, float:5.745E-42)
            if (r9 == r12) goto L_0x0203
            r12 = 0
            goto L_0x020e
        L_0x0203:
            r12 = 8197(0x2005, float:1.1486E-41)
            goto L_0x020e
        L_0x0206:
            r12 = 4099(0x1003, float:5.744E-42)
            goto L_0x020e
        L_0x0209:
            r12 = 4100(0x1004, float:5.745E-42)
            goto L_0x020e
        L_0x020c:
            r12 = 8194(0x2002, float:1.1482E-41)
        L_0x020e:
            r11.setNextTransition(r12)
            java.util.ArrayList<java.lang.String> r9 = r3.f3785o
            java.util.ArrayList<java.lang.String> r12 = r3.f3784n
            r11.setSharedElementNames(r9, r12)
        L_0x0218:
            int r9 = r10.f3788a
            switch(r9) {
                case 1: goto L_0x02db;
                case 2: goto L_0x021d;
                case 3: goto L_0x02ca;
                case 4: goto L_0x02a2;
                case 5: goto L_0x0272;
                case 6: goto L_0x0260;
                case 7: goto L_0x0248;
                case 8: goto L_0x0240;
                case 9: goto L_0x0239;
                case 10: goto L_0x0230;
                default: goto L_0x021d;
            }
        L_0x021d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r8)
            int r3 = r10.f3788a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0230:
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            androidx.lifecycle.Lifecycle$State r10 = r10.f3795h
            r9.mo3955e0(r11, r10)
            goto L_0x02f1
        L_0x0239:
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r9.mo3957f0(r11)
            goto L_0x02f1
        L_0x0240:
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r10 = 0
            r9.mo3957f0(r10)
            goto L_0x02f1
        L_0x0248:
            int r9 = r10.f3791d
            int r12 = r10.f3792e
            int r13 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r9, r12, r13, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r10 = 1
            r9.mo3953d0(r11, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r9.mo3960h(r11)
            goto L_0x02f1
        L_0x0260:
            int r9 = r10.f3791d
            int r12 = r10.f3792e
            int r13 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r9, r12, r13, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r9.mo3952d(r11)
            goto L_0x02f1
        L_0x0272:
            int r9 = r10.f3791d
            int r12 = r10.f3792e
            int r13 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r9, r12, r13, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r10 = 1
            r9.mo3953d0(r11, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r9.getClass()
            r10 = 2
            boolean r10 = m2590J(r10)
            if (r10 == 0) goto L_0x0292
            java.util.Objects.toString(r11)
        L_0x0292:
            boolean r10 = r11.mHidden
            if (r10 != 0) goto L_0x02f1
            r10 = 1
            r11.mHidden = r10
            boolean r12 = r11.mHiddenChanged
            r10 = r10 ^ r12
            r11.mHiddenChanged = r10
            r9.mo3959g0(r11)
            goto L_0x02f1
        L_0x02a2:
            int r9 = r10.f3791d
            int r12 = r10.f3792e
            int r13 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r9, r12, r13, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r9.getClass()
            r9 = 2
            boolean r9 = m2590J(r9)
            if (r9 == 0) goto L_0x02bc
            java.util.Objects.toString(r11)
        L_0x02bc:
            boolean r9 = r11.mHidden
            if (r9 == 0) goto L_0x02f1
            r9 = 0
            r11.mHidden = r9
            boolean r9 = r11.mHiddenChanged
            r9 = r9 ^ 1
            r11.mHiddenChanged = r9
            goto L_0x02f1
        L_0x02ca:
            int r9 = r10.f3791d
            int r12 = r10.f3792e
            int r13 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r9, r12, r13, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r9.mo3946a(r11)
            goto L_0x02f1
        L_0x02db:
            int r9 = r10.f3791d
            int r12 = r10.f3792e
            int r13 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r9, r12, r13, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r10 = 1
            r9.mo3953d0(r11, r10)
            androidx.fragment.app.FragmentManager r9 = r3.f3707r
            r9.mo3943X(r11)
        L_0x02f1:
            int r6 = r6 + -1
            r9 = 1
            goto L_0x01d7
        L_0x02f6:
            r6 = 1
            r3.mo4042h(r6)
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r3.f3771a
            int r6 = r6.size()
            r9 = 0
        L_0x0301:
            if (r9 >= r6) goto L_0x03fd
            java.util.ArrayList<androidx.fragment.app.h0$a> r10 = r3.f3771a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.h0$a r10 = (androidx.fragment.app.C0932h0.C0933a) r10
            androidx.fragment.app.Fragment r11 = r10.f3789b
            if (r11 == 0) goto L_0x0321
            r12 = 0
            r11.mBeingSaved = r12
            r11.setPopDirection(r12)
            int r12 = r3.f3776f
            r11.setNextTransition(r12)
            java.util.ArrayList<java.lang.String> r12 = r3.f3784n
            java.util.ArrayList<java.lang.String> r13 = r3.f3785o
            r11.setSharedElementNames(r12, r13)
        L_0x0321:
            int r12 = r10.f3788a
            switch(r12) {
                case 1: goto L_0x03e3;
                case 2: goto L_0x0326;
                case 3: goto L_0x03d2;
                case 4: goto L_0x03a8;
                case 5: goto L_0x037b;
                case 6: goto L_0x0369;
                case 7: goto L_0x0351;
                case 8: goto L_0x034a;
                case 9: goto L_0x0342;
                case 10: goto L_0x0339;
                default: goto L_0x0326;
            }
        L_0x0326:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r8)
            int r3 = r10.f3788a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0339:
            androidx.fragment.app.FragmentManager r12 = r3.f3707r
            androidx.lifecycle.Lifecycle$State r10 = r10.f3796i
            r12.mo3955e0(r11, r10)
            goto L_0x03f9
        L_0x0342:
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r11 = 0
            r10.mo3957f0(r11)
            goto L_0x03f9
        L_0x034a:
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r10.mo3957f0(r11)
            goto L_0x03f9
        L_0x0351:
            int r12 = r10.f3791d
            int r13 = r10.f3792e
            int r14 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r12, r13, r14, r10)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r12 = 0
            r10.mo3953d0(r11, r12)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r10.mo3952d(r11)
            goto L_0x03f9
        L_0x0369:
            int r12 = r10.f3791d
            int r13 = r10.f3792e
            int r14 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r12, r13, r14, r10)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r10.mo3960h(r11)
            goto L_0x03f9
        L_0x037b:
            int r12 = r10.f3791d
            int r13 = r10.f3792e
            int r14 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r12, r13, r14, r10)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r12 = 0
            r10.mo3953d0(r11, r12)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r10.getClass()
            r10 = 2
            boolean r10 = m2590J(r10)
            if (r10 == 0) goto L_0x039b
            java.util.Objects.toString(r11)
        L_0x039b:
            boolean r10 = r11.mHidden
            if (r10 == 0) goto L_0x03f9
            r11.mHidden = r12
            boolean r10 = r11.mHiddenChanged
            r10 = r10 ^ 1
            r11.mHiddenChanged = r10
            goto L_0x03f9
        L_0x03a8:
            int r12 = r10.f3791d
            int r13 = r10.f3792e
            int r14 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r12, r13, r14, r10)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r10.getClass()
            r12 = 2
            boolean r12 = m2590J(r12)
            if (r12 == 0) goto L_0x03c2
            java.util.Objects.toString(r11)
        L_0x03c2:
            boolean r12 = r11.mHidden
            if (r12 != 0) goto L_0x03f9
            r12 = 1
            r11.mHidden = r12
            boolean r13 = r11.mHiddenChanged
            r12 = r12 ^ r13
            r11.mHiddenChanged = r12
            r10.mo3959g0(r11)
            goto L_0x03f9
        L_0x03d2:
            int r12 = r10.f3791d
            int r13 = r10.f3792e
            int r14 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r12, r13, r14, r10)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r10.mo3943X(r11)
            goto L_0x03f9
        L_0x03e3:
            int r12 = r10.f3791d
            int r13 = r10.f3792e
            int r14 = r10.f3793f
            int r10 = r10.f3794g
            r11.setAnimations(r12, r13, r14, r10)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r12 = 0
            r10.mo3953d0(r11, r12)
            androidx.fragment.app.FragmentManager r10 = r3.f3707r
            r10.mo3946a(r11)
        L_0x03f9:
            int r9 = r9 + 1
            goto L_0x0301
        L_0x03fd:
            int r2 = r2 + 1
            goto L_0x01b3
        L_0x0401:
            r5 = r20
            int r2 = r4 + -1
            java.lang.Object r2 = r5.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = r21
        L_0x0411:
            if (r3 >= r4) goto L_0x045c
            java.lang.Object r6 = r1.get(r3)
            androidx.fragment.app.a r6 = (androidx.fragment.app.C0909a) r6
            if (r2 == 0) goto L_0x043b
            java.util.ArrayList<androidx.fragment.app.h0$a> r8 = r6.f3771a
            int r8 = r8.size()
            int r8 = r8 + -1
        L_0x0423:
            if (r8 < 0) goto L_0x0459
            java.util.ArrayList<androidx.fragment.app.h0$a> r9 = r6.f3771a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.h0$a r9 = (androidx.fragment.app.C0932h0.C0933a) r9
            androidx.fragment.app.Fragment r9 = r9.f3789b
            if (r9 == 0) goto L_0x0438
            androidx.fragment.app.e0 r9 = r0.mo3958g(r9)
            r9.mo4086j()
        L_0x0438:
            int r8 = r8 + -1
            goto L_0x0423
        L_0x043b:
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r6.f3771a
            java.util.Iterator r6 = r6.iterator()
        L_0x0441:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0459
            java.lang.Object r8 = r6.next()
            androidx.fragment.app.h0$a r8 = (androidx.fragment.app.C0932h0.C0933a) r8
            androidx.fragment.app.Fragment r8 = r8.f3789b
            if (r8 == 0) goto L_0x0441
            androidx.fragment.app.e0 r8 = r0.mo3958g(r8)
            r8.mo4086j()
            goto L_0x0441
        L_0x0459:
            int r3 = r3 + 1
            goto L_0x0411
        L_0x045c:
            int r3 = r0.f3642u
            r6 = 1
            r0.mo3934O(r3, r6)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r6 = r21
        L_0x0469:
            if (r6 >= r4) goto L_0x049a
            java.lang.Object r8 = r1.get(r6)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0909a) r8
            java.util.ArrayList<androidx.fragment.app.h0$a> r8 = r8.f3771a
            java.util.Iterator r8 = r8.iterator()
        L_0x0477:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0497
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.h0$a r9 = (androidx.fragment.app.C0932h0.C0933a) r9
            androidx.fragment.app.Fragment r9 = r9.f3789b
            if (r9 == 0) goto L_0x0477
            android.view.ViewGroup r9 = r9.mContainer
            if (r9 == 0) goto L_0x0477
            androidx.fragment.app.s0 r10 = r18.mo3931I()
            androidx.fragment.app.SpecialEffectsController r9 = androidx.fragment.app.SpecialEffectsController.m2673g(r9, r10)
            r3.add(r9)
            goto L_0x0477
        L_0x0497:
            int r6 = r6 + 1
            goto L_0x0469
        L_0x049a:
            java.util.Iterator r3 = r3.iterator()
        L_0x049e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x04b3
            java.lang.Object r6 = r3.next()
            androidx.fragment.app.SpecialEffectsController r6 = (androidx.fragment.app.SpecialEffectsController) r6
            r6.f3690d = r2
            r6.mo4029h()
            r6.mo4026c()
            goto L_0x049e
        L_0x04b3:
            r2 = r21
        L_0x04b5:
            if (r2 >= r4) goto L_0x04f1
            java.lang.Object r3 = r1.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0909a) r3
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x04d0
            int r6 = r3.f3709t
            if (r6 < 0) goto L_0x04d0
            r6 = -1
            r3.f3709t = r6
        L_0x04d0:
            java.util.ArrayList<java.lang.Runnable> r6 = r3.f3787q
            if (r6 == 0) goto L_0x04ee
            r6 = 0
        L_0x04d5:
            java.util.ArrayList<java.lang.Runnable> r8 = r3.f3787q
            int r8 = r8.size()
            if (r6 >= r8) goto L_0x04eb
            java.util.ArrayList<java.lang.Runnable> r8 = r3.f3787q
            java.lang.Object r8 = r8.get(r6)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r8.run()
            int r6 = r6 + 1
            goto L_0x04d5
        L_0x04eb:
            r6 = 0
            r3.f3787q = r6
        L_0x04ee:
            int r2 = r2 + 1
            goto L_0x04b5
        L_0x04f1:
            if (r7 == 0) goto L_0x050e
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r1 = r0.f3634m
            if (r1 == 0) goto L_0x050e
            r1 = 0
        L_0x04f8:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r2 = r0.f3634m
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x050e
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r2 = r0.f3634m
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentManager$m r2 = (androidx.fragment.app.FragmentManager.C0897m) r2
            r2.onBackStackChanged()
            int r1 = r1 + 1
            goto L_0x04f8
        L_0x050e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo3980w(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: x */
    public final void mo3981x() {
        mo3978u(true);
        mo3924B();
    }

    /* renamed from: y */
    public final Fragment mo3982y(String str) {
        return this.f3624c.mo4100b(str);
    }

    /* renamed from: z */
    public final Fragment mo3983z(int i) {
        C0930g0 g0Var = this.f3624c;
        int size = g0Var.f3764a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = g0Var.f3764a.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (C0923e0 next : g0Var.f3765b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.f3743c;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0884a();

        /* renamed from: b */
        public String f3648b;

        /* renamed from: c */
        public int f3649c;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C0884a implements Parcelable.Creator<LaunchedFragmentInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            public final Object[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f3648b = str;
            this.f3649c = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3648b);
            parcel.writeInt(this.f3649c);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f3648b = parcel.readString();
            this.f3649c = parcel.readInt();
        }
    }
}
