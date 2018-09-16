package com.abedsako.smoothrecyclerview.MainCode;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.abedsako.smoothrecyclerview.Animation.SetEndSmoothAnimation;
import com.abedsako.smoothrecyclerview.Animation.SetStartSmoothAnimation;
import com.abedsako.smoothrecyclerview.Animation.SmoothAnimation;

public class SmoothRecyclerScrollListener {
    private Context context;
    private SharedPreferences preferences;
    private RecyclerView recyclerView;
    private LinearSnapHelper snapHelper;
    private View snappedView;

    public SmoothRecyclerScrollListener(SmoothRecyclerview smoothRecyclerview, final SetStartSmoothAnimation StartAnimation, final SetEndSmoothAnimation endAnimation) {
        this.context = smoothRecyclerview.getContext();
        this.recyclerView = smoothRecyclerview.getRecyclerView();
        this.snapHelper = smoothRecyclerview.getSnapHelper();

        preferences = context.getSharedPreferences("SmoothRecycler_Shared", Context.MODE_PRIVATE);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                snappedView = snapHelper.findSnapView(recyclerView.getLayoutManager());
                if (snappedView != null) {
                    if (newState == RecyclerView.SCROLL_STATE_IDLE) {

                        new SmoothAnimation(snappedView, StartAnimation);

                    } else {

                        new SmoothAnimation(snappedView, endAnimation);


                    }
                }
            }
        });


        snapHelper.attachToRecyclerView(this.recyclerView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                int i = preferences.getInt("ScrollPosition", 0);
                if (i == 0) {
                    recyclerView.smoothScrollBy(3, 0);
                    return;
                }
                recyclerView.smoothScrollToPosition(i);

            }
        }, 20);

    }
}
