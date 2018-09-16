package com.abedsako.smoothrecyclerview.Animation;

public class SetEndSmoothAnimation {
    boolean IsWithAlpha;
    boolean IsWithScale;
    boolean IsWithStartDelay;
    float alpha;
    int duration;
    float scaleX;
    float scaleY;
    int startDelay;

    public SetEndSmoothAnimation(float scaleY, float scaleX, float alpha, int duration, int startDelay, boolean isWithStartDelay, boolean isWithScale, boolean isWithAlpha) {
        this.scaleY = scaleY;
        this.scaleX = scaleX;
        this.alpha = alpha;
        this.duration = duration;
        this.startDelay = startDelay;
        this.IsWithStartDelay = isWithStartDelay;
        this.IsWithScale = isWithScale;
        this.IsWithAlpha = isWithAlpha;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public void setScaleY(float scaleY) {
        this.scaleY = scaleY;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public void setScaleX(float scaleX) {
        this.scaleX = scaleX;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getStartDelay() {
        return this.startDelay;
    }

    public void setStartDelay(int startDelay) {
        this.startDelay = startDelay;
    }

    public boolean isWithStartDelay() {
        return this.IsWithStartDelay;
    }

    public void setWithStartDelay(boolean withStartDelay) {
        this.IsWithStartDelay = withStartDelay;
    }

    public boolean isWithScale() {
        return this.IsWithScale;
    }

    public void setWithScale(boolean withScale) {
        this.IsWithScale = withScale;
    }

    public boolean isWithAlpha() {
        return this.IsWithAlpha;
    }

    public void setWithAlpha(boolean withAlpha) {
        this.IsWithAlpha = withAlpha;
    }
}
