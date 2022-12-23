package p528gz;

import android.app.Application;
import android.content.SharedPreferences;
import ce0.C21100e;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.models.outgoing.FacebookUser;
import com.braze.BrazeUser;
import com.moovit.commons.utils.DataUnit;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;
import p977zz.C20975x0;
import p988j$.util.DesugarTimeZone;

/* renamed from: gz.g */
public final class C17272g {

    /* renamed from: b */
    public static final C17274b f44642b = new C17274b();

    /* renamed from: c */
    public static final C17287o f44643c = new C17287o("moovit_id");

    /* renamed from: d */
    public static final C17280h f44644d = new C17280h("moovit_bucket");

    /* renamed from: e */
    public static final C17280h f44645e = new C17280h("metro_id");

    /* renamed from: f */
    public static final C17287o f44646f = new C17287o("metro_name");

    /* renamed from: g */
    public static final C17287o f44647g = new C17287o(MediationMetaData.KEY_VERSION);

    /* renamed from: h */
    public static final C17286n f44648h = new C17286n();

    /* renamed from: i */
    public static final C17280h f44649i = new C17280h("country_id");

    /* renamed from: j */
    public static final C17288p f44650j = new C17288p();

    /* renamed from: k */
    public static final C17273a f44651k = new C17273a();

    /* renamed from: l */
    public static final C17279g f44652l = new C17279g();

    /* renamed from: m */
    public static final C17281i f44653m = new C17281i();

    /* renamed from: n */
    public static final C17278f f44654n = new C17278f();

    /* renamed from: o */
    public static final C17276d f44655o = new C17276d();

    /* renamed from: p */
    public static final C17283k f44656p = new C17283k();

    /* renamed from: q */
    public static final C17284l f44657q = new C17284l();

    /* renamed from: a */
    public final Application f44658a;

    /* renamed from: gz.g$a */
    public static class C17273a extends C17285m<Boolean> {
        public C17273a() {
            super("marketing_consent");
        }

        /* renamed from: b */
        public final Object mo49813b(SharedPreferences sharedPreferences) {
            if (sharedPreferences.contains(this.f44661a)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f44661a, false));
            }
            return null;
        }

        /* renamed from: d */
        public final void mo49814d(SharedPreferences.Editor editor, Object obj) {
            editor.putBoolean(this.f44661a, ((Boolean) obj).booleanValue());
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setCustomUserAttribute(this.f44661a, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: gz.g$b */
    public static final class C17274b {

        /* renamed from: a */
        public final String f44659a = "moovit_id";

        /* renamed from: b */
        public final String f44660b = "alias_moovit_id";
    }

    /* renamed from: gz.g$c */
    public static abstract class C17275c<I, O> {

        /* renamed from: a */
        public final String f44661a;

        public C17275c(String str) {
            this.f44661a = str;
        }

        /* renamed from: a */
        public abstract Object mo49816a(Serializable serializable);

        /* renamed from: b */
        public abstract O mo49813b(SharedPreferences sharedPreferences);

        /* renamed from: c */
        public boolean mo49817c(BrazeUser brazeUser) {
            return brazeUser.unsetCustomUserAttribute(this.f44661a);
        }

        /* renamed from: d */
        public abstract void mo49814d(SharedPreferences.Editor editor, O o);

        /* renamed from: e */
        public abstract boolean mo49815e(BrazeUser brazeUser, O o);
    }

    /* renamed from: gz.g$d */
    public static class C17276d extends C17282j {
        /* renamed from: c */
        public final boolean mo49817c(BrazeUser brazeUser) {
            return brazeUser.setDateOfBirth(1700, Month.JANUARY, 1);
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            instance.setTimeInMillis(((Long) obj).longValue());
            return brazeUser.setDateOfBirth(instance.get(1), Month.getMonth(instance.get(2)), instance.get(5));
        }
    }

    /* renamed from: gz.g$e */
    public static final class C17277e {

        /* renamed from: a */
        public final SharedPreferences f44662a;

        /* renamed from: b */
        public final BrazeUser f44663b;

        /* renamed from: c */
        public SharedPreferences.Editor f44664c;

        public C17277e(SharedPreferences sharedPreferences, BrazeUser brazeUser) {
            C21100e.m49373x(sharedPreferences, "prefs");
            this.f44662a = sharedPreferences;
            C21100e.m49373x(brazeUser, "user");
            this.f44663b = brazeUser;
        }

        /* renamed from: a */
        public final void mo49818a(C17275c cVar, Serializable serializable) {
            SharedPreferences sharedPreferences = this.f44662a;
            if (this.f44664c == null) {
                this.f44664c = sharedPreferences.edit();
            }
            SharedPreferences.Editor editor = this.f44664c;
            BrazeUser brazeUser = this.f44663b;
            Object b = cVar.mo49813b(sharedPreferences);
            Object a = cVar.mo49816a(serializable);
            if (!C20975x0.m49118e(b, a)) {
                if (a == null) {
                    if (cVar.mo49817c(brazeUser)) {
                        editor.remove(cVar.f44661a);
                    }
                } else if (cVar.mo49815e(brazeUser, a)) {
                    cVar.mo49814d(editor, a);
                }
            }
        }
    }

    /* renamed from: gz.g$f */
    public static class C17278f extends C17287o {
        public C17278f() {
            super("email");
        }

        /* renamed from: c */
        public final boolean mo49817c(BrazeUser brazeUser) {
            return brazeUser.setEmail((String) null);
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setEmail((String) obj);
        }

        /* renamed from: f */
        public final boolean mo49819f(BrazeUser brazeUser, String str) {
            return brazeUser.setEmail(str);
        }
    }

    /* renamed from: gz.g$g */
    public static class C17279g extends C17287o {
        public C17279g() {
            super(FacebookUser.FIRST_NAME_KEY);
        }

        /* renamed from: c */
        public final boolean mo49817c(BrazeUser brazeUser) {
            return brazeUser.setFirstName((String) null);
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setFirstName((String) obj);
        }

        /* renamed from: f */
        public final boolean mo49819f(BrazeUser brazeUser, String str) {
            return brazeUser.setFirstName(str);
        }
    }

    /* renamed from: gz.g$h */
    public static class C17280h extends C17285m<Integer> {
        public C17280h(String str) {
            super(str);
        }

        /* renamed from: b */
        public final Object mo49813b(SharedPreferences sharedPreferences) {
            int i = sharedPreferences.getInt(this.f44661a, Integer.MIN_VALUE);
            if (i != Integer.MIN_VALUE) {
                return Integer.valueOf(i);
            }
            return null;
        }

        /* renamed from: d */
        public final void mo49814d(SharedPreferences.Editor editor, Object obj) {
            editor.putInt(this.f44661a, ((Integer) obj).intValue());
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setCustomUserAttribute(this.f44661a, ((Integer) obj).intValue());
        }
    }

    /* renamed from: gz.g$i */
    public static class C17281i extends C17287o {
        public C17281i() {
            super(FacebookUser.LAST_NAME_KEY);
        }

        /* renamed from: c */
        public final boolean mo49817c(BrazeUser brazeUser) {
            return brazeUser.setLastName((String) null);
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setLastName((String) obj);
        }

        /* renamed from: f */
        public final boolean mo49819f(BrazeUser brazeUser, String str) {
            return brazeUser.setLastName(str);
        }
    }

    /* renamed from: gz.g$j */
    public static class C17282j extends C17285m<Long> {
        public C17282j() {
            super("dob");
        }

        /* renamed from: b */
        public final Object mo49813b(SharedPreferences sharedPreferences) {
            long j = sharedPreferences.getLong(this.f44661a, Long.MIN_VALUE);
            if (j != Long.MIN_VALUE) {
                return Long.valueOf(j);
            }
            return null;
        }

        /* renamed from: d */
        public final void mo49814d(SharedPreferences.Editor editor, Object obj) {
            editor.putLong(this.f44661a, ((Long) obj).longValue());
        }
    }

    /* renamed from: gz.g$k */
    public static class C17283k extends C17287o {
        public C17283k() {
            super("phone");
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setPhoneNumber((String) obj);
        }

        /* renamed from: f */
        public final boolean mo49819f(BrazeUser brazeUser, String str) {
            return brazeUser.setPhoneNumber(str);
        }
    }

    /* renamed from: gz.g$l */
    public static class C17284l extends C17275c<Boolean, NotificationSubscriptionType> {
        public C17284l() {
            super("push_subscribe");
        }

        /* renamed from: a */
        public final Object mo49816a(Serializable serializable) {
            if (Boolean.TRUE.equals((Boolean) serializable)) {
                return NotificationSubscriptionType.OPTED_IN;
            }
            return NotificationSubscriptionType.UNSUBSCRIBED;
        }

        /* renamed from: b */
        public final Object mo49813b(SharedPreferences sharedPreferences) {
            if (!sharedPreferences.contains(this.f44661a)) {
                return NotificationSubscriptionType.SUBSCRIBED;
            }
            if (sharedPreferences.getBoolean(this.f44661a, true)) {
                return NotificationSubscriptionType.OPTED_IN;
            }
            return NotificationSubscriptionType.UNSUBSCRIBED;
        }

        /* renamed from: d */
        public final void mo49814d(SharedPreferences.Editor editor, Object obj) {
            editor.putBoolean(this.f44661a, ((NotificationSubscriptionType) obj).equals(NotificationSubscriptionType.OPTED_IN));
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setPushNotificationSubscriptionType((NotificationSubscriptionType) obj);
        }
    }

    /* renamed from: gz.g$m */
    public static abstract class C17285m<T> extends C17275c<T, T> {
        public C17285m(String str) {
            super(str);
        }

        /* renamed from: a */
        public final Object mo49816a(Serializable serializable) {
            return serializable;
        }
    }

    /* renamed from: gz.g$n */
    public static class C17286n extends C17275c<Long, String> {

        /* renamed from: b */
        public static final double f44665b;

        /* renamed from: c */
        public static final double f44666c;

        static {
            DataUnit dataUnit = DataUnit.MB;
            f44665b = dataUnit.toBytes(1100.0d);
            f44666c = dataUnit.toBytes(1900.0d);
        }

        public C17286n() {
            super("available_storage");
        }

        /* renamed from: a */
        public final Object mo49816a(Serializable serializable) {
            Long l = (Long) serializable;
            if (l == null) {
                return null;
            }
            if (((double) l.longValue()) <= f44665b) {
                return "low";
            }
            if (((double) l.longValue()) <= f44666c) {
                return "medium";
            }
            return "high";
        }

        /* renamed from: b */
        public final Object mo49813b(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(this.f44661a, (String) null);
        }

        /* renamed from: d */
        public final void mo49814d(SharedPreferences.Editor editor, Object obj) {
            editor.putString(this.f44661a, (String) obj);
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setCustomUserAttribute(this.f44661a, (String) obj);
        }
    }

    /* renamed from: gz.g$o */
    public static class C17287o extends C17285m<String> {
        public C17287o(String str) {
            super(str);
        }

        /* renamed from: b */
        public final Object mo49813b(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(this.f44661a, (String) null);
        }

        /* renamed from: d */
        public final void mo49814d(SharedPreferences.Editor editor, Object obj) {
            editor.putString(this.f44661a, (String) obj);
        }

        /* renamed from: f */
        public boolean mo49815e(BrazeUser brazeUser, String str) {
            return brazeUser.setCustomUserAttribute(this.f44661a, str);
        }
    }

    /* renamed from: gz.g$p */
    public static class C17288p extends C17285m<Set<String>> {
        public C17288p() {
            super("profile_ids");
        }

        /* renamed from: b */
        public final Object mo49813b(SharedPreferences sharedPreferences) {
            return sharedPreferences.getStringSet(this.f44661a, (Set) null);
        }

        /* renamed from: d */
        public final void mo49814d(SharedPreferences.Editor editor, Object obj) {
            editor.putStringSet(this.f44661a, (Set) obj);
        }

        /* renamed from: e */
        public final boolean mo49815e(BrazeUser brazeUser, Object obj) {
            return brazeUser.setCustomAttributeArray(this.f44661a, (String[]) ((Set) obj).toArray(new String[0]));
        }
    }

    public C17272g(Application application) {
        C21100e.m49373x(application, "application");
        this.f44658a = application;
    }
}
