package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p127j.C5344a;
import p129j1.C5348a;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6390s0;
import p242s1.C6394u0;
import p242s1.C6410w0;
import p242s1.C6413x0;
import p242s1.C6415y0;
import p242s1.C6417z0;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13404e;
import p355ac.C13405f;
import p355ac.C13407h;
import p355ac.C13409j;
import p355ac.C13410k;
import p553ic.C17561a;
import p583jk.C17875h;
import p742qc.C19098b;
import p811tc.C19648g;

/* renamed from: com.google.android.material.datepicker.o */
public final class C13993o<S> extends C0942l {

    /* renamed from: x */
    public static final /* synthetic */ int f34720x = 0;

    /* renamed from: b */
    public final LinkedHashSet<C13999r<? super S>> f34721b = new LinkedHashSet<>();

    /* renamed from: c */
    public final LinkedHashSet<View.OnClickListener> f34722c = new LinkedHashSet<>();

    /* renamed from: d */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f34723d = new LinkedHashSet<>();

    /* renamed from: e */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f34724e = new LinkedHashSet<>();

    /* renamed from: f */
    public int f34725f;

    /* renamed from: g */
    public DateSelector<S> f34726g;

    /* renamed from: h */
    public C14007x<S> f34727h;

    /* renamed from: i */
    public CalendarConstraints f34728i;

    /* renamed from: j */
    public MaterialCalendar<S> f34729j;

    /* renamed from: k */
    public int f34730k;

    /* renamed from: l */
    public CharSequence f34731l;

    /* renamed from: m */
    public boolean f34732m;

    /* renamed from: n */
    public int f34733n;

    /* renamed from: o */
    public int f34734o;

    /* renamed from: p */
    public CharSequence f34735p;

    /* renamed from: q */
    public int f34736q;

    /* renamed from: r */
    public CharSequence f34737r;

    /* renamed from: s */
    public TextView f34738s;

    /* renamed from: t */
    public CheckableImageButton f34739t;

    /* renamed from: u */
    public C19648g f34740u;

    /* renamed from: v */
    public Button f34741v;

    /* renamed from: w */
    public boolean f34742w;

    /* renamed from: com.google.android.material.datepicker.o$a */
    public class C13994a implements View.OnClickListener {
        public C13994a() {
        }

        public final void onClick(View view) {
            Iterator<C13999r<? super S>> it = C13993o.this.f34721b.iterator();
            while (it.hasNext()) {
                C13993o.this.mo41566H1().mo41501S1();
                it.next().mo41575a();
            }
            C13993o.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.o$b */
    public class C13995b implements View.OnClickListener {
        public C13995b() {
        }

        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = C13993o.this.f34722c.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            C13993o.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.o$c */
    public class C13996c extends C14006w<S> {
        public C13996c() {
        }

        /* renamed from: a */
        public final void mo41572a() {
            C13993o.this.f34741v.setEnabled(false);
        }

        /* renamed from: b */
        public final void mo41573b(S s) {
            C13993o oVar = C13993o.this;
            int i = C13993o.f34720x;
            oVar.mo41568M1();
            C13993o oVar2 = C13993o.this;
            oVar2.f34741v.setEnabled(oVar2.mo41566H1().mo41499I1());
        }
    }

    /* renamed from: I1 */
    public static int m34909I1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C13403d.mtrl_calendar_content_padding);
        int i = new Month(C13979d0.m34898h()).f34658e;
        int dimensionPixelSize = resources.getDimensionPixelSize(C13403d.mtrl_calendar_day_width) * i;
        return ((i - 1) * resources.getDimensionPixelOffset(C13403d.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: J1 */
    public static boolean m34910J1(Context context) {
        return m34911K1(16843277, context);
    }

    /* renamed from: K1 */
    public static boolean m34911K1(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C19098b.m46246b(context, C13401b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: H1 */
    public final DateSelector<S> mo41566H1() {
        if (this.f34726g == null) {
            this.f34726g = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f34726g;
    }

    /* renamed from: L1 */
    public final void mo41567L1() {
        C14007x<S> xVar;
        Context requireContext = requireContext();
        int i = this.f34725f;
        if (i == 0) {
            i = mo41566H1().mo41506r0(requireContext);
        }
        DateSelector H1 = mo41566H1();
        CalendarConstraints calendarConstraints = this.f34728i;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", H1);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f34624e);
        materialCalendar.setArguments(bundle);
        this.f34729j = materialCalendar;
        if (this.f34739t.isChecked()) {
            DateSelector H12 = mo41566H1();
            CalendarConstraints calendarConstraints2 = this.f34728i;
            xVar = new C14000s<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", H12);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            xVar.setArguments(bundle2);
        } else {
            xVar = this.f34729j;
        }
        this.f34727h = xVar;
        mo41568M1();
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C0909a aVar = new C0909a(childFragmentManager);
        aVar.mo4111f(C13405f.mtrl_calendar_frame, this.f34727h, (String) null);
        aVar.mo4045k();
        this.f34727h.mo41519H1(new C13996c());
    }

    /* renamed from: M1 */
    public final void mo41568M1() {
        String W0 = mo41566H1().mo41502W0(getContext());
        this.f34738s.setContentDescription(String.format(getString(C13409j.mtrl_picker_announce_current_selection), new Object[]{W0}));
        this.f34738s.setText(W0);
    }

    /* renamed from: N1 */
    public final void mo41569N1(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f34739t.isChecked()) {
            str = checkableImageButton.getContext().getString(C13409j.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C13409j.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f34739t.setContentDescription(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f34723d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34725f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f34726g = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f34728i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f34730k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f34731l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f34733n = bundle.getInt("INPUT_MODE_KEY");
        this.f34734o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f34735p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f34736q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f34737r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i = this.f34725f;
        if (i == 0) {
            i = mo41566H1().mo41506r0(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.f34732m = m34910J1(context);
        int b = C19098b.m46246b(context, C13401b.colorSurface, C13993o.class.getCanonicalName());
        C19648g gVar = new C19648g(context, (AttributeSet) null, C13401b.materialCalendarStyle, C13410k.Widget_MaterialComponents_MaterialCalendar);
        this.f34740u = gVar;
        gVar.mo52001k(context);
        this.f34740u.mo52005n(ColorStateList.valueOf(b));
        C19648g gVar2 = this.f34740u;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        gVar2.mo52003m(C6333d0.C6342i.m15092i(decorView));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        if (this.f34732m) {
            i = C13407h.mtrl_picker_fullscreen;
        } else {
            i = C13407h.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f34732m) {
            inflate.findViewById(C13405f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m34909I1(context), -2));
        } else {
            inflate.findViewById(C13405f.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m34909I1(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C13405f.mtrl_picker_header_selection_text);
        this.f34738s = textView;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6340g.m15079f(textView, 1);
        this.f34739t = (CheckableImageButton) inflate.findViewById(C13405f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C13405f.mtrl_picker_title_text);
        CharSequence charSequence = this.f34731l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f34730k);
        }
        this.f34739t.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f34739t;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C5344a.m13397a(context, C13404e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C5344a.m13397a(context, C13404e.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f34739t;
        if (this.f34733n != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        C6333d0.m15029q(this.f34739t, (C6315a) null);
        mo41569N1(this.f34739t);
        this.f34739t.setOnClickListener(new C13998q(this));
        this.f34741v = (Button) inflate.findViewById(C13405f.confirm_button);
        if (mo41566H1().mo41499I1()) {
            this.f34741v.setEnabled(true);
        } else {
            this.f34741v.setEnabled(false);
        }
        this.f34741v.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.f34735p;
        if (charSequence2 != null) {
            this.f34741v.setText(charSequence2);
        } else {
            int i2 = this.f34734o;
            if (i2 != 0) {
                this.f34741v.setText(i2);
            }
        }
        this.f34741v.setOnClickListener(new C13994a());
        Button button = (Button) inflate.findViewById(C13405f.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f34737r;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.f34736q;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new C13995b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f34724e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Month month;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f34725f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f34726g);
        CalendarConstraints.C13956b bVar = new CalendarConstraints.C13956b(this.f34728i);
        Month month2 = this.f34729j.f34643f;
        if (month2 != null) {
            bVar.f34631c = Long.valueOf(month2.f34660g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f34632d);
        Month c = Month.m34865c(bVar.f34629a);
        Month c2 = Month.m34865c(bVar.f34630b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.f34631c;
        if (l == null) {
            month = null;
        } else {
            month = Month.m34865c(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(c, c2, dateValidator, month));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f34730k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f34731l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f34734o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f34735p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f34736q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f34737r);
    }

    public final void onStart() {
        Integer num;
        boolean z;
        int i;
        int i2;
        boolean z2;
        C17875h hVar;
        C17875h w0Var;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f34732m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f34740u);
            if (!this.f34742w) {
                View findViewById = requireView().findViewById(C13405f.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i3 = Build.VERSION.SDK_INT;
                boolean z3 = false;
                if (num == null || num.intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                int d = C14256d1.m35486d(window.getContext(), 16842801, -16777216);
                if (z) {
                    num = Integer.valueOf(d);
                }
                Integer valueOf = Integer.valueOf(d);
                if (i3 >= 30) {
                    C6394u0.m15246a(window, false);
                } else {
                    C6390s0.m15241a(window, false);
                }
                Context context = window.getContext();
                if (i3 < 23) {
                    i = C5348a.m13417m(C14256d1.m35486d(context, 16843857, -16777216), RecyclerView.C1119a0.FLAG_IGNORE);
                } else {
                    i = 0;
                }
                Context context2 = window.getContext();
                if (i3 < 27) {
                    i2 = C5348a.m13417m(C14256d1.m35486d(context2, 16843858, -16777216), RecyclerView.C1119a0.FLAG_IGNORE);
                } else {
                    i2 = 0;
                }
                window.setStatusBarColor(i);
                window.setNavigationBarColor(i2);
                boolean g = C14256d1.m35489g(num.intValue());
                if (C14256d1.m35489g(i) || (i == 0 && g)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean g2 = C14256d1.m35489g(valueOf.intValue());
                if (C14256d1.m35489g(i2) || (i2 == 0 && g2)) {
                    z3 = true;
                }
                View decorView = window.getDecorView();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    hVar = new C6417z0(window);
                } else {
                    if (i4 >= 26) {
                        w0Var = new C6415y0(window, decorView);
                    } else if (i4 >= 23) {
                        w0Var = new C6413x0(window, decorView);
                    } else {
                        w0Var = new C6410w0(window, decorView);
                    }
                    hVar = w0Var;
                }
                hVar.mo22540Q(z2);
                hVar.mo22541P(z3);
                C13997p pVar = new C13997p(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6342i.m15104u(findViewById, pVar);
                this.f34742w = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C13403d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f34740u, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C17561a(requireDialog(), rect));
        }
        mo41567L1();
    }

    public final void onStop() {
        this.f34727h.f34768b.clear();
        super.onStop();
    }
}
