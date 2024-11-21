package com.example.ei11m5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class WordEditFragment : Fragment(R.layout.fragment_word_edit) {

    private var wordText: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        wordText = arguments?.getString("word")
        val editText = view.findViewById<EditText>(R.id.editTextWord)
        editText.setText(wordText)

        val saveButton = view.findViewById<Button>(R.id.saveButton)
        saveButton.setOnClickListener {
            val newText = editText.text.toString()
            if (newText.isNotEmpty()) {

                findNavController().popBackStack()
            }
        }
    }

    companion object {
        fun newInstance(word: String) = WordEditFragment().apply {
            arguments = Bundle().apply {
                putString("word", word)
            }
        }
    }
}
