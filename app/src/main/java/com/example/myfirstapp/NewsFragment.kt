package com.example.myfirstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myfirstapp.R

// NewsFragment mewarisi dari class Fragment
class NewsFragment : Fragment() {

    // Fungsi ini bertanggung jawab untuk membuat dan mengembalikan tampilan (View) fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 1. Inflate Layout: Mengambil layout placeholder yang telah dibuat
        val view = inflater.inflate(R.layout.fragment_content_placeholder, container, false)

        // 2. Set Konten: Mengubah teks di TextView agar sesuai dengan konten "Berita"
        val textView = view.findViewById<TextView>(R.id.text_content)
        textView.text = "Ini adalah Konten Tab BERITA"

        // 3. Kembalikan View yang sudah jadi
        return view
    }
}