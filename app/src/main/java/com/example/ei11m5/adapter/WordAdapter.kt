package com.example.ei11m5.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ei11m5.databinding.ListItemWordBinding


class WordAdapter(
    private val words: MutableList<Word>,
    private val onItemClicked: (Word) -> Unit
) : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {

        val binding = ListItemWordBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WordViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val word = words[position]
        holder.bind(word)
    }

    override fun getItemCount(): Int = words.size

    inner class WordViewHolder(private val binding: ListItemWordBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(word: Word) {
            binding.textViewWord.text = word.text
            binding.root.setOnClickListener { onItemClicked(word) }
        }
    }

    fun addWord(word: Word) {
        words.add(word)
        notifyItemInserted(words.size - 1)
    }
}
