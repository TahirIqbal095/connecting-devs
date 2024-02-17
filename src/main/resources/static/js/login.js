const loginForm = document.getElementById("login-form");

loginForm.addEventListener("submit", (e) => {
  e.preventDefault();

  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;

  fetch("http://localhost:8080/login", {
    method: "POST",
    headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
    },
    body: JSON.stringify({
      email: email,
      password: password,
    }),
  })
      .then(response => response.json())
      .then(data => {
        // Assuming the backend returns an 'ok' property
        if (data.ok) {
          // Redirect to a new page
          window.location.href = "/dashboard";
        } else {
          // Handle login error
          alert("Login failed. Please try again.");
        }
      })
      .catch(error => {
        console.error("Error:", error);
        alert("An error occurred. Please try again later.");
      });
});
