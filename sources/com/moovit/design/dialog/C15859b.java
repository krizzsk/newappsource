package com.moovit.design.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.commons.utils.ApplicationBugException;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import p453dw.C16740o;
import p739px.C19037a;
import p977zz.C20930c;
import w00.C20263d;
import w00.C20264e;
import w00.C20265f;
import w00.C20266g;

/* renamed from: com.moovit.design.dialog.b */
public class C15859b extends C0942l {

    /* renamed from: l */
    public static final /* synthetic */ int f41329l = 0;

    /* renamed from: b */
    public String f41330b;

    /* renamed from: c */
    public final String[] f41331c = DateFormatSymbols.getInstance().getMonths();

    /* renamed from: d */
    public String[] f41332d;

    /* renamed from: e */
    public Calendar f41333e;

    /* renamed from: f */
    public NumberPicker f41334f;

    /* renamed from: g */
    public NumberPicker f41335g;

    /* renamed from: h */
    public int f41336h;

    /* renamed from: i */
    public int f41337i;

    /* renamed from: j */
    public int f41338j;

    /* renamed from: k */
    public final C15860a f41339k = new C15860a();

    /* renamed from: com.moovit.design.dialog.b$a */
    public class C15860a implements NumberPicker.OnValueChangeListener {
        public C15860a() {
        }

        public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
            C15859b bVar = C15859b.this;
            if (numberPicker == bVar.f41335g) {
                String[] strArr = bVar.f41331c;
                int length = i % strArr.length;
                int length2 = i2 % strArr.length;
                int I1 = bVar.mo47686I1();
                String[] strArr2 = bVar.f41331c;
                if (length == strArr2.length - 1 && length2 == 0) {
                    bVar.f41333e.add(2, 1);
                } else if (length == 0 && length2 == strArr2.length - 1) {
                    bVar.f41333e.add(2, -1);
                } else {
                    bVar.f41333e.add(2, length2 - length);
                }
                int I12 = bVar.mo47686I1();
                if (I1 != I12) {
                    bVar.mo47687J1(I1, I12);
                    bVar.f41334f.setValue(bVar.mo47686I1());
                    return;
                }
                return;
            }
            bVar.mo47687J1(i, i2);
        }
    }

    /* renamed from: com.moovit.design.dialog.b$b */
    public interface C15861b {
        /* renamed from: C */
        void mo24110C();

        /* renamed from: o0 */
        void mo24111o0();

        /* renamed from: v */
        void mo24112v(int i, int i2, String str);
    }

    /* renamed from: H1 */
    public final C15861b mo47685H1() {
        Fragment targetFragment = getTargetFragment();
        Fragment parentFragment = getParentFragment();
        FragmentActivity activity = getActivity();
        if (targetFragment instanceof C15861b) {
            return (C15861b) targetFragment;
        }
        if (parentFragment instanceof C15861b) {
            return (C15861b) parentFragment;
        }
        if (activity instanceof C15861b) {
            return (C15861b) activity;
        }
        return null;
    }

    /* renamed from: I1 */
    public final int mo47686I1() {
        return this.f41333e.get(1);
    }

    /* renamed from: J1 */
    public final void mo47687J1(int i, int i2) {
        this.f41333e.set(1, i2);
        int i3 = this.f41337i;
        if (i2 == i3) {
            mo47688K1(i2);
            int i4 = this.f41333e.get(2);
            int value = this.f41335g.getValue() % this.f41331c.length;
            if (value != i4) {
                this.f41333e.set(2, value);
            }
        } else if (i == i3) {
            this.f41335g.setValue(this.f41333e.get(2));
            mo47688K1(i2);
        }
    }

    /* renamed from: K1 */
    public final void mo47688K1(int i) {
        if (i == this.f41337i) {
            this.f41335g.setDisplayedValues((String[]) null);
            this.f41335g.setMaxValue(this.f41332d.length - 1);
            this.f41335g.setDisplayedValues(this.f41332d);
            this.f41335g.setWrapSelectorWheel(false);
            NumberPicker numberPicker = this.f41335g;
            numberPicker.setValue(numberPicker.getValue() + this.f41331c.length);
            return;
        }
        this.f41335g.setDisplayedValues((String[]) null);
        this.f41335g.setMaxValue(this.f41331c.length - 1);
        this.f41335g.setWrapSelectorWheel(true);
        this.f41335g.setDisplayedValues(this.f41331c);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C15861b H1 = mo47685H1();
        if (H1 != null) {
            H1.mo24110C();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C20266g.ThemeOverlay_Moovit_YearMonthPicker);
        setCancelable(true);
        this.f41330b = requireArguments().getString("tag");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C15858a aVar = new C15858a(requireContext(), getTheme());
        aVar.setCanceledOnTouchOutside(false);
        return aVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C20264e.year_month_picker_layout, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("minYear", this.f41336h);
        bundle.putInt("maxYear", this.f41337i);
        bundle.putInt("maxYearMaxMonth", this.f41338j);
        bundle.putInt("year", mo47686I1());
        bundle.putInt("month", this.f41333e.get(2));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null) {
            Calendar instance = Calendar.getInstance(C20930c.m49020b(requireContext()));
            this.f41333e = instance;
            int i = bundle.getInt("minYear", -1);
            if (i == -1) {
                i = instance.get(1);
            }
            this.f41336h = i;
            Calendar calendar = this.f41333e;
            int i2 = bundle.getInt("maxYear", -1);
            if (i >= i2) {
                i2 = Math.max(i, calendar.get(1)) + 20;
            }
            this.f41337i = i2;
            String[] strArr = this.f41331c;
            int i3 = bundle.getInt("maxYearMaxMonth", -1);
            if (i3 < 0 || i3 >= strArr.length) {
                i3 = strArr.length - 1;
            }
            this.f41338j = i3;
            Calendar calendar2 = this.f41333e;
            int i4 = this.f41336h;
            int i5 = this.f41337i;
            int i6 = bundle.getInt("year", -1);
            if (i6 == -1) {
                i6 = calendar2.get(1);
            }
            if (i4 <= i6 && i6 <= i5) {
                i4 = i6;
            }
            this.f41333e.set(1, i4);
            Calendar calendar3 = this.f41333e;
            int i7 = this.f41337i;
            int i8 = this.f41338j;
            String[] strArr2 = this.f41331c;
            int i9 = bundle.getInt("month", calendar3.get(2));
            if (i4 != i7) {
                i8 = strArr2.length - 1;
            }
            if (i9 < 0 || i9 > i8) {
                i9 = i8;
            }
            this.f41333e.set(2, i9);
            TextView textView = (TextView) view.findViewById(C20263d.title);
            Object obj = bundle.get("title");
            if (obj instanceof Integer) {
                textView.setText(((Integer) obj).intValue());
            } else if (obj instanceof CharSequence) {
                textView.setText((CharSequence) obj);
            } else {
                textView.setText(C20265f.year_month_picker_title);
            }
            String[] strArr3 = this.f41331c;
            String[] strArr4 = new String[(strArr3.length + this.f41338j + 1)];
            this.f41332d = strArr4;
            System.arraycopy(strArr3, 0, strArr4, 0, strArr3.length);
            String[] strArr5 = this.f41331c;
            System.arraycopy(strArr5, 0, this.f41332d, strArr5.length, this.f41338j + 1);
            this.f41334f = (NumberPicker) view.findViewById(C20263d.picker_year);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                TextView textView2 = (TextView) view.findViewById(C20263d.text);
                this.f41334f.setTextSize(textView2.getTextSize());
                this.f41334f.setTextColor(textView2.getCurrentTextColor());
            }
            this.f41334f.setMinValue(this.f41336h);
            this.f41334f.setMaxValue(this.f41337i);
            this.f41334f.setValue(mo47686I1());
            this.f41334f.setWrapSelectorWheel(false);
            this.f41334f.setOnValueChangedListener(this.f41339k);
            this.f41335g = (NumberPicker) view.findViewById(C20263d.picker_month);
            if (i11 >= 29) {
                TextView textView3 = (TextView) view.findViewById(C20263d.text);
                this.f41335g.setTextSize(textView3.getTextSize());
                this.f41335g.setTextColor(textView3.getCurrentTextColor());
            }
            this.f41335g.setMinValue(0);
            int I1 = mo47686I1();
            int i12 = this.f41333e.get(2);
            if (I1 == this.f41337i) {
                i12 += this.f41331c.length;
            }
            mo47688K1(I1);
            this.f41335g.setValue(i12);
            this.f41335g.setOnValueChangedListener(this.f41339k);
            Button button = (Button) view.findViewById(C20263d.positive_button);
            button.setOnClickListener(new C19037a(this, 2));
            Object obj2 = bundle.get("positiveButton");
            if (obj2 instanceof Integer) {
                button.setText(((Integer) obj2).intValue());
            } else if (obj2 instanceof CharSequence) {
                button.setText((CharSequence) obj2);
            } else {
                button.setText(C20265f.year_month_picker_positive_button);
            }
            Button button2 = (Button) view.findViewById(C20263d.negative_button);
            button2.setOnClickListener(new C16740o(this, 8));
            Object obj3 = bundle.get("negativeButton");
            if (obj3 instanceof Integer) {
                button2.setText(((Integer) obj3).intValue());
            } else if (obj3 instanceof CharSequence) {
                button2.setText((CharSequence) obj3);
            } else {
                button2.setText(C20265f.year_month_picker_negative_button);
            }
        } else {
            StringBuilder k = C13555b.m33972k("Must pass arguments to use ");
            k.append(getClass().getCanonicalName());
            throw new ApplicationBugException(k.toString());
        }
    }
}
