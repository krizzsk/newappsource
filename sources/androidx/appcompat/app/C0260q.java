package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p241s0.C6313h;

/* renamed from: androidx.appcompat.app.q */
public class C0260q {

    /* renamed from: b */
    public static final Class<?>[] f748b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f749c = {16843375};

    /* renamed from: d */
    public static final int[] f750d = {16844160};

    /* renamed from: e */
    public static final int[] f751e = {16844156};

    /* renamed from: f */
    public static final int[] f752f = {16844148};

    /* renamed from: g */
    public static final String[] f753g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C6313h<String, Constructor<? extends View>> f754h = new C6313h<>();

    /* renamed from: a */
    public final Object[] f755a = new Object[2];

    /* renamed from: androidx.appcompat.app.q$a */
    public static class C0261a implements View.OnClickListener {

        /* renamed from: b */
        public final View f756b;

        /* renamed from: c */
        public final String f757c;

        /* renamed from: d */
        public Method f758d;

        /* renamed from: e */
        public Context f759e;

        public C0261a(View view, String str) {
            this.f756b = view;
            this.f757c = str;
        }

        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f758d == null) {
                Context context = this.f756b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f757c, new Class[]{View.class})) != null) {
                            this.f758d = method;
                            this.f759e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                }
                int id = this.f756b.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder k = C13555b.m33972k(" with id '");
                    k.append(this.f756b.getContext().getResources().getResourceEntryName(id));
                    k.append("'");
                    str = k.toString();
                }
                StringBuilder k2 = C13555b.m33972k("Could not find method ");
                k2.append(this.f757c);
                k2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                k2.append(this.f756b.getClass());
                k2.append(str);
                throw new IllegalStateException(k2.toString());
            }
            try {
                this.f758d.invoke(this.f759e, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    public AppCompatAutoCompleteTextView mo966a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: b */
    public AppCompatButton mo967b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: c */
    public AppCompatCheckBox mo968c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: d */
    public AppCompatRadioButton mo969d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: e */
    public AppCompatTextView mo970e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: f */
    public final View mo971f(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C6313h<String, Constructor<? extends View>> hVar = f754h;
        Constructor<? extends U> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f748b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f755a);
    }

    /* renamed from: g */
    public final void mo972g(TextView textView, String str) {
        if (textView == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
