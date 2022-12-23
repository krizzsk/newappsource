package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5220f;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.app.h */
public final class C0249h extends C0259p {

    /* renamed from: f */
    public final AlertController f734f = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.h$a */
    public static class C0250a {

        /* renamed from: a */
        public final AlertController.C0216b f735a;

        /* renamed from: b */
        public final int f736b;

        public C0250a(Context context) {
            this(context, C0249h.m488e(0, context));
        }

        public C0249h create() {
            int i;
            C0249h hVar = new C0249h(this.f735a.f599a, this.f736b);
            AlertController.C0216b bVar = this.f735a;
            AlertController alertController = hVar.f734f;
            View view = bVar.f603e;
            if (view != null) {
                alertController.f559C = view;
            } else {
                CharSequence charSequence = bVar.f602d;
                if (charSequence != null) {
                    alertController.f574e = charSequence;
                    TextView textView = alertController.f557A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f601c;
                if (drawable != null) {
                    alertController.f594y = drawable;
                    alertController.f593x = 0;
                    ImageView imageView = alertController.f595z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f595z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f604f;
            if (charSequence2 != null) {
                alertController.f575f = charSequence2;
                TextView textView2 = alertController.f558B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f605g;
            if (charSequence3 != null) {
                alertController.mo805e(-1, charSequence3, bVar.f606h);
            }
            CharSequence charSequence4 = bVar.f607i;
            if (charSequence4 != null) {
                alertController.mo805e(-2, charSequence4, bVar.f608j);
            }
            if (bVar.f611m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f600b.inflate(alertController.f564H, (ViewGroup) null);
                if (bVar.f614p) {
                    i = alertController.f565I;
                } else {
                    i = alertController.f566J;
                }
                ListAdapter listAdapter = bVar.f611m;
                if (listAdapter == null) {
                    listAdapter = new AlertController.C0218d(bVar.f599a, i);
                }
                alertController.f560D = listAdapter;
                alertController.f561E = bVar.f615q;
                if (bVar.f612n != null) {
                    recycleListView.setOnItemClickListener(new C0248g(bVar, alertController));
                }
                if (bVar.f614p) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f576g = recycleListView;
            }
            View view2 = bVar.f613o;
            if (view2 != null) {
                alertController.f577h = view2;
                alertController.f578i = 0;
                alertController.f579j = false;
            }
            hVar.setCancelable(this.f735a.f609k);
            if (this.f735a.f609k) {
                hVar.setCanceledOnTouchOutside(true);
            }
            this.f735a.getClass();
            hVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            this.f735a.getClass();
            hVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f735a.f610l;
            if (onKeyListener != null) {
                hVar.setOnKeyListener(onKeyListener);
            }
            return hVar;
        }

        public Context getContext() {
            return this.f735a.f599a;
        }

        public C0250a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0216b bVar = this.f735a;
            bVar.f607i = bVar.f599a.getText(i);
            this.f735a.f608j = onClickListener;
            return this;
        }

        public C0250a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0216b bVar = this.f735a;
            bVar.f605g = bVar.f599a.getText(i);
            this.f735a.f606h = onClickListener;
            return this;
        }

        public C0250a setTitle(CharSequence charSequence) {
            this.f735a.f602d = charSequence;
            return this;
        }

        public C0250a setView(View view) {
            this.f735a.f613o = view;
            return this;
        }

        public C0250a(Context context, int i) {
            this.f735a = new AlertController.C0216b(new ContextThemeWrapper(context, C0249h.m488e(i, context)));
            this.f736b = i;
        }
    }

    public C0249h(Context context, int i) {
        super(context, m488e(i, context));
    }

    /* renamed from: e */
    public static int m488e(int i, Context context) {
        if (((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5215a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        ListAdapter listAdapter;
        int i3;
        int i4;
        View view;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f734f;
        if (alertController.f563G == 0) {
            i = alertController.f562F;
        } else {
            i = alertController.f562F;
        }
        alertController.f571b.setContentView(i);
        View findViewById2 = alertController.f572c.findViewById(C5220f.parentPanel);
        int i5 = C5220f.topPanel;
        View findViewById3 = findViewById2.findViewById(i5);
        int i6 = C5220f.contentPanel;
        View findViewById4 = findViewById2.findViewById(i6);
        int i7 = C5220f.buttonPanel;
        View findViewById5 = findViewById2.findViewById(i7);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C5220f.customPanel);
        View view2 = alertController.f577h;
        View view3 = null;
        int i8 = 0;
        if (view2 == null) {
            if (alertController.f578i != 0) {
                view2 = LayoutInflater.from(alertController.f570a).inflate(alertController.f578i, viewGroup, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !AlertController.m379a(view2)) {
            alertController.f572c.setFlags(SQLiteDatabase.OPEN_SHAREDCACHE, SQLiteDatabase.OPEN_SHAREDCACHE);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f572c.findViewById(C5220f.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f579j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f576g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(i5);
        View findViewById7 = viewGroup.findViewById(i6);
        View findViewById8 = viewGroup.findViewById(i7);
        ViewGroup d = AlertController.m382d(findViewById6, findViewById3);
        ViewGroup d2 = AlertController.m382d(findViewById7, findViewById4);
        ViewGroup d3 = AlertController.m382d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f572c.findViewById(C5220f.scrollView);
        alertController.f592w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f592w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d2.findViewById(16908299);
        alertController.f558B = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f575f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f592w.removeView(alertController.f558B);
                if (alertController.f576g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f592w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f592w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f576g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d2.setVisibility(8);
                }
            }
        }
        Button button = (Button) d3.findViewById(16908313);
        alertController.f580k = button;
        button.setOnClickListener(alertController.f569M);
        if (!TextUtils.isEmpty(alertController.f581l) || alertController.f583n != null) {
            alertController.f580k.setText(alertController.f581l);
            Drawable drawable = alertController.f583n;
            if (drawable != null) {
                int i9 = alertController.f573d;
                drawable.setBounds(0, 0, i9, i9);
                alertController.f580k.setCompoundDrawables(alertController.f583n, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f580k.setVisibility(0);
            z2 = true;
        } else {
            alertController.f580k.setVisibility(8);
            z2 = false;
        }
        Button button2 = (Button) d3.findViewById(16908314);
        alertController.f584o = button2;
        button2.setOnClickListener(alertController.f569M);
        if (!TextUtils.isEmpty(alertController.f585p) || alertController.f587r != null) {
            alertController.f584o.setText(alertController.f585p);
            Drawable drawable2 = alertController.f587r;
            if (drawable2 != null) {
                int i11 = alertController.f573d;
                drawable2.setBounds(0, 0, i11, i11);
                alertController.f584o.setCompoundDrawables(alertController.f587r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f584o.setVisibility(0);
            z2 |= true;
        } else {
            alertController.f584o.setVisibility(8);
        }
        Button button3 = (Button) d3.findViewById(16908315);
        alertController.f588s = button3;
        button3.setOnClickListener(alertController.f569M);
        if (!TextUtils.isEmpty(alertController.f589t) || alertController.f591v != null) {
            alertController.f588s.setText(alertController.f589t);
            Drawable drawable3 = alertController.f591v;
            if (drawable3 != null) {
                int i12 = alertController.f573d;
                drawable3.setBounds(0, 0, i12, i12);
                alertController.f588s.setCompoundDrawables(alertController.f591v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f588s.setVisibility(0);
            z2 |= true;
        } else {
            alertController.f588s.setVisibility(8);
        }
        Context context = alertController.f570a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5215a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                AlertController.m380b(alertController.f580k);
            } else if (z2) {
                AlertController.m380b(alertController.f584o);
            } else if (z2) {
                AlertController.m380b(alertController.f588s);
            }
        }
        if (z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            d3.setVisibility(8);
        }
        if (alertController.f559C != null) {
            d.addView(alertController.f559C, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f572c.findViewById(C5220f.title_template).setVisibility(8);
        } else {
            alertController.f595z = (ImageView) alertController.f572c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f574e)) || !alertController.f567K) {
                alertController.f572c.findViewById(C5220f.title_template).setVisibility(8);
                alertController.f595z.setVisibility(8);
                d.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f572c.findViewById(C5220f.alertTitle);
                alertController.f557A = textView2;
                textView2.setText(alertController.f574e);
                int i13 = alertController.f593x;
                if (i13 != 0) {
                    alertController.f595z.setImageResource(i13);
                } else {
                    Drawable drawable4 = alertController.f594y;
                    if (drawable4 != null) {
                        alertController.f595z.setImageDrawable(drawable4);
                    } else {
                        alertController.f557A.setPadding(alertController.f595z.getPaddingLeft(), alertController.f595z.getPaddingTop(), alertController.f595z.getPaddingRight(), alertController.f595z.getPaddingBottom());
                        alertController.f595z.setVisibility(8);
                    }
                }
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (d == null || d.getVisibility() == 8) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (d3.getVisibility() != 8) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 && (findViewById = d2.findViewById(C5220f.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f592w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f575f == null && alertController.f576g == null) {
                view = null;
            } else {
                view = d.findViewById(C5220f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = d2.findViewById(C5220f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f576g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            if (!z6 || i2 == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i2 != 0) {
                    i3 = recycleListView.getPaddingTop();
                } else {
                    i3 = recycleListView.f596b;
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (z6) {
                    i4 = recycleListView.getPaddingBottom();
                } else {
                    i4 = recycleListView.f597c;
                }
                recycleListView.setPadding(paddingLeft, i3, paddingRight, i4);
            } else {
                recycleListView.getClass();
            }
        }
        if (!z5) {
            View view4 = alertController.f576g;
            if (view4 == null) {
                view4 = alertController.f592w;
            }
            if (view4 != null) {
                if (z6) {
                    i8 = 2;
                }
                int i14 = i2 | i8;
                View findViewById10 = alertController.f572c.findViewById(C5220f.scrollIndicatorUp);
                View findViewById11 = alertController.f572c.findViewById(C5220f.scrollIndicatorDown);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 23) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    if (i15 >= 23) {
                        C6333d0.C6344j.m15113d(view4, i14, 3);
                    }
                    if (findViewById10 != null) {
                        d2.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        d2.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i14 & 1) == 0) {
                        d2.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 == null || (i14 & 2) != 0) {
                        view3 = findViewById11;
                    } else {
                        d2.removeView(findViewById11);
                    }
                    if (!(findViewById10 == null && view3 == null)) {
                        if (alertController.f575f != null) {
                            alertController.f592w.setOnScrollChangeListener(new C0244c(findViewById10, view3));
                            alertController.f592w.post(new C0245d(alertController, findViewById10, view3));
                        } else {
                            AlertController.RecycleListView recycleListView2 = alertController.f576g;
                            if (recycleListView2 != null) {
                                recycleListView2.setOnScrollListener(new C0246e(findViewById10, view3));
                                alertController.f576g.post(new C0247f(alertController, findViewById10, view3));
                            } else {
                                if (findViewById10 != null) {
                                    d2.removeView(findViewById10);
                                }
                                if (view3 != null) {
                                    d2.removeView(view3);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController.RecycleListView recycleListView3 = alertController.f576g;
        if (recycleListView3 != null && (listAdapter = alertController.f560D) != null) {
            recycleListView3.setAdapter(listAdapter);
            int i16 = alertController.f561E;
            if (i16 > -1) {
                recycleListView3.setItemChecked(i16, true);
                recycleListView3.setSelection(i16);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f734f.f592w;
        if (nestedScrollView == null || !nestedScrollView.mo3459e(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f734f.f592w;
        if (nestedScrollView == null || !nestedScrollView.mo3459e(keyEvent)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f734f;
        alertController.f574e = charSequence;
        TextView textView = alertController.f557A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
