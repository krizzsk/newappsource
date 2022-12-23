package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0281a;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0297i;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.view.menu.C0307m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p114i.C5215a;
import p114i.C5221g;
import p141k1.C5450a;
import p188o.C5899d;
import p188o.C5901f;
import p242s1.C6319b;

public final class ActionMenuPresenter extends C0281a implements C6319b.C6320a {

    /* renamed from: k */
    public C0317d f1071k;

    /* renamed from: l */
    public Drawable f1072l;

    /* renamed from: m */
    public boolean f1073m;

    /* renamed from: n */
    public boolean f1074n;

    /* renamed from: o */
    public boolean f1075o;

    /* renamed from: p */
    public int f1076p;

    /* renamed from: q */
    public int f1077q;

    /* renamed from: r */
    public int f1078r;

    /* renamed from: s */
    public boolean f1079s;

    /* renamed from: t */
    public final SparseBooleanArray f1080t = new SparseBooleanArray();

    /* renamed from: u */
    public C0319e f1081u;

    /* renamed from: v */
    public C0314a f1082v;

    /* renamed from: w */
    public C0316c f1083w;

    /* renamed from: x */
    public C0315b f1084x;

    /* renamed from: y */
    public final C0320f f1085y = new C0320f();

    /* renamed from: z */
    public int f1086z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0313a();

        /* renamed from: b */
        public int f1087b;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public class C0313a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1087b);
        }

        public SavedState(Parcel parcel) {
            this.f1087b = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0314a extends C0297i {
        public C0314a(Context context, C0307m mVar, View view) {
            super(context, mVar, view, false, C5215a.actionOverflowMenuStyle);
            boolean z;
            if ((mVar.f1015A.f975x & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                View view2 = ActionMenuPresenter.this.f1071k;
                this.f984f = view2 == null ? (View) ActionMenuPresenter.this.f867i : view2;
            }
            C0320f fVar = ActionMenuPresenter.this.f1085y;
            this.f987i = fVar;
            C5899d dVar = this.f988j;
            if (dVar != null) {
                dVar.mo1044c(fVar);
            }
        }

        /* renamed from: c */
        public final void mo1209c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1082v = null;
            actionMenuPresenter.f1086z = 0;
            super.mo1209c();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C0315b extends ActionMenuItemView.C0280b {
        public C0315b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class C0316c implements Runnable {

        /* renamed from: b */
        public C0319e f1090b;

        public C0316c(C0319e eVar) {
            this.f1090b = eVar;
        }

        public final void run() {
            C0291f.C0292a aVar;
            C0291f fVar = ActionMenuPresenter.this.f862d;
            if (!(fVar == null || (aVar = fVar.f926e) == null)) {
                aVar.mo866b(fVar);
            }
            View view = (View) ActionMenuPresenter.this.f867i;
            if (!(view == null || view.getWindowToken() == null)) {
                C0319e eVar = this.f1090b;
                boolean z = true;
                if (!eVar.mo1208b()) {
                    if (eVar.f984f == null) {
                        z = false;
                    } else {
                        eVar.mo1210d(0, 0, false, false);
                    }
                }
                if (z) {
                    ActionMenuPresenter.this.f1081u = this.f1090b;
                }
            }
            ActionMenuPresenter.this.f1083w = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0317d extends AppCompatImageView implements ActionMenuView.C0321a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        public class C0318a extends C0438n0 {
            public C0318a(View view) {
                super(view);
            }

            /* renamed from: b */
            public final C5901f mo1028b() {
                C0319e eVar = ActionMenuPresenter.this.f1081u;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1207a();
            }

            /* renamed from: c */
            public final boolean mo1029c() {
                ActionMenuPresenter.this.mo1325o();
                return true;
            }

            /* renamed from: d */
            public final boolean mo1333d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f1083w != null) {
                    return false;
                }
                actionMenuPresenter.mo1322l();
                return true;
            }
        }

        public C0317d(Context context) {
            super(context, (AttributeSet) null, C5215a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0432l1.m1181a(this, getContentDescription());
            setOnTouchListener(new C0318a(this));
        }

        /* renamed from: a */
        public final boolean mo1007a() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo1008b() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1325o();
            return true;
        }

        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C5450a.C5452b.m13615f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0319e extends C0297i {
        public C0319e(Context context, C0291f fVar, C0317d dVar) {
            super(context, fVar, dVar, true, C5215a.actionOverflowMenuStyle);
            this.f985g = 8388613;
            C0320f fVar2 = ActionMenuPresenter.this.f1085y;
            this.f987i = fVar2;
            C5899d dVar2 = this.f988j;
            if (dVar2 != null) {
                dVar2.mo1044c(fVar2);
            }
        }

        /* renamed from: c */
        public final void mo1209c() {
            C0291f fVar = ActionMenuPresenter.this.f862d;
            if (fVar != null) {
                fVar.mo1102c(true);
            }
            ActionMenuPresenter.this.f1081u = null;
            super.mo1209c();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    public class C0320f implements C0300j.C0301a {
        public C0320f() {
        }

        /* renamed from: b */
        public final void mo903b(C0291f fVar, boolean z) {
            if (fVar instanceof C0307m) {
                fVar.mo1117k().mo1102c(false);
            }
            C0300j.C0301a aVar = ActionMenuPresenter.this.f864f;
            if (aVar != null) {
                aVar.mo903b(fVar, z);
            }
        }

        /* renamed from: c */
        public final boolean mo904c(C0291f fVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (fVar == actionMenuPresenter.f862d) {
                return false;
            }
            actionMenuPresenter.f1086z = ((C0307m) fVar).f1015A.f952a;
            C0300j.C0301a aVar = actionMenuPresenter.f864f;
            if (aVar != null) {
                return aVar.mo904c(fVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C5221g.abc_action_menu_layout, C5221g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public final View mo1321a(C0295h hVar, View view, ViewGroup viewGroup) {
        C0302k.C0303a aVar;
        View actionView = hVar.getActionView();
        int i = 0;
        if (actionView == null || hVar.mo1150e()) {
            if (view instanceof C0302k.C0303a) {
                aVar = (C0302k.C0303a) view;
            } else {
                aVar = (C0302k.C0303a) this.f863e.inflate(this.f866h, viewGroup, false);
            }
            aVar.mo1009c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f867i);
            if (this.f1084x == null) {
                this.f1084x = new C0315b();
            }
            actionMenuItemView.setPopupCallback(this.f1084x);
            actionView = (View) aVar;
        }
        if (hVar.f951C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m786j(layoutParams));
        }
        return actionView;
    }

    /* renamed from: b */
    public final void mo1049b(C0291f fVar, boolean z) {
        mo1322l();
        C0314a aVar = this.f1082v;
        if (aVar != null && aVar.mo1208b()) {
            aVar.f988j.dismiss();
        }
        C0300j.C0301a aVar2 = this.f864f;
        if (aVar2 != null) {
            aVar2.mo903b(fVar, z);
        }
    }

    /* renamed from: e */
    public final void mo1051e(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f1087b) > 0 && (findItem = this.f862d.findItem(i)) != null) {
            mo1052f((C0307m) findItem.getSubMenu());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1052f(androidx.appcompat.view.menu.C0307m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.f r2 = r0.f1016z
            androidx.appcompat.view.menu.f r3 = r8.f862d
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.C0307m) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.h r0 = r0.f1015A
            androidx.appcompat.view.menu.k r2 = r8.f867i
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x001d
            goto L_0x003a
        L_0x001d:
            int r4 = r2.getChildCount()
            r5 = 0
        L_0x0022:
            if (r5 >= r4) goto L_0x003a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.C0302k.C0303a
            if (r7 == 0) goto L_0x0037
            r7 = r6
            androidx.appcompat.view.menu.k$a r7 = (androidx.appcompat.view.menu.C0302k.C0303a) r7
            androidx.appcompat.view.menu.h r7 = r7.getItemData()
            if (r7 != r0) goto L_0x0037
            r3 = r6
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            return r1
        L_0x003d:
            androidx.appcompat.view.menu.h r0 = r9.f1015A
            int r0 = r0.f952a
            r8.f1086z = r0
            int r0 = r9.size()
            r2 = 0
        L_0x0048:
            r4 = 1
            if (r2 >= r0) goto L_0x0060
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x005d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x005d
            r0 = 1
            goto L_0x0061
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0060:
            r0 = 0
        L_0x0061:
            androidx.appcompat.widget.ActionMenuPresenter$a r2 = new androidx.appcompat.widget.ActionMenuPresenter$a
            android.content.Context r5 = r8.f861c
            r2.<init>(r5, r9, r3)
            r8.f1082v = r2
            r2.f986h = r0
            o.d r2 = r2.f988j
            if (r2 == 0) goto L_0x0073
            r2.mo1061p(r0)
        L_0x0073:
            androidx.appcompat.widget.ActionMenuPresenter$a r0 = r8.f1082v
            boolean r2 = r0.mo1208b()
            if (r2 == 0) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            android.view.View r2 = r0.f984f
            if (r2 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r0.mo1210d(r1, r1, r1, r1)
        L_0x0084:
            r1 = 1
        L_0x0085:
            if (r1 == 0) goto L_0x008f
            androidx.appcompat.view.menu.j$a r0 = r8.f864f
            if (r0 == 0) goto L_0x008e
            r0.mo904c(r9)
        L_0x008e:
            return r4
        L_0x008f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.mo1052f(androidx.appcompat.view.menu.m):boolean");
    }

    /* renamed from: g */
    public final Parcelable mo1053g() {
        SavedState savedState = new SavedState();
        savedState.f1087b = this.f1086z;
        return savedState;
    }

    /* renamed from: i */
    public final void mo1054i(boolean z) {
        C0302k kVar;
        int i;
        boolean z2;
        boolean z3;
        C0295h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f867i;
        boolean z4 = false;
        ArrayList<C0295h> arrayList = null;
        if (viewGroup != null) {
            C0291f fVar = this.f862d;
            if (fVar != null) {
                fVar.mo1114i();
                ArrayList<C0295h> l = this.f862d.mo1118l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0295h hVar2 = l.get(i2);
                    if ((hVar2.f975x & 32) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof C0302k.C0303a) {
                            hVar = ((C0302k.C0303a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a = mo1321a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f867i).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1071k) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f867i).requestLayout();
        C0291f fVar2 = this.f862d;
        if (fVar2 != null) {
            fVar2.mo1114i();
            ArrayList<C0295h> arrayList2 = fVar2.f930i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C6319b bVar = arrayList2.get(i3).f949A;
                if (bVar != null) {
                    bVar.f19975a = this;
                }
            }
        }
        C0291f fVar3 = this.f862d;
        if (fVar3 != null) {
            fVar3.mo1114i();
            arrayList = fVar3.f931j;
        }
        if (this.f1074n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !arrayList.get(0).f951C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f1071k == null) {
                this.f1071k = new C0317d(this.f860b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1071k.getParent();
            if (viewGroup3 != this.f867i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1071k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f867i;
                C0317d dVar = this.f1071k;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParams = new ActionMenuView.LayoutParams();
                layoutParams.gravity = 16;
                layoutParams.f1108a = true;
                actionMenuView.addView(dVar, layoutParams);
            }
        } else {
            C0317d dVar2 = this.f1071k;
            if (dVar2 != null && dVar2.getParent() == (kVar = this.f867i)) {
                ((ViewGroup) kVar).removeView(this.f1071k);
            }
        }
        ((ActionMenuView) this.f867i).setOverflowReserved(this.f1074n);
    }

    /* renamed from: j */
    public final boolean mo1055j() {
        int i;
        ArrayList<C0295h> arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ActionMenuPresenter actionMenuPresenter = this;
        C0291f fVar = actionMenuPresenter.f862d;
        if (fVar != null) {
            arrayList = fVar.mo1118l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = actionMenuPresenter.f1078r;
        int i4 = actionMenuPresenter.f1077q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f867i;
        int i5 = 0;
        boolean z9 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C0295h hVar = arrayList.get(i5);
            int i8 = hVar.f976y;
            if ((i8 & 2) == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i7++;
                } else {
                    z9 = true;
                }
            }
            if (actionMenuPresenter.f1079s && hVar.f951C) {
                i3 = 0;
            }
            i5++;
        }
        if (actionMenuPresenter.f1074n && (z9 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1080t;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            C0295h hVar2 = arrayList.get(i11);
            int i13 = hVar2.f976y;
            if ((i13 & 2) == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                View a = actionMenuPresenter.mo1321a(hVar2, (View) null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = hVar2.f953b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z);
                }
                hVar2.mo1153g(z);
            } else {
                if ((i13 & true) == z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int i15 = hVar2.f953b;
                    boolean z11 = sparseBooleanArray.get(i15);
                    if ((i9 > 0 || z11) && i4 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        View a2 = actionMenuPresenter.mo1321a(hVar2, (View) null, viewGroup);
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        if (i4 + i12 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z4 &= z6;
                    }
                    if (z4 && i15 != 0) {
                        sparseBooleanArray.put(i15, true);
                    } else if (z11) {
                        sparseBooleanArray.put(i15, false);
                        int i16 = 0;
                        while (i16 < i11) {
                            C0295h hVar3 = arrayList.get(i16);
                            if (hVar3.f953b == i15) {
                                if ((hVar3.f975x & 32) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    i9++;
                                }
                                hVar3.mo1153g(false);
                            }
                            i16++;
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    hVar2.mo1153g(z4);
                } else {
                    hVar2.mo1153g(false);
                    i11++;
                    i2 = 2;
                    actionMenuPresenter = this;
                    z = true;
                }
            }
            i11++;
            i2 = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo1075k(Context context, C0291f fVar) {
        this.f861c = context;
        LayoutInflater.from(context);
        this.f862d = fVar;
        Resources resources = context.getResources();
        if (!this.f1075o) {
            this.f1074n = true;
        }
        int i = 2;
        this.f1076p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f1078r = i;
        int i4 = this.f1076p;
        if (this.f1074n) {
            if (this.f1071k == null) {
                C0317d dVar = new C0317d(this.f860b);
                this.f1071k = dVar;
                if (this.f1073m) {
                    dVar.setImageDrawable(this.f1072l);
                    this.f1072l = null;
                    this.f1073m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1071k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f1071k.getMeasuredWidth();
        } else {
            this.f1071k = null;
        }
        this.f1077q = i4;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: l */
    public final boolean mo1322l() {
        C0302k kVar;
        C0316c cVar = this.f1083w;
        if (cVar == null || (kVar = this.f867i) == null) {
            C0319e eVar = this.f1081u;
            if (eVar == null) {
                return false;
            }
            if (eVar.mo1208b()) {
                eVar.f988j.dismiss();
            }
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.f1083w = null;
        return true;
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C0319e eVar = this.f1081u;
        return eVar != null && eVar.mo1208b();
    }

    /* renamed from: n */
    public final void mo1324n(boolean z) {
        if (z) {
            C0300j.C0301a aVar = this.f864f;
            if (aVar != null) {
                aVar.mo904c(this.f862d);
                return;
            }
            return;
        }
        C0291f fVar = this.f862d;
        if (fVar != null) {
            fVar.mo1102c(false);
        }
    }

    /* renamed from: o */
    public final boolean mo1325o() {
        C0291f fVar;
        if (!this.f1074n || mo1323m() || (fVar = this.f862d) == null || this.f867i == null || this.f1083w != null) {
            return false;
        }
        fVar.mo1114i();
        if (fVar.f931j.isEmpty()) {
            return false;
        }
        C0316c cVar = new C0316c(new C0319e(this.f861c, this.f862d, this.f1071k));
        this.f1083w = cVar;
        ((View) this.f867i).post(cVar);
        return true;
    }
}
