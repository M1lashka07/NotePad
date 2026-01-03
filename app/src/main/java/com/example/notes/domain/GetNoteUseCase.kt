package com.example.notes.domain

class GetNoteUseCase(
    private val repository: NotesRepository
) {

    operator fun invoke(noteId: Int): Note {
        repository.getNote(noteId)
    }
}