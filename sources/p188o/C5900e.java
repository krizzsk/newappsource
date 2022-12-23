package p188o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p154l1.C5553a;
import p154l1.C5554b;
import p241s0.C6313h;

/* renamed from: o.e */
public class C5900e extends C5892b implements Menu {

    /* renamed from: d */
    public final C5553a f18975d;

    public C5900e(Context context, C5553a aVar) {
        super(context);
        if (aVar != null) {
            this.f18975d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return mo21795d(this.f18975d.add(charSequence));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f18975d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = mo21795d(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return mo21796e(this.f18975d.addSubMenu(charSequence));
    }

    public final void clear() {
        C6313h hVar = (C6313h) this.f18962b;
        if (hVar != null) {
            hVar.clear();
        }
        C6313h hVar2 = (C6313h) this.f18963c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f18975d.clear();
    }

    public final void close() {
        this.f18975d.close();
    }

    public final MenuItem findItem(int i) {
        return mo21795d(this.f18975d.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return mo21795d(this.f18975d.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.f18975d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f18975d.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.f18975d.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f18975d.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (((C6313h) this.f18962b) != null) {
            int i2 = 0;
            while (true) {
                C6313h hVar = (C6313h) this.f18962b;
                if (i2 >= hVar.f19969d) {
                    break;
                }
                if (((C5554b) hVar.mo22416h(i2)).getGroupId() == i) {
                    ((C6313h) this.f18962b).mo22420j(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f18975d.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (((C6313h) this.f18962b) != null) {
            int i2 = 0;
            while (true) {
                C6313h hVar = (C6313h) this.f18962b;
                if (i2 >= hVar.f19969d) {
                    break;
                } else if (((C5554b) hVar.mo22416h(i2)).getItemId() == i) {
                    ((C6313h) this.f18962b).mo22420j(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f18975d.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f18975d.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.f18975d.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.f18975d.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.f18975d.setQwertyMode(z);
    }

    public final int size() {
        return this.f18975d.size();
    }

    public final MenuItem add(int i) {
        return mo21795d(this.f18975d.add(i));
    }

    public final SubMenu addSubMenu(int i) {
        return mo21796e(this.f18975d.addSubMenu(i));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo21795d(this.f18975d.add(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo21796e(this.f18975d.addSubMenu(i, i2, i3, charSequence));
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo21795d(this.f18975d.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo21796e(this.f18975d.addSubMenu(i, i2, i3, i4));
    }
}
