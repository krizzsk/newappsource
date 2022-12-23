package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C0249h;
import java.util.WeakHashMap;
import p114i.C5215a;
import p127j.C5344a;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class AppCompatSpinner extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: j */
    public static final int[] f1163j = {16843505};

    /* renamed from: b */
    public final C0392d f1164b;

    /* renamed from: c */
    public final Context f1165c;

    /* renamed from: d */
    public C0463u f1166d;

    /* renamed from: e */
    public SpinnerAdapter f1167e;

    /* renamed from: f */
    public final boolean f1168f;

    /* renamed from: g */
    public C0343h f1169g;

    /* renamed from: h */
    public int f1170h;

    /* renamed from: i */
    public final Rect f1171i;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0332a();

        /* renamed from: b */
        public boolean f1172b;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public class C0332a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1172b ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1172b = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0333a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0333a() {
        }

        public final void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1615a()) {
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                appCompatSpinner.f1169g.mo1624j(C0335c.m810b(appCompatSpinner), C0335c.m809a(appCompatSpinner));
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0334b.m808a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public static final class C0334b {
        /* renamed from: a */
        public static void m808a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public static final class C0335c {
        /* renamed from: a */
        public static int m809a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        public static int m810b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        public static void m811c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        public static void m812d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static final class C0336d {
        /* renamed from: a */
        public static void m813a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public class C0337e implements C0343h, DialogInterface.OnClickListener {

        /* renamed from: b */
        public C0249h f1174b;

        /* renamed from: c */
        public ListAdapter f1175c;

        /* renamed from: d */
        public CharSequence f1176d;

        public C0337e() {
        }

        /* renamed from: a */
        public final boolean mo1615a() {
            C0249h hVar = this.f1174b;
            if (hVar != null) {
                return hVar.isShowing();
            }
            return false;
        }

        /* renamed from: b */
        public final int mo1616b() {
            return 0;
        }

        /* renamed from: d */
        public final void mo1617d(int i) {
        }

        public final void dismiss() {
            C0249h hVar = this.f1174b;
            if (hVar != null) {
                hVar.dismiss();
                this.f1174b = null;
            }
        }

        /* renamed from: e */
        public final CharSequence mo1619e() {
            return this.f1176d;
        }

        /* renamed from: f */
        public final Drawable mo1620f() {
            return null;
        }

        /* renamed from: g */
        public final void mo1621g(CharSequence charSequence) {
            this.f1176d = charSequence;
        }

        /* renamed from: h */
        public final void mo1622h(int i) {
        }

        /* renamed from: i */
        public final void mo1623i(int i) {
        }

        /* renamed from: j */
        public final void mo1624j(int i, int i2) {
            if (this.f1175c != null) {
                C0249h.C0250a aVar = new C0249h.C0250a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1176d;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                ListAdapter listAdapter = this.f1175c;
                int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
                AlertController.C0216b bVar = aVar.f735a;
                bVar.f611m = listAdapter;
                bVar.f612n = this;
                bVar.f615q = selectedItemPosition;
                bVar.f614p = true;
                C0249h create = aVar.create();
                this.f1174b = create;
                AlertController.RecycleListView recycleListView = create.f734f.f576g;
                C0335c.m812d(recycleListView, i);
                C0335c.m811c(recycleListView, i2);
                this.f1174b.show();
            }
        }

        /* renamed from: k */
        public final int mo1625k() {
            return 0;
        }

        /* renamed from: l */
        public final void mo1626l(ListAdapter listAdapter) {
            this.f1175c = listAdapter;
        }

        /* renamed from: o */
        public final void mo1627o(Drawable drawable) {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f1175c.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public static class C0338f implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f1178b;

        /* renamed from: c */
        public ListAdapter f1179c;

        public C0338f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1178b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1179c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C0336d.m813a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof C0394d1) {
                C0394d1 d1Var = (C0394d1) spinnerAdapter;
                if (d1Var.getDropDownViewTheme() == null) {
                    d1Var.mo2063e();
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1179c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1178b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1178b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1178b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1178b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1178b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1179c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1178b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1178b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public class C0339g extends ListPopupWindow implements C0343h {

        /* renamed from: D */
        public CharSequence f1180D;

        /* renamed from: E */
        public ListAdapter f1181E;

        /* renamed from: F */
        public final Rect f1182F = new Rect();

        /* renamed from: G */
        public int f1183G;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g$a */
        public class C0340a implements AdapterView.OnItemClickListener {
            public C0340a() {
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0339g gVar = C0339g.this;
                    AppCompatSpinner.this.performItemClick(view, i, gVar.f1181E.getItemId(i));
                }
                C0339g.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g$b */
        public class C0341b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0341b() {
            }

            public final void onGlobalLayout() {
                boolean z;
                C0339g gVar = C0339g.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                gVar.getClass();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (!C6333d0.C6340g.m15075b(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(gVar.f1182F)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C0339g.this.dismiss();
                    return;
                }
                C0339g.this.mo1642r();
                C0339g.this.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g$c */
        public class C0342c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1187b;

            public C0342c(C0341b bVar) {
                this.f1187b = bVar;
            }

            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1187b);
                }
            }
        }

        public C0339g(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1241p = AppCompatSpinner.this;
            this.f1250y = true;
            this.f1251z.setFocusable(true);
            this.f1242q = new C0340a();
        }

        /* renamed from: e */
        public final CharSequence mo1619e() {
            return this.f1180D;
        }

        /* renamed from: g */
        public final void mo1621g(CharSequence charSequence) {
            this.f1180D = charSequence;
        }

        /* renamed from: i */
        public final void mo1623i(int i) {
            this.f1183G = i;
        }

        /* renamed from: j */
        public final void mo1624j(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a = mo1048a();
            mo1642r();
            this.f1251z.setInputMethodMode(2);
            show();
            C0427l0 l0Var = this.f1229d;
            l0Var.setChoiceMode(1);
            C0335c.m812d(l0Var, i);
            C0335c.m811c(l0Var, i2);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            C0427l0 l0Var2 = this.f1229d;
            if (mo1048a() && l0Var2 != null) {
                l0Var2.setListSelectionHidden(false);
                l0Var2.setSelection(selectedItemPosition);
                if (l0Var2.getChoiceMode() != 0) {
                    l0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0341b bVar = new C0341b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f1251z.setOnDismissListener(new C0342c(bVar));
            }
        }

        /* renamed from: l */
        public final void mo1626l(ListAdapter listAdapter) {
            super.mo1626l(listAdapter);
            this.f1181E = listAdapter;
        }

        /* renamed from: r */
        public final void mo1642r() {
            int i;
            int i2;
            Drawable f = mo1752f();
            int i3 = 0;
            if (f != null) {
                f.getPadding(AppCompatSpinner.this.f1171i);
                if (C0453r1.m1265a(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f1171i.right;
                } else {
                    i2 = -AppCompatSpinner.this.f1171i.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f1171i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.f1170h;
            if (i4 == -2) {
                int a = appCompatSpinner.mo1582a((SpinnerAdapter) this.f1181E, mo1752f());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1171i;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a > i6) {
                    a = i6;
                }
                mo1757q(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                mo1757q((width - paddingLeft) - paddingRight);
            } else {
                mo1757q(i4);
            }
            if (C0453r1.m1265a(AppCompatSpinner.this)) {
                i = (((width - paddingRight) - this.f1231f) - this.f1183G) + i3;
            } else {
                i = paddingLeft + this.f1183G + i3;
            }
            this.f1232g = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    public interface C0343h {
        /* renamed from: a */
        boolean mo1615a();

        /* renamed from: b */
        int mo1616b();

        /* renamed from: d */
        void mo1617d(int i);

        void dismiss();

        /* renamed from: e */
        CharSequence mo1619e();

        /* renamed from: f */
        Drawable mo1620f();

        /* renamed from: g */
        void mo1621g(CharSequence charSequence);

        /* renamed from: h */
        void mo1622h(int i);

        /* renamed from: i */
        void mo1623i(int i);

        /* renamed from: j */
        void mo1624j(int i, int i2);

        /* renamed from: k */
        int mo1625k();

        /* renamed from: l */
        void mo1626l(ListAdapter listAdapter);

        /* renamed from: o */
        void mo1627o(Drawable drawable);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.spinnerStyle);
    }

    /* renamed from: a */
    public final int mo1582a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1171i);
        Rect rect = this.f1171i;
        return i2 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.f1164b;
        if (dVar != null) {
            dVar.mo2054a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0343h hVar = this.f1169g;
        if (hVar != null) {
            return hVar.mo1616b();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0343h hVar = this.f1169g;
        if (hVar != null) {
            return hVar.mo1625k();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1169g != null) {
            return this.f1170h;
        }
        return super.getDropDownWidth();
    }

    public final C0343h getInternalPopup() {
        return this.f1169g;
    }

    public Drawable getPopupBackground() {
        C0343h hVar = this.f1169g;
        if (hVar != null) {
            return hVar.mo1620f();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1165c;
    }

    public CharSequence getPrompt() {
        C0343h hVar = this.f1169g;
        return hVar != null ? hVar.mo1619e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.f1164b;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.f1164b;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0343h hVar = this.f1169g;
        if (hVar != null && hVar.mo1615a()) {
            this.f1169g.dismiss();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1169g != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1582a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1172b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0333a());
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0343h hVar = this.f1169g;
        if (hVar == null || !hVar.mo1615a()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f1172b = z;
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0463u uVar = this.f1166d;
        if (uVar == null || !uVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        C0343h hVar = this.f1169g;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.mo1615a()) {
            return true;
        }
        this.f1169g.mo1624j(C0335c.m810b(this), C0335c.m809a(this));
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.f1164b;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.f1164b;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0343h hVar = this.f1169g;
        if (hVar != null) {
            hVar.mo1623i(i);
            this.f1169g.mo1617d(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0343h hVar = this.f1169g;
        if (hVar != null) {
            hVar.mo1622h(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1169g != null) {
            this.f1170h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0343h hVar = this.f1169g;
        if (hVar != null) {
            hVar.mo1627o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C5344a.m13397a(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0343h hVar = this.f1169g;
        if (hVar != null) {
            hVar.mo1621g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.f1164b;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.f1164b;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r4 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f1171i = r0
            android.content.Context r0 = r8.getContext()
            androidx.appcompat.widget.C0391c1.m972a(r0, r8)
            int[] r0 = p114i.C5224j.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r8)
            r8.f1164b = r2
            int r2 = p114i.C5224j.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002f
            n.c r3 = new n.c
            r3.<init>((android.content.Context) r9, (int) r2)
            r8.f1165c = r3
            goto L_0x0031
        L_0x002f:
            r8.f1165c = r9
        L_0x0031:
            r2 = 0
            r3 = -1
            int[] r4 = f1163j     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r4, r11, r1)     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            if (r5 == 0) goto L_0x0055
            int r1 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r3 = r1
            goto L_0x0055
        L_0x0045:
            r9 = move-exception
            r2 = r4
            goto L_0x004b
        L_0x0048:
            goto L_0x0053
        L_0x004a:
            r9 = move-exception
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.recycle()
        L_0x0050:
            throw r9
        L_0x0051:
            r4 = r2
        L_0x0053:
            if (r4 == 0) goto L_0x0058
        L_0x0055:
            r4.recycle()
        L_0x0058:
            r1 = 1
            if (r3 == 0) goto L_0x0096
            if (r3 == r1) goto L_0x005e
            goto L_0x00a5
        L_0x005e:
            androidx.appcompat.widget.AppCompatSpinner$g r3 = new androidx.appcompat.widget.AppCompatSpinner$g
            android.content.Context r4 = r8.f1165c
            r3.<init>(r4, r10, r11)
            android.content.Context r4 = r8.f1165c
            int[] r5 = p114i.C5224j.Spinner
            androidx.appcompat.widget.h1 r4 = androidx.appcompat.widget.C0413h1.m1063m(r4, r10, r5, r11)
            int r5 = p114i.C5224j.Spinner_android_dropDownWidth
            r6 = -2
            android.content.res.TypedArray r7 = r4.f1515b
            int r5 = r7.getLayoutDimension(r5, r6)
            r8.f1170h = r5
            int r5 = p114i.C5224j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r4.mo2091e(r5)
            r3.mo1755o(r5)
            int r5 = p114i.C5224j.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.f1180D = r5
            r4.mo2099n()
            r8.f1169g = r3
            androidx.appcompat.widget.u r4 = new androidx.appcompat.widget.u
            r4.<init>(r8, r8, r3)
            r8.f1166d = r4
            goto L_0x00a5
        L_0x0096:
            androidx.appcompat.widget.AppCompatSpinner$e r3 = new androidx.appcompat.widget.AppCompatSpinner$e
            r3.<init>()
            r8.f1169g = r3
            int r4 = p114i.C5224j.Spinner_android_prompt
            java.lang.String r4 = r0.getString(r4)
            r3.f1176d = r4
        L_0x00a5:
            int r3 = p114i.C5224j.Spinner_android_entries
            java.lang.CharSequence[] r3 = r0.getTextArray(r3)
            if (r3 == 0) goto L_0x00bd
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r4.<init>(r9, r5, r3)
            int r9 = p114i.C5221g.support_simple_spinner_dropdown_item
            r4.setDropDownViewResource(r9)
            r8.setAdapter((android.widget.SpinnerAdapter) r4)
        L_0x00bd:
            r0.recycle()
            r8.f1168f = r1
            android.widget.SpinnerAdapter r9 = r8.f1167e
            if (r9 == 0) goto L_0x00cb
            r8.setAdapter((android.widget.SpinnerAdapter) r9)
            r8.f1167e = r2
        L_0x00cb:
            androidx.appcompat.widget.d r9 = r8.f1164b
            r9.mo2057d(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1168f) {
            this.f1167e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1169g != null) {
            Context context = this.f1165c;
            if (context == null) {
                context = getContext();
            }
            this.f1169g.mo1626l(new C0338f(spinnerAdapter, context.getTheme()));
        }
    }
}
