package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.view.menu.C0307m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5224j;
import p127j.C5344a;
import p175n.C5767b;
import p175n.C5773f;
import p242s1.C6333d0;
import p242s1.C6362h;
import p242s1.C6364i;
import p242s1.C6372l;
import p242s1.C6377n;
import p242s1.C6382p0;

public class Toolbar extends ViewGroup implements C6364i {

    /* renamed from: A */
    public ColorStateList f1373A;

    /* renamed from: B */
    public ColorStateList f1374B;

    /* renamed from: C */
    public boolean f1375C;

    /* renamed from: D */
    public boolean f1376D;

    /* renamed from: E */
    public final ArrayList<View> f1377E;

    /* renamed from: F */
    public final ArrayList<View> f1378F;

    /* renamed from: G */
    public final int[] f1379G;

    /* renamed from: H */
    public final C6372l f1380H;

    /* renamed from: I */
    public ArrayList<MenuItem> f1381I;

    /* renamed from: J */
    public C0378e f1382J;

    /* renamed from: K */
    public final C0374a f1383K;

    /* renamed from: L */
    public C0424k1 f1384L;

    /* renamed from: M */
    public ActionMenuPresenter f1385M;

    /* renamed from: N */
    public C0377d f1386N;

    /* renamed from: O */
    public C0300j.C0301a f1387O;

    /* renamed from: P */
    public C0291f.C0292a f1388P;

    /* renamed from: Q */
    public boolean f1389Q;

    /* renamed from: R */
    public final C0375b f1390R;

    /* renamed from: b */
    public ActionMenuView f1391b;

    /* renamed from: c */
    public AppCompatTextView f1392c;

    /* renamed from: d */
    public AppCompatTextView f1393d;

    /* renamed from: e */
    public AppCompatImageButton f1394e;

    /* renamed from: f */
    public AppCompatImageView f1395f;

    /* renamed from: g */
    public Drawable f1396g;

    /* renamed from: h */
    public CharSequence f1397h;

    /* renamed from: i */
    public AppCompatImageButton f1398i;

    /* renamed from: j */
    public View f1399j;

    /* renamed from: k */
    public Context f1400k;

    /* renamed from: l */
    public int f1401l;

    /* renamed from: m */
    public int f1402m;

    /* renamed from: n */
    public int f1403n;

    /* renamed from: o */
    public int f1404o;

    /* renamed from: p */
    public int f1405p;

    /* renamed from: q */
    public int f1406q;

    /* renamed from: r */
    public int f1407r;

    /* renamed from: s */
    public int f1408s;

    /* renamed from: t */
    public int f1409t;

    /* renamed from: u */
    public C0489z0 f1410u;

    /* renamed from: v */
    public int f1411v;

    /* renamed from: w */
    public int f1412w;

    /* renamed from: x */
    public int f1413x;

    /* renamed from: y */
    public CharSequence f1414y;

    /* renamed from: z */
    public CharSequence f1415z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0374a implements ActionMenuView.C0324d {
        public C0374a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0375b implements Runnable {
        public C0375b() {
        }

        public final void run() {
            ActionMenuPresenter actionMenuPresenter;
            ActionMenuView actionMenuView = Toolbar.this.f1391b;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.f1102u) != null) {
                actionMenuPresenter.mo1325o();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0376c implements View.OnClickListener {
        public C0376c() {
        }

        public final void onClick(View view) {
            C0295h hVar;
            C0377d dVar = Toolbar.this.f1386N;
            if (dVar == null) {
                hVar = null;
            } else {
                hVar = dVar.f1423c;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0377d implements C0300j {

        /* renamed from: b */
        public C0291f f1422b;

        /* renamed from: c */
        public C0295h f1423c;

        public C0377d() {
        }

        /* renamed from: b */
        public final void mo1049b(C0291f fVar, boolean z) {
        }

        /* renamed from: d */
        public final boolean mo1045d(C0295h hVar) {
            View view = Toolbar.this.f1399j;
            if (view instanceof C5767b) {
                ((C5767b) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1399j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1398i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1399j = null;
            int size = toolbar3.f1378F.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.f1378F.get(size));
                } else {
                    toolbar3.f1378F.clear();
                    this.f1423c = null;
                    Toolbar.this.requestLayout();
                    hVar.f951C = false;
                    hVar.f965n.mo1122p(false);
                    return true;
                }
            }
        }

        /* renamed from: e */
        public final void mo1051e(Parcelable parcelable) {
        }

        /* renamed from: f */
        public final boolean mo1052f(C0307m mVar) {
            return false;
        }

        /* renamed from: g */
        public final Parcelable mo1053g() {
            return null;
        }

        public final int getId() {
            return 0;
        }

        /* renamed from: h */
        public final boolean mo1047h(C0295h hVar) {
            Toolbar.this.mo1913c();
            ViewParent parent = Toolbar.this.f1398i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1398i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1398i);
            }
            Toolbar.this.f1399j = hVar.getActionView();
            this.f1423c = hVar;
            ViewParent parent2 = Toolbar.this.f1399j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1399j);
                }
                Toolbar.this.getClass();
                LayoutParams layoutParams = new LayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParams.f556a = 8388611 | (toolbar4.f1404o & 112);
                layoutParams.f1416b = 2;
                toolbar4.f1399j.setLayoutParams(layoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1399j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((LayoutParams) childAt.getLayoutParams()).f1416b == 2 || childAt == toolbar6.f1391b)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f1378F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            hVar.f951C = true;
            hVar.f965n.mo1122p(false);
            View view = Toolbar.this.f1399j;
            if (view instanceof C5767b) {
                ((C5767b) view).onActionViewExpanded();
            }
            return true;
        }

        /* renamed from: i */
        public final void mo1054i(boolean z) {
            if (this.f1423c != null) {
                C0291f fVar = this.f1422b;
                boolean z2 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1422b.getItem(i) == this.f1423c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1045d(this.f1423c);
                }
            }
        }

        /* renamed from: j */
        public final boolean mo1055j() {
            return false;
        }

        /* renamed from: k */
        public final void mo1075k(Context context, C0291f fVar) {
            C0295h hVar;
            C0291f fVar2 = this.f1422b;
            if (!(fVar2 == null || (hVar = this.f1423c) == null)) {
                fVar2.mo1106d(hVar);
            }
            this.f1422b = fVar;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public interface C0378e {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.toolbarStyle);
    }

    /* renamed from: g */
    public static LayoutParams m896g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C5773f(getContext());
    }

    /* renamed from: i */
    public static int m897i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C6362h.m15166b(marginLayoutParams) + C6362h.m15167c(marginLayoutParams);
    }

    /* renamed from: j */
    public static int m898j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void mo1911a(int i, ArrayList arrayList) {
        boolean z;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C6333d0.C6338e.m15063d(this));
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1416b == 0 && mo1968r(childAt)) {
                    int i3 = layoutParams.f556a;
                    WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                    int d = C6333d0.C6338e.m15063d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, d) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1416b == 0 && mo1968r(childAt2)) {
                int i5 = layoutParams2.f556a;
                WeakHashMap<View, C6382p0> weakHashMap3 = C6333d0.f19990a;
                int d2 = C6333d0.C6338e.m15063d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, d2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void addMenuProvider(C6377n nVar) {
        C6372l lVar = this.f1380H;
        lVar.f20025b.add(nVar);
        lVar.f20024a.run();
    }

    /* renamed from: b */
    public final void mo1912b(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = new LayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = m896g(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f1416b = 1;
        if (!z || this.f1399j == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1378F.add(view);
    }

    /* renamed from: c */
    public final void mo1913c() {
        if (this.f1398i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, C5215a.toolbarNavigationButtonStyle);
            this.f1398i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1396g);
            this.f1398i.setContentDescription(this.f1397h);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f556a = 8388611 | (this.f1404o & 112);
            layoutParams.f1416b = 2;
            this.f1398i.setLayoutParams(layoutParams);
            this.f1398i.setOnClickListener(new C0376c());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public final void mo1915d() {
        mo1916e();
        ActionMenuView actionMenuView = this.f1391b;
        if (actionMenuView.f1098q == null) {
            C0291f fVar = (C0291f) actionMenuView.getMenu();
            if (this.f1386N == null) {
                this.f1386N = new C0377d();
            }
            this.f1391b.setExpandedActionViewsExclusive(true);
            fVar.mo1101b(this.f1386N, this.f1400k);
        }
    }

    /* renamed from: e */
    public final void mo1916e() {
        if (this.f1391b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f1391b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1401l);
            this.f1391b.setOnMenuItemClickListener(this.f1383K);
            ActionMenuView actionMenuView2 = this.f1391b;
            C0300j.C0301a aVar = this.f1387O;
            C0291f.C0292a aVar2 = this.f1388P;
            actionMenuView2.f1103v = aVar;
            actionMenuView2.f1104w = aVar2;
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f556a = 8388613 | (this.f1404o & 112);
            this.f1391b.setLayoutParams(layoutParams);
            mo1912b(this.f1391b, false);
        }
    }

    /* renamed from: f */
    public final void mo1917f() {
        if (this.f1394e == null) {
            this.f1394e = new AppCompatImageButton(getContext(), (AttributeSet) null, C5215a.toolbarNavigationButtonStyle);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f556a = 8388611 | (this.f1404o & 112);
            this.f1394e.setLayoutParams(layoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m896g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1398i;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f1398i;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0489z0 z0Var = this.f1410u;
        if (z0Var == null) {
            return 0;
        }
        if (z0Var.f1673g) {
            return z0Var.f1667a;
        }
        return z0Var.f1668b;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1412w;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0489z0 z0Var = this.f1410u;
        if (z0Var != null) {
            return z0Var.f1667a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0489z0 z0Var = this.f1410u;
        if (z0Var != null) {
            return z0Var.f1668b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0489z0 z0Var = this.f1410u;
        if (z0Var == null) {
            return 0;
        }
        if (z0Var.f1673g) {
            return z0Var.f1668b;
        }
        return z0Var.f1667a;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1411v;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C0291f fVar;
        ActionMenuView actionMenuView = this.f1391b;
        if (actionMenuView == null || (fVar = actionMenuView.f1098q) == null || !fVar.hasVisibleItems()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1412w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1411v, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1395f;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1395f;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo1915d();
        return this.f1391b.getMenu();
    }

    public View getNavButtonView() {
        return this.f1394e;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1394e;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f1394e;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1385M;
    }

    public Drawable getOverflowIcon() {
        mo1915d();
        return this.f1391b.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1400k;
    }

    public int getPopupTheme() {
        return this.f1401l;
    }

    public CharSequence getSubtitle() {
        return this.f1415z;
    }

    public final TextView getSubtitleTextView() {
        return this.f1393d;
    }

    public CharSequence getTitle() {
        return this.f1414y;
    }

    public int getTitleMarginBottom() {
        return this.f1409t;
    }

    public int getTitleMarginEnd() {
        return this.f1407r;
    }

    public int getTitleMarginStart() {
        return this.f1406q;
    }

    public int getTitleMarginTop() {
        return this.f1408s;
    }

    public final TextView getTitleTextView() {
        return this.f1392c;
    }

    public C0415i0 getWrapper() {
        if (this.f1384L == null) {
            this.f1384L = new C0424k1(this, true);
        }
        return this.f1384L;
    }

    /* renamed from: h */
    public final int mo1952h(int i, View view) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = layoutParams.f556a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f1413x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = layoutParams.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = layoutParams.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: k */
    public final void mo1953k(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: l */
    public final void mo1954l() {
        Iterator<MenuItem> it = this.f1381I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        C6372l lVar = this.f1380H;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<C6377n> it2 = lVar.f20025b.iterator();
        while (it2.hasNext()) {
            it2.next().mo3991d(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1381I = currentMenuItems2;
        Iterator<C6377n> it3 = this.f1380H.f20025b.iterator();
        while (it3.hasNext()) {
            it3.next().mo3989b(menu);
        }
    }

    /* renamed from: m */
    public final boolean mo1955m(View view) {
        return view.getParent() == this || this.f1378F.contains(view);
    }

    /* renamed from: n */
    public final int mo1956n(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int h = mo1952h(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h, max + measuredWidth, view.getMeasuredHeight() + h);
        return measuredWidth + layoutParams.rightMargin + max;
    }

    /* renamed from: o */
    public final int mo1957o(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int h = mo1952h(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h, max, view.getMeasuredHeight() + h);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1390R);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1376D = false;
        }
        if (!this.f1376D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1376D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1376D = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0294 A[LOOP:0: B:99:0x0292->B:100:0x0294, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b6 A[LOOP:1: B:102:0x02b4->B:103:0x02b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02db A[LOOP:2: B:105:0x02d9->B:106:0x02db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x032d A[LOOP:3: B:113:0x032b->B:114:0x032d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            int r1 = p242s1.C6333d0.C6338e.m15063d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1379G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p242s1.C6333d0.C6337d.m15044d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f1394e
            boolean r13 = r0.mo1968r(r13)
            if (r13 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0050
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f1394e
            int r13 = r0.mo1957o(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x0059
        L_0x0050:
            androidx.appcompat.widget.AppCompatImageButton r13 = r0.f1394e
            int r13 = r0.mo1956n(r13, r6, r12, r11)
            goto L_0x0058
        L_0x0057:
            r13 = r6
        L_0x0058:
            r14 = r10
        L_0x0059:
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f1398i
            boolean r15 = r0.mo1968r(r15)
            if (r15 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x006a
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f1398i
            int r14 = r0.mo1957o(r15, r14, r12, r11)
            goto L_0x0070
        L_0x006a:
            androidx.appcompat.widget.AppCompatImageButton r15 = r0.f1398i
            int r13 = r0.mo1956n(r15, r13, r12, r11)
        L_0x0070:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1391b
            boolean r15 = r0.mo1968r(r15)
            if (r15 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1391b
            int r13 = r0.mo1956n(r15, r13, r12, r11)
            goto L_0x0087
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1391b
            int r14 = r0.mo1957o(r15, r14, r12, r11)
        L_0x0087:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1399j
            boolean r13 = r0.mo1968r(r13)
            if (r13 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00be
            android.view.View r13 = r0.f1399j
            int r10 = r0.mo1957o(r13, r10, r12, r11)
            goto L_0x00c4
        L_0x00be:
            android.view.View r13 = r0.f1399j
            int r2 = r0.mo1956n(r13, r2, r12, r11)
        L_0x00c4:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f1395f
            boolean r13 = r0.mo1968r(r13)
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d5
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f1395f
            int r10 = r0.mo1957o(r13, r10, r12, r11)
            goto L_0x00db
        L_0x00d5:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f1395f
            int r2 = r0.mo1956n(r13, r2, r12, r11)
        L_0x00db:
            androidx.appcompat.widget.AppCompatTextView r13 = r0.f1392c
            boolean r13 = r0.mo1968r(r13)
            androidx.appcompat.widget.AppCompatTextView r14 = r0.f1393d
            boolean r14 = r0.mo1968r(r14)
            if (r13 == 0) goto L_0x0102
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f1392c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r23 = r7
            androidx.appcompat.widget.AppCompatTextView r7 = r0.f1392c
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x0105
        L_0x0102:
            r23 = r7
            r7 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x011f
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1393d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            int r15 = r3.topMargin
            r16 = r4
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1393d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0121
        L_0x011f:
            r16 = r4
        L_0x0121:
            if (r13 != 0) goto L_0x012c
            if (r14 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r18 = r6
            r22 = r12
            goto L_0x0284
        L_0x012c:
            if (r13 == 0) goto L_0x0131
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1392c
            goto L_0x0133
        L_0x0131:
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1393d
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1393d
            goto L_0x013a
        L_0x0138:
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1392c
        L_0x013a:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            if (r13 == 0) goto L_0x0150
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f1392c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f1393d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x015a:
            r17 = 1
            goto L_0x015f
        L_0x015d:
            r17 = 0
        L_0x015f:
            int r15 = r0.f1413x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a1
            r6 = 80
            if (r15 == r6) goto L_0x0195
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.f1408s
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x017e
            r6 = r15
            goto L_0x0193
        L_0x017e:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r3.bottomMargin
            int r7 = r0.f1409t
            int r3 = r3 + r7
            if (r5 >= r3) goto L_0x0193
            int r3 = r4.bottomMargin
            int r3 = r3 + r7
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0193:
            int r8 = r8 + r6
            goto L_0x01ae
        L_0x0195:
            r22 = r12
            int r5 = r5 - r9
            int r3 = r4.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f1409t
            int r5 = r5 - r3
            int r8 = r5 - r7
            goto L_0x01ae
        L_0x01a1:
            r22 = r12
            int r4 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r4 = r4 + r3
            int r3 = r0.f1408s
            int r8 = r4 + r3
        L_0x01ae:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b5
            int r1 = r0.f1406q
            goto L_0x01b6
        L_0x01b5:
            r1 = 0
        L_0x01b6:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01ed
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1392c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1392c
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1392c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1392c
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.f1407r
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01ee
        L_0x01ed:
            r3 = r10
        L_0x01ee:
            if (r14 == 0) goto L_0x0214
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1393d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1393d
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1393d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1393d
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.f1407r
            int r1 = r10 - r1
            goto L_0x0215
        L_0x0214:
            r1 = r10
        L_0x0215:
            if (r17 == 0) goto L_0x0284
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x0284
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.f1406q
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x0258
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1392c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f1392c
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1392c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1392c
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f1407r
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0259
        L_0x0258:
            r3 = r2
        L_0x0259:
            if (r14 == 0) goto L_0x027d
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1393d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f1393d
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f1393d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f1393d
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.f1407r
            int r1 = r1 + r4
            goto L_0x027e
        L_0x027d:
            r1 = r2
        L_0x027e:
            if (r17 == 0) goto L_0x0284
            int r2 = java.lang.Math.max(r3, r1)
        L_0x0284:
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            r3 = 3
            r0.mo1911a(r3, r1)
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0292:
            if (r2 >= r1) goto L_0x02a5
            java.util.ArrayList<android.view.View> r4 = r0.f1377E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.mo1956n(r4, r3, r12, r11)
            int r2 = r2 + 1
            goto L_0x0292
        L_0x02a5:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            r2 = 5
            r0.mo1911a(r2, r1)
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            int r1 = r1.size()
            r2 = 0
        L_0x02b4:
            if (r2 >= r1) goto L_0x02c5
            java.util.ArrayList<android.view.View> r4 = r0.f1377E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo1957o(r4, r10, r12, r11)
            int r2 = r2 + 1
            goto L_0x02b4
        L_0x02c5:
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            r2 = 1
            r0.mo1911a(r2, r1)
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02d9:
            if (r5 >= r4) goto L_0x030c
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r9 = (androidx.appcompat.widget.Toolbar.LayoutParams) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02d9
        L_0x030c:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031c
            goto L_0x0323
        L_0x031c:
            if (r6 <= r10) goto L_0x0322
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0323
        L_0x0322:
            r3 = r4
        L_0x0323:
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L_0x032b:
            if (r3 >= r1) goto L_0x033c
            java.util.ArrayList<android.view.View> r4 = r0.f1377E
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo1956n(r4, r2, r12, r11)
            int r3 = r3 + 1
            goto L_0x032b
        L_0x033c:
            java.util.ArrayList<android.view.View> r1 = r0.f1377E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int[] iArr = this.f1379G;
        char a = C0453r1.m1265a(this);
        char c = a ^ 1;
        int i11 = 0;
        if (mo1968r(this.f1394e)) {
            mo1967q(this.f1394e, i, 0, i2, this.f1405p);
            i5 = m897i(this.f1394e) + this.f1394e.getMeasuredWidth();
            i4 = Math.max(0, m898j(this.f1394e) + this.f1394e.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.f1394e.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo1968r(this.f1398i)) {
            mo1967q(this.f1398i, i, 0, i2, this.f1405p);
            i5 = m897i(this.f1398i) + this.f1398i.getMeasuredWidth();
            i4 = Math.max(i4, m898j(this.f1398i) + this.f1398i.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f1398i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[a] = Math.max(0, currentContentInsetStart - i5);
        if (mo1968r(this.f1391b)) {
            mo1967q(this.f1391b, i, max, i2, this.f1405p);
            i6 = m897i(this.f1391b) + this.f1391b.getMeasuredWidth();
            i4 = Math.max(i4, m898j(this.f1391b) + this.f1391b.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f1391b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo1968r(this.f1399j)) {
            max2 += mo1966p(this.f1399j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, m898j(this.f1399j) + this.f1399j.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f1399j.getMeasuredState());
        }
        if (mo1968r(this.f1395f)) {
            max2 += mo1966p(this.f1395f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, m898j(this.f1395f) + this.f1395f.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.f1395f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((LayoutParams) childAt.getLayoutParams()).f1416b == 0 && mo1968r(childAt)) {
                max2 += mo1966p(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, m898j(childAt) + childAt.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f1408s + this.f1409t;
        int i14 = this.f1406q + this.f1407r;
        if (mo1968r(this.f1392c)) {
            mo1966p(this.f1392c, i, max2 + i14, i2, i13, iArr);
            int i15 = m897i(this.f1392c) + this.f1392c.getMeasuredWidth();
            i7 = m898j(this.f1392c) + this.f1392c.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i3, this.f1392c.getMeasuredState());
            i8 = i15;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (mo1968r(this.f1393d)) {
            int i16 = i7 + i13;
            i8 = Math.max(i8, mo1966p(this.f1393d, i, max2 + i14, i2, i16, iArr));
            i7 += m898j(this.f1393d) + this.f1393d.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f1393d.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f1389Q) {
            int childCount2 = getChildCount();
            int i18 = 0;
            while (true) {
                if (i18 >= childCount2) {
                    z = true;
                    break;
                }
                View childAt2 = getChildAt(i18);
                if (mo1968r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i18++;
            }
        }
        z = false;
        if (!z) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0291f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.f1391b;
        if (actionMenuView != null) {
            fVar = actionMenuView.f1098q;
        } else {
            fVar = null;
        }
        int i = savedState.f1417b;
        if (!(i == 0 || this.f1386N == null || fVar == null || (findItem = fVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1418c) {
            removeCallbacks(this.f1390R);
            post(this.f1390R);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f1410u == null) {
            this.f1410u = new C0489z0();
        }
        C0489z0 z0Var = this.f1410u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != z0Var.f1673g) {
            z0Var.f1673g = z;
            if (!z0Var.f1674h) {
                z0Var.f1667a = z0Var.f1671e;
                z0Var.f1668b = z0Var.f1672f;
            } else if (z) {
                int i2 = z0Var.f1670d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = z0Var.f1671e;
                }
                z0Var.f1667a = i2;
                int i3 = z0Var.f1669c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = z0Var.f1672f;
                }
                z0Var.f1668b = i3;
            } else {
                int i4 = z0Var.f1669c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = z0Var.f1671e;
                }
                z0Var.f1667a = i4;
                int i5 = z0Var.f1670d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = z0Var.f1672f;
                }
                z0Var.f1668b = i5;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        C0295h hVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0377d dVar = this.f1386N;
        if (!(dVar == null || (hVar = dVar.f1423c) == null)) {
            savedState.f1417b = hVar.f952a;
        }
        ActionMenuView actionMenuView = this.f1391b;
        boolean z2 = false;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f1102u;
            if (actionMenuPresenter == null || !actionMenuPresenter.mo1323m()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                z2 = true;
            }
        }
        savedState.f1418c = z2;
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1375C = false;
        }
        if (!this.f1375C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1375C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1375C = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int mo1966p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: q */
    public final void mo1967q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: r */
    public final boolean mo1968r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void removeMenuProvider(C6377n nVar) {
        this.f1380H.mo22477a(nVar);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C5344a.m13397a(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1389Q = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1412w) {
            this.f1412w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1411v) {
            this.f1411v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C5344a.m13397a(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C5344a.m13397a(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo1917f();
        this.f1394e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0378e eVar) {
        this.f1382J = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        mo1915d();
        this.f1391b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1401l != i) {
            this.f1401l = i;
            if (i == 0) {
                this.f1400k = getContext();
            } else {
                this.f1400k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1409t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1407r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1406q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1408s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        public int f1416b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            this.f556a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1416b = layoutParams.f1416b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1413x = 8388627;
        this.f1377E = new ArrayList<>();
        this.f1378F = new ArrayList<>();
        this.f1379G = new int[2];
        this.f1380H = new C6372l(new C0416i1(this, 0));
        this.f1381I = new ArrayList<>();
        this.f1383K = new C0374a();
        this.f1390R = new C0375b();
        Context context2 = getContext();
        int[] iArr = C5224j.Toolbar;
        C0413h1 m = C0413h1.m1063m(context2, attributeSet, iArr, i);
        C6333d0.m15028p(this, context, iArr, attributeSet, m.f1515b, i, 0);
        this.f1402m = m.mo2095i(C5224j.Toolbar_titleTextAppearance, 0);
        this.f1403n = m.mo2095i(C5224j.Toolbar_subtitleTextAppearance, 0);
        this.f1413x = m.f1515b.getInteger(C5224j.Toolbar_android_gravity, this.f1413x);
        this.f1404o = m.f1515b.getInteger(C5224j.Toolbar_buttonGravity, 48);
        int c = m.mo2089c(C5224j.Toolbar_titleMargin, 0);
        int i2 = C5224j.Toolbar_titleMargins;
        c = m.mo2098l(i2) ? m.mo2089c(i2, c) : c;
        this.f1409t = c;
        this.f1408s = c;
        this.f1407r = c;
        this.f1406q = c;
        int c2 = m.mo2089c(C5224j.Toolbar_titleMarginStart, -1);
        if (c2 >= 0) {
            this.f1406q = c2;
        }
        int c3 = m.mo2089c(C5224j.Toolbar_titleMarginEnd, -1);
        if (c3 >= 0) {
            this.f1407r = c3;
        }
        int c4 = m.mo2089c(C5224j.Toolbar_titleMarginTop, -1);
        if (c4 >= 0) {
            this.f1408s = c4;
        }
        int c5 = m.mo2089c(C5224j.Toolbar_titleMarginBottom, -1);
        if (c5 >= 0) {
            this.f1409t = c5;
        }
        this.f1405p = m.mo2090d(C5224j.Toolbar_maxButtonHeight, -1);
        int c6 = m.mo2089c(C5224j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int c7 = m.mo2089c(C5224j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int d = m.mo2090d(C5224j.Toolbar_contentInsetLeft, 0);
        int d2 = m.mo2090d(C5224j.Toolbar_contentInsetRight, 0);
        if (this.f1410u == null) {
            this.f1410u = new C0489z0();
        }
        C0489z0 z0Var = this.f1410u;
        z0Var.f1674h = false;
        if (d != Integer.MIN_VALUE) {
            z0Var.f1671e = d;
            z0Var.f1667a = d;
        }
        if (d2 != Integer.MIN_VALUE) {
            z0Var.f1672f = d2;
            z0Var.f1668b = d2;
        }
        if (!(c6 == Integer.MIN_VALUE && c7 == Integer.MIN_VALUE)) {
            z0Var.mo2212a(c6, c7);
        }
        this.f1411v = m.mo2089c(C5224j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1412w = m.mo2089c(C5224j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1396g = m.mo2091e(C5224j.Toolbar_collapseIcon);
        this.f1397h = m.mo2097k(C5224j.Toolbar_collapseContentDescription);
        CharSequence k = m.mo2097k(C5224j.Toolbar_title);
        if (!TextUtils.isEmpty(k)) {
            setTitle(k);
        }
        CharSequence k2 = m.mo2097k(C5224j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(k2)) {
            setSubtitle(k2);
        }
        this.f1400k = getContext();
        setPopupTheme(m.mo2095i(C5224j.Toolbar_popupTheme, 0));
        Drawable e = m.mo2091e(C5224j.Toolbar_navigationIcon);
        if (e != null) {
            setNavigationIcon(e);
        }
        CharSequence k3 = m.mo2097k(C5224j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(k3)) {
            setNavigationContentDescription(k3);
        }
        Drawable e2 = m.mo2091e(C5224j.Toolbar_logo);
        if (e2 != null) {
            setLogo(e2);
        }
        CharSequence k4 = m.mo2097k(C5224j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(k4)) {
            setLogoDescription(k4);
        }
        int i3 = C5224j.Toolbar_titleTextColor;
        if (m.mo2098l(i3)) {
            setTitleTextColor(m.mo2088b(i3));
        }
        int i4 = C5224j.Toolbar_subtitleTextColor;
        if (m.mo2098l(i4)) {
            setSubtitleTextColor(m.mo2088b(i4));
        }
        int i5 = C5224j.Toolbar_menu;
        if (m.mo2098l(i5)) {
            mo1953k(m.mo2095i(i5, 0));
        }
        m.mo2099n();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1913c();
        }
        AppCompatImageButton appCompatImageButton = this.f1398i;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1913c();
            this.f1398i.setImageDrawable(drawable);
            return;
        }
        AppCompatImageButton appCompatImageButton = this.f1398i;
        if (appCompatImageButton != null) {
            appCompatImageButton.setImageDrawable(this.f1396g);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1395f == null) {
                this.f1395f = new AppCompatImageView(getContext());
            }
            if (!mo1955m(this.f1395f)) {
                mo1912b(this.f1395f, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1395f;
            if (appCompatImageView != null && mo1955m(appCompatImageView)) {
                removeView(this.f1395f);
                this.f1378F.remove(this.f1395f);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1395f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1395f == null) {
            this.f1395f = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f1395f;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1917f();
        }
        AppCompatImageButton appCompatImageButton = this.f1394e;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            C0432l1.m1181a(this.f1394e, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo1917f();
            if (!mo1955m(this.f1394e)) {
                mo1912b(this.f1394e, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f1394e;
            if (appCompatImageButton != null && mo1955m(appCompatImageButton)) {
                removeView(this.f1394e);
                this.f1378F.remove(this.f1394e);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f1394e;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1393d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f1393d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1393d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1403n;
                if (i != 0) {
                    this.f1393d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1374B;
                if (colorStateList != null) {
                    this.f1393d.setTextColor(colorStateList);
                }
            }
            if (!mo1955m(this.f1393d)) {
                mo1912b(this.f1393d, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1393d;
            if (appCompatTextView2 != null && mo1955m(appCompatTextView2)) {
                removeView(this.f1393d);
                this.f1378F.remove(this.f1393d);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1393d;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f1415z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1374B = colorStateList;
        AppCompatTextView appCompatTextView = this.f1393d;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1392c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f1392c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1392c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1402m;
                if (i != 0) {
                    this.f1392c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1373A;
                if (colorStateList != null) {
                    this.f1392c.setTextColor(colorStateList);
                }
            }
            if (!mo1955m(this.f1392c)) {
                mo1912b(this.f1392c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1392c;
            if (appCompatTextView2 != null && mo1955m(appCompatTextView2)) {
                removeView(this.f1392c);
                this.f1378F.remove(this.f1392c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1392c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f1414y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1373A = colorStateList;
        AppCompatTextView appCompatTextView = this.f1392c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0373a();

        /* renamed from: b */
        public int f1417b;

        /* renamed from: c */
        public boolean f1418c;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public class C0373a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1417b = parcel.readInt();
            this.f1418c = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1417b);
            parcel.writeInt(this.f1418c ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
