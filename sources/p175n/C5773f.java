package p175n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.widget.C0413h1;
import androidx.appcompat.widget.C0418j0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.p982v1.XmlPullParserException;
import p114i.C5224j;
import p154l1.C5553a;
import p154l1.C5554b;
import p188o.C5893c;
import p242s1.C6319b;
import p242s1.C6375m;

/* renamed from: n.f */
public final class C5773f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f18674e;

    /* renamed from: f */
    public static final Class<?>[] f18675f;

    /* renamed from: a */
    public final Object[] f18676a;

    /* renamed from: b */
    public final Object[] f18677b;

    /* renamed from: c */
    public Context f18678c;

    /* renamed from: d */
    public Object f18679d;

    /* renamed from: n.f$a */
    public static class C5774a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f18680c = {MenuItem.class};

        /* renamed from: a */
        public Object f18681a;

        /* renamed from: b */
        public Method f18682b;

        public C5774a(Object obj, String str) {
            this.f18681a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f18682b = cls.getMethod(str, f18680c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(C25541a.m63876f(cls, C13555b.m33973l("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f18682b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f18682b.invoke(this.f18681a, new Object[]{menuItem})).booleanValue();
                }
                this.f18682b.invoke(this.f18681a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: n.f$b */
    public class C5775b {

        /* renamed from: A */
        public CharSequence f18683A;

        /* renamed from: B */
        public CharSequence f18684B;

        /* renamed from: C */
        public ColorStateList f18685C = null;

        /* renamed from: D */
        public PorterDuff.Mode f18686D = null;

        /* renamed from: a */
        public Menu f18688a;

        /* renamed from: b */
        public int f18689b;

        /* renamed from: c */
        public int f18690c;

        /* renamed from: d */
        public int f18691d;

        /* renamed from: e */
        public int f18692e;

        /* renamed from: f */
        public boolean f18693f;

        /* renamed from: g */
        public boolean f18694g;

        /* renamed from: h */
        public boolean f18695h;

        /* renamed from: i */
        public int f18696i;

        /* renamed from: j */
        public int f18697j;

        /* renamed from: k */
        public CharSequence f18698k;

        /* renamed from: l */
        public CharSequence f18699l;

        /* renamed from: m */
        public int f18700m;

        /* renamed from: n */
        public char f18701n;

        /* renamed from: o */
        public int f18702o;

        /* renamed from: p */
        public char f18703p;

        /* renamed from: q */
        public int f18704q;

        /* renamed from: r */
        public int f18705r;

        /* renamed from: s */
        public boolean f18706s;

        /* renamed from: t */
        public boolean f18707t;

        /* renamed from: u */
        public boolean f18708u;

        /* renamed from: v */
        public int f18709v;

        /* renamed from: w */
        public int f18710w;

        /* renamed from: x */
        public String f18711x;

        /* renamed from: y */
        public String f18712y;

        /* renamed from: z */
        public C6319b f18713z;

        public C5775b(Menu menu) {
            this.f18688a = menu;
            this.f18689b = 0;
            this.f18690c = 0;
            this.f18691d = 0;
            this.f18692e = 0;
            this.f18693f = true;
            this.f18694g = true;
        }

        /* renamed from: a */
        public final void mo21644a(MenuItem menuItem) {
            boolean z;
            Object obj;
            MenuItem enabled = menuItem.setChecked(this.f18706s).setVisible(this.f18707t).setEnabled(this.f18708u);
            boolean z2 = false;
            if (this.f18705r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f18699l).setIcon(this.f18700m);
            int i = this.f18709v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f18712y != null) {
                if (!C5773f.this.f18678c.isRestricted()) {
                    C5773f fVar = C5773f.this;
                    if (fVar.f18679d == null) {
                        fVar.f18679d = C5773f.m14212a(fVar.f18678c);
                    }
                    menuItem.setOnMenuItemClickListener(new C5774a(fVar.f18679d, this.f18712y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f18705r >= 2) {
                if (menuItem instanceof C0295h) {
                    ((C0295h) menuItem).mo1152f(true);
                } else if (menuItem instanceof C5893c) {
                    C5893c cVar = (C5893c) menuItem;
                    try {
                        if (cVar.f18965e == null) {
                            cVar.f18965e = cVar.f18964d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f18965e.invoke(cVar.f18964d, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f18711x;
            if (str != null) {
                Class<?>[] clsArr = C5773f.f18674e;
                C5773f fVar2 = C5773f.this;
                Object[] objArr = fVar2.f18676a;
                try {
                    Constructor<?> constructor = Class.forName(str, false, fVar2.f18678c.getClassLoader()).getConstructor(clsArr);
                    constructor.setAccessible(true);
                    obj = constructor.newInstance(objArr);
                } catch (Exception unused2) {
                    obj = null;
                }
                menuItem.setActionView((View) obj);
                z2 = true;
            }
            int i2 = this.f18710w;
            if (i2 > 0 && !z2) {
                menuItem.setActionView(i2);
            }
            C6319b bVar = this.f18713z;
            if (bVar != null && (menuItem instanceof C5554b)) {
                ((C5554b) menuItem).mo1147b(bVar);
            }
            CharSequence charSequence = this.f18683A;
            boolean z3 = menuItem instanceof C5554b;
            if (z3) {
                ((C5554b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C6375m.m15192h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f18684B;
            if (z3) {
                ((C5554b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C6375m.m15197m(menuItem, charSequence2);
            }
            char c = this.f18701n;
            int i3 = this.f18702o;
            if (z3) {
                ((C5554b) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C6375m.m15191g(menuItem, c, i3);
            }
            char c2 = this.f18703p;
            int i4 = this.f18704q;
            if (z3) {
                ((C5554b) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C6375m.m15195k(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.f18686D;
            if (mode != null) {
                if (z3) {
                    ((C5554b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C6375m.m15194j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f18685C;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((C5554b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C6375m.m15193i(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f18674e = r0
            f18675f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175n.C5773f.<clinit>():void");
    }

    public C5773f(Context context) {
        super(context);
        this.f18678c = context;
        Object[] objArr = {context};
        this.f18676a = objArr;
        this.f18677b = objArr;
    }

    /* renamed from: a */
    public static Object m14212a(Context context) {
        if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            return m14212a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    /* renamed from: b */
    public final void mo21641b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        char c;
        char c2;
        boolean z;
        Object obj;
        AttributeSet attributeSet2 = attributeSet;
        C5775b bVar = new C5775b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException(C25541a.m63881k("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            str = null;
                            z3 = false;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        } else if (name2.equals("group")) {
                            bVar.f18689b = 0;
                            bVar.f18690c = 0;
                            bVar.f18691d = 0;
                            bVar.f18692e = 0;
                            bVar.f18693f = true;
                            bVar.f18694g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f18695h) {
                                C6319b bVar2 = bVar.f18713z;
                                if (bVar2 == null || !bVar2.mo21856a()) {
                                    bVar.f18695h = true;
                                    bVar.mo21644a(bVar.f18688a.add(bVar.f18689b, bVar.f18696i, bVar.f18697j, bVar.f18698k));
                                } else {
                                    bVar.f18695h = true;
                                    bVar.mo21644a(bVar.f18688a.addSubMenu(bVar.f18689b, bVar.f18696i, bVar.f18697j, bVar.f18698k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z2 = true;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = C5773f.this.f18678c.obtainStyledAttributes(attributeSet2, C5224j.MenuGroup);
                        bVar.f18689b = obtainStyledAttributes.getResourceId(C5224j.MenuGroup_android_id, 0);
                        bVar.f18690c = obtainStyledAttributes.getInt(C5224j.MenuGroup_android_menuCategory, 0);
                        bVar.f18691d = obtainStyledAttributes.getInt(C5224j.MenuGroup_android_orderInCategory, 0);
                        bVar.f18692e = obtainStyledAttributes.getInt(C5224j.MenuGroup_android_checkableBehavior, 0);
                        bVar.f18693f = obtainStyledAttributes.getBoolean(C5224j.MenuGroup_android_visible, true);
                        bVar.f18694g = obtainStyledAttributes.getBoolean(C5224j.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = C5773f.this.f18678c;
                        C0413h1 h1Var = new C0413h1(context, context.obtainStyledAttributes(attributeSet2, C5224j.MenuItem));
                        bVar.f18696i = h1Var.mo2095i(C5224j.MenuItem_android_id, 0);
                        bVar.f18697j = (h1Var.mo2094h(C5224j.MenuItem_android_menuCategory, bVar.f18690c) & -65536) | (h1Var.mo2094h(C5224j.MenuItem_android_orderInCategory, bVar.f18691d) & 65535);
                        bVar.f18698k = h1Var.mo2097k(C5224j.MenuItem_android_title);
                        bVar.f18699l = h1Var.mo2097k(C5224j.MenuItem_android_titleCondensed);
                        bVar.f18700m = h1Var.mo2095i(C5224j.MenuItem_android_icon, 0);
                        String j = h1Var.mo2096j(C5224j.MenuItem_android_alphabeticShortcut);
                        if (j == null) {
                            c = 0;
                        } else {
                            c = j.charAt(0);
                        }
                        bVar.f18701n = c;
                        bVar.f18702o = h1Var.mo2094h(C5224j.MenuItem_alphabeticModifiers, 4096);
                        String j2 = h1Var.mo2096j(C5224j.MenuItem_android_numericShortcut);
                        if (j2 == null) {
                            c2 = 0;
                        } else {
                            c2 = j2.charAt(0);
                        }
                        bVar.f18703p = c2;
                        bVar.f18704q = h1Var.mo2094h(C5224j.MenuItem_numericModifiers, 4096);
                        int i2 = C5224j.MenuItem_android_checkable;
                        if (h1Var.mo2098l(i2)) {
                            bVar.f18705r = h1Var.mo2087a(i2, false) ? 1 : 0;
                        } else {
                            bVar.f18705r = bVar.f18692e;
                        }
                        bVar.f18706s = h1Var.mo2087a(C5224j.MenuItem_android_checked, false);
                        bVar.f18707t = h1Var.mo2087a(C5224j.MenuItem_android_visible, bVar.f18693f);
                        bVar.f18708u = h1Var.mo2087a(C5224j.MenuItem_android_enabled, bVar.f18694g);
                        bVar.f18709v = h1Var.mo2094h(C5224j.MenuItem_showAsAction, -1);
                        bVar.f18712y = h1Var.mo2096j(C5224j.MenuItem_android_onClick);
                        bVar.f18710w = h1Var.mo2095i(C5224j.MenuItem_actionLayout, 0);
                        bVar.f18711x = h1Var.mo2096j(C5224j.MenuItem_actionViewClass);
                        String j3 = h1Var.mo2096j(C5224j.MenuItem_actionProviderClass);
                        if (j3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && bVar.f18710w == 0 && bVar.f18711x == null) {
                            Class<?>[] clsArr = f18675f;
                            C5773f fVar = C5773f.this;
                            Object[] objArr = fVar.f18677b;
                            try {
                                Constructor constructor = Class.forName(j3, false, fVar.f18678c.getClassLoader()).getConstructor(clsArr);
                                constructor.setAccessible(true);
                                obj = constructor.newInstance(objArr);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            bVar.f18713z = (C6319b) obj;
                        } else {
                            bVar.f18713z = null;
                        }
                        bVar.f18683A = h1Var.mo2097k(C5224j.MenuItem_contentDescription);
                        bVar.f18684B = h1Var.mo2097k(C5224j.MenuItem_tooltipText);
                        int i3 = C5224j.MenuItem_iconTintMode;
                        if (h1Var.mo2098l(i3)) {
                            bVar.f18686D = C0418j0.m1109c(h1Var.mo2094h(i3, -1), bVar.f18686D);
                        } else {
                            bVar.f18686D = null;
                        }
                        int i4 = C5224j.MenuItem_iconTint;
                        if (h1Var.mo2098l(i4)) {
                            bVar.f18685C = h1Var.mo2088b(i4);
                        } else {
                            bVar.f18685C = null;
                        }
                        h1Var.mo2099n();
                        bVar.f18695h = false;
                    } else {
                        if (name3.equals("menu")) {
                            bVar.f18695h = true;
                            SubMenu addSubMenu = bVar.f18688a.addSubMenu(bVar.f18689b, bVar.f18696i, bVar.f18697j, bVar.f18698k);
                            bVar.mo21644a(addSubMenu.getItem());
                            mo21641b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            z3 = true;
                            str = name3;
                        }
                        eventType = xmlResourceParser.next();
                        i = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof C5553a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f18678c.getResources().getLayout(i);
            mo21641b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
