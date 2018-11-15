package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide

class LibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // TODO Get image view and load image form URL
        Glide.with(this).load(R.drawable.ic_launcher).into(findViewById(R.id.localImageView))
        Glide.with(this).load("http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg").into(findViewById(R.id.downloadImageView))
        // http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg
    }

}
