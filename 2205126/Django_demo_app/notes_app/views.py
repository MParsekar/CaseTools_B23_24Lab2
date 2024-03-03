from django.shortcuts import redirect, render
from django.db import transaction
from notes_app.models import note as Note

# Create your views here.

def index(request):
    notes = Note.objects.all()
    return render(request,"index.html",{'notes': list(notes)})

@transaction.atomic
def note_save(request):
    if request.method == "POST":
        note = Note()
        note.title = request.POST.get("title")
        note.content = request.POST.get("content")
        note.save()
        return redirect("/")
    return render(request, "index.html")

@transaction.atomic
def note_delete(request, note_id):
    if request.method == "POST":
        note = Note.objects.get(id=note_id)
        note.delete()
    return redirect("/")

@transaction.atomic
def note_edit(request, note_id):
    if request.method == "POST":
        note = Note.objects.get(id=note_id)
        return render(request, "note_edit.html", {'note': note})
    return redirect("/")

@transaction.atomic
def note_edit_save(request, note_id):
    if request.method == "POST":
        note = Note.objects.get(id=note_id)
        note.title = request.POST.get("title")
        note.content = request.POST.get("content")
        note.save()
    return redirect("/")