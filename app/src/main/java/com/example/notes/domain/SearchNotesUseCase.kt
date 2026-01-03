package com.example.notes.domain

import kotlinx.coroutines.flow.Flow

class SearchNotesUseCase(
    private val repository: NotesRepository
) {

    operator fun invoke(query: String): Flow<List<Note>> {
        repository.searchNotes(query)
    }
}