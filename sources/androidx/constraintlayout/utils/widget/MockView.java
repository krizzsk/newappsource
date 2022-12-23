package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;

public class MockView extends View {

    /* renamed from: b */
    public Paint f2912b = new Paint();

    /* renamed from: c */
    public Paint f2913c = new Paint();

    /* renamed from: d */
    public Paint f2914d = new Paint();

    /* renamed from: e */
    public boolean f2915e = true;

    /* renamed from: f */
    public boolean f2916f = true;

    /* renamed from: g */
    public String f2917g = null;

    /* renamed from: h */
    public Rect f2918h = new Rect();

    /* renamed from: i */
    public int f2919i = Color.argb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 0, 0, 0);

    /* renamed from: j */
    public int f2920j = Color.argb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 200, 200, 200);

    /* renamed from: k */
    public int f2921k = Color.argb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 50, 50, 50);

    /* renamed from: l */
    public int f2922l = 4;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3089a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo3089a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.MockView_mock_label) {
                    this.f2917g = obtainStyledAttributes.getString(index);
                } else if (index == C0042d.MockView_mock_showDiagonals) {
                    this.f2915e = obtainStyledAttributes.getBoolean(index, this.f2915e);
                } else if (index == C0042d.MockView_mock_diagonalsColor) {
                    this.f2919i = obtainStyledAttributes.getColor(index, this.f2919i);
                } else if (index == C0042d.MockView_mock_labelBackgroundColor) {
                    this.f2921k = obtainStyledAttributes.getColor(index, this.f2921k);
                } else if (index == C0042d.MockView_mock_labelColor) {
                    this.f2920j = obtainStyledAttributes.getColor(index, this.f2920j);
                } else if (index == C0042d.MockView_mock_showLabel) {
                    this.f2916f = obtainStyledAttributes.getBoolean(index, this.f2916f);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2917g == null) {
            try {
                this.f2917g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2912b.setColor(this.f2919i);
        this.f2912b.setAntiAlias(true);
        this.f2913c.setColor(this.f2920j);
        this.f2913c.setAntiAlias(true);
        this.f2914d.setColor(this.f2921k);
        this.f2922l = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * ((float) this.f2922l));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2915e) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2, this.f2912b);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, f2, f3, BitmapDescriptorFactory.HUE_RED, this.f2912b);
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, this.f2912b);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, BitmapDescriptorFactory.HUE_RED, f3, f5, this.f2912b);
            float f6 = f2;
            canvas2.drawLine(f4, f6, BitmapDescriptorFactory.HUE_RED, f5, this.f2912b);
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, f6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f2912b);
        }
        String str = this.f2917g;
        if (str != null && this.f2916f) {
            this.f2913c.getTextBounds(str, 0, str.length(), this.f2918h);
            float width2 = ((float) (width - this.f2918h.width())) / 2.0f;
            float height2 = (((float) (height - this.f2918h.height())) / 2.0f) + ((float) this.f2918h.height());
            this.f2918h.offset((int) width2, (int) height2);
            Rect rect = this.f2918h;
            int i = rect.left;
            int i2 = this.f2922l;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f2918h, this.f2914d);
            canvas.drawText(this.f2917g, width2, height2, this.f2913c);
        }
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3089a(context, attributeSet);
    }
}
