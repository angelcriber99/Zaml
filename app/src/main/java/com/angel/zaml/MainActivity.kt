package com.angel.zaml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {
    val list = mutableListOf<CarouselItem>()
    val list2 = mutableListOf<CarouselItem>()
    val list3 = mutableListOf<CarouselItem>()
    val list4 = mutableListOf<CarouselItem>()
    //view binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Carrousel 1
        //Find carrousel id
        val carousel1: ImageCarousel = findViewById(R.id.carousel1)
        //Add content to the array
        list.add(CarouselItem(R.drawable.burgerking_originals_campesina, "Originals Campesina"))
        list.add(CarouselItem(R.drawable.burgerking_originals_mediterranea, "Originals Mediterranea"))
        list.add(CarouselItem(R.drawable.burgerking_vegetariana, "Vegetariana"))
        list.add(CarouselItem(R.drawable.burgerking_whopper, "Whopper"))
        list.add(CarouselItem(R.drawable.burguerking_baconking, "Bacon King"))

        //Add photos to the carrousel
        carousel1.addData(list)

        // Carousel listener
        carousel1.carouselListener = object : CarouselListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                //https://youtu.be/ZnarHv_Jx-M?t=953
                Toast.makeText(this@MainActivity, "Coche: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                // ...
            }

        }
        //Fin de Carrousel 1
        //---------------------------------------------------------------------------------------------------------
        //Carrousel 2
        //Find carrousel id
        val carousel2: ImageCarousel = findViewById(R.id.carousel2)
        //Add content to the array
        list2.add(CarouselItem(R.drawable.mcdonalds_cbo, "Cbo"))
        list2.add(CarouselItem(R.drawable.mcdonalds_happymeal, "Happy Meal"))
        list2.add(CarouselItem(R.drawable.mcdonalds_mcaitana, "McAitana"))
        list2.add(CarouselItem(R.drawable.mcdonalds_menuforyou, "Menu for you"))

        //Add photos to the carrousel
        carousel2.addData(list2)

        // Carousel listener
        carousel2.carouselListener = object : CarouselListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                //https://youtu.be/ZnarHv_Jx-M?t=953
                Toast.makeText(this@MainActivity, "Coche: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                // ...
            }

        }
        //Fin de Carrousel 2
        //---------------------------------------------------------------------------------------------------------
        //Carrousel 3
        //Find carrousel id
        val carousel3: ImageCarousel = findViewById(R.id.carousel3)
        //Add content to the array
        list3.add(CarouselItem(R.drawable.kfc_antonia, "Menu Antonia"))
        list3.add(CarouselItem(R.drawable.kfc_cubodos, "Cubo para 2 personas"))
        list3.add(CarouselItem(R.drawable.kfc_menusobrada, "Menu Sobrada"))
        list3.add(CarouselItem(R.drawable.kfc_piezascoronel, "Piezas del coronel"))
        list3.add(CarouselItem(R.drawable.kfc_twoburgers, "Menu two burguers"))

        //Add photos to the carrousel
        carousel3.addData(list3)

        // Carousel listener
        carousel3.carouselListener = object : CarouselListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                //https://youtu.be/ZnarHv_Jx-M?t=953
                Toast.makeText(this@MainActivity, "Coche: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                // ...
            }

        }
        //Fin de Carrousel 3
        //---------------------------------------------------------------------------------------------------------
        //Carrousel 4
        //Find carrousel id
        val carousel4: ImageCarousel = findViewById(R.id.carousel4)
        //Add content to the array
        list4.add(CarouselItem(R.drawable.tacobell_burritobowl, "Menu BurritoBowl"))
        list4.add(CarouselItem(R.drawable.tacobell_crunchywrap, "Menu crunchywrap"))
        list4.add(CarouselItem(R.drawable.tacobell_granburrito, "Gran burrito"))
        list4.add(CarouselItem(R.drawable.tacobell_quesadilla, "Menu Quesadilla"))
        list4.add(CarouselItem(R.drawable.tacobell_tacos, "Tacos"))

        //Add photos to the carrousel
        carousel4.addData(list4)

        // Carousel listener
        carousel4.carouselListener = object : CarouselListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                //https://youtu.be/ZnarHv_Jx-M?t=953
                Toast.makeText(this@MainActivity, "Coche: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                // ...
            }

        }
        //Fin de Carrousel 4

    }
    //esta funcion crea menu de los tres puntos

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_tres_puntos, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val item_selected: Int = item.itemId

        if (item_selected == R.id.item1) {
            val loginIntent = Intent(this, Cuenta::class.java)
            startActivity(loginIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}