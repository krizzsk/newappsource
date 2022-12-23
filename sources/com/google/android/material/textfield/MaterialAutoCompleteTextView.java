package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.internal.C14077m;
import java.util.Locale;
import p355ac.C13401b;
import p355ac.C13407h;
import p355ac.C13410k;
import p355ac.C13411l;
import p883wc.C20289a;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: f */
    public final ListPopupWindow f35470f;

    /* renamed from: g */
    public final AccessibilityManager f35471g;

    /* renamed from: h */
    public final Rect f35472h;

    /* renamed from: i */
    public final int f35473i;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    public class C14156a implements AdapterView.OnItemClickListener {
        public C14156a() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f35470f;
                if (!listPopupWindow.mo1048a()) {
                    obj = null;
                } else {
                    obj = listPopupWindow.f1229d.getSelectedItem();
                }
            } else {
                obj = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.m35225a(MaterialAutoCompleteTextView.this, obj);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    ListPopupWindow listPopupWindow2 = MaterialAutoCompleteTextView.this.f35470f;
                    if (!listPopupWindow2.mo1048a()) {
                        view = null;
                    } else {
                        view = listPopupWindow2.f1229d.getSelectedView();
                    }
                    ListPopupWindow listPopupWindow3 = MaterialAutoCompleteTextView.this.f35470f;
                    if (!listPopupWindow3.mo1048a()) {
                        i = -1;
                    } else {
                        i = listPopupWindow3.f1229d.getSelectedItemPosition();
                    }
                    ListPopupWindow listPopupWindow4 = MaterialAutoCompleteTextView.this.f35470f;
                    if (!listPopupWindow4.mo1048a()) {
                        j = Long.MIN_VALUE;
                    } else {
                        j = listPopupWindow4.f1229d.getSelectedItemId();
                    }
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f35470f.f1229d, view, i, j);
            }
            MaterialAutoCompleteTextView.this.f35470f.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.autoCompleteTextViewStyle);
    }

    /* renamed from: a */
    public static void m35225a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout mo42387b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b = mo42387b();
        if (b == null || !b.f35488F) {
            return super.getHint();
        }
        return b.getHint();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = mo42387b();
        if (b != null && b.f35488F && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = mo42387b();
            int i4 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f35470f;
                if (!listPopupWindow.mo1048a()) {
                    i3 = -1;
                } else {
                    i3 = listPopupWindow.f1229d.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i3) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable f = this.f35470f.mo1752f();
                if (f != null) {
                    f.getPadding(this.f35472h);
                    Rect rect = this.f35472h;
                    i5 += rect.left + rect.right;
                }
                i4 = b.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f35470f.mo1626l(getAdapter());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f35471g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f35470f.show();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, 0), attributeSet, i);
        this.f35472h = new Rect();
        Context context2 = getContext();
        TypedArray d = C14077m.m35060d(context2, attributeSet, C13411l.MaterialAutoCompleteTextView, i, C13410k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C13411l.MaterialAutoCompleteTextView_android_inputType;
        if (d.hasValue(i2) && d.getInt(i2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f35473i = d.getResourceId(C13411l.MaterialAutoCompleteTextView_simpleItemLayout, C13407h.mtrl_auto_complete_simple_item);
        this.f35471g = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f35470f = listPopupWindow;
        listPopupWindow.f1250y = true;
        listPopupWindow.f1251z.setFocusable(true);
        listPopupWindow.f1241p = this;
        listPopupWindow.f1251z.setInputMethodMode(2);
        listPopupWindow.mo1626l(getAdapter());
        listPopupWindow.f1242q = new C14156a();
        int i3 = C13411l.MaterialAutoCompleteTextView_simpleItems;
        if (d.hasValue(i3)) {
            setSimpleItems(d.getResourceId(i3, 0));
        }
        d.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f35473i, strArr));
    }
}
