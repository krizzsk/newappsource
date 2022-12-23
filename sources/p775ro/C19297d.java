package p775ro;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.C1373d;
import com.google.android.exoplayer2.p052ui.C4056v;
import com.masabi.justride.sdk.p415ui.features.ticket.ValidationMode;
import com.masabi.justride.sdk.p415ui.features.ticket.VisualValidationView;
import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import java.util.Date;
import mf0.C24362h;
import p073e7.C4583a;
import p073e7.C4584b;
import p116i1.C5247f;
import p259t5.C6593c;
import p297w5.C6996c;
import p565io.C17626c;
import p584jl.C17885a;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18062p;
import p605ki.C18063q;
import p605ki.C18066t;
import p611ko.C18109a;
import p611ko.C18111c;
import p635lo.C18248a;
import p658mo.C18411e;
import p775ro.C19305j;

/* renamed from: ro.d */
public class C19297d extends C17626c<C19297d, C19305j> {

    /* renamed from: N */
    public static final /* synthetic */ int f49059N = 0;

    /* renamed from: A */
    public WebView f49060A;

    /* renamed from: B */
    public FrameLayout f49061B;

    /* renamed from: C */
    public ViewGroup f49062C;

    /* renamed from: D */
    public Button f49063D;

    /* renamed from: E */
    public Button f49064E;

    /* renamed from: F */
    public ViewGroup f49065F;

    /* renamed from: G */
    public TextView f49066G;

    /* renamed from: H */
    public ViewGroup f49067H;

    /* renamed from: I */
    public TextView f49068I;

    /* renamed from: J */
    public ViewGroup f49069J;

    /* renamed from: K */
    public ViewGroup f49070K;

    /* renamed from: L */
    public TextView f49071L;

    /* renamed from: M */
    public C19295b f49072M;

    /* renamed from: e */
    public View f49073e;

    /* renamed from: f */
    public View f49074f;

    /* renamed from: g */
    public ImageView f49075g;

    /* renamed from: h */
    public TextView f49076h;

    /* renamed from: i */
    public View f49077i;

    /* renamed from: j */
    public ImageView f49078j;

    /* renamed from: k */
    public TextView f49079k;

    /* renamed from: l */
    public View f49080l;

    /* renamed from: m */
    public ViewGroup f49081m;

    /* renamed from: n */
    public TextView f49082n;

    /* renamed from: o */
    public TextView f49083o;

    /* renamed from: p */
    public ViewGroup f49084p;

    /* renamed from: q */
    public ViewGroup f49085q;

    /* renamed from: r */
    public ImageView f49086r;

    /* renamed from: s */
    public VisualValidationView f49087s;

    /* renamed from: t */
    public TextView f49088t;

    /* renamed from: u */
    public ViewGroup f49089u;

    /* renamed from: v */
    public ImageView f49090v;

    /* renamed from: w */
    public ImageView f49091w;

    /* renamed from: x */
    public Button f49092x;

    /* renamed from: y */
    public TextView f49093y;

    /* renamed from: z */
    public TextView f49094z;

    /* renamed from: ro.d$a */
    public static /* synthetic */ class C19298a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49095a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.masabi.justride.sdk.internal.models.ticket.TicketState[] r0 = com.masabi.justride.sdk.internal.models.ticket.TicketState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49095a = r0
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.BEFORE_VP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49095a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.LIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f49095a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f49095a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.USED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f49095a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.EXPIRED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f49095a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f49095a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.masabi.justride.sdk.internal.models.ticket.TicketState r1 = com.masabi.justride.sdk.internal.models.ticket.TicketState.REFUNDED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p775ro.C19297d.C19298a.<clinit>():void");
        }
    }

    /* renamed from: ro.d$b */
    public class C19299b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final ValidationMode f49096a;

        public C19299b(ValidationMode validationMode) {
            this.f49096a = validationMode;
        }

        public final void onAnimationCancel(Animator animator) {
            C19297d.this.f49089u.setEnabled(true);
        }

        public final void onAnimationEnd(Animator animator) {
            C19297d.this.f49089u.setEnabled(true);
            C19297d dVar = C19297d.this;
            ((C19305j) dVar.f45311c).f49135z = this.f49096a;
            dVar.mo51720P1();
            ((C19305j) dVar.f45311c).mo51732l();
        }

        public final void onAnimationStart(Animator animator) {
            C19297d.this.f49089u.setEnabled(false);
            C19297d.this.mo51721Q1(this.f49096a);
        }
    }

    public C19297d() {
        super(C19305j.C19306a.class);
    }

    /* renamed from: J1 */
    public final void mo51714J1(ValidationMode validationMode) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f49085q.getHeight(), validationMode.getHeightPixels(getResources())});
        ofInt.setInterpolator(new OvershootInterpolator());
        ofInt.setDuration((long) getResources().getInteger(C18062p.com_masabi_justride_sdk_ui_default_animation_duration));
        ofInt.addListener(new C19299b(validationMode));
        ofInt.addUpdateListener(new C4056v(this, 1));
        ofInt.start();
    }

    /* renamed from: K1 */
    public final void mo51715K1(String str) {
        mo51716L1(((C19305j) this.f45311c).mo51725e().f46952r.intValue(), this.f49092x, str);
    }

    /* renamed from: L1 */
    public final void mo51716L1(int i, View view, String str) {
        GradientDrawable a = ((C19305j) this.f45311c).f49112c.f46306a.mo50548a((float) i, Color.parseColor(str));
        view.setBackgroundColor(0);
        view.setBackground(a);
    }

    /* renamed from: M1 */
    public final void mo51717M1(TextView textView, C18248a aVar) {
        ((C19305j) this.f45311c).f49112c.getClass();
        C18111c.m44780a(textView, aVar);
    }

    /* renamed from: N1 */
    public final void mo51718N1() {
        C1373d dVar = ((C19305j) this.f45311c).mo51725e().f46954t;
        DisplayMetrics displayMetrics = ((C19305j) this.f45311c).f49124o.f46304a;
        ViewGroup.LayoutParams layoutParams = this.f49060A.getLayoutParams();
        layoutParams.height = (int) C17885a.m44410L(displayMetrics, (float) ((Integer) dVar.f5107d).intValue());
        this.f49060A.setLayoutParams(layoutParams);
    }

    /* renamed from: O1 */
    public final String mo51719O1(Long l, int i) {
        if (l == null) {
            return "";
        }
        return getString(i, ((C19305j) this.f45311c).f49125p.format(new Date(l.longValue())));
    }

    /* renamed from: P1 */
    public final void mo51720P1() {
        if (((C19305j) this.f45311c).f49135z == ValidationMode.BARCODE) {
            this.f49086r.setVisibility(0);
            this.f49087s.setVisibility(4);
        } else {
            this.f49086r.setVisibility(4);
            this.f49087s.setVisibility(0);
        }
        this.f49086r.setAlpha(1.0f);
        this.f49087s.setAlpha(1.0f);
        mo51721Q1(((C19305j) this.f45311c).f49135z);
        ((C19305j) this.f45311c).mo51733m();
        ((C19305j) this.f45311c).mo51734n();
    }

    /* renamed from: Q1 */
    public final void mo51721Q1(ValidationMode validationMode) {
        if (validationMode == ValidationMode.BARCODE) {
            this.f49090v.setVisibility(0);
            this.f49091w.setVisibility(4);
            this.f49088t.setText(C18066t.com_masabi_justride_sdk_ticket_show_colour_bars);
            return;
        }
        this.f49090v.setVisibility(4);
        this.f49091w.setVisibility(0);
        this.f49088t.setText(C18066t.com_masabi_justride_sdk_ticket_show_barcode);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f49073e = mo50081I1(C18061o.ticket_root_container);
        View I1 = mo50081I1(C18061o.ticket_loading_container);
        this.f49074f = I1;
        int i = C18061o.hint_icon;
        this.f49075g = (ImageView) I1.findViewById(i);
        View view = this.f49074f;
        int i2 = C18061o.hint_label;
        this.f49076h = (TextView) view.findViewById(i2);
        View I12 = mo50081I1(C18061o.ticket_error_container);
        this.f49077i = I12;
        this.f49078j = (ImageView) I12.findViewById(i);
        this.f49079k = (TextView) this.f49077i.findViewById(i2);
        this.f49080l = mo50081I1(C18061o.ticket_content_container);
        this.f49081m = (ViewGroup) mo50081I1(C18061o.ticket_status_container);
        this.f49082n = (TextView) mo50081I1(C18061o.ticket_status_header_text_view);
        this.f49083o = (TextView) mo50081I1(C18061o.ticket_status_sub_header_text_view);
        this.f49084p = (ViewGroup) mo50081I1(C18061o.validation_container);
        this.f49085q = (ViewGroup) mo50081I1(C18061o.validation_view_container);
        this.f49086r = (ImageView) mo50081I1(C18061o.barcode_image_view);
        this.f49087s = (VisualValidationView) mo50081I1(C18061o.vis_val_view);
        this.f49088t = (TextView) mo50081I1(C18061o.pull_to_reveal_text_view);
        this.f49089u = (ViewGroup) mo50081I1(C18061o.validation_toggle_container);
        this.f49090v = (ImageView) mo50081I1(C18061o.validation_toggle_up_image_view);
        this.f49091w = (ImageView) mo50081I1(C18061o.validation_toggle_down_image_view);
        this.f49092x = (Button) mo50081I1(C18061o.activate_ticket_button);
        this.f49093y = (TextView) mo50081I1(C18061o.activation_time_text_view);
        this.f49094z = (TextView) mo50081I1(C18061o.ticket_name_text_view);
        this.f49060A = (WebView) mo50081I1(C18061o.ticket_configurable_content_web_view);
        this.f49062C = (ViewGroup) mo50081I1(C18061o.ticket_section);
        this.f49063D = (Button) mo50081I1(C18061o.ticket_info_button);
        this.f49064E = (Button) mo50081I1(C18061o.ticket_actions_button);
        this.f49065F = (ViewGroup) mo50081I1(C18061o.ticket_warning_container);
        this.f49066G = (TextView) mo50081I1(C18061o.ticket_warning_header_text_view);
        this.f49068I = (TextView) mo50081I1(C18061o.ticket_use_it_or_lose_it_text);
        this.f49067H = (ViewGroup) mo50081I1(C18061o.ticket_use_it_or_lose_it_container);
        this.f49069J = (ViewGroup) mo50081I1(C18061o.ticket_name_container);
        this.f49070K = (ViewGroup) mo50081I1(C18061o.ticket_strapline_container);
        this.f49071L = (TextView) mo50081I1(C18061o.ticket_strapline_text_view);
        this.f49061B = (FrameLayout) mo50081I1(C18061o.ticket_face_container);
        C18411e e = ((C19305j) this.f45311c).mo51725e();
        ((C19305j) this.f45311c).f49110H = e.f46945k.longValue();
        View view2 = this.f49073e;
        ((C19305j) this.f45311c).f49112c.getClass();
        view2.setBackgroundColor(Color.parseColor("#F0F0F0"));
        ImageView imageView = this.f49075g;
        int i3 = C18060n.com_masabi_justride_sdk_icon_sync_white;
        String str = e.f46946l.f46565d;
        C18111c cVar = ((C19305j) this.f45311c).f49112c;
        Resources resources = getResources();
        cVar.getClass();
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        Drawable a = C5247f.C5248a.m13264a(resources, i3, (Resources.Theme) null);
        if (a != null) {
            cVar.f46307b.getClass();
            C24362h.m61211f(str, "tintColourHex");
            int parseColor = Color.parseColor(str);
            a.mutate();
            a.setColorFilter(parseColor, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(a);
        }
        ImageView imageView2 = this.f49078j;
        int i4 = C18060n.com_masabi_justride_sdk_icon_error_white;
        String str2 = e.f46946l.f46565d;
        C18111c cVar2 = ((C19305j) this.f45311c).f49112c;
        Resources resources2 = getResources();
        cVar2.getClass();
        Drawable a2 = C5247f.C5248a.m13264a(resources2, i4, (Resources.Theme) null);
        if (a2 != null) {
            cVar2.f46307b.getClass();
            C24362h.m61211f(str2, "tintColourHex");
            int parseColor2 = Color.parseColor(str2);
            a2.mutate();
            a2.setColorFilter(parseColor2, PorterDuff.Mode.SRC_ATOP);
            imageView2.setImageDrawable(a2);
        }
        mo51715K1("#61D86C");
        mo51716L1(e.f46957w.intValue(), this.f49093y, "#DE2A42");
        mo51716L1(e.f46957w.intValue(), this.f49069J, "#FFFFFF");
        mo51716L1(e.f46957w.intValue(), this.f49060A, "#FFFFFF");
        mo51716L1(e.f46952r.intValue(), this.f49063D, e.f46951q);
        mo51716L1(e.f46952r.intValue(), this.f49064E, e.f46951q);
        mo51716L1(e.f46957w.intValue(), this.f49062C, "#FFFFFF");
        ViewGroup viewGroup = this.f49067H;
        String str3 = e.f46934E;
        ((C19305j) this.f45311c).f49112c.getClass();
        viewGroup.setBackgroundColor(Color.parseColor(str3));
        C18411e e2 = ((C19305j) this.f45311c).mo51725e();
        C18109a aVar = ((C19305j) this.f45311c).f49124o;
        int parseColor3 = Color.parseColor(e2.f46960z);
        this.f49091w.setImageResource(C18060n.com_masabi_justride_sdk_arrow_down_white);
        this.f49090v.setImageResource(C18060n.com_masabi_justride_sdk_arrow_up_white);
        this.f49089u.setBackground(new C19296c(parseColor3, aVar));
        ((C19305j) this.f45311c).mo51725e().getClass();
        this.f49064E.setVisibility(8);
        this.f49064E.setEnabled(false);
        mo51717M1(this.f49092x, e.f46936b);
        mo51717M1(this.f49093y, e.f46950p);
        mo51717M1(this.f49079k, e.f46946l);
        mo51717M1(this.f49076h, e.f46946l);
        mo51717M1(this.f49088t, e.f46949o);
        mo51717M1(this.f49063D, e.f46953s);
        mo51717M1(this.f49064E, e.f46953s);
        mo51717M1(this.f49094z, e.f46955u);
        mo51717M1(this.f49082n, e.f46958x);
        mo51717M1(this.f49083o, e.f46959y);
        mo51717M1(this.f49066G, e.f46932C);
        mo51717M1(this.f49068I, e.f46933D);
        mo51717M1(this.f49071L, e.f46956v);
        this.f49089u.setOnClickListener(new C6593c(this, 4));
        this.f49092x.setOnClickListener(new C4583a(this, 2));
        this.f49063D.setOnClickListener(new C6996c(this, 3));
        this.f49064E.setOnClickListener(new C4584b(this, 1));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            C19305j jVar = (C19305j) this.f45311c;
            jVar.f49114e.mo40390a(new C19300e(jVar), CallBackOn.MAIN_THREAD, jVar.f49130u);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C18063q.fragment_ticket, viewGroup, false);
    }
}
