package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.appboy.support.AppboyImageUtils;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5218d;
import p114i.C5220f;
import p114i.C5221g;
import p114i.C5222h;
import p114i.C5224j;
import p175n.C5767b;
import p242s1.C6333d0;
import p293w1.C6963a;

public class SearchView extends LinearLayoutCompat implements C5767b {

    /* renamed from: y0 */
    public static final C0368o f1257y0 = (Build.VERSION.SDK_INT < 29 ? new C0368o() : null);

    /* renamed from: A */
    public Rect f1258A;

    /* renamed from: B */
    public Rect f1259B;

    /* renamed from: C */
    public int[] f1260C;

    /* renamed from: D */
    public int[] f1261D;

    /* renamed from: E */
    public final ImageView f1262E;

    /* renamed from: F */
    public final Drawable f1263F;

    /* renamed from: G */
    public final int f1264G;

    /* renamed from: H */
    public final int f1265H;

    /* renamed from: I */
    public final Intent f1266I;

    /* renamed from: J */
    public final Intent f1267J;

    /* renamed from: K */
    public final CharSequence f1268K;

    /* renamed from: L */
    public C0366m f1269L;

    /* renamed from: M */
    public View.OnFocusChangeListener f1270M;

    /* renamed from: N */
    public View.OnClickListener f1271N;

    /* renamed from: O */
    public boolean f1272O;

    /* renamed from: P */
    public boolean f1273P;

    /* renamed from: Q */
    public C6963a f1274Q;

    /* renamed from: R */
    public boolean f1275R;

    /* renamed from: S */
    public CharSequence f1276S;

    /* renamed from: T */
    public boolean f1277T;

    /* renamed from: U */
    public boolean f1278U;

    /* renamed from: l0 */
    public int f1279l0;

    /* renamed from: m0 */
    public boolean f1280m0;

    /* renamed from: n0 */
    public String f1281n0;

    /* renamed from: o0 */
    public CharSequence f1282o0;

    /* renamed from: p0 */
    public boolean f1283p0;

    /* renamed from: q */
    public final SearchAutoComplete f1284q;

    /* renamed from: q0 */
    public int f1285q0;

    /* renamed from: r */
    public final View f1286r;

    /* renamed from: r0 */
    public SearchableInfo f1287r0;

    /* renamed from: s */
    public final View f1288s;

    /* renamed from: s0 */
    public Bundle f1289s0;

    /* renamed from: t */
    public final View f1290t;

    /* renamed from: t0 */
    public final C0355b f1291t0;

    /* renamed from: u */
    public final ImageView f1292u;

    /* renamed from: u0 */
    public C0356c f1293u0;

    /* renamed from: v */
    public final ImageView f1294v;

    /* renamed from: v0 */
    public final WeakHashMap<String, Drawable.ConstantState> f1295v0;

    /* renamed from: w */
    public final ImageView f1296w;

    /* renamed from: w0 */
    public C0360g f1297w0;

    /* renamed from: x */
    public final ImageView f1298x;

    /* renamed from: x0 */
    public C0354a f1299x0;

    /* renamed from: y */
    public final View f1300y;

    /* renamed from: z */
    public C0369p f1301z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0352a();

        /* renamed from: b */
        public boolean f1302b;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        public class C0352a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("SearchView.SavedState{");
            k.append(Integer.toHexString(System.identityHashCode(this)));
            k.append(" isIconified=");
            return C25541a.m63885p(k, this.f1302b, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1302b));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1302b = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: f */
        public int f1303f;

        /* renamed from: g */
        public SearchView f1304g;

        /* renamed from: h */
        public boolean f1305h;

        /* renamed from: i */
        public final C0353a f1306i;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0353a implements Runnable {
            public C0353a() {
            }

            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f1305h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f1305h = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C5215a.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return 192;
        }

        /* renamed from: a */
        public final void mo1817a() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0364k.m881b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0368o oVar = SearchView.f1257y0;
            oVar.getClass();
            C0368o.m887a();
            Method method = oVar.f1320c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            return this.f1303f <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1305h) {
                removeCallbacks(this.f1306i);
                post(this.f1306i);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f1304g;
            searchView.mo1811x(searchView.f1273P);
            searchView.post(searchView.f1291t0);
            if (searchView.f1284q.hasFocus()) {
                searchView.mo1776l();
            }
        }

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1304g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1304g.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f1305h = true;
                Context context = getContext();
                C0368o oVar = SearchView.f1257y0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    mo1817a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1305h = false;
                removeCallbacks(this.f1306i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1305h = false;
                removeCallbacks(this.f1306i);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1305h = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1304g = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1303f = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1306i = new C0353a();
            this.f1303f = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0354a implements TextWatcher {
        public C0354a() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f1284q.getText();
            searchView.f1282o0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.mo1810w(z);
            boolean z2 = !z;
            int i4 = 8;
            if (searchView.f1280m0 && !searchView.f1273P && z2) {
                searchView.f1294v.setVisibility(8);
                i4 = 0;
            }
            searchView.f1298x.setVisibility(i4);
            searchView.mo1790s();
            searchView.mo1809v();
            if (searchView.f1269L != null && !TextUtils.equals(charSequence, searchView.f1281n0)) {
                searchView.f1269L.mo1843A(charSequence.toString());
            }
            searchView.f1281n0 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0355b implements Runnable {
        public C0355b() {
        }

        public final void run() {
            SearchView.this.mo1807t();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0356c implements Runnable {
        public C0356c() {
        }

        public final void run() {
            C6963a aVar = SearchView.this.f1274Q;
            if (aVar instanceof C0387b1) {
                aVar.mo2042b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0357d implements View.OnFocusChangeListener {
        public C0357d() {
        }

        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1270M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0358e implements View.OnLayoutChangeListener {
        public C0358e() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i11;
            SearchView searchView = SearchView.this;
            if (searchView.f1300y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f1288s.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = C0453r1.m1265a(searchView);
                if (searchView.f1272O) {
                    i9 = resources.getDimensionPixelSize(C5218d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C5218d.abc_dropdownitem_icon_width);
                } else {
                    i9 = 0;
                }
                searchView.f1284q.getDropDownBackground().getPadding(rect);
                if (a) {
                    i11 = -rect.left;
                } else {
                    i11 = paddingLeft - (rect.left + i9);
                }
                searchView.f1284q.setDropDownHorizontalOffset(i11);
                searchView.f1284q.setDropDownWidth((((searchView.f1300y.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0359f implements View.OnClickListener {
        public C0359f() {
        }

        public final void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            if (view == searchView.f1292u) {
                searchView.mo1811x(false);
                searchView.f1284q.requestFocus();
                searchView.f1284q.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f1271N;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.f1296w) {
                searchView.mo1777m();
            } else if (view == searchView.f1294v) {
                searchView.mo1787q();
            } else if (view == searchView.f1298x) {
                SearchableInfo searchableInfo = searchView.f1287r0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f1266I);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.mo1775k(searchView.f1267J, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            } else if (view == searchView.f1284q) {
                searchView.mo1776l();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0360g implements View.OnKeyListener {
        public C0360g() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            boolean z;
            int i2;
            SearchView searchView = SearchView.this;
            if (searchView.f1287r0 == null) {
                return false;
            }
            if (!searchView.f1284q.isPopupShowing() || SearchView.this.f1284q.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(SearchView.this.f1284q.getText()) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.getContext().startActivity(searchView2.mo1774j("android.intent.action.SEARCH", (Uri) null, (String) null, searchView2.f1284q.getText().toString()));
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f1287r0 == null || searchView3.f1274Q == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.mo1778n(searchView3.f1284q.getListSelection());
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = searchView3.f1284q.length();
                }
                searchView3.f1284q.setSelection(i2);
                searchView3.f1284q.setListSelection(0);
                searchView3.f1284q.clearListSelection();
                searchView3.f1284q.mo1817a();
                return true;
            } else if (i != 19) {
                return false;
            } else {
                searchView3.f1284q.getListSelection();
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0361h implements TextView.OnEditorActionListener {
        public C0361h() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1787q();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0362i implements AdapterView.OnItemClickListener {
        public C0362i() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1778n(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0363j implements AdapterView.OnItemSelectedListener {
        public C0363j() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1779o(i);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0364k {
        /* renamed from: a */
        public static void m880a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        public static void m881b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0365l {
        /* renamed from: a */
        boolean mo1842a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0366m {
        /* renamed from: A */
        void mo1843A(String str);

        /* renamed from: J */
        boolean mo1844J(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0367n {
        /* renamed from: a */
        boolean mo1845a();

        /* renamed from: b */
        boolean mo1846b();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0368o {

        /* renamed from: a */
        public Method f1318a = null;

        /* renamed from: b */
        public Method f1319b = null;

        /* renamed from: c */
        public Method f1320c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0368o() {
            m887a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1318a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1319b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1320c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m887a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0369p extends TouchDelegate {

        /* renamed from: a */
        public final View f1321a;

        /* renamed from: b */
        public final Rect f1322b;

        /* renamed from: c */
        public final Rect f1323c;

        /* renamed from: d */
        public final Rect f1324d;

        /* renamed from: e */
        public final int f1325e;

        /* renamed from: f */
        public boolean f1326f;

        public C0369p(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f1325e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f1322b = rect3;
            Rect rect4 = new Rect();
            this.f1324d = rect4;
            Rect rect5 = new Rect();
            this.f1323c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.f1321a = searchAutoComplete;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1326f
                r7.f1326f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1326f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1324d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1322b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1326f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f1323c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f1321a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1321a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f1323c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f1321a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0369p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C5218d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C5218d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int i;
        this.f1284q.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f1284q;
        if (TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        searchAutoComplete.setSelection(i);
    }

    public final void clearFocus() {
        this.f1278U = true;
        super.clearFocus();
        this.f1284q.clearFocus();
        this.f1284q.setImeVisibility(false);
        this.f1278U = false;
    }

    public int getImeOptions() {
        return this.f1284q.getImeOptions();
    }

    public int getInputType() {
        return this.f1284q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1279l0;
    }

    public CharSequence getQuery() {
        return this.f1284q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1276S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1287r0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f1268K;
        }
        return getContext().getText(this.f1287r0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1265H;
    }

    public int getSuggestionRowLayout() {
        return this.f1264G;
    }

    public C6963a getSuggestionsAdapter() {
        return this.f1274Q;
    }

    /* renamed from: j */
    public final Intent mo1774j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1282o0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1289s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1287r0.getSearchActivity());
        return intent;
    }

    /* renamed from: k */
    public final Intent mo1775k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1289s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: l */
    public final void mo1776l() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0364k.m880a(this.f1284q);
            return;
        }
        C0368o oVar = f1257y0;
        SearchAutoComplete searchAutoComplete = this.f1284q;
        oVar.getClass();
        C0368o.m887a();
        Method method = oVar.f1318a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0368o oVar2 = f1257y0;
        SearchAutoComplete searchAutoComplete2 = this.f1284q;
        oVar2.getClass();
        C0368o.m887a();
        Method method2 = oVar2.f1319b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: m */
    public final void mo1777m() {
        if (!TextUtils.isEmpty(this.f1284q.getText())) {
            this.f1284q.setText("");
            this.f1284q.requestFocus();
            this.f1284q.setImeVisibility(true);
        } else if (this.f1272O) {
            clearFocus();
            mo1811x(true);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.getPosition();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007f */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1778n(int r7) {
        /*
            r6 = this;
            r0 = 0
            w1.a r1 = r6.f1274Q
            android.database.Cursor r1 = r1.f21721d
            if (r1 == 0) goto L_0x0092
            boolean r7 = r1.moveToPosition(r7)
            if (r7 == 0) goto L_0x0092
            r7 = 0
            java.lang.String r2 = "suggest_intent_action"
            int r3 = androidx.appcompat.widget.C0387b1.f1441y     // Catch:{ RuntimeException -> 0x007f }
            int r2 = r1.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r2 = androidx.appcompat.widget.C0387b1.m956i(r1, r2)     // Catch:{ RuntimeException -> 0x007f }
            if (r2 != 0) goto L_0x0022
            android.app.SearchableInfo r2 = r6.f1287r0     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x007f }
        L_0x0022:
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = "android.intent.action.SEARCH"
        L_0x0026:
            java.lang.String r3 = "suggest_intent_data"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = androidx.appcompat.widget.C0387b1.m956i(r1, r3)     // Catch:{ RuntimeException -> 0x007f }
            if (r3 != 0) goto L_0x0038
            android.app.SearchableInfo r3 = r6.f1287r0     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = r3.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x007f }
        L_0x0038:
            if (r3 == 0) goto L_0x005e
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r4 = androidx.appcompat.widget.C0387b1.m956i(r1, r4)     // Catch:{ RuntimeException -> 0x007f }
            if (r4 == 0) goto L_0x005e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x007f }
            r5.<init>()     // Catch:{ RuntimeException -> 0x007f }
            r5.append(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = android.net.Uri.encode(r4)     // Catch:{ RuntimeException -> 0x007f }
            r5.append(r3)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r3 = r5.toString()     // Catch:{ RuntimeException -> 0x007f }
        L_0x005e:
            if (r3 != 0) goto L_0x0062
            r3 = r7
            goto L_0x0066
        L_0x0062:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ RuntimeException -> 0x007f }
        L_0x0066:
            java.lang.String r4 = "suggest_intent_query"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r4 = androidx.appcompat.widget.C0387b1.m956i(r1, r4)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r5 = "suggest_intent_extra_data"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ RuntimeException -> 0x007f }
            java.lang.String r5 = androidx.appcompat.widget.C0387b1.m956i(r1, r5)     // Catch:{ RuntimeException -> 0x007f }
            android.content.Intent r7 = r6.mo1774j(r2, r3, r5, r4)     // Catch:{ RuntimeException -> 0x007f }
            goto L_0x0084
        L_0x007f:
            r1.getPosition()     // Catch:{ RuntimeException -> 0x0083 }
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            if (r7 != 0) goto L_0x0087
            goto L_0x0092
        L_0x0087:
            android.content.Context r1 = r6.getContext()     // Catch:{ RuntimeException -> 0x008f }
            r1.startActivity(r7)     // Catch:{ RuntimeException -> 0x008f }
            goto L_0x0092
        L_0x008f:
            r7.toString()
        L_0x0092:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1284q
            r7.setImeVisibility(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1284q
            r7.dismissDropDown()
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo1778n(int):boolean");
    }

    /* renamed from: o */
    public final void mo1779o(int i) {
        Editable text = this.f1284q.getText();
        Cursor cursor = this.f1274Q.f21721d;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                String c = this.f1274Q.mo2043c(cursor);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public final void onActionViewCollapsed() {
        mo1788r("", false);
        clearFocus();
        mo1811x(true);
        this.f1284q.setImeOptions(this.f1285q0);
        this.f1283p0 = false;
    }

    public final void onActionViewExpanded() {
        if (!this.f1283p0) {
            this.f1283p0 = true;
            int imeOptions = this.f1284q.getImeOptions();
            this.f1285q0 = imeOptions;
            this.f1284q.setImeOptions(imeOptions | AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
            this.f1284q.setText("");
            setIconified(false);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1291t0);
        post(this.f1293u0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f1284q;
            Rect rect = this.f1258A;
            searchAutoComplete.getLocationInWindow(this.f1260C);
            getLocationInWindow(this.f1261D);
            int[] iArr = this.f1260C;
            int i5 = iArr[1];
            int[] iArr2 = this.f1261D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f1259B;
            Rect rect3 = this.f1258A;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0369p pVar = this.f1301z;
            if (pVar == null) {
                C0369p pVar2 = new C0369p(this.f1259B, this.f1258A, this.f1284q);
                this.f1301z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            Rect rect4 = this.f1259B;
            Rect rect5 = this.f1258A;
            pVar.f1322b.set(rect4);
            pVar.f1324d.set(rect4);
            Rect rect6 = pVar.f1324d;
            int i8 = -pVar.f1325e;
            rect6.inset(i8, i8);
            pVar.f1323c.set(rect5);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f1273P) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1279l0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1279l0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1279l0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo1811x(savedState.f1302b);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1302b = this.f1273P;
        return savedState;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f1291t0);
    }

    /* renamed from: p */
    public final void mo1786p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: q */
    public final void mo1787q() {
        Editable text = this.f1284q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0366m mVar = this.f1269L;
            if (mVar == null || !mVar.mo1844J(text.toString())) {
                if (this.f1287r0 != null) {
                    getContext().startActivity(mo1774j("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
                }
                this.f1284q.setImeVisibility(false);
                this.f1284q.dismissDropDown();
            }
        }
    }

    /* renamed from: r */
    public final void mo1788r(CharSequence charSequence, boolean z) {
        this.f1284q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1284q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1282o0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1787q();
        }
    }

    public final boolean requestFocus(int i, Rect rect) {
        if (this.f1278U || !isFocusable()) {
            return false;
        }
        if (this.f1273P) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1284q.requestFocus(i, rect);
        if (requestFocus) {
            mo1811x(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public final void mo1790s() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1284q.getText());
        int i = 0;
        if (!z2 && (!this.f1272O || this.f1283p0)) {
            z = false;
        }
        ImageView imageView = this.f1296w;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1296w.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1289s0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1777m();
            return;
        }
        mo1811x(false);
        this.f1284q.requestFocus();
        this.f1284q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1271N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1272O != z) {
            this.f1272O = z;
            mo1811x(z);
            mo1808u();
        }
    }

    public void setImeOptions(int i) {
        this.f1284q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1284q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1279l0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0365l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1270M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0366m mVar) {
        this.f1269L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1271N = onClickListener;
    }

    public void setOnSuggestionListener(C0367n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1276S = charSequence;
        mo1808u();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f1277T = z;
        C6963a aVar = this.f1274Q;
        if (aVar instanceof C0387b1) {
            C0387b1 b1Var = (C0387b1) aVar;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            b1Var.f1447q = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, com.moovit.database.sqlite.SQLiteDatabase.OPEN_FULLMUTEX) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1287r0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1284q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1284q
            android.app.SearchableInfo r3 = r6.f1287r0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f1287r0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1287r0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1284q
            r3.setInputType(r7)
            w1.a r7 = r6.f1274Q
            if (r7 == 0) goto L_0x0042
            r7.mo2042b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f1287r0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.b1 r7 = new androidx.appcompat.widget.b1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1287r0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f1295v0
            r7.<init>(r3, r6, r4, r5)
            r6.f1274Q = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1284q
            r3.setAdapter(r7)
            w1.a r7 = r6.f1274Q
            androidx.appcompat.widget.b1 r7 = (androidx.appcompat.widget.C0387b1) r7
            boolean r3 = r6.f1277T
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.f1447q = r3
        L_0x006b:
            r6.mo1808u()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f1287r0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f1287r0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.f1266I
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f1287r0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.f1267J
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r6.f1280m0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1284q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f1273P
            r6.mo1811x(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1275R = z;
        mo1811x(this.f1273P);
    }

    public void setSuggestionsAdapter(C6963a aVar) {
        this.f1274Q = aVar;
        this.f1284q.setAdapter(aVar);
    }

    /* renamed from: t */
    public final void mo1807t() {
        int[] iArr;
        if (this.f1284q.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f1288s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1290t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: u */
    public final void mo1808u() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1284q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f1272O && this.f1263F != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f1263F.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1263F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: v */
    public final void mo1809v() {
        boolean z;
        int i = 0;
        if ((this.f1275R || this.f1280m0) && !this.f1273P) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(this.f1294v.getVisibility() == 0 || this.f1298x.getVisibility() == 0)) {
            i = 8;
        }
        this.f1290t.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f1280m0 == false) goto L_0x0023;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1810w(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f1275R
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f1280m0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f1273P
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f1280m0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f1294v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo1810w(boolean):void");
    }

    /* renamed from: x */
    public final void mo1811x(boolean z) {
        int i;
        int i2;
        int i3;
        this.f1273P = z;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f1284q.getText());
        this.f1292u.setVisibility(i);
        mo1810w(z2);
        View view = this.f1286r;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f1262E.getDrawable() == null || this.f1272O) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.f1262E.setVisibility(i3);
        mo1790s();
        boolean z3 = !z2;
        if (this.f1280m0 && !this.f1273P && z3) {
            this.f1294v.setVisibility(8);
            i4 = 0;
        }
        this.f1298x.setVisibility(i4);
        mo1809v();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        this.f1258A = new Rect();
        this.f1259B = new Rect();
        this.f1260C = new int[2];
        this.f1261D = new int[2];
        this.f1291t0 = new C0355b();
        this.f1293u0 = new C0356c();
        this.f1295v0 = new WeakHashMap<>();
        C0359f fVar = new C0359f();
        this.f1297w0 = new C0360g();
        C0361h hVar = new C0361h();
        C0362i iVar = new C0362i();
        C0363j jVar = new C0363j();
        this.f1299x0 = new C0354a();
        int[] iArr = C5224j.SearchView;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        C0413h1 h1Var = new C0413h1(context2, obtainStyledAttributes);
        C6333d0.m15028p(this, context, iArr, attributeSet2, obtainStyledAttributes, i2, 0);
        LayoutInflater.from(context).inflate(h1Var.mo2095i(C5224j.SearchView_layout, C5221g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C5220f.search_src_text);
        this.f1284q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1286r = findViewById(C5220f.search_edit_frame);
        View findViewById = findViewById(C5220f.search_plate);
        this.f1288s = findViewById;
        View findViewById2 = findViewById(C5220f.submit_area);
        this.f1290t = findViewById2;
        ImageView imageView = (ImageView) findViewById(C5220f.search_button);
        this.f1292u = imageView;
        ImageView imageView2 = (ImageView) findViewById(C5220f.search_go_btn);
        this.f1294v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C5220f.search_close_btn);
        this.f1296w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C5220f.search_voice_btn);
        this.f1298x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C5220f.search_mag_icon);
        this.f1262E = imageView5;
        C6333d0.C6337d.m15057q(findViewById, h1Var.mo2091e(C5224j.SearchView_queryBackground));
        C6333d0.C6337d.m15057q(findViewById2, h1Var.mo2091e(C5224j.SearchView_submitBackground));
        int i3 = C5224j.SearchView_searchIcon;
        imageView.setImageDrawable(h1Var.mo2091e(i3));
        imageView2.setImageDrawable(h1Var.mo2091e(C5224j.SearchView_goIcon));
        imageView3.setImageDrawable(h1Var.mo2091e(C5224j.SearchView_closeIcon));
        imageView4.setImageDrawable(h1Var.mo2091e(C5224j.SearchView_voiceIcon));
        imageView5.setImageDrawable(h1Var.mo2091e(i3));
        this.f1263F = h1Var.mo2091e(C5224j.SearchView_searchHintIcon);
        C0432l1.m1181a(imageView, getResources().getString(C5222h.abc_searchview_description_search));
        this.f1264G = h1Var.mo2095i(C5224j.SearchView_suggestionRowLayout, C5221g.abc_search_dropdown_item_icons_2line);
        this.f1265H = h1Var.mo2095i(C5224j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1299x0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1297w0);
        searchAutoComplete.setOnFocusChangeListener(new C0357d());
        setIconifiedByDefault(h1Var.mo2087a(C5224j.SearchView_iconifiedByDefault, true));
        int d = h1Var.mo2090d(C5224j.SearchView_android_maxWidth, -1);
        if (d != -1) {
            setMaxWidth(d);
        }
        this.f1268K = h1Var.mo2097k(C5224j.SearchView_defaultQueryHint);
        this.f1276S = h1Var.mo2097k(C5224j.SearchView_queryHint);
        int h = h1Var.mo2094h(C5224j.SearchView_android_imeOptions, -1);
        if (h != -1) {
            setImeOptions(h);
        }
        int h2 = h1Var.mo2094h(C5224j.SearchView_android_inputType, -1);
        if (h2 != -1) {
            setInputType(h2);
        }
        setFocusable(h1Var.mo2087a(C5224j.SearchView_android_focusable, true));
        h1Var.mo2099n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1266I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1267J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1300y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0358e());
        }
        mo1811x(this.f1272O);
        mo1808u();
    }
}
