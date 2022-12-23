package com.jhlabs.map;

public abstract class Rectangle2D {

    public static class Double extends Rectangle2D {

        /* renamed from: h */
        public double f36954h;

        /* renamed from: w */
        public double f36955w;

        /* renamed from: x */
        public double f36956x;

        /* renamed from: y */
        public double f36957y;

        public Double(double d, double d2, double d3, double d4) {
            this.f36956x = d;
            this.f36957y = d2;
            this.f36955w = d3;
            this.f36954h = d4;
        }

        public void add(double d, double d2) {
            double d3 = this.f36956x;
            if (d < d3) {
                this.f36956x = d;
            } else if (d > this.f36955w + d3) {
                this.f36955w = d - d3;
            }
            double d4 = this.f36957y;
            if (d2 < d4) {
                this.f36957y = d2;
            } else if (d2 > this.f36954h + d4) {
                this.f36954h = d2 - d4;
            }
        }

        public double getHeight() {
            return this.f36954h;
        }

        public double getWidth() {
            return this.f36955w;
        }

        public double getX() {
            return this.f36956x;
        }

        public double getY() {
            return this.f36957y;
        }
    }

    public abstract void add(double d, double d2);

    public abstract double getHeight();

    public abstract double getWidth();

    public abstract double getX();

    public abstract double getY();
}
