package p823to;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import ce0.C21100e;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import mf0.C24361g;
import mf0.C24362h;
import p073e7.C4583a;
import p116i1.C5247f;
import p297w5.C6996c;
import p565io.C17625b;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18067u;
import p611ko.C18111c;
import p635lo.C18248a;
import p658mo.C18411e;
import p823to.C19719b;

/* renamed from: to.a */
public class C19718a extends C17625b<C19718a, C19719b> {

    /* renamed from: n */
    public static final /* synthetic */ int f50136n = 0;

    /* renamed from: e */
    public View f50137e;

    /* renamed from: f */
    public ImageView f50138f;

    /* renamed from: g */
    public TextView f50139g;

    /* renamed from: h */
    public TextView f50140h;

    /* renamed from: i */
    public TextView f50141i;

    /* renamed from: j */
    public Button f50142j;

    /* renamed from: k */
    public String f50143k;

    /* renamed from: l */
    public String f50144l;

    /* renamed from: m */
    public String f50145m;

    public C19718a() {
        super(C19719b.C19720a.class);
    }

    /* renamed from: I1 */
    public final void mo52065I1(TextView textView, String str) {
        if (C21100e.m49352m0(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(C24361g.m61186s0(str));
        textView.setVisibility(0);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        if (getArguments() != null) {
            this.f50143k = getArguments().getString("KEY_DISCLAIMER_TITLE");
            this.f50144l = getArguments().getString("KEY_DISCLAIMER_BODY");
            this.f50145m = getArguments().getString("KEY_DISCLAIMER_WARNING");
            return;
        }
        throw new JustRideSdkException("Cannot load ticket activation disclaimer with null arguments.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C18063q.fragment_ticket_activation_disclaimer, viewGroup, false);
        this.f50137e = inflate;
        this.f50138f = (ImageView) inflate.findViewById(C18061o.close_button);
        this.f50139g = (TextView) this.f50137e.findViewById(C18061o.disclaimer_title_text_view);
        this.f50140h = (TextView) this.f50137e.findViewById(C18061o.disclaimer_body_text_view);
        this.f50141i = (TextView) this.f50137e.findViewById(C18061o.disclaimer_warning);
        this.f50142j = (Button) this.f50137e.findViewById(C18061o.disclaimer_activate_button);
        ScrollView scrollView = (ScrollView) this.f50137e.findViewById(C18061o.disclaimer_body_scroll_view);
        mo52065I1(this.f50139g, this.f50143k);
        mo52065I1(this.f50140h, this.f50144l);
        mo52065I1(this.f50141i, this.f50145m);
        if (C21100e.m49352m0(this.f50144l)) {
            scrollView.setVisibility(8);
        } else {
            scrollView.setVisibility(0);
        }
        this.f50138f.setOnClickListener(new C4583a(this, 3));
        this.f50142j.setOnClickListener(new C6996c(this, 4));
        C18411e eVar = (C18411e) ((C19719b) mo50082H1()).f50146b.f47829b;
        C18411e eVar2 = (C18411e) ((C19719b) mo50082H1()).f50146b.f47829b;
        C18111c cVar = ((C19719b) mo50082H1()).f50147c;
        View view = this.f50137e;
        String str = eVar2.f46939e;
        cVar.getClass();
        view.setBackgroundColor(Color.parseColor(str));
        ImageView imageView = this.f50138f;
        Resources resources = getResources();
        int i = C18060n.com_masabi_justride_sdk_icon_close_white;
        String str2 = eVar2.f46941g;
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        Drawable a = C5247f.C5248a.m13264a(resources, i, (Resources.Theme) null);
        if (a != null) {
            cVar.f46307b.getClass();
            C24362h.m61211f(str2, "tintColourHex");
            int parseColor = Color.parseColor(str2);
            a.mutate();
            a.setColorFilter(parseColor, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(a);
        }
        C18111c cVar2 = ((C19719b) mo50082H1()).f50147c;
        Button button = this.f50142j;
        String str3 = ((C18411e) ((C19719b) mo50082H1()).f50146b.f47829b).f46937c;
        Integer num = 5;
        GradientDrawable a2 = cVar2.f46306a.mo50548a((float) num.intValue(), Color.parseColor(str3));
        button.setBackgroundColor(0);
        button.setBackground(a2);
        Button button2 = this.f50142j;
        C18248a aVar = eVar.f46938d;
        ((C19719b) mo50082H1()).f50147c.getClass();
        C18111c.m44780a(button2, aVar);
        TextView textView = this.f50140h;
        C18248a aVar2 = eVar.f46940f;
        ((C19719b) mo50082H1()).f50147c.getClass();
        C18111c.m44780a(textView, aVar2);
        TextView textView2 = this.f50139g;
        C18248a aVar3 = eVar.f46942h;
        ((C19719b) mo50082H1()).f50147c.getClass();
        C18111c.m44780a(textView2, aVar3);
        TextView textView3 = this.f50141i;
        C18248a aVar4 = eVar.f46943i;
        ((C19719b) mo50082H1()).f50147c.getClass();
        C18111c.m44780a(textView3, aVar4);
        return this.f50137e;
    }

    public final void onStart() {
        super.onStart();
        getDialog().setCanceledOnTouchOutside(true);
        if (getDialog().getWindow() != null) {
            getDialog().getWindow().addFlags(2);
            getDialog().getWindow().setDimAmount(0.6f);
            getDialog().getWindow().setGravity(80);
            getDialog().getWindow().setLayout(-1, -2);
            getDialog().getWindow().setWindowAnimations(C18067u.DialogAnimationSlideInAndOutFromBottom);
        }
    }
}
