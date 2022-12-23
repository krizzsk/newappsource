package p021b2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C0836f;
import mf0.C24361g;

/* renamed from: b2.f */
public final class C1454f {

    /* renamed from: a */
    public final C1456b f5314a;

    /* renamed from: b2.f$a */
    public static class C1455a extends C1456b {

        /* renamed from: a */
        public final TextView f5315a;

        /* renamed from: b */
        public final C1450d f5316b;

        /* renamed from: c */
        public boolean f5317c = true;

        public C1455a(TextView textView) {
            this.f5315a = textView;
            this.f5316b = new C1450d(textView);
        }

        /* renamed from: a */
        public final InputFilter[] mo5782a(InputFilter[] inputFilterArr) {
            if (!this.f5317c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof C1450d) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            for (C1450d dVar : inputFilterArr) {
                if (dVar == this.f5316b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, r0);
            inputFilterArr3[r0] = this.f5316b;
            return inputFilterArr3;
        }

        /* renamed from: b */
        public final boolean mo5783b() {
            return this.f5317c;
        }

        /* renamed from: c */
        public final void mo5784c(boolean z) {
            if (z) {
                this.f5315a.setTransformationMethod(mo5786e(this.f5315a.getTransformationMethod()));
            }
        }

        /* renamed from: d */
        public final void mo5785d(boolean z) {
            this.f5317c = z;
            this.f5315a.setTransformationMethod(mo5786e(this.f5315a.getTransformationMethod()));
            this.f5315a.setFilters(mo5782a(this.f5315a.getFilters()));
        }

        /* renamed from: e */
        public final TransformationMethod mo5786e(TransformationMethod transformationMethod) {
            if (this.f5317c) {
                if (!(transformationMethod instanceof C1460h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    return new C1460h(transformationMethod);
                }
                return transformationMethod;
            } else if (transformationMethod instanceof C1460h) {
                return ((C1460h) transformationMethod).f5324b;
            } else {
                return transformationMethod;
            }
        }
    }

    /* renamed from: b2.f$b */
    public static class C1456b {
        /* renamed from: a */
        public InputFilter[] mo5782a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo5783b() {
            throw null;
        }

        /* renamed from: c */
        public void mo5784c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        public void mo5785d(boolean z) {
            throw null;
        }

        /* renamed from: e */
        public TransformationMethod mo5786e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* renamed from: b2.f$c */
    public static class C1457c extends C1456b {

        /* renamed from: a */
        public final C1455a f5318a;

        public C1457c(TextView textView) {
            this.f5318a = new C1455a(textView);
        }

        /* renamed from: a */
        public final InputFilter[] mo5782a(InputFilter[] inputFilterArr) {
            boolean z;
            if (C0836f.f3491j != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return inputFilterArr;
            }
            return this.f5318a.mo5782a(inputFilterArr);
        }

        /* renamed from: b */
        public final boolean mo5783b() {
            return this.f5318a.f5317c;
        }

        /* renamed from: c */
        public final void mo5784c(boolean z) {
            boolean z2;
            if (C0836f.f3491j != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                this.f5318a.mo5784c(z);
            }
        }

        /* renamed from: d */
        public final void mo5785d(boolean z) {
            boolean z2;
            if (C0836f.f3491j != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f5318a.f5317c = z;
            } else {
                this.f5318a.mo5785d(z);
            }
        }

        /* renamed from: e */
        public final TransformationMethod mo5786e(TransformationMethod transformationMethod) {
            boolean z;
            if (C0836f.f3491j != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return transformationMethod;
            }
            return this.f5318a.mo5786e(transformationMethod);
        }
    }

    public C1454f(TextView textView) {
        C24361g.m61185s(textView, "textView cannot be null");
        this.f5314a = new C1457c(textView);
    }
}
