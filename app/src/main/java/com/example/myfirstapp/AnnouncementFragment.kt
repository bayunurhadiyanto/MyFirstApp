package com.example.myfirstapp

import com.example.myfirstapp.R // Pastikan ini diimpor!
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AnnouncementFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Menggunakan layout placeholder yang sama
        val view = inflater.inflate(R.layout.fragment_content_placeholder, container, false)

        // Mengatur teks untuk Tab Pengumuman
        val textView = view.findViewById<TextView>(R.id.text_content)
        textView.text = "Ini adalah Konten Tab PENGUMUMAN"

        return view
    }
}