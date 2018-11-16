package fr.android.androidexercises

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.FrameLayout

class LibraryActivity : AppCompatActivity(), Step0Fragment.OnNextStep0Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        val landscape = resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
        // TODO replace Step0Fragment in containerFrameLayout
        supportFragmentManager.beginTransaction().replace(R.id.containerFrameLayout,Step0Fragment(),Step0Fragment::class.java.name).commit()

        if(landscape){
            System.out.print(landscape.toString())
            supportFragmentManager.beginTransaction().replace(R.id.containerFrameLayout2,Step1Fragment(),Step1Fragment::class.java.name).commit()
            findViewById<FrameLayout>(R.id.containerFrameLayout).visibility = View.VISIBLE
        }

    }

    override fun onNext() {
        supportFragmentManager.beginTransaction().addToBackStack("0").replace(R.id.containerFrameLayout,Step1Fragment(),Step1Fragment::class.java.name).commit()
    }

}
