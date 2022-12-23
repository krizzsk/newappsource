package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p090g1.C4732a;
import p154l1.C5553a;
import p242s1.C6365i0;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0291f implements C5553a {

    /* renamed from: y */
    public static final int[] f921y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f922a;

    /* renamed from: b */
    public final Resources f923b;

    /* renamed from: c */
    public boolean f924c;

    /* renamed from: d */
    public boolean f925d;

    /* renamed from: e */
    public C0292a f926e;

    /* renamed from: f */
    public ArrayList<C0295h> f927f;

    /* renamed from: g */
    public ArrayList<C0295h> f928g;

    /* renamed from: h */
    public boolean f929h;

    /* renamed from: i */
    public ArrayList<C0295h> f930i;

    /* renamed from: j */
    public ArrayList<C0295h> f931j;

    /* renamed from: k */
    public boolean f932k;

    /* renamed from: l */
    public int f933l = 0;

    /* renamed from: m */
    public CharSequence f934m;

    /* renamed from: n */
    public Drawable f935n;

    /* renamed from: o */
    public View f936o;

    /* renamed from: p */
    public boolean f937p = false;

    /* renamed from: q */
    public boolean f938q = false;

    /* renamed from: r */
    public boolean f939r = false;

    /* renamed from: s */
    public boolean f940s = false;

    /* renamed from: t */
    public ArrayList<C0295h> f941t = new ArrayList<>();

    /* renamed from: u */
    public CopyOnWriteArrayList<WeakReference<C0300j>> f942u = new CopyOnWriteArrayList<>();

    /* renamed from: v */
    public C0295h f943v;

    /* renamed from: w */
    public boolean f944w = false;

    /* renamed from: x */
    public boolean f945x;

    /* renamed from: androidx.appcompat.view.menu.f$a */
    public interface C0292a {
        /* renamed from: a */
        boolean mo865a(C0291f fVar, MenuItem menuItem);

        /* renamed from: b */
        void mo866b(C0291f fVar);
    }

    /* renamed from: androidx.appcompat.view.menu.f$b */
    public interface C0293b {
        /* renamed from: b */
        boolean mo1031b(C0295h hVar);
    }

    public C0291f(Context context) {
        boolean z;
        boolean z2 = false;
        this.f922a = context;
        Resources resources = context.getResources();
        this.f923b = resources;
        this.f927f = new ArrayList<>();
        this.f928g = new ArrayList<>();
        this.f929h = true;
        this.f930i = new ArrayList<>();
        this.f931j = new ArrayList<>();
        this.f932k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C6365i0.f20017a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = C6365i0.C6367b.m15178b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.f925d = z2;
    }

    /* renamed from: a */
    public C0295h mo1091a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f921y;
            if (i5 < 6) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C0295h hVar = new C0295h(this, i, i2, i3, i6, charSequence, this.f933l);
                ArrayList<C0295h> arrayList = this.f927f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f955d <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, hVar);
                mo1122p(true);
                return hVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return mo1091a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f922a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            androidx.appcompat.view.menu.h r4 = r7.mo1091a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f958g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0291f.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void mo1101b(C0300j jVar, Context context) {
        this.f942u.add(new WeakReference(jVar));
        jVar.mo1075k(context, this);
        this.f932k = true;
    }

    /* renamed from: c */
    public final void mo1102c(boolean z) {
        if (!this.f940s) {
            this.f940s = true;
            Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0300j jVar = (C0300j) next.get();
                if (jVar == null) {
                    this.f942u.remove(next);
                } else {
                    jVar.mo1049b(this, z);
                }
            }
            this.f940s = false;
        }
    }

    public final void clear() {
        C0295h hVar = this.f943v;
        if (hVar != null) {
            mo1106d(hVar);
        }
        this.f927f.clear();
        mo1122p(true);
    }

    public final void clearHeader() {
        this.f935n = null;
        this.f934m = null;
        this.f936o = null;
        mo1122p(false);
    }

    public final void close() {
        mo1102c(true);
    }

    /* renamed from: d */
    public boolean mo1106d(C0295h hVar) {
        boolean z = false;
        if (!this.f942u.isEmpty() && this.f943v == hVar) {
            mo1142z();
            Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0300j jVar = (C0300j) next.get();
                if (jVar == null) {
                    this.f942u.remove(next);
                } else {
                    z = jVar.mo1045d(hVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1141y();
            if (z) {
                this.f943v = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo1107e(C0291f fVar, MenuItem menuItem) {
        C0292a aVar = this.f926e;
        return aVar != null && aVar.mo865a(fVar, menuItem);
    }

    /* renamed from: f */
    public boolean mo1108f(C0295h hVar) {
        boolean z = false;
        if (this.f942u.isEmpty()) {
            return false;
        }
        mo1142z();
        Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0300j jVar = (C0300j) next.get();
            if (jVar == null) {
                this.f942u.remove(next);
            } else {
                z = jVar.mo1047h(hVar);
                if (z) {
                    break;
                }
            }
        }
        mo1141y();
        if (z) {
            this.f943v = hVar;
        }
        return z;
    }

    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0295h hVar = this.f927f.get(i2);
            if (hVar.f952a == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f966o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0295h mo1110g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0295h> arrayList = this.f941t;
        arrayList.clear();
        mo1112h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = mo1120n();
        for (int i2 = 0; i2 < size; i2++) {
            C0295h hVar = arrayList.get(i2);
            if (n) {
                c = hVar.f961j;
            } else {
                c = hVar.f959h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == 8 && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i) {
        return this.f927f.get(i);
    }

    /* renamed from: h */
    public final void mo1112h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean n = mo1120n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f927f.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0295h hVar = this.f927f.get(i3);
                if (hVar.hasSubMenu()) {
                    hVar.f966o.mo1112h(arrayList, i, keyEvent);
                }
                if (n) {
                    c = hVar.f961j;
                } else {
                    c = hVar.f959h;
                }
                if (n) {
                    i2 = hVar.f962k;
                } else {
                    i2 = hVar.f960i;
                }
                if ((modifiers & 69647) == (i2 & 69647)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == 8 && i == 67)) && hVar.isEnabled()) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f945x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f927f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo1114i() {
        boolean z;
        ArrayList<C0295h> l = mo1118l();
        if (this.f932k) {
            Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0300j jVar = (C0300j) next.get();
                if (jVar == null) {
                    this.f942u.remove(next);
                } else {
                    z2 |= jVar.mo1055j();
                }
            }
            if (z2) {
                this.f930i.clear();
                this.f931j.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    C0295h hVar = l.get(i);
                    if ((hVar.f975x & 32) == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.f930i.add(hVar);
                    } else {
                        this.f931j.add(hVar);
                    }
                }
            } else {
                this.f930i.clear();
                this.f931j.clear();
                this.f931j.addAll(mo1118l());
            }
            this.f932k = false;
        }
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1110g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo1116j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C0291f mo1117k() {
        return this;
    }

    /* renamed from: l */
    public final ArrayList<C0295h> mo1118l() {
        if (!this.f929h) {
            return this.f928g;
        }
        this.f928g.clear();
        int size = this.f927f.size();
        for (int i = 0; i < size; i++) {
            C0295h hVar = this.f927f.get(i);
            if (hVar.isVisible()) {
                this.f928g.add(hVar);
            }
        }
        this.f929h = false;
        this.f932k = true;
        return this.f928g;
    }

    /* renamed from: m */
    public boolean mo1119m() {
        return this.f944w;
    }

    /* renamed from: n */
    public boolean mo1120n() {
        return this.f924c;
    }

    /* renamed from: o */
    public boolean mo1121o() {
        return this.f925d;
    }

    /* renamed from: p */
    public void mo1122p(boolean z) {
        if (!this.f937p) {
            if (z) {
                this.f929h = true;
                this.f932k = true;
            }
            if (!this.f942u.isEmpty()) {
                mo1142z();
                Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    C0300j jVar = (C0300j) next.get();
                    if (jVar == null) {
                        this.f942u.remove(next);
                    } else {
                        jVar.mo1054i(z);
                    }
                }
                mo1141y();
                return;
            }
            return;
        }
        this.f938q = true;
        if (z) {
            this.f939r = true;
        }
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return mo1125q(findItem(i), (C0300j) null, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0295h g = mo1110g(i, keyEvent);
        if (g != null) {
            z = mo1125q(g, (C0300j) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo1102c(true);
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1125q(android.view.MenuItem r7, androidx.appcompat.view.menu.C0300j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.C0295h) r7
            r0 = 0
            if (r7 == 0) goto L_0x00cb
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00cb
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f967p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0039
        L_0x0019:
            androidx.appcompat.view.menu.f r1 = r7.f965n
            boolean r1 = r1.mo1107e(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0039
        L_0x0022:
            android.content.Intent r1 = r7.f958g
            if (r1 == 0) goto L_0x002f
            androidx.appcompat.view.menu.f r3 = r7.f965n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f922a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0039
        L_0x002e:
        L_0x002f:
            s1.b r1 = r7.f949A
            if (r1 == 0) goto L_0x003b
            boolean r1 = r1.mo21858e()
            if (r1 == 0) goto L_0x003b
        L_0x0039:
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            s1.b r3 = r7.f949A
            if (r3 == 0) goto L_0x0048
            boolean r4 = r3.mo21856a()
            if (r4 == 0) goto L_0x0048
            r4 = 1
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            boolean r5 = r7.mo1150e()
            if (r5 == 0) goto L_0x005b
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00ca
            r6.mo1102c(r2)
            goto L_0x00ca
        L_0x005b:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x006c
            if (r4 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00ca
            r6.mo1102c(r2)
            goto L_0x00ca
        L_0x006c:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0073
            r6.mo1102c(r0)
        L_0x0073:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0087
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f922a
            r9.<init>(r5, r6, r7)
            r7.f966o = r9
            java.lang.CharSequence r5 = r7.f956e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0087:
            androidx.appcompat.view.menu.m r7 = r7.f966o
            if (r4 == 0) goto L_0x008e
            r3.mo21859f(r7)
        L_0x008e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f942u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0097
            goto L_0x00c4
        L_0x0097:
            if (r8 == 0) goto L_0x009d
            boolean r0 = r8.mo1052f(r7)
        L_0x009d:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r8 = r6.f942u
            java.util.Iterator r8 = r8.iterator()
        L_0x00a3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c4
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.j r3 = (androidx.appcompat.view.menu.C0300j) r3
            if (r3 != 0) goto L_0x00bd
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r3 = r6.f942u
            r3.remove(r9)
            goto L_0x00a3
        L_0x00bd:
            if (r0 != 0) goto L_0x00a3
            boolean r0 = r3.mo1052f(r7)
            goto L_0x00a3
        L_0x00c4:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00ca
            r6.mo1102c(r2)
        L_0x00ca:
            return r1
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0291f.mo1125q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    /* renamed from: r */
    public final void mo1126r(C0300j jVar) {
        Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0300j jVar2 = (C0300j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f942u.remove(next);
            }
        }
    }

    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f927f.get(i3).f953b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f927f.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || this.f927f.get(i3).f953b != i) {
                    mo1122p(true);
                } else {
                    if (i3 >= 0 && i3 < this.f927f.size()) {
                        this.f927f.remove(i3);
                    }
                    i2 = i4;
                }
            }
            mo1122p(true);
        }
    }

    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f927f.get(i2).f952a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0 && i2 < this.f927f.size()) {
            this.f927f.remove(i2);
            mo1122p(true);
        }
    }

    /* renamed from: s */
    public final void mo1129s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1116j());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0307m) item.getSubMenu()).mo1129s(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f927f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0295h hVar = this.f927f.get(i2);
            if (hVar.f953b == i) {
                hVar.mo1152f(z2);
                hVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f944w = z;
    }

    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f927f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0295h hVar = this.f927f.get(i2);
            if (hVar.f953b == i) {
                hVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        int i2;
        boolean z2;
        int size = this.f927f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0295h hVar = this.f927f.get(i3);
            if (hVar.f953b == i) {
                int i4 = hVar.f975x;
                int i5 = i4 & -9;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                hVar.f975x = i6;
                if (i4 != i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            mo1122p(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f924c = z;
        mo1122p(false);
    }

    public final int size() {
        return this.f927f.size();
    }

    /* renamed from: t */
    public final void mo1136t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f942u.isEmpty()) {
            Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0300j jVar = (C0300j) next.get();
                if (jVar == null) {
                    this.f942u.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.mo1051e(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo1137u(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0307m) item.getSubMenu()).mo1137u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1116j(), sparseArray);
        }
    }

    /* renamed from: v */
    public final void mo1138v(Bundle bundle) {
        Parcelable g;
        if (!this.f942u.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0300j>> it = this.f942u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0300j jVar = (C0300j) next.get();
                if (jVar == null) {
                    this.f942u.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (g = jVar.mo1053g()) != null) {
                        sparseArray.put(id, g);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: w */
    public void mo1139w(C0292a aVar) {
        this.f926e = aVar;
    }

    /* renamed from: x */
    public final void mo1140x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f923b;
        if (view != null) {
            this.f936o = view;
            this.f934m = null;
            this.f935n = null;
        } else {
            if (i > 0) {
                this.f934m = resources.getText(i);
            } else if (charSequence != null) {
                this.f934m = charSequence;
            }
            if (i2 > 0) {
                this.f935n = C4732a.getDrawable(this.f922a, i2);
            } else if (drawable != null) {
                this.f935n = drawable;
            }
            this.f936o = null;
        }
        mo1122p(false);
    }

    /* renamed from: y */
    public final void mo1141y() {
        this.f937p = false;
        if (this.f938q) {
            this.f938q = false;
            mo1122p(this.f939r);
        }
    }

    /* renamed from: z */
    public final void mo1142z() {
        if (!this.f937p) {
            this.f937p = true;
            this.f938q = false;
            this.f939r = false;
        }
    }

    public final MenuItem add(int i) {
        return mo1091a(0, 0, 0, this.f923b.getString(i));
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f923b.getString(i));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1091a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0295h a = mo1091a(i, i2, i3, charSequence);
        C0307m mVar = new C0307m(this.f922a, this, a);
        a.f966o = mVar;
        mVar.setHeaderTitle(a.f956e);
        return mVar;
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo1091a(i, i2, i3, this.f923b.getString(i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f923b.getString(i4));
    }
}
