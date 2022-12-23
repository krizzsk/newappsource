package p188o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p090g1.C4732a;
import p141k1.C5450a;
import p154l1.C5554b;
import p242s1.C6319b;

/* renamed from: o.a */
public final class C5891a implements C5554b {

    /* renamed from: a */
    public CharSequence f18945a;

    /* renamed from: b */
    public CharSequence f18946b;

    /* renamed from: c */
    public Intent f18947c;

    /* renamed from: d */
    public char f18948d;

    /* renamed from: e */
    public int f18949e = 4096;

    /* renamed from: f */
    public char f18950f;

    /* renamed from: g */
    public int f18951g = 4096;

    /* renamed from: h */
    public Drawable f18952h;

    /* renamed from: i */
    public Context f18953i;

    /* renamed from: j */
    public CharSequence f18954j;

    /* renamed from: k */
    public CharSequence f18955k;

    /* renamed from: l */
    public ColorStateList f18956l = null;

    /* renamed from: m */
    public PorterDuff.Mode f18957m = null;

    /* renamed from: n */
    public boolean f18958n = false;

    /* renamed from: o */
    public boolean f18959o = false;

    /* renamed from: p */
    public int f18960p = 16;

    public C5891a(Context context, CharSequence charSequence) {
        this.f18953i = context;
        this.f18945a = charSequence;
    }

    /* renamed from: a */
    public final C6319b mo1146a() {
        return null;
    }

    /* renamed from: b */
    public final C5554b mo1147b(C6319b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo21760c() {
        Drawable drawable = this.f18952h;
        if (drawable == null) {
            return;
        }
        if (this.f18958n || this.f18959o) {
            Drawable g = C5450a.m13604g(drawable);
            this.f18952h = g;
            Drawable mutate = g.mutate();
            this.f18952h = mutate;
            if (this.f18958n) {
                C5450a.C5452b.m13617h(mutate, this.f18956l);
            }
            if (this.f18959o) {
                C5450a.C5452b.m13618i(this.f18952h, this.f18957m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f18951g;
    }

    public final char getAlphabeticShortcut() {
        return this.f18950f;
    }

    public final CharSequence getContentDescription() {
        return this.f18954j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f18952h;
    }

    public final ColorStateList getIconTintList() {
        return this.f18956l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f18957m;
    }

    public final Intent getIntent() {
        return this.f18947c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f18949e;
    }

    public final char getNumericShortcut() {
        return this.f18948d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f18945a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18946b;
        return charSequence != null ? charSequence : this.f18945a;
    }

    public final CharSequence getTooltipText() {
        return this.f18955k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f18960p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f18960p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f18960p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f18960p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f18950f = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f18960p = z | (this.f18960p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f18960p = (z ? 2 : 0) | (this.f18960p & -3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f18954j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f18960p = (z ? 16 : 0) | (this.f18960p & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f18952h = drawable;
        mo21760c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18956l = colorStateList;
        this.f18958n = true;
        mo21760c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18957m = mode;
        this.f18959o = true;
        mo21760c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f18947c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f18948d = c;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f18948d = c;
        this.f18950f = Character.toLowerCase(c2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f18945a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18946b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f18955k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f18960p & 8;
        if (z) {
            i = 0;
        }
        this.f18960p = i2 | i;
        return this;
    }

    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f18950f = Character.toLowerCase(c);
        this.f18951g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final C5554b m65750setContentDescription(CharSequence charSequence) {
        this.f18954j = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f18948d = c;
        this.f18949e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f18945a = this.f18953i.getResources().getString(i);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final C5554b m65751setTooltipText(CharSequence charSequence) {
        this.f18955k = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f18952h = C4732a.getDrawable(this.f18953i, i);
        mo21760c();
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f18948d = c;
        this.f18949e = KeyEvent.normalizeMetaState(i);
        this.f18950f = Character.toLowerCase(c2);
        this.f18951g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
