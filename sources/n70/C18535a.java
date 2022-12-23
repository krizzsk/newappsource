package n70;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.sdk.profilers.ProfilerType;
import com.moovit.sdk.profilers.config.BaseConfig;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e70.C4591d;
import f00.C16918f;
import f00.C16919g;
import i70.C17560a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Locale;
import p001a0.C0016g;
import p389bl.C13641g;
import p786rz.C19387a;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20964s0;
import r70.C19248b;
import r70.C19249c;
import y70.C13256a;

/* renamed from: n70.a */
public abstract class C18535a<PC extends BaseConfig> {

    /* renamed from: a */
    public final Context f47186a;

    /* renamed from: b */
    public final SharedPreferences f47187b;

    /* renamed from: c */
    public final ProfilerType f47188c;

    /* renamed from: d */
    public final String f47189d;

    /* renamed from: e */
    public final String f47190e;

    /* renamed from: f */
    public PC f47191f;

    /* renamed from: g */
    public final ProfilerLog f47192g;

    /* renamed from: h */
    public final C16918f<Long> f47193h;

    /* renamed from: i */
    public final C16918f<Long> f47194i;

    /* renamed from: j */
    public final C16918f<Long> f47195j;

    /* renamed from: k */
    public final C16918f<Long> f47196k;

    /* renamed from: l */
    public final C19589j<PC> f47197l;

    /* renamed from: m */
    public final C19600l<PC> f47198m;

    public C18535a(Context context, String str, ProfilerType profilerType, C19620t tVar, C19621u uVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f47186a = context;
        this.f47189d = str;
        C21100e.m49373x(profilerType, "type");
        this.f47188c = profilerType;
        C21100e.m49373x(tVar, "configReader");
        this.f47197l = tVar;
        C21100e.m49373x(uVar, "configWriter");
        this.f47198m = uVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("moovit_sdk_profiler." + str, 0);
        this.f47187b = sharedPreferences;
        this.f47192g = ProfilerLog.m41879c(context);
        this.f47190e = str.toUpperCase(Locale.US);
        this.f47193h = new C16918f<>(sharedPreferences, new C16919g.C16925f("activation_time", -1));
        this.f47194i = new C16918f<>(sharedPreferences, new C16919g.C16925f("start_sequence_id", 0));
        this.f47195j = new C16918f<>(sharedPreferences, new C16919g.C16925f("data_start_time", -1));
        this.f47196k = new C16918f<>(sharedPreferences, new C16919g.C16925f("data_end_time", -1));
    }

    /* renamed from: a */
    public int mo49250a() {
        return 0;
    }

    /* renamed from: b */
    public final PC mo50937b() {
        if (this.f47191f == null) {
            this.f47191f = (BaseConfig) C13641g.m34134w(mo50938c(), this.f47197l);
        }
        return this.f47191f;
    }

    /* renamed from: c */
    public final File mo50938c() {
        if (mo49251d() != null) {
            return new File(mo50939e(), mo49251d());
        }
        throw new IllegalStateException("You must define the config file name by overriding the getConfigFileName() method");
    }

    /* renamed from: d */
    public String mo49251d() {
        return null;
    }

    /* renamed from: e */
    public final File mo50939e() {
        StringBuilder sb = new StringBuilder();
        File file = new File(this.f47186a.getFilesDir(), "moovit_sdk_profilers/");
        file.mkdirs();
        sb.append(file);
        File file2 = new File(C0016g.m31o(sb, this.f47189d, "/"));
        file2.mkdirs();
        return file2;
    }

    /* renamed from: f */
    public String mo49252f() {
        return null;
    }

    /* renamed from: g */
    public final synchronized C17560a mo50940g() throws IOException {
        String f = mo49252f();
        if (f == null) {
            return null;
        }
        File file = new File(mo50939e(), f);
        file.getCanonicalPath();
        if (!file.isFile()) {
            return null;
        }
        return new C17560a(C19387a.m46672d(new FileInputStream(file)), this.f47195j.mo49542a().longValue(), this.f47196k.mo49542a().longValue(), this.f47194i.mo49542a().longValue(), Collections.singletonList(Integer.valueOf(this.f47188c.getSensorType())));
    }

    /* renamed from: h */
    public String mo49253h() {
        return null;
    }

    /* renamed from: i */
    public abstract Intent mo49254i();

    /* renamed from: j */
    public final boolean mo50941j() {
        return this.f47193h.mo49542a().longValue() >= 0;
    }

    /* renamed from: k */
    public String mo49277k() {
        return null;
    }

    /* renamed from: l */
    public final void mo50942l(String str) {
        this.f47192g.mo49244b(this.f47190e, str);
    }

    /* renamed from: m */
    public void mo49255m(int i) {
        mo50942l("onActivate called reason: " + i);
    }

    /* renamed from: n */
    public final void mo50943n() {
        if (this.f47195j.mo49542a().longValue() == -1) {
            this.f47195j.mo49544c(Long.valueOf(System.currentTimeMillis()));
        }
        this.f47196k.mo49544c(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: o */
    public final synchronized void mo50944o() {
        String f = mo49252f();
        if (f != null) {
            File file = new File(mo50939e(), f);
            if (file.isFile()) {
                file.delete();
            }
            this.f47195j.mo49543b();
            this.f47196k.mo49543b();
            this.f47187b.edit().commit();
        }
    }

    /* renamed from: p */
    public void mo49256p(int i) {
        mo50942l("onDeactivate called reason: " + i);
        this.f47195j.mo49543b();
        this.f47196k.mo49543b();
    }

    /* renamed from: q */
    public final void mo50945q(Intent intent, boolean z) {
        String str;
        String str2;
        int i;
        String str3;
        ProfilerLog profilerLog = this.f47192g;
        StringBuilder k = C13555b.m33972k("----- ");
        k.append(this.f47190e);
        String sb = k.toString();
        StringBuilder k2 = C13555b.m33972k("profiler was ");
        if (z) {
            str = "activated";
        } else {
            str = "deactivated";
        }
        k2.append(str);
        k2.append(" -----");
        profilerLog.mo49244b(sb, k2.toString());
        int i2 = 0;
        boolean j = mo50941j();
        int a = mo49250a();
        if (z == j) {
            if (!z) {
                mo50942l("Ignoring request to deactivate profiler - already inactive");
                return;
            } else if (a == 0) {
                mo50942l("Ignoring request to activate profiler - already active");
                return;
            } else {
                i2 = 3;
            }
        }
        if (z) {
            C16918f<Long> fVar = this.f47194i;
            fVar.mo49544c(Long.valueOf(fVar.mo49542a().longValue() + 1));
            String k3 = mo49277k();
            if (k3 == null) {
                if (j && a == 1) {
                    mo49256p(i2);
                } else if (!j) {
                    this.f47193h.mo49544c(Long.valueOf(System.currentTimeMillis()));
                }
                if (mo49257r(intent)) {
                    mo49255m(i2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Profiler ");
                    if (j) {
                        str3 = "re";
                    } else {
                        str3 = "";
                    }
                    sb2.append(str3);
                    sb2.append("activated (");
                    sb2.append(mo49253h());
                    sb2.append(")");
                    mo50942l(sb2.toString());
                }
                str2 = null;
                i = 1;
            } else {
                mo50942l("Profiler isn't supported: " + k3);
                str2 = k3;
                i = 3;
            }
            C4591d.m11903a(this.f47186a).getClass();
            String str4 = C4591d.f15777f.f15781d;
            long longValue = this.f47194i.mo49542a().longValue();
            int visibilityMessagesType = this.f47188c.getVisibilityMessagesType();
            Context context = this.f47186a;
            C13256a.m33377b(context).mo40132a(new C19248b(longValue, str4, visibilityMessagesType, context, i, str2));
            return;
        }
        int intExtra = intent.getIntExtra("stop_reason", 3);
        C4591d.m11903a(this.f47186a).getClass();
        C13256a.m33377b(this.f47186a).mo40132a(new C19249c(this.f47188c.getVisibilityMessagesType(), intExtra, C4591d.f15777f.f15781d, this.f47194i.mo49542a().longValue()));
        mo49256p(i2);
        this.f47193h.mo49544c(-1L);
        mo50942l("Profiler deactivated");
    }

    /* renamed from: r */
    public boolean mo49257r(Intent intent) {
        return true;
    }

    /* renamed from: s */
    public final boolean mo50946s(Intent intent, String str) {
        PC pc = (BaseConfig) intent.getParcelableExtra(str);
        BaseConfig baseConfig = (BaseConfig) C13641g.m34134w(mo50938c(), this.f47197l);
        this.f47191f = pc;
        ProfilerLog.m41879c(this.f47186a).mo49244b(C0016g.m31o(new StringBuilder(), this.f47190e, " config"), this.f47191f.toString());
        if (baseConfig != null && baseConfig.equals(pc)) {
            return false;
        }
        C13641g.m34137z(mo50938c(), pc, this.f47198m);
        return true;
    }

    /* renamed from: t */
    public final synchronized void mo50947t(String str, String str2) {
        File file = new File(mo50939e(), str);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println(str2);
            printWriter.close();
            mo50943n();
        } catch (IOException e) {
            file.toString();
            mo50942l("Error writing to file " + file + ": " + e.getMessage());
        }
        return;
    }

    public final String toString() {
        return this.f47189d;
    }

    /* renamed from: u */
    public final synchronized void mo50949u(String str, ProfilerType profilerType, Object... objArr) {
        String str2 = Long.toString(System.currentTimeMillis()) + ',' + Integer.toString(profilerType.getSensorType()) + ',' + C20964s0.m49102t(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, objArr);
        ProfilerLog.m41879c(this.f47186a).mo49244b("CSV DATA " + this.f47190e, str2);
        mo50947t(str, str2);
    }
}
