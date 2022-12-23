package p847uo;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.masabi.justride.sdk.p415ui.base.activities.BaseContainerActivity;
import mf0.C24362h;
import p090g1.C4732a;
import p116i1.C5247f;
import p541ho.C17464a;
import p565io.C17626c;
import p605ki.C18059m;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18064r;
import p611ko.C18110b;
import p611ko.C18111c;
import p682no.C18578a;
import p775ro.C19295b;
import p847uo.C19974f;

/* renamed from: uo.a */
public class C19964a extends C17626c<C19964a, C19974f> {

    /* renamed from: e */
    public View f50754e;

    /* renamed from: f */
    public Button f50755f;

    /* renamed from: g */
    public Button f50756g;

    /* renamed from: h */
    public RecyclerView f50757h;

    /* renamed from: i */
    public View f50758i;

    /* renamed from: j */
    public TextView f50759j;

    /* renamed from: k */
    public C19295b f50760k;

    /* renamed from: uo.a$a */
    public class C19965a implements View.OnClickListener {
        public C19965a() {
        }

        public final void onClick(View view) {
            C19964a aVar = C19964a.this;
            C19974f fVar = (C19974f) aVar.f45311c;
            if (!fVar.f50797j) {
                fVar.f50797j = true;
                aVar.mo52263J1();
            }
        }
    }

    /* renamed from: uo.a$b */
    public class C19966b implements View.OnClickListener {
        public C19966b() {
        }

        public final void onClick(View view) {
            C19964a aVar = C19964a.this;
            C19974f fVar = (C19974f) aVar.f45311c;
            if (fVar.f50797j) {
                fVar.f50797j = false;
                aVar.mo52263J1();
            }
        }
    }

    public C19964a() {
        super(C19974f.C19975a.class);
    }

    /* renamed from: J1 */
    public final void mo52263J1() {
        View view;
        View view2;
        Button button;
        Button button2;
        int i;
        int i2;
        C19974f fVar = (C19974f) this.f45311c;
        boolean z = fVar.f50797j;
        if (z) {
            view = this.f50757h;
        } else {
            view = this.f50758i;
        }
        if (z) {
            view2 = this.f50758i;
        } else {
            view2 = this.f50757h;
        }
        if (z) {
            button = this.f50755f;
        } else {
            button = this.f50756g;
        }
        if (z) {
            button2 = this.f50756g;
        } else {
            button2 = this.f50755f;
        }
        C18111c cVar = fVar.f50792e;
        C18578a aVar = (C18578a) fVar.f50789b.f47828a;
        int color = C4732a.getColor(getContext(), 17170443);
        if (z) {
            i = 0;
        } else {
            i = aVar.f47308l.intValue();
        }
        if (z) {
            i2 = aVar.f47308l.intValue();
        } else {
            i2 = 0;
        }
        C18110b bVar = cVar.f46306a;
        float f = (float) 0;
        bVar.getClass();
        GradientDrawable c = C18110b.m44777c(bVar, color, (float) i, (float) i2, f, f, 64);
        button.setBackgroundColor(0);
        button.setBackground(c);
        button2.setBackgroundColor(C4732a.getColor(getContext(), 17170445));
        C18111c.m44780a(button, aVar.f47298b);
        C18111c.m44780a(button2, aVar.f47300d);
        view.setVisibility(0);
        view2.setVisibility(8);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() instanceof BaseContainerActivity) {
            BaseContainerActivity baseContainerActivity = (BaseContainerActivity) getActivity();
            if (baseContainerActivity.getSupportActionBar() != null) {
                baseContainerActivity.getSupportActionBar().mo801w("");
            }
        }
        this.f50754e = mo50081I1(C18061o.tabs_container);
        this.f50755f = (Button) mo50081I1(C18061o.tab_ticket_info);
        this.f50756g = (Button) mo50081I1(C18061o.tab_ticket_regulations);
        this.f50757h = (RecyclerView) mo50081I1(C18061o.content_container_ticket_info);
        this.f50758i = mo50081I1(C18061o.content_container_ticket_regulations);
        this.f50759j = (TextView) mo50081I1(C18061o.ticket_regulations_text_view);
        int parseColor = Color.parseColor("#C7C7C7");
        int dimensionPixelSize = getResources().getDimensionPixelSize(C18059m.com_masabi_justride_sdk_list_item_divider_height);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C18059m.com_masabi_justride_sdk_activity_horizontal_margin);
        this.f50757h.mo4593g(new C17464a(parseColor, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2), -1);
        this.f50757h.setAdapter(((C19974f) this.f45311c).f50795h);
        this.f50757h.setHasFixedSize(true);
        this.f50757h.setLayoutManager(new LinearLayoutManager(getContext()));
        P p = this.f45311c;
        C18578a aVar = (C18578a) ((C19974f) p).f50789b.f47828a;
        C18111c cVar = ((C19974f) p).f50792e;
        View view = this.f50754e;
        String str = aVar.f47299c;
        cVar.getClass();
        view.setBackgroundColor(Color.parseColor(str));
        C18111c.m44780a(this.f50759j, aVar.f47307k);
        mo52263J1();
        this.f50755f.setOnClickListener(new C19965a());
        this.f50756g.setOnClickListener(new C19966b());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C18064r.ticket_info, menu);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C18063q.fragment_ticket_info, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C18061o.menu_item_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        P p = this.f45311c;
        String str = ((C18578a) ((C19974f) p).f50789b.f47828a).f47305i;
        C18111c cVar = ((C19974f) p).f50792e;
        MenuItem findItem = menu.findItem(C18061o.menu_item_close);
        Resources resources = getResources();
        int i = C18060n.com_masabi_justride_sdk_icon_close_white;
        cVar.getClass();
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        Drawable a = C5247f.C5248a.m13264a(resources, i, (Resources.Theme) null);
        if (a != null) {
            cVar.f46307b.getClass();
            C24362h.m61211f(str, "tintColourHex");
            int parseColor = Color.parseColor(str);
            a.mutate();
            a.setColorFilter(parseColor, PorterDuff.Mode.SRC_ATOP);
            findItem.setIcon(a);
        }
    }
}
