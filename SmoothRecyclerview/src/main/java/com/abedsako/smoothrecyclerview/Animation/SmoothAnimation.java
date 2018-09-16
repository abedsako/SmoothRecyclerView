package com.abedsako.smoothrecyclerview.Animation;

import android.view.View;
import android.view.animation.Animation;

public class SmoothAnimation extends Animation {
    private boolean IsWithAlpha;
    private boolean IsWithScale;
    private boolean IsWithStartDelay;
    private float alpha;
    private int duration;
    private float scaleX;
    private float scaleY;
    private int startDelay;

    public SmoothAnimation(final View view, SetStartSmoothAnimation data) {
        scaleX = data.scaleX;
        scaleY = data.scaleY;
        alpha = data.alpha;
        duration = data.duration;
        startDelay = data.startDelay;
        IsWithAlpha = data.IsWithAlpha;
        IsWithScale = data.IsWithScale;
        IsWithStartDelay = data.IsWithStartDelay;
        if (IsWithStartDelay) {
            if (IsWithAlpha && IsWithScale) {
                view.post(new Runnable() {
                    public void run() {
                        view.animate().scaleY(scaleY).scaleX(scaleX).alpha(alpha).setDuration(duration).setStartDelay(startDelay).start();
                    }
                });
            } else if (IsWithAlpha) {
                view.post(new Runnable() {
                    public void run() {
                        view.animate().alpha(alpha).setDuration(duration).setStartDelay(startDelay).start();
                    }
                });
            } else if (IsWithScale) {
                view.post(new Runnable() {
                    public void run() {
                        view.animate().scaleY(scaleY).scaleX(scaleX).setDuration(duration).setStartDelay(startDelay).start();
                    }
                });
            }
        } else if (IsWithAlpha && IsWithScale) {
            view.post(new Runnable() {
                public void run() {
                    view.animate().scaleY(scaleY).scaleX(scaleX).alpha(alpha).setDuration(duration).start();
                }
            });
        } else if (IsWithAlpha) {
            view.post(new Runnable() {
                public void run() {
                    view.animate().alpha(alpha).setDuration(duration).start();
                }
            });
        } else if (IsWithScale) {
            view.post(new Runnable() {
                public void run() {
                    view.animate().scaleY(scaleY).scaleX(scaleX).setDuration(duration).start();
                }
            });
        }
    }

    public SmoothAnimation(final View view, SetEndSmoothAnimation data) {
        scaleX = data.scaleX;
        scaleY = data.scaleY;
        alpha = data.alpha;
        duration = data.duration;
        startDelay = data.startDelay;
        IsWithAlpha = data.IsWithAlpha;
        IsWithScale = data.IsWithScale;
        IsWithStartDelay = data.IsWithStartDelay;

        if (IsWithStartDelay) {
            if (IsWithAlpha && IsWithScale) {
                view.post(new Runnable() {
                    public void run() {
                        view.animate().scaleY(scaleY).scaleX(scaleX).alpha(alpha).setDuration(duration).setStartDelay(startDelay).start();
                    }
                });
            } else if (IsWithAlpha) {
                view.post(new Runnable() {
                    public void run() {
                        view.animate().alpha(alpha).setDuration(duration).setStartDelay(startDelay).start();
                    }
                });
            } else if (IsWithScale) {
                view.post(new Runnable() {
                    public void run() {
                        view.animate().scaleY(scaleY).scaleX(scaleX).setDuration(duration).setStartDelay(startDelay).start();
                    }
                });
            }
        } else if (IsWithAlpha && IsWithScale) {
            view.post(new Runnable() {
                public void run() {
                    view.animate().scaleY(scaleY).scaleX(scaleX).alpha(alpha).setDuration(duration).start();
                }
            });
        } else if (IsWithAlpha) {
            view.post(new Runnable() {
                public void run() {
                    view.animate().alpha(alpha).setDuration(duration).start();
                }
            });
        } else if (IsWithScale) {
            view.post(new Runnable() {
                public void run() {
                    view.animate().scaleY(scaleY).scaleX(scaleX).setDuration(duration).start();
                }
            });
        }
    }
}
