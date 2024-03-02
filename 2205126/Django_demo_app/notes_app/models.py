from django.db import models
from datetime import datetime
# Create your models here.

class note(models.Model):
    title = models.CharField(max_length=200, null=False)
    content = models.TextField(null=False)
    created_at = models.DateTimeField(auto_now_add=True)
    last_modified = models.DateTimeField(auto_now=True)