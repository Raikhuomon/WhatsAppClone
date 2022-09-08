package com.rachael.whatsappclone

import android.view.ActionMode
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPageAdapter(fm: FragmentManager, lf: Lifecycle) : FragmentStateAdapter(fm, lf) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
         when(position){
             0 -> return CameraFragment()
             1 -> return ChatFragment()
             2 -> return StatusFragment()
             3 -> return CallFragment()
             else -> return ChatFragment()

         }
    }
}