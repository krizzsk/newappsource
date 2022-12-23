package com.veriff.sdk.camera.core;

import android.util.Rational;
import mf0.C24361g;

public final class ViewPort {
    private Rational mAspectRatio;
    private int mLayoutDirection;
    private int mRotation;
    private int mScaleType;

    public static final class Builder {
        private final Rational mAspectRatio;
        private int mLayoutDirection = 0;
        private final int mRotation;
        private int mScaleType = 1;

        public Builder(Rational rational, int i) {
            this.mAspectRatio = rational;
            this.mRotation = i;
        }

        public ViewPort build() {
            C24361g.m61185s(this.mAspectRatio, "The crop aspect ratio must be set.");
            return new ViewPort(this.mScaleType, this.mAspectRatio, this.mRotation, this.mLayoutDirection);
        }

        public Builder setLayoutDirection(int i) {
            this.mLayoutDirection = i;
            return this;
        }

        public Builder setScaleType(int i) {
            this.mScaleType = i;
            return this;
        }
    }

    public ViewPort(int i, Rational rational, int i2, int i3) {
        this.mScaleType = i;
        this.mAspectRatio = rational;
        this.mRotation = i2;
        this.mLayoutDirection = i3;
    }

    public Rational getAspectRatio() {
        return this.mAspectRatio;
    }

    public int getLayoutDirection() {
        return this.mLayoutDirection;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getScaleType() {
        return this.mScaleType;
    }
}
