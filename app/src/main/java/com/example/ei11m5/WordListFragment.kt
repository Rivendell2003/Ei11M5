package com.example.ei11m5

import Word
import com.example.ei11m5.adapter.WordAdapter

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WordListFragment : Fragment(R.layout.fragment_word_list) {

    private lateinit var wordAdapter: WordAdapter
    private val words = mutableListOf<Word>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)


        wordAdapter = WordAdapter(words) { word ->

            val action = WordListFragmentDirections.actionWordListFragmentToWordEditFragment(word.text)
            findNavController().navigate(action)
        }


        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = wordAdapter


        val addButton = view.findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {

            val newWord = Word("New Word")
            wordAdapter.addWord(newWord)
        }
    }
}
