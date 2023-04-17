package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class ThirdFragment extends Fragment {
    ArrayList<Item> states = new ArrayList<Item>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        super.onCreate(savedInstanceState);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = view.findViewById(R.id.list);
        // создаем адаптер
        MyAdapter adapter = new MyAdapter(getContext(), states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void setInitialData(){

        states.add(new Item ("Я", "Мухожук", R.drawable.muhojuk));
        states.add(new Item ("я сделал", "всё, что мог", R.drawable.muhojuk));
        states.add(new Item ("Я", "Мухожук", R.drawable.muhojuk));
        states.add(new Item ("я сделал", "всё, что мог", R.drawable.muhojuk));
        states.add(new Item ("Я", "Мухожук", R.drawable.muhojuk));
        states.add(new Item ("я сделал", "всё, что мог", R.drawable.muhojuk));
    }
}