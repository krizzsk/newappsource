package com.moovit.app.stopdetail;

import a00.C13382a;
import aa0.C7527d;
import aa0.C7554s;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13720d;
import ce0.C21100e;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.arrivals.ArrivalsResponseKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.database.DbEntityRef;
import com.moovit.database.Tokenizer;
import com.moovit.image.model.Image;
import com.moovit.l10n.C16181a;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPattern;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.CongestionLevel;
import com.moovit.util.time.CongestionSource;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeVehicleAttributes;
import com.moovit.view.ScheduleView;
import com.tranzmate.R;
import da0.C12610a;
import j80.C12775d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mf0.C24361g;
import p239rb.C6298j;
import p455dy.C16753e;
import p583jk.C17884p;
import p952yy.C20785a;
import p952yy.C20787c;
import p977zz.C20944i0;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.stopdetail.d */
public final class C15351d extends RecyclerView.Adapter<C15354c> implements C15340c.C15349i {

    /* renamed from: g */
    public final C15352a f39733g = new C15352a();

    /* renamed from: h */
    public final C6298j f39734h = new C6298j(3);

    /* renamed from: i */
    public final C15353b f39735i = new C15353b();

    /* renamed from: j */
    public final C15340c.C15350j f39736j;

    /* renamed from: k */
    public final C7527d<String> f39737k;

    /* renamed from: l */
    public final ArrayList<C20944i0<ServerId, Time>> f39738l;

    /* renamed from: m */
    public final C12610a f39739m;

    /* renamed from: com.moovit.app.stopdetail.d$a */
    public class C15352a extends View.AccessibilityDelegate {
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            String str;
            String str2;
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3;
            C15354c cVar = (C15354c) view.getTag();
            if (cVar != null && accessibilityEvent.getEventType() == 32768) {
                Context context = cVar.itemView.getContext();
                if (cVar.f39747j.getVisibility() == 0) {
                    str = cVar.f39747j.getContentDescription().toString();
                } else {
                    str = context.getString(R.string.voiceover_departure_time, new Object[]{cVar.f39746i.getText()});
                }
                CharSequence charSequence4 = null;
                if (cVar.f39748k.getVisibility() != 0 || cVar.f39748k.getText() == null) {
                    str2 = null;
                } else {
                    str2 = C13382a.m33667c(context.getString(R.string.service_alert_line_status), cVar.f39748k.getText());
                }
                if (cVar.f39744g.getVisibility() != 0) {
                    charSequence = null;
                } else if (cVar.f39744g.getContentDescription() != null) {
                    charSequence = cVar.f39744g.getContentDescription();
                } else {
                    charSequence = cVar.f39744g.getText();
                }
                if (cVar.f39751n.getVisibility() == 0) {
                    charSequence2 = cVar.f39751n.getContentDescription();
                } else {
                    charSequence2 = null;
                }
                if (cVar.f39743f.getVisibility() == 0) {
                    charSequence3 = cVar.f39743f.getContentDescription();
                } else {
                    charSequence3 = null;
                }
                if (cVar.f39750m.getVisibility() == 0) {
                    charSequence4 = cVar.f39750m.getContentDescription();
                }
                cVar.itemView.setContentDescription(C13382a.m33667c(str, str2, charSequence, cVar.f39745h.getContentDescription(), charSequence2, charSequence3, context.getString(R.string.voice_over_train_station_list), cVar.f39749l.getText(), charSequence4));
            }
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    /* renamed from: com.moovit.app.stopdetail.d$b */
    public class C15353b implements View.OnClickListener {
        public C15353b() {
        }

        public final void onClick(View view) {
            TransitLine transitLine = (TransitLine) view.getTag(R.id.view_tag_param1);
            Time time = (Time) view.getTag(R.id.view_tag_param2);
            C12775d dVar = (C12775d) view.getTag(R.id.view_tag_param3);
            if (transitLine != null && time != null) {
                C15351d.this.f39736j.f39732h.mo45914h0(transitLine, time, dVar);
            }
        }
    }

    /* renamed from: com.moovit.app.stopdetail.d$c */
    public static class C15354c extends RecyclerView.C1119a0 implements C16181a.C16184c {

        /* renamed from: d */
        public final ImageView f39741d;

        /* renamed from: e */
        public final ImageView f39742e;

        /* renamed from: f */
        public final ImageView f39743f;

        /* renamed from: g */
        public final TextView f39744g;

        /* renamed from: h */
        public final TextView f39745h;

        /* renamed from: i */
        public final TextView f39746i;

        /* renamed from: j */
        public final ScheduleView f39747j;

        /* renamed from: k */
        public final TextView f39748k;

        /* renamed from: l */
        public final TextView f39749l;

        /* renamed from: m */
        public final FormatTextView f39750m;

        /* renamed from: n */
        public final TextView f39751n;

        public C15354c(View view) {
            super(view);
            this.f39741d = (ImageView) view.findViewById(R.id.icon);
            this.f39742e = (ImageView) view.findViewById(R.id.favorite_badge);
            this.f39743f = (ImageView) view.findViewById(R.id.service_alert_badge);
            this.f39744g = (TextView) view.findViewById(R.id.title);
            this.f39745h = (TextView) view.findViewById(R.id.subtitle);
            this.f39746i = (TextView) view.findViewById(R.id.static_time);
            this.f39747j = (ScheduleView) view.findViewById(R.id.real_time);
            this.f39748k = (TextView) view.findViewById(R.id.real_time_status);
            this.f39749l = (TextView) view.findViewById(R.id.pattern);
            this.f39750m = (FormatTextView) view.findViewById(R.id.platform);
            this.f39751n = (TextView) view.findViewById(R.id.congestion);
        }

        /* renamed from: a */
        public final void mo45931a(CharSequence charSequence) {
            UiUtils.m40234B(this.f39745h, charSequence);
        }

        /* renamed from: b */
        public final void mo45932b(CharSequence charSequence) {
            UiUtils.m40234B(this.f39744g, charSequence);
        }

        /* renamed from: c */
        public final void mo45933c(Image image) {
            C17884p.m44354Y(this.f39741d).mo51642v(image).mo51628o0(image).mo10850T(this.f39741d);
        }

        /* renamed from: d */
        public final void mo45934d(CharSequence charSequence) {
        }
    }

    public C15351d(C15340c.C15350j jVar) {
        this.f39736j = jVar;
        this.f39737k = new C7527d<>(C13720d.f33796a);
        this.f39738l = new ArrayList<>();
        this.f39739m = new C12610a(jVar.f39725a);
    }

    /* renamed from: b */
    public final void mo45890b(String str) {
    }

    /* renamed from: d */
    public final RecyclerView.Adapter<?> mo45891d() {
        return this;
    }

    /* renamed from: e */
    public final void mo45892e(Context context, Time time, boolean z, Map<ArrivalsResponseKey, Map<ServerId, C20787c>> map) {
        Map map2 = map.get(this.f39736j.f39726b.f39711p);
        if (time == null) {
            time = new Time(System.currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        for (C20787c cVar : map2.values()) {
            ServerId serverId = cVar.f52456a;
            if (this.f39736j.f39729e.contains(serverId)) {
                if (z) {
                    Iterator<Time> it = cVar.f52458c.iterator();
                    while (it.hasNext()) {
                        Time next = it.next();
                        if (next.f23911l) {
                            arrayList.add(new C20944i0(serverId, next));
                        }
                    }
                } else {
                    Iterator<Time> it2 = cVar.f52458c.iterator();
                    while (it2.hasNext()) {
                        Time next2 = it2.next();
                        if (time.compareTo(next2) <= 0) {
                            arrayList.add(new C20944i0(serverId, next2));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, this.f39734h);
        this.f39738l.clear();
        this.f39738l.ensureCapacity(arrayList.size());
        this.f39738l.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public final boolean mo45893f() {
        return false;
    }

    public final int getItemCount() {
        return Math.max(1, this.f39738l.size());
    }

    public final int getItemViewType(int i) {
        return this.f39738l.isEmpty() ? 30 : 31;
    }

    /* renamed from: h */
    public final boolean mo45894h() {
        return false;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        boolean z;
        int i2;
        CharSequence charSequence;
        CongestionLevel congestionLevel;
        TextView textView;
        int i3;
        C15354c cVar = (C15354c) a0Var;
        if (cVar.getItemViewType() == 31) {
            Context context = cVar.itemView.getContext();
            C20944i0 i0Var = this.f39738l.get(i);
            Time time = (Time) i0Var.f52693b;
            DbEntityRef<TransitPattern> dbEntityRef = time.f23905f;
            if (dbEntityRef != null) {
                TransitPattern transitPattern = dbEntityRef.get();
                if (transitPattern != null) {
                    DbEntityRef<TransitLine> b = this.f39736j.f39727c.mo24410b((ServerId) i0Var.f52692a);
                    if (b != null) {
                        TransitLine transitLine = b.get();
                        if (transitLine != null) {
                            cVar.itemView.setTag(R.id.view_tag_param1, transitLine);
                            cVar.itemView.setTag(R.id.view_tag_param2, time);
                            cVar.itemView.setOnClickListener(this.f39735i);
                            cVar.itemView.setAccessibilityDelegate(this.f39733g);
                            this.f39736j.f39730f.mo48496a(context, cVar, transitLine);
                            ImageView imageView = cVar.f39742e;
                            C16753e eVar = this.f39736j.f39731g;
                            TransitLineGroup b2 = transitLine.mo24369b();
                            eVar.getClass();
                            C21100e.m49373x(b2, "line");
                            if (eVar.mo49440o(b2.f23694b) != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            imageView.setVisibility(i2);
                            C12775d dVar = this.f39736j.f39726b.f39706k.get(transitLine.f23687c);
                            cVar.itemView.setTag(R.id.view_tag_param3, dVar);
                            if (dVar == null || !ServiceStatusCategory.IMPORTANT_LEVEL.contains(dVar.f31580b.f23213b)) {
                                cVar.f39743f.setVisibility(8);
                            } else {
                                cVar.f39743f.setImageResource(dVar.f31580b.f23213b.getSmallIconResId());
                                cVar.f39743f.setContentDescription(C13382a.m33667c(context.getString(R.string.service_alert_line_status), context.getString(dVar.f31580b.f23213b.getAccessibilityResId())));
                                cVar.f39743f.setVisibility(0);
                            }
                            if (time.mo24633j()) {
                                cVar.f39747j.setVisibility(0);
                                cVar.f39747j.setTime(time);
                            } else {
                                cVar.f39747j.setVisibility(4);
                            }
                            SpannableString a = C20785a.m48769a(context, time);
                            if (a != null) {
                                cVar.f39748k.setText(a);
                                cVar.f39748k.setVisibility(0);
                            } else {
                                cVar.f39748k.setVisibility(8);
                            }
                            String f = C7925b.m18018f(context, time.f23901b, false);
                            CharSequence charSequence2 = f;
                            if (Time.Status.CANCELED.equals(time.f23910k)) {
                                charSequence2 = C20785a.m48770b(f);
                            }
                            cVar.f39746i.setText(charSequence2);
                            int b3 = transitPattern.mo24384b(this.f39736j.f39727c.f23730b);
                            if (b3 == -1) {
                                cVar.f39749l.setVisibility(8);
                            } else {
                                int f2 = transitPattern.mo24389f();
                                List<String> subList = transitPattern.f23710d.subList(Math.min(b3 + 1, f2), f2);
                                C7527d<String> dVar2 = this.f39737k;
                                String str = dVar2.f23007d;
                                if (str != null && dVar2.f23008e == null) {
                                    dVar2.f23008e = Tokenizer.tokenizeQuery(str);
                                }
                                boolean z2 = !C24361g.m61154X(dVar2.f23008e);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                boolean z3 = true;
                                for (String next : subList) {
                                    if (z3) {
                                        z3 = false;
                                    } else {
                                        spannableStringBuilder.append(", ");
                                    }
                                    spannableStringBuilder.append(next);
                                    if (z2 && this.f39737k.mo19661o(next)) {
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(-3345923), length - next.length(), length, 33);
                                    }
                                }
                                cVar.f39749l.setText(spannableStringBuilder);
                                TextView textView2 = cVar.f39749l;
                                if (spannableStringBuilder.length() > 0) {
                                    i3 = 0;
                                } else {
                                    i3 = 8;
                                }
                                textView2.setVisibility(i3);
                            }
                            String str2 = time.f23909j;
                            if (!C20964s0.m49090h(str2)) {
                                cVar.f39750m.setArguments(str2);
                                cVar.f39750m.setContentDescription(context.getString(R.string.platform_number, new Object[]{str2}));
                                cVar.f39750m.setVisibility(0);
                            } else {
                                cVar.f39750m.setVisibility(4);
                            }
                            TimeVehicleAttributes timeVehicleAttributes = time.f23913n;
                            CongestionSource congestionSource = null;
                            if (timeVehicleAttributes != null) {
                                charSequence = this.f39739m.mo39410b(timeVehicleAttributes);
                            } else {
                                charSequence = null;
                            }
                            if (charSequence != null) {
                                if (!C20964s0.m49090h(cVar.f39744g.getText())) {
                                    textView = cVar.f39744g;
                                } else if (!C20964s0.m49090h(cVar.f39745h.getText())) {
                                    textView = cVar.f39745h;
                                } else {
                                    textView = cVar.f39744g;
                                }
                                textView.setVisibility(0);
                                if (!C20964s0.m49090h(textView.getText())) {
                                    textView.append(" ");
                                }
                                textView.append(charSequence);
                                C13382a.m33674j(textView, textView.getText(), this.f39739m.mo39409a(timeVehicleAttributes));
                            }
                            if (timeVehicleAttributes != null) {
                                congestionLevel = timeVehicleAttributes.f23919c;
                            } else {
                                congestionLevel = null;
                            }
                            if (timeVehicleAttributes != null) {
                                congestionSource = timeVehicleAttributes.f23920d;
                            }
                            if (congestionLevel != null) {
                                C7554s.m17296a(cVar.f39751n, congestionLevel, congestionSource);
                                cVar.f39751n.setVisibility(0);
                                return;
                            }
                            cVar.f39751n.setVisibility(8);
                            return;
                        }
                        StringBuilder k = C13555b.m33972k("Unable to resolve line id ");
                        k.append(i0Var.f52692a);
                        throw new IllegalStateException(k.toString());
                    }
                    StringBuilder k2 = C13555b.m33972k("Line id, ");
                    k2.append(i0Var.f52692a);
                    k2.append(", missing reference in stop id ");
                    k2.append(this.f39736j.f39727c.f23730b);
                    throw new IllegalStateException(k2.toString());
                }
                StringBuilder k3 = C13555b.m33972k("Pattern id, ");
                k3.append(dbEntityRef.getServerId());
                k3.append(", is missing");
                throw new IllegalStateException(k3.toString());
            }
            throw new IllegalStateException(C16530d.m42015h(C13555b.m33972k("Pattern reference, "), i0Var.f52692a, ", is missing"));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 31) {
            view = from.inflate(R.layout.stop_detail_trip_list_item, viewGroup, false);
        } else {
            view = from.inflate(R.layout.stop_detail_empty_trips, viewGroup, false);
        }
        C15354c cVar = new C15354c(view);
        view.setTag(cVar);
        return cVar;
    }
}
