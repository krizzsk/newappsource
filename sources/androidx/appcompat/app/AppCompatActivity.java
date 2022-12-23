package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0238b;
import androidx.appcompat.widget.C0450q1;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import mf0.C24362h;
import p053d.C4265b;
import p067e1.C4464a;
import p067e1.C4503l0;
import p067e1.C4506m;
import p080f2.C4646a;
import p091g2.C4750d;
import p175n.C5765a;
import p256t2.C6550a;
import p256t2.C6552c;

public class AppCompatActivity extends FragmentActivity implements C0251i, C4503l0.C4505b, C0238b.C0240b {
    private C0252j mDelegate;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    public class C0219a implements C6552c.C6554b {
        public C0219a() {
        }

        /* renamed from: a */
        public final Bundle mo747a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().mo884r();
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    public class C0220b implements C4265b {
        public C0220b() {
        }

        /* renamed from: a */
        public final void mo748a(Context context) {
            C0252j delegate = AppCompatActivity.this.getDelegate();
            delegate.mo875k();
            AppCompatActivity.this.getSavedStateRegistry().mo22663a("androidx:appcompat");
            delegate.mo878n();
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().mo22665c("androidx:appcompat", new C0219a());
        addOnContextAvailableListener(new C0220b());
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(C4646a.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(C4750d.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        C24362h.m61211f(decorView, "<this>");
        decorView.setTag(C6550a.view_tree_saved_state_registry_owner, this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo867c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo869e(context));
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo779a()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo788j(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo870f(i);
    }

    public C0252j getDelegate() {
        if (this.mDelegate == null) {
            int i = C0252j.f737b;
            this.mDelegate = new AppCompatDelegateImpl(this, (Window) null, this, this);
        }
        return this.mDelegate;
    }

    public C0238b.C0239a getDrawerToggleDelegate() {
        return getDelegate().mo871g();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo873i();
    }

    public Resources getResources() {
        int i = C0450q1.f1612a;
        return super.getResources();
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo874j();
    }

    public Intent getSupportParentActivityIntent() {
        return C4506m.m11738a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo876l();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo877m(configuration);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C4503l0 l0Var) {
        l0Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C4506m.m11738a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(l0Var.f15586c.getPackageManager());
            }
            l0Var.mo20023d(component);
            l0Var.mo20021a(supportParentActivityIntent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo879o();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo782d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo882p();
    }

    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo883q();
    }

    public void onPrepareSupportNavigateUpTaskStack(C4503l0 l0Var) {
    }

    public void onStart() {
        super.onStart();
        getDelegate().mo885s();
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo886t();
    }

    public void onSupportActionModeFinished(C5765a aVar) {
    }

    public void onSupportActionModeStarted(C5765a aVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C4503l0 l0Var = new C4503l0(this);
            onCreateSupportNavigateUpTaskStack(l0Var);
            onPrepareSupportNavigateUpTaskStack(l0Var);
            l0Var.mo20024e();
            try {
                int i = C4464a.f15531a;
                C4464a.C4466b.m11675a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo845B(charSequence);
    }

    public C5765a onWindowStartingSupportActionMode(C5765a.C5766a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo789k()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().mo888w(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo891z(toolbar);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo844A(i);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo876l();
    }

    public void supportNavigateUpTo(Intent intent) {
        C4506m.C4507a.m11742b(this, intent);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C4506m.C4507a.m11743c(this, intent);
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo889x(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo890y(view, layoutParams);
    }
}
