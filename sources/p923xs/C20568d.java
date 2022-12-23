package p923xs;

import android.content.UriMatcher;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1043v;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.help.helpcenter.HelpCenterActivity;
import com.moovit.commons.view.FormatTextView;
import com.tranzmate.R;
import p073e7.C4584b;
import p543hq.C17474b;
import p946ys.C20760a;
import p946ys.C20764e;
import p977zz.C20961r;
import p977zz.C20964s0;

/* renamed from: xs.d */
public class C20568d extends C15682c<HelpCenterActivity> {

    /* renamed from: u */
    public static final UriMatcher f52024u;

    /* renamed from: n */
    public long f52025n;

    /* renamed from: o */
    public String f52026o;

    /* renamed from: p */
    public TextView f52027p;

    /* renamed from: q */
    public WebView f52028q;

    /* renamed from: r */
    public MaterialButtonToggleGroup f52029r;

    /* renamed from: s */
    public FormatTextView f52030s;

    /* renamed from: t */
    public final C20565a f52031t = new C20565a(this);

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f52024u = uriMatcher;
        uriMatcher.addURI("support.moovitapp.com", "hc/*/articles/*", 1);
    }

    public C20568d() {
        super(HelpCenterActivity.class);
    }

    /* renamed from: m2 */
    public static long m48318m2(String str) {
        if (C20964s0.m49089g(str)) {
            return Long.parseLong(str);
        }
        int indexOf = str.indexOf(45);
        if (indexOf != -1) {
            return m48318m2(str.substring(0, indexOf));
        }
        int indexOf2 = str.indexOf(44);
        if (indexOf2 != -1) {
            return m48318m2(str.substring(0, indexOf2));
        }
        return -1;
    }

    /* renamed from: E1 */
    public final void mo44504E1(Bundle bundle, String str) {
        if ("alert_dialog_fragment_error_tag".equals(str)) {
            getParentFragmentManager().mo3936Q();
        } else {
            super.mo44504E1(bundle, str);
        }
    }

    /* renamed from: n2 */
    public final void mo52780n2() {
        C20760a aVar = (C20760a) this.f52030s.getTag();
        if (aVar != null) {
            int i = aVar.f52380d;
            int i2 = aVar.f52381e;
            if (i == -1 || i2 == -1) {
                this.f52030s.setVisibility(4);
                return;
            }
            if (this.f52029r.getCheckedButtonId() == R.id.vote_up_button) {
                i++;
                i2++;
            } else if (this.f52029r.getCheckedButtonId() == R.id.vote_down_button) {
                i++;
            }
            this.f52030s.setArguments(Integer.valueOf(i2), Integer.valueOf(i));
            this.f52030s.setVisibility(0);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C20764e eVar = (C20764e) new C1026n0(requireActivity()).mo4313a(C20764e.class);
        long j = this.f52025n;
        C1043v vVar = (C1043v) eVar.f52396e.getOrDefault(Long.valueOf(j), null);
        if (vVar == null) {
            vVar = new C1043v();
            eVar.f52396e.put(Long.valueOf(j), vVar);
        }
        C20961r rVar = (C20961r) vVar.getValue();
        if (rVar == null || !rVar.f52711a) {
            eVar.mo52901b(j);
        }
        vVar.observe(getViewLifecycleOwner(), new C20566b(this, 0));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52025n = mo46782Q1().getLong("articleId");
        this.f52026o = mo46782Q1().getString("ownerSectionName");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.help_center_article_fragment, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f52029r;
        materialButtonToggleGroup.f34453d.remove(this.f52031t);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_article_impression");
        aVar.mo49936d(AnalyticsAttributeKey.ID, this.f52025n);
        mo46797j2(aVar.mo49933a());
        String str = this.f52026o;
        if (C20964s0.m49090h(str)) {
            ((HelpCenterActivity) this.f40822c).setTitle(R.string.help_center_screen_header);
        } else {
            ((HelpCenterActivity) this.f40822c).setTitle(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52027p = (TextView) view.findViewById(R.id.title);
        View findViewById = view.findViewById(R.id.article_content);
        WebView webView = (WebView) view.findViewById(R.id.content);
        this.f52028q = webView;
        webView.setScrollContainer(false);
        this.f52028q.setVerticalScrollBarEnabled(false);
        this.f52028q.setHorizontalScrollBarEnabled(false);
        this.f52028q.setWebChromeClient(new WebChromeClient());
        this.f52028q.setWebViewClient(new C20567c(this, findViewById));
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view.findViewById(R.id.vote_buttons);
        this.f52029r = materialButtonToggleGroup;
        materialButtonToggleGroup.f34453d.add(this.f52031t);
        this.f52030s = (FormatTextView) view.findViewById(R.id.votes_score);
        view.findViewById(R.id.feedback_button).setOnClickListener(new C4584b(this, 9));
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("alert_dialog_fragment_error_tag".equals(str)) {
            if (i == -1) {
                ((C20764e) new C1026n0(requireActivity()).mo4313a(C20764e.class)).mo52901b(this.f52025n);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
