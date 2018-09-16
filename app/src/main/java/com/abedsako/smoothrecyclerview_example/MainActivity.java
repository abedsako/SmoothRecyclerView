package com.abedsako.smoothrecyclerview_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.abedsako.smoothrecyclerview.Animation.SetEndSmoothAnimation;
import com.abedsako.smoothrecyclerview.Animation.SetStartSmoothAnimation;
import com.abedsako.smoothrecyclerview.MainCode.SmoothRecyclerview;

public class MainActivity extends AppCompatActivity {

    Recyclerview_Adapter adapter;
    SetEndSmoothAnimation end;
    RecyclerView rv;
    SmoothRecyclerview smoothRecyclerview;
    SetStartSmoothAnimation start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.Myrecyclerview);

        LinearLayoutManager manager = new LinearLayoutManager(this, 0, false);

        start = new SetStartSmoothAnimation(1.2f, 1.2f, 1.0f, 250, 100, true, true, true);
        end = new SetEndSmoothAnimation(1.0f, 1.0f, 0.6f, 250, 0, false, true, true);

        smoothRecyclerview = new SmoothRecyclerview(this, rv, start, end);
        smoothRecyclerview.SnapPosition(0);

        adapter = new Recyclerview_Adapter(this);
        rv.setAdapter(this.adapter);
        rv.setLayoutManager(manager);



        mArrayList();
    }

    private void mArrayList(){

        adapter.list.add(new List_Data("position 1", "https://www.quirkybyte.com/wp-content/uploads/2016/02/Green-Nature-Trees-l.jpg"));
        adapter.list.add(new List_Data("position 2", "https://images.pexels.com/photos/4258/wood-nature-leaves-tree.jpg?auto=compress&cs=tinysrgb&h=650&w=940"));
        adapter.list.add(new List_Data("position 3", "https://www.quirkybyte.com/wp-content/uploads/2016/02/Green-Nature-Trees-l.jpg"));
        adapter.list.add(new List_Data("position 4", "https://images.pexels.com/photos/4258/wood-nature-leaves-tree.jpg?auto=compress&cs=tinysrgb&h=650&w=940"));
        adapter.list.add(new List_Data("position 5", "https://www.quirkybyte.com/wp-content/uploads/2016/02/Green-Nature-Trees-l.jpg"));
        adapter.list.add(new List_Data("position 6", "https://images.pexels.com/photos/4258/wood-nature-leaves-tree.jpg?auto=compress&cs=tinysrgb&h=650&w=940"));

        adapter.notifyDataSetChanged();

    }

}
