package com.example.listafilmesrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final Object TAG = "Filmes APP";
    Button btn_addOne;

    List<Film> filmList = new ArrayList<Film>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillFilmList();
        Log.d((String) TAG, "Criado: " + filmList.toString());
        Toast.makeText(this, "Quantidade de filmes = " + filmList.size(), Toast.LENGTH_SHORT).show();
        btn_addOne = findViewById(R.id.btn_addOne);

        btn_addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, AddEditFilm.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.lv_filmesList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecycleViewAdapter(filmList, MainActivity.this);
        recyclerView.setAdapter(mAdapter);

    }

    private void fillFilmList() {
        Film f0 = new Film(0, "O Quarto de Jack", 2016, "https://media.fstatic.com/_iYOTFFEj12CZWm8_Kl7y36I0gg=/268x386/smart/media/movies/covers/2015/07/room_t98036.jpeg");
        Film f1 = new Film(1, "A Incrível História de Adaline", 2015, "https://media.fstatic.com/XDYk5wU1mCKUupqNS0wa-VmeX1E=/210x312/smart/media/movies/covers/2015/02/the-age-of-adaline_t43781.jpg");
        Film f2 = new Film(2, "Cinderela", 2015, "https://media.fstatic.com/kBe8TNOL2PoPUc1nu-PLm9hjzsk=/210x312/smart/media/movies/covers/2014/11/cinderela_t70211_2.jpg");
        Film f3 = new Film(3, "A Teoria de Tudo", 2014, "https://media.fstatic.com/eOQ0JsqXTyASn0PkCFjdlrofOig=/210x312/smart/media/movies/covers/2014/08/a-teoria-de-tudo_t92819_2.jpg");
        Film f4 = new Film(4, "Se Eu Ficar", 2014, "https://media.fstatic.com/IBxxtrIsXc7NyV8Ic3MXa_GRGGQ=/210x312/smart/media/movies/covers/2014/05/se-eu-ficar_t74474_3.jpg");
        Film f5 = new Film(5, "Amor Sem Fim", 2014, "https://media.fstatic.com/mdJStMrxVMSlSe4gIrtFTkLpMBo=/210x312/smart/media/movies/covers/2013/12/amor-sem-fim_t79160.jpg");
        Film f6 = new Film(6, "O Voo", 2012, "https://media.fstatic.com/5SaFh0Tcl_DMQcxD76zmPN8Jgi8=/210x312/smart/media/movies/covers/2012/10/2e2eee642a5fb196f2c92b459fe6af2a.jpg");
        Film f7 = new Film(7, "As Aventuras de Pi", 2012, "https://media.fstatic.com/cLaMShvmPvgPtFepWlpK_eRL8xs=/210x312/smart/media/movies/covers/2012/07/61444a5c88258555e02debea965f6dde.jpg");
        Film f8 = new Film(8, "12 Horas", 2012, "https://media.fstatic.com/43i-NY8E2ICluDi13DurI8qmn-Y=/210x312/smart/media/movies/covers/2011/12/592b7779fc0ec89d965b6065f844e20f.jpg");
        Film f9 = new Film(9, "Ilha do Medo", 2010, "https://media.fstatic.com/RXlPWxs5jbGuVYgUjFZSytSzvS4=/268x386/smart/media/movies/covers/2011/07/f8503d117d5560c07478c1fde344a4e8.jpg");
        Film f10 = new Film(10, "Homem Aranha 3", 2007, "https://media.fstatic.com/aWaE-yJ7zJfiEbP5pMpJ1hRcSzs=/210x312/smart/media/movies/covers/2011/06/f4e1304dfa9e6b5507d45c9f31ab5ba2.jpg");
        Film f11 = new Film(11, "Um Sonho Possível", 2009, "https://media.fstatic.com/vAEDpvciPwZMn3t4sXXOcCSXnhQ=/210x312/smart/media/movies/covers/2012/06/1c4ebc0d9a20773d70b163674e40b2c9.jpg");

        filmList.addAll(Arrays.asList(new Film[] { f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11 }));
    }


}