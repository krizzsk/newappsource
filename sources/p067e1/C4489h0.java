package p067e1;

import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: e1.h0 */
public final class C4489h0 {

    /* renamed from: a */
    public CharSequence f15563a;

    /* renamed from: b */
    public IconCompat f15564b;

    /* renamed from: c */
    public String f15565c;

    /* renamed from: d */
    public String f15566d;

    /* renamed from: e */
    public boolean f15567e;

    /* renamed from: f */
    public boolean f15568f;

    /* renamed from: e1.h0$a */
    public static class C4490a {
        /* renamed from: a */
        public static C4489h0 m11714a(Person person) {
            IconCompat iconCompat;
            C4491b bVar = new C4491b();
            bVar.f15569a = person.getName();
            IconCompat iconCompat2 = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f3343k;
                icon.getClass();
                int c = IconCompat.C0774a.m2346c(icon);
                if (c != 2) {
                    if (c == 4) {
                        Uri d = IconCompat.C0774a.m2347d(icon);
                        d.getClass();
                        String uri = d.toString();
                        uri.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f3345b = uri;
                    } else if (c != 6) {
                        iconCompat2 = new IconCompat(-1);
                        iconCompat2.f3345b = icon;
                    } else {
                        Uri d2 = IconCompat.C0774a.m2347d(icon);
                        d2.getClass();
                        String uri2 = d2.toString();
                        uri2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.f3345b = uri2;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.m2335b((Resources) null, IconCompat.C0774a.m2345b(icon), IconCompat.C0774a.m2344a(icon));
                }
            }
            bVar.f15570b = iconCompat2;
            bVar.f15571c = person.getUri();
            bVar.f15572d = person.getKey();
            bVar.f15573e = person.isBot();
            bVar.f15574f = person.isImportant();
            return new C4489h0(bVar);
        }

        /* renamed from: b */
        public static Person m11715b(C4489h0 h0Var) {
            Person.Builder name = new Person.Builder().setName(h0Var.f15563a);
            IconCompat iconCompat = h0Var.f15564b;
            Icon icon = null;
            if (iconCompat != null) {
                icon = iconCompat.mo3433j((Context) null);
            }
            return name.setIcon(icon).setUri(h0Var.f15565c).setKey(h0Var.f15566d).setBot(h0Var.f15567e).setImportant(h0Var.f15568f).build();
        }
    }

    /* renamed from: e1.h0$b */
    public static class C4491b {

        /* renamed from: a */
        public CharSequence f15569a;

        /* renamed from: b */
        public IconCompat f15570b;

        /* renamed from: c */
        public String f15571c;

        /* renamed from: d */
        public String f15572d;

        /* renamed from: e */
        public boolean f15573e;

        /* renamed from: f */
        public boolean f15574f;
    }

    public C4489h0(C4491b bVar) {
        this.f15563a = bVar.f15569a;
        this.f15564b = bVar.f15570b;
        this.f15565c = bVar.f15571c;
        this.f15566d = bVar.f15572d;
        this.f15567e = bVar.f15573e;
        this.f15568f = bVar.f15574f;
    }
}
