package qa0;

import com.jhlabs.map.Point2D;
import com.jhlabs.map.proj.Projection;
import com.jhlabs.map.proj.ProjectionFactory;
import com.nutiteq.components.MapPos;

/* renamed from: qa0.b */
public abstract class C13044b {

    /* renamed from: a */
    public final Projection f32265a;

    /* renamed from: b */
    public double f32266b;

    /* renamed from: c */
    public double f32267c;

    /* renamed from: d */
    public double f32268d;

    /* renamed from: e */
    public double f32269e;

    /* renamed from: f */
    public final C13045a f32270f = new C13045a();

    /* renamed from: g */
    public final C13045a f32271g = new C13045a();

    /* renamed from: qa0.b$a */
    public static class C13045a extends ThreadLocal<Point2D.Double> {
        public final Object initialValue() {
            return new Point2D.Double();
        }
    }

    public C13044b(String[] strArr) {
        this.f32265a = ProjectionFactory.fromPROJ4Specification(strArr);
        this.f32266b = 0.0d;
        this.f32267c = 0.0d;
        this.f32268d = 0.024953202336653373d;
        this.f32269e = 0.024953202336653373d;
    }

    /* renamed from: a */
    public final MapPos mo39928a(double d, double d2) {
        return new MapPos((d / this.f32268d) - this.f32266b, (d2 / this.f32269e) - this.f32267c);
    }

    /* renamed from: b */
    public final MapPos mo39929b(double d, double d2) {
        if (this.f32265a.toString().equals("Null")) {
            return new MapPos(d, d2);
        }
        Point2D.Double doubleR = (Point2D.Double) this.f32270f.get();
        doubleR.f36952x = d;
        doubleR.f36953y = d2;
        Point2D.Double doubleR2 = (Point2D.Double) this.f32271g.get();
        this.f32265a.transform(doubleR, doubleR2);
        return new MapPos(doubleR2.f36952x, doubleR2.f36953y);
    }

    /* renamed from: c */
    public final MapPos mo39930c(double d, double d2) {
        return new MapPos((d + this.f32266b) * this.f32268d, (d2 + this.f32267c) * this.f32269e);
    }
}
