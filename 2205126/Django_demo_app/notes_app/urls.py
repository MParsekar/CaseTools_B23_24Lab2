from django.urls import path
from . import views

#URL configuration for the notes_app app.
urlpatterns = [
    path("", views.index, name="index"), # This is the URL pattern for the index page. It will call the index view.
    path("note_save/", views.note_save, name="note_save"),
    path('note_delete/<int:note_id>/', views.note_delete, name='note_delete'),
    path('note_edit/<int:note_id>/', views.note_edit, name='note_edit'),
    path('note_edit_save/<int:note_id>', views.note_edit_save, name='note_edit_save'),
]