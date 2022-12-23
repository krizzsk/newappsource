package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import p114i.C5218d;
import p114i.C5220f;
import p114i.C5221g;
import p114i.C5224j;
import p127j.C5344a;
import p188o.C5901f;
import p242s1.C6319b;
import p242s1.C6333d0;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: b */
    public final C0330f f1115b;

    /* renamed from: c */
    public final C0331g f1116c;

    /* renamed from: d */
    public final View f1117d;

    /* renamed from: e */
    public final FrameLayout f1118e;

    /* renamed from: f */
    public final ImageView f1119f;

    /* renamed from: g */
    public final FrameLayout f1120g;

    /* renamed from: h */
    public C6319b f1121h;

    /* renamed from: i */
    public final C0326b f1122i;

    /* renamed from: j */
    public ListPopupWindow f1123j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f1124k;

    /* renamed from: l */
    public boolean f1125l;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: b */
        public static final int[] f1126b = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Drawable drawable;
            int resourceId;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1126b);
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable = C5344a.m13397a(context, resourceId);
            }
            setBackgroundDrawable(drawable);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0325a extends DataSetObserver {
        public C0325a() {
        }

        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1115b.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1115b.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class C0326b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0326b() {
        }

        public final void onGlobalLayout() {
            C6319b.C6320a aVar;
            if (!ActivityChooserView.this.mo1358b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().show();
            C6319b bVar = ActivityChooserView.this.f1121h;
            if (bVar != null && (aVar = bVar.f19975a) != null) {
                ((ActionMenuPresenter) aVar).mo1324n(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    public class C0327c extends View.AccessibilityDelegate {
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    public class C0328d extends C0438n0 {
        public C0328d(FrameLayout frameLayout) {
            super(frameLayout);
        }

        /* renamed from: b */
        public final C5901f mo1028b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* renamed from: c */
        public final boolean mo1029c() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.mo1358b() || !activityChooserView.f1125l) {
                return true;
            }
            activityChooserView.f1115b.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }

        /* renamed from: d */
        public final boolean mo1333d() {
            ActivityChooserView.this.mo1357a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    public class C0329e extends DataSetObserver {
        public C0329e() {
        }

        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1115b.getClass();
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    public class C0330f extends BaseAdapter {
        public C0330f() {
        }

        public final int getCount() {
            throw null;
        }

        public final Object getItem(int i) {
            throw null;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            getItemViewType(i);
            if (view == null || view.getId() != C5220f.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C5221g.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C5220f.icon);
            getItem(i);
            throw null;
        }

        public final int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    public class C0331g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public C0331g() {
        }

        public final void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1120g) {
                activityChooserView.mo1357a();
                ActivityChooserView.this.f1115b.getClass();
                throw null;
            } else if (view == activityChooserView.f1118e) {
                activityChooserView.f1115b.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onDismiss() {
            C6319b.C6320a aVar;
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1124k;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            C6319b bVar = ActivityChooserView.this.f1121h;
            if (bVar != null && (aVar = bVar.f19975a) != null) {
                ((ActionMenuPresenter) aVar).mo1324n(false);
            }
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ((C0330f) adapterView.getAdapter()).getClass();
            ActivityChooserView.this.mo1357a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.getClass();
            activityChooserView.f1115b.getClass();
            throw null;
        }

        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1120g) {
                activityChooserView.f1115b.getClass();
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo1357a() {
        if (mo1358b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f1122i);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo1358b() {
        return getListPopupWindow().mo1048a();
    }

    public C0389c getDataModel() {
        this.f1115b.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f1123j == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1123j = listPopupWindow;
            listPopupWindow.mo1626l(this.f1115b);
            ListPopupWindow listPopupWindow2 = this.f1123j;
            listPopupWindow2.f1241p = this;
            listPopupWindow2.f1250y = true;
            listPopupWindow2.f1251z.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f1123j;
            C0331g gVar = this.f1116c;
            listPopupWindow3.f1242q = gVar;
            listPopupWindow3.f1251z.setOnDismissListener(gVar);
        }
        return this.f1123j;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1115b.getClass();
        this.f1125l = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1115b.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1122i);
        }
        if (mo1358b()) {
            mo1357a();
        }
        this.f1125l = false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1117d.layout(0, 0, i3 - i, i4 - i2);
        if (!mo1358b()) {
            mo1357a();
        }
    }

    public final void onMeasure(int i, int i2) {
        View view = this.f1117d;
        if (this.f1120g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0389c cVar) {
        C0330f fVar = this.f1115b;
        ActivityChooserView.this.f1115b.getClass();
        fVar.notifyDataSetChanged();
        if (mo1358b()) {
            mo1357a();
            if (!mo1358b() && this.f1125l) {
                this.f1115b.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            }
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1119f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1119f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1124k = onDismissListener;
    }

    public void setProvider(C6319b bVar) {
        this.f1121h = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C0325a();
        this.f1122i = new C0326b();
        int[] iArr = C5224j.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C6333d0.m15028p(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        obtainStyledAttributes.getInt(C5224j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C5224j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C5221g.abc_activity_chooser_view, this, true);
        C0331g gVar = new C0331g();
        this.f1116c = gVar;
        View findViewById = findViewById(C5220f.activity_chooser_view_content);
        this.f1117d = findViewById;
        findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C5220f.default_activity_button);
        this.f1120g = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = C5220f.image;
        ImageView imageView = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C5220f.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new C0327c());
        frameLayout2.setOnTouchListener(new C0328d(frameLayout2));
        this.f1118e = frameLayout2;
        ImageView imageView2 = (ImageView) frameLayout2.findViewById(i2);
        this.f1119f = imageView2;
        imageView2.setImageDrawable(drawable);
        C0330f fVar = new C0330f();
        this.f1115b = fVar;
        fVar.registerDataSetObserver(new C0329e());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5218d.abc_config_prefDialogWidth));
    }
}
