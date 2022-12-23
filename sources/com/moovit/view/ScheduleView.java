package com.moovit.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c00.C13735p;
import c00.C13739s;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.appevents.C2342l;
import com.moovit.app.home.dashboard.C14948l;
import com.moovit.commons.utils.UiUtils;
import com.moovit.transit.Schedule;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.MinutesSpanFormatter;
import com.moovit.util.time.Time;
import com.moovit.util.time.TimeFrequency;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p090g1.C4732a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p523gu.C17230b;
import p638lr.C18267n;
import p824tp.C19735m;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p824tp.C19748z;
import p899ws.C20406f;
import p952yy.C20785a;
import p977zz.C20941h;
import p977zz.C20943i;
import p977zz.C20950l0;
import p977zz.C20964s0;

public class ScheduleView extends LinearLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f23969p = 0;

    /* renamed from: b */
    public MinutesSpanFormatter f23970b;

    /* renamed from: c */
    public Time f23971c;

    /* renamed from: d */
    public Schedule f23972d;

    /* renamed from: e */
    public final TextView f23973e;

    /* renamed from: f */
    public final TextView f23974f;

    /* renamed from: g */
    public final TextView f23975g;

    /* renamed from: h */
    public int f23976h;

    /* renamed from: i */
    public boolean f23977i;

    /* renamed from: j */
    public final List f23978j;

    /* renamed from: k */
    public C7927a f23979k;

    /* renamed from: l */
    public C7929c f23980l;

    /* renamed from: m */
    public boolean f23981m;

    /* renamed from: n */
    public String f23982n;

    /* renamed from: o */
    public final StringBuilder f23983o;

    /* renamed from: com.moovit.view.ScheduleView$a */
    public static class C7927a {

        /* renamed from: a */
        public final C7928b f23984a = new C7928b(this);

        /* renamed from: b */
        public final C13739s<ScheduleView> f23985b = new C13739s<>();

        /* renamed from: a */
        public void mo24745a() {
        }

        /* renamed from: b */
        public final void mo24746b() {
            if (!C13723g.m34280a(this.f23985b, new C20406f(9))) {
                this.f23984a.removeMessages(6);
            } else if (!this.f23984a.hasMessages(6)) {
                this.f23984a.sendEmptyMessageDelayed(6, 60000 - (System.currentTimeMillis() % 60000));
            }
        }
    }

    /* renamed from: com.moovit.view.ScheduleView$b */
    public static class C7928b extends Handler {

        /* renamed from: a */
        public final WeakReference<C7927a> f23986a;

        public C7928b(C7927a aVar) {
            C21100e.m49373x(aVar, "coordinator");
            this.f23986a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            C7927a aVar = this.f23986a.get();
            if (aVar != null) {
                if (message.what == 6) {
                    Iterator<ScheduleView> it = aVar.f23985b.iterator();
                    while (true) {
                        C13735p.C13736a aVar2 = (C13735p.C13736a) it;
                        if (aVar2.hasNext()) {
                            T t = aVar2.f33808c;
                            aVar2.f33808c = null;
                            ScheduleView scheduleView = (ScheduleView) t;
                            if (scheduleView.f23977i) {
                                scheduleView.mo24719f();
                            }
                        } else {
                            aVar.f23984a.sendEmptyMessageDelayed(6, 60000 - (System.currentTimeMillis() % 60000));
                            aVar.mo24745a();
                            return;
                        }
                    }
                } else {
                    super.handleMessage(message);
                }
            }
        }
    }

    /* renamed from: com.moovit.view.ScheduleView$c */
    public interface C7929c {
        /* renamed from: d */
        void mo19809d(List<Time> list);
    }

    public ScheduleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.scheduleViewStyle);
    }

    /* renamed from: a */
    public static C20950l0 m18043a(Time time) {
        TimeFrequency timeFrequency;
        if (time == null || (timeFrequency = time.f23908i) == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C20950l0<Integer> l0Var = timeFrequency.f23916c;
        if (TimeUnit.SECONDS.toMillis((long) ((Integer) l0Var.f52696b).intValue()) + currentTimeMillis < time.mo24631g()) {
            return null;
        }
        return l0Var;
    }

    private AnimationDrawable getAnimationDrawable() {
        Drawable background;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (!C6333d0.C6340g.m15075b(this) || (background = this.f23974f.getBackground()) == null) {
            return null;
        }
        Drawable current = background.getCurrent();
        if (!(current instanceof AnimationDrawable)) {
            return null;
        }
        return (AnimationDrawable) current;
    }

    private CharSequence getNaText() {
        return getResources().getText(C19746x.units_time_na);
    }

    /* renamed from: b */
    public final void mo24715b(Time time) {
        if (time == null || time.mo24633j()) {
            this.f23973e.setVisibility(8);
            return;
        }
        Time time2 = this.f23971c;
        if (time2 == null || !C7925b.m18027o(time2.mo24631g(), time.mo24631g())) {
            long g = time.mo24631g();
            SimpleDateFormat simpleDateFormat = C7925b.f23934a;
            if (DateUtils.isToday(g)) {
                this.f23973e.setVisibility(8);
                return;
            }
            String e = C7925b.m18017e(getContext(), time.mo24631g());
            this.f23973e.setText(e);
            StringBuilder sb = this.f23983o;
            sb.append(e);
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            this.f23973e.setVisibility(0);
            return;
        }
        this.f23973e.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo24716c(Time time, List<Time> list, boolean z) {
        CharSequence charSequence;
        boolean z2;
        List<Time> list2 = list;
        int i = 8;
        if (this.f23976h != 1 || list.isEmpty() || m18043a(time) != null || this.f23973e.getVisibility() == 0) {
            this.f23975g.setVisibility(8);
            return;
        }
        if (z) {
            C2342l lVar = new C2342l(29);
            ArrayList arrayList = new ArrayList(list.size());
            C13720d.m34276f(list2, (C13722f) null, lVar, arrayList);
            long currentTimeMillis = System.currentTimeMillis();
            if (time != null) {
                long n = C7925b.m18026n(currentTimeMillis, time.mo24631g());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (n == C7925b.m18026n(currentTimeMillis, ((Long) it.next()).longValue())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        it.remove();
                    }
                }
            }
            charSequence = this.f23970b.mo24608h(getContext(), currentTimeMillis, arrayList.subList(0, Math.min(arrayList.size(), 2)), 2147483647L, Collections.emptySet());
            if (charSequence != null) {
                StringBuilder sb = this.f23983o;
                sb.append(getContext().getString(C19746x.voice_over_stationview_line_rt, new Object[]{charSequence}));
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
        } else {
            Time time2 = list2.get(0);
            String l = C7925b.m18024l(getContext(), time2.f23901b);
            if (Time.Status.CANCELED.equals(time2.f23910k)) {
                charSequence = C20785a.m48770b(l);
                StringBuilder sb2 = this.f23983o;
                sb2.append(getContext().getString(C19746x.voice_over_next_canceled_arrival_time, new Object[]{charSequence}));
                sb2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            } else {
                StringBuilder sb3 = this.f23983o;
                sb3.append(getContext().getString(C19746x.voice_over_stationview_line_no_rt, new Object[]{l}));
                sb3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                charSequence = l;
            }
        }
        this.f23975g.setText(charSequence);
        TextView textView = this.f23975g;
        if (charSequence != null) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* renamed from: d */
    public final void mo24717d(boolean z) {
        if (this.f23981m != z) {
            if (z) {
                C7927a aVar = this.f23979k;
                aVar.getClass();
                C21100e.m49369v(1);
                aVar.f23985b.mo40650a(this);
                aVar.mo24746b();
                this.f23981m = true;
                mo24719f();
                AnimationDrawable animationDrawable = getAnimationDrawable();
                if (animationDrawable != null) {
                    animationDrawable.start();
                    return;
                }
                return;
            }
            C7927a aVar2 = this.f23979k;
            aVar2.getClass();
            C21100e.m49369v(1);
            aVar2.f23985b.mo40651b(this);
            aVar2.mo24746b();
            this.f23981m = false;
            AnimationDrawable animationDrawable2 = getAnimationDrawable();
            if (animationDrawable2 != null) {
                animationDrawable2.stop();
            }
        }
    }

    /* renamed from: e */
    public final void mo24718e(CharSequence charSequence, String str) {
        this.f23974f.setText(charSequence);
        this.f23982n = str;
    }

    /* renamed from: f */
    public final void mo24719f() {
        List<T> list;
        List<T> list2;
        long currentTimeMillis;
        SpannableStringBuilder f;
        CharSequence charSequence;
        if (this.f23981m) {
            this.f23983o.setLength(0);
            Time time = this.f23971c;
            if (time == null) {
                list = this.f23972d.mo24327n();
            } else {
                list = this.f23972d.mo24333x(time);
            }
            List<T> l = C13717b.m34265l(list, new C14948l(3));
            boolean isEmpty = l.isEmpty();
            if (!isEmpty) {
                list = l;
            }
            boolean z = !isEmpty;
            String str = "realtime";
            Time time2 = null;
            if (this.f23976h == 2) {
                mo24715b((Time) null);
                if (list.isEmpty()) {
                    mo24718e(getNaText(), "not_active");
                    StringBuilder sb = this.f23983o;
                    sb.append(getContext().getString(C19746x.voice_over_line_not_active));
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                } else {
                    List<T> subList = list.subList(0, Math.min(list.size(), 3));
                    if (z) {
                        charSequence = this.f23970b.mo24608h(getContext(), System.currentTimeMillis(), C13720d.m34273c(subList, (C13722f) null, new C18267n(28)), 2147483647L, Collections.emptySet());
                    } else {
                        C17230b bVar = new C17230b(getContext(), 3);
                        LinkedHashSet linkedHashSet = new LinkedHashSet(subList.size());
                        C13720d.m34276f(subList, (C13722f) null, bVar, linkedHashSet);
                        charSequence = C20964s0.m49096n(", ", linkedHashSet);
                        str = "scheduled";
                    }
                    StringBuilder sb2 = this.f23983o;
                    sb2.append(getContext().getString(C19746x.voice_over_home_line_arrival_time, new Object[]{charSequence}));
                    sb2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    mo24718e(charSequence, str);
                }
                mo24716c((Time) null, Collections.emptyList(), z);
            } else {
                if (!list.isEmpty()) {
                    time2 = (Time) list.get(0);
                }
                if (list.isEmpty()) {
                    list2 = list;
                } else {
                    list2 = list.subList(1, list.size());
                }
                mo24715b(time2);
                if (time2 == null) {
                    mo24718e(getNaText(), "not_active");
                    StringBuilder sb3 = this.f23983o;
                    sb3.append(getContext().getString(C19746x.voice_over_line_not_active));
                    sb3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                } else if (!time2.mo24633j() || (f = this.f23970b.mo24606f(getContext(), (currentTimeMillis = System.currentTimeMillis()), time2.mo24631g(), 2147483647L, this.f23978j)) == null) {
                    C20950l0 a = m18043a(time2);
                    if (a != null) {
                        MinutesSpanFormatter minutesSpanFormatter = this.f23970b;
                        Context context = getContext();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        Collections.emptyList();
                        SpannableStringBuilder d = minutesSpanFormatter.mo24604d(context, a, timeUnit);
                        mo24718e(getContext().getString(C19746x.schedule_view_every_min_range_linebreak, new Object[]{d}), "frequency");
                        StringBuilder sb4 = this.f23983o;
                        sb4.append(getContext().getString(C19746x.voice_over_schedule_view_every_min_range, new Object[]{d}));
                        sb4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    } else {
                        String l2 = C7925b.m18024l(getContext(), time2.mo24631g());
                        if (Time.Status.CANCELED.equals(time2.f23910k)) {
                            mo24718e(C20785a.m48770b(l2), "scheduled");
                            StringBuilder sb5 = this.f23983o;
                            sb5.append(getContext().getString(C19746x.voice_over_home_line_canceled_arrival_time, new Object[]{l2}));
                            sb5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                        } else {
                            mo24718e(l2, "scheduled");
                            StringBuilder sb6 = this.f23983o;
                            sb6.append(getContext().getString(C19746x.voice_over_home_line_arrival_time, new Object[]{l2}));
                            sb6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                        }
                    }
                } else {
                    StringBuilder sb7 = this.f23983o;
                    sb7.append(this.f23970b.mo24601a(getContext(), currentTimeMillis, time2.mo24631g(), 2147483647L, this.f23978j));
                    sb7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    mo24718e(f, str);
                }
                mo24716c(time2, list2, z);
            }
            setActivated(z);
            AnimationDrawable animationDrawable = getAnimationDrawable();
            if (animationDrawable != null) {
                animationDrawable.start();
            }
            setContentDescription(this.f23983o);
            C7929c cVar = this.f23980l;
            if (cVar != null) {
                cVar.mo19809d(list);
            }
        }
    }

    public String getDisplayType() {
        return this.f23982n;
    }

    public int getPeekTimesMode() {
        return this.f23976h;
    }

    public Schedule getSchedule() {
        return this.f23972d;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23979k == null) {
            this.f23979k = new C7927a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo24717d(false);
    }

    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        mo24717d(z);
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i != 0 || !isShown()) {
            z = false;
        } else {
            z = true;
        }
        mo24717d(z);
    }

    public void setAutoFlip(boolean z) {
        this.f23977i = z;
        C7927a aVar = this.f23979k;
        if (aVar != null) {
            aVar.mo24746b();
        }
    }

    public void setBaseTime(Time time) {
        this.f23971c = time;
        mo24719f();
    }

    public void setCoordinator(C7927a aVar) {
        C7927a aVar2;
        if (this.f23981m && (aVar2 = this.f23979k) != null) {
            C21100e.m49369v(1);
            aVar2.f23985b.mo40651b(this);
            aVar2.mo24746b();
        }
        C21100e.m49373x(aVar, "newCoordinator");
        this.f23979k = aVar;
        if (this.f23981m) {
            C21100e.m49369v(1);
            aVar.f23985b.mo40650a(this);
            aVar.mo24746b();
        }
    }

    public void setListener(C7929c cVar) {
        this.f23980l = cVar;
    }

    public void setPeekTextAppearance(int i) {
        C0801k.m2424f(this.f23975g, i);
    }

    public void setPeekTextColor(ColorStateList colorStateList) {
        this.f23975g.setTextColor(colorStateList);
    }

    public void setPeekTextColorRes(int i) {
        setPeekTextColor(C4732a.getColorStateList(getContext(), i));
    }

    public void setPeekTextThemeColor(int i) {
        setPeekTextColor(C20941h.m49044g(i, getContext()));
    }

    public void setPeekTimesMode(int i) {
        this.f23976h = i;
        mo24719f();
    }

    public void setSchedule(Schedule schedule) {
        C21100e.m49373x(schedule, "schedule");
        this.f23972d = schedule;
        mo24719f();
    }

    public void setSpanSystem(MinutesSpanFormatter.SpanSystem spanSystem) {
        C21100e.m49371w(spanSystem);
        this.f23970b = new MinutesSpanFormatter(spanSystem);
        mo24719f();
    }

    public void setTime(Time time) {
        Schedule schedule;
        if (time == null) {
            schedule = Schedule.f23657c;
        } else {
            schedule = Schedule.m17783E(time);
        }
        setSchedule(schedule);
    }

    public void setTimeTextAppearance(int i) {
        C0801k.m2424f(this.f23974f, i);
    }

    public void setTimeTextColor(ColorStateList colorStateList) {
        this.f23974f.setTextColor(colorStateList);
    }

    public void setTimeTextColorRes(int i) {
        setTimeTextColor(C4732a.getColorStateList(getContext(), i));
    }

    public void setTimeTextThemeColor(int i) {
        setTimeTextColor(C20941h.m49044g(i, getContext()));
    }

    /* JADX INFO: finally extract failed */
    public ScheduleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MinutesSpanFormatter.SpanSystem spanSystem;
        this.f23971c = null;
        this.f23972d = Schedule.f23657c;
        this.f23979k = null;
        this.f23980l = null;
        this.f23981m = false;
        this.f23982n = null;
        setOrientation(1);
        setGravity(8388629);
        this.f23978j = Collections.emptyList();
        StringBuilder sb = new StringBuilder();
        this.f23983o = sb;
        LayoutInflater.from(context).inflate(C19742t.schedule_view, this, true);
        this.f23973e = (TextView) findViewById(C19740r.day);
        TextView textView = (TextView) findViewById(C19740r.main_time);
        this.f23974f = textView;
        this.f23975g = (TextView) findViewById(C19740r.peek_times);
        TypedArray o = UiUtils.m40256o(context, attributeSet, C19748z.ScheduleView, i);
        try {
            int resourceId = o.getResourceId(C19748z.ScheduleView_timeTextAppearance, -1);
            if (resourceId != -1) {
                setTimeTextAppearance(resourceId);
            }
            ColorStateList b = C20941h.m49039b(context, o, C19748z.ScheduleView_timeTextColor);
            if (b != null) {
                setTimeTextColor(b);
            }
            int resourceId2 = o.getResourceId(C19748z.ScheduleView_peekTimeTextAppearance, -1);
            if (resourceId2 != -1) {
                setPeekTextAppearance(resourceId2);
            }
            ColorStateList b2 = C20941h.m49039b(context, o, C19748z.ScheduleView_peekTimeTextColor);
            if (b2 != null) {
                setPeekTextColor(b2);
            }
            this.f23976h = o.getInt(C19748z.ScheduleView_peekTimes, 1);
            this.f23977i = o.getBoolean(C19748z.ScheduleView_autoFlip, true);
            ((LinearLayout.LayoutParams) textView.getLayoutParams()).gravity = o.getInt(C19748z.ScheduleView_android_gravity, 8388629);
            Drawable drawable = o.getDrawable(C19748z.ScheduleView_realTimeIndicator);
            int color = o.getColor(C19748z.ScheduleView_realTimeIndicatorTint, 0);
            if (!(color == 0 || drawable == null || drawable.getConstantState() == null)) {
                drawable = drawable.getConstantState().newDrawable(getResources()).mutate();
                drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            C20943i.m49053f(textView, drawable);
            int i2 = o.getInt(C19748z.ScheduleView_spanSystem, 0);
            if (i2 == 0) {
                spanSystem = MinutesSpanFormatter.SpanSystem.PASSIVE;
            } else if (i2 != 1) {
                spanSystem = MinutesSpanFormatter.SpanSystem.REGULAR;
            } else {
                spanSystem = MinutesSpanFormatter.SpanSystem.ACTIVE;
            }
            this.f23970b = new MinutesSpanFormatter(spanSystem);
            o.recycle();
            if (!isInEditMode()) {
                mo24719f();
            }
            setContentDescription(sb);
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }

    public void setPeekTextColor(int i) {
        this.f23974f.setTextColor(i);
    }

    public void setTimeTextColor(int i) {
        this.f23974f.setTextColor(i);
    }
}
