package com.example.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.helper.widget.Carousel
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(
            CarouselItem(
                "https://store-images.s-microsoft.com/image/apps.14980.67319741566234733.9d704422-cc5f-483a-9a7e-ca881df58d5f.2c6fbfa2-3c25-4e6c-837d-adb9112fc26a?mode=scale&q=90&h=1080&w=1920",
                "Paladins New"
            )
        )
        list.add(
            CarouselItem(
                "https://store-images.s-microsoft.com/image/apps.24926.13740730219256604.8bc53a88-4f24-49c5-a58a-b7b9a8b38cab.9f833cd3-47e0-4f96-9fcb-0ad000ce73eb?mode=scale&q=90&h=1080&w=1920&background=%23FFFFFF",
                "Paladins Old"
            )
        )
        list.add(
            CarouselItem(
                "https://i.blogs.es/0ba3c2/paladins0/1366_2000.jpg",
                "Paladins All"
            )
        )

        carousel.addData(list)

        carousel.carouselListener = object : CarouselListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                Toast.makeText(
                    this@MainActivity,
                    "$position ${carouselItem.caption}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }
}