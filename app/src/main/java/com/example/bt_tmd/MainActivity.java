package com.example.bt_tmd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import category.Category;
import category.CategoryAdapter;
import shop.Shop;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rcvCategory= findViewById(R.id.rcv_category);
        categoryAdapter= new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory(){

        List<Category> listCategory = new ArrayList<>();
        List<Shop> listUuDai = new ArrayList<>();
        List<Shop> listUuDai1 = new ArrayList<>();
        List<Shop> listUuDai2 = new ArrayList<>();
        List<Shop> listUuDai3 = new ArrayList<>();
        listUuDai.add(new Shop(R.drawable.gongcha2, "Trà Bí Đao Gong Cha"));
        listUuDai.add(new Shop(R.drawable.gongcha2, "Trà Bí Đao Gong Cha"));
        listUuDai.add(new Shop(R.drawable.gongcha3, "Trà Bí Đao Gong Cha"));
        listUuDai.add(new Shop(R.drawable.gongcha3, "Trà Bí Đao Gong Cha"));
        listUuDai.add(new Shop(R.drawable.gongcha4, "Trà Bí Đao Gong Cha"));
        listUuDai1.add(new Shop(R.drawable.gongcha5, "Trà Bí Đao Gong Cha"));
        listUuDai1.add(new Shop(R.drawable.gongcha5, "Trà Bí Đao Gong Cha"));

        listUuDai1.add(new Shop(R.drawable.gongcha5, "Trà Bí Đao Gong Cha"));
        listUuDai1.add(new Shop(R.drawable.gongcha5, "Trà Bí Đao Gong Cha"));
        listUuDai1.add(new Shop(R.drawable.gongcha5, "Trà Bí Đao Gong Cha"));

        listUuDai2.add(new Shop(R.drawable.gongcha4, "Trà Bí Đao Gong Cha"));
        listUuDai2.add(new Shop(R.drawable.gongcha3, "Trà Bí Đao Gong Cha"));
        listUuDai2.add(new Shop(R.drawable.gongcha2, "Trà Bí Đao Gong Cha"));
        listUuDai2.add(new Shop(R.drawable.gongcha5, "Trà Bí Đao Gong Cha"));
        listUuDai2.add(new Shop(R.drawable.gongcha2, "Trà Bí Đao Gong Cha"));

        listUuDai3.add(new Shop(R.drawable.gongcha5, "Trà Bí Đao Gong Cha"));
        listUuDai3.add(new Shop(R.drawable.gongcha2, "Trà Bí Đao Gong Cha"));
        listUuDai3.add(new Shop(R.drawable.gongcha4, "Trà Bí Đao Gong Cha"));
        listUuDai3.add(new Shop(R.drawable.gongcha2, "Trà Bí Đao Gong Cha"));
        listUuDai3.add(new Shop(R.drawable.gongcha3, "Trà Bí Đao Gong Cha"));

        listCategory.add(new Category("Thức uống đặt biệt gong cha", listUuDai));
        listCategory.add(new Category("Trà sữa", listUuDai1));
        listCategory.add(new Category("Trà Nguyên chất", listUuDai2));
        listCategory.add(new Category("Sữa chua nguyên chất", listUuDai3));
        return listCategory;
    }
    }
