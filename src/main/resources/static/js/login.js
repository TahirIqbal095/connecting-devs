const loginForm = document.getElementById("login-form");

loginForm.addEventListener("submit", async (e) => {
  e.preventDefault();

  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;

  const response = await fetch("http://localhost:8080/login", {
    method: "POST",
    headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
    },
    body: JSON.stringify({
      email: email,
      password: password,
    }),
  });

  if (response.ok) {
    // Authentication successful
    window.location.href = '/dashboard';
} else {
    // Authentication failed
    document.getElementsByClassName('.alert').style.display = 'block';
}
});
