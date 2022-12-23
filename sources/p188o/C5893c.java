package p188o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0307m;
import java.lang.reflect.Method;
import p154l1.C5554b;
import p175n.C5767b;
import p242s1.C6319b;

/* renamed from: o.c */
public final class C5893c extends C5892b implements MenuItem {

    /* renamed from: d */
    public final C5554b f18964d;

    /* renamed from: e */
    public Method f18965e;

    /* renamed from: o.c$a */
    public class C5894a extends C6319b {

        /* renamed from: b */
        public final ActionProvider f18966b;

        public C5894a(ActionProvider actionProvider) {
            this.f18966b = actionProvider;
        }

        /* renamed from: a */
        public final boolean mo21856a() {
            return this.f18966b.hasSubMenu();
        }

        /* renamed from: c */
        public final View mo21857c() {
            return this.f18966b.onCreateActionView();
        }

        /* renamed from: e */
        public final boolean mo21858e() {
            return this.f18966b.onPerformDefaultAction();
        }

        /* renamed from: f */
        public final void mo21859f(C0307m mVar) {
            this.f18966b.onPrepareSubMenu(C5893c.this.mo21796e(mVar));
        }
    }

    /* renamed from: o.c$b */
    public class C5895b extends C5894a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public C6319b.C6321b f18968d;

        public C5895b(C5893c cVar, ActionProvider actionProvider) {
            super(actionProvider);
        }

        /* renamed from: b */
        public final boolean mo21860b() {
            return this.f18966b.isVisible();
        }

        /* renamed from: d */
        public final View mo21861d(MenuItem menuItem) {
            return this.f18966b.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public final boolean mo21862g() {
            return this.f18966b.overridesItemVisibility();
        }

        /* renamed from: h */
        public final void mo21863h(C0295h.C0296a aVar) {
            this.f18968d = aVar;
            this.f18966b.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            C6319b.C6321b bVar = this.f18968d;
            if (bVar != null) {
                C0291f fVar = C0295h.this.f965n;
                fVar.f929h = true;
                fVar.mo1122p(true);
            }
        }
    }

    /* renamed from: o.c$c */
    public static class C5896c extends FrameLayout implements C5767b {

        /* renamed from: b */
        public final CollapsibleActionView f18969b;

        public C5896c(View view) {
            super(view.getContext());
            this.f18969b = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f18969b.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f18969b.onActionViewExpanded();
        }
    }

    /* renamed from: o.c$d */
    public class C5897d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f18970a;

        public C5897d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f18970a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f18970a.onMenuItemActionCollapse(C5893c.this.mo21795d(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f18970a.onMenuItemActionExpand(C5893c.this.mo21795d(menuItem));
        }
    }

    /* renamed from: o.c$e */
    public class C5898e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f18972a;

        public C5898e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f18972a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f18972a.onMenuItemClick(C5893c.this.mo21795d(menuItem));
        }
    }

    public C5893c(Context context, C5554b bVar) {
        super(context);
        if (bVar != null) {
            this.f18964d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f18964d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f18964d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        C6319b a = this.f18964d.mo1146a();
        if (a instanceof C5894a) {
            return ((C5894a) a).f18966b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f18964d.getActionView();
        if (actionView instanceof C5896c) {
            return (View) ((C5896c) actionView).f18969b;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f18964d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f18964d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f18964d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f18964d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f18964d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f18964d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f18964d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f18964d.getIntent();
    }

    public final int getItemId() {
        return this.f18964d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f18964d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f18964d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f18964d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f18964d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return mo21796e(this.f18964d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f18964d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f18964d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f18964d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f18964d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f18964d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f18964d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f18964d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f18964d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f18964d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        C5895b bVar = new C5895b(this, actionProvider);
        C5554b bVar2 = this.f18964d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo1147b(bVar);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C5896c(view);
        }
        this.f18964d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f18964d.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f18964d.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f18964d.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f18964d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f18964d.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f18964d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18964d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18964d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f18964d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f18964d.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C5897d dVar;
        C5554b bVar = this.f18964d;
        if (onActionExpandListener != null) {
            dVar = new C5897d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C5898e eVar;
        C5554b bVar = this.f18964d;
        if (onMenuItemClickListener != null) {
            eVar = new C5898e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f18964d.setShortcut(c, c2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.f18964d.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.f18964d.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f18964d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18964d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f18964d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.f18964d.setVisible(z);
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f18964d.setAlphabeticShortcut(c, i);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f18964d.setIcon(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f18964d.setNumericShortcut(c, i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f18964d.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f18964d.setTitle(i);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.f18964d.setActionView(i);
        View actionView = this.f18964d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f18964d.setActionView((View) new C5896c(actionView));
        }
        return this;
    }
}
