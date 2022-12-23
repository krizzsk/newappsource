package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0202j;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0210e;
import androidx.activity.result.C0213f;
import androidx.lifecycle.C1034p0;
import androidx.lifecycle.C1035q;
import androidx.lifecycle.C1037q0;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p067e1.C4464a;
import p067e1.C4485f0;
import p067e1.C4487g0;
import p067e1.C4493i0;
import p067e1.C4501k0;
import p067e1.C4502l;
import p090g1.C4743b;
import p090g1.C4744c;
import p104h2.C5037a;
import p176n0.C5793l;
import p229r1.C6231a;
import p242s1.C6364i;
import p242s1.C6377n;
import p256t2.C6552c;
import p256t2.C6556e;

public class FragmentActivity extends ComponentActivity implements C4464a.C4469e, C4464a.C4470f {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final C1035q mFragmentLifecycleRegistry = new C1035q(this);
    public final C0963r mFragments = new C0963r(new C0882a());
    public boolean mResumed;
    public boolean mStopped = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C0882a extends C0969t<FragmentActivity> implements C4743b, C4744c, C4485f0, C4487g0, C1037q0, C0202j, C0213f, C6556e, C0919c0, C6364i {
        public C0882a() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public final void mo3899a(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        public final void addMenuProvider(C6377n nVar) {
            FragmentActivity.this.addMenuProvider(nVar);
        }

        public final void addOnConfigurationChangedListener(C6231a<Configuration> aVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(aVar);
        }

        public final void addOnMultiWindowModeChangedListener(C6231a<C4502l> aVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(aVar);
        }

        public final void addOnPictureInPictureModeChangedListener(C6231a<C4493i0> aVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        public final void addOnTrimMemoryListener(C6231a<Integer> aVar) {
            FragmentActivity.this.addOnTrimMemoryListener(aVar);
        }

        /* renamed from: b */
        public final View mo3876b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: c */
        public final boolean mo3877c() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final void mo3900d(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", (FileDescriptor) null, printWriter, strArr);
        }

        /* renamed from: e */
        public final FragmentActivity mo3901e() {
            return FragmentActivity.this;
        }

        /* renamed from: f */
        public final LayoutInflater mo3902f() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: g */
        public final boolean mo3903g(String str) {
            return C4464a.m11674b(FragmentActivity.this, str);
        }

        public final C0210e getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        public final C6552c getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        public final C1034p0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        /* renamed from: h */
        public final void mo3904h() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        public final void removeMenuProvider(C6377n nVar) {
            FragmentActivity.this.removeMenuProvider(nVar);
        }

        public final void removeOnConfigurationChangedListener(C6231a<Configuration> aVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(aVar);
        }

        public final void removeOnMultiWindowModeChangedListener(C6231a<C4502l> aVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        public final void removeOnPictureInPictureModeChangedListener(C6231a<C4493i0> aVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        public final void removeOnTrimMemoryListener(C6231a<Integer> aVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public FragmentActivity() {
        init();
    }

    private void init() {
        getSavedStateRegistry().mo22665c(LIFECYCLE_TAG, new C0949m(this));
        addOnConfigurationChangedListener(new C0951n(this, 0));
        addOnNewIntentListener(new C5793l(this, 1));
        addOnContextAvailableListener(new C0953o(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo4319f(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.mo4185a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.mo4185a();
    }

    /* access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        C0969t<?> tVar = this.mFragments.f3846a;
        tVar.f3856e.mo3950c(tVar, tVar, (Fragment) null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment next : fragmentManager.mo3930H()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), state);
                }
                C0958p0 p0Var = next.mViewLifecycleOwner;
                if (p0Var != null) {
                    p0Var.mo4179b();
                    if (p0Var.f3842e.f3971c.isAtLeast(Lifecycle.State.STARTED)) {
                        next.mViewLifecycleOwner.f3842e.mo4321h(state);
                        z = true;
                    }
                }
                if (next.mLifecycleRegistry.f3971c.isAtLeast(Lifecycle.State.STARTED)) {
                    next.mLifecycleRegistry.mo4321h(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f3846a.f3856e.f3627f.onCreateView(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                C5037a.m12866a(this).mo20765d(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f3846a.f3856e.mo3974r(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f3846a.f3856e;
    }

    @Deprecated
    public C5037a getSupportLoaderManager() {
        return C5037a.m12866a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo4185a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo4319f(Lifecycle.Event.ON_CREATE);
        C0910a0 a0Var = this.mFragments.f3846a.f3856e;
        a0Var.f3613G = false;
        a0Var.f3614H = false;
        a0Var.f3620N.f3725g = false;
        a0Var.mo3973q(1);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f3846a.f3856e.mo3966k();
        this.mFragmentLifecycleRegistry.mo4319f(Lifecycle.Event.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f3846a.f3856e.mo3962i(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f3846a.f3856e.mo3973q(5);
        this.mFragmentLifecycleRegistry.mo4319f(Lifecycle.Event.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo4185a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.mFragments.mo4185a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f3846a.f3856e.mo3978u(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo4319f(Lifecycle.Event.ON_RESUME);
        C0910a0 a0Var = this.mFragments.f3846a.f3856e;
        a0Var.f3613G = false;
        a0Var.f3614H = false;
        a0Var.f3620N.f3725g = false;
        a0Var.mo3973q(7);
    }

    public void onStart() {
        this.mFragments.mo4185a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C0910a0 a0Var = this.mFragments.f3846a.f3856e;
            a0Var.f3613G = false;
            a0Var.f3614H = false;
            a0Var.f3620N.f3725g = false;
            a0Var.mo3973q(4);
        }
        this.mFragments.f3846a.f3856e.mo3978u(true);
        this.mFragmentLifecycleRegistry.mo4319f(Lifecycle.Event.ON_START);
        C0910a0 a0Var2 = this.mFragments.f3846a.f3856e;
        a0Var2.f3613G = false;
        a0Var2.f3614H = false;
        a0Var2.f3620N.f3725g = false;
        a0Var2.mo3973q(5);
    }

    public void onStateNotSaved() {
        this.mFragments.mo4185a();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C0910a0 a0Var = this.mFragments.f3846a.f3856e;
        a0Var.f3614H = true;
        a0Var.f3620N.f3725g = true;
        a0Var.mo3973q(4);
        this.mFragmentLifecycleRegistry.mo4319f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(C4501k0 k0Var) {
        int i = C4464a.f15531a;
        C4464a.C4467c.m11680c(this, (SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(C4501k0 k0Var) {
        int i = C4464a.f15531a;
        C4464a.C4467c.m11681d(this, (SharedElementCallback) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            int i5 = C4464a.f15531a;
            C4464a.C4466b.m11677c(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void supportFinishAfterTransition() {
        int i = C4464a.f15531a;
        C4464a.C4467c.m11678a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = C4464a.f15531a;
        C4464a.C4467c.m11679b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i = C4464a.f15531a;
        C4464a.C4467c.m11682e(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            int i2 = C4464a.f15531a;
            C4464a.C4466b.m11676b(this, intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, i, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        init();
    }
}
