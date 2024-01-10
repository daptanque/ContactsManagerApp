package com.example.contactmanagerapp.viewUI

import android.view.ViewGroup
import android.widget.ExpandableListView.OnChildClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.contactmanagerapp.databinding.CardItemBinding
import com.example.contactmanagerapp.room.User

class MyRecyclerViewAdapter(private val usersList:List<User>,
                            private val clickListener: (User)->Unit)
    : RecyclerView.Adapter<MyViewHolder>()

{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

    }




}

class MyViewHolder(val binding: CardItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(user: User, clickListener: (User) -> Unit){
        binding.nameTextView.text  = user.name
        binding.emailTextView.text = user.email

        binding.listItemLayout.setOnClickListener{
            clickListener(user)
        }

    }
}