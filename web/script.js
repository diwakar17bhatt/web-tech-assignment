document.getElementById("myForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let message = document.getElementById("message");

    // Simple validation
    if (name === "" || email === "") {
        message.style.color = "red";
        message.textContent = "Please fill in all fields!";
    } else {
        message.style.color = "green";
        message.textContent = "Form submitted successfully!";
    }
});