const modeToggle = document.getElementById('mode-toggle');
const body = document.body;

modeToggle.addEventListener('click', () => {
    // Toggle dark mode class on the body
    body.classList.toggle('dark-mode');
});
