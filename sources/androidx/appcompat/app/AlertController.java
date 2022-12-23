package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p114i.C5215a;
import p114i.C5224j;

public final class AlertController {

    /* renamed from: A */
    public TextView f557A;

    /* renamed from: B */
    public TextView f558B;

    /* renamed from: C */
    public View f559C;

    /* renamed from: D */
    public ListAdapter f560D;

    /* renamed from: E */
    public int f561E = -1;

    /* renamed from: F */
    public int f562F;

    /* renamed from: G */
    public int f563G;

    /* renamed from: H */
    public int f564H;

    /* renamed from: I */
    public int f565I;

    /* renamed from: J */
    public int f566J;

    /* renamed from: K */
    public boolean f567K;

    /* renamed from: L */
    public C0217c f568L;

    /* renamed from: M */
    public final C0215a f569M = new C0215a();

    /* renamed from: a */
    public final Context f570a;

    /* renamed from: b */
    public final C0259p f571b;

    /* renamed from: c */
    public final Window f572c;

    /* renamed from: d */
    public final int f573d;

    /* renamed from: e */
    public CharSequence f574e;

    /* renamed from: f */
    public CharSequence f575f;

    /* renamed from: g */
    public RecycleListView f576g;

    /* renamed from: h */
    public View f577h;

    /* renamed from: i */
    public int f578i;

    /* renamed from: j */
    public boolean f579j = false;

    /* renamed from: k */
    public Button f580k;

    /* renamed from: l */
    public CharSequence f581l;

    /* renamed from: m */
    public Message f582m;

    /* renamed from: n */
    public Drawable f583n;

    /* renamed from: o */
    public Button f584o;

    /* renamed from: p */
    public CharSequence f585p;

    /* renamed from: q */
    public Message f586q;

    /* renamed from: r */
    public Drawable f587r;

    /* renamed from: s */
    public Button f588s;

    /* renamed from: t */
    public CharSequence f589t;

    /* renamed from: u */
    public Message f590u;

    /* renamed from: v */
    public Drawable f591v;

    /* renamed from: w */
    public NestedScrollView f592w;

    /* renamed from: x */
    public int f593x = 0;

    /* renamed from: y */
    public Drawable f594y;

    /* renamed from: z */
    public ImageView f595z;

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f596b;

        /* renamed from: c */
        public final int f597c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.RecycleListView);
            this.f597c = obtainStyledAttributes.getDimensionPixelOffset(C5224j.RecycleListView_paddingBottomNoButtons, -1);
            this.f596b = obtainStyledAttributes.getDimensionPixelOffset(C5224j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0215a implements View.OnClickListener {
        public C0215a() {
        }

        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f580k && (message4 = alertController.f582m) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f584o && (message3 = alertController.f586q) != null) {
                message = Message.obtain(message3);
            } else if (view != alertController.f588s || (message2 = alertController.f590u) == null) {
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f568L.obtainMessage(1, alertController2.f571b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0216b {

        /* renamed from: a */
        public final Context f599a;

        /* renamed from: b */
        public final LayoutInflater f600b;

        /* renamed from: c */
        public Drawable f601c;

        /* renamed from: d */
        public CharSequence f602d;

        /* renamed from: e */
        public View f603e;

        /* renamed from: f */
        public CharSequence f604f;

        /* renamed from: g */
        public CharSequence f605g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f606h;

        /* renamed from: i */
        public CharSequence f607i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f608j;

        /* renamed from: k */
        public boolean f609k;

        /* renamed from: l */
        public DialogInterface.OnKeyListener f610l;

        /* renamed from: m */
        public ListAdapter f611m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f612n;

        /* renamed from: o */
        public View f613o;

        /* renamed from: p */
        public boolean f614p;

        /* renamed from: q */
        public int f615q = -1;

        public C0216b(ContextThemeWrapper contextThemeWrapper) {
            this.f599a = contextThemeWrapper;
            this.f609k = true;
            this.f600b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C0217c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f616a;

        public C0217c(DialogInterface dialogInterface) {
            this.f616a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f616a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0218d extends ArrayAdapter<CharSequence> {
        public C0218d(Context context, int i) {
            super(context, i, 16908308, (Object[]) null);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0259p pVar, Window window) {
        this.f570a = context;
        this.f571b = pVar;
        this.f572c = window;
        this.f568L = new C0217c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C5224j.AlertDialog, C5215a.alertDialogStyle, 0);
        this.f562F = obtainStyledAttributes.getResourceId(C5224j.AlertDialog_android_layout, 0);
        this.f563G = obtainStyledAttributes.getResourceId(C5224j.AlertDialog_buttonPanelSideLayout, 0);
        this.f564H = obtainStyledAttributes.getResourceId(C5224j.AlertDialog_listLayout, 0);
        obtainStyledAttributes.getResourceId(C5224j.AlertDialog_multiChoiceItemLayout, 0);
        this.f565I = obtainStyledAttributes.getResourceId(C5224j.AlertDialog_singleChoiceItemLayout, 0);
        this.f566J = obtainStyledAttributes.getResourceId(C5224j.AlertDialog_listItemLayout, 0);
        this.f567K = obtainStyledAttributes.getBoolean(C5224j.AlertDialog_showTitle, true);
        this.f573d = obtainStyledAttributes.getDimensionPixelSize(C5224j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        pVar.mo959c().mo887v(1);
    }

    /* renamed from: a */
    public static boolean m379a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m379a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m380b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public static void m381c(View view, View view2, View view3) {
        int i;
        int i2 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    /* renamed from: d */
    public static ViewGroup m382d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: e */
    public final void mo805e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.f568L.obtainMessage(i, onClickListener);
        } else {
            message = null;
        }
        if (i == -3) {
            this.f589t = charSequence;
            this.f590u = message;
            this.f591v = null;
        } else if (i == -2) {
            this.f585p = charSequence;
            this.f586q = message;
            this.f587r = null;
        } else if (i == -1) {
            this.f581l = charSequence;
            this.f582m = message;
            this.f583n = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
