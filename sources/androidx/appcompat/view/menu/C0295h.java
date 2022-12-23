package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import p127j.C5344a;
import p141k1.C5450a;
import p154l1.C5554b;
import p242s1.C6319b;

/* renamed from: androidx.appcompat.view.menu.h */
public final class C0295h implements C5554b {

    /* renamed from: A */
    public C6319b f949A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f950B;

    /* renamed from: C */
    public boolean f951C = false;

    /* renamed from: a */
    public final int f952a;

    /* renamed from: b */
    public final int f953b;

    /* renamed from: c */
    public final int f954c;

    /* renamed from: d */
    public final int f955d;

    /* renamed from: e */
    public CharSequence f956e;

    /* renamed from: f */
    public CharSequence f957f;

    /* renamed from: g */
    public Intent f958g;

    /* renamed from: h */
    public char f959h;

    /* renamed from: i */
    public int f960i = 4096;

    /* renamed from: j */
    public char f961j;

    /* renamed from: k */
    public int f962k = 4096;

    /* renamed from: l */
    public Drawable f963l;

    /* renamed from: m */
    public int f964m = 0;

    /* renamed from: n */
    public C0291f f965n;

    /* renamed from: o */
    public C0307m f966o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f967p;

    /* renamed from: q */
    public CharSequence f968q;

    /* renamed from: r */
    public CharSequence f969r;

    /* renamed from: s */
    public ColorStateList f970s = null;

    /* renamed from: t */
    public PorterDuff.Mode f971t = null;

    /* renamed from: u */
    public boolean f972u = false;

    /* renamed from: v */
    public boolean f973v = false;

    /* renamed from: w */
    public boolean f974w = false;

    /* renamed from: x */
    public int f975x = 16;

    /* renamed from: y */
    public int f976y;

    /* renamed from: z */
    public View f977z;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class C0296a implements C6319b.C6321b {
        public C0296a() {
        }
    }

    public C0295h(C0291f fVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f965n = fVar;
        this.f952a = i2;
        this.f953b = i;
        this.f954c = i3;
        this.f955d = i4;
        this.f956e = charSequence;
        this.f976y = i5;
    }

    /* renamed from: c */
    public static void m690c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public final C6319b mo1146a() {
        return this.f949A;
    }

    /* renamed from: b */
    public final C5554b mo1147b(C6319b bVar) {
        C6319b bVar2 = this.f949A;
        if (bVar2 != null) {
            bVar2.getClass();
            bVar2.f19975a = null;
        }
        this.f977z = null;
        this.f949A = bVar;
        this.f965n.mo1122p(true);
        C6319b bVar3 = this.f949A;
        if (bVar3 != null) {
            bVar3.mo21863h(new C0296a());
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f976y & 8) == 0) {
            return false;
        }
        if (this.f977z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f950B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f965n.mo1106d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable mo1149d(Drawable drawable) {
        if (drawable != null && this.f974w && (this.f972u || this.f973v)) {
            drawable = C5450a.m13604g(drawable).mutate();
            if (this.f972u) {
                C5450a.C5452b.m13617h(drawable, this.f970s);
            }
            if (this.f973v) {
                C5450a.C5452b.m13618i(drawable, this.f971t);
            }
            this.f974w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean mo1150e() {
        C6319b bVar;
        if ((this.f976y & 8) == 0) {
            return false;
        }
        if (this.f977z == null && (bVar = this.f949A) != null) {
            this.f977z = bVar.mo21861d(this);
        }
        if (this.f977z != null) {
            return true;
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!mo1150e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f950B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f965n.mo1108f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo1152f(boolean z) {
        this.f975x = (z ? 4 : 0) | (this.f975x & -5);
    }

    /* renamed from: g */
    public final void mo1153g(boolean z) {
        if (z) {
            this.f975x |= 32;
        } else {
            this.f975x &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f977z;
        if (view != null) {
            return view;
        }
        C6319b bVar = this.f949A;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo21861d(this);
        this.f977z = d;
        return d;
    }

    public final int getAlphabeticModifiers() {
        return this.f962k;
    }

    public final char getAlphabeticShortcut() {
        return this.f961j;
    }

    public final CharSequence getContentDescription() {
        return this.f968q;
    }

    public final int getGroupId() {
        return this.f953b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f963l;
        if (drawable != null) {
            return mo1149d(drawable);
        }
        int i = this.f964m;
        if (i == 0) {
            return null;
        }
        Drawable a = C5344a.m13397a(this.f965n.f922a, i);
        this.f964m = 0;
        this.f963l = a;
        return mo1149d(a);
    }

    public final ColorStateList getIconTintList() {
        return this.f970s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f971t;
    }

    public final Intent getIntent() {
        return this.f958g;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f952a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f960i;
    }

    public final char getNumericShortcut() {
        return this.f959h;
    }

    public final int getOrder() {
        return this.f954c;
    }

    public final SubMenu getSubMenu() {
        return this.f966o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f956e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f957f;
        return charSequence != null ? charSequence : this.f956e;
    }

    public final CharSequence getTooltipText() {
        return this.f969r;
    }

    public final boolean hasSubMenu() {
        return this.f966o != null;
    }

    public final boolean isActionViewExpanded() {
        return this.f951C;
    }

    public final boolean isCheckable() {
        return (this.f975x & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f975x & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f975x & 16) != 0;
    }

    public final boolean isVisible() {
        C6319b bVar = this.f949A;
        if (bVar == null || !bVar.mo21862g()) {
            if ((this.f975x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f975x & 8) != 0 || !this.f949A.mo21860b()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i;
        this.f977z = view;
        this.f949A = null;
        if (view != null && view.getId() == -1 && (i = this.f952a) > 0) {
            view.setId(i);
        }
        C0291f fVar = this.f965n;
        fVar.f932k = true;
        fVar.mo1122p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f961j == c) {
            return this;
        }
        this.f961j = Character.toLowerCase(c);
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f975x;
        boolean z2 = z | (i & true);
        this.f975x = z2 ? 1 : 0;
        if (i != z2) {
            this.f965n.mo1122p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.f975x;
        int i3 = 2;
        if ((i2 & 4) != 0) {
            C0291f fVar = this.f965n;
            fVar.getClass();
            int i4 = this.f953b;
            int size = fVar.f927f.size();
            fVar.mo1142z();
            for (int i5 = 0; i5 < size; i5++) {
                C0295h hVar = fVar.f927f.get(i5);
                if (hVar.f953b == i4) {
                    boolean z3 = true;
                    if ((hVar.f975x & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z3 = false;
                        }
                        int i6 = hVar.f975x;
                        int i7 = i6 & -3;
                        if (z3) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        hVar.f975x = i8;
                        if (i6 != i8) {
                            hVar.f965n.mo1122p(false);
                        }
                    }
                }
            }
            fVar.mo1141y();
        } else {
            int i9 = i2 & -3;
            if (!z) {
                i3 = 0;
            }
            int i11 = i3 | i9;
            this.f975x = i11;
            if (i2 != i11) {
                this.f965n.mo1122p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f975x |= 16;
        } else {
            this.f975x &= -17;
        }
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f964m = 0;
        this.f963l = drawable;
        this.f974w = true;
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f970s = colorStateList;
        this.f972u = true;
        this.f974w = true;
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f971t = mode;
        this.f973v = true;
        this.f974w = true;
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f958g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f959h == c) {
            return this;
        }
        this.f959h = c;
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f950B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f967p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f959h = c;
        this.f961j = Character.toLowerCase(c2);
        this.f965n.mo1122p(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f976y = i;
            C0291f fVar = this.f965n;
            fVar.f932k = true;
            fVar.mo1122p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f956e = charSequence;
        this.f965n.mo1122p(false);
        C0307m mVar = this.f966o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f957f = charSequence;
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.f975x;
        int i3 = i2 & -9;
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f975x = i4;
        if (i2 != i4) {
            z2 = true;
        }
        if (z2) {
            C0291f fVar = this.f965n;
            fVar.f929h = true;
            fVar.mo1122p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f956e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final C5554b setContentDescription(CharSequence charSequence) {
        this.f968q = charSequence;
        this.f965n.mo1122p(false);
        return this;
    }

    public final C5554b setTooltipText(CharSequence charSequence) {
        this.f969r = charSequence;
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f961j == c && this.f962k == i) {
            return this;
        }
        this.f961j = Character.toLowerCase(c);
        this.f962k = KeyEvent.normalizeMetaState(i);
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f959h == c && this.f960i == i) {
            return this;
        }
        this.f959h = c;
        this.f960i = KeyEvent.normalizeMetaState(i);
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f959h = c;
        this.f960i = KeyEvent.normalizeMetaState(i);
        this.f961j = Character.toLowerCase(c2);
        this.f962k = KeyEvent.normalizeMetaState(i2);
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f963l = null;
        this.f964m = i;
        this.f974w = true;
        this.f965n.mo1122p(false);
        return this;
    }

    public final MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f965n.f922a.getString(i));
        return this;
    }

    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f965n.f922a;
        View inflate = LayoutInflater.from(context).inflate(i, new LinearLayout(context), false);
        this.f977z = inflate;
        this.f949A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f952a) > 0) {
            inflate.setId(i2);
        }
        C0291f fVar = this.f965n;
        fVar.f932k = true;
        fVar.mo1122p(true);
        return this;
    }
}
