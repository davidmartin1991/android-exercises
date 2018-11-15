package fr.android.androidexercises

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class BookAdapter(context: Context, private val books: List<Book>) : BaseAdapter() {

    val inflater: LayoutInflater
    init {
        // TODO LayoutInflater.from()
        inflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return books.size // TODO
    }

    override fun getItem(position: Int): Book? {
        return books[position] // TODO
    }

    override fun getItemId(position: Int): Long {
        return books[position].hashCode().toLong() // TODO
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var view = convertView
        if(view == null){
            view = inflater.inflate(R.layout.custom_view_item_book,parent,false)
        }
        val book = getItem(position)
        view?.apply {
            findViewById<TextView>(R.id.nameTextView).text = book?.name
            findViewById<TextView>(R.id.priceTextView).text = book?.price.toString()

        }
        return view // TODO
    }

}
