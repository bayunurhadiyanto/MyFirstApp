package com.example.myfirstapp

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// Adapter ini menerima 'Fragment' (host, yaitu DashboardFragment) sebagai konteks
class TabPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    // Jumlah total tab adalah 2 (Berita dan Pengumuman)
    override fun getItemCount(): Int = 2

    // Menentukan fragment mana yang akan dimuat berdasarkan posisi
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NewsFragment() // Posisi 0: Tab Berita
            1 -> AnnouncementFragment() // Posisi 1: Tab Pengumuman
            else -> throw IllegalStateException("Invalid position: $position")
        }
    }
}