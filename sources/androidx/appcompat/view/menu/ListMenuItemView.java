package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0302k;
import androidx.appcompat.widget.C0413h1;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5220f;
import p114i.C5221g;
import p114i.C5224j;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class ListMenuItemView extends LinearLayout implements C0302k.C0303a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C0295h f843b;

    /* renamed from: c */
    public ImageView f844c;

    /* renamed from: d */
    public RadioButton f845d;

    /* renamed from: e */
    public TextView f846e;

    /* renamed from: f */
    public CheckBox f847f;

    /* renamed from: g */
    public TextView f848g;

    /* renamed from: h */
    public ImageView f849h;

    /* renamed from: i */
    public ImageView f850i;

    /* renamed from: j */
    public LinearLayout f851j;

    /* renamed from: k */
    public Drawable f852k;

    /* renamed from: l */
    public int f853l;

    /* renamed from: m */
    public Context f854m;

    /* renamed from: n */
    public boolean f855n;

    /* renamed from: o */
    public Drawable f856o;

    /* renamed from: p */
    public boolean f857p;

    /* renamed from: q */
    public LayoutInflater f858q;

    /* renamed from: r */
    public boolean f859r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f858q == null) {
            this.f858q = LayoutInflater.from(getContext());
        }
        return this.f858q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f849h;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f850i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f850i.getLayoutParams();
            rect.top = this.f850i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r0 == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1009c(androidx.appcompat.view.menu.C0295h r11) {
        /*
            r10 = this;
            r10.f843b = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f956e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            androidx.appcompat.view.menu.f r0 = r11.f965n
            boolean r0 = r0.mo1121o()
            r3 = 1
            if (r0 == 0) goto L_0x0038
            androidx.appcompat.view.menu.f r0 = r11.f965n
            boolean r0 = r0.mo1120n()
            if (r0 == 0) goto L_0x0032
            char r0 = r11.f961j
            goto L_0x0034
        L_0x0032:
            char r0 = r11.f959h
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            androidx.appcompat.view.menu.f r4 = r11.f965n
            r4.mo1120n()
            if (r0 == 0) goto L_0x005f
            androidx.appcompat.view.menu.h r0 = r10.f843b
            androidx.appcompat.view.menu.f r4 = r0.f965n
            boolean r4 = r4.mo1121o()
            if (r4 == 0) goto L_0x005b
            androidx.appcompat.view.menu.f r4 = r0.f965n
            boolean r4 = r4.mo1120n()
            if (r4 == 0) goto L_0x0055
            char r0 = r0.f961j
            goto L_0x0057
        L_0x0055:
            char r0 = r0.f959h
        L_0x0057:
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = 8
        L_0x0061:
            if (r2 != 0) goto L_0x0119
            android.widget.TextView r0 = r10.f848g
            androidx.appcompat.view.menu.h r4 = r10.f843b
            androidx.appcompat.view.menu.f r5 = r4.f965n
            boolean r5 = r5.mo1120n()
            if (r5 == 0) goto L_0x0072
            char r5 = r4.f961j
            goto L_0x0074
        L_0x0072:
            char r5 = r4.f959h
        L_0x0074:
            if (r5 != 0) goto L_0x007a
            java.lang.String r1 = ""
            goto L_0x0116
        L_0x007a:
            androidx.appcompat.view.menu.f r6 = r4.f965n
            android.content.Context r6 = r6.f922a
            android.content.res.Resources r6 = r6.getResources()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            androidx.appcompat.view.menu.f r8 = r4.f965n
            android.content.Context r8 = r8.f922a
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            boolean r8 = r8.hasPermanentMenuKey()
            if (r8 == 0) goto L_0x009e
            int r8 = p114i.C5222h.abc_prepend_shortcut_label
            java.lang.String r8 = r6.getString(r8)
            r7.append(r8)
        L_0x009e:
            androidx.appcompat.view.menu.f r8 = r4.f965n
            boolean r8 = r8.mo1120n()
            if (r8 == 0) goto L_0x00a9
            int r4 = r4.f962k
            goto L_0x00ab
        L_0x00a9:
            int r4 = r4.f960i
        L_0x00ab:
            r8 = 65536(0x10000, float:9.18355E-41)
            int r9 = p114i.C5222h.abc_menu_meta_shortcut_label
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.C0295h.m690c(r4, r8, r9, r7)
            r8 = 4096(0x1000, float:5.74E-42)
            int r9 = p114i.C5222h.abc_menu_ctrl_shortcut_label
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.C0295h.m690c(r4, r8, r9, r7)
            r8 = 2
            int r9 = p114i.C5222h.abc_menu_alt_shortcut_label
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.C0295h.m690c(r4, r8, r9, r7)
            int r8 = p114i.C5222h.abc_menu_shift_shortcut_label
            java.lang.String r8 = r6.getString(r8)
            androidx.appcompat.view.menu.C0295h.m690c(r4, r3, r8, r7)
            r3 = 4
            int r8 = p114i.C5222h.abc_menu_sym_shortcut_label
            java.lang.String r8 = r6.getString(r8)
            androidx.appcompat.view.menu.C0295h.m690c(r4, r3, r8, r7)
            int r3 = p114i.C5222h.abc_menu_function_shortcut_label
            java.lang.String r3 = r6.getString(r3)
            androidx.appcompat.view.menu.C0295h.m690c(r4, r1, r3, r7)
            if (r5 == r1) goto L_0x0109
            r1 = 10
            if (r5 == r1) goto L_0x00ff
            r1 = 32
            if (r5 == r1) goto L_0x00f5
            r7.append(r5)
            goto L_0x0112
        L_0x00f5:
            int r1 = p114i.C5222h.abc_menu_space_shortcut_label
            java.lang.String r1 = r6.getString(r1)
            r7.append(r1)
            goto L_0x0112
        L_0x00ff:
            int r1 = p114i.C5222h.abc_menu_enter_shortcut_label
            java.lang.String r1 = r6.getString(r1)
            r7.append(r1)
            goto L_0x0112
        L_0x0109:
            int r1 = p114i.C5222h.abc_menu_delete_shortcut_label
            java.lang.String r1 = r6.getString(r1)
            r7.append(r1)
        L_0x0112:
            java.lang.String r1 = r7.toString()
        L_0x0116:
            r0.setText(r1)
        L_0x0119:
            android.widget.TextView r0 = r10.f848g
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x0126
            android.widget.TextView r0 = r10.f848g
            r0.setVisibility(r2)
        L_0x0126:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f968q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo1009c(androidx.appcompat.view.menu.h):void");
    }

    public C0295h getItemData() {
        return this.f843b;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f852k;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(this, drawable);
        TextView textView = (TextView) findViewById(C5220f.title);
        this.f846e = textView;
        int i = this.f853l;
        if (i != -1) {
            textView.setTextAppearance(this.f854m, i);
        }
        this.f848g = (TextView) findViewById(C5220f.shortcut);
        ImageView imageView = (ImageView) findViewById(C5220f.submenuarrow);
        this.f849h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f856o);
        }
        this.f850i = (ImageView) findViewById(C5220f.group_divider);
        this.f851j = (LinearLayout) findViewById(C5220f.content);
    }

    public final void onMeasure(int i, int i2) {
        if (this.f844c != null && this.f855n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f844c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        boolean z2;
        View view;
        CompoundButton compoundButton;
        if (z || this.f845d != null || this.f847f != null) {
            if ((this.f843b.f975x & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f845d == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(C5221g.abc_list_menu_item_radio, this, false);
                    this.f845d = radioButton;
                    LinearLayout linearLayout = this.f851j;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f845d;
                view = this.f847f;
            } else {
                if (this.f847f == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(C5221g.abc_list_menu_item_checkbox, this, false);
                    this.f847f = checkBox;
                    LinearLayout linearLayout2 = this.f851j;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f847f;
                view = this.f845d;
            }
            if (z) {
                compoundButton.setChecked(this.f843b.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f847f;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f845d;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        if ((this.f843b.f975x & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f845d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C5221g.abc_list_menu_item_radio, this, false);
                this.f845d = radioButton;
                LinearLayout linearLayout = this.f851j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f845d;
        } else {
            if (this.f847f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C5221g.abc_list_menu_item_checkbox, this, false);
                this.f847f = checkBox;
                LinearLayout linearLayout2 = this.f851j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f847f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f859r = z;
        this.f855n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f850i;
        if (imageView != null) {
            if (this.f857p || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f843b.f965n.getClass();
        boolean z = this.f859r;
        if (z || this.f855n) {
            ImageView imageView = this.f844c;
            if (imageView != null || drawable != null || this.f855n) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(C5221g.abc_list_menu_item_icon, this, false);
                    this.f844c = imageView2;
                    LinearLayout linearLayout = this.f851j;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f855n) {
                    ImageView imageView3 = this.f844c;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f844c.getVisibility() != 0) {
                        this.f844c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f844c.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f846e.setText(charSequence);
            if (this.f846e.getVisibility() != 0) {
                this.f846e.setVisibility(0);
            }
        } else if (this.f846e.getVisibility() != 8) {
            this.f846e.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0413h1 m = C0413h1.m1063m(getContext(), attributeSet, C5224j.MenuView, i);
        this.f852k = m.mo2091e(C5224j.MenuView_android_itemBackground);
        this.f853l = m.mo2095i(C5224j.MenuView_android_itemTextAppearance, -1);
        this.f855n = m.mo2087a(C5224j.MenuView_preserveIconSpacing, false);
        this.f854m = context;
        this.f856o = m.mo2091e(C5224j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C5215a.dropDownListViewStyle, 0);
        this.f857p = obtainStyledAttributes.hasValue(0);
        m.mo2099n();
        obtainStyledAttributes.recycle();
    }
}
