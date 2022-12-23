package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0290e;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.t0 */
public final class C0458t0 extends ListPopupWindow implements C0455s0 {

    /* renamed from: E */
    public static Method f1620E;

    /* renamed from: D */
    public C0455s0 f1621D;

    /* renamed from: androidx.appcompat.widget.t0$a */
    public static class C0459a {
        /* renamed from: a */
        public static void m1277a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        public static void m1278b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$b */
    public static class C0460b {
        /* renamed from: a */
        public static void m1279a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$c */
    public static class C0461c extends C0427l0 {

        /* renamed from: o */
        public final int f1622o;

        /* renamed from: p */
        public final int f1623p;

        /* renamed from: q */
        public C0455s0 f1624q;

        /* renamed from: r */
        public C0295h f1625r;

        /* renamed from: androidx.appcompat.widget.t0$c$a */
        public static class C0462a {
            /* renamed from: a */
            public static int m1280a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C0461c(Context context, boolean z) {
            super(context, z);
            if (1 == C0462a.m1280a(context.getResources().getConfiguration())) {
                this.f1622o = 21;
                this.f1623p = 22;
                return;
            }
            this.f1622o = 22;
            this.f1623p = 21;
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0290e eVar;
            int pointToPosition;
            int i2;
            if (this.f1624q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    eVar = (C0290e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    eVar = (C0290e) adapter;
                }
                C0295h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < eVar.getCount()) {
                    hVar = eVar.getItem(i2);
                }
                C0295h hVar2 = this.f1625r;
                if (hVar2 != hVar) {
                    C0291f fVar = eVar.f915b;
                    if (hVar2 != null) {
                        this.f1624q.mo1073m(fVar, hVar2);
                    }
                    this.f1625r = hVar;
                    if (hVar != null) {
                        this.f1624q.mo1072c(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0290e eVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1622o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1623p) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    eVar = (C0290e) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    eVar = (C0290e) adapter;
                }
                eVar.f915b.mo1102c(false);
                return true;
            }
        }

        public void setHoverListener(C0455s0 s0Var) {
            this.f1624q = s0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1620E = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public C0458t0(Context context, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    /* renamed from: c */
    public final void mo1072c(C0291f fVar, C0295h hVar) {
        C0455s0 s0Var = this.f1621D;
        if (s0Var != null) {
            s0Var.mo1072c(fVar, hVar);
        }
    }

    /* renamed from: m */
    public final void mo1073m(C0291f fVar, MenuItem menuItem) {
        C0455s0 s0Var = this.f1621D;
        if (s0Var != null) {
            s0Var.mo1073m(fVar, menuItem);
        }
    }

    /* renamed from: p */
    public final C0427l0 mo1756p(Context context, boolean z) {
        C0461c cVar = new C0461c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
