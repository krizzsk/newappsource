package ja0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.util.time.TimeVehicleLocation;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ja0.h */
public final class C12799h extends RecyclerView.C1133l {

    /* renamed from: b */
    public final int f31640b = 0;

    /* renamed from: c */
    public final int f31641c;

    /* renamed from: d */
    public final int f31642d;

    /* renamed from: e */
    public final int f31643e;

    /* renamed from: f */
    public final Paint f31644f;

    /* renamed from: g */
    public final Paint f31645g;

    /* renamed from: h */
    public final Drawable f31646h;

    /* renamed from: i */
    public final int f31647i;

    /* renamed from: j */
    public final int f31648j;

    /* renamed from: k */
    public final int f31649k;

    /* renamed from: l */
    public final ArrayList f31650l = new ArrayList();

    public C12799h(Context context, int i, int i2, int i3, Drawable drawable, int i4, int i5, int i6, int i7) {
        this.f31641c = i;
        this.f31642d = 0;
        Drawable mutate = drawable.mutate();
        this.f31646h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN));
        this.f31647i = i7;
        this.f31648j = drawable.getIntrinsicWidth() / 2;
        this.f31649k = drawable.getIntrinsicHeight() / 2;
        Paint paint = new Paint(1);
        this.f31644f = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i3);
        float f = UiUtils.m40247f(context.getResources(), 1.0f);
        Paint paint2 = new Paint(1);
        this.f31645g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(i5);
        paint2.setStrokeWidth((float) i6);
        paint2.setShadowLayer(f, BitmapDescriptorFactory.HUE_RED, f, i5);
        this.f31643e = R.id.bottom_view;
    }

    /* renamed from: e */
    public final void mo39640e(Canvas canvas, int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        canvas.drawCircle(f, f2, (float) this.f31647i, this.f31644f);
        canvas.drawCircle(f, f2, (float) this.f31647i, this.f31645g);
        Drawable drawable = this.f31646h;
        int i3 = this.f31648j;
        int i4 = this.f31649k;
        drawable.setBounds(i - i3, i2 - i4, i + i3, i2 + i4);
        this.f31646h.draw(canvas);
    }

    /* renamed from: f */
    public final int mo39641f(View view) {
        View findViewById;
        int height = (view.getHeight() / 2) + view.getTop();
        int i = this.f31643e;
        int i2 = 0;
        if (!(i == 0 || (findViewById = view.findViewById(i)) == null)) {
            i2 = findViewById.getHeight() / 2;
        }
        return height - i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        recyclerView.getClass();
        if (RecyclerView.m3000I(view) >= this.f31640b) {
            if (C15780a.m40269b(recyclerView)) {
                rect.set(this.f31642d, 0, this.f31641c, 0);
            } else {
                rect.set(this.f31641c, 0, this.f31642d, 0);
            }
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        super.onDraw(canvas, recyclerView, xVar);
        if (!this.f31650l.isEmpty()) {
            int childCount = recyclerView.getChildCount();
            boolean b = C15780a.m40269b(recyclerView);
            int i = this.f31641c / 2;
            if (b) {
                i = recyclerView.getWidth() - i;
            }
            int I = RecyclerView.m3000I(recyclerView.getChildAt(0));
            int I2 = RecyclerView.m3000I(recyclerView.getChildAt(childCount - 1));
            Iterator it = this.f31650l.iterator();
            while (it.hasNext()) {
                TimeVehicleLocation.VehicleProgress vehicleProgress = (TimeVehicleLocation.VehicleProgress) it.next();
                int i2 = vehicleProgress.f23929b;
                int i3 = vehicleProgress.f23930c;
                if (i2 >= I && i2 <= I2) {
                    int i4 = i2 - I;
                    int f = mo39641f(recyclerView.getChildAt(i4));
                    if (i3 == 100) {
                        mo39640e(canvas, i, f);
                    } else if (i4 > 0) {
                        int f2 = mo39641f(recyclerView.getChildAt(i4 - 1));
                        mo39640e(canvas, i, (((f - f2) * i3) / 100) + f2);
                    }
                }
            }
        }
    }
}
