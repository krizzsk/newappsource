package f00;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import p389bl.C13641g;
import p397bu.C13689g;
import p549hw.C17507e;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19577c;
import p810sz.C19589j;
import p810sz.C19600l;
import p977zz.C20964s0;

/* renamed from: f00.g */
public abstract class C16919g<T> {

    /* renamed from: a */
    public final String f43935a;

    /* renamed from: b */
    public final T f43936b;

    /* renamed from: f00.g$a */
    public static class C16920a extends C16919g<Boolean> {
        public C16920a(String str, boolean z) {
            super(str, Boolean.valueOf(z));
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putBoolean(this.f43935a, ((Boolean) obj).booleanValue());
        }

        /* renamed from: e */
        public final Boolean mo19759a(SharedPreferences sharedPreferences) {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f43935a, ((Boolean) this.f43936b).booleanValue()));
        }
    }

    /* renamed from: f00.g$b */
    public static class C16921b<E extends Enum<E>> extends C16919g<E> {

        /* renamed from: c */
        public final C19577c<E> f43937c;

        public C16921b(String str, C19577c<E> cVar, E e) {
            super(str, e);
            C21100e.m49373x(cVar, "coder");
            this.f43937c = cVar;
        }

        /* renamed from: a */
        public final Object mo19759a(SharedPreferences sharedPreferences) {
            int i = sharedPreferences.getInt(this.f43935a, -1);
            if (i != -1) {
                return this.f43937c.mo51916a((short) i);
            }
            return (Enum) this.f43936b;
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            short s;
            Enum enumR = (Enum) obj;
            if (enumR != null) {
                s = this.f43937c.mo51917b(enumR);
            } else {
                s = -1;
            }
            editor.putInt(this.f43935a, s);
        }
    }

    /* renamed from: f00.g$c */
    public static class C16922c<E extends Enum<E>> extends C16919g<Set<E>> {

        /* renamed from: c */
        public final C19577c<E> f43938c;

        public C16922c(C19577c cVar, EnumSet enumSet) {
            super("user_preferable_types", enumSet);
            C21100e.m49373x(cVar, "coder");
            this.f43938c = cVar;
        }

        /* renamed from: a */
        public final Object mo19759a(SharedPreferences sharedPreferences) {
            Set<String> stringSet = sharedPreferences.getStringSet(this.f43935a, (Set) null);
            if (stringSet == null) {
                return (Set) this.f43936b;
            }
            return C13720d.m34277g(stringSet, (C13722f) null, new C17507e(this, 3));
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putStringSet(this.f43935a, C13720d.m34277g((Set) obj, (C13722f) null, new C13689g(this, 2)));
        }
    }

    /* renamed from: f00.g$d */
    public static class C16923d extends C16919g<List<Integer>> {
        public C16923d(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            String str;
            List list = (List) obj;
            if (list != null) {
                int size = list.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = Integer.toHexString(((Integer) list.get(i)).intValue());
                }
                str = TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, strArr);
            } else {
                str = null;
            }
            editor.putString(this.f43935a, str);
        }

        /* renamed from: e */
        public final List<Integer> mo19759a(SharedPreferences sharedPreferences) {
            String string = sharedPreferences.getString(this.f43935a, (String) null);
            if (string == null) {
                return (List) this.f43936b;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : C20964s0.m49080A(string, ',')) {
                if (!C20964s0.m49090h(str)) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str, 16)));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: f00.g$e */
    public static class C16924e extends C16919g<Integer> {
        public C16924e(String str, int i) {
            super(str, Integer.valueOf(i));
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putInt(this.f43935a, ((Integer) obj).intValue());
        }

        /* renamed from: e */
        public final Integer mo19759a(SharedPreferences sharedPreferences) {
            return Integer.valueOf(sharedPreferences.getInt(this.f43935a, ((Integer) this.f43936b).intValue()));
        }
    }

    /* renamed from: f00.g$f */
    public static class C16925f extends C16919g<Long> {
        public C16925f(String str, long j) {
            super(str, Long.valueOf(j));
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putLong(this.f43935a, ((Long) obj).longValue());
        }

        /* renamed from: e */
        public final Long mo19759a(SharedPreferences sharedPreferences) {
            return Long.valueOf(sharedPreferences.getLong(this.f43935a, ((Long) this.f43936b).longValue()));
        }
    }

    /* renamed from: f00.g$g */
    public static class C16926g<T> extends C16919g<T> {

        /* renamed from: c */
        public final C19589j<? extends T> f43939c;

        /* renamed from: d */
        public final C19600l<? super T> f43940d;

        public C16926g(C19575a aVar, C19576b bVar) {
            super("extra_tile_layers", null);
            this.f43939c = aVar;
            this.f43940d = bVar;
        }

        /* renamed from: a */
        public final T mo19759a(SharedPreferences sharedPreferences) {
            String str;
            String str2 = this.f43935a;
            T t = this.f43936b;
            if (t == null) {
                str = null;
            } else {
                str = Base64.encodeToString(C13641g.m34110B(t, this.f43940d), 0);
            }
            String string = sharedPreferences.getString(str2, str);
            if (string == null) {
                return null;
            }
            return C13641g.m34120h(Base64.decode(string, 0), this.f43939c);
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, T t) {
            String str;
            String str2 = this.f43935a;
            if (t == null) {
                str = null;
            } else {
                str = Base64.encodeToString(C13641g.m34110B(t, this.f43940d), 0);
            }
            editor.putString(str2, str);
        }
    }

    /* renamed from: f00.g$h */
    public static class C16927h extends C16919g<Short> {
        public C16927h(String str, Short sh) {
            super(str, sh);
        }

        /* renamed from: a */
        public final Object mo19759a(SharedPreferences sharedPreferences) {
            return Short.valueOf((short) sharedPreferences.getInt(this.f43935a, ((Short) this.f43936b).shortValue()));
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putInt(this.f43935a, ((Short) obj).shortValue());
        }
    }

    /* renamed from: f00.g$i */
    public static class C16928i extends C16919g<String> {
        public C16928i(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putString(this.f43935a, (String) obj);
        }

        /* renamed from: e */
        public final String mo19759a(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(this.f43935a, (String) this.f43936b);
        }
    }

    /* renamed from: f00.g$j */
    public static class C16929j extends C16919g<Set<String>> {
        public C16929j(String str, Set<String> set) {
            super(str, set);
        }

        /* renamed from: a */
        public final Object mo19759a(SharedPreferences sharedPreferences) {
            return sharedPreferences.getStringSet(this.f43935a, (Set) this.f43936b);
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putStringSet(this.f43935a, (Set) obj);
        }
    }

    public C16919g(String str, T t) {
        C21100e.m49373x(str, "name");
        this.f43935a = str;
        this.f43936b = t;
    }

    /* renamed from: a */
    public abstract T mo19759a(SharedPreferences sharedPreferences);

    /* renamed from: b */
    public void mo49539b(SharedPreferences.Editor editor) {
        editor.remove(this.f43935a);
    }

    /* renamed from: c */
    public abstract void mo19760c(SharedPreferences.Editor editor, T t);

    /* renamed from: d */
    public final void mo49545d(SharedPreferences sharedPreferences, T t) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        mo19760c(edit, t);
        edit.apply();
    }
}
