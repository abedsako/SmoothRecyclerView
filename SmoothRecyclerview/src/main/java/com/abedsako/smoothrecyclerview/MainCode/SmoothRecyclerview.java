package com.abedsako.smoothrecyclerview.MainCode;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;

import com.abedsako.smoothrecyclerview.Animation.SetEndSmoothAnimation;
import com.abedsako.smoothrecyclerview.Animation.SetStartSmoothAnimation;

public class SmoothRecyclerview {
    private Context context;
    private RecyclerView recyclerView;
    private LinearSnapHelper snapHelper = new LinearSnapHelper();

    public SmoothRecyclerview(Context context, RecyclerView recyclerView) {
        setContext(context);
        setRecyclerView(recyclerView);
        setSnapHelper(snapHelper);

        SetStartSmoothAnimation start = new SetStartSmoothAnimation(1.2f, 1.2f, 1.0f, 250, 100, true, true, true);
        SetEndSmoothAnimation end = new SetEndSmoothAnimation(1.0f, 1.0f, 0.6f, 250, 0, false, true, true);

        new SmoothRecyclerScrollListener(this, start, end);
    }

    public SmoothRecyclerview(Context context, RecyclerView recyclerView, SetStartSmoothAnimation startAnimation, SetEndSmoothAnimation endAnimation) {
        setContext(context);
        setRecyclerView(recyclerView);
        setSnapHelper(snapHelper);


        new SmoothRecyclerScrollListener(this, startAnimation, endAnimation);
    }

    public void SnapPosition(int position) {
        Editor editor = getContext().getSharedPreferences("SmoothRecycler_Shared", Context.MODE_PRIVATE).edit();
        editor.putInt("ScrollPosition", position);
        editor.apply();
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public LinearSnapHelper getSnapHelper() {
        return this.snapHelper;
    }

    public void setSnapHelper(LinearSnapHelper snapHelper) {
        this.snapHelper = snapHelper;
    }
}
