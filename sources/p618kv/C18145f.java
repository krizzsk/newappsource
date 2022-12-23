package p618kv;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.material.bottomsheet.C13924b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.design.view.list.ListItemView;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n00.C18492b;
import n00.C18496d;
import p500fv.C17090o;
import p500fv.C17091p;
import p824tp.C19728f;

/* renamed from: kv.f */
public class C18145f extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f46369h = 0;

    /* renamed from: kv.f$a */
    public class C18146a implements DialogInterface.OnKeyListener {
        public C18146a() {
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            if (keyEvent.getAction() != 0) {
                C18145f.this.dismiss();
            }
            return true;
        }
    }

    /* renamed from: kv.f$b */
    public static /* synthetic */ class C18147b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46371a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.reports.service.ReportEntityType[] r0 = com.moovit.app.reports.service.ReportEntityType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46371a = r0
                com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.STOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46371a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.LINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p618kv.C18145f.C18147b.<clinit>():void");
        }
    }

    /* renamed from: kv.f$c */
    public class C18148c extends C18496d {

        /* renamed from: d */
        public final List<C17091p> f46372d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C18148c(android.content.Context r3, java.util.ArrayList r4) {
            /*
                r1 = this;
                p618kv.C18145f.this = r2
                int r2 = r4.size()
                int r0 = p977zz.C20936e0.f52684d
                int r2 = r2 + 6
                int r2 = r2 + -1
                int r2 = r2 / 6
                int[] r2 = new int[r2]
                r0 = 2131559288(0x7f0d0378, float:1.8743916E38)
                java.util.Arrays.fill(r2, r0)
                r1.<init>(r3, r2)
                r1.f46372d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p618kv.C18145f.C18148c.<init>(kv.f, android.content.Context, java.util.ArrayList):void");
        }

        /* renamed from: a */
        public final void mo23842a(int i, View view) {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add((ViewGroup) view.findViewById(R.id.category_0));
            arrayList.add((ViewGroup) view.findViewById(R.id.category_1));
            arrayList.add((ViewGroup) view.findViewById(R.id.category_2));
            arrayList.add((ViewGroup) view.findViewById(R.id.category_3));
            arrayList.add((ViewGroup) view.findViewById(R.id.category_4));
            arrayList.add((ViewGroup) view.findViewById(R.id.category_5));
            int i2 = i * 6;
            List<C17091p> subList = this.f46372d.subList(i2, Math.min(i2 + 6, this.f46372d.size()));
            for (int i3 = 0; i3 < subList.size(); i3++) {
                C17091p pVar = subList.get(i3);
                ViewGroup viewGroup = (ViewGroup) arrayList.get(i3);
                viewGroup.setVisibility(0);
                viewGroup.setTag(pVar);
                ((ImageView) viewGroup.findViewById(R.id.image)).setImageResource(pVar.mo49680e());
                ((TextView) viewGroup.findViewById(R.id.text)).setText(pVar.mo49682g());
                viewGroup.setOnClickListener(new C18149g(this, i));
            }
        }
    }

    public C18145f() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public static C18145f m44854S1(ReportEntityType reportEntityType, ServerId serverId, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("selectedPageExtra", i);
        bundle.putSerializable("reportTypeExtra", reportEntityType);
        bundle.putParcelable("entityIdExtra", serverId);
        C18145f fVar = new C18145f();
        fVar.setArguments(bundle);
        return fVar;
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        List<ReportCategoryType> list;
        ArrayList arrayList;
        int i = mo46752K1().getInt("selectedPageExtra", 0);
        ListItemView listItemView = (ListItemView) view.findViewById(R.id.title);
        int[] iArr = C18147b.f46371a;
        int i2 = iArr[((ReportEntityType) mo46752K1().getSerializable("reportTypeExtra")).ordinal()];
        if (i2 == 1) {
            listItemView.setTitle((int) R.string.stop_category_report_dialog_list_title);
        } else if (i2 == 2) {
            listItemView.setTitle((int) R.string.line_category_report_dialog_list_title);
        }
        C19728f fVar = (C19728f) mo46750H1("METRO_CONTEXT");
        int i3 = iArr[((ReportEntityType) getArguments().getSerializable("reportTypeExtra")).ordinal()];
        if (i3 == 1) {
            list = fVar.f50165a.f16138m;
        } else if (i3 != 2) {
            list = null;
        } else {
            list = fVar.f50165a.f16137l;
        }
        C17090o c = C17090o.m43019c();
        c.getClass();
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (ReportCategoryType d : list) {
                C17091p d2 = c.mo49689d(d);
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
        }
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.reports_view_pager);
        viewPager.setAdapter(new C18492b((PagerAdapter) new C18148c(view.getContext(), arrayList), viewPager));
        viewPager.setCurrentLogicalItem(i);
        viewPager.setOffscreenPageLimit(viewPager.getPageCount());
        if (viewPager.getPageCount() > 1) {
            view.findViewById(R.id.reports_view_pager_indicator_divider).setVisibility(0);
            RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.reports_view_pager_indicator);
            radioGroup.setVisibility(0);
            Context context = radioGroup.getContext();
            int pageCount = viewPager.getPageCount();
            for (int i4 = 0; i4 < pageCount; i4++) {
                RadioButton radioButton = new RadioButton(context, (AttributeSet) null, R.attr.pagerIndicatorRadioButtonStyle);
                radioButton.setId(i4);
                radioGroup.addView(radioButton, i4);
            }
            viewPager.addOnPageChangeListener(new C18144e(radioGroup));
            radioGroup.check(viewPager.getCurrentItem());
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C13924b(requireContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.dialog_reports_layout, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        getDialog().setOnKeyListener(new C18146a());
    }
}
