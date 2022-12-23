package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.C0206a;
import androidx.activity.result.C0207b;
import androidx.activity.result.C0210e;
import androidx.activity.result.C0213f;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.C1007f0;
import androidx.lifecycle.C1010h;
import androidx.lifecycle.C1024m0;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1034p0;
import androidx.lifecycle.C1035q;
import androidx.lifecycle.C1037q0;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24362h;
import p065e.C4410a;
import p067e1.C4464a;
import p067e1.C4501k0;
import p080f2.C4646a;
import p090g1.C4732a;
import p091g2.C4746a;
import p091g2.C4749c;
import p091g2.C4750d;
import p104h2.C5037a;
import p104h2.C5039b;
import p227r.C6227a;
import p256t2.C6550a;
import p256t2.C6552c;
import p256t2.C6555d;
import p256t2.C6556e;
import p358af.C13437d;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C1033p, C1037q0, C1010h, C6556e {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C0880j mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public C1026n0.C1028b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public C0969t<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C1035q mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<C0881k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final C0881k mSavedStateAttachListener;
    public C6555d mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C0958p0 mViewLifecycleOwner;
    public C1043v<C1033p> mViewLifecycleOwnerLiveData;
    public String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C0871a extends C0207b<I> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f3570a;

        public C0871a(AtomicReference atomicReference) {
            this.f3570a = atomicReference;
        }

        /* renamed from: a */
        public final void mo772a(Object obj) {
            C0207b bVar = (C0207b) this.f3570a.get();
            if (bVar != null) {
                bVar.mo772a(obj);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: b */
        public final void mo773b() {
            C0207b bVar = (C0207b) this.f3570a.getAndSet((Object) null);
            if (bVar != null) {
                bVar.mo773b();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class C0872b implements Runnable {
        public C0872b() {
        }

        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C0873c extends C0881k {
        public C0873c() {
        }

        /* renamed from: a */
        public final void mo3873a() {
            Fragment.this.mSavedStateRegistryController.mo22667a();
            SavedStateHandleSupport.m2850b(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public class C0874d implements Runnable {
        public C0874d() {
        }

        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public class C0875e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ SpecialEffectsController f3574b;

        public C0875e(SpecialEffectsController specialEffectsController) {
            this.f3574b = specialEffectsController;
        }

        public final void run() {
            this.f3574b.mo4026c();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public class C0876f extends C0959q {
        public C0876f() {
        }

        /* renamed from: b */
        public final View mo3876b(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder k = C13555b.m33972k("Fragment ");
            k.append(Fragment.this);
            k.append(" does not have a view");
            throw new IllegalStateException(k.toString());
        }

        /* renamed from: c */
        public final boolean mo3877c() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    public class C0877g implements C6227a<Void, C0210e> {
        public C0877g() {
        }

        public final Object apply(Object obj) {
            Void voidR = (Void) obj;
            Fragment fragment = Fragment.this;
            C0969t<?> tVar = fragment.mHost;
            if (tVar instanceof C0213f) {
                return ((C0213f) tVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public class C0878h implements C6227a<Void, C0210e> {

        /* renamed from: b */
        public final /* synthetic */ C0210e f3577b;

        public C0878h(C0210e eVar) {
            this.f3577b = eVar;
        }

        public final Object apply(Object obj) {
            Void voidR = (Void) obj;
            return this.f3577b;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public class C0879i extends C0881k {

        /* renamed from: a */
        public final /* synthetic */ C6227a f3578a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f3579b;

        /* renamed from: c */
        public final /* synthetic */ C4410a f3580c;

        /* renamed from: d */
        public final /* synthetic */ C0206a f3581d;

        public C0879i(C6227a aVar, AtomicReference atomicReference, C4410a aVar2, C0206a aVar3) {
            this.f3578a = aVar;
            this.f3579b = atomicReference;
            this.f3580c = aVar2;
            this.f3581d = aVar3;
        }

        /* renamed from: a */
        public final void mo3873a() {
            this.f3579b.set(((C0210e) this.f3578a.apply(null)).mo775c(Fragment.this.generateActivityResultKey(), Fragment.this, this.f3580c, this.f3581d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public static class C0880j {

        /* renamed from: a */
        public boolean f3583a;

        /* renamed from: b */
        public int f3584b;

        /* renamed from: c */
        public int f3585c;

        /* renamed from: d */
        public int f3586d;

        /* renamed from: e */
        public int f3587e;

        /* renamed from: f */
        public int f3588f;

        /* renamed from: g */
        public ArrayList<String> f3589g;

        /* renamed from: h */
        public ArrayList<String> f3590h;

        /* renamed from: i */
        public Object f3591i = null;

        /* renamed from: j */
        public Object f3592j;

        /* renamed from: k */
        public Object f3593k;

        /* renamed from: l */
        public Object f3594l;

        /* renamed from: m */
        public Object f3595m;

        /* renamed from: n */
        public Object f3596n;

        /* renamed from: o */
        public Boolean f3597o;

        /* renamed from: p */
        public Boolean f3598p;

        /* renamed from: q */
        public float f3599q;

        /* renamed from: r */
        public View f3600r;

        /* renamed from: s */
        public boolean f3601s;

        public C0880j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f3592j = obj;
            this.f3593k = null;
            this.f3594l = obj;
            this.f3595m = null;
            this.f3596n = obj;
            this.f3599q = 1.0f;
            this.f3600r = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    public static abstract class C0881k {
        /* renamed from: a */
        public abstract void mo3873a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0910a0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C0872b();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C1043v<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C0873c();
        initLifecycle();
    }

    private C0880j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0880j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        if (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return state.ordinal();
        }
        return Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C1035q(this);
        this.mSavedStateRegistryController = new C6555d(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private <I, O> C0207b<I> prepareCallInternal(C4410a<I, O> aVar, C6227a<Void, C0210e> aVar2, C0206a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C0879i(aVar2, atomicReference, aVar, aVar3));
            return new C0871a(atomicReference);
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(C0881k kVar) {
        if (this.mState >= 0) {
            kVar.mo3873a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0880j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f3601s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            SpecialEffectsController g = SpecialEffectsController.m2673g(viewGroup, fragmentManager.mo3931I());
            g.mo4029h();
            if (z) {
                this.mHost.f3855d.post(new C0875e(g));
            } else {
                g.mo4026c();
            }
        }
    }

    public C0959q createFragmentContainer() {
        return new C0876f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            C5037a.m12866a(this).mo20765d(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.mo3974r(C25541a.m63881k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f3624c.mo4101c(str);
    }

    public String generateActivityResultKey() {
        StringBuilder k = C13555b.m33972k("fragment_");
        k.append(this.mWho);
        k.append("_rq#");
        k.append(this.mNextLocalRequestCode.getAndIncrement());
        return k.toString();
    }

    public final FragmentActivity getActivity() {
        C0969t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return (FragmentActivity) tVar.f3853b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f3598p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f3597o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        C0969t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return tVar.f3854c;
    }

    public C4746a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.m2590J(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        C4749c cVar = new C4749c();
        if (application != null) {
            cVar.f16032a.put(C1024m0.f3961a, application);
        }
        cVar.f16032a.put(SavedStateHandleSupport.f3897a, this);
        cVar.f16032a.put(SavedStateHandleSupport.f3898b, this);
        if (getArguments() != null) {
            cVar.f16032a.put(SavedStateHandleSupport.f3899c, getArguments());
        }
        return cVar;
    }

    public C1026n0.C1028b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m2590J(3)) {
                    Objects.toString(requireContext().getApplicationContext());
                }
                this.mDefaultFactory = new C1007f0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3584b;
    }

    public Object getEnterTransition() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3591i;
    }

    public C4501k0 getEnterTransitionCallback() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public int getExitAnim() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3585c;
    }

    public Object getExitTransition() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3593k;
    }

    public C4501k0 getExitTransitionCallback() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public View getFocusedView() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3600r;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C0969t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return tVar.mo3901e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public C5037a getLoaderManager() {
        return C5037a.m12866a(this);
    }

    public int getNextTransition() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3588f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f3583a;
    }

    public int getPopEnterAnim() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3586d;
    }

    public int getPopExitAnim() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3587e;
    }

    public float getPostOnViewCreatedAlpha() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f3599q;
    }

    public Object getReenterTransition() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3594l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        FragmentStrictMode.m2798c(getRetainInstanceUsageViolation);
        FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(this);
        if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.m2801f(a, getClass(), GetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.m2797b(a, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3592j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    public final C6552c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f20364b;
    }

    public Object getSharedElementEnterTransition() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3595m;
    }

    public Object getSharedElementReturnTransition() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3596n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f3589g) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f3590h) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        FragmentStrictMode.m2798c(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(this);
        if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.m2801f(a, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            FragmentStrictMode.m2797b(a, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C1033p getViewLifecycleOwner() {
        C0958p0 p0Var = this.mViewLifecycleOwner;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<C1033p> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public C1034p0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            C0916b0 b0Var = this.mFragmentManager.f3620N;
            C1034p0 p0Var = b0Var.f3722d.get(this.mWho);
            if (p0Var != null) {
                return p0Var;
            }
            C1034p0 p0Var2 = new C1034p0();
            b0Var.f3722d.put(this.mWho, p0Var2);
            return p0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0910a0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean z;
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (fragment == null) {
                z = false;
            } else {
                z = fragment.isHidden();
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean z;
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null) {
                z = true;
            } else {
                z = fragment.isMenuVisible();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        C0880j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f3601s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo3933N();
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo3935P();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.m2590J(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        C0969t<?> tVar = this.mHost;
        if (tVar == null) {
            activity = null;
        } else {
            activity = tVar.f3853b;
        }
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f3642u >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fragmentManager.f3613G = false;
            fragmentManager.f3614H = false;
            fragmentManager.f3620N.f3725g = false;
            fragmentManager.mo3973q(1);
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        C0969t<?> tVar = this.mHost;
        if (tVar == null) {
            activity = null;
        } else {
            activity = tVar.f3853b;
        }
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo3935P();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f3613G = false;
            fragmentManager.f3614H = false;
            fragmentManager.f3620N.f3725g = false;
            fragmentManager.mo3973q(4);
            return;
        }
        throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<C0881k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo3873a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.mo3950c(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f3854c);
        if (this.mCalled) {
            Iterator<C0919c0> it2 = this.mFragmentManager.f3636o.iterator();
            while (it2.hasNext()) {
                it2.next().mo3899a(this);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f3613G = false;
            fragmentManager.f3614H = false;
            fragmentManager.f3620N.f3725g = false;
            fragmentManager.mo3973q(0);
            return;
        }
        throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.mo3962i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo3935P();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo4224a(new C1025n() {
            /* renamed from: f */
            public final void mo740f(C1033p pVar, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.mo22668b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4319f(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.mo3964j(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.mo3935P();
        boolean z = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0958p0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo4179b();
            this.mView.setTag(C4646a.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(C4750d.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            View view = this.mView;
            C0958p0 p0Var = this.mViewLifecycleOwner;
            C24362h.m61211f(view, "<this>");
            view.setTag(C6550a.view_tree_saved_state_registry_owner, p0Var);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f3842e == null) {
            z = false;
        }
        if (!z) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.mo3966k();
        this.mLifecycleRegistry.mo4319f(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.mo3973q(1);
        if (this.mView != null) {
            C0958p0 p0Var = this.mViewLifecycleOwner;
            p0Var.mo4179b();
            if (p0Var.f3842e.f3971c.isAtLeast(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.mo4178a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C5039b.C5042c cVar = C5037a.m12866a(this).f17014b;
            int i = cVar.f17025b.f19973d;
            for (int i2 = 0; i2 < i; i2++) {
                ((C5039b.C5040a) cVar.f17025b.f19972c[i2]).mo20768b();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mChildFragmentManager;
            if (!fragmentManager.f3615I) {
                fragmentManager.mo3966k();
                this.mChildFragmentManager = new C0910a0();
                return;
            }
            return;
        }
        throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.mo3969m(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo3970n(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.mo3973q(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4178a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo4319f(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.mo3972p(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean M = FragmentManager.m2592M(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != M) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(M);
            onPrimaryNavigationFragmentChanged(M);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.mo3967k0();
            fragmentManager.mo3971o(fragmentManager.f3646y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.mo3935P();
        this.mChildFragmentManager.mo3978u(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C1035q qVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            qVar.mo4319f(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo4178a(event);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f3613G = false;
            fragmentManager.f3614H = false;
            fragmentManager.f3620N.f3725g = false;
            fragmentManager.mo3973q(7);
            return;
        }
        throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo22669c(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.mo3947a0());
    }

    public void performStart() {
        this.mChildFragmentManager.mo3935P();
        this.mChildFragmentManager.mo3978u(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C1035q qVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            qVar.mo4319f(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo4178a(event);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f3613G = false;
            fragmentManager.f3614H = false;
            fragmentManager.f3620N.f3725g = false;
            fragmentManager.mo3973q(5);
            return;
        }
        throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f3614H = true;
        fragmentManager.f3620N.f3725g = true;
        fragmentManager.mo3973q(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4178a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.mo4319f(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.mo3973q(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3601s = true;
    }

    public final <I, O> C0207b<I> registerForActivityResult(C4410a<I, O> aVar, C0206a<O> aVar2) {
        return prepareCallInternal(aVar, new C0877g(), aVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f3610D != null) {
                parentFragmentManager.f3611E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                parentFragmentManager.f3610D.mo772a(strArr);
                return;
            }
            parentFragmentManager.f3643v.getClass();
            return;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not attached to Activity"));
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.mo3945Z(parcelable);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f3613G = false;
            fragmentManager.f3614H = false;
            fragmentManager.f3620N.f3725g = false;
            fragmentManager.mo3973q(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            C0958p0 p0Var = this.mViewLifecycleOwner;
            p0Var.f3843f.mo22668b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException(C25541a.m63879i("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo4178a(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3598p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3597o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            ensureAnimationInfo().f3584b = i;
            ensureAnimationInfo().f3585c = i2;
            ensureAnimationInfo().f3586d = i3;
            ensureAnimationInfo().f3587e = i4;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(C4501k0 k0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f3591i = obj;
    }

    public void setExitSharedElementCallback(C4501k0 k0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f3593k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f3600r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo3904h();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.f3569b) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo3904h();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f3588f = i;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().f3583a = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f3599q = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f3594l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        FragmentStrictMode.m2798c(setRetainInstanceUsageViolation);
        FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(this);
        if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.m2801f(a, getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.m2797b(a, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.f3620N.mo4057a(this);
        } else {
            fragmentManager.f3620N.mo4059c(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f3592j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f3595m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0880j jVar = this.mAnimationInfo;
        jVar.f3589g = arrayList;
        jVar.f3590h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f3596n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, fragment, i);
            FragmentStrictMode.m2798c(setTargetFragmentUsageViolation);
            FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(this);
            if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.m2801f(a, getClass(), SetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.m2797b(a, setTargetFragmentUsageViolation);
            }
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 == null || fragmentManager == null || fragmentManager2 == fragmentManager) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException(C25541a.m63879i("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z);
        FragmentStrictMode.m2798c(setUserVisibleHintViolation);
        FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(this);
        if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && FragmentStrictMode.m2801f(a, getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.m2797b(a, setUserVisibleHintViolation);
        }
        boolean z2 = true;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            C0923e0 g = fragmentManager.mo3958g(this);
            Fragment fragment = g.f3743c;
            if (fragment.mDeferStart) {
                if (fragmentManager.f3623b) {
                    fragmentManager.f3616J = true;
                } else {
                    fragment.mDeferStart = false;
                    g.mo4086j();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 5 || z) {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C0969t<?> tVar = this.mHost;
        if (tVar != null) {
            return tVar.mo3903g(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        int i5 = i;
        Bundle bundle2 = bundle;
        if (this.mHost != null) {
            if (FragmentManager.m2590J(2)) {
                toString();
                Objects.toString(intentSender);
                Objects.toString(intent);
                Objects.toString(bundle);
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f3609C != null) {
                if (bundle2 != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    } else {
                        intent2 = intent;
                    }
                    if (FragmentManager.m2590J(2)) {
                        bundle.toString();
                        intent2.toString();
                        Objects.toString(this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                } else {
                    intent2 = intent;
                }
                IntentSender intentSender2 = intentSender;
                int i6 = i2;
                int i7 = i3;
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
                parentFragmentManager.f3611E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                if (FragmentManager.m2590J(2)) {
                    toString();
                }
                parentFragmentManager.f3609C.mo772a(intentSenderRequest);
                return;
            }
            IntentSender intentSender3 = intentSender;
            int i8 = i2;
            int i9 = i3;
            C0969t<?> tVar = parentFragmentManager.f3643v;
            if (i5 == -1) {
                Activity activity = tVar.f3853b;
                int i11 = C4464a.f15531a;
                C4464a.C4466b.m11677c(activity, intentSender, i, intent, i2, i3, i4, bundle);
                return;
            }
            tVar.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f3601s) {
            if (this.mHost == null) {
                ensureAnimationInfo().f3601s = false;
            } else if (Looper.myLooper() != this.mHost.f3855d.getLooper()) {
                this.mHost.f3855d.postAtFrontOfQueue(new C0874d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(RecyclerView.C1119a0.FLAG_IGNORE);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0870a();

        /* renamed from: b */
        public final Bundle f3569b;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C0870a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f3569b = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f3569b);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3569b = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode.C0968b bVar = FragmentStrictMode.f3849a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            FragmentStrictMode.m2798c(getTargetFragmentUsageViolation);
            FragmentStrictMode.C0968b a = FragmentStrictMode.m2796a(this);
            if (a.f3851a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.m2801f(a, getClass(), GetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.m2797b(a, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.mo3982y(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0965s.m2794c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new InstantiationException(C13437d.m33706k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException(C13437d.m33706k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException(C13437d.m33706k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException(C13437d.m33706k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f3601s = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.f3643v.f3855d;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> C0207b<I> registerForActivityResult(C4410a<I, O> aVar, C0210e eVar, C0206a<O> aVar2) {
        return prepareCallInternal(aVar, new C0878h(eVar), aVar2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0969t<?> tVar = this.mHost;
        if (tVar != null) {
            C4732a.startActivity(tVar.f3854c, intent, bundle);
            return;
        }
        throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f3608B != null) {
                parentFragmentManager.f3611E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.f3608B.mo772a(intent);
                return;
            }
            C0969t<?> tVar = parentFragmentManager.f3643v;
            if (i == -1) {
                C4732a.startActivity(tVar.f3854c, intent, bundle);
            } else {
                tVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        } else {
            throw new IllegalStateException(C25541a.m63879i("Fragment ", this, " not attached to Activity"));
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C0969t<?> tVar = this.mHost;
        if (tVar != null) {
            LayoutInflater f = tVar.mo3902f();
            f.setFactory2(this.mChildFragmentManager.f3627f);
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void restoreViewState() {
        if (FragmentManager.m2590J(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}
