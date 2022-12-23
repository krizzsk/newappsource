package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0206a;
import androidx.activity.result.C0207b;
import androidx.activity.result.C0210e;
import androidx.activity.result.C0213f;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.C0995b0;
import androidx.lifecycle.C1007f0;
import androidx.lifecycle.C1010h;
import androidx.lifecycle.C1024m0;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1034p0;
import androidx.lifecycle.C1035q;
import androidx.lifecycle.C1037q0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24362h;
import p053d.C4264a;
import p053d.C4265b;
import p065e.C4410a;
import p067e1.C4464a;
import p067e1.C4485f0;
import p067e1.C4487g0;
import p067e1.C4493i0;
import p067e1.C4502l;
import p080f2.C4646a;
import p090g1.C4743b;
import p090g1.C4744c;
import p091g2.C4746a;
import p091g2.C4749c;
import p091g2.C4750d;
import p229r1.C6231a;
import p242s1.C6364i;
import p242s1.C6368j;
import p242s1.C6370k;
import p242s1.C6372l;
import p242s1.C6377n;
import p256t2.C6550a;
import p256t2.C6552c;
import p256t2.C6555d;
import p256t2.C6556e;
import p319y2.C7286a;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements C1037q0, C1010h, C6556e, C0202j, C0213f, C4743b, C4744c, C4485f0, C4487g0, C6364i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final C0210e mActivityResultRegistry;
    private int mContentLayoutId;
    public final C4264a mContextAwareHelper;
    private C1026n0.C1028b mDefaultFactory;
    private final C1035q mLifecycleRegistry;
    private final C6372l mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<C6231a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<C6231a<C4502l>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<C6231a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<C6231a<C4493i0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<C6231a<Integer>> mOnTrimMemoryListeners;
    public final C6555d mSavedStateRegistryController;
    private C1034p0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0189a implements Runnable {
        public C0189a() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0190b extends C0210e {
        public C0190b() {
        }

        /* renamed from: b */
        public final void mo742b(int i, C4410a aVar, Object obj) {
            ComponentActivity componentActivity = ComponentActivity.this;
            C4410a.C4411a b = aVar.mo19921b(componentActivity, obj);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0197e(this, i, b));
                return;
            }
            Intent a = aVar.mo3996a(componentActivity, obj);
            Bundle bundle = null;
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C4464a.m11673a(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = intentSenderRequest.f534b;
                    Intent intent = intentSenderRequest.f535c;
                    int i2 = intentSenderRequest.f536d;
                    int i3 = intentSenderRequest.f537e;
                    int i4 = C4464a.f15531a;
                    C4464a.C4466b.m11677c(componentActivity, intentSender, i, intent, i2, i3, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0198f(this, i, e));
                }
            } else {
                int i5 = C4464a.f15531a;
                C4464a.C4466b.m11676b(componentActivity, a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public static final class C0191c {

        /* renamed from: a */
        public Object f497a;

        /* renamed from: b */
        public C1034p0 f498b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C4264a();
        this.mMenuHostHelper = new C6372l(new C0194b(this, 0));
        this.mLifecycleRegistry = new C1035q(this);
        C6555d dVar = new C6555d(this);
        this.mSavedStateRegistryController = dVar;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0189a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0190b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().mo4224a(new C1025n() {
                /* renamed from: f */
                public final void mo740f(C1033p pVar, Lifecycle.Event event) {
                    View view;
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().mo4224a(new C1025n() {
                /* renamed from: f */
                public final void mo740f(C1033p pVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f15168b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo4316a();
                        }
                    }
                }
            });
            getLifecycle().mo4224a(new C1025n() {
                /* renamed from: f */
                public final void mo740f(C1033p pVar, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo4226c(this);
                }
            });
            dVar.mo22667a();
            SavedStateHandleSupport.m2850b(this);
            if (i <= 23) {
                getLifecycle().mo4224a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().mo22665c(ACTIVITY_RESULT_TAG, new C0195c(this));
            addOnContextAvailableListener(new C0196d(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(C4646a.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(C4750d.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        C24362h.m61211f(decorView, "<this>");
        decorView.setTag(C6550a.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        C24362h.m61211f(decorView2, "<this>");
        decorView2.setTag(C0203k.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    /* access modifiers changed from: private */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        C0210e eVar = this.mActivityResultRegistry;
        eVar.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(eVar.f546c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(eVar.f546c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(eVar.f548e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) eVar.f551h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", eVar.f544a);
        return bundle;
    }

    /* access modifiers changed from: private */
    public void lambda$new$1(Context context) {
        Bundle a = getSavedStateRegistry().mo22663a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            C0210e eVar = this.mActivityResultRegistry;
            eVar.getClass();
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                eVar.f548e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                eVar.f544a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                eVar.f551h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (eVar.f546c.containsKey(str)) {
                        Integer num = (Integer) eVar.f546c.remove(str);
                        if (!eVar.f551h.containsKey(str)) {
                            eVar.f545b.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    eVar.f545b.put(Integer.valueOf(intValue), str2);
                    eVar.f546c.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(C6377n nVar) {
        C6372l lVar = this.mMenuHostHelper;
        lVar.f20025b.add(nVar);
        lVar.f20024a.run();
    }

    public final void addOnConfigurationChangedListener(C6231a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(C4265b bVar) {
        C4264a aVar = this.mContextAwareHelper;
        if (aVar.f15168b != null) {
            bVar.mo748a(aVar.f15168b);
        }
        aVar.f15167a.add(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(C6231a<C4502l> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(C6231a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(C6231a<C4493i0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(C6231a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0191c cVar = (C0191c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.mViewModelStore = cVar.f498b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C1034p0();
            }
        }
    }

    public final C0210e getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C4746a getDefaultViewModelCreationExtras() {
        C4749c cVar = new C4749c();
        if (getApplication() != null) {
            cVar.f16032a.put(C1024m0.f3961a, getApplication());
        }
        cVar.f16032a.put(SavedStateHandleSupport.f3897a, this);
        cVar.f16032a.put(SavedStateHandleSupport.f3898b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            cVar.f16032a.put(SavedStateHandleSupport.f3899c, getIntent().getExtras());
        }
        return cVar;
    }

    public C1026n0.C1028b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new C1007f0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0191c cVar = (C0191c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.f497a;
        }
        return null;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final C6552c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f20364b;
    }

    public C1034p0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.mo774a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo744b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C6231a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.mo22668b(bundle);
        C4264a aVar = this.mContextAwareHelper;
        aVar.f15168b = this;
        Iterator it = aVar.f15167a.iterator();
        while (it.hasNext()) {
            ((C4265b) it.next()).mo748a(this);
        }
        super.onCreate(bundle);
        C0995b0.m2860c(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C6372l lVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<C6377n> it = lVar.f20025b.iterator();
        while (it.hasNext()) {
            it.next().mo3991d(menu, menuInflater);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<C6377n> it = this.mMenuHostHelper.f20025b.iterator();
        while (it.hasNext()) {
            if (it.next().mo3990c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        Iterator<C6231a<C4502l>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C4502l(z));
        }
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<C6231a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator<C6377n> it = this.mMenuHostHelper.f20025b.iterator();
        while (it.hasNext()) {
            it.next().mo3988a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<C6231a<C4493i0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C4493i0(z));
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<C6377n> it = this.mMenuHostHelper.f20025b.iterator();
        while (it.hasNext()) {
            it.next().mo3989b(menu);
        }
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.mo774a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        C0191c cVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1034p0 p0Var = this.mViewModelStore;
        if (p0Var == null && (cVar = (C0191c) getLastNonConfigurationInstance()) != null) {
            p0Var = cVar.f498b;
        }
        if (p0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0191c cVar2 = new C0191c();
        cVar2.f497a = onRetainCustomNonConfigurationInstance;
        cVar2.f498b = p0Var;
        return cVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C1035q) {
            ((C1035q) lifecycle).mo4321h(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo22669c(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C6231a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f15168b;
    }

    public final <I, O> C0207b<I> registerForActivityResult(C4410a<I, O> aVar, C0210e eVar, C0206a<O> aVar2) {
        StringBuilder k = C13555b.m33972k("activity_rq#");
        k.append(this.mNextLocalRequestCode.getAndIncrement());
        return eVar.mo775c(k.toString(), this, aVar, aVar2);
    }

    public void removeMenuProvider(C6377n nVar) {
        this.mMenuHostHelper.mo22477a(nVar);
    }

    public final void removeOnConfigurationChangedListener(C6231a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(C4265b bVar) {
        this.mContextAwareHelper.f15167a.remove(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(C6231a<C4502l> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(C6231a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(C6231a<C4493i0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(C6231a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C7286a.m16884a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<C6231a<C4502l>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C4502l(z, 0));
        }
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<C6231a<C4493i0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C4493i0(z, 0));
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public void addMenuProvider(C6377n nVar, C1033p pVar) {
        C6372l lVar = this.mMenuHostHelper;
        lVar.f20025b.add(nVar);
        lVar.f20024a.run();
        Lifecycle lifecycle = pVar.getLifecycle();
        C6372l.C6373a aVar = (C6372l.C6373a) lVar.f20026c.remove(nVar);
        if (aVar != null) {
            aVar.f20027a.mo4226c(aVar.f20028b);
            aVar.f20028b = null;
        }
        lVar.f20026c.put(nVar, new C6372l.C6373a(lifecycle, new C6368j(lVar, nVar)));
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public final <I, O> C0207b<I> registerForActivityResult(C4410a<I, O> aVar, C0206a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(C6377n nVar, C1033p pVar, Lifecycle.State state) {
        C6372l lVar = this.mMenuHostHelper;
        lVar.getClass();
        Lifecycle lifecycle = pVar.getLifecycle();
        C6372l.C6373a aVar = (C6372l.C6373a) lVar.f20026c.remove(nVar);
        if (aVar != null) {
            aVar.f20027a.mo4226c(aVar.f20028b);
            aVar.f20028b = null;
        }
        lVar.f20026c.put(nVar, new C6372l.C6373a(lifecycle, new C6370k(lVar, state, nVar)));
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
