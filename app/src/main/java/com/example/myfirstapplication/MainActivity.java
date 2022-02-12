package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import org.imaginativeworld.whynotimagecarousel.CarouselItem;
import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageCarousel carousel = findViewById(R.id.carousel);
        List<CarouselItem> list = new ArrayList<>();

        list.add(
            new CarouselItem(
                    "https://i.postimg.cc/7YhRCR4g/Paso1.png",
                    "Paso 1"
            )
        );

        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/1XB8VKkd/Paso2.png",
                        "Paso 2"
                )
        );

        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/C1V5vtYt/Paso3.png",
                        "Paso 3"
                )
        );

        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/mZyznbPS/Paso4.png",
                        "Paso 4"
                )
        );


        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/GmH49GqM/Paso5.png",
                        "Paso 5"
                )
        );


        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/tCRZQLPG/Paso6.png",
                        "Paso 6"
                )
        );


        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/YqX4pbfG/Paso7.png",
                        "Paso 7"
                )
        );


        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/132fFXdy/Paso8.png",
                        "Paso 8"
                )
        );


        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/DzGmPFVL/Paso9.png",
                        "Paso 9"
                )
        );


        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/nzYzNkhL/Paso10.png",
                        "Paso 10"
                )
        );


        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/wMwBjjJ8/Paso11.png",
                        "Paso 11"
                )
        );

        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/bryJPtZ9/Paso12.png",
                        "Paso 12"
                )
        );

        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/jqc2XZ1g/PAso13.png",
                        "Paso 13"
                )
        );

        list.add(
                new CarouselItem(
                        "https://i.postimg.cc/HndJLNh5/Paso14.png",
                        "Paso 14"
                )
        );


        carousel.addData(list);
    }
}